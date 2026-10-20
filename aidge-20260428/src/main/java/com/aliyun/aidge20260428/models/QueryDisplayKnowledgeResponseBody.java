// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryDisplayKnowledgeResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result of the display knowledge base content.</p>
     */
    @NameInMap("Data")
    public QueryDisplayKnowledgeResponseBodyData data;

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

    public static QueryDisplayKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDisplayKnowledgeResponseBody self = new QueryDisplayKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDisplayKnowledgeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDisplayKnowledgeResponseBody setData(QueryDisplayKnowledgeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDisplayKnowledgeResponseBodyData getData() {
        return this.data;
    }

    public QueryDisplayKnowledgeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDisplayKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDisplayKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDisplayKnowledgeResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The description of the failure cause. This parameter is returned only when the status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>Image is inaccessible</p>
         */
        @NameInMap("FailureMessage")
        public String failureMessage;

        /**
         * <p>The code of the failure cause. This parameter is returned only when the status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>Image is inaccessible</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01T15:53:46Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The 24-hour signed URL of the transferred image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/2190149752-0-cib.jpg">https://xxx/2190149752-0-cib.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The expiration time of the signed URL.</p>
         * 
         * <strong>example:</strong>
         * <p>Date</p>
         */
        @NameInMap("ImageUrlExpireTime")
        public String imageUrlExpireTime;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4410879640480000</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>SKU ID</p>
         * 
         * <strong>example:</strong>
         * <p>sku-001</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <p>The SKU name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product side image</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        /**
         * <p>The record status.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATING - Updating
         * EMBEDDED - Vectorization completed
         * FAILED - Processing failed</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryDisplayKnowledgeResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryDisplayKnowledgeResponseBodyDataRecords self = new QueryDisplayKnowledgeResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setFailureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            return this;
        }
        public String getFailureMessage() {
            return this.failureMessage;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setImageUrlExpireTime(String imageUrlExpireTime) {
            this.imageUrlExpireTime = imageUrlExpireTime;
            return this;
        }
        public String getImageUrlExpireTime() {
            return this.imageUrlExpireTime;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryDisplayKnowledgeResponseBodyDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryDisplayKnowledgeResponseBodyData extends TeaModel {
        /**
         * <p>The business error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
         * <p>The knowledge base status.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE - Available</p>
         */
        @NameInMap("KnowledgeBaseStatus")
        public String knowledgeBaseStatus;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rag_xxx</p>
         */
        @NameInMap("RagId")
        public String ragId;

        /**
         * <p>The records on the current page.</p>
         */
        @NameInMap("Records")
        public java.util.List<QueryDisplayKnowledgeResponseBodyDataRecords> records;

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
         * <p>a8323ada-a196-9061-976f-90e38b27323a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalPage")
        public Integer totalPage;

        /**
         * <p>The usage information. This parameter is empty for free API operations.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static QueryDisplayKnowledgeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDisplayKnowledgeResponseBodyData self = new QueryDisplayKnowledgeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDisplayKnowledgeResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryDisplayKnowledgeResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryDisplayKnowledgeResponseBodyData setKnowledgeBaseStatus(String knowledgeBaseStatus) {
            this.knowledgeBaseStatus = knowledgeBaseStatus;
            return this;
        }
        public String getKnowledgeBaseStatus() {
            return this.knowledgeBaseStatus;
        }

        public QueryDisplayKnowledgeResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryDisplayKnowledgeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDisplayKnowledgeResponseBodyData setRagId(String ragId) {
            this.ragId = ragId;
            return this;
        }
        public String getRagId() {
            return this.ragId;
        }

        public QueryDisplayKnowledgeResponseBodyData setRecords(java.util.List<QueryDisplayKnowledgeResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryDisplayKnowledgeResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public QueryDisplayKnowledgeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryDisplayKnowledgeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryDisplayKnowledgeResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDisplayKnowledgeResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryDisplayKnowledgeResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
