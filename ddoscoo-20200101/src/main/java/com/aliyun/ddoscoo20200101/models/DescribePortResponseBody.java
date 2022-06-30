// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortResponseBody extends TeaModel {
    @NameInMap("NetworkRules")
    public java.util.List<DescribePortResponseBodyNetworkRules> networkRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortResponseBody self = new DescribePortResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortResponseBody setNetworkRules(java.util.List<DescribePortResponseBodyNetworkRules> networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public java.util.List<DescribePortResponseBodyNetworkRules> getNetworkRules() {
        return this.networkRules;
    }

    public DescribePortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePortResponseBodyNetworkRules extends TeaModel {
        @NameInMap("BackendPort")
        public Integer backendPort;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("FrontendProtocol")
        public String frontendProtocol;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        public static DescribePortResponseBodyNetworkRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePortResponseBodyNetworkRules self = new DescribePortResponseBodyNetworkRules();
            return TeaModel.build(map, self);
        }

        public DescribePortResponseBodyNetworkRules setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public DescribePortResponseBodyNetworkRules setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribePortResponseBodyNetworkRules setFrontendProtocol(String frontendProtocol) {
            this.frontendProtocol = frontendProtocol;
            return this;
        }
        public String getFrontendProtocol() {
            return this.frontendProtocol;
        }

        public DescribePortResponseBodyNetworkRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePortResponseBodyNetworkRules setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribePortResponseBodyNetworkRules setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

    }

}
