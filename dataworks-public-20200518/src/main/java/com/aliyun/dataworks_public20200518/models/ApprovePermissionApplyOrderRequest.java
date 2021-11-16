// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderRequest extends TeaModel {
    @NameInMap("ApproveAction")
    public Integer approveAction;

    @NameInMap("ApproveComment")
    public String approveComment;

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
