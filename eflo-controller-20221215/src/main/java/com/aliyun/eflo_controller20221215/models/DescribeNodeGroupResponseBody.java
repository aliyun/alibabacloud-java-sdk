// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupResponseBody extends TeaModel {
    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
    @NameInMap("Az")
    public String az;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>i111987311754895199538</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-basic-cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-07T17:19:42.980000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether file storage can be mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i190720111752146430748</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Alinux3_x86_5.10.134-16.3_NV_RunC_D3_E3C7_570.133.20_V1.0_250428</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-key</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>Valid values:
     * • password: The node group supports only password-based logon.
     * • keypair: The node group supports only key pair-based logon.
     * • both: The node group supports password-based and key pair-based logon.</p>
     * <p>If this parameter is not returned, no logon method is configured for the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("LoginType")
    public String loginType;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg2.NH2cn</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NodeCount")
    public String nodeCount;

    /**
     * <p>The description of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>lingjun alinux node group</p>
     */
    @NameInMap("NodeGroupDescription")
    public String nodeGroupDescription;

    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>i120982301752461697971</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The name of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ack</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The name of the RAM role. You can call the ListRoles operation of the RAM API to query the RAM roles that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>xianwen-test-ram-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83896080-59E3-5775-BDDC-8084691C3D96</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The system disk information.</p>
     */
    @NameInMap("SystemDisk")
    public DescribeNodeGroupResponseBodySystemDisk systemDisk;

    /**
     * <p>The time when the node group was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-20T11:18:11.164000</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The user data.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash
     * uptime
     * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/tttest.sh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>Indicates whether the node group supports GPU virtualization.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("VirtualGpuEnabled")
    public Boolean virtualGpuEnabled;

    public static DescribeNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupResponseBody self = new DescribeNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupResponseBody setAz(String az) {
        this.az = az;
        return this;
    }
    public String getAz() {
        return this.az;
    }

    public DescribeNodeGroupResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNodeGroupResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeNodeGroupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeNodeGroupResponseBody setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public DescribeNodeGroupResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeNodeGroupResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeNodeGroupResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeNodeGroupResponseBody setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public DescribeNodeGroupResponseBody setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public DescribeNodeGroupResponseBody setNodeCount(String nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public String getNodeCount() {
        return this.nodeCount;
    }

    public DescribeNodeGroupResponseBody setNodeGroupDescription(String nodeGroupDescription) {
        this.nodeGroupDescription = nodeGroupDescription;
        return this;
    }
    public String getNodeGroupDescription() {
        return this.nodeGroupDescription;
    }

    public DescribeNodeGroupResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeNodeGroupResponseBody setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public DescribeNodeGroupResponseBody setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DescribeNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeGroupResponseBody setSystemDisk(DescribeNodeGroupResponseBodySystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribeNodeGroupResponseBodySystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribeNodeGroupResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeNodeGroupResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public DescribeNodeGroupResponseBody setVirtualGpuEnabled(Boolean virtualGpuEnabled) {
        this.virtualGpuEnabled = virtualGpuEnabled;
        return this;
    }
    public Boolean getVirtualGpuEnabled() {
        return this.virtualGpuEnabled;
    }

    public static class DescribeNodeGroupResponseBodySystemDisk extends TeaModel {
        /**
         * <p>The category of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic disk: 20–500.</p>
         * </li>
         * <li><p>ESSD:</p>
         * <ul>
         * <li><p>PL0: 1–2,048.</p>
         * </li>
         * <li><p>PL1: 20–2,048.</p>
         * </li>
         * <li><p>PL2: 461–2,048.</p>
         * </li>
         * <li><p>PL3: 1,261–2,048.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk: 1–2,048.</p>
         * </li>
         * <li><p>Other disk categories: 20–2,048.</p>
         * </li>
         * </ul>
         * <p>Default value: the larger value between 20 and the size of the image that is specified by <code>ImageId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeNodeGroupResponseBodySystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupResponseBodySystemDisk self = new DescribeNodeGroupResponseBodySystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupResponseBodySystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeNodeGroupResponseBodySystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeNodeGroupResponseBodySystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
