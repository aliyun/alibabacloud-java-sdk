// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowOwnerRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("NewOwnerId")
    public String newOwnerId;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowOwnerRequest self = new UpdateTaskFlowOwnerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowOwnerRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowOwnerRequest setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
        return this;
    }
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    public UpdateTaskFlowOwnerRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
