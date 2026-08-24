// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The list of document IDs.</p>
     */
    @NameInMap("documentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>Specifies whether to enable the knowledge graph.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableKnowledgeGraph")
    public Boolean enableKnowledgeGraph;

    /**
     * <p>The image retrieval input.</p>
     */
    @NameInMap("image")
    public SearchKnowledgeBaseRequestImage image;

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
     * <p>The query for retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>What is the tax amount on the invoice?</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The rerank model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("rerankModelId")
    public Long rerankModelId;

    /**
     * <p>The name of the rerank model that the tenant has activated. If both rerankModelName and rerankModelId are specified, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("rerankModelName")
    public String rerankModelName;

    /**
     * <p>The retrieval configuration.</p>
     */
    @NameInMap("retrievalConfig")
    public SearchKnowledgeBaseRequestRetrievalConfig retrievalConfig;

    /**
     * <p>The tag filter.</p>
     */
    @NameInMap("tagFilter")
    public SearchKnowledgeBaseRequestTagFilter tagFilter;

    /**
     * <p>The knowledge base version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    public String version;

    public static SearchKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchKnowledgeBaseRequest self = new SearchKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchKnowledgeBaseRequest setDocumentIds(java.util.List<String> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    public SearchKnowledgeBaseRequest setEnableKnowledgeGraph(Boolean enableKnowledgeGraph) {
        this.enableKnowledgeGraph = enableKnowledgeGraph;
        return this;
    }
    public Boolean getEnableKnowledgeGraph() {
        return this.enableKnowledgeGraph;
    }

    public SearchKnowledgeBaseRequest setImage(SearchKnowledgeBaseRequestImage image) {
        this.image = image;
        return this;
    }
    public SearchKnowledgeBaseRequestImage getImage() {
        return this.image;
    }

    public SearchKnowledgeBaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchKnowledgeBaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchKnowledgeBaseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchKnowledgeBaseRequest setRerankModelId(Long rerankModelId) {
        this.rerankModelId = rerankModelId;
        return this;
    }
    public Long getRerankModelId() {
        return this.rerankModelId;
    }

    public SearchKnowledgeBaseRequest setRerankModelName(String rerankModelName) {
        this.rerankModelName = rerankModelName;
        return this;
    }
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    public SearchKnowledgeBaseRequest setRetrievalConfig(SearchKnowledgeBaseRequestRetrievalConfig retrievalConfig) {
        this.retrievalConfig = retrievalConfig;
        return this;
    }
    public SearchKnowledgeBaseRequestRetrievalConfig getRetrievalConfig() {
        return this.retrievalConfig;
    }

    public SearchKnowledgeBaseRequest setTagFilter(SearchKnowledgeBaseRequestTagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public SearchKnowledgeBaseRequestTagFilter getTagFilter() {
        return this.tagFilter;
    }

    public SearchKnowledgeBaseRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class SearchKnowledgeBaseRequestImage extends TeaModel {
        /**
         * <p>The Base64-encoded image.</p>
         * 
         * <strong>example:</strong>
         * <p>data:image/png;base64,iVBORw0KGgoAAA...</p>
         */
        @NameInMap("base64")
        public String base64;

        /**
         * <p>The object key of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>uploaded/invoice.png</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/invoice.png">https://example.com/invoice.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static SearchKnowledgeBaseRequestImage build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseRequestImage self = new SearchKnowledgeBaseRequestImage();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseRequestImage setBase64(String base64) {
            this.base64 = base64;
            return this;
        }
        public String getBase64() {
            return this.base64;
        }

        public SearchKnowledgeBaseRequestImage setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public SearchKnowledgeBaseRequestImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SearchKnowledgeBaseRequestRetrievalConfig extends TeaModel {
        /**
         * <p>The number of candidate results to recall.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("candidateCount")
        public Integer candidateCount;

        /**
         * <p>Specifies whether to enable query expansion.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableQueryExpansion")
        public Boolean enableQueryExpansion;

        /**
         * <p>The minimum relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("minScore")
        public Float minScore;

        /**
         * <p>The weight of semantic relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("semanticWeight")
        public Float semanticWeight;

        /**
         * <p>The list of translation languages.</p>
         */
        @NameInMap("translationLanguages")
        public java.util.List<String> translationLanguages;

        public static SearchKnowledgeBaseRequestRetrievalConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseRequestRetrievalConfig self = new SearchKnowledgeBaseRequestRetrievalConfig();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseRequestRetrievalConfig setCandidateCount(Integer candidateCount) {
            this.candidateCount = candidateCount;
            return this;
        }
        public Integer getCandidateCount() {
            return this.candidateCount;
        }

        public SearchKnowledgeBaseRequestRetrievalConfig setEnableQueryExpansion(Boolean enableQueryExpansion) {
            this.enableQueryExpansion = enableQueryExpansion;
            return this;
        }
        public Boolean getEnableQueryExpansion() {
            return this.enableQueryExpansion;
        }

        public SearchKnowledgeBaseRequestRetrievalConfig setMinScore(Float minScore) {
            this.minScore = minScore;
            return this;
        }
        public Float getMinScore() {
            return this.minScore;
        }

        public SearchKnowledgeBaseRequestRetrievalConfig setSemanticWeight(Float semanticWeight) {
            this.semanticWeight = semanticWeight;
            return this;
        }
        public Float getSemanticWeight() {
            return this.semanticWeight;
        }

        public SearchKnowledgeBaseRequestRetrievalConfig setTranslationLanguages(java.util.List<String> translationLanguages) {
            this.translationLanguages = translationLanguages;
            return this;
        }
        public java.util.List<String> getTranslationLanguages() {
            return this.translationLanguages;
        }

    }

    public static class SearchKnowledgeBaseRequestTagFilterConditions extends TeaModel {
        /**
         * <p>The tag field.</p>
         * 
         * <strong>example:</strong>
         * <p>category</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>invoice</p>
         */
        @NameInMap("value")
        public Object value;

        public static SearchKnowledgeBaseRequestTagFilterConditions build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseRequestTagFilterConditions self = new SearchKnowledgeBaseRequestTagFilterConditions();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseRequestTagFilterConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SearchKnowledgeBaseRequestTagFilterConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public SearchKnowledgeBaseRequestTagFilterConditions setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class SearchKnowledgeBaseRequestTagFilter extends TeaModel {
        /**
         * <p>The list of tag conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<SearchKnowledgeBaseRequestTagFilterConditions> conditions;

        /**
         * <p>The logical relation between conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        @NameInMap("relation")
        public String relation;

        public static SearchKnowledgeBaseRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseRequestTagFilter self = new SearchKnowledgeBaseRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseRequestTagFilter setConditions(java.util.List<SearchKnowledgeBaseRequestTagFilterConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<SearchKnowledgeBaseRequestTagFilterConditions> getConditions() {
            return this.conditions;
        }

        public SearchKnowledgeBaseRequestTagFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

}
