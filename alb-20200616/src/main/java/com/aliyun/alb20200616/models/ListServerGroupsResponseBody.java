// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If <strong>NextToken</strong> is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</li>
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
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of server groups.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>Indicates whether connection draining is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

        /**
         * <p>The timeout period of connection draining.</p>
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
         * <p>The HTTP status codes that indicate healthy backend servers.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The backend port that is used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>A value of <strong>0</strong> indicates that the port of a backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        /**
         * <p>The domain name that is used for health checks. The domain name meets the following requirements:</p>
         * <ul>
         * <li>The domain name must be 1 to 80 characters in length.</li>
         * <li>The domain name can contain lowercase letters, digits, hyphens (-), and periods (.).</li>
         * <li>The domain name can contain at least one period (.) but cannot start or end with a period (.).</li>
         * <li>The rightmost domain label of the domain name can contain only letters, and cannot contain digits or hyphens (-).</li>
         * <li>The domain name cannot start or end with a hyphen (-).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version for health checks.</p>
         * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1.1</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method that is used for health checks. Valid value:</p>
         * <ul>
         * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
         * <li><strong>POST</strong>: gRPC health checks use the POST method by default.</li>
         * <li><strong>HEAD</strong>: HTTP and HTTPS health checks use the HEAD method by default.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The URL that is used for health checks.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that you want to use for health checks. Valid value:</p>
         * <ul>
         * <li><strong>HTTP</strong>: HTTP health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers.</li>
         * <li><strong>HTTPS</strong>: HTTPS health checks simulate browser behaviors by sending HEAD or GET requests to probe the availability of backend servers. HTTPS supports encryption and provides higher security than HTTP.</li>
         * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
         * <li><strong>gRPC</strong>: gRPC health checks send POST or GET requests to a backend server to check whether the backend server is healthy.</li>
         * </ul>
         * <blockquote>
         * <p> HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the backend server is declared unhealthy. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
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
         * <p>The duration of a slow start.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

        /**
         * <p>Indicates whether slow starts are enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The cookie configured for the server.</p>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of the cookie. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>StickySessionEnabled</strong> is set to <strong>true</strong> and <strong>StickySessionType</strong> is set to <strong>Insert</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Indicates whether session persistence is enabled. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method that is used to handle the cookie. Valid value:</p>
         * <ul>
         * <li><strong>insert</strong>: inserts the cookie. The first time a client accesses ALB, ALB inserts the SERVERID cookie into the HTTP or HTTPS response packet. Subsequent requests from the client that carry this cookie are forwarded to the same backend server as the first request.</li>
         * <li><strong>Server</strong>: rewrites the cookie. ALB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
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
         * <p>The parameter type. Valid value: QueryString.</p>
         * 
         * <strong>example:</strong>
         * <p>QueryString</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The hash value.</p>
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
         * <p>Indicates whether configuration management is enabled. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigManagedEnabled")
        public Boolean configManagedEnabled;

        /**
         * <p>The configurations of connection draining.</p>
         * <p>After connection draining is enabled, ALB maintains data transmission for a period of time after the backend server is removed or declared unhealthy.</p>
         * <blockquote>
         * <ul>
         * <li>By default, connection draining is disabled. To enable connection draining, contact your account manager.</li>
         * <li>Basic ALB instances do not support connection draining. Standard and WAF-enabled ALB instances support connection draining.</li>
         * <li>Server groups of the instance and IP types support connection draining. Server groups of the Function Compute type do not support connection draining.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ConnectionDrainConfig")
        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig connectionDrainConfig;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The health check configurations.</p>
         */
        @NameInMap("HealthCheckConfig")
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig;

        /**
         * <p>Indicates whether IPv6 is supported. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ipv6Enabled")
        public Boolean ipv6Enabled;

        /**
         * <p>The backend protocol. Valid value:</p>
         * <ul>
         * <li><strong>HTTP</strong>: allows you to associate HTTPS, HTTP, or QUIC listeners with backend servers.</li>
         * <li><strong>HTTPS</strong>: allows you to associate HTTPS listeners with backend servers.</li>
         * <li><strong>GRPC</strong>: allows you to associate HTTPS and QUIC listeners with backend servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the ALB instance associated with the server group.</p>
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
         * <p>The scheduling algorithm. Valid value:</p>
         * <ul>
         * <li><strong>Wrr</strong>: Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
         * <li><strong>Wlc</strong>: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least number of connections.</li>
         * <li><strong>Sch</strong>: consistent hashing. Requests that have the same hash factors are distributed to the same backend server. If you do not specify the UchConfig parameter, the source IP address is used as the hash factor by default. Requests that are from the same IP address are distributed to the same backend server. If you specify the UchConfig parameter, the URL string is used as the hash factor. Requests that have the same URL string are distributed to the same backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wrr</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The number of backend servers in the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-cige6j****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The server group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Group3</p>
         */
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        /**
         * <p>The status of the server group. Valid value:</p>
         * <ul>
         * <li><strong>Creating</strong>.</li>
         * <li><strong>Available</strong></li>
         * <li><strong>Configuring</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        /**
         * <p>The server group type. Valid value:</p>
         * <ul>
         * <li><strong>Instance</strong>: instances, including Elastic Compute Service (ECS) instances, elastic network interfaces (ENIs), and elastic container instances.</li>
         * <li><strong>Ip</strong>: IP addresses.</li>
         * <li><strong>Fc</strong>: Function Compute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("ServerGroupType")
        public String serverGroupType;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The configurations of slow starts.</p>
         * <p>After slow starts are enabled, ALB prefetches data to newly added backend servers. Requests distributed to the backend servers gradually increase.</p>
         * <blockquote>
         * <ul>
         * <li>Basic ALB instances do not support slow starts. Standard and WAF-enabled ALB instances support slow starts.</li>
         * <li>Server groups of the instance and IP types support slow starts. Server groups of the Function Compute type do not support slow starts.</li>
         * <li>Slow start is supported only by the weighted round-robin scheduling algorithm.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("SlowStartConfig")
        public ListServerGroupsResponseBodyServerGroupsSlowStartConfig slowStartConfig;

        /**
         * <p>The configuration of session persistence.</p>
         */
        @NameInMap("StickySessionConfig")
        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig stickySessionConfig;

        /**
         * <p>The tags that are added to the server group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags;

        /**
         * <p>The configuration of consistent hashing based on URLs.</p>
         */
        @NameInMap("UchConfig")
        public ListServerGroupsResponseBodyServerGroupsUchConfig uchConfig;

        /**
         * <p>Indicates whether persistent TCP connections are enabled. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UpstreamKeepaliveEnabled")
        public Boolean upstreamKeepaliveEnabled;

        /**
         * <p>The ID of the VPC to which the ALB instance belongs.</p>
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

        public ListServerGroupsResponseBodyServerGroups setHealthCheckConfig(ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
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
