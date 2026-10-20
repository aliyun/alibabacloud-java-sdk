// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DeleteDisplayKnowledgeResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The deletion results for the display knowledge base content.</p>
     */
    @NameInMap("Data")
    public DeleteDisplayKnowledgeResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDisplayKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDisplayKnowledgeResponseBody self = new DeleteDisplayKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDisplayKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDisplayKnowledgeResponseBody setData(DeleteDisplayKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDisplayKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public DeleteDisplayKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDisplayKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDisplayKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteDisplayKnowledgeResponseBodyDataResults extends TeaModel {
        /**
         * <p>The error code for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The index in the original request array.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2746611117</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The SKU ID. This field is empty for deletion results.</p>
         * 
         * <strong>example:</strong>
         * <p>sku-001</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The record status. This field is empty for deletion results.</p>
         * 
         * <strong>example:</strong>
         * <p>Empty for the deletion API</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the deletion is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteDisplayKnowledgeResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteDisplayKnowledgeResponseBodyDataResults self = new DeleteDisplayKnowledgeResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteDisplayKnowledgeResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteDisplayKnowledgeResponseBodyData extends TeaModel {
        /**
         * <p>The number of accepted records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AcceptedCount")
        public Integer acceptedCount;

        /**
         * <p>The business error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The business error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The number of failed records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <p>The status of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING</p>
         */
        @NameInMap("KnowledgeBaseStatus")
        public String knowledgeBaseStatus;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_001</p>
         */
        @NameInMap("RagId")
        public String ragId;

        /**
         * <p>The number of visible records after the deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("RemainingCount")
        public Integer remainingCount;

        /**
         * <p>The processing results for each record.</p>
         */
        @NameInMap("Results")
        public java.util.List<DeleteDisplayKnowledgeResponseBodyDataResults> results;

        /**
         * <p>Indicates whether the business processing is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The asynchronous task ID. This field is empty for synchronous API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information. This field is empty for free API operations.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static DeleteDisplayKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDisplayKnowledgeResponseBodyData self = new DeleteDisplayKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDisplayKnowledgeResponseBodyData setAcceptedCount(Integer acceptedCount) {
            this.acceptedCount = acceptedCount;
            return this;
        }
        public Integer getAcceptedCount() {
            return this.acceptedCount;
        }

        public DeleteDisplayKnowledgeResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteDisplayKnowledgeResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteDisplayKnowledgeResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public DeleteDisplayKnowledgeResponseBodyData setKnowledgeBaseStatus(String knowledgeBaseStatus) {
            this.knowledgeBaseStatus = knowledgeBaseStatus;
            return this;
        }
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        public DeleteDisplayKnowledgeResponseBodyData setRagId(String ragId) {
            this.ragId = ragId;
            return this;
        }
        public String getRagId() {
            return this.ragId;
        }

        public DeleteDisplayKnowledgeResponseBodyData setRemainingCount(Integer remainingCount) {
            this.remainingCount = remainingCount;
            return this;
        }
        public Integer getRemainingCount() {
            return this.remainingCount;
        }

        public DeleteDisplayKnowledgeResponseBodyData setResults(java.util.List<DeleteDisplayKnowledgeResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DeleteDisplayKnowledgeResponseBodyDataResults> getResults() {
            return this.results;
        }

        public DeleteDisplayKnowledgeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteDisplayKnowledgeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DeleteDisplayKnowledgeResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
