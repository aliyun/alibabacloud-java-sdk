// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowCooperatorsShrinkRequest extends TeaModel {
    @NameInMap("CooperatorIds")
    public String cooperatorIdsShrink;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowCooperatorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowCooperatorsShrinkRequest self = new UpdateTaskFlowCooperatorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowCooperatorsShrinkRequest setCooperatorIdsShrink(String cooperatorIdsShrink) {
        this.cooperatorIdsShrink = cooperatorIdsShrink;
        return this;
    }
    public String getCooperatorIdsShrink() {
        return this.cooperatorIdsShrink;
    }

    public UpdateTaskFlowCooperatorsShrinkRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowCooperatorsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
