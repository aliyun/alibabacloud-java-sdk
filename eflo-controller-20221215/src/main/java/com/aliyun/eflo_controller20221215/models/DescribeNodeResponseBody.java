// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i116913051662373010974</p>
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
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-30T03:35:53Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The disks.</p>
     */
    @NameInMap("Disks")
    public java.util.List<DescribeNodeResponseBodyDisks> disks;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-23T16:00:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>Indicates whether file storage mounting is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>31d38530-241e-11ed-bc63-acde48001122</p>
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
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i190297201634099844192</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Centos7.9_all_0811</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The network information.</p>
     */
    @NameInMap("Networks")
    public java.util.List<DescribeNodeResponseBodyNetworks> networks;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The node group name.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-default</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Extending</li>
     * <li>UnusedNodeStopped</li>
     * <li>UnusedNodeStopping</li>
     * <li>Unused</li>
     * <li>Using</li>
     * <li>ReleaseLocking</li>
     * <li>Operating</li>
     * <li>Cutting</li>
     * <li>ClusterNodeStopped</li>
     * <li>UnusedNodeRecovering</li>
     * <li>ClusterNodeStopping</li>
     * <li>ClusterNodeRecovering</li>
     * <li>Replacing</li>
     * </ul>
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
     * <p>AC4F0004-7BCE-52E0-891B-CAC7D64E3368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmywpvugkh7kq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The serial number of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>sag42ckf4jx</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <p>The custom script.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash
     * uptime
     * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
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

    public DescribeNodeResponseBody setDisks(java.util.List<DescribeNodeResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<DescribeNodeResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public DescribeNodeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeNodeResponseBody setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public DescribeNodeResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeNodeResponseBody setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public DescribeNodeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeNodeResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
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

    public DescribeNodeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNodeResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public DescribeNodeResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public DescribeNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeNodeResponseBodyDisks extends TeaModel {
        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li>cloud_essd</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1fi88ryk4yah8a6yos</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The performance level of the ESSD that is used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeNodeResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeResponseBodyDisks self = new DescribeNodeResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeNodeResponseBodyDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeNodeResponseBodyDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeNodeResponseBodyDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeNodeResponseBodyDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeNodeResponseBodyDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeNodeResponseBodyNetworks extends TeaModel {
        /**
         * <p>The port information of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>47.254.235.44</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf68v51fldm5egmui5a6k</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The ID of the cluster network.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xcuhjyrj</p>
         */
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
