// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BatchInsertItemsResponseBody extends TeaModel {
    @NameInMap("BatchResults")
    public java.util.List<BatchInsertItemsResponseBodyBatchResults> batchResults;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchInsertItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertItemsResponseBody self = new BatchInsertItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchInsertItemsResponseBody setBatchResults(java.util.List<BatchInsertItemsResponseBodyBatchResults> batchResults) {
        this.batchResults = batchResults;
        return this;
    }
    public java.util.List<BatchInsertItemsResponseBodyBatchResults> getBatchResults() {
        return this.batchResults;
    }

    public BatchInsertItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchInsertItemsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public BatchInsertItemsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public BatchInsertItemsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchInsertItemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchInsertItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchInsertItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchInsertItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchInsertItemsResponseBodyBatchResults extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static BatchInsertItemsResponseBodyBatchResults build(java.util.Map<String, ?> map) throws Exception {
            BatchInsertItemsResponseBodyBatchResults self = new BatchInsertItemsResponseBodyBatchResults();
            return TeaModel.build(map, self);
        }

        public BatchInsertItemsResponseBodyBatchResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchInsertItemsResponseBodyBatchResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public BatchInsertItemsResponseBodyBatchResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchInsertItemsResponseBodyBatchResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
