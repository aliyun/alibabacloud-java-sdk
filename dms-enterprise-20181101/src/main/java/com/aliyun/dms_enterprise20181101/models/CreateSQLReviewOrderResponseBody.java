// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateSQLReviewOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    public java.util.List<Long> createOrderResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSQLReviewOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLReviewOrderResponseBody self = new CreateSQLReviewOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSQLReviewOrderResponseBody setCreateOrderResult(java.util.List<Long> createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public java.util.List<Long> getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateSQLReviewOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateSQLReviewOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateSQLReviewOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSQLReviewOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
