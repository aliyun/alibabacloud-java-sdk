// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ApproveOrderRequest extends TeaModel {
    /**
     * <p>The action that you want to perform on the ticket. Valid values:</p>
     * <br>
     * <p>*   AGREE: approve</p>
     * <p>*   CANCEL: cancel</p>
     * <p>*   REJECT: reject</p>
     */
    @NameInMap("ApprovalType")
    public String approvalType;

    /**
     * <p>The description of the ticket.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the approval process. You can call the [GetOrderBaseInfo](~~144642~~) operation to obtain the ID of the approval process.</p>
     */
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static ApproveOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOrderRequest self = new ApproveOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApproveOrderRequest setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public ApproveOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ApproveOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ApproveOrderRequest setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
