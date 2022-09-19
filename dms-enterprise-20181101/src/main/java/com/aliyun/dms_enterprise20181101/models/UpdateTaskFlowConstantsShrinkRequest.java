// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsShrinkRequest extends TeaModel {
    @NameInMap("DagConstants")
    public String dagConstantsShrink;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowConstantsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowConstantsShrinkRequest self = new UpdateTaskFlowConstantsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowConstantsShrinkRequest setDagConstantsShrink(String dagConstantsShrink) {
        this.dagConstantsShrink = dagConstantsShrink;
        return this;
    }
    public String getDagConstantsShrink() {
        return this.dagConstantsShrink;
    }

    public UpdateTaskFlowConstantsShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowConstantsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
