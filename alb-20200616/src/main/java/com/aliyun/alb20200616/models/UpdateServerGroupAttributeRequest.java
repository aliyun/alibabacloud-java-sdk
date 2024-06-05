// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionDrainConfig")
    public UpdateServerGroupAttributeRequestConnectionDrainConfig connectionDrainConfig;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx` HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The configuration of health checks.</p>
     */
    @NameInMap("HealthCheckConfig")
    public UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **Wrr**: the weighted round robin algorithm. Backend servers that have higher weights receive more requests than those that have lower weights.</p>
     * <p>*   **Wlc**: the weighted least connections algorithm. Requests are distributed based on the weights and the number of connections to backend servers. If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.</p>
     * <p>*   **Sch**: the consistent hashing algorithm. Requests from the same source IP address are distributed to the same backend server.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The server group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The server group name.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>This parameter is available only if the ALB Ingress controller is used. In this case, set this parameter to the name of the `Kubernetes Service` that is associated with the server group.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SlowStartConfig")
    public UpdateServerGroupAttributeRequestSlowStartConfig slowStartConfig;

    /**
     * <p>The configuration of session persistence.</p>
     */
    @NameInMap("StickySessionConfig")
    public UpdateServerGroupAttributeRequestStickySessionConfig stickySessionConfig;

    /**
     * <p>The setting of consistent hashing based on URLs.</p>
     */
    @NameInMap("UchConfig")
    public UpdateServerGroupAttributeRequestUchConfig uchConfig;

    /**
     * <p>Specifies whether to enable persistent TCP connections.</p>
     */
    @NameInMap("UpstreamKeepaliveEnabled")
    public Boolean upstreamKeepaliveEnabled;

    public static UpdateServerGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeRequest self = new UpdateServerGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServerGroupAttributeRequest setConnectionDrainConfig(UpdateServerGroupAttributeRequestConnectionDrainConfig connectionDrainConfig) {
        this.connectionDrainConfig = connectionDrainConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestConnectionDrainConfig getConnectionDrainConfig() {
        return this.connectionDrainConfig;
    }

    public UpdateServerGroupAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServerGroupAttributeRequest setHealthCheckConfig(UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public UpdateServerGroupAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateServerGroupAttributeRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public UpdateServerGroupAttributeRequest setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public UpdateServerGroupAttributeRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateServerGroupAttributeRequest setSlowStartConfig(UpdateServerGroupAttributeRequestSlowStartConfig slowStartConfig) {
        this.slowStartConfig = slowStartConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestSlowStartConfig getSlowStartConfig() {
        return this.slowStartConfig;
    }

    public UpdateServerGroupAttributeRequest setStickySessionConfig(UpdateServerGroupAttributeRequestStickySessionConfig stickySessionConfig) {
        this.stickySessionConfig = stickySessionConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestStickySessionConfig getStickySessionConfig() {
        return this.stickySessionConfig;
    }

    public UpdateServerGroupAttributeRequest setUchConfig(UpdateServerGroupAttributeRequestUchConfig uchConfig) {
        this.uchConfig = uchConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestUchConfig getUchConfig() {
        return this.uchConfig;
    }

    public UpdateServerGroupAttributeRequest setUpstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
        this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
        return this;
    }
    public Boolean getUpstreamKeepaliveEnabled() {
        return this.upstreamKeepaliveEnabled;
    }

    public static class UpdateServerGroupAttributeRequestConnectionDrainConfig extends TeaModel {
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        public static UpdateServerGroupAttributeRequestConnectionDrainConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestConnectionDrainConfig self = new UpdateServerGroupAttributeRequestConnectionDrainConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestConnectionDrainConfig setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
            this.connectionDrainEnabled = connectionDrainEnabled;
            return this;
        }
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        public UpdateServerGroupAttributeRequestConnectionDrainConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

    }

    public static class UpdateServerGroupAttributeRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>The HTTP status codes that are used to determine whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port that you want to use for health checks on backend servers.</p>
         * <br>
         * <p>Valid values: **0** to **65535**.</p>
         * <br>
         * <p>If you set the value to **0**, the ports of backend servers are used for health checks.</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to **true**.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name that is used for health checks. The domain name must meet the following requirements:</p>
         * <br>
         * <p>*   The domain name must be 1 to 80 characters in length.</p>
         * <p>*   The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
         * <p>*   It must contain at least one period (.) but cannot start or end with a period (.).</p>
         * <p>*   The rightmost field of the domain name can contain only letters and cannot contain digits or hyphens (-).</p>
         * <p>*   Other fields cannot start or end with a hyphen (-).</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to true and the **HealthCheckProtocol** parameter is set to **HTTP**.</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The version of HTTP that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **HTTP1.0**</p>
         * <p>*   **HTTP1.1**</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to true and the **HealthCheckProtocol** parameter is set to **HTTP**.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **50**.</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to **true**.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The method that you want to use for the health check. Valid values:</p>
         * <br>
         * <p>*   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</p>
         * <p>*   **POST**: gRPC health checks automatically use the POST method.</p>
         * <p>*   **HEAD**: HTTP health checks automatically use the HEAD method.</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to true and the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The path that is used for health checks.</p>
         * <br>
         * <p>The path must be 1 to 80 characters in length and can contain only letters, digits, and the following special characters: `- / . % ? # & =`. It can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \\" , +`. The path must start with a forward slash (`/`).</p>
         * <br>
         * <p>> This parameter takes effect when the **HealthCheckEnabled** parameter is set to **true** and the **HealthCheckProtocol** parameter is set to **HTTP**.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that you want to use for health checks. Valid values:</p>
         * <br>
         * <p>*   **HTTP**: To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <p>*   **TCP**: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.</p>
         * <p>*   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>Specify the timeout period of a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **1** to **300**.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If the value of the **HealthCheckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckTimeout** parameter is ignored and the value of the **HealthCheckInterval** parameter is used as the timeout period.</p>
         * <br>
         * <p>*   This parameter takes effect when the **HealthCheckEnabled** parameter is set to **true**.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it can be declared healthy (from **fail** to **success**).</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2** to **10**.</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateServerGroupAttributeRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestHealthCheckConfig self = new UpdateServerGroupAttributeRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class UpdateServerGroupAttributeRequestSlowStartConfig extends TeaModel {
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        @NameInMap("SlowStartEnabled")
        public Boolean slowStartEnabled;

        public static UpdateServerGroupAttributeRequestSlowStartConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestSlowStartConfig self = new UpdateServerGroupAttributeRequestSlowStartConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestSlowStartConfig setSlowStartDuration(Integer slowStartDuration) {
            this.slowStartDuration = slowStartDuration;
            return this;
        }
        public Integer getSlowStartDuration() {
            return this.slowStartDuration;
        }

        public UpdateServerGroupAttributeRequestSlowStartConfig setSlowStartEnabled(Boolean slowStartEnabled) {
            this.slowStartEnabled = slowStartEnabled;
            return this;
        }
        public Boolean getSlowStartEnabled() {
            return this.slowStartEnabled;
        }

    }

    public static class UpdateServerGroupAttributeRequestStickySessionConfig extends TeaModel {
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
         * <p>> This parameter takes effect when the **StickySessionEnabled** parameter is set to **true** and the **StickySessionType** parameter is set to **Insert**.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <br>
         * <p>*   **Insert**: inserts a cookie.</p>
         * <br>
         * <p>ALB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client contains this cookie and the listener forwards this request to the recorded backend server.</p>
         * <br>
         * <p>*   **Server**: rewrites a cookie.</p>
         * <br>
         * <p>When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.</p>
         * <br>
         * <p>> This parameter takes effect when the **StickySessionEnabled** parameter is set to **true** for the server group.</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        public static UpdateServerGroupAttributeRequestStickySessionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestStickySessionConfig self = new UpdateServerGroupAttributeRequestStickySessionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestStickySessionConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public UpdateServerGroupAttributeRequestStickySessionConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public UpdateServerGroupAttributeRequestStickySessionConfig setStickySessionEnabled(Boolean stickySessionEnabled) {
            this.stickySessionEnabled = stickySessionEnabled;
            return this;
        }
        public Boolean getStickySessionEnabled() {
            return this.stickySessionEnabled;
        }

        public UpdateServerGroupAttributeRequestStickySessionConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

    }

    public static class UpdateServerGroupAttributeRequestUchConfig extends TeaModel {
        /**
         * <p>The type of the parameter.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The setting of consistent hashing.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateServerGroupAttributeRequestUchConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestUchConfig self = new UpdateServerGroupAttributeRequestUchConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestUchConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateServerGroupAttributeRequestUchConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
