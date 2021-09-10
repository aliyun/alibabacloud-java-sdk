// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderResponseBody extends TeaModel {
    @NameInMap("ApproveSuccess")
    public Boolean approveSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static ApprovePermissionApplyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApprovePermissionApplyOrderResponseBody self = new ApprovePermissionApplyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ApprovePermissionApplyOrderResponseBody setApproveSuccess(Boolean approveSuccess) {
        this.approveSuccess = approveSuccess;
        return this;
    }
    public Boolean getApproveSuccess() {
        return this.approveSuccess;
    }

    public ApprovePermissionApplyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
