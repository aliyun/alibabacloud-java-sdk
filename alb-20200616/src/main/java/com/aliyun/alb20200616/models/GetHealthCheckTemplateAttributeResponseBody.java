// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status codes that are used to determine whether the backend server passes the health check.</p>
     * <br>
     * <p>*   If **HealthCheckProtocol** is set to **HTTP**, **HealthCheckCodes** can be set to **http_2xx** (default), **http_3xx**, **http_4xx**, and **http_5xx**. Separate multiple HTTP status codes with a comma (,).</p>
     * <p>*   If **HealthCheckProtocol** is set to **gRPC**, **HealthCheckCodes** can be set to **0 to 99**. Default value: **0**. Value ranges are supported. You can enter up to 20 value ranges and separate them with a comma (,).</p>
     * <br>
     * <p>> This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port that is used for health checks.</p>
     * <br>
     * <p>Valid values: **0** to **65535**.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that you want to use for health checks. Valid values:</p>
     * <br>
     * <p>*   **$SERVER_IP**: the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) instance uses the private IP addresses of backend servers for health checks.</p>
     * <p>*   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <br>
     * <p>> This parameter takes effect only when the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP version that is used for health checks.</p>
     * <br>
     * <p>Valid values: **HTTP1.0** and **HTTP1.1**.</p>
     * <br>
     * <p>> This parameter takes effect only when the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The method that you want to use for the health check. Valid values:</p>
     * <br>
     * <p>*   **HEAD**: By default, the ALB instance sends HEAD requests to a backend server to perform HTTP health checks.</p>
     * <p>*   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</p>
     * <p>*   **POST**: gRPC health checks automatically use the POST method.</p>
     * <br>
     * <p>> This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL that is used for health checks.</p>
     * <br>
     * <p>The URL must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \\" , +`. The URL must start with a forward slash (/).</p>
     * <br>
     * <p>> This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The protocol that you want to use for health checks. Valid values:</p>
     * <br>
     * <p>*   **HTTP** (default): To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.</p>
     * <p>*   **TCP**: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.</p>
     * <p>*   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The ID of the health check template.</p>
     */
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    /**
     * <p>The name of the health check template.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1** to **300**.</p>
     * <br>
     * <p>> If the value of the `HealthCheckTimeout` parameter is smaller than that of the `HealthCheckInterval` parameter, the timeout period specified by the `HealthCheckTimeout` parameter is ignored and the value of the `HealthCheckInterval` parameter is used as the timeout period.</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> tags;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static GetHealthCheckTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthCheckTemplateAttributeResponseBody self = new GetHealthCheckTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public GetHealthCheckTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setTags(java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetHealthCheckTemplateAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static class GetHealthCheckTemplateAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetHealthCheckTemplateAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetHealthCheckTemplateAttributeResponseBodyTags self = new GetHealthCheckTemplateAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetHealthCheckTemplateAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHealthCheckTemplateAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
