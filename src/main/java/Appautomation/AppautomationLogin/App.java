package Appautomation.AppautomationLogin;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class App 
{
    public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
        
        
        WebDriver driver = null;
        
       
                File appDir = new File("C:");
  File app = new File(appDir, "Snapdeal-debug.apk");
  
  DesiredCapabilities capabilities = new DesiredCapabilities();

  //capabilities.setCapability(CapabilityType.PLATFORM,"Android");
  capabilities.setCapability("deviceName","emulator-5554");
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
  capabilities.setCapability(CapabilityType.VERSION,"4.4.2");
  capabilities.setCapability("platformName", "Android");
  capabilities.setCapability("app", app.getAbsolutePath());
                // Here we mention the app's package name, to find the package name we  have to convert .apk file into java class files
  capabilities.setCapability("app-package","com.snapdeal.main");
                //Here we mention the activity name, which is invoked initially as app's first page.
  capabilities.setCapability("app-activity","com.snapdeal.ui.material.activity");
  //capabilities.setCapability("app-wait-activity","LoginActivity,NewAccountActivity");
  capabilities.setCapability("app", app.getAbsolutePath());
  System.out.println(app.getAbsolutePath());
  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);  
  
  //driver.quit();
  WebElement el = driver.findElement(By.id("com.snapdeal.main:id/menu_cart_icon"));
  Thread.sleep(10000);
  
  el.click();
  driver.quit();

         }
    
    
    
}

