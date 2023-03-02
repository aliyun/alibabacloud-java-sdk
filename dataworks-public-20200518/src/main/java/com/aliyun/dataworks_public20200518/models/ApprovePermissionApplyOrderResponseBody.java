// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ApprovePermissionApplyOrderResponseBody extends TeaModel {
    /**
     * <p>Indicates that the approval is successful.</p>
     */
    @NameInMap("ApproveSuccess")
    public Boolean approveSuccess;

    /**
     * <p>The ID of the request.</p>
     */
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
