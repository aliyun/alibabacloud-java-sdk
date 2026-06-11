// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseStatsResponseBody extends TeaModel {
    /**
     * <p>The object that contains the knowledge base statistics.</p>
     */
    @NameInMap("Data")
    public DescribeKnowledgeBaseStatsResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Permission denied.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Knowledge base limit exceeded. Current: xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique ID of the request. Use this ID to troubleshoot errors.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. A value of <code>true</code> indicates success, and a value of <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeKnowledgeBaseStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseStatsResponseBody self = new DescribeKnowledgeBaseStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseStatsResponseBody setData(DescribeKnowledgeBaseStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeKnowledgeBaseStatsResponseBodyData getData() {
        return this.data;
    }

    public DescribeKnowledgeBaseStatsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeKnowledgeBaseStatsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeKnowledgeBaseStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeKnowledgeBaseStatsResponseBodyData extends TeaModel {
        /**
         * <p>The number of documents in the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DocumentCount")
        public Integer documentCount;

        /**
         * <p>The number of hits for the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("KbHits")
        public Long kbHits;

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        @NameInMap("KbUuid")
        public String kbUuid;

        /**
         * <p>The total number of knowledge chunks in the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalChunkCount")
        public Integer totalChunkCount;

        /**
         * <p>The total size of all files in the knowledge base, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4194588751</p>
         */
        @NameInMap("TotalFileSize")
        public Long totalFileSize;

        public static DescribeKnowledgeBaseStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseStatsResponseBodyData self = new DescribeKnowledgeBaseStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseStatsResponseBodyData setDocumentCount(Integer documentCount) {
            this.documentCount = documentCount;
            return this;
        }
        public Integer getDocumentCount() {
            return this.documentCount;
        }

        public DescribeKnowledgeBaseStatsResponseBodyData setKbHits(Long kbHits) {
            this.kbHits = kbHits;
            return this;
        }
        public Long getKbHits() {
            return this.kbHits;
        }

        public DescribeKnowledgeBaseStatsResponseBodyData setKbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }
        public String getKbUuid() {
            return this.kbUuid;
        }

        public DescribeKnowledgeBaseStatsResponseBodyData setTotalChunkCount(Integer totalChunkCount) {
            this.totalChunkCount = totalChunkCount;
            return this;
        }
        public Integer getTotalChunkCount() {
            return this.totalChunkCount;
        }

        public DescribeKnowledgeBaseStatsResponseBodyData setTotalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }
        public Long getTotalFileSize() {
            return this.totalFileSize;
        }

    }

}
