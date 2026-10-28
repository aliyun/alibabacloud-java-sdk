// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ProcessApprovalRequest extends TeaModel {
    /**
     * <p>The ID of the application form.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
     */
    @NameInMap("ApplicationSheetId")
    public String applicationSheetId;

    /**
     * <p>The approval action. Valid values:</p>
     * <ul>
     * <li>Approve: approved.</li>
     * <li>Reject: rejected.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approve</p>
     */
    @NameInMap("ApprovalAction")
    public String approvalAction;

    /**
     * <p>The approval comments.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>同意</p>
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
