// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The list of primary key IDs of the categories to be imported into the knowledge base.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>The estimated length of chunks. The maximum number of characters for a chunk. Texts exceeding this limit are splited. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [1-2048].</p>
     * <p>The default value is empty, which means using the intelligent splitting method.</p>
     * <blockquote>
     * <p> If you specify the <code>ChunkSize</code> parameter, you must also specify the <code>OverlapSize</code> and <code>Separator</code> parameters. If you do not specify these three parameters, the system uses the intelligent splitting method by default.</p>
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
     * <p>The list of primary key IDs of the documents to be imported into the knowledge base.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>The name of the embedding model. The embedding model converts the original input prompt and knowledge text into numerical vectors for similarity comparison. The default and only model available is DashScope text-embedding-v2. It supports multiple languages including Chinese and English and normalizes the vector results. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid value:</p>
     * <ul>
     * <li>text-embedding-v2</li>
     * </ul>
     * <p>The default value is null, which means using the text-embedding-v2 model.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v2</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>The name of the knowledge base. The name must be 1 to 20 characters in length and can contain characters classified as letter in Unicode, including English letters, Chinese characters, digits, among others. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The overlap length. The number of overlapping characters between two consecutive chunks. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: 0 to 1024.</p>
     * <p>The default value is empty, which means using the intelligent splitting method.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>Similarity Threshold. The lowest similarity score of chunks that can be returned. This parameter is used to filter text chunks returned by the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [0.01-1.00].</p>
     * <p>Default value: 0.20.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <p>The name of the rank model. The rank model is a scoring system outside the knowledge base. It calculates the similarity score of each text chunk in the input question and knowledge base and ranks them in descending order. Then, the model returns the top K chunks with the highest scores. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>gte-rerank-hybrid</li>
     * <li>gte-rerank</li>
     * </ul>
     * <p>The default value is empty, which means using the official gte-rerank-hybrid model.</p>
     * <blockquote>
     * <p> If you need only semantic ranking, we recommend that you use gte-rerank. If you need both semantic ranking and text matching features to ensure relevance, we recommend that you use gte-rerank-hybrid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <p>The clause identifier. The document is split into chunks based on this identifier. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. You can specify multiple identifiers and do not need to add any other characters to separate them. For example: !,\\\n. Valid values:</p>
     * <ul>
     * <li>\n: line break</li>
     * <li>，: Chinese comma</li>
     * <li>,: English comma</li>
     * <li>。 : Chinese full stop</li>
     * <li>.: English full stop</li>
     * <li>！ : Chinese exclamation point</li>
     * <li>! : English exclamation point</li>
     * <li>；: Chinese semicolon</li>
     * <li>;: English semicolon</li>
     * <li>？: Chinese question mark</li>
     * <li>?: English question mark</li>
     * </ul>
     * <p>The default value is empty, which means using the intelligent splitting method.</p>
     * 
     * <strong>example:</strong>
     * <p>,</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The ID of the vector storage instance. This parameter is available only when SinkType is set to ADB. You can view the ID on the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">Instances</a> page of AnalyticDB for PostgreSQL.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp321093j84</p>
     */
    @NameInMap("SinkInstanceId")
    public String sinkInstanceId;

    /**
     * <p>The region of the vector storage instance. This parameter is available only when SinkType is set to ADB. You can call the <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SinkRegion")
    public String sinkRegion;

    /**
     * <p>The vector storage type of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>DEFAULT: The built-in vector database.</li>
     * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features, such as managing, auditing, and monitoring, we recommend that you specify ADB.</li>
     * </ul>
     * <blockquote>
     * <p> If you have not used AnalyticDB for AnalyticDB in Model Studio before, go to the <a href="https://bailian.console.aliyun.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as Vector Storage Type, and follow the instructions to grant permissions. If you specify ADB, you must also specify the <code>SinkInstanceId</code> and <code>SinkRegion</code> parameters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("SinkType")
    public String sinkType;

    /**
     * <p>The data type of <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a>. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: The category type. Import all documents from one or more categories in Data Center.</li>
     * <li>DATA_CENTER_FILE: The document type. Import one or more documents from Data Center.</li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
     * </blockquote>
     * <blockquote>
     * <p> If you want to create an empty knowledge base, you can use an empty category. Set this parameter to DATA_CENTER_CATEGORY. And specify the ID of an empty category for the <code>CategoryIds</code> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>The data type of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid value:</p>
     * <ul>
     * <li>unstructured</li>
     * </ul>
     * <blockquote>
     * <p> After a knowledge base is created, its data type cannot be changed. You cannot create a structured knowledge base by calling an API operation. Use the console instead.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>structured</p>
     */
    @NameInMap("StructureType")
    public String structureType;

    @NameInMap("chunkMode")
    public String chunkMode;

    @NameInMap("enableHeaders")
    public Boolean enableHeaders;

    @NameInMap("metaExtractColumns")
    public java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns;

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

    public CreateIndexRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
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
        @NameInMap("Desc")
        public String desc;

        @NameInMap("EnableLlm")
        public Boolean enableLlm;

        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

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
