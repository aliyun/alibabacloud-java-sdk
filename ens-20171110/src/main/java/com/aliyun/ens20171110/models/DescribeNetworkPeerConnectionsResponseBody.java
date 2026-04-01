// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkPeerConnectionsResponseBody extends TeaModel {
    @NameInMap("NetworkPeerConnects")
    public java.util.List<DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects> networkPeerConnects;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeNetworkPeerConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPeerConnectionsResponseBody self = new DescribeNetworkPeerConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPeerConnectionsResponseBody setNetworkPeerConnects(java.util.List<DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects> networkPeerConnects) {
        this.networkPeerConnects = networkPeerConnects;
        return this;
    }
    public java.util.List<DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects> getNetworkPeerConnects() {
        return this.networkPeerConnects;
    }

    public DescribeNetworkPeerConnectionsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkPeerConnectionsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkPeerConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkPeerConnectionsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork extends TeaModel {
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <strong>example:</strong>
         * <p>n-5q28114****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        public static DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork self = new DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

    }

    public static class DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork extends TeaModel {
        @NameInMap("Ipv4Cidrs")
        public java.util.List<String> ipv4Cidrs;

        /**
         * <strong>example:</strong>
         * <p>n-5q73bm****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        public static DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork self = new DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork setIpv4Cidrs(java.util.List<String> ipv4Cidrs) {
            this.ipv4Cidrs = ipv4Cidrs;
            return this;
        }
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

    }

    public static class DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects extends TeaModel {
        @NameInMap("AcceptingNetwork")
        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork acceptingNetwork;

        /**
         * <strong>example:</strong>
         * <p>n-5q28114****</p>
         */
        @NameInMap("AcceptingNetworkId")
        public String acceptingNetworkId;

        /**
         * <strong>example:</strong>
         * <p>2024-05-31T06:43:29Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-dongguan-9</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>pcc-521pzxdg****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Network")
        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork network;

        /**
         * <strong>example:</strong>
         * <p>n-5q73bm****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects self = new DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setAcceptingNetwork(DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork acceptingNetwork) {
            this.acceptingNetwork = acceptingNetwork;
            return this;
        }
        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsAcceptingNetwork getAcceptingNetwork() {
            return this.acceptingNetwork;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setAcceptingNetworkId(String acceptingNetworkId) {
            this.acceptingNetworkId = acceptingNetworkId;
            return this;
        }
        public String getAcceptingNetworkId() {
            return this.acceptingNetworkId;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setNetwork(DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnectsNetwork getNetwork() {
            return this.network;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeNetworkPeerConnectionsResponseBodyNetworkPeerConnects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
