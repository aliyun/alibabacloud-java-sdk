// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNodeGroupRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the node group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i118191731740041623425</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The configurations of the node group.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroup")
    public CreateNodeGroupRequestNodeGroup nodeGroup;

    /**
     * <p>The configuration of the node unit.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;NodeUnitId\&quot;:\&quot;3c2999a8-2b95-4409-93c5-ad3985fc5c9f\&quot;,\&quot;ResourceGroupId\&quot;:\&quot;\&quot;,\&quot;MaxNodes\&quot;:0,\&quot;NodeUnitName\&quot;:\&quot;asi_cn-serverless-sale_e01-lingjun-psale\&quot;}</p>
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
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li><code>cloud_essd</code>: ESSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clou_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the ESSD system disk. Valid values:</p>
         * <ul>
         * <li><p><code>PL0</code>: A single disk delivers up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p><code>PL1</code>: A single disk delivers up to 50,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <p>The availability zone of the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("Az")
        public String az;

        /**
         * <p>Specifies whether to enable file system mounting.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <p>The image ID for the nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i191887641687336652616</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the key pair for SSH login.</p>
         * 
         * <strong>example:</strong>
         * <p>test-keypair</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The password to log in to the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>test-LoginPassword</p>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>The machine type for the nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mock-machine-type3</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The description of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>Node group description</p>
         */
        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        /**
         * <p>The name of the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI-LINGJUN</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The name of the RAM role to attach to the nodes. You can call the RAM API <code>ListRoles</code> operation to query the RAM roles that you have created. The trust entity of the specified role must be Intelligent Computing Lingjun.<br><strong>Note:</strong> You cannot detach an existing role by clearing this parameter.<br></p>
         * 
         * <strong>example:</strong>
         * <p>xianwen-test-ram-role</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The system disk configuration for the nodes.</p>
         */
        @NameInMap("SystemDisk")
        public CreateNodeGroupRequestNodeGroupSystemDisk systemDisk;

        /**
         * <p>The user data passed to the nodes at launch.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Specifies whether to enable GPU virtualization.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VirtualGpuEnabled")
        public Boolean virtualGpuEnabled;

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

        public CreateNodeGroupRequestNodeGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
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

        public CreateNodeGroupRequestNodeGroup setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
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

        public CreateNodeGroupRequestNodeGroup setVirtualGpuEnabled(Boolean virtualGpuEnabled) {
            this.virtualGpuEnabled = virtualGpuEnabled;
            return this;
        }
        public Boolean getVirtualGpuEnabled() {
            return this.virtualGpuEnabled;
        }

    }

}
