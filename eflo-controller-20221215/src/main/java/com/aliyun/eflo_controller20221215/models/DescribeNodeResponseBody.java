// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

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
    public java.util.List<DescribeNodeResponseBodyNetworks> networks;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OperatingState")
    public String operatingState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeResponseBody self = new DescribeNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNodeResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeNodeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeNodeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeNodeResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeNodeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeNodeResponseBody setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public DescribeNodeResponseBody setNetworks(java.util.List<DescribeNodeResponseBodyNetworks> networks) {
        this.networks = networks;
        return this;
    }
    public java.util.List<DescribeNodeResponseBodyNetworks> getNetworks() {
        return this.networks;
    }

    public DescribeNodeResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeNodeResponseBody setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public DescribeNodeResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeNodeResponseBody setOperatingState(String operatingState) {
        this.operatingState = operatingState;
        return this;
    }
    public String getOperatingState() {
        return this.operatingState;
    }

    public DescribeNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public DescribeNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeNodeResponseBodyNetworks extends TeaModel {
        @NameInMap("BondName")
        public String bondName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("SubnetId")
        public String subnetId;

        @NameInMap("VpdId")
        public String vpdId;

        public static DescribeNodeResponseBodyNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeResponseBodyNetworks self = new DescribeNodeResponseBodyNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeNodeResponseBodyNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public DescribeNodeResponseBodyNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeNodeResponseBodyNetworks setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public DescribeNodeResponseBodyNetworks setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
