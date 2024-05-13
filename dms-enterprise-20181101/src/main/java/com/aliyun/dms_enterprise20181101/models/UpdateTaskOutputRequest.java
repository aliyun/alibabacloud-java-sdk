// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskOutputRequest extends TeaModel {
    /**
     * <p>The ID of the node. You can call the [GetTaskInstanceRelation](https://help.aliyun.com/document_detail/424711.html) operation to query the node ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The output variables for the task.</p>
     */
    @NameInMap("NodeOutput")
    public String nodeOutput;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskOutputRequest self = new UpdateTaskOutputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskOutputRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskOutputRequest setNodeOutput(String nodeOutput) {
        this.nodeOutput = nodeOutput;
        return this;
    }
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    public UpdateTaskOutputRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
