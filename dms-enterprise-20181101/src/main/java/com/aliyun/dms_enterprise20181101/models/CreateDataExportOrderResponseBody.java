// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderResponseBody extends TeaModel {
    /**
     * <p>The content of the ticket.</p>
     */
    @NameInMap("CreateOrderResult")
    public CreateDataExportOrderResponseBodyCreateOrderResult createOrderResult;

    /**
     * <p>The error code.</p>
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
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
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
