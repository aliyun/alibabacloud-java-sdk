// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ApproveOrderRequest extends TeaModel {
    /**
     * <p>If ApprovalType is set to ADD_APPROVAL_NODE, you need to specify this parameter. The ID of the user that is added as the new approval node. This node must be a user-defined approval node. You can call the ListUserDefineWorkFlowNodes operation to obtain the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApprovalNodeId")
    public Long approvalNodeId;

    /**
     * <p>If ApprovalType is set to ADD_APPROVAL_NODE, you need to specify this parameter. The position of the new approval node. Valid values:</p>
     * <ul>
     * <li><strong>PRE_ADD_APPROVAL_NODE</strong>: before the current approval node.</li>
     * <li><strong>POST_ADD_APPROVAL_NODE</strong>: after the current approval node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POST_ADD_APPROVAL_NODE</p>
     */
    @NameInMap("ApprovalNodePos")
    public String approvalNodePos;

    /**
     * <p>The action that you want to perform on the ticket. Valid values:</p>
     * <ul>
     * <li><strong>AGREE</strong></li>
     * <li><strong>CANCEL</strong></li>
     * <li><strong>REJECT</strong></li>
     * <li><strong>TRANSFER</strong></li>
     * <li><strong>ADD_APPROVAL_NODE</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("ApprovalType")
    public String approvalType;

    /**
     * <p>The description of the ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the user to which the ticket is transferred. If ApprovalType is set to TRANSFER, you need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>12***</p>
     */
    @NameInMap("NewApprover")
    public Long newApprover;

    @NameInMap("NewApproverList")
    public String newApproverList;

    /**
     * <p>The ID of the user that transfers the ticket to another user. The default value is the ID of the current user. If the current user is an administrator or a database administrator (DBA), the user can change the value of this parameter to the ID of another user.</p>
     * 
     * <strong>example:</strong>
     * <p>23***</p>
     */
    @NameInMap("OldApprover")
    public Long oldApprover;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the approval process. You can call the <a href="https://help.aliyun.com/document_detail/144642.html">GetOrderBaseInfo</a> operation to obtain the ID of the approval process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static ApproveOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOrderRequest self = new ApproveOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApproveOrderRequest setApprovalNodeId(Long approvalNodeId) {
        this.approvalNodeId = approvalNodeId;
        return this;
    }
    public Long getApprovalNodeId() {
        return this.approvalNodeId;
    }

    public ApproveOrderRequest setApprovalNodePos(String approvalNodePos) {
        this.approvalNodePos = approvalNodePos;
        return this;
    }
    public String getApprovalNodePos() {
        return this.approvalNodePos;
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

    public ApproveOrderRequest setNewApprover(Long newApprover) {
        this.newApprover = newApprover;
        return this;
    }
    public Long getNewApprover() {
        return this.newApprover;
    }

    public ApproveOrderRequest setNewApproverList(String newApproverList) {
        this.newApproverList = newApproverList;
        return this;
    }
    public String getNewApproverList() {
        return this.newApproverList;
    }

    public ApproveOrderRequest setOldApprover(Long oldApprover) {
        this.oldApprover = oldApprover;
        return this;
    }
    public Long getOldApprover() {
        return this.oldApprover;
    }

    public ApproveOrderRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
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
