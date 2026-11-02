// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;AuthAction&quot;:&quot;milvusknowledgebase:SearchKnowledgeBase&quot;}</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>Optional. Conditionally returned. Required when includeWiki is set to true. The cursor for the next page of evidence. Null for the last page. Not used for legacy results pagination. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:4096}.</p>
     * 
     * <strong>example:</strong>
     * <p>example-opaque-next-token</p>
     */
    @NameInMap("evidenceNextToken")
    public String evidenceNextToken;

    /**
     * <p>Optional. Conditionally returned. Returned only when includeWiki is set to true. The current page of unified and merged evidence. Constraints: {&quot;minItems&quot;:0,&quot;maxItems&quot;:100}.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evidenceId&quot;:&quot;wiki_section_page_1_sec_1_rev_7&quot;,&quot;kind&quot;:&quot;wiki_section&quot;,&quot;knowledgeBaseId&quot;:&quot;example_kb&quot;,&quot;documentId&quot;:null,&quot;chunkId&quot;:null,&quot;pageId&quot;:&quot;page_1&quot;,&quot;sectionId&quot;:&quot;sec_1&quot;,&quot;entityId&quot;:null,&quot;relationId&quot;:null,&quot;revisionId&quot;:&quot;rev_7&quot;,&quot;batchId&quot;:&quot;batch_7&quot;,&quot;title&quot;:&quot;Warranty instructions&quot;,&quot;content&quot;:&quot;The warranty period for Product A is 18 months.&quot;,&quot;score&quot;:0.62,&quot;sourceRefs&quot;:[{&quot;documentId&quot;:&quot;doc_manual&quot;,&quot;chunkId&quot;:&quot;chunk_1&quot;,&quot;sourceRevisionId&quot;:&quot;source_rev_7&quot;,&quot;version&quot;:&quot;DRAFT&quot;}],&quot;sourceRefCount&quot;:1,&quot;sourceRefsTruncated&quot;:false,&quot;sourceTaskId&quot;:&quot;11111111111111111111111111111111&quot;}]</p>
     */
    @NameInMap("evidenceResults")
    public java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResults> evidenceResults;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query labels.</p>
     */
    @NameInMap("queryLabels")
    public java.util.List<String> queryLabels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FCC42-90DE-56D3-A10D-3C06995DED17</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of retrieval results.</p>
     */
    @NameInMap("results")
    public java.util.List<SearchKnowledgeBaseResponseBodyResults> results;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static SearchKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchKnowledgeBaseResponseBody self = new SearchKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchKnowledgeBaseResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SearchKnowledgeBaseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchKnowledgeBaseResponseBody setEvidenceNextToken(String evidenceNextToken) {
        this.evidenceNextToken = evidenceNextToken;
        return this;
    }
    public String getEvidenceNextToken() {
        return this.evidenceNextToken;
    }

    public SearchKnowledgeBaseResponseBody setEvidenceResults(java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResults> evidenceResults) {
        this.evidenceResults = evidenceResults;
        return this;
    }
    public java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResults> getEvidenceResults() {
        return this.evidenceResults;
    }

    public SearchKnowledgeBaseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchKnowledgeBaseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchKnowledgeBaseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchKnowledgeBaseResponseBody setQueryLabels(java.util.List<String> queryLabels) {
        this.queryLabels = queryLabels;
        return this;
    }
    public java.util.List<String> getQueryLabels() {
        return this.queryLabels;
    }

    public SearchKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchKnowledgeBaseResponseBody setResults(java.util.List<SearchKnowledgeBaseResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SearchKnowledgeBaseResponseBodyResults> getResults() {
        return this.results;
    }

    public SearchKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchKnowledgeBaseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs extends TeaModel {
        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_value</p>
         */
        @NameInMap("chunkId")
        public String chunkId;

        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_value</p>
         */
        @NameInMap("documentId")
        public String documentId;

        /**
         * <p>Optional. Conditionally returned. The document name returned only after authorization. Constraints: {&quot;maxLength&quot;:1024}.</p>
         * 
         * <strong>example:</strong>
         * <p>example_value</p>
         */
        @NameInMap("documentName")
        public String documentName;

        /**
         * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:0,&quot;maximum&quot;:9223372036854775807}.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mediaEndMs")
        public Long mediaEndMs;

        /**
         * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:0,&quot;maximum&quot;:9223372036854775807}.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mediaStartMs")
        public Long mediaStartMs;

        /**
         * <p>Optional. Conditionally returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minimum&quot;:1,&quot;maximum&quot;:9223372036854775807}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_value</p>
         */
        @NameInMap("sourceRevisionId")
        public String sourceRevisionId;

        /**
         * <p>Required. Always returned. The display name of the version. Does not fall back to draft if invalid or unavailable. Constraints: {&quot;maxLength&quot;:64,&quot;pattern&quot;:&quot;^(DRAFT|LATEST_PUBLISHED|v[1-9][0-9]*)$&quot;,&quot;default&quot;:&quot;DRAFT&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("version")
        public String version;

        public static SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs self = new SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setDocumentName(String documentName) {
            this.documentName = documentName;
            return this;
        }
        public String getDocumentName() {
            return this.documentName;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setMediaEndMs(Long mediaEndMs) {
            this.mediaEndMs = mediaEndMs;
            return this;
        }
        public Long getMediaEndMs() {
            return this.mediaEndMs;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setMediaStartMs(Long mediaStartMs) {
            this.mediaStartMs = mediaStartMs;
            return this;
        }
        public Long getMediaStartMs() {
            return this.mediaStartMs;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setSourceRevisionId(String sourceRevisionId) {
            this.sourceRevisionId = sourceRevisionId;
            return this;
        }
        public String getSourceRevisionId() {
            return this.sourceRevisionId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyEvidenceResults extends TeaModel {
        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("batchId")
        public String batchId;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("chunkId")
        public String chunkId;

        /**
         * <p>Required. Always returned. The readable evidence text. Constraints: {&quot;maxLength&quot;:65535}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The warranty period for Product A is 18 months</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("documentId")
        public String documentId;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wiki_section_page_1_sec_1_rev_7</p>
         */
        @NameInMap("evidenceId")
        public String evidenceId;

        /**
         * <p>Required. Always returned. The actual evidence object type. Constraints: {&quot;enum&quot;:[&quot;raw&quot;,&quot;wiki_page&quot;,&quot;wiki_section&quot;,&quot;graph_fact&quot;],&quot;maxLength&quot;:64}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wiki_section</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_kb</p>
         */
        @NameInMap("knowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>page_1</p>
         */
        @NameInMap("pageId")
        public String pageId;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("relationId")
        public String relationId;

        /**
         * <p>Required. Always returned. The opaque business ID generated by the server. Validates ownership and does not accept arbitrary paths. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example_value</p>
         */
        @NameInMap("revisionId")
        public String revisionId;

        /**
         * <p>Required. Always returned. The finite numerical value used for unified ranking. For hybrid, it is the relevance of the existing Dealer.rerank. For rerank, it is the text and model hybrid relevance of the existing Dealer.rerank_by_model, along the semanticWeight and rank feature, which is not a relevance probability. The minScore is applied according to the existing unified scoring rules. Can be null for non-ranking fact evidence. Null is allowed. The not-equal-to condition can be omitted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.62</p>
         */
        @NameInMap("score")
        public Double score;

        /**
         * <p>Required. Always returned. Null is allowed. The semantics of null values follow the field description. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:1,&quot;maxLength&quot;:128,&quot;pattern&quot;:&quot;^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sec_1</p>
         */
        @NameInMap("sectionId")
        public String sectionId;

        /**
         * <p>Required. Always returned. The total number of source chunk references. Authorization is performed on the full set. Constraints: {&quot;minimum&quot;:1,&quot;maximum&quot;:9223372036854775807}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceRefCount")
        public Long sourceRefCount;

        /**
         * <p>Required. Always returned. The actually supported sources. Constraints: {&quot;minItems&quot;:1,&quot;maxItems&quot;:1000}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;documentId&quot;:&quot;doc_manual&quot;,&quot;chunkId&quot;:&quot;chunk_1&quot;,&quot;sourceRevisionId&quot;:&quot;source_rev_7&quot;,&quot;version&quot;:&quot;DRAFT&quot;,&quot;contentHash&quot;:&quot;aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&quot;}]</p>
         */
        @NameInMap("sourceRefs")
        public java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs> sourceRefs;

        /**
         * <p>Required. Always returned. True when a single sourceRefs contains only the first 1000 items. You can paginate and verify by using sourceTaskId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("sourceRefsTruncated")
        public Boolean sourceRefsTruncated;

        /**
         * <p>Required. Always returned. The entry point for complete sources. Must be a non-null locator when sourceRefsTruncated is true. The source operation references held by the artifact or revision remain readable, and archiving task details does not delete this source manifest. Null is allowed. The not-equal-to condition can be omitted. Constraints: {&quot;minLength&quot;:32,&quot;maxLength&quot;:32,&quot;pattern&quot;:&quot;^[0-9a-f]{32}$&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("sourceTaskId")
        public String sourceTaskId;

        /**
         * <p>Required. Always returned. The display title after authorization. Constraints: {&quot;maxLength&quot;:1024}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Warranty instructions</p>
         */
        @NameInMap("title")
        public String title;

        public static SearchKnowledgeBaseResponseBodyEvidenceResults build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyEvidenceResults self = new SearchKnowledgeBaseResponseBodyEvidenceResults();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setEvidenceId(String evidenceId) {
            this.evidenceId = evidenceId;
            return this;
        }
        public String getEvidenceId() {
            return this.evidenceId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setSourceRefCount(Long sourceRefCount) {
            this.sourceRefCount = sourceRefCount;
            return this;
        }
        public Long getSourceRefCount() {
            return this.sourceRefCount;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setSourceRefs(java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs> sourceRefs) {
            this.sourceRefs = sourceRefs;
            return this;
        }
        public java.util.List<SearchKnowledgeBaseResponseBodyEvidenceResultsSourceRefs> getSourceRefs() {
            return this.sourceRefs;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setSourceRefsTruncated(Boolean sourceRefsTruncated) {
            this.sourceRefsTruncated = sourceRefsTruncated;
            return this;
        }
        public Boolean getSourceRefsTruncated() {
            return this.sourceRefsTruncated;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setSourceTaskId(String sourceTaskId) {
            this.sourceTaskId = sourceTaskId;
            return this;
        }
        public String getSourceTaskId() {
            return this.sourceTaskId;
        }

        public SearchKnowledgeBaseResponseBodyEvidenceResults setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyResultsImages extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kd-620ad908ec651-41253795bafd7a1c</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <p>The temporary access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/signed-image">https://example.com/signed-image</a></p>
         */
        @NameInMap("url")
        public String url;

        public static SearchKnowledgeBaseResponseBodyResultsImages build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyResultsImages self = new SearchKnowledgeBaseResponseBodyResultsImages();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyResultsImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public SearchKnowledgeBaseResponseBodyResultsImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyResultsLocations extends TeaModel {
        /**
         * <p>The bottom edge.</p>
         * 
         * <strong>example:</strong>
         * <p>364</p>
         */
        @NameInMap("bottom")
        public Integer bottom;

        /**
         * <p>The left edge.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("left")
        public Integer left;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The right edge.</p>
         * 
         * <strong>example:</strong>
         * <p>566</p>
         */
        @NameInMap("right")
        public Integer right;

        /**
         * <p>The top edge.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("top")
        public Integer top;

        public static SearchKnowledgeBaseResponseBodyResultsLocations build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyResultsLocations self = new SearchKnowledgeBaseResponseBodyResultsLocations();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyResultsLocations setBottom(Integer bottom) {
            this.bottom = bottom;
            return this;
        }
        public Integer getBottom() {
            return this.bottom;
        }

        public SearchKnowledgeBaseResponseBodyResultsLocations setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public SearchKnowledgeBaseResponseBodyResultsLocations setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchKnowledgeBaseResponseBodyResultsLocations setRight(Integer right) {
            this.right = right;
            return this;
        }
        public Integer getRight() {
            return this.right;
        }

        public SearchKnowledgeBaseResponseBodyResultsLocations setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyResultsMediaTimeline extends TeaModel {
        /**
         * <p>The end time of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>4200</p>
         */
        @NameInMap("endMs")
        public Long endMs;

        /**
         * <p>The start time of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
        @NameInMap("startMs")
        public Long startMs;

        /**
         * <p>The text of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>The first sentence</p>
         */
        @NameInMap("text")
        public String text;

        public static SearchKnowledgeBaseResponseBodyResultsMediaTimeline build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyResultsMediaTimeline self = new SearchKnowledgeBaseResponseBodyResultsMediaTimeline();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyResultsMediaTimeline setEndMs(Long endMs) {
            this.endMs = endMs;
            return this;
        }
        public Long getEndMs() {
            return this.endMs;
        }

        public SearchKnowledgeBaseResponseBodyResultsMediaTimeline setStartMs(Long startMs) {
            this.startMs = startMs;
            return this;
        }
        public Long getStartMs() {
            return this.startMs;
        }

        public SearchKnowledgeBaseResponseBodyResultsMediaTimeline setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyResultsScoreDetails extends TeaModel {
        /**
         * <p>The keyword relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0000000014285714</p>
         */
        @NameInMap("keywordScore")
        public Float keywordScore;

        /**
         * <p>The semantic relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5227377</p>
         */
        @NameInMap("semanticScore")
        public Float semanticScore;

        public static SearchKnowledgeBaseResponseBodyResultsScoreDetails build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyResultsScoreDetails self = new SearchKnowledgeBaseResponseBodyResultsScoreDetails();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyResultsScoreDetails setKeywordScore(Float keywordScore) {
            this.keywordScore = keywordScore;
            return this;
        }
        public Float getKeywordScore() {
            return this.keywordScore;
        }

        public SearchKnowledgeBaseResponseBodyResultsScoreDetails setSemanticScore(Float semanticScore) {
            this.semanticScore = semanticScore;
            return this;
        }
        public Float getSemanticScore() {
            return this.semanticScore;
        }

    }

    public static class SearchKnowledgeBaseResponseBodyResults extends TeaModel {
        /**
         * <p>The chunk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7f0de3e041322a1d</p>
         */
        @NameInMap("chunkId")
        public String chunkId;

        /**
         * <p>The chunk content.</p>
         * 
         * <strong>example:</strong>
         * <p>Tax amount 1.59</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>539ddb688fe811f182f637422a0713b5</p>
         */
        @NameInMap("documentId")
        public String documentId;

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>invoice.pdf</p>
         */
        @NameInMap("documentName")
        public String documentName;

        /**
         * <p>The list of associated images.</p>
         */
        @NameInMap("images")
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsImages> images;

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kd-xxxxxxxxxx</p>
         */
        @NameInMap("knowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The list of document locations.</p>
         */
        @NameInMap("locations")
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsLocations> locations;

        /**
         * <p>The end time of the audio or video chunk in the original media, in milliseconds. This parameter is not returned for non-media chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>8400</p>
         */
        @NameInMap("mediaEndMs")
        public Long mediaEndMs;

        /**
         * <p>The start time of the audio or video chunk in the original media, in milliseconds. This parameter is not returned for non-media chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
        @NameInMap("mediaStartMs")
        public Long mediaStartMs;

        /**
         * <p>The time range of each sentence or paragraph within the chunk in the original media. This parameter is not returned for non-audio chunks.</p>
         */
        @NameInMap("mediaTimeline")
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsMediaTimeline> mediaTimeline;

        /**
         * <p>The parent chunk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>parent-chunk-id</p>
         */
        @NameInMap("parentChunkId")
        public String parentChunkId;

        /**
         * <p>The scalar columns of the structured knowledge base. The columns are returned by their original names and are not used for retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;question&quot;:&quot;How do I reset it?&quot;,&quot;category&quot;:&quot;account&quot;}</p>
         */
        @NameInMap("scalarFields")
        public Object scalarFields;

        /**
         * <p>The overall relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.26136884</p>
         */
        @NameInMap("score")
        public Float score;

        /**
         * <p>The relevance score details.</p>
         */
        @NameInMap("scoreDetails")
        public SearchKnowledgeBaseResponseBodyResultsScoreDetails scoreDetails;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        public static SearchKnowledgeBaseResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyResults self = new SearchKnowledgeBaseResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyResults setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public SearchKnowledgeBaseResponseBodyResults setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchKnowledgeBaseResponseBodyResults setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public SearchKnowledgeBaseResponseBodyResults setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public SearchKnowledgeBaseResponseBodyResults setDocumentName(String documentName) {
            this.documentName = documentName;
            return this;
        }
        public String getDocumentName() {
            return this.documentName;
        }

        public SearchKnowledgeBaseResponseBodyResults setImages(java.util.List<SearchKnowledgeBaseResponseBodyResultsImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsImages> getImages() {
            return this.images;
        }

        public SearchKnowledgeBaseResponseBodyResults setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public SearchKnowledgeBaseResponseBodyResults setLocations(java.util.List<SearchKnowledgeBaseResponseBodyResultsLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsLocations> getLocations() {
            return this.locations;
        }

        public SearchKnowledgeBaseResponseBodyResults setMediaEndMs(Long mediaEndMs) {
            this.mediaEndMs = mediaEndMs;
            return this;
        }
        public Long getMediaEndMs() {
            return this.mediaEndMs;
        }

        public SearchKnowledgeBaseResponseBodyResults setMediaStartMs(Long mediaStartMs) {
            this.mediaStartMs = mediaStartMs;
            return this;
        }
        public Long getMediaStartMs() {
            return this.mediaStartMs;
        }

        public SearchKnowledgeBaseResponseBodyResults setMediaTimeline(java.util.List<SearchKnowledgeBaseResponseBodyResultsMediaTimeline> mediaTimeline) {
            this.mediaTimeline = mediaTimeline;
            return this;
        }
        public java.util.List<SearchKnowledgeBaseResponseBodyResultsMediaTimeline> getMediaTimeline() {
            return this.mediaTimeline;
        }

        public SearchKnowledgeBaseResponseBodyResults setParentChunkId(String parentChunkId) {
            this.parentChunkId = parentChunkId;
            return this;
        }
        public String getParentChunkId() {
            return this.parentChunkId;
        }

        public SearchKnowledgeBaseResponseBodyResults setScalarFields(Object scalarFields) {
            this.scalarFields = scalarFields;
            return this;
        }
        public Object getScalarFields() {
            return this.scalarFields;
        }

        public SearchKnowledgeBaseResponseBodyResults setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchKnowledgeBaseResponseBodyResults setScoreDetails(SearchKnowledgeBaseResponseBodyResultsScoreDetails scoreDetails) {
            this.scoreDetails = scoreDetails;
            return this;
        }
        public SearchKnowledgeBaseResponseBodyResultsScoreDetails getScoreDetails() {
            return this.scoreDetails;
        }

        public SearchKnowledgeBaseResponseBodyResults setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
