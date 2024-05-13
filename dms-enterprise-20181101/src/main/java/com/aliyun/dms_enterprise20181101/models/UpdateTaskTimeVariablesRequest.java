// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskTimeVariablesRequest extends TeaModel {
    /**
     * <p>The ID of the task node. You can call the [GetTaskInstanceRelation](https://help.aliyun.com/document_detail/424711.html) operation to query the node ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The time variables configured for the node. The value of this parameter must be a JSON string.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeVariables")
    public String timeVariables;

    public static UpdateTaskTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskTimeVariablesRequest self = new UpdateTaskTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskTimeVariablesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskTimeVariablesRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
