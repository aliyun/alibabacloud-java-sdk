// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ApproveOrderRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    @NameInMap("ApprovalType")
    public String approvalType;

    @NameInMap("Comment")
    public String comment;

    public static ApproveOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOrderRequest self = new ApproveOrderRequest();
        return TeaModel.build(map, self);
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

}
