// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class UpdateDisplayKnowledgeResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update result of the display knowledge base content.</p>
     */
    @NameInMap("Data")
    public UpdateDisplayKnowledgeResponseBodyData data;

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
     * <p>39E8A74B-F99E-1195-A5FF-3ECC5F94F304</p>
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

    public static UpdateDisplayKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisplayKnowledgeResponseBody self = new UpdateDisplayKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDisplayKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDisplayKnowledgeResponseBody setData(UpdateDisplayKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDisplayKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public UpdateDisplayKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDisplayKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDisplayKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDisplayKnowledgeResponseBodyDataResults extends TeaModel {
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
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32238</p>
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
         * <p>UPDATING</p>
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

        public static UpdateDisplayKnowledgeResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisplayKnowledgeResponseBodyDataResults self = new UpdateDisplayKnowledgeResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateDisplayKnowledgeResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateDisplayKnowledgeResponseBodyData extends TeaModel {
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
         * <p>success</p>
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
         * <p>The processing results for each record.</p>
         */
        @NameInMap("Results")
        public java.util.List<UpdateDisplayKnowledgeResponseBodyDataResults> results;

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
         * <p>ed9d8504-6141-9fbb-8345-4fa36433483f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage information. This parameter is empty for free API operations.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static UpdateDisplayKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisplayKnowledgeResponseBodyData self = new UpdateDisplayKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDisplayKnowledgeResponseBodyData setAcceptedCount(Integer acceptedCount) {
            this.acceptedCount = acceptedCount;
            return this;
        }
        public Integer getAcceptedCount() {
            return this.acceptedCount;
        }

        public UpdateDisplayKnowledgeResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateDisplayKnowledgeResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateDisplayKnowledgeResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public UpdateDisplayKnowledgeResponseBodyData setKnowledgeBaseStatus(String knowledgeBaseStatus) {
            this.knowledgeBaseStatus = knowledgeBaseStatus;
            return this;
        }
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        public UpdateDisplayKnowledgeResponseBodyData setRagId(String ragId) {
            this.ragId = ragId;
            return this;
        }
        public String getRagId() {
            return this.ragId;
        }

        public UpdateDisplayKnowledgeResponseBodyData setResults(java.util.List<UpdateDisplayKnowledgeResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<UpdateDisplayKnowledgeResponseBodyDataResults> getResults() {
            return this.results;
        }

        public UpdateDisplayKnowledgeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateDisplayKnowledgeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateDisplayKnowledgeResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
