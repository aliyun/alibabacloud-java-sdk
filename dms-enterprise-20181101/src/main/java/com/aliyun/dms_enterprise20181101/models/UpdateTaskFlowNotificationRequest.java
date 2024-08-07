// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowNotificationRequest extends TeaModel {
    /**
     * <p>The unique ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>Specifies whether to enable notifications for failed task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DagNotificationFail")
    public Boolean dagNotificationFail;

    /**
     * <p>Specifies whether to enable SLA global notifications for task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DagNotificationSla")
    public Boolean dagNotificationSla;

    /**
     * <p>Specifies whether to enable notifications for successful task flows. Notifications are disabled by default. You can enable notifications based on your business requirements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DagNotificationSuccess")
    public Boolean dagNotificationSuccess;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
