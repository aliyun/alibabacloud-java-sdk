// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    // 健康检查模板
    @NameInMap("HealthCheckTemplates")
    public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> healthCheckTemplates;

    // 本次查询返回记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHealthCheckTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHealthCheckTemplatesResponseBody self = new ListHealthCheckTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHealthCheckTemplatesResponseBody setHealthCheckTemplates(java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> healthCheckTemplates) {
        this.healthCheckTemplates = healthCheckTemplates;
        return this;
    }
    public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> getHealthCheckTemplates() {
        return this.healthCheckTemplates;
    }

    public ListHealthCheckTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHealthCheckTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHealthCheckTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHealthCheckTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHealthCheckTemplatesResponseBodyHealthCheckTemplates extends TeaModel {
        // 端口
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

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

        // 健康检查模板Id
        @NameInMap("HealthCheckTemplateId")
        public String healthCheckTemplateId;

        // 名称
        @NameInMap("HealthCheckTemplateName")
        public String healthCheckTemplateName;

        // 超时时间
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        // 健康阈值
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        // 不健康阈值
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListHealthCheckTemplatesResponseBodyHealthCheckTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListHealthCheckTemplatesResponseBodyHealthCheckTemplates self = new ListHealthCheckTemplatesResponseBodyHealthCheckTemplates();
            return TeaModel.build(map, self);
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }
        public String getHealthCheckTemplateId() {
            return this.healthCheckTemplateId;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTemplateName(String healthCheckTemplateName) {
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }
        public String getHealthCheckTemplateName() {
            return this.healthCheckTemplateName;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

}
