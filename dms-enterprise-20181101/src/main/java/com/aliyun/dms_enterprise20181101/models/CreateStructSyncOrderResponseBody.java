// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStructSyncOrderResponseBody extends TeaModel {
    /**
     * <p>The result of creating the ticket.</p>
     */
    @NameInMap("CreateOrderResult")
    public java.util.List<Long> createOrderResult;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStructSyncOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStructSyncOrderResponseBody self = new CreateStructSyncOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStructSyncOrderResponseBody setCreateOrderResult(java.util.List<Long> createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public java.util.List<Long> getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateStructSyncOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateStructSyncOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStructSyncOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStructSyncOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
