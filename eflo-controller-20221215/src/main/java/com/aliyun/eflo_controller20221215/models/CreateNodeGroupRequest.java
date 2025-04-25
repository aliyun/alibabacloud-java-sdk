// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNodeGroupRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i118191731740041623425</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Node ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroup")
    public CreateNodeGroupRequestNodeGroup nodeGroup;

    /**
     * <p>Node information</p>
     */
    @NameInMap("NodeUnit")
    public java.util.Map<String, ?> nodeUnit;

    public static CreateNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupRequest self = new CreateNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodeGroupRequest setNodeGroup(CreateNodeGroupRequestNodeGroup nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public CreateNodeGroupRequestNodeGroup getNodeGroup() {
        return this.nodeGroup;
    }

    public CreateNodeGroupRequest setNodeUnit(java.util.Map<String, ?> nodeUnit) {
        this.nodeUnit = nodeUnit;
        return this;
    }
    public java.util.Map<String, ?> getNodeUnit() {
        return this.nodeUnit;
    }

    public static class CreateNodeGroupRequestNodeGroupSystemDisk extends TeaModel {
        /**
         * <p>Disk performance level</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the disk if the disk is an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <p>For information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL!</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>System disk size</p>
         * 
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateNodeGroupRequestNodeGroupSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeGroupRequestNodeGroupSystemDisk self = new CreateNodeGroupRequestNodeGroupSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateNodeGroupRequestNodeGroupSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateNodeGroupRequestNodeGroupSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateNodeGroupRequestNodeGroupSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateNodeGroupRequestNodeGroup extends TeaModel {
        /**
         * <p>Availability Zone</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("Az")
        public String az;

        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <p>Image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i191887641687336652616</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test-keypair</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>Machine type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mock-machine-type3</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Node group description</p>
         * 
         * <strong>example:</strong>
         * <p>describe for node group</p>
         */
        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        /**
         * <p>Node group name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI-LINGJUN</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>SystemDisk</p>
         */
        @NameInMap("SystemDisk")
        public CreateNodeGroupRequestNodeGroupSystemDisk systemDisk;

        /**
         * <p>user data</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static CreateNodeGroupRequestNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeGroupRequestNodeGroup self = new CreateNodeGroupRequestNodeGroup();
            return TeaModel.build(map, self);
        }

        public CreateNodeGroupRequestNodeGroup setAz(String az) {
            this.az = az;
            return this;
        }
        public String getAz() {
            return this.az;
        }

        public CreateNodeGroupRequestNodeGroup setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }
        public Boolean getFileSystemMountEnabled() {
            return this.fileSystemMountEnabled;
        }

        public CreateNodeGroupRequestNodeGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateNodeGroupRequestNodeGroup setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateNodeGroupRequestNodeGroup setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public CreateNodeGroupRequestNodeGroup setNodeGroupDescription(String nodeGroupDescription) {
            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        public CreateNodeGroupRequestNodeGroup setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public CreateNodeGroupRequestNodeGroup setSystemDisk(CreateNodeGroupRequestNodeGroupSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public CreateNodeGroupRequestNodeGroupSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public CreateNodeGroupRequestNodeGroup setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
