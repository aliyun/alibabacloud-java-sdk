// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The data catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListCatalogs to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. Updates the default chunking strategy of the knowledge base. The update takes effect only for documents uploaded after the update. Existing documents are not re-chunked. If this parameter is not specified, the configuration remains unchanged.</p>
     */
    @NameInMap("ChunkConfiguration")
    public UpdateKnowledgeBaseRequestChunkConfiguration chunkConfiguration;

    /**
     * <p>The description of the knowledge base to update. If this parameter is not specified, the description remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Product documentation knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace. The name is specified during creation and cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-knowledge-base</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The namespace to which the knowledge base belongs. The namespace must belong to the specified data catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies a knowledge base. You can call ListNamespaces to obtain the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. Updates the default search configuration at the knowledge base level. The update takes effect immediately for subsequent search requests. If this parameter is not specified, the configuration remains unchanged.</p>
     */
    @NameInMap("SearchConfiguration")
    public UpdateKnowledgeBaseRequestSearchConfiguration searchConfiguration;

    public static UpdateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseRequest self = new UpdateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public UpdateKnowledgeBaseRequest setChunkConfiguration(UpdateKnowledgeBaseRequestChunkConfiguration chunkConfiguration) {
        this.chunkConfiguration = chunkConfiguration;
        return this;
    }
    public UpdateKnowledgeBaseRequestChunkConfiguration getChunkConfiguration() {
        return this.chunkConfiguration;
    }

    public UpdateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public UpdateKnowledgeBaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateKnowledgeBaseRequest setSearchConfiguration(UpdateKnowledgeBaseRequestSearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
        return this;
    }
    public UpdateKnowledgeBaseRequestSearchConfiguration getSearchConfiguration() {
        return this.searchConfiguration;
    }

    public static class UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules extends TeaModel {
        /**
         * <p>Specifies whether to remove URLs and email addresses during parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemoveUrlsAndEmails")
        public Boolean removeUrlsAndEmails;

        /**
         * <p>Specifies whether to replace consecutive whitespace characters (spaces, line breaks, and tab characters) with a single space.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReplaceConsecutiveWhitespace")
        public Boolean replaceConsecutiveWhitespace;

        public static UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules self = new UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules setRemoveUrlsAndEmails(Boolean removeUrlsAndEmails) {
            this.removeUrlsAndEmails = removeUrlsAndEmails;
            return this;
        }
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        public UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules setReplaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
            this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
            return this;
        }
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

    }

    public static class UpdateKnowledgeBaseRequestChunkConfiguration extends TeaModel {
        /**
         * <p>Required for the BY_HEADING strategy. Valid values: 1 to 6. This parameter is ignored for other strategies. Headings at or above the specified level are used as split boundaries. For example, if you set this parameter to 2, both H1 and H2 headings are used as split boundaries. Deeper-level headings are not used for splitting and are retained in the chunk body. If the content within a section exceeds MaxChunkSize, the content is split by paragraph or sentence as a fallback. Documents without headings fall back to intelligent chunking.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadingLevel")
        public Integer headingLevel;

        /**
         * <p>The maximum token length of a single chunk.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxChunkSize")
        public Integer maxChunkSize;

        /**
         * <p>The overlap token length between adjacent chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The preprocessing rules.</p>
         */
        @NameInMap("PreprocessRules")
        public UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules preprocessRules;

        /**
         * <p>The segment identifier for the LINE_BREAK strategy, such as a line feed.</p>
         * 
         * <strong>example:</strong>
         * <p>\\n\\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>The chunking strategy. Valid values:</p>
         * <ul>
         * <li>AUTO: automatic chunking.</li>
         * <li>LINE_BREAK: chunking by segment identifier.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LINE_BREAK</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static UpdateKnowledgeBaseRequestChunkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestChunkConfiguration self = new UpdateKnowledgeBaseRequestChunkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setHeadingLevel(Integer headingLevel) {
            this.headingLevel = headingLevel;
            return this;
        }
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setMaxChunkSize(Integer maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setOverlapSize(Integer overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setPreprocessRules(UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules preprocessRules) {
            this.preprocessRules = preprocessRules;
            return this;
        }
        public UpdateKnowledgeBaseRequestChunkConfigurationPreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

        public UpdateKnowledgeBaseRequestChunkConfiguration setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class UpdateKnowledgeBaseRequestSearchConfiguration extends TeaModel {
        /**
         * <p>The retrieve mode. Valid values:</p>
         * <ul>
         * <li>KEYWORD: keyword retrieve.</li>
         * <li>VECTOR: vector retrieve.</li>
         * <li>HYBRID: hybrid retrieve.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Takes effect only in hybrid search mode. Valid values:</p>
         * <ul>
         * <li>RRF: reciprocal rank fusion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("RankAlgorithm")
        public String rankAlgorithm;

        /**
         * <p>Takes effect only in hybrid search mode. This default value is used when the search request does not specify Rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerankEnabled")
        public Boolean rerankEnabled;

        /**
         * <p>The default reranking model used when the search request does not specify RerankModel. Valid values: qwen3-rerank. Default value: qwen3-rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankModel")
        public String rerankModel;

        /**
         * <p>The parameter k for the RRF fusion algorithm. Default value: 60. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RrfK")
        public Integer rrfK;

        /**
         * <p>The default number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TopK")
        public Integer topK;

        /**
         * <p>The vector path weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword path weight equals 1 minus this value. Default value: 0.7.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("VectorWeight")
        public Double vectorWeight;

        public static UpdateKnowledgeBaseRequestSearchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseRequestSearchConfiguration self = new UpdateKnowledgeBaseRequestSearchConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setRankAlgorithm(String rankAlgorithm) {
            this.rankAlgorithm = rankAlgorithm;
            return this;
        }
        public String getRankAlgorithm() {
            return this.rankAlgorithm;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setRerankEnabled(Boolean rerankEnabled) {
            this.rerankEnabled = rerankEnabled;
            return this;
        }
        public Boolean getRerankEnabled() {
            return this.rerankEnabled;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setRerankModel(String rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public String getRerankModel() {
            return this.rerankModel;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setRrfK(Integer rrfK) {
            this.rrfK = rrfK;
            return this;
        }
        public Integer getRrfK() {
            return this.rrfK;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public UpdateKnowledgeBaseRequestSearchConfiguration setVectorWeight(Double vectorWeight) {
            this.vectorWeight = vectorWeight;
            return this;
        }
        public Double getVectorWeight() {
            return this.vectorWeight;
        }

    }

}
