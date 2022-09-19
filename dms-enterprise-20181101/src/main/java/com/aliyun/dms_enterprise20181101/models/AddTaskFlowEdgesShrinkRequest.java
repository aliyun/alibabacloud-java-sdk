// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddTaskFlowEdgesShrinkRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Edges")
    public String edgesShrink;

    @NameInMap("Tid")
    public Long tid;

    public static AddTaskFlowEdgesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTaskFlowEdgesShrinkRequest self = new AddTaskFlowEdgesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddTaskFlowEdgesShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public AddTaskFlowEdgesShrinkRequest setEdgesShrink(String edgesShrink) {
        this.edgesShrink = edgesShrink;
        return this;
    }
    public String getEdgesShrink() {
        return this.edgesShrink;
    }

    public AddTaskFlowEdgesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
