// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderRequest extends TeaModel {
    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    @NameInMap("ApproveComment")
    @Validation(required = true)
    public String approveComment;

    @NameInMap("ApproveAction")
    @Validation(required = true)
    public Integer approveAction;

    public static ApprovePermissionApplyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApprovePermissionApplyOrderRequest self = new ApprovePermissionApplyOrderRequest();
        return TeaModel.build(map, self);
    }

    public ApprovePermissionApplyOrderRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApprovePermissionApplyOrderRequest setApproveComment(String approveComment) {
        this.approveComment = approveComment;
        return this;
    }
    public String getApproveComment() {
        return this.approveComment;
    }

    public ApprovePermissionApplyOrderRequest setApproveAction(Integer approveAction) {
        this.approveAction = approveAction;
        return this;
    }
    public Integer getApproveAction() {
        return this.approveAction;
    }

}
