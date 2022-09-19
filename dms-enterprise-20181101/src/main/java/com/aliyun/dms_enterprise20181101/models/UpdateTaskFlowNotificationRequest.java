// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNotificationRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("DagNotificationFail")
    public Boolean dagNotificationFail;

    @NameInMap("DagNotificationSla")
    public Boolean dagNotificationSla;

    @NameInMap("DagNotificationSuccess")
    public Boolean dagNotificationSuccess;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowNotificationRequest self = new UpdateTaskFlowNotificationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowNotificationRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowNotificationRequest setDagNotificationFail(Boolean dagNotificationFail) {
        this.dagNotificationFail = dagNotificationFail;
        return this;
    }
    public Boolean getDagNotificationFail() {
        return this.dagNotificationFail;
    }

    public UpdateTaskFlowNotificationRequest setDagNotificationSla(Boolean dagNotificationSla) {
        this.dagNotificationSla = dagNotificationSla;
        return this;
    }
    public Boolean getDagNotificationSla() {
        return this.dagNotificationSla;
    }

    public UpdateTaskFlowNotificationRequest setDagNotificationSuccess(Boolean dagNotificationSuccess) {
        this.dagNotificationSuccess = dagNotificationSuccess;
        return this;
    }
    public Boolean getDagNotificationSuccess() {
        return this.dagNotificationSuccess;
    }

    public UpdateTaskFlowNotificationRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
