// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CAF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The graceful connection break configuration.</p>
     * <p>After graceful connection break is enabled, load balancing allows existing connections to be transmitted normally within a specified period of time after a backend server is removed or a health check failed.</p>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support graceful connection break. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
     * <li>Server type and IP type server groups support graceful connection break. Function Compute type server groups do not support this feature.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ConnectionDrainConfig")
    public CreateServerGroupRequestConnectionDrainConfig connectionDrainConfig;

    /**
     * <p>Specifies whether to enable cross-zone load balancing for the server group. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables cross-zone load balancing (default).</p>
     * </li>
     * <li><p><strong>false</strong>: disables cross-zone load balancing.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support associating with server groups that have cross-zone load balancing disabled. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
     * <li>Server type and IP type server groups support disabling cross-zone load balancing. Function Compute type server groups do not support this feature.</li>
     * <li>Session persistence cannot be enabled when cross-zone load balancing is disabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CrossZoneEnabled")
    public Boolean crossZoneEnabled;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the server group. The system checks whether the required parameters are specified, the request format, and the service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): sends the normal request. After the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The health check configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123</p>
     */
    @NameInMap("HealthCheckConfig")
    public CreateServerGroupRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>The IP version affinity mode. Valid values:</p>
     * <ul>
     * <li>NonAffinity: non-affinity mode. This is the default value.</li>
     * <li>Affinity: affinity mode.</li>
     * </ul>
     * <p>This parameter takes effect only when Ipv6Enabled is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>Affinity</p>
     */
    @NameInMap("IpVersionAffinityMode")
    public String ipVersionAffinityMode;

    /**
     * <p>Specifies whether the IP protocol version used by load balancing to forward traffic to the backend server group supports IPv6. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): IPv6 is not supported. The IPv4 type supports adding only IPv4 backend servers.</li>
     * <li><strong>true</strong>: the dual-stack type is used. Both IPv4 and IPv6 backend servers can be added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ipv6Enabled")
    public Boolean ipv6Enabled;

    /**
     * <p>The backend protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default): supports associating with HTTPS, HTTP, and QUIC listeners.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: supports associating with HTTP and HTTPS listeners.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: associates with HTTPS listeners.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You do not need to configure the backend protocol when <strong>ServerGroupType</strong> is set to <strong>Fc</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rsop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>Wrr</strong> (default): weighted round-robin. Backend servers with higher weights are more likely to be polled.</p>
     * </li>
     * <li><p><strong>Wlc</strong>: weighted least connections. In addition to polling based on the weight of each backend server, this algorithm also considers the actual load (number of connections) of the backend servers. When the weights are the same, backend servers with fewer current connections are more likely to be polled.</p>
     * </li>
     * <li><p><strong>Sch</strong>: consistent hashing. Requests with the same hash factor calculation result are scheduled to the same backend server. If the <strong>UchConfig</strong> parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the <strong>UchConfig</strong> parameter is configured, the hash factor is the URL parameter, and requests with the same URL parameter are distributed to the same backend server.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Wrr</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The name of the server group. The name must be 2 to 128 characters in length, and must start with a letter, Chinese character, or digit. It can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

    /**
     * <p>The type of the server group. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong> (default): server type. This type of server group supports adding <strong>Ecs</strong>, <strong>Eni</strong>, and <strong>Eci</strong> instances.</p>
     * </li>
     * <li><p><strong>Ip</strong>: IP address type. This type of server group supports adding backend servers by IP address.</p>
     * </li>
     * <li><p><strong>Fc</strong>: Function Compute type. This type of server group supports adding Function Compute backend servers.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    /**
     * <p>The name of the <code>K8s Service</code> that corresponds to the server group. This parameter is applicable only to ALB Ingress scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The slow start configuration.</p>
     * <p>After slow start is enabled, newly added backend servers in the server group are warmed up within the specified time period, and the number of requests forwarded to the servers increases linearly.</p>
     * <blockquote>
     * <ul>
     * <li>Basic Edition instances do not support slow start. Only Standard Edition and WAF-enhanced Edition instances support this feature.</li>
     * <li>Server type and IP backend server groups support slow start. Function Compute backend server groups do not support this feature.</li>
     * <li>Slow start can be enabled only when the backend scheduling algorithm is weighted round-robin.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("SlowStartConfig")
    public CreateServerGroupRequestSlowStartConfig slowStartConfig;

    /**
     * <p>The session persistence configuration.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
     * </blockquote>
     */
    @NameInMap("StickySessionConfig")
    public CreateServerGroupRequestStickySessionConfig stickySessionConfig;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateServerGroupRequestTag> tag;

    /**
     * <p>The URL consistent hashing parameter settings.</p>
     */
    @NameInMap("UchConfig")
    public CreateServerGroupRequestUchConfig uchConfig;

    /**
     * <p>Specifies whether to enable backend keep-alive. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables backend keep-alive.</li>
     * <li><strong>false</strong> (default): disables backend keep-alive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpstreamKeepaliveEnabled")
    public Boolean upstreamKeepaliveEnabled;

    /**
     * <p>The VPC-connected instance ID. Only servers in this VPC can be added to the server group.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zdkdt37pq72zv****</p>
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

    public CreateServerGroupRequest setCrossZoneEnabled(Boolean crossZoneEnabled) {
        this.crossZoneEnabled = crossZoneEnabled;
        return this;
    }
    public Boolean getCrossZoneEnabled() {
        return this.crossZoneEnabled;
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

    public CreateServerGroupRequest setIpVersionAffinityMode(String ipVersionAffinityMode) {
        this.ipVersionAffinityMode = ipVersionAffinityMode;
        return this;
    }
    public String getIpVersionAffinityMode() {
        return this.ipVersionAffinityMode;
    }

    public CreateServerGroupRequest setIpv6Enabled(Boolean ipv6Enabled) {
        this.ipv6Enabled = ipv6Enabled;
        return this;
    }
    public Boolean getIpv6Enabled() {
        return this.ipv6Enabled;
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
        /**
         * <p>Specifies whether to enable connection draining. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables connection draining.</li>
         * <li><strong>false</strong>: disables connection draining (default).</li>
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
         * <p>Default value: <strong>300</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
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
         * <p>The list of status codes that indicate a successful health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port of the backend server used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>Default value: <strong>0</strong>, which indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Specifies whether to enable health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables health checks.</p>
         * </li>
         * <li><p><strong>false</strong>: disables health checks.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>By default, health checks are enabled when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>, and disabled when <strong>ServerGroupType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>Internal IP address of the backend server</strong> (default): uses the internal IP address of the backend server as the domain name for health checks.</p>
         * </li>
         * <li><p><strong>Custom domain name</strong>: specifies a domain name.</p>
         * <ul>
         * <li><p>The domain name must be 1 to 80 characters in length.</p>
         * </li>
         * <li><p>It can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
         * </li>
         * <li><p>It must contain at least one period (.), and the period (.) cannot be at the beginning or end.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters, and cannot contain digits or hyphens (-).</p>
         * </li>
         * <li><p>The hyphen (-) cannot be at the beginning or end.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version used for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong> (default).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.1</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * <p>Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>GET</strong>: if the length of the response message exceeds 8 KB, it is truncated, but this does not affect the health check result.</p>
         * </li>
         * <li><p><strong>POST</strong>: the default method for gRPC listener health checks.</p>
         * </li>
         * <li><p><strong>HEAD</strong> (default): the default method for HTTP and HTTPS listener health checks.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The path used for health checks.</p>
         * <p>The path must be 1 to 80 characters in length, and can contain only letters, digits, and the following special characters: <code>-/.%?#&amp;=</code> and extended characters <code>_;~!()*[]@$^:\&quot;,+</code>. The URL must start with a forward slash (/).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: sends HEAD or GET requests to perform impersonation of browser access and check whether the server application is healthy.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests to perform impersonation of browser access and check whether the server application is healthy (data encryption, which makes it more secure than HTTP).</p>
         * </li>
         * <li><p><strong>TCP</strong>: sends SYN handshake messages to check whether the server port is alive.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: sends POST or GET requests to check whether the server application is healthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The timeout period for a health check response. If the backend server does not respond within the specified timeout period, the health check fails. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <p>Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
        /**
         * <p>The slow start duration.</p>
         * <p>Valid values: <strong>30</strong> to <strong>900</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        /**
         * <p>Specifies whether to enable slow start. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables slow start.</li>
         * <li><strong>false</strong>: disables slow start (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
         * <p>The cookie configured on the server.</p>
         * <p>The cookie must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces, and cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>B490B6EBF6F3CD402E515D22BCDA****</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of the cookie. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * <p>Default value: <strong>1000</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong>.</p>
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
         * <li><strong>true</strong>: enables session persistence.</li>
         * <li><strong>false</strong>: disables session persistence.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ServerGroupType</strong> is set to <strong>Instance</strong> or <strong>Ip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method used to handle cookies. Valid values:</p>
         * <ul>
         * <li><p><strong>Insert</strong> (default): inserts a cookie.
         * When a client accesses the server for the first time, load balancing inserts a cookie (that is, inserts SERVERID into the HTTP or HTTPS response message). The next time the client accesses the server with this cookie, load balancing forwards the request to the previously recorded backend server.</p>
         * </li>
         * <li><p><strong>Server</strong>: rewrites a cookie.
         * When load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the server with the new cookie, load balancing forwards the request to the previously recorded backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Insert</p>
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
         * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
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
         * <p>The parameter type. Set the value to <strong>QueryString</strong>.</p>
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
