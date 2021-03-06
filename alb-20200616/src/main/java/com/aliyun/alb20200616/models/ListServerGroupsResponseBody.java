// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    // 本次查询返回记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 服务器组
    @NameInMap("ServerGroups")
    public java.util.List<ListServerGroupsResponseBodyServerGroups> serverGroups;

    // 总记录数
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

    public static class ListServerGroupsResponseBodyServerGroupsHealthCheckConfig extends TeaModel {
        // 端口
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        // 是否启用健康检查
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        // 域名
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        // 状态码
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        // 版本
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        // 间隔时间
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        // 方法
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        // uri
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        // 协议
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        // 超时时间
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        // 健康阈值
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        // 不健康阈值
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListServerGroupsResponseBodyServerGroupsHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupsHealthCheckConfig self = new ListServerGroupsResponseBodyServerGroupsHealthCheckConfig();
            return TeaModel.build(map, self);
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

        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
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

    public static class ListServerGroupsResponseBodyServerGroupsStickySessionConfig extends TeaModel {
        // Cookie
        @NameInMap("Cookie")
        public String cookie;

        // Cookie超时时间
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        // 是否开启会话保持
        @NameInMap("StickySessionEnabled")
        public Boolean stickySessionEnabled;

        // 会话保持类型
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
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
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

    public static class ListServerGroupsResponseBodyServerGroups extends TeaModel {
        // 健康检查配置
        @NameInMap("HealthCheckConfig")
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig;

        // 服务器组协议
        @NameInMap("Protocol")
        public String protocol;

        // 资源组id
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // 调度策略
        @NameInMap("Scheduler")
        public String scheduler;

        // 服务器组Id
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        // 服务器组名称
        @NameInMap("ServerGroupName")
        public String serverGroupName;

        // 服务器组状态
        @NameInMap("ServerGroupStatus")
        public String serverGroupStatus;

        // 会话保持配置
        @NameInMap("StickySessionConfig")
        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig stickySessionConfig;

        // 服务器组所在VpcId
        @NameInMap("VpcId")
        public String vpcId;

        // 标签列表
        @NameInMap("Tags")
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags;

        public static ListServerGroupsResponseBodyServerGroups build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroups self = new ListServerGroupsResponseBodyServerGroups();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroups setHealthCheckConfig(ListServerGroupsResponseBodyServerGroupsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
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

        public ListServerGroupsResponseBodyServerGroups setStickySessionConfig(ListServerGroupsResponseBodyServerGroupsStickySessionConfig stickySessionConfig) {
            this.stickySessionConfig = stickySessionConfig;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupsStickySessionConfig getStickySessionConfig() {
            return this.stickySessionConfig;
        }

        public ListServerGroupsResponseBodyServerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListServerGroupsResponseBodyServerGroups setTags(java.util.List<ListServerGroupsResponseBodyServerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyServerGroupsTags> getTags() {
            return this.tags;
        }

    }

}
