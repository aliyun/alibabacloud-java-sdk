// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderResponseBody extends TeaModel {
    /**
     * <p>The information about the ticket.</p>
     */
    @NameInMap("CreateOrderResult")
    public CreateDatabaseExportOrderResponseBodyCreateOrderResult createOrderResult;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
