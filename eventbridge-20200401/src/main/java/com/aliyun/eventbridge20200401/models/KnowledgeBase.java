// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class KnowledgeBase extends TeaModel {
    /**
     * <p>The EventHouse data catalog to which the knowledge base belongs. This value cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The default chunking strategy of the knowledge base. This configuration takes effect only for documents uploaded after the configuration is updated. Existing documents are not re-chunked.</p>
     */
    @NameInMap("ChunkConfiguration")
    public KnowledgeBaseChunkConfiguration chunkConfiguration;

    /**
     * <p>The time when the knowledge base was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>Product documentation knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The embedding vector dimension specified during creation or the default dimension of the model. This value cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>The embedding model specified during creation. This value cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>The brief reason for the most recent creation or deletion failure. This parameter is returned only when the status is CREATE_FAILED or DELETE_FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>OssException: BucketAlreadyExists ...</p>
     */
    @NameInMap("FailureReason")
    public String failureReason;

    /**
     * <p>The name of the knowledge base, which is unique within the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>product-docs</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>The metadata fields declared when the knowledge base was created. These fields cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;department&quot;,&quot;Type&quot;:&quot;STRING&quot;}]</p>
     */
    @NameInMap("MetadataSchema")
    public java.util.List<MetadataSchemaField> metadataSchema;

    /**
     * <p>The EventHouse namespace to which the knowledge base belongs. This value cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in a search request. You can modify this configuration by calling the UpdateKnowledgeBase operation.</p>
     */
    @NameInMap("SearchConfiguration")
    public KnowledgeBaseSearchConfiguration searchConfiguration;

    /**
     * <p>The current status of the knowledge base. Valid values:</p>
     * <ul>
     * <li>CREATING: The knowledge base is being created.</li>
     * <li>ACTIVE: The knowledge base is available.</li>
     * <li>CREATE_FAILED: The knowledge base failed to be created.</li>
     * <li>DELETING: The knowledge base is being deleted.</li>
     * <li>DELETE_FAILED: The knowledge base failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the knowledge base was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-24T10:00:00Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static KnowledgeBase build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBase self = new KnowledgeBase();
        return TeaModel.build(map, self);
    }

    public KnowledgeBase setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public KnowledgeBase setChunkConfiguration(KnowledgeBaseChunkConfiguration chunkConfiguration) {
        this.chunkConfiguration = chunkConfiguration;
        return this;
    }
    public KnowledgeBaseChunkConfiguration getChunkConfiguration() {
        return this.chunkConfiguration;
    }

    public KnowledgeBase setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public KnowledgeBase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBase setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public KnowledgeBase setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public KnowledgeBase setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    public String getFailureReason() {
        return this.failureReason;
    }

    public KnowledgeBase setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public KnowledgeBase setMetadataSchema(java.util.List<MetadataSchemaField> metadataSchema) {
        this.metadataSchema = metadataSchema;
        return this;
    }
    public java.util.List<MetadataSchemaField> getMetadataSchema() {
        return this.metadataSchema;
    }

    public KnowledgeBase setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public KnowledgeBase setSearchConfiguration(KnowledgeBaseSearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
        return this;
    }
    public KnowledgeBaseSearchConfiguration getSearchConfiguration() {
        return this.searchConfiguration;
    }

    public KnowledgeBase setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeBase setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static class KnowledgeBaseChunkConfigurationPreprocessRules extends TeaModel {
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

        public static KnowledgeBaseChunkConfigurationPreprocessRules build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseChunkConfigurationPreprocessRules self = new KnowledgeBaseChunkConfigurationPreprocessRules();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseChunkConfigurationPreprocessRules setRemoveUrlsAndEmails(Boolean removeUrlsAndEmails) {
            this.removeUrlsAndEmails = removeUrlsAndEmails;
            return this;
        }
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        public KnowledgeBaseChunkConfigurationPreprocessRules setReplaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
            this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
            return this;
        }
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

    }

    public static class KnowledgeBaseChunkConfiguration extends TeaModel {
        /**
         * <p>The heading level (1 to 6) used for splitting in the BY_HEADING strategy. Headings at or above this level serve as split boundaries. Deeper-level headings are retained in the chunk body.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadingLevel")
        public Integer headingLevel;

        /**
         * <p>The maximum character length of a single chunk. Starting from revision 22, this value is character-based. Valid values: 1 to 6000.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxChunkSize")
        public Integer maxChunkSize;

        /**
         * <p>The overlap character length between adjacent chunks. This parameter takes effect only for the BY_LENGTH strategy. When the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. A value of 0 indicates no overlap.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The preprocessing rules that take effect during document parsing.</p>
         */
        @NameInMap("PreprocessRules")
        public KnowledgeBaseChunkConfigurationPreprocessRules preprocessRules;

        /**
         * <p>The separator used in the BY_SEPARATOR strategy. The separator is matched as a literal string (not a regular expression). The maximum length is 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>\\n\\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>The chunking strategy. Valid values:</p>
         * <ul>
         * <li>AUTO: intelligent splitting (heading-aware + paragraph packing).</li>
         * <li>BY_LENGTH: sliding window splitting by length. You can specify OverlapSize.</li>
         * <li>BY_SEPARATOR: splitting by separator. You must specify Separator.</li>
         * <li>BY_HEADING: splitting by heading level. You must specify HeadingLevel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BY_SEPARATOR</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static KnowledgeBaseChunkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseChunkConfiguration self = new KnowledgeBaseChunkConfiguration();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseChunkConfiguration setHeadingLevel(Integer headingLevel) {
            this.headingLevel = headingLevel;
            return this;
        }
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        public KnowledgeBaseChunkConfiguration setMaxChunkSize(Integer maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        public KnowledgeBaseChunkConfiguration setOverlapSize(Integer overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        public KnowledgeBaseChunkConfiguration setPreprocessRules(KnowledgeBaseChunkConfigurationPreprocessRules preprocessRules) {
            this.preprocessRules = preprocessRules;
            return this;
        }
        public KnowledgeBaseChunkConfigurationPreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        public KnowledgeBaseChunkConfiguration setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

        public KnowledgeBaseChunkConfiguration setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class KnowledgeBaseSearchConfiguration extends TeaModel {
        /**
         * <p>The retrieval mode. Valid values:</p>
         * <ul>
         * <li>KEYWORD: keyword retrieval.</li>
         * <li>VECTOR: vector retrieval.</li>
         * <li>HYBRID: hybrid retrieval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The fusion algorithm for hybrid search. This parameter takes effect only in hybrid search mode. Valid values:</p>
         * <ul>
         * <li>RRF: reciprocal rank fusion.</li>
         * <li>WEIGHTED: weighted normalization fusion. Use this value together with VectorWeight.</li>
         * </ul>
         * <p>Default value: RRF.</p>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("RankAlgorithm")
        public String rankAlgorithm;

        /**
         * <p>Specifies whether reranking is enabled by default. This parameter takes effect for all search modes (KEYWORD, VECTOR, and HYBRID). This default value is used when the Rerank parameter is not specified in a search request.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerankEnabled")
        public Boolean rerankEnabled;

        /**
         * <p>The default reranking model used when the RerankModel parameter is not specified in a search request. Valid values: qwen3-rerank, gte-rerank-v2, and qwen3-vl-rerank. Default value: qwen3-rerank. Score distributions vary across models and cannot be compared. Use the same model consistently within a knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankModel")
        public String rerankModel;

        /**
         * <p>The k parameter of the RRF fusion algorithm. The value must be greater than 0. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RrfK")
        public Integer rrfK;

        /**
         * <p>The maximum number of results returned by default for a search request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TopK")
        public Integer topK;

        /**
         * <p>The weight of the vector path in the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword path weight equals 1 minus this value. Default value: 0.7.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("VectorWeight")
        public Double vectorWeight;

        public static KnowledgeBaseSearchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseSearchConfiguration self = new KnowledgeBaseSearchConfiguration();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseSearchConfiguration setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public KnowledgeBaseSearchConfiguration setRankAlgorithm(String rankAlgorithm) {
            this.rankAlgorithm = rankAlgorithm;
            return this;
        }
        public String getRankAlgorithm() {
            return this.rankAlgorithm;
        }

        public KnowledgeBaseSearchConfiguration setRerankEnabled(Boolean rerankEnabled) {
            this.rerankEnabled = rerankEnabled;
            return this;
        }
        public Boolean getRerankEnabled() {
            return this.rerankEnabled;
        }

        public KnowledgeBaseSearchConfiguration setRerankModel(String rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public String getRerankModel() {
            return this.rerankModel;
        }

        public KnowledgeBaseSearchConfiguration setRrfK(Integer rrfK) {
            this.rrfK = rrfK;
            return this;
        }
        public Integer getRrfK() {
            return this.rrfK;
        }

        public KnowledgeBaseSearchConfiguration setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public KnowledgeBaseSearchConfiguration setVectorWeight(Double vectorWeight) {
            this.vectorWeight = vectorWeight;
            return this;
        }
        public Double getVectorWeight() {
            return this.vectorWeight;
        }

    }

}
