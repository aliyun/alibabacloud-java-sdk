// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchDatasetDocumentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SearchDatasetDocumentsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchDatasetDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDatasetDocumentsResponseBody self = new SearchDatasetDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDatasetDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchDatasetDocumentsResponseBody setData(SearchDatasetDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchDatasetDocumentsResponseBodyData getData() {
        return this.data;
    }

    public SearchDatasetDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchDatasetDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchDatasetDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDatasetDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos extends TeaModel {
        @NameInMap("Chunk")
        public String chunk;

        @NameInMap("Score")
        public Double score;

        public static SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos self = new SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos();
            return TeaModel.build(map, self);
        }

        public SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos setChunk(String chunk) {
            this.chunk = chunk;
            return this;
        }
        public String getChunk() {
            return this.chunk;
        }

        public SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class SearchDatasetDocumentsResponseBodyDataDocuments extends TeaModel {
        @NameInMap("CategoryUuid")
        public String categoryUuid;

        @NameInMap("Chunk")
        public String chunk;

        @NameInMap("ChunkInfos")
        public java.util.List<SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos> chunkInfos;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>用户指定的文档唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        @NameInMap("DocType")
        public String docType;

        /**
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        @NameInMap("Extend1")
        public String extend1;

        @NameInMap("Extend2")
        public String extend2;

        @NameInMap("Extend3")
        public String extend3;

        /**
         * <strong>example:</strong>
         * <p>2024-12-09 17:09:40</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Score")
        public Double score;

        @NameInMap("SearchSource")
        public String searchSource;

        @NameInMap("SearchSourceName")
        public String searchSourceName;

        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("SourceFrom")
        public String sourceFrom;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static SearchDatasetDocumentsResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            SearchDatasetDocumentsResponseBodyDataDocuments self = new SearchDatasetDocumentsResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setChunk(String chunk) {
            this.chunk = chunk;
            return this;
        }
        public String getChunk() {
            return this.chunk;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setChunkInfos(java.util.List<SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos> chunkInfos) {
            this.chunkInfos = chunkInfos;
            return this;
        }
        public java.util.List<SearchDatasetDocumentsResponseBodyDataDocumentsChunkInfos> getChunkInfos() {
            return this.chunkInfos;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setSourceFrom(String sourceFrom) {
            this.sourceFrom = sourceFrom;
            return this;
        }
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchDatasetDocumentsResponseBodyDataDocuments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SearchDatasetDocumentsResponseBodyData extends TeaModel {
        @NameInMap("Documents")
        public java.util.List<SearchDatasetDocumentsResponseBodyDataDocuments> documents;

        public static SearchDatasetDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchDatasetDocumentsResponseBodyData self = new SearchDatasetDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchDatasetDocumentsResponseBodyData setDocuments(java.util.List<SearchDatasetDocumentsResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<SearchDatasetDocumentsResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

    }

}
