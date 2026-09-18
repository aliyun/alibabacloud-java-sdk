// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The EventHouse catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created. System catalogs cannot be bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. The default chunking strategy for the knowledge base. This strategy applies only to documents uploaded after the configuration is set. If this parameter is not specified, the system default chunking strategy is used.</p>
     */
    @NameInMap("ChunkConfiguration")
    public CreateKnowledgeBaseRequestChunkConfiguration chunkConfiguration;

    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>Product documentation knowledge base</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Optional. The vector dimensions. The value is validated against the embedding model: text-embedding-v3 supports 64, 128, 256, 512, 768, and 1024. text-embedding-v4 supports 64, 128, 256, 512, 768, 1024, 1536, and 2048. qwen3.7-text-embedding supports 256, 512, 768, 1024, 1536, 2048, and 2560. qwen3.7-text-embedding-flash supports 256, 512, 768, and 1024. Default value: 1024 (the default dimension of the model). This parameter cannot be modified after the knowledge base is created. Even if the dimensions are the same, you must rebuild the knowledge base when switching models.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>Optional. The embedding model used for vectorization. This parameter cannot be modified after the knowledge base is created. Valid values: text-embedding-v3, text-embedding-v4, qwen3.7-text-embedding, and qwen3.7-text-embedding-flash. Only Bailian Tongyi models are supported. Third-party models are not supported. Default value: text-embedding-v4.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>The name of the knowledge base. The name must be unique within the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product-docs</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>Declares the metadata fields of the knowledge base. When you upload documents, the metadata can contain only the fields declared here. This parameter cannot be modified after the knowledge base is created.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;department&quot;,&quot;Type&quot;:&quot;STRING&quot;}]</p>
     */
    @NameInMap("MetadataSchema")
    public java.util.List<CreateKnowledgeBaseRequestMetadataSchema> metadataSchema;

    /**
     * <p>The EventHouse namespace to which the knowledge base belongs. The namespace must belong to the specified catalog. This parameter, together with Catalog and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in search requests. You can modify this configuration after creation by calling UpdateKnowledgeBase.</p>
     */
    @NameInMap("SearchConfiguration")
    public CreateKnowledgeBaseRequestSearchConfiguration searchConfiguration;

    public static CreateKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseRequest self = new CreateKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public CreateKnowledgeBaseRequest setChunkConfiguration(CreateKnowledgeBaseRequestChunkConfiguration chunkConfiguration) {
        this.chunkConfiguration = chunkConfiguration;
        return this;
    }
    public CreateKnowledgeBaseRequestChunkConfiguration getChunkConfiguration() {
        return this.chunkConfiguration;
    }

    public CreateKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseRequest setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public CreateKnowledgeBaseRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateKnowledgeBaseRequest setKnowledgeBaseName(String knowledgeBaseName) {
        this.knowledgeBaseName = knowledgeBaseName;
        return this;
    }
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public CreateKnowledgeBaseRequest setMetadataSchema(java.util.List<CreateKnowledgeBaseRequestMetadataSchema> metadataSchema) {
        this.metadataSchema = metadataSchema;
        return this;
    }
    public java.util.List<CreateKnowledgeBaseRequestMetadataSchema> getMetadataSchema() {
        return this.metadataSchema;
    }

    public CreateKnowledgeBaseRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateKnowledgeBaseRequest setSearchConfiguration(CreateKnowledgeBaseRequestSearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
        return this;
    }
    public CreateKnowledgeBaseRequestSearchConfiguration getSearchConfiguration() {
        return this.searchConfiguration;
    }

    public static class CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules extends TeaModel {
        /**
         * <p>Specifies whether to remove URLs and email addresses during parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemoveUrlsAndEmails")
        public Boolean removeUrlsAndEmails;

        /**
         * <p>Specifies whether to replace consecutive whitespace characters (spaces, line breaks, and tabs) with a single space.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReplaceConsecutiveWhitespace")
        public Boolean replaceConsecutiveWhitespace;

        public static CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules self = new CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules setRemoveUrlsAndEmails(Boolean removeUrlsAndEmails) {
            this.removeUrlsAndEmails = removeUrlsAndEmails;
            return this;
        }
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        public CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules setReplaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
            this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
            return this;
        }
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

    }

    public static class CreateKnowledgeBaseRequestChunkConfiguration extends TeaModel {
        /**
         * <p>Required for the BY_HEADING strategy. Valid values: 1 to 6. This parameter is ignored for other strategies. Headings at or above the specified level are used as split boundaries. For example, if you set this parameter to 2, both H1 and H2 headings are used as split boundaries. Deeper-level headings are not used for splitting and are retained in the chunk body. If the content within a section exceeds MaxChunkSize, the system falls back to splitting by paragraphs or sentences. Documents without headings fall back to intelligent chunking.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadingLevel")
        public Integer headingLevel;

        /**
         * <p>The maximum character length of a single chunk. Valid values: 1 to 6000 (characters). An error is returned if the value exceeds the limit.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxChunkSize")
        public Integer maxChunkSize;

        /**
         * <p>Takes effect only for the BY_LENGTH strategy. This parameter is ignored for other strategies. Specifies the overlap length (in characters) between adjacent chunks. If the value is greater than 0, the beginning of the next chunk repeats the content from the end of the previous chunk within this window. The overlap does not cause a chunk to exceed MaxChunkSize. Default value: 0, which indicates no overlap.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The pre-processing rules.</p>
         */
        @NameInMap("PreprocessRules")
        public CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules preprocessRules;

        /**
         * <p>Required for the BY_SEPARATOR strategy. This parameter is ignored for other strategies. The system splits content by matching the literal string as a whole (not as a regular expression). The maximum length is 32 characters. Example: \
         * \
         *  for paragraph separators.</p>
         * 
         * <strong>example:</strong>
         * <p>\\n\\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>AUTO: Intelligent chunking (heading-aware + paragraph packing).</li>
         * <li>BY_LENGTH: Sliding window chunking by length. You can specify OverlapSize.</li>
         * <li>BY_SEPARATOR: Chunking by separator. You must specify Separator.</li>
         * <li>BY_HEADING: Chunking by heading level. You must specify HeadingLevel.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_SEPARATOR</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static CreateKnowledgeBaseRequestChunkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestChunkConfiguration self = new CreateKnowledgeBaseRequestChunkConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setHeadingLevel(Integer headingLevel) {
            this.headingLevel = headingLevel;
            return this;
        }
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setMaxChunkSize(Integer maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setOverlapSize(Integer overlapSize) {
            this.overlapSize = overlapSize;
            return this;
        }
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setPreprocessRules(CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules preprocessRules) {
            this.preprocessRules = preprocessRules;
            return this;
        }
        public CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setSeparator(String separator) {
            this.separator = separator;
            return this;
        }
        public String getSeparator() {
            return this.separator;
        }

        public CreateKnowledgeBaseRequestChunkConfiguration setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class CreateKnowledgeBaseRequestMetadataSchema extends TeaModel {
        /**
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Valid values: STRING, LONG, DOUBLE, BOOLEAN, and DATETIME.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>When ValueMode is set to CONSTANT, this parameter specifies a fixed value. An empty value indicates that the value can be assigned during upload. When ValueMode is set to SYSTEM_VARIABLE, this parameter specifies a system variable name, such as DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, or SOURCE_MODIFIED_TIME.</p>
         * 
         * <strong>example:</strong>
         * <p>EventHouse</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>CONSTANT: Constant. If Value is not empty, all documents use the fixed value. If Value is empty, the value can be assigned during upload.</li>
         * <li>SYSTEM_VARIABLE: System variable. Value specifies the variable name. The system automatically generates the value, and the value cannot be overridden during upload.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("ValueMode")
        public String valueMode;

        public static CreateKnowledgeBaseRequestMetadataSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestMetadataSchema self = new CreateKnowledgeBaseRequestMetadataSchema();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestMetadataSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeBaseRequestMetadataSchema setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateKnowledgeBaseRequestMetadataSchema setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateKnowledgeBaseRequestMetadataSchema setValueMode(String valueMode) {
            this.valueMode = valueMode;
            return this;
        }
        public String getValueMode() {
            return this.valueMode;
        }

    }

    public static class CreateKnowledgeBaseRequestSearchConfiguration extends TeaModel {
        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>KEYWORD: Keyword retrieval.</li>
         * <li>VECTOR: Vector retrieval.</li>
         * <li>HYBRID: Hybrid retrieval.</li>
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
         * <li>RRF: Reciprocal rank fusion.</li>
         * <li>WEIGHTED: Weighted normalization fusion. Use this value together with VectorWeight.</li>
         * </ul>
         * <p>Default value: RRF.</p>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("RankAlgorithm")
        public String rankAlgorithm;

        /**
         * <p>Takes effect only in hybrid search mode. Specifies whether to enable reranking by default when the search request does not specify a Rerank parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerankEnabled")
        public Boolean rerankEnabled;

        /**
         * <p>The default reranking model used when the search request does not specify a RerankModel parameter. Valid values: qwen3-rerank. Default value: qwen3-rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankModel")
        public String rerankModel;

        /**
         * <p>The k parameter for the RRF fusion algorithm. The value must be greater than 0. Default value: 60.</p>
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
         * <p>The vector weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword weight equals 1 minus this value. Default value: 0.7.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("VectorWeight")
        public Double vectorWeight;

        public static CreateKnowledgeBaseRequestSearchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseRequestSearchConfiguration self = new CreateKnowledgeBaseRequestSearchConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setRankAlgorithm(String rankAlgorithm) {
            this.rankAlgorithm = rankAlgorithm;
            return this;
        }
        public String getRankAlgorithm() {
            return this.rankAlgorithm;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setRerankEnabled(Boolean rerankEnabled) {
            this.rerankEnabled = rerankEnabled;
            return this;
        }
        public Boolean getRerankEnabled() {
            return this.rerankEnabled;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setRerankModel(String rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public String getRerankModel() {
            return this.rerankModel;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setRrfK(Integer rrfK) {
            this.rrfK = rrfK;
            return this;
        }
        public Integer getRrfK() {
            return this.rrfK;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

        public CreateKnowledgeBaseRequestSearchConfiguration setVectorWeight(Double vectorWeight) {
            this.vectorWeight = vectorWeight;
            return this;
        }
        public Double getVectorWeight() {
            return this.vectorWeight;
        }

    }

}
