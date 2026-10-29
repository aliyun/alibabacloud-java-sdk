// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The EventHouse catalog to which the knowledge base belongs. This parameter, together with Namespace and KnowledgeBaseName, uniquely identifies the knowledge base. This parameter cannot be modified after the knowledge base is created. You cannot bind a system catalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Optional. The default chunking strategy for the knowledge base. This strategy applies only to documents uploaded after the configuration. If this parameter is not specified, the system default chunking strategy is used.</p>
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
     * <p>Optional. The vector dimensions. This parameter is attached to the embedding model for validation. Valid values for text-embedding-v3: 64, 128, 256, 512, 768, and 1024. Valid values for text-embedding-v4: 64, 128, 256, 512, 768, 1024, 1536, and 2048. Valid values for qwen3.7-text-embedding: 256, 512, 768, 1024, 1536, 2048, and 2560. Valid values for qwen3.7-text-embedding-flash: 256, 512, 768, and 1024. If this parameter is not specified, the default dimension of the model, 1024, is used. This parameter cannot be modified after the knowledge base is created. To change the model, you must rebuild the knowledge base, even if the dimensions remain the same.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>Optional. The embedding model. This parameter cannot be modified after the knowledge base is created. Valid values: text-embedding-v3, text-embedding-v4, qwen3.7-text-embedding, and qwen3.7-text-embedding-flash. Only Qwen models provided by Model Studio are supported. Third-party models are not supported. Default value: text-embedding-v4.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>The name of the knowledge base. The name must be unique within the same namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product-docs</p>
     */
    @NameInMap("KnowledgeBaseName")
    public String knowledgeBaseName;

    /**
     * <p>Declares the metadata fields for the knowledge base. When you upload documents, the metadata can only contain the fields declared here. This parameter cannot be modified after the knowledge base is created.</p>
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
     * <p>Optional. The default search configuration at the knowledge base level. This configuration takes effect when the corresponding parameters are not specified in a search request. You can modify this configuration by calling UpdateKnowledgeBase after the knowledge base is created.</p>
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
         * <p>Specifies whether to replace consecutive whitespace characters, such as spaces, line breaks, and tabs, with a single space.</p>
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
         * <p>Required for the BY_HEADING strategy. Valid values: 1 to 6. This parameter is ignored for other strategies. Headings at or above the specified level are used as chunking boundaries. For example, if you set this parameter to 2, both H1 and H2 headings are used as boundaries. Lower-level headings are not used as boundaries and are retained in the chunk text. If the section content exceeds MaxChunkSize, the system falls back to chunking by paragraph or sentence. For documents without headings, the system falls back to intelligent chunking.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HeadingLevel")
        public Integer headingLevel;

        /**
         * <p>The maximum number of characters in a single chunk. Valid values: 1 to 6000. An error is reported if the limit is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxChunkSize")
        public Integer maxChunkSize;

        /**
         * <p>Applies only to the BY_LENGTH strategy. This parameter is ignored for other strategies. The overlap size between adjacent chunks, in characters. If the value is greater than 0, the beginning of the next chunk repeats the content at the end of the previous chunk within this window. The overlap does not cause the chunk to exceed MaxChunkSize. Default value: 0, which indicates no overlap.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("OverlapSize")
        public Integer overlapSize;

        /**
         * <p>The preprocessing rules.</p>
         */
        @NameInMap("PreprocessRules")
        public CreateKnowledgeBaseRequestChunkConfigurationPreprocessRules preprocessRules;

        /**
         * <p>Required for the BY_SEPARATOR strategy. This parameter is ignored for other strategies. The literal string used to split the text. Regular expressions are not supported. The maximum length is 32 characters. Example: \
         * \
         *  for paragraph breaks.</p>
         * 
         * <strong>example:</strong>
         * <p>\\n\\n</p>
         */
        @NameInMap("Separator")
        public String separator;

        /**
         * <p>The chunking strategy. AUTO indicates intelligent chunking, which is heading-aware and groups paragraphs. BY_LENGTH indicates sliding window chunking by length, where you can specify OverlapSize. BY_SEPARATOR indicates chunking by separator, where you must specify Separator. BY_HEADING indicates chunking by heading level, where you must specify HeadingLevel. Valid values: AUTO, BY_LENGTH, BY_SEPARATOR, and BY_HEADING.</p>
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
         * <p>The type of the field. Valid values: STRING, LONG, DOUBLE, BOOLEAN, and DATETIME.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value configuration. If ValueMode is set to CONSTANT, this parameter specifies a fixed value. If it is left empty, you can assign a value during upload. If ValueMode is set to SYSTEM_VARIABLE, this parameter specifies a system variable name, such as DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, or SOURCE_MODIFIED_TIME.</p>
         * 
         * <strong>example:</strong>
         * <p>EventHouse</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The value mode. CONSTANT indicates a constant. If Value is not empty, all documents use the fixed value. If Value is empty, you can assign a value during upload. SYSTEM_VARIABLE indicates a system variable. Value specifies the variable name, which is automatically generated by the system and cannot be overwritten during upload.</p>
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
         * <p>The search mode. KEYWORD indicates keyword retrieve. VECTOR indicates AISearch. HYBRID indicates hybrid retrieve. Valid values: KEYWORD, VECTOR, and HYBRID.</p>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Applies only to the hybrid search mode. RRF indicates reciprocal rank fusion. WEIGHTED indicates weighted normalization fusion, which is used together with VectorWeight. Default value: RRF.</p>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("RankAlgorithm")
        public String rankAlgorithm;

        /**
         * <p>Applies only to the hybrid search mode. Specifies whether to enable reranking by default when a search request does not specify the Rerank parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerankEnabled")
        public Boolean rerankEnabled;

        /**
         * <p>The default rerank model used when a search request does not specify the RerankModel parameter. Valid value: qwen3-rerank. Default value: qwen3-rerank.</p>
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
         * <p>The vector weight for the WEIGHTED fusion algorithm. Valid values: 0 to 1. The keyword weight is 1 minus this value. Default value: 0.7.</p>
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
