// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Nodes")
    public java.util.List<ListClusterNodesResponseBodyNodes> nodes;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodesResponseBody self = new ListClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterNodesResponseBody setNodes(java.util.List<ListClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterNodesResponseBodyNodesNetworks extends TeaModel {
        @NameInMap("BondName")
        public String bondName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("SubnetId")
        public String subnetId;

        @NameInMap("VpdId")
        public String vpdId;

        public static ListClusterNodesResponseBodyNodesNetworks build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesResponseBodyNodesNetworks self = new ListClusterNodesResponseBodyNodesNetworks();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesResponseBodyNodesNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public ListClusterNodesResponseBodyNodesNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListClusterNodesResponseBodyNodesNetworks setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ListClusterNodesResponseBodyNodesNetworks setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListClusterNodesResponseBodyNodes extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("Networks")
        public java.util.List<ListClusterNodesResponseBodyNodesNetworks> networks;

        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OperatingState")
        public String operatingState;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesResponseBodyNodes self = new ListClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesResponseBodyNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListClusterNodesResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListClusterNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListClusterNodesResponseBodyNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListClusterNodesResponseBodyNodes setNetworks(java.util.List<ListClusterNodesResponseBodyNodesNetworks> networks) {
            this.networks = networks;
            return this;
        }
        public java.util.List<ListClusterNodesResponseBodyNodesNetworks> getNetworks() {
            return this.networks;
        }

        public ListClusterNodesResponseBodyNodes setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListClusterNodesResponseBodyNodes setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ListClusterNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListClusterNodesResponseBodyNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        public ListClusterNodesResponseBodyNodes setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListClusterNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
