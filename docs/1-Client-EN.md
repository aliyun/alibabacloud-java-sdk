[← Examples](0-Examples-EN.md) | Client & Credentials[(中文)](1-Client-CN.md) | [Home →](../../README.md)
***
### dependencies
```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>ocr20191230</artifactId>
    <version>[0.1.0, 1.0.0)</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>credentials-java</artifactId>
    <version>[0.1.2, 1.0.0)</version>
</dependency>
```

### Using AccessKey call

```java
import com.aliyun.ocr20191230.Client;
import com.aliyun.ocr20191230.models.GetAsyncJobResultRequest;
import com.aliyun.ocr20191230.models.GetAsyncJobResultResponse;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

public class Main {

    public static void main(String[] args) {

        Config config = new Config();
        // your accessKeyId
        config.accessKeyId = "######";
        // your accessKeySecret
        config.accessKeySecret = "#######";
        config.endpoint = "ocr.cn-shanghai.aliyuncs.com";

        // create and initialize a DefaultAcsClient instance
        Client client = new Client(config);

        GetAsyncJobResultRequest resultRequest = new GetAsyncJobResultRequest();
        resultRequest.jobId = "test";

        GetAsyncJobResultResponse resultResponse = client.getAsyncJobResult(resultRequest, new RuntimeOptions());
    }
}
```
Usage for Other Credential type, please refer to [usage](https://github.com/aliyun/credentials-java#credential-type).

### Use the default credential provider chain

The default credential provider chain looks for available credentials, with following order:

1.System Properties

Look for environment credentials in system properties. If the `alibabacloud.accessKeyId` and `alibabacloud.accessKeyIdSecret` system properties are defined and not empty, the program will use them to create default credentials.

2.Environment Credentials

Look for environment credentials in environment variable. If the `ALIBABA_CLOUD_ACCESS_KEY_ID` and `ALIBABA_CLOUD_ACCESS_KEY_SECRET` environment variables are defined and are not empty, the program will use them to create default credentials.

3.Credentials File

If there is `~/.alibabacloud/credentials default file (Windows shows C:\Users\USER_NAME\.alibabacloud\credentials)`, the program automatically creates credentials with the specified type and name. The default file is not necessarily exist, but a parse error will throw an exception. The name of configuration item is lowercase.This configuration file can be shared between different projects and between different tools. Because it is outside of the project and will not be accidentally committed to the version control. The path to the default file can be modified by defining the `ALIBABA_CLOUD_CREDENTIALS_FILE` environment variable. If not configured, use the default configuration `default`. You can also set the environment variables `ALIBABA_CLOUD_PROFILE` to use the configuration.

```ini
[default]                          # default setting
enable = true                      # Enable，Enabled by default if this option is not present
type = access_key                  # Certification type: access_key
access_key_id = foo                # Key
access_key_secret = bar            # Secret

[client1]                          # configuration that is named as `client1`
type = ecs_ram_role                # Certification type: ecs_ram_role
role_name = EcsRamRoleTest         # Role Name

[client2]                          # configuration that is named as `client2`
enable = false                     # Disable
type = ram_role_arn                # Certification type: ram_role_arn
region_id = cn-test                 
policy = test                      # optional Specify permissions
access_key_id = foo                
access_key_secret = bar            
role_arn = role_arn                
role_session_name = session_name   # optional

[client3]                          # configuration that is named as `client3`
type = rsa_key_pair                # Certification type: rsa_key_pair
public_key_id = publicKeyId        # Public Key ID
private_key_file = /your/pk.pem    # Private Key file
```
4.Instance RAM Role

If the environment variable `ALIBABA_CLOUD_ECS_METADATA` is defined and not empty, the program will take the value of the environment variable as the role name and request <http://100.100.100.200/latest/meta-data/ram/security-credentials/> to get the temporary Security credentials.

```java
import com.aliyun.ocr20191230.Client;
import com.aliyun.ocr20191230.models.GetAsyncJobResultRequest;
import com.aliyun.ocr20191230.models.GetAsyncJobResultResponse;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

public class Main {

    public static void main(String[] args) {

        Config config = new Config();
        // enable the default credential chain
        config.credential = new com.aliyun.credentials.Client(null);
        config.endpoint = "ocr.cn-shanghai.aliyuncs.com";

        // create and initialize a DefaultAcsClient instance
        Client client = new Client(config);

        GetAsyncJobResultRequest resultRequest = new GetAsyncJobResultRequest();
        resultRequest.jobId = "test";

        GetAsyncJobResultResponse resultResponse = client.getAsyncJobResult(resultRequest, new RuntimeOptions());
    }
}

```
***
[← Examples](0-Examples-EN.md) | Client & Credentials[(中文)](1-Client-CN.md) | [Home →](../../README.md)