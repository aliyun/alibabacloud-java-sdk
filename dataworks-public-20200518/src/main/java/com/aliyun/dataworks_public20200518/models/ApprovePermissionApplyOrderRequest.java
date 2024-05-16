// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The approval action. Valid values:</p>
     * <br>
     * <p>*   1: Approve the permission request order.</p>
     * <p>*   2: Reject the permission request order.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApproveAction")
    public Integer approveAction;

    /**
     * <p>The comment on the approval.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApproveComment")
    public String approveComment;

    /**
     * <p>The ID of the permission request order. You can call the ListPermissionApplyOrders operation to obtain the order ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
