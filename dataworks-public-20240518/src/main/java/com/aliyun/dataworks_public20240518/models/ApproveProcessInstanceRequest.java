// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApproveProcessInstanceRequest extends TeaModel {
    /**
     * <p>The approval action. Valid values:</p>
     * <ul>
     * <li><p>Agree: Approved.</p>
     * </li>
     * <li><p>Deny: Rejected.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agree</p>
     */
    @NameInMap("ApprovalAction")
    public String approvalAction;

    /**
     * <p>The approval comment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>同意授权</p>
     */
    @NameInMap("ApprovalComment")
    public String approvalComment;

    /**
     * <p>The idempotency token. We recommend that you use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new authorization expiration time. Unit: milliseconds (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1782541464000</p>
     */
    @NameInMap("NewExpiration")
    public Long newExpiration;

    /**
     * <p>The process instance ID. Both new and legacy Security Center approval forms are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>332066440109224007</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static ApproveProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveProcessInstanceRequest self = new ApproveProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ApproveProcessInstanceRequest setApprovalAction(String approvalAction) {
        this.approvalAction = approvalAction;
        return this;
    }
    public String getApprovalAction() {
        return this.approvalAction;
    }

    public ApproveProcessInstanceRequest setApprovalComment(String approvalComment) {
        this.approvalComment = approvalComment;
        return this;
    }
    public String getApprovalComment() {
        return this.approvalComment;
    }

    public ApproveProcessInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApproveProcessInstanceRequest setNewExpiration(Long newExpiration) {
        this.newExpiration = newExpiration;
        return this;
    }
    public Long getNewExpiration() {
        return this.newExpiration;
    }

    public ApproveProcessInstanceRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
