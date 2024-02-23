// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If **NextToken** is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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
        @NameInMap("ConnectionDrainEnabled")
        public Boolean connectionDrainEnabled;

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
         * <p>The HTTP status codes that indicate whether the backend server passes the health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port that you want to use for health checks on backend servers. Valid values: **0** to **65535**.</p>
         * <br>
         * <p>A value of **0** indicates that the port on a backend server is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version that is used for health checks.</p>
         * <br>
         * <p>Valid values: **HTTP1.0** and **HTTP1.1**.</p>
         * <br>
         * <p>>  This parameter takes effect when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: **1** to **50**.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</p>
         * <p>*   **POST**: gRPC health checks on listeners use the POST method by default.</p>
         * <p>*   **HEAD**: HTTP and HTTPS health checks on listeners use the HEAD method by default.</p>
         * <br>
         * <p>>  This parameter takes effect when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, or **gRPC**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The path that is used for health checks.</p>
         * <br>
         * <p>>  This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that you want to use for health checks. Valid values:</p>
         * <br>
         * <p>*   **HTTP**: ALB performs HTTP health checks by sending HEAD or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <p>*   **HTTPS**: ALB performs HTTPS health checks by sending HEAD or GET requests to a backend server to check whether the backend server is healthy. HTTPS supports data encryption and provides higher data security than HTTP.</p>
         * <p>*   **TCP**: To perform TCP health checks, ALB sends SYN packets to the backend server to check whether the port of the backend server is available to receive requests.</p>
         * <p>*   **gRPC**: ALB performs gRPC health checks by sending POST or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <br>
         * <p>>  HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, and then apply for the privilege to use HTTPS on the **ALB** tab.</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The timeout period for a health check response. If a backend server does not respond within the specified timeout period, the backend server fails the health check. Unit: seconds.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
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
        @NameInMap("SlowStartDuration")
        public Integer slowStartDuration;

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
         * <p>The cookie that is configured on the server.</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The timeout period of a cookie. Unit: seconds. Valid values: **1** to **86400**.</p>
         * <br>
         * <p>>  This parameter takes effect only when **StickySessionEnabled** is set to **true** and **StickySessionType** is set to **Insert**.</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <br>
         * <p>*   **Insert**: inserts a cookie. ALB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client contains this cookie and the listener distributes this request to the recorded backend server.</p>
         * <p>*   **Server**: rewrites a cookie. When ALB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. Subsequent requests to ALB carry this user-defined cookie, and ALB determines the destination servers of the requests based on the cookies.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The data type of the common parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The parameter value for consistent hashing.</p>
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
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ConfigManagedEnabled")
        public Boolean configManagedEnabled;

        @NameInMap("ConnectionDrainConfig")
        public ListServerGroupsResponseBodyServerGroupsConnectionDrainConfig connectionDrainConfig;

        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The health check configuration.</p>
         */
        @NameInMap("HealthCheckConfig")
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig;

        /**
         * <p>Indicates whether IPv6 is supported. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Ipv6Enabled")
        public Boolean ipv6Enabled;

        /**
         * <p>The backend protocol. Valid values:</p>
         * <br>
         * <p>*   **HTTP**: allows you to associate HTTPS, HTTP, or QUIC listeners with backend servers.</p>
         * <p>*   **HTTPS**: allows you to associate an HTTPS listener with the server group.</p>
         * <p>*   **GRPC**: allows you to associate an HTTPS or QUIC listener with the server group.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RelatedLoadBalancerIds")
        public java.util.List<String> relatedLoadBalancerIds;

        /**
         * <p>The resource group ID to which the GA instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <br>
         * <p>*   **Wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights.</p>
         * <p>*   **Wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If multiple backend servers have the same weight, requests are forwarded to the backend server with the least number of connections.</p>
         * <p>*   **Sch**: The consistent hashing algorithm is used. Requests from the same source IP address are distributed to the same backend server.</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <p>The number of backend servers in the server group.</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The name of the server group.</p>
         */
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        /**
         * <p>The status of the server group. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Available**</p>
         * <p>*   **Configuring**</p>
         */
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        /**
         * <p>The type of server group. Valid values:</p>
         * <br>
         * <p>*   **Instance**</p>
         * <p>*   **Ip**</p>
         * <p>*   **Fc**</p>
         */
        @NameInMap("ServerGroupType")
        public String serverGroupType;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

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
         * <p>Indicates whether long-lived TCP connections are enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("UpstreamKeepaliveEnabled")
        public Boolean upstreamKeepaliveEnabled;

        /**
         * <p>The VPC ID.</p>
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
