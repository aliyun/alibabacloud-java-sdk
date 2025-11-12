// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupResponseBody extends TeaModel {
    @NameInMap("Az")
    public String az;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("LoginType")
    public String loginType;

    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("NodeCount")
    public String nodeCount;

    @NameInMap("NodeGroupDescription")
    public String nodeGroupDescription;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemDisk")
    public DescribeNodeGroupResponseBodySystemDisk systemDisk;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserData")
    public String userData;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

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
