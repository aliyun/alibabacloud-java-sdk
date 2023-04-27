// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RefundPayAsYouGoOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Unsubscribes from a pay-as-you-go Data Management (DMS) resource.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RefundPayAsYouGoOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundPayAsYouGoOrderResponseBody self = new RefundPayAsYouGoOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundPayAsYouGoOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefundPayAsYouGoOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RefundPayAsYouGoOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundPayAsYouGoOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
