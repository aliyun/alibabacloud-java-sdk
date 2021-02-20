// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("NetworkRules")
    public java.util.List<DescribeNetworkRulesResponseBodyNetworkRules> networkRules;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRulesResponseBody self = new DescribeNetworkRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkRulesResponseBody setNetworkRules(java.util.List<DescribeNetworkRulesResponseBodyNetworkRules> networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public java.util.List<DescribeNetworkRulesResponseBodyNetworkRules> getNetworkRules() {
        return this.networkRules;
    }

    public DescribeNetworkRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkRulesResponseBodyNetworkRules extends TeaModel {
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("BackendPort")
        public Integer backendPort;

        public static DescribeNetworkRulesResponseBodyNetworkRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRulesResponseBodyNetworkRules self = new DescribeNetworkRulesResponseBodyNetworkRules();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

    }

}
