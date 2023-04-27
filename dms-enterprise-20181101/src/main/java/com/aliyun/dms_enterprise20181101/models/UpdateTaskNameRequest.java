// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskNameRequest extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The name of the node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node name.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskNameRequest self = new UpdateTaskNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskNameRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskNameRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public UpdateTaskNameRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
