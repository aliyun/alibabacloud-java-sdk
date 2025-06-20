// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ApproveOperationResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F065DDD-6996-5973-9691-9EC57BD0072E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveOperationResponseBody self = new ApproveOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveOperationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ApproveOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
