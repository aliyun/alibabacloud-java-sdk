// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteNodeGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i114444141733395242745</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>i121824791737080429819</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static DeleteNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeGroupRequest self = new DeleteNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodeGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodeGroupRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
