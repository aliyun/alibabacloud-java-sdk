// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteTaskRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
