// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("CreateOrderResult")
    public java.util.List<Long> createOrderResult;

    public static CreateDataCronClearOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderResponseBody self = new CreateDataCronClearOrderResponseBody();
        return TeaModel.build(map, self);
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

    public CreateDataCronClearOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataCronClearOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataCronClearOrderResponseBody setCreateOrderResult(java.util.List<Long> createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public java.util.List<Long> getCreateOrderResult() {
        return this.createOrderResult;
    }

}
