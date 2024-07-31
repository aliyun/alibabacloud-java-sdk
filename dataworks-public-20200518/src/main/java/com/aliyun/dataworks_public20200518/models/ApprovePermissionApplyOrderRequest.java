// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The action for the permission request order. Valid values:</p>
     * <ul>
     * <li>1: approve</li>
     * <li>2: reject</li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li>0</li>
     * <li>1</li>
     * <li>2\.</li>
     * <li>3\.</li>
     * <li>4</li>
     * <li>5</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApproveAction")
    public Integer approveAction;

    /**
     * <p>The comment on the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("ApproveComment")
    public String approveComment;

    /**
     * <p>The ID of the permission request order. You can call the ListPermissionApplyOrders operation to obtain the order ID.</p>
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
