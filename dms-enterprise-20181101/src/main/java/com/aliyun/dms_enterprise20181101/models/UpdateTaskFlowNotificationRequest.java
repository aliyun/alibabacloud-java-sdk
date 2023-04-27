// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNotificationRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable notifications for successful task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagNotificationFail")
    public Boolean dagNotificationFail;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateTaskFlowNotification**.</p>
     */
    @NameInMap("DagNotificationSla")
    public Boolean dagNotificationSla;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("DagNotificationSuccess")
    public Boolean dagNotificationSuccess;

    /**
     * <p>Specifies whether to enable notifications for failed task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
     */
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
