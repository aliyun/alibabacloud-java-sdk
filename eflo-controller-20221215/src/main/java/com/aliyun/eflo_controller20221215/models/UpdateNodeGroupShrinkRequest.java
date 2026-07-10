// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether file storage mounting is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The default image ID of the node group. If this parameter is not specified, the image remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>i1232142432432</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The key pair name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The logon password of the machines in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>密码</p>
     */
    @NameInMap("LoginPassword")
    public String loginPassword;

    /**
     * <p>The node group name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-update</p>
     */
    @NameInMap("NewNodeGroupName")
    public String newNodeGroupName;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i120021051733814190732</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The RAM role name of the node. You can call the RAM API ListRoles to query the node RAM roles that you have created. The trusted entity of the role must be set to Lingjun AI Computing Service.
     * Note: Clearing an existing role is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>xianwen-test-ram-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SystemDisk")
    public String systemDiskShrink;

    /**
     * <p>The custom executable shell script. The script must be Base64-encoded. The maximum size of the raw data is 16 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupShrinkRequest self = new UpdateNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupShrinkRequest setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public UpdateNodeGroupShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateNodeGroupShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UpdateNodeGroupShrinkRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateNodeGroupShrinkRequest setNewNodeGroupName(String newNodeGroupName) {
        this.newNodeGroupName = newNodeGroupName;
        return this;
    }
    public String getNewNodeGroupName() {
        return this.newNodeGroupName;
    }

    public UpdateNodeGroupShrinkRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public UpdateNodeGroupShrinkRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public UpdateNodeGroupShrinkRequest setSystemDiskShrink(String systemDiskShrink) {
        this.systemDiskShrink = systemDiskShrink;
        return this;
    }
    public String getSystemDiskShrink() {
        return this.systemDiskShrink;
    }

    public UpdateNodeGroupShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
