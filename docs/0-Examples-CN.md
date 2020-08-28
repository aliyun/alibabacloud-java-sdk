[← 首页](../../README-CN.md) | 快速使用[(English)](0-Examples-EN.md) | [客户端与凭证 →](1-Client-CN.md)

***

## 要求
- 要使用 Alibaba Cloud SDK for Java，您需要一个云账号以及一对`Access Key ID`和`Access Key Secret`。 请在阿里云控制台中的[AccessKey管理页面](https://usercenter.console.aliyun.com/?spm=5176.doc52740.2.3.QKZk8w#/manage/ak)上创建和查看您的Access Key，或者联系您的系统管理员。
- 要使用 Alibaba Cloud SDK for Java 访问某个产品的API，您需要事先在[阿里云控制台](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w)中开通这个产品。
- Alibaba Cloud SDK for Java 需要1.8以上的JDK。

## 通过Maven来管理项目依赖(推荐)
如果您使用Apache Maven来管理Java项目，只需在项目的`pom.xml`文件加入相应的依赖项即可。以使用OCR SDK为例，您只需在`pom.xml`中声明以下依赖：
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>ocr20191230</artifactId>
    <version>[0.0.1,1.0.0)</version>
</dependency>
```
# 快速使用

以下这个代码示例向您展示了调用 Alibaba Cloud SDK for Java 的3个主要步骤：
1. 创建`Client`实例并初始化。

2. 创建`RuntimeObject`实例并设置运行参数。

3. 创建API请求并设置参数。

4. 发起请求并处理应答或异常。
```java
import com.aliyun.ocr20191230.Client;
import com.aliyun.ocr20191230.models.RecognizeBankCardAdvanceRequest;
import com.aliyun.ocr20191230.models.RecognizeBankCardResponse;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class TeaDemo {

    public static void main(String[] args) throws Exception{

        // 1 创建Config实例并初始化。
        Config authConfig = new Config();
        authConfig.accessKeyId = "your accessKeyId";
        authConfig.accessKeySecret = "your accessKeySecret";
        authConfig.type = "access_key";
        authConfig.endpoint = "your endpoint";
        authConfig.regionId = "cn-hangzhou";

        Client authClient = new Client(authConfig);

        // 2 创建RuntimeObject实例并设置运行参数
        RuntimeOptions runtime = new RuntimeOptions();

        // 3 创建API请求并设置参数。
        RecognizeBankCardAdvanceRequest request = new RecognizeBankCardAdvanceRequest();
        InputStream inputStream = new FileInputStream("your file");
        request.imageURLObject = inputStream;

        // 4 发起请求并处理应答或异常。
        RecognizeBankCardResponse authResponse = authClient.recognizeBankCardAdvance(request, runtime);
    }
}
```
***
[← 首页](../../README-CN.md) | 快速使用[(English)](0-Examples-EN.md) | [客户端与凭证 →](1-Client-CN.md)
