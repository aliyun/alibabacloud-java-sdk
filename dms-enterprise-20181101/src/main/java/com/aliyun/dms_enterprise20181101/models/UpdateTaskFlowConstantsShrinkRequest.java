// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsShrinkRequest extends TeaModel {
    /**
     * <p>The key value of a constant for the task flow.</p>
     */
    @NameInMap("DagConstants")
    public String dagConstantsShrink;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The constants for the task flow.</p>
     */
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
