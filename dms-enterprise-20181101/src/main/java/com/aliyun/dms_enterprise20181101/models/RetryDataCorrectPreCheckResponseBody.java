// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RetryDataCorrectPreCheckResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The operation that you want to perform. Set the value to **RetryDataCorrectPreCheck**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RetryDataCorrectPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryDataCorrectPreCheckResponseBody self = new RetryDataCorrectPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryDataCorrectPreCheckResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RetryDataCorrectPreCheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RetryDataCorrectPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryDataCorrectPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
