// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-update</p>
     */
    @NameInMap("NewNodeGroupName")
    public String newNodeGroupName;

    /**
     * <strong>example:</strong>
     * <p>i120021051733814190732</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("UserData")
    public String userData;

    public static UpdateNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupRequest self = new UpdateNodeGroupRequest();
        return TeaModel.build(map, self);
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
