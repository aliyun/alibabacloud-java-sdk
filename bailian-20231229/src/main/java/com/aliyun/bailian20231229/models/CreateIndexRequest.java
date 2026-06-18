// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>You can import files when you create a knowledge base. Specify category IDs to import all files under the corresponding categories. We recommend importing no more than 10,000 files. If you have more files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to import them later.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The chunk size, which is the maximum number of characters for each text chunk. If this length is exceeded:</p>
     * <ul>
     * <li><p><strong>Smart chunking</strong> (the \<code>chunkMode\\</code> parameter is not specified): The text is likely to be truncated.</p>
     * </li>
     * <li><p><strong>Custom chunking</strong> (the \<code>chunkMode\\</code> parameter is specified): The text is forcibly truncated.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The chunk size, which is the maximum number of characters for each text chunk. If this length is exceeded, the text is likely to be truncated.</p>
     * <p>The value must be between 1 and 6000. If you do not specify this parameter, the default value 500 is used.</p>
     * <blockquote>
     * <p>If you set \<code>ChunkSize\\</code> to a value less than 100, you must also set \<code>OverlapSize\\</code>. You can also leave both parameters unspecified, and the system will use the default values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The structure of the data table (column names, types, etc.).</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
     * </blockquote>
     */
    @NameInMap("Columns")
    public java.util.List<CreateIndexRequestColumns> columns;

    /**
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("CreateIndexType")
    public String createIndexType;

    /**
     * <p>The description of the knowledge base. The description can be 0 to 1,000 English or Chinese characters in length.
     * The default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>企业帮助文档库包括了公司制度、产品清单等重要资料。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>You can import files when you create a knowledge base. Specify a list of files to import by providing their IDs. We recommend importing no more than 10,000 files. If you have more files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to import them later.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The vector model used by the knowledge base. A vector model converts the original input prompt and knowledge text into numerical vectors to compare their similarity. The text-embedding-v4 model is a comprehensive upgrade over the text-embedding-v3 model in terms of language support, vectorization of code snippets, and vector dimension selection. It is suitable for most scenarios. For more information, see <a href="https://help.aliyun.com/document_detail/2842587.html">Vectorization</a>. Valid values:</p>
     * <ul>
     * <li><p>text-embedding-v4</p>
     * </li>
     * <li><p>text-embedding-v3</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, \<code>text-embedding-v3\\</code> is used.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>The vector model used by the knowledge base. A vector model converts the original input prompt and knowledge text into numerical vectors to compare their similarity. The default text-embedding-v2 model (which cannot be changed for now) supports both Chinese and English, along with multiple other languages, and normalizes the vector results. For more information, see <a href="https://help.aliyun.com/document_detail/2842587.html">Vectorization</a>. Valid values:</p>
     * </li>
     * <li><p>text-embedding-v2</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, \<code>text-embedding-v2\\</code> is used.</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>Specifies whether to enable multi-turn conversation rewriting. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, this feature is enabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    /**
     * <p>The name of the knowledge base. The name can be 1 to 20 characters in length and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>企业帮助文档库</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The overlap size, which is the number of overlapping characters between the current text chunk and the previous one. The value must be between 0 and 1024.</p>
     * <p>If you do not specify this parameter, the default value 100 is used.</p>
     * <blockquote>
     * <p>\<code>OverlapSize\\</code> must be smaller than \<code>ChunkSize\\</code>. Otherwise, chunking errors will occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>The name of the database. This parameter is required when creating a data query knowledge base.</p>
     * <p>The database must exist in the data source specified by \<code>datasourceCode\\</code>.</p>
     */
    @NameInMap("RerankInstruct")
    public String rerankInstruct;

    /**
     * <p>The similarity threshold. Only text chunks with a similarity score greater than this value are recalled. This is used to filter the text chunks returned by the reranking model. The value must be between 0.01 and 1.00.</p>
     * <p>If you do not specify this parameter, the default value 0.01 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <p>The name of the data table. This parameter is required when creating a data query knowledge base.</p>
     * <p>The data table must exist in the data source specified by \<code>connectId\\</code> or \<code>datasourceCode\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qa</p>
     */
    @NameInMap("RerankMode")
    public String rerankMode;

    /**
     * <p>The reranking model used by the knowledge base. The reranking model is an external scoring system that calculates a similarity score between the user\&quot;s question and each text chunk in the knowledge base, sorts them in descending order, and returns the top K text chunks. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</p>
     * </li>
     * <li><p>qwen3-rerank: qwen3-rerank reranking.</p>
     * </li>
     * <li><p>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</p>
     * </li>
     * <li><p>gte-rerank: gte-rerank reranking.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>gte-rerank-hybrid: Official reranking.</p>
     * </li>
     * <li><p>gte-rerank: gte-rerank reranking.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>If you do not specify this parameter, \<code>qwen3-rerank\\</code> is used.</p>
     * <blockquote>
     * <p>Use \<code>qwen3-rerank\\</code> if you only need semantic sorting. Use \<code>qwen3-rerank-hybrid\\</code> if you need both semantic sorting and text-matching features to ensure relevance.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>If you do not specify this parameter, \<code>gte-rerank-hybrid\\</code> is used.</p>
     * <blockquote>
     * <p>Use \<code>gte-rerank\\</code> if you only need semantic sorting. Use \<code>gte-rerank-hybrid\\</code> if you need both semantic sorting and text-matching features to ensure relevance.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The \<code>gte-rerank-hybrid\\</code> and \<code>gte-rerank\\</code> models are no longer updated and are not recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The sentence separator. This parameter takes effect only when \<code>chunkMode\\</code> is set to <strong>regex</strong>. It is ignored in other modes, even if specified. You can enter a regular expression (multiple expressions are not supported) to split the file into smaller text chunks.</p>
     * <p>For smart chunking (the \<code>chunkMode\\</code> parameter is not specified), you can leave this parameter empty.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>(?&lt;=。)</p>
     */
    @NameInMap("Separator")
    public String separator;

    /**
     * <p>The ID of the AnalyticDB for PostgreSQL instance. This parameter is required only when \<code>SinkType\\</code> is set to ADB. Go to the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">AnalyticDB for PostgreSQL instance list</a> page to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp32109xxxx</p>
     */
    @NameInMap("SinkInstanceId")
    public String sinkInstanceId;

    /**
     * <p>The region where the AnalyticDB for PostgreSQL instance is located. This parameter is required only when \<code>SinkType\\</code> is set to ADB. You can call the &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions?spm=a2c63.p38356.0.i3">DescribeRegions </a>operation to obtain a list of regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SinkRegion")
    public String sinkRegion;

    /**
     * <p>The storage class for the knowledge base vectors. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge bases</a>. Valid values:</p>
     * <ul>
     * <li><p>BUILT_IN: Hosts the vector data on the Alibaba Cloud Model Studio platform.</p>
     * </li>
     * <li><p>ADB: AnalyticDB for PostgreSQL. We recommend choosing ADB if you need advanced features such as database management, auditing, and monitoring.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you have not used ADB storage on Alibaba Cloud Model Studio, go to the &lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/#/knowledge-base/create">Create Knowledge Base</a> page, set the vector storage class to ADB-PG, and follow the on-screen instructions to grant the required permissions. If you set this parameter to ADB, you must specify the \<code>SinkInstanceId\\</code> and \<code>SinkRegion\\</code> parameters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILT_IN</p>
     */
    @NameInMap("SinkType")
    public String sinkType;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>In the latest SDK version, this parameter is required. Otherwise, calling the SubmitIndexJob operation will result in the error: Required parameter(data_sources) missing or invalid.</p>
     * <p>The source of the imported data. Valid values:</p>
     * <ul>
     * <li><p>DATA_CENTER_CATEGORY: Category type. Imports all files under the specified categories in &lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. You can import multiple categories at the same time.</p>
     * </li>
     * <li><p>DATA_CENTER_FILE: File type. Imports the specified files from &lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. You can import multiple files at the same time.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to DATA_CENTER_CATEGORY, you must specify the \<code>CategoryIds\\</code> parameter. If you set this parameter to DATA_CENTER_FILE, you must specify the \<code>DocumentIds\\</code> parameter.</p>
     * </blockquote>
     * <blockquote>
     * <p>To create an empty knowledge base, use an empty category that contains no files. Set this parameter to DATA_CENTER_CATEGORY and specify the ID of the empty category for \<code>CategoryIds\\</code>.</p>
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
     * <p>The type of the knowledge base.</p>
     * <p><strong>Valid values</strong>:</p>
     * <ul>
     * <li>unstructured: A knowledge base for document search, audio, or video. The default scenario for document search is basic document Q\&amp;A.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>structured: A knowledge base for data query or image Q\&amp;A.</li>
     * </ul>
     * <blockquote>
     * <p>The type of a knowledge base cannot be changed after it is created.</p>
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
     * <p>Obtain the table ID on the Tables tab of the table connector in Data Connections by clicking the ID icon next to the table name. If the list contains multiple IDs, only the first one is used.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
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
     * <p>Enables custom chunking and specifies the chunking policy. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge bases</a>.</p>
     * <p>Possible values (only one value can be specified at a time):</p>
     * <ul>
     * <li><p><strong>length</strong>: Chunks by length. The text is strictly chunked according to the \<code>ChunkSize\\</code> and \<code>OverlapSize\\</code> you specify. If you do not specify these two parameters, the system uses the default values (\<code>ChunkSize\\</code> is 500, \<code>OverlapSize\\</code> is 100). Chunking by length does not support \<code>Separator\\</code> (it is ignored even if specified).</p>
     * </li>
     * <li><p><strong>page</strong>: Chunks by page. If \<code>ChunkSize\\</code> is specified, it is also considered during chunking (if not specified, the default value 500 is used). Chunking by page does not support \<code>OverlapSize\\</code> or \<code>Separator\\</code> (they are ignored even if specified).</p>
     * </li>
     * <li><p><strong>h1</strong>: Chunks by level-1 heading. If \<code>ChunkSize\\</code> is specified, it is also considered during chunking (if not specified, the default value 500 is used). Chunking by level-1 heading does not support \<code>OverlapSize\\</code> or \<code>Separator\\</code> (they are ignored even if specified).</p>
     * </li>
     * <li><p><strong>h2</strong>: Chunks by level-2 heading. If \<code>ChunkSize\\</code> is specified, it is also considered during chunking (if not specified, the default value 500 is used). Chunking by level-2 heading does not support \<code>OverlapSize\\</code> or \<code>Separator\\</code> (they are ignored even if specified).</p>
     * </li>
     * <li><p><strong>regex</strong>: Chunks by regular expression. You must specify the \<code>Separator\\</code> parameter. If \<code>ChunkSize\\</code> is specified, it is also considered during chunking (if not specified, the default value 500 is used). Chunking by regular expression does not support \<code>OverlapSize\\</code> (it is ignored even if specified).</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, smart chunking is used by default.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
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
     * <p>Specifies whether to treat the first row of all .xlsx and .xls files as the table header and append it to each text chunk. This prevents the LLM from treating the header as a regular data row.</p>
     * <blockquote>
     * <p>We recommend enabling this feature only when all imported files are in .xlsx or .xls format and contain a header. Otherwise, do not enable it.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, this feature is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableHeaders")
    public Boolean enableHeaders;

    @NameInMap("knowledgeScene")
    public String knowledgeScene;

    /**
     * <p>The data source code. This parameter is required when creating a data query knowledge base and is used with \<code>table\\</code> and \<code>database\\</code>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>We recommend using the new \<code>connectId\\</code> parameter, which you can obtain from the data connector card on the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/connector/list">Data Connections</a> page. This parameter is still compatible but will no longer be maintained in the future.</p>
     * <blockquote>
     * <ul>
     * <li>This operation does not support associating custom databases. Use the Alibaba Cloud Model Studio console to create them.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("knowledgeType")
    public String knowledgeType;

    /**
     * <p>The metadata extraction configuration. Metadata is a series of additional attributes related to unstructured data content. These attributes are integrated into text chunks as key-value pairs. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge bases</a>.</p>
     */
    @NameInMap("metaExtractColumns")
    public java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The number of RCUs for the knowledge base. This parameter is required only when \<code>pipelineCommercialType\\</code> is set to \<code>enterprise\\</code>. The value must be between 1 and 200.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pipelineCommercialCu")
    public Integer pipelineCommercialCu;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The <a href="https://help.aliyun.com/document_detail/2997110.html">edition type</a> of the knowledge base. Valid values:</p>
     * <ul>
     * <li><p>standard: Standard Edition</p>
     * </li>
     * <li><p>enterprise: Ultimate Edition</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("pipelineCommercialType")
    public String pipelineCommercialType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The rate limiting policy for the knowledge base dependency chain. This parameter is required only when \<code>pipelineCommercialType\\</code> is set to \<code>enterprise\\</code>.
     * Value:
     * downgrade: Degrades the service (switches to using a lightweight retrieval chain).
     * If you do not specify this parameter, the default value \<code>downgrade\\</code> is used.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not yet available. Do not specify it.</p>
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
         * <p>This parameter is not yet available. Do not specify it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Specifies whether to participate in model response generation. If enabled, the retrieval results from this column are used as input for the LLM to generate an answer. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRecall")
        public Boolean isRecall;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Specifies whether to participate in knowledge base retrieval. If enabled, the knowledge base is allowed to search for data in this column. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSearch")
        public Boolean isSearch;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The field name. It must be consistent with the table header of the data table created in Application Data.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>学校</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The field type. It must be consistent with the table header of the data table created in Application Data. Valid values:</p>
         * <ul>
         * <li><p>string</p>
         * </li>
         * <li><p>double</p>
         * </li>
         * <li><p>long</p>
         * </li>
         * <li><p>datetime</p>
         * </li>
         * <li><p>image_url</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify it.</p>
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
         * <p>The Chinese description of the metadata field. The description can be 0 to 1,000 characters in length and can contain Chinese characters, letters, digits, underscores (_), hyphens (-), periods (.), and colons (:). The default value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>作者名</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>If enabled, the metadata field and its value are used along with the text chunk content in the answer generation process of the LLM. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableLlm")
        public Boolean enableLlm;

        /**
         * <p>If enabled, the metadata field and its value are used along with the text chunk content in the knowledge base retrieval process. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The metadata field. The field name can be 1 to 50 characters in length and must consist of letters or underscores. If you specify this parameter, you must also specify the \<code>Value\\</code> and \<code>Type\\</code> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>author</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The method for obtaining the value of the metadata field. Valid values:</p>
         * <ul>
         * <li><p>constant: Constant.</p>
         * </li>
         * <li><p>variable: Variable.</p>
         * </li>
         * <li><p>custom_prompt: Large Language Model (LLM).</p>
         * </li>
         * <li><p>regular: Regular expression.</p>
         * </li>
         * <li><p>keywords: Keyword search.</p>
         * </li>
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
