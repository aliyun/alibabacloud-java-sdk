// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to mount file storage on nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The ID of the image for the node group. If you omit this parameter, the image remains unchanged.</p>
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
     * <p>The login password for the nodes in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>Password</p>
     */
    @NameInMap("LoginPassword")
    public String loginPassword;

    /**
     * <p>The new name of the node group.</p>
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
     * <p>To query the RAM roles that you have created, call the ListRoles operation in the RAM API. The trust policy for the role must specify Intelligent Computing Lingjun as the trusted entity. Note: You cannot remove a role by clearing this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>xianwen-test-ram-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The user data. This script runs at node startup.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash
     * uptime
     * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
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

    public UpdateNodeGroupRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
