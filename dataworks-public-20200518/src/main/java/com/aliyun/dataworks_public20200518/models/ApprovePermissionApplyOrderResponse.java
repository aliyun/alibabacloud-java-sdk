// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ApproveSuccess")
    @Validation(required = true)
    public Boolean approveSuccess;

    public static ApprovePermissionApplyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ApprovePermissionApplyOrderResponse self = new ApprovePermissionApplyOrderResponse();
        return TeaModel.build(map, self);
    }

    public ApprovePermissionApplyOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApprovePermissionApplyOrderResponse setApproveSuccess(Boolean approveSuccess) {
        this.approveSuccess = approveSuccess;
        return this;
    }
    public Boolean getApproveSuccess() {
        return this.approveSuccess;
    }

}
