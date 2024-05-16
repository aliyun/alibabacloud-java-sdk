// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerRequest extends TeaModel {
    /**
     * <p>The ID of the node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The environment where the node runs. Valid values: DEV and PROD. The value DEV indicates the development environment. The value PROD indicates the production environment.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The Alibaba Cloud account ID of the node owner. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to view the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
