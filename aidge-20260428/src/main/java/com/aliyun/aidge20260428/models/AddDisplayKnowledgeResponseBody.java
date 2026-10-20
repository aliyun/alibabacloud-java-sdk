// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AddDisplayKnowledgeResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of adding content to the display knowledge base.</p>
     */
    @NameInMap("Data")
    public AddDisplayKnowledgeResponseBodyData data;

    /**
     * <p>The returned message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
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

    public static AddDisplayKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDisplayKnowledgeResponseBody self = new AddDisplayKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDisplayKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDisplayKnowledgeResponseBody setData(AddDisplayKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDisplayKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public AddDisplayKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDisplayKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDisplayKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDisplayKnowledgeResponseBodyDataResults extends TeaModel {
        /**
         * <p>The failure error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>The deviceName format is incorrect.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The index in the original request array.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>204737029000011</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The effective SKU ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sku-001</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The record status.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING-Updating
         * EMBEDDED-Vectorization completed
         * FAILED-Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the record is accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AddDisplayKnowledgeResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            AddDisplayKnowledgeResponseBodyDataResults self = new AddDisplayKnowledgeResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public AddDisplayKnowledgeResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddDisplayKnowledgeResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class AddDisplayKnowledgeResponseBodyData extends TeaModel {
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
         * <p>The knowledge base status.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING-Updating
         * AVAILABLE-Available
         * UNAVAILABLE-Unavailable</p>
         */
        @NameInMap("KnowledgeBaseStatus")
        public String knowledgeBaseStatus;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_xxxx</p>
         */
        @NameInMap("RagId")
        public String ragId;

        /**
         * <p>The processing results for each record.</p>
         */
        @NameInMap("Results")
        public java.util.List<AddDisplayKnowledgeResponseBodyDataResults> results;

        /**
         * <p>Indicates whether the business processing is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The asynchronous task ID. This parameter is empty for synchronous API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>0ea3b66e88a543658520c994f08896a0</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information. This parameter is empty for free API operations.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static AddDisplayKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDisplayKnowledgeResponseBodyData self = new AddDisplayKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDisplayKnowledgeResponseBodyData setAcceptedCount(Integer acceptedCount) {
            this.acceptedCount = acceptedCount;
            return this;
        }
        public Integer getAcceptedCount() {
            return this.acceptedCount;
        }

        public AddDisplayKnowledgeResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddDisplayKnowledgeResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddDisplayKnowledgeResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public AddDisplayKnowledgeResponseBodyData setKnowledgeBaseStatus(String knowledgeBaseStatus) {
            this.knowledgeBaseStatus = knowledgeBaseStatus;
            return this;
        }
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        public AddDisplayKnowledgeResponseBodyData setRagId(String ragId) {
            this.ragId = ragId;
            return this;
        }
        public String getRagId() {
            return this.ragId;
        }

        public AddDisplayKnowledgeResponseBodyData setResults(java.util.List<AddDisplayKnowledgeResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<AddDisplayKnowledgeResponseBodyDataResults> getResults() {
            return this.results;
        }

        public AddDisplayKnowledgeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddDisplayKnowledgeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public AddDisplayKnowledgeResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
