// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowCooperatorsRequest extends TeaModel {
    @NameInMap("CooperatorIds")
    public java.util.List<String> cooperatorIds;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowCooperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowCooperatorsRequest self = new UpdateTaskFlowCooperatorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowCooperatorsRequest setCooperatorIds(java.util.List<String> cooperatorIds) {
        this.cooperatorIds = cooperatorIds;
        return this;
    }
    public java.util.List<String> getCooperatorIds() {
        return this.cooperatorIds;
    }

    public UpdateTaskFlowCooperatorsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowCooperatorsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
