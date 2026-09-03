// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial due to a permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;AuthAction&quot;:&quot;milvusknowledgebase:SearchKnowledgeBase&quot;}</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The return message.</p>
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
     * <p>The number of entries per page.</p>
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
     * <p>Indicates whether the request was successful.</p>
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
         * <p>The bottom boundary.</p>
         * 
         * <strong>example:</strong>
         * <p>364</p>
         */
        @NameInMap("bottom")
        public Integer bottom;

        /**
         * <p>The left boundary.</p>
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
         * <p>The right boundary.</p>
         * 
         * <strong>example:</strong>
         * <p>566</p>
         */
        @NameInMap("right")
        public Integer right;

        /**
         * <p>The top boundary.</p>
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
         * <p>The segment text.</p>
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
         * <p>The knowledge base ID.</p>
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
         * <p>The end time of the audio or video chunk in the original media, in milliseconds. This field is not returned for non-media chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>8400</p>
         */
        @NameInMap("mediaEndMs")
        public Long mediaEndMs;

        /**
         * <p>The start time of the audio or video chunk in the original media, in milliseconds. This field is not returned for non-media chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
        @NameInMap("mediaStartMs")
        public Long mediaStartMs;

        /**
         * <p>The time ranges of sentence-level or paragraph-level content within the chunk in the original media. This field is not returned for non-audio chunks.</p>
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
         * <p>The scalar columns of the structured knowledge base. The columns are returned by their original column names and are not used in retrieval.</p>
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
         * <p>The list of labels.</p>
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
