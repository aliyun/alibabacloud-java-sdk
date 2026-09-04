// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection draining configuration.</p>
     * <p>After connection draining is enabled, when a backend server is removed or fails a health check, the load balancing service allows existing connections to continue transmitting data for a specified period of time without break.</p>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support connection draining. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
     * <li>Server type and IP type server groups support connection draining. Function Compute type server groups do not support this feature.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ConnectionDrainConfig")
    public UpdateServerGroupAttributeRequestConnectionDrainConfig connectionDrainConfig;

    /**
     * <p>Specifies whether to enable cross-zone load balancing for the server group. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled (default).</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support binding server groups with cross-zone load balancing disabled. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
     * <li>Server type and IP type server groups support disabling cross-zone load balancing. Function Compute type server groups do not support this feature.</li>
     * <li>Session persistence is not supported when cross-zone load balancing is disabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CrossZoneEnabled")
    public Boolean crossZoneEnabled;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the resource. The system checks the required parameters, request syntax, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP <code>2xx</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HealthCheckConfig")
    public UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The IP version affinity mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Affinity</p>
     */
    @NameInMap("IpVersionAffinityMode")
    public String ipVersionAffinityMode;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><strong>Wrr</strong>: weighted round-robin. Backend servers with higher weights receive more requests (higher probability) than those with lower weights.</li>
     * <li><strong>Wlc</strong>: weighted least connections. In addition to the weight assigned to each backend server, the actual server load (number of connections) is also considered. When the weights are the same, backend servers with fewer current connections receive more requests (higher probability).</li>
     * <li><strong>Sch</strong>: consistent hashing. Requests with the same hash factor are dispatched to the same backend server. If the UchConfig parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the UchConfig parameter is configured, the hash factor is a URL parameter, and requests with the same URL parameter are distributed to the same backend server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The server group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtop****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The server group name.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. The name must start with a letter, a digit, or a Chinese character.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>This parameter is applicable only to ALB Ingress scenarios and specifies the <code>K8s Service</code> name that corresponds to the server group.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The slow start configuration.</p>
     * <p>After slow start is enabled, newly added backend servers in the server group are warmed up during a specified period of time, and the number of requests forwarded to these servers increases linearly.</p>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support slow start. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
     * <li>Server type and IP backend server groups support slow start configuration. Function Compute backend server groups do not support this feature.</li>
     * <li>Slow start can be enabled only when the backend scheduling algorithm is weighted round-robin.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("SlowStartConfig")
    public UpdateServerGroupAttributeRequestSlowStartConfig slowStartConfig;

    /**
     * <p>The session persistence configuration.</p>
     */
    @NameInMap("StickySessionConfig")
    public UpdateServerGroupAttributeRequestStickySessionConfig stickySessionConfig;

    /**
     * <p>The URL consistent hashing parameter settings.</p>
     */
    @NameInMap("UchConfig")
    public UpdateServerGroupAttributeRequestUchConfig uchConfig;

    /**
     * <p>Specifies whether to enable upstream keepalive connections.</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sgp-123</p>
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

    public UpdateServerGroupAttributeRequest setCrossZoneEnabled(Boolean crossZoneEnabled) {
        this.crossZoneEnabled = crossZoneEnabled;
        return this;
    }
    public Boolean getCrossZoneEnabled() {
        return this.crossZoneEnabled;
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

    public UpdateServerGroupAttributeRequest setIpVersionAffinityMode(String ipVersionAffinityMode) {
        this.ipVersionAffinityMode = ipVersionAffinityMode;
        return this;
    }
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
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
        /**
         * <p>Specifies whether to enable connection draining.</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        /**
         * <p>The connection draining timeout period.</p>
         * <p>Valid values: <strong>0</strong> to <strong>900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
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
         * <p>The list of status codes that indicate healthy health checks.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port of the backend server that is used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>Settings this parameter to <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
         * <blockquote>
         * <p>This parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Specifies whether to enable health checks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name that is used for health checks.</p>
         * <ul>
         * <li><p><strong>Use the internal IP address of the backend server</strong> (default): The internal IP address of the backend server is used as the health check domain name.</p>
         * </li>
         * <li><p><strong>Specify a domain name</strong>: Enter a domain name.</p>
         * <ul>
         * <li><p>The domain name must be 1 to 80 characters in length.</p>
         * </li>
         * <li><p>The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
         * </li>
         * <li><p>The domain name must contain at least one period (.). Periods (.) cannot appear at the beginning or end.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters, not digits or hyphens (-).</p>
         * </li>
         * <li><p>Hyphens (-) cannot appear at the beginning or end.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version for health checks. Valid values:</p>
         * <ul>
         * <li><strong>HTTP1.0</strong></li>
         * <li><strong>HTTP1.1</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to true and <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.1</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds. </p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * <blockquote>
         * <p>This parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method. Valid values:</p>
         * <ul>
         * <li><p><strong>GET</strong>: If the response body is longer than 8 KB, it is truncated. However, this does not affect the health check result.</p>
         * </li>
         * <li><p><strong>POST</strong>: gRPC listener health checks use the POST method by default.</p>
         * </li>
         * <li><p><strong>HEAD</strong>: HTTP and HTTPS listener health checks use the HEAD method by default.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to true and <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The forwarding rule path for health checks.</p>
         * <p>The path must be 1 to 80 characters in length and can contain only letters, digits, and the following characters: <code>-/.%?#&amp;=</code> and the following extended characters: <code>_;~!（)*[]@$^:\\&quot;,+</code>. The URL must start with <code>/</code>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> and <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The health check protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: The system sends HEAD or GET requests to simulate browser access behavior and checks whether the server application is healthy.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: The system sends HEAD or GET requests to simulate browser access behavior and checks whether the server application is healthy. HTTPS provides data encryption and is more secure than HTTP.</p>
         * </li>
         * <li><p><strong>TCP</strong>: The system sends SYN handshake packets to check whether the server port is alive.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: The system sends POST or GET requests to check whether the server application is healthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The time to accept a response from a health check. If the backend ECS instance does not respond correctly within the specified time, the health check is considered failed. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <blockquote>
         * <p>This parameter settings take effect only when <strong>HealthCheckEnabled</strong> is set to <strong>true</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of consecutive successful health checks required before the health check status of a backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of consecutive failed health checks required before the health check status of a backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
        /**
         * <p>The slow start duration.</p>
         * <p>Valid values: <strong>30</strong> to <strong>900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        /**
         * <p>Specifies whether to enable slow start.</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
         * <p>The cookie configured on the server.</p>
         * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces, and cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Server</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22B******</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The cookie timeout period. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method used to handle cookies. Valid values:</p>
         * <ul>
         * <li><strong>Insert</strong>: inserts a cookie.
         * When a client accesses the server for the first time, the load balancing service inserts a cookie into the response (inserts SERVERID into the HTTP or HTTPS response). The next time the client sends a request with this cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
         * <li><strong>Server</strong>: rewrites a cookie.
         * When the load balancing service detects a user-defined cookie, it rewrites the original cookie. The next time the client sends a request with the new cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> for the server group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Insert</p>
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
         * <p>The parameter type. Only QueryString is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QueryString</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The consistent hashing parameter value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
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
