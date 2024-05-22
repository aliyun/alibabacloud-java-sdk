// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BatchInsertItemsResponseBody extends TeaModel {
    @NameInMap("BatchResults")
    public BatchInsertItemsResponseBodyBatchResults batchResults;

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

    public BatchInsertItemsResponseBody setBatchResults(BatchInsertItemsResponseBodyBatchResults batchResults) {
        this.batchResults = batchResults;
        return this;
    }
    public BatchInsertItemsResponseBodyBatchResults getBatchResults() {
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

    public static class BatchInsertItemsResponseBodyBatchResultsBatchResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static BatchInsertItemsResponseBodyBatchResultsBatchResult build(java.util.Map<String, ?> map) throws Exception {
            BatchInsertItemsResponseBodyBatchResultsBatchResult self = new BatchInsertItemsResponseBodyBatchResultsBatchResult();
            return TeaModel.build(map, self);
        }

        public BatchInsertItemsResponseBodyBatchResultsBatchResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchInsertItemsResponseBodyBatchResultsBatchResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public BatchInsertItemsResponseBodyBatchResultsBatchResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchInsertItemsResponseBodyBatchResultsBatchResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchInsertItemsResponseBodyBatchResults extends TeaModel {
        @NameInMap("BatchResult")
        public java.util.List<BatchInsertItemsResponseBodyBatchResultsBatchResult> batchResult;

        public static BatchInsertItemsResponseBodyBatchResults build(java.util.Map<String, ?> map) throws Exception {
            BatchInsertItemsResponseBodyBatchResults self = new BatchInsertItemsResponseBodyBatchResults();
            return TeaModel.build(map, self);
        }

        public BatchInsertItemsResponseBodyBatchResults setBatchResult(java.util.List<BatchInsertItemsResponseBodyBatchResultsBatchResult> batchResult) {
            this.batchResult = batchResult;
            return this;
        }
        public java.util.List<BatchInsertItemsResponseBodyBatchResultsBatchResult> getBatchResult() {
            return this.batchResult;
        }

    }

}
