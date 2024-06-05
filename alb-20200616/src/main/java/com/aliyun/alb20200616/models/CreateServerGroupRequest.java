// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionDrainConfig")
    public CreateServerGroupRequestConnectionDrainConfig connectionDrainConfig;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configuration of health checks.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HealthCheckConfig")
    public CreateServerGroupRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The backend protocol. Valid values:</p>
     * <br>
     * <p>*   **HTTP** (default): The server group can be associated with HTTPS, HTTP, and QUIC listeners.</p>
     * <p>*   **HTTPS**: The server group can be associated with HTTPS listeners.</p>
     * <p>*   **gRPC**: The server group can be associated with HTTPS and QUIC listeners.</p>
     * <br>
     * <p>> If the **ServerGroupType** parameter is set to **Fc**, you can set Protocol only to **HTTP**.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **Wrr** (default): The weighted round-robin algorithm is used. Backend servers that have higher weights receive more requests than those that have lower weights.</p>
     * <p>*   **Wlc**: The weighted least connections algorithm is used. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.</p>
     * <p>*   **Sch**: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.</p>
     * <br>
     * <p>> This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The name of the server group. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>The type of server group. Valid values:</p>
     * <br>
     * <p>*   **Instance** (default): allows you to add servers by specifying **Ecs**, **Eni**, or **Eci**.</p>
     * <p>*   **Ip**: allows you to add servers by specifying IP addresses.</p>
     * <p>*   **Fc**: allows you to add servers by specifying functions of Function Compute.</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    /**
     * <p>This parameter is available only if the ALB Ingress controller is used. In this case, set this parameter to the name of the `Kubernetes Service` that is associated with the server group.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SlowStartConfig")
    public CreateServerGroupRequestSlowStartConfig slowStartConfig;

    /**
     * <p>The configuration of session persistence.</p>
     * <br>
     * <p>> This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.</p>
     */
    @NameInMap("StickySessionConfig")
    public CreateServerGroupRequestStickySessionConfig stickySessionConfig;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServerGroupRequestTag> tag;

    /**
     * <p>The configuration of consistent hashing based on URLs.</p>
     */
    @NameInMap("UchConfig")
    public CreateServerGroupRequestUchConfig uchConfig;

    /**
     * <p>Specifies whether to enable persistent TCP connections.</p>
     */
    @NameInMap("UpstreamKeepaliveEnabled")
    public Boolean upstreamKeepaliveEnabled;

    /**
     * <p>The ID of the virtual private cloud (VPC). You can add only backend servers that are deployed in the specified VPC to the server group.</p>
     * <br>
     * <p>> This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServerGroupRequest self = new CreateServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServerGroupRequest setConnectionDrainConfig(CreateServerGroupRequestConnectionDrainConfig connectionDrainConfig) {
        this.connectionDrainConfig = connectionDrainConfig;
        return this;
    }
    public CreateServerGroupRequestConnectionDrainConfig getConnectionDrainConfig() {
        return this.connectionDrainConfig;
    }

    public CreateServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServerGroupRequest setHealthCheckConfig(CreateServerGroupRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public CreateServerGroupRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CreateServerGroupRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateServerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServerGroupRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateServerGroupRequest setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public CreateServerGroupRequest setServerGroupType(String serverGroupType) {
        this.serverGroupType = serverGroupType;
        return this;
    }
    public String getServerGroupType() {
        return this.serverGroupType;
    }

    public CreateServerGroupRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateServerGroupRequest setSlowStartConfig(CreateServerGroupRequestSlowStartConfig slowStartConfig) {
        this.slowStartConfig = slowStartConfig;
        return this;
    }
    public CreateServerGroupRequestSlowStartConfig getSlowStartConfig() {
        return this.slowStartConfig;
    }

    public CreateServerGroupRequest setStickySessionConfig(CreateServerGroupRequestStickySessionConfig stickySessionConfig) {
        this.stickySessionConfig = stickySessionConfig;
        return this;
    }
    public CreateServerGroupRequestStickySessionConfig getStickySessionConfig() {
        return this.stickySessionConfig;
    }

    public CreateServerGroupRequest setTag(java.util.List<CreateServerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateServerGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateServerGroupRequest setUchConfig(CreateServerGroupRequestUchConfig uchConfig) {
        this.uchConfig = uchConfig;
        return this;
    }
    public CreateServerGroupRequestUchConfig getUchConfig() {
        return this.uchConfig;
    }

    public CreateServerGroupRequest setUpstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
        this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
        return this;
    }
    public Boolean getUpstreamKeepaliveEnabled() {
        return this.upstreamKeepaliveEnabled;
    }

    public CreateServerGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateServerGroupRequestConnectionDrainConfig extends TeaModel {
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        public static CreateServerGroupRequestConnectionDrainConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestConnectionDrainConfig self = new CreateServerGroupRequestConnectionDrainConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestConnectionDrainConfig setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
            this.connectionDrainEnabled = connectionDrainEnabled;
            return this;
        }
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        public CreateServerGroupRequestConnectionDrainConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

    }

    public static class CreateServerGroupRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>The HTTP status codes that are used to indicate whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The backend port that is used for health checks.</p>
         * <br>
         * <p>Valid values: **0** to **65535**.</p>
         * <br>
         * <p>Default value: **0**. If you set the value to 0, the port of a backend server is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <br>
         * <p>*   **true**: enables the health check feature.</p>
         * <p>*   **false**: disables the health check feature.</p>
         * <br>
         * <p>>  If the **ServerGroupType** parameter is set to **Instance** or **Ip**, the health check feature is enabled by default. If the **ServerGroupType** parameter is set to **Fc**, the health check feature is disabled by default.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name that is used for health checks. The domain name meets the following requirements:</p>
         * <br>
         * <p>*   The domain name is 1 to 80 characters in length.</p>
         * <p>*   The domain name contains lowercase letters, digits, hyphens (-), and periods (.).</p>
         * <p>*   The domain name contains at least one period (.) but does not start or end with a period (.).</p>
         * <p>*   The rightmost domain label of the domain name contains only letters, and does not contain digits or hyphens (-).</p>
         * <p>*   The domain name does not start or end with a hyphen (-).</p>
         * <br>
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The version of the HTTP protocol. Valid values: **HTTP1.0** and **HTTP1.1**. Default value: HTTP1.1.</p>
         * <br>
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **50**.</p>
         * <br>
         * <p>Default value: **2**.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</p>
         * <p>*   **POST**: By default, gRPC health checks use the POST method.</p>
         * <p>*   **HEAD**: HTTP and HTTPS health checks in listeners use the HEAD method by default.</p>
         * <br>
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, or **gRPC**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The path that is used for health checks.</p>
         * <br>
         * <p>The path must be 1 to 80 characters in length and can contain only letters, digits, and the following special characters: `- / . % ? # & =`. It can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \\" , +`. The URL must start with a forward slash (/).</p>
         * <br>
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **HTTP**: ALB performs HTTP health checks by sending HEAD or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <p>*   **HTTPS**: ALB performs HTTPS health checks by sending HEAD or GET requests to a backend server to check whether the backend server is healthy. HTTPS supports data encryption and provides higher data security than HTTP.</p>
         * <p>*   **TCP**: To perform TCP health checks, SLB sends SYN packets to the backend server to check whether the port of the backend server is available to receive requests.</p>
         * <p>*   **gRPC**: To perform gRPC health checks, SLB sends POST or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <br>
         * <p>>  HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The timeout period for a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **300**.</p>
         * <br>
         * <p>Default value: **5**.</p>
         * <br>
         * <p>>  If the value of **HealthCHeckTimeout** is smaller than the value of **HealthCheckInterval**, the value of **HealthCHeckTimeout** is ignored and the value of **HealthCheckInterval** is used.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from **fail** to **success**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         * <br>
         * <p>Default value: **3**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         * <br>
         * <p>Default value: **3**.</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static CreateServerGroupRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestHealthCheckConfig self = new CreateServerGroupRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public CreateServerGroupRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public CreateServerGroupRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class CreateServerGroupRequestSlowStartConfig extends TeaModel {
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        @NameInMap("SlowStartEnabled")
        public Boolean slowStartEnabled;

        public static CreateServerGroupRequestSlowStartConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestSlowStartConfig self = new CreateServerGroupRequestSlowStartConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestSlowStartConfig setSlowStartDuration(Integer slowStartDuration) {
            this.slowStartDuration = slowStartDuration;
            return this;
        }
        public Integer getSlowStartDuration() {
            return this.slowStartDuration;
        }

        public CreateServerGroupRequestSlowStartConfig setSlowStartEnabled(Boolean slowStartEnabled) {
            this.slowStartEnabled = slowStartEnabled;
            return this;
        }
        public Boolean getSlowStartEnabled() {
            return this.slowStartEnabled;
        }

    }

    public static class CreateServerGroupRequestStickySessionConfig extends TeaModel {
        /**
         * <p>The cookie to be configured on the server.</p>
         * <br>
         * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
         * <br>
         * <p>> This parameter takes effect when the **StickySessionEnabled** parameter is set to **true** and the **StickySessionType** parameter is set to **Server**.</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of a cookie. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **86400**.</p>
         * <br>
         * <p>Default value: **1000**.</p>
         * <br>
         * <p>> This parameter takes effect only when the **StickySessionEnabled** parameter is set to **true** and the **StickySessionType** parameter is set to **Insert**.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter takes effect when the **ServerGroupType** parameter is set to **Instance** or **Ip**.</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <br>
         * <p>*   **Insert** (default): inserts a cookie.</p>
         * <br>
         * <p>ALB inserts a session cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. Subsequent requests to ALB carry this cookie, and ALB determines the destination servers of the requests based on the cookies.</p>
         * <br>
         * <p>*   **Server**: rewrites a cookie.</p>
         * <br>
         * <p>When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.</p>
         * <br>
         * <p>> This parameter takes effect when the **StickySessionEnabled** parameter is set to **true**.</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        public static CreateServerGroupRequestStickySessionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestStickySessionConfig self = new CreateServerGroupRequestStickySessionConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestStickySessionConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public CreateServerGroupRequestStickySessionConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public CreateServerGroupRequestStickySessionConfig setStickySessionEnabled(Boolean stickySessionEnabled) {
            this.stickySessionEnabled = stickySessionEnabled;
            return this;
        }
        public Boolean getStickySessionEnabled() {
            return this.stickySessionEnabled;
        }

        public CreateServerGroupRequestStickySessionConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

    }

    public static class CreateServerGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestTag self = new CreateServerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateServerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateServerGroupRequestUchConfig extends TeaModel {
        /**
         * <p>The type of the parameter.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The parameter value for consistent hashing.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateServerGroupRequestUchConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServerGroupRequestUchConfig self = new CreateServerGroupRequestUchConfig();
            return TeaModel.build(map, self);
        }

        public CreateServerGroupRequestUchConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateServerGroupRequestUchConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
