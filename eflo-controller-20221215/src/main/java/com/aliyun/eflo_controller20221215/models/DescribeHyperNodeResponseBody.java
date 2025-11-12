// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeHyperNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>2022-11-30T02:00:00.852Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2125-06-24T16:52:44.318000</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <strong>example:</strong>
     * <p>alywlcb-lingjun-gpu-0025</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("HyperNodeId")
    public String hyperNodeId;

    /**
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>lisan-nodegroup</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("Nodes")
    public java.util.List<DescribeHyperNodeResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>Using</p>
     */
    @NameInMap("OperatingState")
    public String operatingState;

    /**
     * <strong>example:</strong>
     * <p>D6058705-1C45-35C9-9461-02504897D4D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxno4vh5****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Operating</p>
     */
    @NameInMap("Status")
    @Deprecated
    public String status;

    /**
     * <strong>example:</strong>
     * <p>cn-wulanchabu-c</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeHyperNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHyperNodeResponseBody self = new DescribeHyperNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHyperNodeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHyperNodeResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeHyperNodeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeHyperNodeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeHyperNodeResponseBody setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public DescribeHyperNodeResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeHyperNodeResponseBody setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public DescribeHyperNodeResponseBody setHyperNodeId(String hyperNodeId) {
        this.hyperNodeId = hyperNodeId;
        return this;
    }
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    public DescribeHyperNodeResponseBody setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public DescribeHyperNodeResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeHyperNodeResponseBody setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public DescribeHyperNodeResponseBody setNodes(java.util.List<DescribeHyperNodeResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeHyperNodeResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeHyperNodeResponseBody setOperatingState(String operatingState) {
        this.operatingState = operatingState;
        return this;
    }
    public String getOperatingState() {
        return this.operatingState;
    }

    public DescribeHyperNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHyperNodeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    @Deprecated
    public DescribeHyperNodeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHyperNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeHyperNodeResponseBodyNodesDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DOWNLINK_PACKET</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>d-bp1564bcc2306uui4zpk</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeHyperNodeResponseBodyNodesDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeHyperNodeResponseBodyNodesDisks self = new DescribeHyperNodeResponseBodyNodesDisks();
            return TeaModel.build(map, self);
        }

        public DescribeHyperNodeResponseBodyNodesDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeHyperNodeResponseBodyNodesDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeHyperNodeResponseBodyNodesDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeHyperNodeResponseBodyNodesDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeHyperNodeResponseBodyNodesDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeHyperNodeResponseBodyNodesNetworks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <strong>example:</strong>
         * <p>192.168.22.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeHyperNodeResponseBodyNodesNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeHyperNodeResponseBodyNodesNetworks self = new DescribeHyperNodeResponseBodyNodesNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeHyperNodeResponseBodyNodesNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public DescribeHyperNodeResponseBodyNodesNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeHyperNodeResponseBodyNodes extends TeaModel {
        @NameInMap("Disks")
        public java.util.List<DescribeHyperNodeResponseBodyNodesDisks> disks;

        /**
         * <strong>example:</strong>
         * <p>457db5ca-241d-11ed-9fd7-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>i190297201669099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>Alinux3_x86_gu8xf_P_Host_D3_C7E3_550.127_Legacy_N_241230</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Networks")
        public DescribeHyperNodeResponseBodyNodesNetworks networks;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr0b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>Using</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        @Deprecated
        public String status;

        /**
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttttest.sh</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static DescribeHyperNodeResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeHyperNodeResponseBodyNodes self = new DescribeHyperNodeResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeHyperNodeResponseBodyNodes setDisks(java.util.List<DescribeHyperNodeResponseBodyNodesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeHyperNodeResponseBodyNodesDisks> getDisks() {
            return this.disks;
        }

        public DescribeHyperNodeResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeHyperNodeResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeHyperNodeResponseBodyNodes setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeHyperNodeResponseBodyNodes setNetworks(DescribeHyperNodeResponseBodyNodesNetworks networks) {
            this.networks = networks;
            return this;
        }
        public DescribeHyperNodeResponseBodyNodesNetworks getNetworks() {
            return this.networks;
        }

        public DescribeHyperNodeResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeHyperNodeResponseBodyNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        @Deprecated
        public DescribeHyperNodeResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHyperNodeResponseBodyNodes setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
