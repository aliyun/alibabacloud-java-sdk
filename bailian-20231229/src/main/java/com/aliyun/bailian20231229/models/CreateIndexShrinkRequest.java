// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexShrinkRequest extends TeaModel {
    /**
     * <p>The files to imported to the knowledge base. Specify the category IDs. All files under the categories will be imported (up to 10,000 files). To add more files later, call <strong>SubmitIndexAddDocumentsJob</strong>.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

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
    public String columnsShrink;

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
    public String dataSourceShrink;

    /**
     * <p>The description of the knowledge base. The description must be 0 to 1,000 characters in length. This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The files to imported to the knowledge base. Specify the file IDs to import (up to 10,000 files). To add more files later, call <strong>SubmitIndexAddDocumentsJob</strong>.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

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
    public String tableIdsShrink;

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

    @NameInMap("connectId")
    public String connectId;

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

    @NameInMap("knowledgeScene")
    public String knowledgeScene;

    /**
     * <p>The metadata extraction configurations. Metadata refers to a set of additional attributes associated with unstructured data, which are integrated into text chunks in key-value pairs. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     */
    @NameInMap("metaExtractColumns")
    public String metaExtractColumnsShrink;

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

    public static CreateIndexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexShrinkRequest self = new CreateIndexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public CreateIndexShrinkRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public CreateIndexShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public CreateIndexShrinkRequest setCreateIndexType(String createIndexType) {
        this.createIndexType = createIndexType;
        return this;
    }
    public String getCreateIndexType() {
        return this.createIndexType;
    }

    public CreateIndexShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public CreateIndexShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIndexShrinkRequest setDocumentIdsShrink(String documentIdsShrink) {
        this.documentIdsShrink = documentIdsShrink;
        return this;
    }
    public String getDocumentIdsShrink() {
        return this.documentIdsShrink;
    }

    public CreateIndexShrinkRequest setEmbeddingModelName(String embeddingModelName) {
        this.embeddingModelName = embeddingModelName;
        return this;
    }
    public String getEmbeddingModelName() {
        return this.embeddingModelName;
    }

    public CreateIndexShrinkRequest setEnableRewrite(Boolean enableRewrite) {
        this.enableRewrite = enableRewrite;
        return this;
    }
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    public CreateIndexShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIndexShrinkRequest setOverlapSize(Integer overlapSize) {
        this.overlapSize = overlapSize;
        return this;
    }
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    public CreateIndexShrinkRequest setRerankMinScore(Double rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Double getRerankMinScore() {
        return this.rerankMinScore;
    }

    public CreateIndexShrinkRequest setRerankModelName(String rerankModelName) {
        this.rerankModelName = rerankModelName;
        return this;
    }
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    public CreateIndexShrinkRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

    public CreateIndexShrinkRequest setSinkInstanceId(String sinkInstanceId) {
        this.sinkInstanceId = sinkInstanceId;
        return this;
    }
    public String getSinkInstanceId() {
        return this.sinkInstanceId;
    }

    public CreateIndexShrinkRequest setSinkRegion(String sinkRegion) {
        this.sinkRegion = sinkRegion;
        return this;
    }
    public String getSinkRegion() {
        return this.sinkRegion;
    }

    public CreateIndexShrinkRequest setSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }
    public String getSinkType() {
        return this.sinkType;
    }

    public CreateIndexShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateIndexShrinkRequest setStructureType(String structureType) {
        this.structureType = structureType;
        return this;
    }
    public String getStructureType() {
        return this.structureType;
    }

    public CreateIndexShrinkRequest setTableIdsShrink(String tableIdsShrink) {
        this.tableIdsShrink = tableIdsShrink;
        return this;
    }
    public String getTableIdsShrink() {
        return this.tableIdsShrink;
    }

    public CreateIndexShrinkRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
    }

    public CreateIndexShrinkRequest setConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }
    public String getConnectId() {
        return this.connectId;
    }

    public CreateIndexShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateIndexShrinkRequest setDatasourceCode(String datasourceCode) {
        this.datasourceCode = datasourceCode;
        return this;
    }
    public String getDatasourceCode() {
        return this.datasourceCode;
    }

    public CreateIndexShrinkRequest setEnableHeaders(Boolean enableHeaders) {
        this.enableHeaders = enableHeaders;
        return this;
    }
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    public CreateIndexShrinkRequest setKnowledgeScene(String knowledgeScene) {
        this.knowledgeScene = knowledgeScene;
        return this;
    }
    public String getKnowledgeScene() {
        return this.knowledgeScene;
    }

    public CreateIndexShrinkRequest setMetaExtractColumnsShrink(String metaExtractColumnsShrink) {
        this.metaExtractColumnsShrink = metaExtractColumnsShrink;
        return this;
    }
    public String getMetaExtractColumnsShrink() {
        return this.metaExtractColumnsShrink;
    }

    public CreateIndexShrinkRequest setPipelineCommercialCu(Integer pipelineCommercialCu) {
        this.pipelineCommercialCu = pipelineCommercialCu;
        return this;
    }
    public Integer getPipelineCommercialCu() {
        return this.pipelineCommercialCu;
    }

    public CreateIndexShrinkRequest setPipelineCommercialType(String pipelineCommercialType) {
        this.pipelineCommercialType = pipelineCommercialType;
        return this;
    }
    public String getPipelineCommercialType() {
        return this.pipelineCommercialType;
    }

    public CreateIndexShrinkRequest setPipelineRetrieveRateLimitStrategy(String pipelineRetrieveRateLimitStrategy) {
        this.pipelineRetrieveRateLimitStrategy = pipelineRetrieveRateLimitStrategy;
        return this;
    }
    public String getPipelineRetrieveRateLimitStrategy() {
        return this.pipelineRetrieveRateLimitStrategy;
    }

    public CreateIndexShrinkRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
