// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskNameRequest extends TeaModel {
    /**
     * <p>The ID of the node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node name.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
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
