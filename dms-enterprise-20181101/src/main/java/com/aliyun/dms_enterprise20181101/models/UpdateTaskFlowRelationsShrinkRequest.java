// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowRelationsShrinkRequest extends TeaModel {
    // The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
    @NameInMap("DagId")
    public Long dagId;

    // The list of task flow edges to be updated.
    @NameInMap("Edges")
    public String edgesShrink;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowRelationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowRelationsShrinkRequest self = new UpdateTaskFlowRelationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowRelationsShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowRelationsShrinkRequest setEdgesShrink(String edgesShrink) {
        this.edgesShrink = edgesShrink;
        return this;
    }
    public String getEdgesShrink() {
        return this.edgesShrink;
    }

    public UpdateTaskFlowRelationsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
