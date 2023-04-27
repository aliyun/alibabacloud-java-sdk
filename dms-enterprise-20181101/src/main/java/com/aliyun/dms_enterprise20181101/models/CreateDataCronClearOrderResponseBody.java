// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    public java.util.List<Long> createOrderResult;

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
     * <p>Specifies whether to specify an end time for the task. Valid values:</p>
     * <br>
     * <p>*   **true**: specifies an end time for the task. The task is automatically suspended after this end time.</p>
     * <p>*   **false**: does not specify an end time for the task. The task is stopped after the historical data is cleared.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataCronClearOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderResponseBody self = new CreateDataCronClearOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataCronClearOrderResponseBody setCreateOrderResult(java.util.List<Long> createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public java.util.List<Long> getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateDataCronClearOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataCronClearOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataCronClearOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataCronClearOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
