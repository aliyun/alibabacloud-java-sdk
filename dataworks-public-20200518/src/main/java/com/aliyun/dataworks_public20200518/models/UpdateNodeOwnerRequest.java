// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerRequest extends TeaModel {
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("UserId")
    public String userId;

    public static UpdateNodeOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOwnerRequest self = new UpdateNodeOwnerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOwnerRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public UpdateNodeOwnerRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateNodeOwnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
