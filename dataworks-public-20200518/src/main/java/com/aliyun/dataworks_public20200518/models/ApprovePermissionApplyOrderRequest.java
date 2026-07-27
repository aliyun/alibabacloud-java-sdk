// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The approval action to perform. Valid values:</p>
     * <ul>
     * <li>1: Approve.</li>
     * <li>2: Reject.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApproveAction")
    public Integer approveAction;

    /**
     * <p>The remarks for the approval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("ApproveComment")
    public String approveComment;

    /**
     * <p>The ID of the permission request order to approve. You can call the <a href="https://help.aliyun.com/document_detail/211008.html">ListPermissionApplyOrders</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>48f36729-05f9-4a40-9286-933fd940f30a</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static ApprovePermissionApplyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApprovePermissionApplyOrderRequest self = new ApprovePermissionApplyOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApprovePermissionApplyOrderRequest setApproveAction(Integer approveAction) {
        this.approveAction = approveAction;
        return this;
    }
    public Integer getApproveAction() {
        return this.approveAction;
    }

    public ApprovePermissionApplyOrderRequest setApproveComment(String approveComment) {
        this.approveComment = approveComment;
        return this;
    }
    public String getApproveComment() {
        return this.approveComment;
    }

    public ApprovePermissionApplyOrderRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
