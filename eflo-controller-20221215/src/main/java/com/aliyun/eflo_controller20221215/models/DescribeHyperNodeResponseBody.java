// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeHyperNodeResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The time when the hyper node was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-30T02:00:00.852Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2125-06-24T16:52:44.318000</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether file storage mounting is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>alywlcb-lingjun-gpu-0025</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The cluster number.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The ID of the hyper node.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("HyperNodeId")
    public String hyperNodeId;

    /**
     * <p>The machine type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The name of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>lisan-nodegroup</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<DescribeHyperNodeResponseBodyNodes> nodes;

    /**
     * <p>The state of the hyper node.</p>
     * 
     * <strong>example:</strong>
     * <p>Using</p>
     */
    @NameInMap("OperatingState")
    public String operatingState;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6058705-1C45-35C9-9461-02504897D4D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxno4vh5****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>Operating</p>
     */
    @NameInMap("Status")
    @Deprecated
    public String status;

    /**
     * <p>The zone ID.</p>
     * 
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
         * <p>The packet classification. Valid values:</p>
         * <ul>
         * <li><p><strong>DOWNLINK_PACKET</strong>: downlink packet</p>
         * </li>
         * <li><p><strong>UPLINK_PACKET</strong>: uplink packet</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOWNLINK_PACKET</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1564bcc2306uui4zpk</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>When you create an enhanced SSD (ESSD) to use as a system disk, set the performance level of the disk. Valid values:</p>
         * <ul>
         * <li><p>PL0: A maximum of 10,000 random read/write input/output operations per second (IOPS) per disk.</p>
         * </li>
         * <li><p>PL1: A maximum of 50,000 random read/write IOPS per disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li><p>system: system disk.</p>
         * </li>
         * <li><p>data: data disk.</p>
         * </li>
         * </ul>
         * 
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
         * <p>The name of the network interface on the machine.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <p>The IP address of the machine in the virtual private cloud (VPC).</p>
         * 
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
        /**
         * <p>The disk information.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeHyperNodeResponseBodyNodesDisks> disks;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>457db5ca-241d-11ed-9fd7-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201669099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alinux3_x86_gu8xf_P_Host_D3_C7E3_550.127_Legacy_N_241230</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The network information.</p>
         */
        @NameInMap("Networks")
        public DescribeHyperNodeResponseBodyNodesNetworks networks;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr0b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The state of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Using</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <p>The state.</p>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        @Deprecated
        public String status;

        /**
         * <p>The user-defined script.</p>
         * 
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
