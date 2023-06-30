// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowTimeVariablesRequest extends TeaModel {
    /**
     * <p>The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The time variables for the task flow.</p>
     */
    @NameInMap("TimeVariables")
    public String timeVariables;

    public static UpdateTaskFlowTimeVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowTimeVariablesRequest self = new UpdateTaskFlowTimeVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowTimeVariablesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowTimeVariablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskFlowTimeVariablesRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
