// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ProcessApprovalRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
     */
    @NameInMap("ApplicationSheetId")
    public String applicationSheetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approve</p>
     */
    @NameInMap("ApprovalAction")
    public String approvalAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApprovalComments")
    public String approvalComments;

    public static ProcessApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessApprovalRequest self = new ProcessApprovalRequest();
        return TeaModel.build(map, self);
    }

    public ProcessApprovalRequest setApplicationSheetId(String applicationSheetId) {
        this.applicationSheetId = applicationSheetId;
        return this;
    }
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

    public ProcessApprovalRequest setApprovalAction(String approvalAction) {
        this.approvalAction = approvalAction;
        return this;
    }
    public String getApprovalAction() {
        return this.approvalAction;
    }

    public ProcessApprovalRequest setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

}
