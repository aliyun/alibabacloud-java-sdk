// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-kvw****dn04</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DeleteNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeRequest self = new DeleteNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
