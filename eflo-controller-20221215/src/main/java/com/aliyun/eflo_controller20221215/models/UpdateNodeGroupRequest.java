// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupRequest extends TeaModel {
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-key</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>Node group name</p>
     * 
     * <strong>example:</strong>
     * <p>test-update</p>
     */
    @NameInMap("NewNodeGroupName")
    public String newNodeGroupName;

    /**
     * <p>Node group ID</p>
     * 
     * <strong>example:</strong>
     * <p>i120021051733814190732</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

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

    public UpdateNodeGroupRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
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

    public UpdateNodeGroupRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
