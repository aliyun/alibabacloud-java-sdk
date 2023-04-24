// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    public CreateDatabaseExportOrderResponseBodyCreateOrderResult createOrderResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDatabaseExportOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseExportOrderResponseBody self = new CreateDatabaseExportOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseExportOrderResponseBody setCreateOrderResult(CreateDatabaseExportOrderResponseBodyCreateOrderResult createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public CreateDatabaseExportOrderResponseBodyCreateOrderResult getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateDatabaseExportOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDatabaseExportOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDatabaseExportOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatabaseExportOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDatabaseExportOrderResponseBodyCreateOrderResult extends TeaModel {
        @NameInMap("CreateOrderResult")
        public java.util.List<Long> createOrderResult;

        public static CreateDatabaseExportOrderResponseBodyCreateOrderResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDatabaseExportOrderResponseBodyCreateOrderResult self = new CreateDatabaseExportOrderResponseBodyCreateOrderResult();
            return TeaModel.build(map, self);
        }

        public CreateDatabaseExportOrderResponseBodyCreateOrderResult setCreateOrderResult(java.util.List<Long> createOrderResult) {
            this.createOrderResult = createOrderResult;
            return this;
        }
        public java.util.List<Long> getCreateOrderResult() {
            return this.createOrderResult;
        }

    }

}
