// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>The list of category IDs to import when creating the knowledge base. All files under the specified categories are imported. We recommend importing no more than 500 files. For remaining files, call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The chunk size, which specifies the maximum number of characters per text chunk. When this length is exceeded:</p>
     * <ul>
     * <li><strong>Intelligent chunking</strong> (when <code>chunkMode</code> is not specified): The text is likely to be truncated.</li>
     * <li><strong>Custom chunking</strong> (when <code>chunkMode</code> is specified): The text is forcibly truncated.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;
     * The chunk size, which specifies the maximum number of characters per text chunk. When this length is exceeded, the text is likely to be truncated.</p>
     * <p>Value range: [1-6000]. If not specified, the default value is 500.</p>
     * <blockquote>
     * <p>If <code>ChunkSize</code> is set to a value less than 100, you must also set <code>OverlapSize</code>. You can also leave both parameters unspecified, and the system uses default values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The structure of the data table (column names, types, etc.).</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     */
    @NameInMap("Columns")
    public java.util.List<CreateIndexRequestColumns> columns;

    /**
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("CreateIndexType")
    public String createIndexType;

    /**
     * <p>The knowledge base description. The description can be up to 1000 characters in length.
     * Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>The enterprise help document library includes important materials such as company policies and product catalogs.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of files to import when creating the knowledge base. Specify file IDs here. We recommend importing no more than 10,000 files. For remaining files, call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The embedding model used by the knowledge base. The embedding model transforms the original input prompt and knowledge text into numerical vectors for similarity comparison. The text-embedding-v4 model is a comprehensive upgrade over text-embedding-v3 in terms of language support, code snippet quantization, and vector dimensions selection, and is suitable for most scenarios. For more information, see <a href="https://help.aliyun.com/document_detail/2842587.html">Vectorization</a>. Valid values:</p>
     * <ul>
     * <li>text-embedding-v4</li>
     * <li>text-embedding-v3</li>
     * </ul>
     * <p>Default value: empty, which uses the text-embedding-v3 model.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The embedding model used by the knowledge base. The embedding model transforms the original input prompt and knowledge text into numerical vectors for similarity comparison. The default text-embedding-v2 model (cannot be changed) supports Chinese, English, and multiple other languages, and performs normalization on vector results. For more information, see <a href="https://help.aliyun.com/document_detail/2842587.html">Vectorization</a>. Valid values:</p>
     * <ul>
     * <li>text-embedding-v2</li>
     * </ul>
     * <p>Default value: empty, which uses the text-embedding-v2 model.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>Specifies whether to enable multi-turn conversation rewriting. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>If not specified, this feature is enabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    /**
     * <p>The knowledge base name. The name must be 1 to 20 characters in length and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseHelpDocLibrary.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The chunk overlap size, which specifies the number of overlapping characters between the current text chunk and the previous text chunk. Value range: [0-1024].</p>
     * <p>If not specified, the default value is 100.</p>
     * <blockquote>
     * <p><code>OverlapSize</code> must be less than <code>ChunkSize</code>. Otherwise, chunking exceptions occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not pass this parameter.</p>
     * <p>&lt;props=&quot;china&quot;&gt;A natural language instruction for fine-grained control of the reranking model\&quot;s behavior.
     * <notice>This parameter takes effect only when rerank_mode is set to &quot;custom&quot;.</p>
     */
    @NameInMap("RerankInstruct")
    public String rerankInstruct;

    /**
     * <p>The similarity threshold. Only text chunks with similarity scores exceeding this value are recalled. This parameter filters the text chunks returned by the reranking model. Value range: [0.01-1.00].</p>
     * <p>If not specified, the default value is 0.01.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * Specifies the instruction intervention mode for the reranking model to determine its scoring preference.</p>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li><p><strong>qa</strong>: (Default) Q&amp;A mode. The model tends to assign higher scores to candidates that directly answer the query. Recommended for Q&amp;A scenarios.</p>
     * </li>
     * <li><p><strong>similar</strong>: Similarity mode. The model tends to assign higher scores to candidates with high content consistency with the query. Recommended for matching and retrieval scenarios.</p>
     * </li>
     * <li><p><strong>custom</strong>: Custom mode. The model\&quot;s ranking behavior is determined by the instruction in the rerank_instruct parameter.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not pass this parameter.
     * [_single.params.RerankMode.enum.similar: 相似模式。]similar: Similarity mode.
     * [_single.params.RerankMode.enum.custom: 自定义模式。]custom: Custom mode.
     * [_single.params.RerankMode.enum.qa:（默认值） 问答模式。]qa: (Default) Q&amp;A mode.
     * [parameters.33.schema.enumValueTitles.similar: 相似模式。]similar: Similarity mode.
     * [parameters.33.schema.enumValueTitles.custom: 自定义模式。]custom: Custom mode.
     * [parameters.33.schema.enumValueTitles.qa:（默认值） 问答模式。]qa: (Default) Q&amp;A mode.</p>
     * 
     * <strong>example:</strong>
     * <p>qa</p>
     */
    @NameInMap("RerankMode")
    public String rerankMode;

    /**
     * <p>The reranking model used by the knowledge base. The reranking model is an external scoring system that calculates the similarity score between the user query and each text chunk in the knowledge base, sorts them in descending order, and returns the top K text chunks with the highest scores. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>qwen3-rerank-hybrid: qwen3-rerank(hybrid) reranking.</li>
     * <li>qwen3-rerank: qwen3-rerank reranking.</li>
     * <li>gte-rerank-hybrid: gte-rerank(hybrid) reranking.</li>
     * <li>gte-rerank: gte-rerank reranking.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>gte-rerank-hybrid: official reranking.</li>
     * <li>gte-rerank: gte-rerank reranking.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Default value: empty, which uses qwen3-rerank.</p>
     * <blockquote>
     * <p>If you only need semantic reranking, use <code>qwen3-rerank</code>. If you need both semantic reranking and text matching features to ensure relevance, use <code>qwen3-rerank-hybrid</code>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>Default value: empty, which uses gte-rerank-hybrid.</p>
     * <blockquote>
     * <p>If you only need semantic reranking, use <code>gte-rerank</code>. If you need both semantic reranking and text matching features to ensure relevance, use <code>gte-rerank-hybrid</code>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p><code>gte-rerank-hybrid</code> and <code>gte-rerank</code> will no longer be updated and are not recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The sentence separator, which takes effect only when <code>chunkMode</code>=<strong>regex</strong> (it does not take effect in other modes even if specified). You can pass a single regular expression (multiple expressions are not supported) to split files into small text chunks.</p>
     * <p>When using intelligent chunking (when <code>chunkMode</code> is not specified), keep the default empty value.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>(?&lt;=。)</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The AnalyticDB for PostgreSQL instance ID (required only when <code>SinkType</code> is set to ADB). Obtain this ID from the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">AnalyticDB for PostgreSQL instance list</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp32109xxxx</p>
     */
    @NameInMap("SinkInstanceId")
    public String sinkInstanceId;

    /**
     * <p>The region of the AnalyticDB for PostgreSQL instance (required only when <code>SinkType</code> is set to ADB). Call &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions">DescribeRegions</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions?spm=a2c63.p38356.0.i3">DescribeRegions</a> to obtain the list of regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SinkRegion")
    public String sinkRegion;

    /**
     * <p>The vector storage type of the knowledge base. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>BUILT_IN: Vector data is hosted on the Alibaba Cloud Model Studio platform.</li>
     * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features such as database management, auditing, and monitoring, select ADB.<blockquote>
     * <p>If you have not used ADB storage on Alibaba Cloud Model Studio before, go to the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/#/knowledge-base/create">Create Knowledge Base</a>&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as the vector storage type, and complete authorization as prompted. If you pass ADB, you must specify the <code>SinkInstanceId</code> and <code>SinkRegion</code> parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILT_IN</p>
     */
    @NameInMap("SinkType")
    public String sinkType;

    /**
     * <blockquote>
     * <p>Notice: This parameter is required in the latest SDK. Otherwise, calling the SubmitIndexJob operation returns an error: Required parameter(data_sources) missing or invalid.</p>
     * </blockquote>
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: Category type. Imports all files under specified categories in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple categories can be imported simultaneously.</li>
     * <li>DATA_CENTER_FILE: File type. Imports specified files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple files can be imported simultaneously.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
     * </blockquote>
     * <blockquote>
     * <p>To create an empty knowledge base, use an empty category that contains no files: set this parameter to DATA_CENTER_CATEGORY and pass the empty category ID in <code>CategoryIds</code>.</p>
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
     * <p>The knowledge base type.</p>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li>unstructured: A document search or audio/video knowledge base. The default scenario for document search type is basic document Q&amp;A. &lt;props=&quot;china&quot;&gt;To create other scenarios, pass the knowledgeType and knowledgeScene parameters.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>structured: A data query or image-based Q&amp;A knowledge base.</li>
     * </ul>
     * <blockquote>
     * <p>The knowledge base type cannot be changed after creation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>unstructured</p>
     */
    @NameInMap("StructureType")
    public String structureType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Obtained by clicking the ID icon next to the table name on the Tables tab of <a href="https://bailian.console.aliyun.com/cn-beijing?tab=app#/connector/list">Data Connections</a> table connector. If the list contains multiple IDs, only the first one is used.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     */
    @NameInMap("TableIds")
    public java.util.List<String> tableIds;

    /**
     * <strong>example:</strong>
     * <p>connector</p>
     */
    @NameInMap("channelType")
    public String channelType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Enables custom chunking and specifies the chunking strategy. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <p>Valid values (only one value can be passed at a time):</p>
     * <ul>
     * <li><strong>length</strong>: Chunk by length. Strictly chunks according to the specified <code>ChunkSize</code> and <code>OverlapSize</code>. If these two parameters are not passed, the system uses default values (<code>ChunkSize</code> of 500 and <code>OverlapSize</code> of 100). Chunking by length does not support <code>Separator</code> (it does not take effect even if specified).</li>
     * <li><strong>page</strong>: Chunk by page. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not passed, the default value of 500 is used). Chunking by page does not support <code>OverlapSize</code> or <code>Separator</code> (they do not take effect even if specified).</li>
     * <li><strong>h1</strong>: Chunk by first-level headings. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not passed, the default value of 500 is used). Chunking by first-level headings does not support <code>OverlapSize</code> or <code>Separator</code> (they do not take effect even if specified).</li>
     * <li><strong>h2</strong>: Chunk by second-level headings. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not passed, the default value of 500 is used). Chunking by second-level headings does not support <code>OverlapSize</code> or <code>Separator</code> (they do not take effect even if specified).</li>
     * <li><strong>regex</strong>: Chunk by regular expression. The <code>Separator</code> parameter must be specified. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not passed, the default value of 500 is used). Chunking by regular expression does not support <code>OverlapSize</code> (it does not take effect even if specified).</li>
     * </ul>
     * <p>If not specified, intelligent chunking is used by default.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>regex</p>
     */
    @NameInMap("chunkMode")
    public String chunkMode;

    /**
     * <strong>example:</strong>
     * <p>conn_mysql_xxx_xxx</p>
     */
    @NameInMap("connectId")
    public String connectId;

    @NameInMap("database")
    public String database;

    @NameInMap("datasourceCode")
    public String datasourceCode;

    /**
     * <p>Specifies whether to treat the first row of all xlsx and xls files as headers and concatenate them into each text chunk, preventing the large language model from treating headers as regular data rows.</p>
     * <blockquote>
     * <p>Enable this feature only when all imported files are in .xlsx or .xls format and contain headers. Otherwise, do not enable it.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>If not specified, this feature is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableHeaders")
    public Boolean enableHeaders;

    @NameInMap("knowledgeScene")
    public String knowledgeScene;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The specific knowledge type, which further specifies the type of data processed by the knowledge base.
     * <notice>This parameter and knowledgeScene must be provided together or omitted together. They cannot be set independently. If both are omitted, the system uses default configurations based on structureType.</p>
     * <p><strong>Settings constraint</strong>: The value of this parameter must match the selected structureType and determines the active values for knowledgeScene.</p>
     * <p><strong>Valid values</strong>:</p>
     * <ul>
     * <li>document: Document search. Must be used with structureType: unstructured.</li>
     * <li>table: Data query. Must be used with structureType: structured.</li>
     * <li>image: Image-based Q&amp;A. Must be used with structureType: structured.</li>
     * <li>multimedia: Audio/video search. Must be used with structureType: unstructured.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("knowledgeType")
    public String knowledgeType;

    /**
     * <p>The metadata extraction configuration. Metadata is a set of additional attributes related to unstructured data content. These attributes are integrated into text chunks as key-value pairs. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     */
    @NameInMap("metaExtractColumns")
    public java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The number of RCUs for the knowledge base (required only when pipelineCommercialType is set to enterprise). Value range: [1-200].</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pipelineCommercialCu")
    public Integer pipelineCommercialCu;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The <a href="https://help.aliyun.com/document_detail/2997110.html">specification type</a> of the knowledge base. Valid values:</p>
     * <ul>
     * <li>standard: Standard Edition.</li>
     * <li>enterprise: Ultimate Edition.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("pipelineCommercialType")
    public String pipelineCommercialType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The rate limiting strategy for knowledge base dependent links (required only when pipelineCommercialType is set to enterprise).
     * Valid values:
     * downgrade: Downgrade processing (switch to lightweight link retrieval).
     * If not specified, the default value is downgrade.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not available. Do not pass this parameter.</p>
     * </blockquote>
     * 
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

    public CreateIndexRequest setRerankInstruct(String rerankInstruct) {
        this.rerankInstruct = rerankInstruct;
        return this;
    }
    public String getRerankInstruct() {
        return this.rerankInstruct;
    }

    public CreateIndexRequest setRerankMinScore(Double rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Double getRerankMinScore() {
        return this.rerankMinScore;
    }

    public CreateIndexRequest setRerankMode(String rerankMode) {
        this.rerankMode = rerankMode;
        return this;
    }
    public String getRerankMode() {
        return this.rerankMode;
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

    public CreateIndexRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CreateIndexRequest setChunkMode(String chunkMode) {
        this.chunkMode = chunkMode;
        return this;
    }
    public String getChunkMode() {
        return this.chunkMode;
    }

    public CreateIndexRequest setConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }
    public String getConnectId() {
        return this.connectId;
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

    public CreateIndexRequest setKnowledgeScene(String knowledgeScene) {
        this.knowledgeScene = knowledgeScene;
        return this;
    }
    public String getKnowledgeScene() {
        return this.knowledgeScene;
    }

    public CreateIndexRequest setKnowledgeType(String knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public String getKnowledgeType() {
        return this.knowledgeType;
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
        /**
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Specifies whether this column participates in model responses. When enabled, the search results of this column are used as input for the large language model to generate answers. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRecall")
        public Boolean isRecall;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Specifies whether this column participates in knowledge base retrieval. When enabled, the knowledge base can search within the data of this column. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSearch")
        public Boolean isSearch;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The field name. Must be consistent with the header of the data table created in Application Data.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>School.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The field type. Must be consistent with the header of the data table created in Application Data. Valid values:</p>
         * <ul>
         * <li>string</li>
         * <li>double</li>
         * <li>long</li>
         * <li>datetime</li>
         * <li>image_url</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
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

    public static class CreateIndexRequestMetaExtractColumns extends TeaModel {
        /**
         * <p>The Chinese description of the metadata field. The description can be up to 1000 characters in length and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:). Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>AuthorName.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Specifies whether this metadata field and its value participate in the large language model\&quot;s answer generation process along with the text chunk content. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableLlm")
        public Boolean enableLlm;

        /**
         * <p>Specifies whether this metadata field and its value participate in knowledge base retrieval along with the text chunk content. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The metadata field. The field must be 1 to 50 characters in length and can contain only letters and underscores. If this parameter is specified, you must also specify the <code>Value</code> and <code>Type</code> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>author</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The extraction method for the metadata field. Valid values:</p>
         * <ul>
         * <li>constant: Constant.</li>
         * <li>variable: Variable.</li>
         * <li>custom_prompt: Large language model.</li>
         * <li>regular: Regular expression.</li>
         * <li>keywords: Keyword search.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>constant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the metadata field.</p>
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
