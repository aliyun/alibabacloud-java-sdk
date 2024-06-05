// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx** HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

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
     * <p>The port that is used for health checks. Valid values: **0 to 65535**. Default value: **0**. This value indicates that the port of a backend server is used for health checks.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that you want to use for the health check. Valid values:</p>
     * <br>
     * <p>*   **$SERVER_IP** (default): the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) uses the private IP addresses of backend servers for health checks.</p>
     * <p>*   **domain**: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <br>
     * <p>> This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP version that is used for health checks.</p>
     * <br>
     * <p>Valid values: **HTTP1.0** and **HTTP1.1**.</p>
     * <br>
     * <p>Default value: **HTTP1.1**.</p>
     * <br>
     * <p>> This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**. Default value: **2**.</p>
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
     * <p>The URL path that is used for health checks.</p>
     * <br>
     * <p>The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \\" , +`.</p>
     * <br>
     * <p>The URL must start with a forward slash (/).</p>
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
     * <p>The template ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check.</p>
     * <br>
     * <p>Unit: seconds. Valid values: **1 to 300**. Default value: **5**.</p>
     * <br>
     * <p>> If the value of the `HealthCheckTimeout` parameter is smaller than that of the `HealthCheckInterval` parameter, the timeout period specified by the `HealthCheckTimeout` parameter is ignored and the value of the `HealthCheckInterval` parameter is used as the timeout period.</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2 to 10**.</p>
     * <br>
     * <p>Default value: **3**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **2 to 10**.</p>
     * <br>
     * <p>Default value: **3**.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static UpdateHealthCheckTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckTemplateAttributeRequest self = new UpdateHealthCheckTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckTemplateAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateHealthCheckTemplateAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UpdateHealthCheckTemplateAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
