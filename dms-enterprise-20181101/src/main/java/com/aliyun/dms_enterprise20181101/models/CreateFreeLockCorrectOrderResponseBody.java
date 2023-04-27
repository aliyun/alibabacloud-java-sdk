// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    public java.util.List<Long> createOrderResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The execution mode of the ticket after the ticket is approved. Valid values:</p>
     * <br>
     * <p>*   **COMMITOR**: The data change is performed by the user who submits the ticket.</p>
     * <p>*   **AUTO**: The data change is automatically performed after the ticket is approved.</p>
     * <p>*   **LAST_AUDITOR**: The data change is performed by the last approver of the ticket.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reason for the data change.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateFreeLockCorrectOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderResponseBody self = new CreateFreeLockCorrectOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderResponseBody setCreateOrderResult(java.util.List<Long> createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public java.util.List<Long> getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateFreeLockCorrectOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateFreeLockCorrectOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateFreeLockCorrectOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFreeLockCorrectOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
