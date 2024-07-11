// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRulesResponseBody extends TeaModel {
    /**
     * <p>The details of a port forwarding rule.</p>
     */
    @NameInMap("NetworkRules")
    public java.util.List<DescribeNetworkRulesResponseBodyNetworkRules> networkRules;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8597F235-FA5E-4FC7-BAD9-E4C0B01BC771</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned port forwarding rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The port of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("BackendPort")
        public Integer backendPort;

        /**
         * <p>The forwarding port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the port forwarding rule is automatically created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The IP addresses of origin servers.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        /**
         * <p>The remarks of the port forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
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

        public DescribeNetworkRulesResponseBodyNetworkRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
