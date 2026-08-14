// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRulesResponseBody extends TeaModel {
    @NameInMap("NetworkRules")
    public java.util.List<DescribeNetworkRulesResponseBodyNetworkRules> networkRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeNetworkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRulesResponseBody self = new DescribeNetworkRulesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeNetworkRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkRulesResponseBodyNetworkRules extends TeaModel {
        @NameInMap("BackendPort")
        public Integer backendPort;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpMode")
        public String ipMode;

        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        @NameInMap("PayloadRuleEnable")
        public Long payloadRuleEnable;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ProxyEnable")
        public Long proxyEnable;

        @NameInMap("ProxyStatus")
        public String proxyStatus;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        @NameInMap("Remark")
        public String remark;

        public static DescribeNetworkRulesResponseBodyNetworkRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRulesResponseBodyNetworkRules self = new DescribeNetworkRulesResponseBodyNetworkRules();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setPayloadRuleEnable(Long payloadRuleEnable) {
            this.payloadRuleEnable = payloadRuleEnable;
            return this;
        }
        public Long getPayloadRuleEnable() {
            return this.payloadRuleEnable;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setProxyEnable(Long proxyEnable) {
            this.proxyEnable = proxyEnable;
            return this;
        }
        public Long getProxyEnable() {
            return this.proxyEnable;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setProxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeNetworkRulesResponseBodyNetworkRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
