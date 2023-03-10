// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortResponseBody extends TeaModel {
    /**
     * <p>An array that consists of port forwarding rules.</p>
     */
    @NameInMap("NetworkRules")
    public java.util.List<DescribePortResponseBodyNetworkRules> networkRules;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of port forwarding rules returned.</p>
     */
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
        /**
         * <p>The port of the origin server.</p>
         */
        @NameInMap("BackendPort")
        public Integer backendPort;

        /**
         * <p>The forwarding port.</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         */
        @NameInMap("FrontendProtocol")
        public String frontendProtocol;

        /**
         * <p>The ID of the instance to which the port forwarding rule is applied.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the port forwarding rule is automatically created by the instance. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        /**
         * <p>An array that consists of IP addresses of origin servers.</p>
         */
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
