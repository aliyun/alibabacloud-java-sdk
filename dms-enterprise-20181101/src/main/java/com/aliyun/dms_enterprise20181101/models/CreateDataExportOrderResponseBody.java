// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    public CreateDataExportOrderResponseBodyCreateOrderResult createOrderResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDataExportOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderResponseBody self = new CreateDataExportOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderResponseBody setCreateOrderResult(CreateDataExportOrderResponseBodyCreateOrderResult createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public CreateDataExportOrderResponseBodyCreateOrderResult getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateDataExportOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataExportOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataExportOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataExportOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataExportOrderResponseBodyCreateOrderResult extends TeaModel {
        @NameInMap("CreateOrderResult")
        public java.util.List<Long> createOrderResult;

        public static CreateDataExportOrderResponseBodyCreateOrderResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataExportOrderResponseBodyCreateOrderResult self = new CreateDataExportOrderResponseBodyCreateOrderResult();
            return TeaModel.build(map, self);
        }

        public CreateDataExportOrderResponseBodyCreateOrderResult setCreateOrderResult(java.util.List<Long> createOrderResult) {
            this.createOrderResult = createOrderResult;
            return this;
        }
        public java.util.List<Long> getCreateOrderResult() {
            return this.createOrderResult;
        }

    }

}
