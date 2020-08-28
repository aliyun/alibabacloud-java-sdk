[← Home](../../README.md) | Examples[(中文)](0-Examples-CN.md) | [Client & Credentials →](1-Client-EN.md)
***

## Requirements
-  To use Alibaba Cloud SDK for Java, you must have an Alibaba Cloud account as well as an `AccessKey ID` and an `AccessKey Secret`. Create and view your AccessKey on the [RAM console](https://ram.console.aliyun.com "RAM console") or contact your system administrator.
-  To use the Alibaba Cloud SDK for Java to access the APIs of a product, you must first activate the product on the [Alibaba Cloud console](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w) if required.
-  The Alibaba Cloud Java SDK requires JDK 1.6 or later.

## Installation

If you use Apache Maven to manage Java projects, you only need to add corresponding dependencies to the pom.xml files of the projects. To use the OCR SDK as an example, you only need to declare the following the dependencie in the `pom.xml` file.
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>ocr20191230</artifactId>
    <version>[0.0.1,1.0.0)</version>
</dependency>
```

## Quick Examples

The following code example shows the three main steps to use Alibaba Cloud SDK for Java :

1. Create and initialize a `Client` instance.

2. Create and set up parameters `RuntimeObject` instance.

3. Create an API request and set parameters.

4. Initiate the request and handle the response or exceptions.

```java
import com.aliyun.ocr20191230.Client;
import com.aliyun.ocr20191230.models.RecognizeBankCardAdvanceRequest;
import com.aliyun.ocr20191230.models.RecognizeBankCardResponse;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class TeaDemo {

    public static void main(String[] args) throws Exception {

        // 1 Create and initialize a Config instance.
        Config authConfig = new Config();
        authConfig.accessKeyId = "your accessKeyId";
        authConfig.accessKeySecret = "your accessKeySecret";
        authConfig.type = "access_key";
        authConfig.endpoint = "your endpoint";
        authConfig.regionId = "cn-beijing";

        Client authClient = new Client(authConfig);

        // 2 Create and set up parameters RuntimeObject instance.
        RuntimeOptions runtime = new RuntimeOptions();

        // 3 Create an API request and set parameters.
        RecognizeBankCardAdvanceRequest request = new RecognizeBankCardAdvanceRequest();
        InputStream inputStream = new FileInputStream("your file");
        request.imageURLObject = inputStream;

        // 4 Initiate the request and handle the response or exceptions.
        RecognizeBankCardResponse authResponse = authClient.recognizeBankCardAdvance(request, runtime);
    }
}
```

***
[← Home](../../README.md) | Examples[(中文)](0-Examples-CN.md) | [Client & Credentials →](1-Client-EN.md)
