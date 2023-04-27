// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowEdgesShrinkRequest extends TeaModel {
    /**
     * <p>$.parameters[3].schema.example</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>$.parameters[3].schema.enumValueTitles</p>
     */
    @NameInMap("Edges")
    public String edgesShrink;

    /**
     * <p>$.parameters[3].schema.description</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowEdgesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowEdgesShrinkRequest self = new UpdateTaskFlowEdgesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowEdgesShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowEdgesShrinkRequest setEdgesShrink(String edgesShrink) {
        this.edgesShrink = edgesShrink;
        return this;
    }
    public String getEdgesShrink() {
        return this.edgesShrink;
    }

    public UpdateTaskFlowEdgesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
