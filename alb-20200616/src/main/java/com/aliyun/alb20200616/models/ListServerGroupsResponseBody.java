// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per request in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no more results are available.</li>
     * <li>If <strong>NextToken</strong> is returned, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of backend server groups.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsResponseBody self = new ListServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupsResponseBody setServerGroups(java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<ListServerGroupsResponseBodyServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    public ListServerGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable connection draining.</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        /**
         * <p>The timeout period for connection draining.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        public static ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig self = new ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
            this.connectionDrainEnabled = connectionDrainEnabled;
            return this;
        }
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsHealthCheckConfig extends TeaModel {
        /**
         * <p>The list of status codes that indicate a successful health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port of the backend server used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of <strong>0</strong> indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Indicates whether health checks are enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name used for health checks.</p>
         * <ul>
         * <li><p><strong>Use the internal IP address of the backend server</strong> (default): The internal IP address of the backend server is used as the domain name for health checks.</p>
         * </li>
         * <li><p><strong>Specify a domain name</strong>: Enter a domain name.</p>
         * <ul>
         * <li><p>The domain name must be 1 to 80 characters in length.</p>
         * </li>
         * <li><p>It can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
         * </li>
         * <li><p>It must contain at least one period (.), and the period (.) cannot be at the beginning or end.</p>
         * </li>
         * <li><p>The rightmost domain label can contain only letters, and cannot contain digits or hyphens (-).</p>
         * </li>
         * <li><p>A hyphen (-) cannot be at the beginning or end.</p>
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
         * <p>The HTTP version for health checks. Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
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
         * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>GET</strong>: If the response message exceeds 8 KB, it is truncated. However, this does not affect the health check result.</p>
         * </li>
         * <li><p><strong>POST</strong>: The POST method is used by default for gRPC listener health checks.</p>
         * </li>
         * <li><p><strong>HEAD</strong>: The HEAD method is used by default for HTTP and HTTPS listener health checks.</p>
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
         * <li><p><strong>HTTP</strong>: Sends HEAD or GET requests for browser impersonation to check whether the server application is healthy.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: Sends HEAD or GET requests for browser impersonation to check whether the server application is healthy. (Data encryption, more secure than HTTP.)</p>
         * </li>
         * <li><p><strong>TCP</strong>: Sends SYN handshake messages to check whether the server port is alive.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: Sends POST or GET requests to check whether the server application is healthy.</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListServerGroupsResponseBodyServerGroupsHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsHealthCheckConfig self = new ListServerGroupsResponseBodyServerGroupsHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsSlowStartConfig extends TeaModel {
        /**
         * <p>The duration of slow start.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        /**
         * <p>Specifies whether to enable slow start.</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SlowStartEnabled")
        public Boolean slowStartEnabled;

        public static ListServerGroupsResponseBodyServerGroupsSlowStartConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsSlowStartConfig self = new ListServerGroupsResponseBodyServerGroupsSlowStartConfig();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsSlowStartConfig setSlowStartDuration(Integer slowStartDuration) {
            this.slowStartDuration = slowStartDuration;
            return this;
        }
        public Integer getSlowStartDuration() {
            return this.slowStartDuration;
        }

        public ListServerGroupsResponseBodyServerGroupsSlowStartConfig setSlowStartEnabled(Boolean slowStartEnabled) {
            this.slowStartEnabled = slowStartEnabled;
            return this;
        }
        public Boolean getSlowStartEnabled() {
            return this.slowStartEnabled;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsStickySessionConfig extends TeaModel {
        /**
         * <p>The cookie configured on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of the cookie. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
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
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <li><strong>Insert</strong>: Insert a cookie. When a client accesses the service for the first time, the load balancing inserts a cookie (that is, inserts SERVERID into the HTTP or HTTPS response message). The next time the client accesses the service with this cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
         * <li><strong>Server</strong>: Rewrite a cookie. When the load balancing detects a user-defined cookie, it rewrites the original cookie. The next time the client accesses the service with the new cookie, the load balancing service forwards the request to the previously recorded backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Insert</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        public static ListServerGroupsResponseBodyServerGroupsStickySessionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsStickySessionConfig self = new ListServerGroupsResponseBodyServerGroupsStickySessionConfig();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig setStickySessionEnabled(Boolean stickySessionEnabled) {
            this.stickySessionEnabled = stickySessionEnabled;
            return this;
        }
        public Boolean getStickySessionEnabled() {
            return this.stickySessionEnabled;
        }

        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsResponseBodyServerGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsTags self = new ListServerGroupsResponseBodyServerGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupsResponseBodyServerGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupsUchConfig extends TeaModel {
        /**
         * <p>The parameter type. Only QueryString is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>QueryString</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The consistent hash parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsResponseBodyServerGroupsUchConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsUchConfig self = new ListServerGroupsResponseBodyServerGroupsUchConfig();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupsUchConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListServerGroupsResponseBodyServerGroupsUchConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroups extends TeaModel {
        /**
         * <p>Indicates whether configuration management is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigManagedEnabled")
        public Boolean configManagedEnabled;

        /**
         * <p>The graceful connection break configuration.</p>
         * <p>When graceful connection break is enabled, load balancing allows existing connections to be transmitted normally within a specified period after a backend server is removed or a health check failed.</p>
         * <blockquote>
         * <ul>
         * <li>Graceful connection break is not supported by Basic Edition instances. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
         * <li>Graceful connection break is supported by server groups of the server type and IP type, but not by server groups of the Function Compute type.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ConnectionDrainConfig")
        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig connectionDrainConfig;

        /**
         * <p>The time when the resource was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Specifies whether to enable cross-zone load balancing for the server group. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled. This is the default value.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CrossZoneEnabled")
        public Boolean crossZoneEnabled;

        /**
         * <p>The health check configuration.</p>
         */
        @NameInMap("HealthCheckConfig")
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig;

        /**
         * <p>The IP version affinity mode. Valid values:</p>
         * <ul>
         * <li>NonAffinity: No affinity mode. This is the default value.</li>
         * <li>Affinity: Affinity mode.</li>
         * </ul>
         * <p>This parameter takes effect only when Ipv6Enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Affinity</p>
         */
        @NameInMap("IpVersionAffinityMode")
        public String ipVersionAffinityMode;

        /**
         * <p>Indicates whether the IP protocol version used by the load balancing to forward traffic to the backend server group supports IPv6. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): IPv6 is not supported. For the IPv4 type, only IPv4 backend servers can be added.</li>
         * <li><strong>true</strong>: Dual-stack type. Both IPv4 and IPv6 backend servers can be added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ipv6Enabled")
        public Boolean ipv6Enabled;

        /**
         * <p>The backend protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: Supports association with HTTPS, HTTP, and QUIC listeners.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: Supports association with HTTPS listeners.</p>
         * </li>
         * <li><p><strong>GRPC</strong>: Supports association with HTTPS and QUIC listeners.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The IDs of the associated instances.</p>
         */
        @NameInMap("RelatedLoadBalancerIds")
        public java.util.List<String> relatedLoadBalancerIds;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>Wrr</strong>: Weighted round-robin. Backend servers with higher weights are more likely to be polled.</li>
         * <li><strong>Wlc</strong>: Weighted least connections. In addition to the weight of each backend server, the actual load (number of connections) is also considered. When weights are the same, backend servers with fewer current connections are more likely to be polled.</li>
         * <li><strong>Sch</strong>: Consistent hashing. Requests with the same hash factor calculation result are scheduled to the same backend server. If the UchConfig parameter is not configured, the default hash factor is the source IP address, and requests from the same source IP address are distributed to the same backend server. If the UchConfig parameter is configured, the hash factor is the URL parameter, and requests with the same URL parameter are distributed to the same backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wrr</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The number of servers in the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-cige6j****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group3</p>
         */
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        /**
         * <p>The status of the server group. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The server group is being created.</p>
         * </li>
         * <li><p><strong>Available</strong>: The server group is available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The server group is being reconfigured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong>: Server type, including ECS, ENI, and ECI instances.</p>
         * </li>
         * <li><p><strong>Ip</strong>: IP address type.</p>
         * </li>
         * <li><p><strong>Fc</strong>: Function Compute type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("ServerGroupType")
        public String serverGroupType;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The slow start configuration.</p>
         * <p>After slow start is enabled, newly added backend servers in the backend server group are warmed up within a specified period, and the number of requests forwarded to the servers increases linearly.</p>
         * <blockquote>
         * <ul>
         * <li>Slow start is not supported by Basic Edition instances. Only Standard Edition and WAF Enhanced Edition instances support this feature.</li>
         * <li>Slow start can be configured for server groups of the server type and IP type, but not for server groups of the Function Compute type.</li>
         * <li>Slow start can be enabled only when the backend scheduling algorithm is set to the weighted polling algorithm.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("SlowStartConfig")
        public ListServerGroupsResponseBodyServerGroupsSlowStartConfig slowStartConfig;

        /**
         * <p>The session persistence configuration.</p>
         */
        @NameInMap("StickySessionConfig")
        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig stickySessionConfig;

        /**
         * <p>The list of tags bound to the server group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags;

        /**
         * <p>The URL consistent hash parameter settings.</p>
         */
        @NameInMap("UchConfig")
        public ListServerGroupsResponseBodyServerGroupsUchConfig uchConfig;

        /**
         * <p>Indicates whether upstream keep-alive is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UpstreamKeepaliveEnabled")
        public Boolean upstreamKeepaliveEnabled;

        /**
         * <p>The VPC-connected instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListServerGroupsResponseBodyServerGroups build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroups self = new ListServerGroupsResponseBodyServerGroups();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroups setConfigManagedEnabled(Boolean configManagedEnabled) {
            this.configManagedEnabled = configManagedEnabled;
            return this;
        }
        public Boolean getConfigManagedEnabled() {
            return this.configManagedEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setConnectionDrainConfig(ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig connectionDrainConfig) {
            this.connectionDrainConfig = connectionDrainConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig getConnectionDrainConfig() {
            return this.connectionDrainConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServerGroupsResponseBodyServerGroups setCrossZoneEnabled(Boolean crossZoneEnabled) {
            this.crossZoneEnabled = crossZoneEnabled;
            return this;
        }
        public Boolean getCrossZoneEnabled() {
            return this.crossZoneEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setHealthCheckConfig(ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setIpVersionAffinityMode(String ipVersionAffinityMode) {
            this.ipVersionAffinityMode = ipVersionAffinityMode;
            return this;
        }
        public String getIpVersionAffinityMode() {
            return this.ipVersionAffinityMode;
        }

        public ListServerGroupsResponseBodyServerGroups setIpv6Enabled(Boolean ipv6Enabled) {
            this.ipv6Enabled = ipv6Enabled;
            return this;
        }
        public Boolean getIpv6Enabled() {
            return this.ipv6Enabled;
        }

        public ListServerGroupsResponseBodyServerGroups setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListServerGroupsResponseBodyServerGroups setRelatedLoadBalancerIds(java.util.List<String> relatedLoadBalancerIds) {
            this.relatedLoadBalancerIds = relatedLoadBalancerIds;
            return this;
        }
        public java.util.List<String> getRelatedLoadBalancerIds() {
            return this.relatedLoadBalancerIds;
        }

        public ListServerGroupsResponseBodyServerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServerGroupsResponseBodyServerGroups setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public ListServerGroupsResponseBodyServerGroups setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupName(String serverGroupName) {
            this.serverGroupName = serverGroupName;
            return this;
        }
        public String getServerGroupName() {
            return this.serverGroupName;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupStatus(String serverGroupStatus) {
            this.serverGroupStatus = serverGroupStatus;
            return this;
        }
        public String getServerGroupStatus() {
            return this.serverGroupStatus;
        }

        public ListServerGroupsResponseBodyServerGroups setServerGroupType(String serverGroupType) {
            this.serverGroupType = serverGroupType;
            return this;
        }
        public String getServerGroupType() {
            return this.serverGroupType;
        }

        public ListServerGroupsResponseBodyServerGroups setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServerGroupsResponseBodyServerGroups setSlowStartConfig(ListServerGroupsResponseBodyServerGroupsSlowStartConfig slowStartConfig) {
            this.slowStartConfig = slowStartConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsSlowStartConfig getSlowStartConfig() {
            return this.slowStartConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setStickySessionConfig(ListServerGroupsResponseBodyServerGroupsStickySessionConfig stickySessionConfig) {
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig getStickySessionConfig() {
            return this.stickySessionConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setTags(java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> getTags() {
            return this.tags;
        }

        public ListServerGroupsResponseBodyServerGroups setUchConfig(ListServerGroupsResponseBodyServerGroupsUchConfig uchConfig) {
            this.uchConfig = uchConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsUchConfig getUchConfig() {
            return this.uchConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setUpstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
            this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
            return this;
        }
        public Boolean getUpstreamKeepaliveEnabled() {
            return this.upstreamKeepaliveEnabled;
        }

        public ListServerGroupsResponseBodyServerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
