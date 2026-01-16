// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The files to imported to the knowledge base. Specify the category IDs. All files under the categories will be imported (up to 10,000 files). To add more files later, call <strong>SubmitIndexAddDocumentsJob</strong>.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>The chunk size, which is the maximum number of characters in each chunk. Text exceeding this length may be truncated.</p>
     * <p>Valid values: 1 to 6000. Default value: 500.</p>
     * <blockquote>
     * <p>If <code>ChunkSize</code> is set to a value less than 100, <code>OverlapSize</code> is required. Or, if you do not pass these two parameters, the system uses the default values of the two.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    @NameInMap("Columns")
    public java.util.List<CreateIndexRequestColumns> columns;

    /**
     * <blockquote>
     * <p>This parameter is not available. Do not specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("CreateIndexType")
    public String createIndexType;

    /**
     * <blockquote>
     * <p> This parameter is not available. Do not specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("DataSource")
    public CreateIndexRequestDataSource dataSource;

    /**
     * <p>The description of the knowledge base. The description must be 0 to 1,000 characters in length. This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The files to imported to the knowledge base. Specify the file IDs to import (up to 10,000 files). To add more files later, call <strong>SubmitIndexAddDocumentsJob</strong>.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>The embedding model used in the knowledge base. The embedding model converts the original input prompt and knowledge text into numerical embeddings for similarity comparison. The default and only model available is text-embedding-v2. It supports multiple languages including Chinese and English and normalizes the embedding results. For more information, see <a href="https://help.aliyun.com/document_detail/2842587.html">Embedding</a>. Valid values:</p>
     * <ul>
     * <li>text-embedding-v2</li>
     * </ul>
     * <p>The default value is null, which means using text-embedding-v2.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v2</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>Whether to enable rewriting for multi-turn conversations. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    /**
     * <p>The name of the knowledge base. The name must be 1 to 20 characters in length, and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The overlap size, which is the number of overlapping characters between two consecutive chunks. Valid values: 0 to 1024.</p>
     * <p>Default value: 100.</p>
     * <blockquote>
     * <p><code>OverlapSize</code> must be less than <code>ChunkSize</code>. Otherwise, chunking errors may occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>The similarity threshold. Only chunks with a similarity score higher than this value can be recalled. This parameter is used to filter chunks returned by the re-rank model. Valid values: 0.01 to 1.00.</p>
     * <p>Default value: 0.01.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <p>The re-ranking model used in the knowledge base. The re-rank model is a scoring system outside the knowledge base. It calculates the similarity score of the query and text chunks in the knowledge base and ranks them in descending order. Then, the model returns the top K chunks with the highest scores. Valid values:</p>
     * <ul>
     * <li>gte-rerank-hybrid</li>
     * <li>gte-rerank</li>
     * </ul>
     * <p>The default value is empty, which means using gte-rerank-hybrid.</p>
     * <blockquote>
     * <p>If you need only semantic ranking, we recommend gte-rerank. If you need both semantic ranking and text matching features to ensure relevance, we recommend gte-rerank-hybrid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <blockquote>
     * <p>This parameter is not available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>,</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The ID of the AnalyticDB for PostgreSQL instance. Required only when <code>SinkType</code> is set to ADB. Get the ID on the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">Instances</a> page of AnalyticDB for PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp321093j84</p>
     */
    @NameInMap("SinkInstanceId")
    public String sinkInstanceId;

    /**
     * <p>The region of the AnalyticDB for PostgreSQL instance. Required only when <code>SinkType</code> is set to ADB. Call <a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions?spm=a2c63.p38356.0.i3">DescribeRegions</a> to obtain the region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SinkRegion")
    public String sinkRegion;

    /**
     * <p>The vector storage type of the knowledge base. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>BUILT_IN: The vector data is hosted by Alibaba Cloud Model Studio.</li>
     * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features, such as managing, auditing, and monitoring, we recommend ADB.</li>
     * </ul>
     * <blockquote>
     * <p>If you have not used AnalyticDB for AnalyticDB in Model Studio before, go to the <a href="https://bailian.console.alibabacloud.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as Vector Storage Type, and follow the instructions to grant permissions. If you specify ADB, the <code>SinkInstanceId</code> and <code>SinkRegion</code> parameters are required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("SinkType")
    public String sinkType;

    /**
     * <blockquote>
     * <p>This parameter is required in the latest version of the SDK. Otherwise, when you call SubmitIndexJob, an error will occur: Required parameter(data_sources) missing or invalid.</p>
     * </blockquote>
     * <p>The source of the imported data. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: The category type, that is to import all files in one or more specified categories in <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>DATA_CENTER_FILE: The file type, that is to import one or more specified files in <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * </ul>
     * <blockquote>
     * <p>If set to DATA_CENTER_CATEGORY, <code>CategoryIds</code> is required. If set to DATA_CENTER_FILE, <code>DocumentIds</code> is required.</p>
     * </blockquote>
     * <blockquote>
     * <p>To create an empty knowledge base, you can use an empty category with no files: Set this parameter to DATA_CENTER_CATEGORY, and <code>CategoryIds</code> to the ID of an empty category.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DATA_CENTER_FILE</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The type of the knowledge base. Valid values:</p>
     * <ul>
     * <li>unstructured: The document search type.</li>
     * </ul>
     * <blockquote>
     * <p>After you create a knowledge base, its type cannot be changed. This operation does not support data query and image Q\&amp;A types. Use the console instead.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>structured</p>
     */
    @NameInMap("StructureType")
    public String structureType;

    /**
     * <blockquote>
     * <p>This parameter is not available. Do not specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("TableIds")
    public java.util.List<String> tableIds;

    /**
     * <blockquote>
     * <p>This parameter is not available. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>regex</p>
     */
    @NameInMap("chunkMode")
    public String chunkMode;

    @NameInMap("database")
    public String database;

    @NameInMap("datasourceCode")
    public String datasourceCode;

    /**
     * <p>Whether to treat the first row of all .xlsx and .xls files as headers and concatenate them into each text chunk. This prevents the models from mistakenly interpreting headers as regular data rows.</p>
     * <blockquote>
     * <p>Enable this feature only when all imported files are in .xlsx or .xls format and contain headers. Otherwise, leave it disabled.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableHeaders")
    public Boolean enableHeaders;

    /**
     * <p>The metadata extraction configurations. Metadata refers to a set of additional attributes associated with unstructured data, which are integrated into text chunks in key-value pairs. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     */
    @NameInMap("metaExtractColumns")
    public java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pipelineCommercialCu")
    public Integer pipelineCommercialCu;

    /**
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("pipelineCommercialType")
    public String pipelineCommercialType;

    /**
     * <strong>example:</strong>
     * <p>downgrade</p>
     */
    @NameInMap("pipelineRetrieveRateLimitStrategy")
    public String pipelineRetrieveRateLimitStrategy;

    @NameInMap("table")
    public String table;

    public static CreateIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexRequest self = new CreateIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexRequest setCategoryIds(java.util.List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public CreateIndexRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public CreateIndexRequest setColumns(java.util.List<CreateIndexRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateIndexRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateIndexRequest setCreateIndexType(String createIndexType) {
        this.createIndexType = createIndexType;
        return this;
    }
    public String getCreateIndexType() {
        return this.createIndexType;
    }

    public CreateIndexRequest setDataSource(CreateIndexRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public CreateIndexRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public CreateIndexRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIndexRequest setDocumentIds(java.util.List<String> documentIds) {
        this.documentIds = documentIds;
        return this;
    }
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    public CreateIndexRequest setEmbeddingModelName(String embeddingModelName) {
        this.embeddingModelName = embeddingModelName;
        return this;
    }
    public String getEmbeddingModelName() {
        return this.embeddingModelName;
    }

    public CreateIndexRequest setEnableRewrite(Boolean enableRewrite) {
        this.enableRewrite = enableRewrite;
        return this;
    }
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    public CreateIndexRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexRequest setOverlapSize(Integer overlapSize) {
        this.overlapSize = overlapSize;
        return this;
    }
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    public CreateIndexRequest setRerankMinScore(Double rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Double getRerankMinScore() {
        return this.rerankMinScore;
    }

    public CreateIndexRequest setRerankModelName(String rerankModelName) {
        this.rerankModelName = rerankModelName;
        return this;
    }
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    public CreateIndexRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public CreateIndexRequest setSinkInstanceId(String sinkInstanceId) {
        this.sinkInstanceId = sinkInstanceId;
        return this;
    }
    public String getSinkInstanceId() {
        return this.sinkInstanceId;
    }

    public CreateIndexRequest setSinkRegion(String sinkRegion) {
        this.sinkRegion = sinkRegion;
        return this;
    }
    public String getSinkRegion() {
        return this.sinkRegion;
    }

    public CreateIndexRequest setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

    public CreateIndexRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateIndexRequest setStructureType(String structureType) {
        this.structureType = structureType;
        return this;
    }
    public String getStructureType() {
        return this.structureType;
    }

    public CreateIndexRequest setTableIds(java.util.List<String> tableIds) {
        this.tableIds = tableIds;
        return this;
    }
    public java.util.List<String> getTableIds() {
        return this.tableIds;
    }

    public CreateIndexRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
    }

    public CreateIndexRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateIndexRequest setDatasourceCode(String datasourceCode) {
        this.datasourceCode = datasourceCode;
        return this;
    }
    public String getDatasourceCode() {
        return this.datasourceCode;
    }

    public CreateIndexRequest setEnableHeaders(Boolean enableHeaders) {
        this.enableHeaders = enableHeaders;
        return this;
    }
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    public CreateIndexRequest setMetaExtractColumns(java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns) {
        this.metaExtractColumns = metaExtractColumns;
        return this;
    }
    public java.util.List<CreateIndexRequestMetaExtractColumns> getMetaExtractColumns() {
        return this.metaExtractColumns;
    }

    public CreateIndexRequest setPipelineCommercialCu(Integer pipelineCommercialCu) {
        this.pipelineCommercialCu = pipelineCommercialCu;
        return this;
    }
    public Integer getPipelineCommercialCu() {
        return this.pipelineCommercialCu;
    }

    public CreateIndexRequest setPipelineCommercialType(String pipelineCommercialType) {
        this.pipelineCommercialType = pipelineCommercialType;
        return this;
    }
    public String getPipelineCommercialType() {
        return this.pipelineCommercialType;
    }

    public CreateIndexRequest setPipelineRetrieveRateLimitStrategy(String pipelineRetrieveRateLimitStrategy) {
        this.pipelineRetrieveRateLimitStrategy = pipelineRetrieveRateLimitStrategy;
        return this;
    }
    public String getPipelineRetrieveRateLimitStrategy() {
        return this.pipelineRetrieveRateLimitStrategy;
    }

    public CreateIndexRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public static class CreateIndexRequestColumns extends TeaModel {
        @NameInMap("Column")
        public String column;

        @NameInMap("IsRecall")
        public Boolean isRecall;

        @NameInMap("IsSearch")
        public Boolean isSearch;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static CreateIndexRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestColumns self = new CreateIndexRequestColumns();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestColumns setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public CreateIndexRequestColumns setIsRecall(Boolean isRecall) {
            this.isRecall = isRecall;
            return this;
        }
        public Boolean getIsRecall() {
            return this.isRecall;
        }

        public CreateIndexRequestColumns setIsSearch(Boolean isSearch) {
            this.isSearch = isSearch;
            return this;
        }
        public Boolean getIsSearch() {
            return this.isSearch;
        }

        public CreateIndexRequestColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIndexRequestColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateIndexRequestDataSource extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("CredentialKey")
        public String credentialKey;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("IsPrivateLink")
        public Boolean isPrivateLink;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("SubPath")
        public String subPath;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Table")
        public String table;

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Type")
        public String type;

        public static CreateIndexRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestDataSource self = new CreateIndexRequestDataSource();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestDataSource setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public CreateIndexRequestDataSource setCredentialKey(String credentialKey) {
            this.credentialKey = credentialKey;
            return this;
        }
        public String getCredentialKey() {
            return this.credentialKey;
        }

        public CreateIndexRequestDataSource setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CreateIndexRequestDataSource setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateIndexRequestDataSource setIsPrivateLink(Boolean isPrivateLink) {
            this.isPrivateLink = isPrivateLink;
            return this;
        }
        public Boolean getIsPrivateLink() {
            return this.isPrivateLink;
        }

        public CreateIndexRequestDataSource setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateIndexRequestDataSource setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public CreateIndexRequestDataSource setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public CreateIndexRequestDataSource setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public CreateIndexRequestDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateIndexRequestMetaExtractColumns extends TeaModel {
        /**
         * <p>The description of the metadata field. The description must be 0 to 1,000 characters in length, and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:). This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>AuthorName</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>When set to true, the key and value of this metadata filed will participate in the generation process of the model, together with the chunk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableLlm")
        public Boolean enableLlm;

        /**
         * <p>When set to true, the key and value of this metadata filed will participate in the knowledge base retrieval, together with the chunk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The metadata key. It must be 1 to 50 characters in length and must be English letters or underscores. If you specify this parameter, the <code>Value</code> and <code>Type</code> parameters are required.</p>
         * 
         * <strong>example:</strong>
         * <p>author</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the metadata field. Valid values:</p>
         * <ul>
         * <li>constant</li>
         * <li>variable</li>
         * <li>custom_prompt</li>
         * <li>regular</li>
         * <li>keywords</li>
         * </ul>
         * <p>Enumerated value:</p>
         * <ul>
         * <li>constant: constant extraction.</li>
         * <li>keywords: keyword extraction.</li>
         * <li>custom_prompt: LLM.</li>
         * <li>variable: variable extraction.</li>
         * <li>regular: regular expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The metadata value.</p>
         * 
         * <strong>example:</strong>
         * <p>Tim</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateIndexRequestMetaExtractColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexRequestMetaExtractColumns self = new CreateIndexRequestMetaExtractColumns();
            return TeaModel.build(map, self);
        }

        public CreateIndexRequestMetaExtractColumns setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateIndexRequestMetaExtractColumns setEnableLlm(Boolean enableLlm) {
            this.enableLlm = enableLlm;
            return this;
        }
        public Boolean getEnableLlm() {
            return this.enableLlm;
        }

        public CreateIndexRequestMetaExtractColumns setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public CreateIndexRequestMetaExtractColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIndexRequestMetaExtractColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateIndexRequestMetaExtractColumns setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
