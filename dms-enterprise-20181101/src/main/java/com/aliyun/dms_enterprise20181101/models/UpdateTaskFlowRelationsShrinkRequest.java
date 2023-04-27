// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowRelationsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The list of task flow edges to be updated.</p>
     */
    @NameInMap("Edges")
    public String edgesShrink;

    /**
     * <p>The ID of the task flow edge.</p>
     */
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
