// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether file storage mounting is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The default image ID of the node group. If you do not specify this parameter, the image ID remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>i1232142432432</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The logon password for the machines in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("LoginPassword")
    public String loginPassword;

    /**
     * <p>The name of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>test-update</p>
     */
    @NameInMap("NewNodeGroupName")
    public String newNodeGroupName;

    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>i120021051733814190732</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The name of the RAM role for the node. You can call the ListRoles API operation of RAM to query the RAM roles that you have created. The trusted entity of the role must be Lingjun AI Computing Service. <warning>Submitting an empty string &quot;&quot; clears the RAM role of the node group.</warning></p>
     * 
     * <strong>example:</strong>
     * <p>xianwen-test-ram-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The system cloud disk configuration.</p>
     */
    @NameInMap("SystemDisk")
    public UpdateNodeGroupRequestSystemDisk systemDisk;

    /**
     * <p>The custom executable shell script. It must be Base64-encoded, and the maximum size of the raw data is 16 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupRequest self = new UpdateNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupRequest setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public UpdateNodeGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateNodeGroupRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UpdateNodeGroupRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateNodeGroupRequest setNewNodeGroupName(String newNodeGroupName) {
        this.newNodeGroupName = newNodeGroupName;
        return this;
    }
    public String getNewNodeGroupName() {
        return this.newNodeGroupName;
    }

    public UpdateNodeGroupRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateNodeGroupRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public UpdateNodeGroupRequest setSystemDisk(UpdateNodeGroupRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public UpdateNodeGroupRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public UpdateNodeGroupRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class UpdateNodeGroupRequestSystemDisk extends TeaModel {
        /**
         * <p>The performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static UpdateNodeGroupRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodeGroupRequestSystemDisk self = new UpdateNodeGroupRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public UpdateNodeGroupRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

}
