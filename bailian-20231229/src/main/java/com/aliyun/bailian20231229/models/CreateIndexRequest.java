// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexRequest extends TeaModel {
    /**
     * <p>You can import files synchronously when you create a knowledge base. Here, you can import all files under a specified category by specifying the category ID. We recommend that you import no more than 500 files. If you have remaining files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing them later.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The chunk size, which is the maximum number of characters in each text chunk. If the text exceeds this length:</p>
     * <ul>
     * <li><strong>Intelligent chunking</strong> (chunkMode is not specified): The text is highly likely to be truncated.</li>
     * <li><strong>Custom chunking</strong> (chunkMode is specified): The text is forcibly truncated.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;
     * The chunk size, which is the maximum number of characters in each text chunk. If the text exceeds this length, it is highly likely to be truncated.</p>
     * <p>Valid values: [1, 6000]. Default value: 500.</p>
     * <blockquote>
     * <p>If you set ChunkSize to a value less than 100, you must also set OverlapSize. You can also leave these two parameters unspecified, and the system uses the default values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * The structure of the data table, such as column names and types.</p>
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
     * <p>The description of the knowledge base. The description must be 0 to 200 characters in length and can contain English and Chinese characters.
     * Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>The enterprise help document library includes important materials such as company policies and product lists</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>You can import files synchronously when you create a knowledge base. Here, you can specify the list of files to be imported by passing file IDs. We recommend that you import no more than 10,000 files. If you have remaining files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing them later.</p>
     */
    @NameInMap("DocumentIds")
    public java.util.List<String> documentIds;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The embedding model used by the knowledge base. The embedding model is used to transform the original input prompt and knowledge text into numerical vectors for similarity comparison. Compared with the text-embedding-v3 model, the text-embedding-v4 model is comprehensively upgraded in terms of language support, code snippet vectorization effect, and selection of vector dimensions, and is suitable for most scenarios. For more information, refer to <a href="https://help.aliyun.com/document_detail/2842587.html">Quantization</a>. Valid values:</p>
     * <ul>
     * <li>text-embedding-v4</li>
     * <li>text-embedding-v3</li>
     * </ul>
     * <p>Default value: empty. In this case, the text-embedding-v3 model is used.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The embedding model used by the knowledge base. The embedding model is used to transform the original input prompt and knowledge text into numerical vectors for similarity comparison. The default text-embedding-v2 model (which cannot be changed at the moment) supports not only Chinese and English but also multiple other languages, and performs normalization on the vector results. For more information, refer to <a href="https://help.aliyun.com/document_detail/2842587.html">Quantization</a>. Valid values:</p>
     * <ul>
     * <li>text-embedding-v2</li>
     * </ul>
     * <p>Default value: empty. In this case, the text-embedding-v2 model is used.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModelName")
    public String embeddingModelName;

    /**
     * <p>Specifies whether to enable multi-turn conversation rewriting. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    /**
     * <p>The name of the knowledge base. The name must be 1 to 20 characters in length and can contain Chinese characters, English letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise help document library</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The chunk overlap size, which indicates the number of overlapping characters between the current text chunk and the previous text chunk. Valid values: [0, 1024].</p>
     * <p>Default value: 100.</p>
     * <blockquote>
     * <p>OverlapSize must be less than ChunkSize. Otherwise, chunking exceptions occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("OverlapSize")
    public Integer overlapSize;

    /**
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
     * <p>&lt;props=&quot;china&quot;&gt;Provides a natural language instruction to fine-tune the behavior of the reranking model.
     * <notice>This parameter takes effect only when rerank_mode is set to &quot;custom&quot;.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>Given a web search query, retrieve relevant passages that answer the query.</p>
     */
    @NameInMap("RerankInstruct")
    public String rerankInstruct;

    /**
     * <p>The similarity threshold. Only text chunks with a similarity score greater than this value are recalled. This parameter is used to filter the text chunks returned by the reranking model. Valid values: [0.01, 1.00].</p>
     * <p>Default value: 0.01.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Double rerankMinScore;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;
     * Specifies the instruction intervention mode of the reranking model to determine its scoring preference. Valid values:</p>
     * <ul>
     * <li><p><strong>qa</strong>: question answering mode. This is the default value. The model tends to assign higher scores to candidates that can directly answer the query. We recommend that you use this mode in question answering scenarios.</p>
     * </li>
     * <li><p><strong>similar</strong>: similarity mode. The model tends to assign higher scores to candidates that are highly consistent with the query content. We recommend that you use this mode in matching and retrieval scenarios.</p>
     * </li>
     * <li><p><strong>custom</strong>: custom mode. The ranking behavior of the model is determined by the instruction in the rerank_instruct parameter.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>qa</p>
     */
    @NameInMap("RerankMode")
    public String rerankMode;

    /**
     * <p>The reranking model used by the knowledge base. The reranking model is a scoring system external to the knowledge base. It calculates the similarity score between the user\&quot;s question and each text chunk in the knowledge base, sorts the chunks in descending order of the scores, and returns the top K text chunks with the highest scores. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
     * <li>qwen3-rerank: qwen3-rerank reranking.</li>
     * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
     * <li>gte-rerank: gte-rerank reranking.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>gte-rerank-hybrid: official reranking.</li>
     * <li>gte-rerank: gte-rerank reranking.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Default value: empty. In this case, qwen3-rerank is used.</p>
     * <blockquote>
     * <p>If you only need semantic reranking, you can use qwen3-rerank. If you need both semantic reranking and text matching features to ensure relevance, use qwen3-rerank-hybrid.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>Default value: empty. In this case, gte-rerank-hybrid is used.</p>
     * <blockquote>
     * <p>If you only need semantic reranking, you can use gte-rerank. If you need both semantic reranking and text matching features to ensure relevance, use gte-rerank-hybrid.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>gte-rerank-hybrid and gte-rerank will stop receiving updates and are not recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gte-rerank-hybrid</p>
     */
    @NameInMap("RerankModelName")
    public String rerankModelName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The sentence separator. This parameter takes effect only when chunkMode is set to <strong>regex</strong>. In other modes, this parameter does not take effect even if it is passed. You can pass a regular expression (multiple regular expressions are not supported) to split the file into small text chunks.</p>
     * <p>When you use intelligent chunking (chunkMode is not specified), leave this parameter empty.</p>
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
     * <p>The ID of the AnalyticDB for PostgreSQL instance. This parameter is required only when SinkType is set to ADB. Go to the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">AnalyticDB for PostgreSQL Instance List</a> page to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp32109xxxx</p>
     */
    @NameInMap("SinkInstanceId")
    public String sinkInstanceId;

    /**
     * <p>The region where the AnalyticDB for PostgreSQL instance resides. This parameter is required only when SinkType is set to ADB. You can call the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions">DescribeRegions</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions?spm=a2c63.p38356.0.i3">DescribeRegions</a> operation to obtain the region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SinkRegion")
    public String sinkRegion;

    /**
     * <p>The vector storage type of the knowledge base. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>BUILT_IN: stores vector data in Alibaba Cloud Model Studio.</li>
     * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features such as managing, auditing, and monitoring the database, select ADB.<blockquote>
     * <p>If you have not used ADB storage in Alibaba Cloud Model Studio, go to the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/#/knowledge-base/create">Create Knowledge Base</a>&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as the vector storage type, and complete the authorization as prompted. If you pass ADB, you must specify the SinkInstanceId and SinkRegion parameters.</p>
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
     * <p>Notice: This parameter is required in the latest SDK version. Otherwise, an error is reported when you call the SubmitIndexJob operation: Required parameter(data_sources) missing or invalid.</notice></p>
     * </blockquote>
     * <p>The source of the imported data. Valid values:</p>
     * <ul>
     * <li>DATA_CENTER_CATEGORY: the category type. This value indicates that all files under a specified category in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> are imported. You can import multiple categories at a time.</li>
     * <li>DATA_CENTER_FILE: the file type. This value indicates that specified files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> are imported. You can import multiple files at a time.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to DATA_CENTER_CATEGORY, you must specify the CategoryIds parameter. If you set this parameter to DATA_CENTER_FILE, you must specify the DocumentIds parameter.</p>
     * </blockquote>
     * <blockquote>
     * <p>To create an empty knowledge base, you can use an empty category that contains no files: set this parameter to DATA_CENTER_CATEGORY and set CategoryIds to the ID of the empty category.</p>
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
     * <li>unstructured: a knowledge base for document search or audio and video. The default use scenario for the document search type is basic document question answering. &lt;props=&quot;china&quot;&gt;To create a knowledge base for other scenarios, you must also pass the knowledgeType and knowledgeScene parameters.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>structured: a knowledge base for data querying or image question answering.</li>
     * </ul>
     * <blockquote>
     * <p>Note that the type of a knowledge base cannot be changed after it is created.</p>
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
     * <p>You can obtain the ID by clicking the ID icon next to the table name on the Tables tab of the Table Connector in <a href="https://bailian.console.aliyun.com/cn-beijing?tab=app#/connector/list">Data Connection</a>. If the list contains multiple IDs, only the first one is used.</p>
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
     * <p>Enables custom chunking and specifies the chunking strategy. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     * <p>Valid values (you cannot pass multiple values at a time):</p>
     * <ul>
     * <li><strong>length</strong>: chunks by length. The text is strictly chunked according to the ChunkSize and OverlapSize you specify. If you do not pass these two parameters, the system uses the default values (ChunkSize is 500 and OverlapSize is 100). Chunking by length does not support Separator (it does not take effect even if passed).</li>
     * <li><strong>page</strong>: chunks by page. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by page does not support OverlapSize and Separator (they do not take effect even if passed).</li>
     * <li><strong>h1</strong>: chunks by level-1 heading. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by level-1 heading does not support OverlapSize and Separator (they do not take effect even if passed).</li>
     * <li><strong>h2</strong>: chunks by level-2 heading. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by level-2 heading does not support OverlapSize and Separator (they do not take effect even if passed).</li>
     * <li><strong>regex</strong>: chunks by regular expression. In this case, you must specify the Separator parameter. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by regular expression does not support OverlapSize (it does not take effect even if passed).</li>
     * </ul>
     * <p>Default value: empty. In this case, intelligent chunking is used.</p>
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
     * <p>Specifies whether to use the first row of all .xlsx and .xls files as the header and concatenate it to each text chunk to prevent the large language model from mistakenly treating the header as a normal data row.</p>
     * <blockquote>
     * <p>Enable this feature only when all imported files are in .xlsx or .xls format and contain headers. Otherwise, do not enable it.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
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
     * <p>&lt;props=&quot;china&quot;&gt;
     * The specific knowledge type, which is used to further specify the type of data processed by the knowledge base.
     * <notice>This parameter must be provided or omitted together with knowledgeScene. It cannot be set separately. If both are omitted, the system uses the default configurations based on structureType.</notice></p>
     * <p><strong>Settings</strong> constraints: The value of this parameter must match the structureType you select and determines the active values for knowledgeScene.</p>
     * <p><strong>Valid values</strong>:</p>
     * <ul>
     * <li>document: document search. Must be used with structureType: unstructured.</li>
     * <li>table: data querying. Must be used with structureType: structured.</li>
     * <li>image: image question answering. Must be used with structureType: structured.</li>
     * <li>multimedia: audio and video search. Must be used with structureType: unstructured.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("knowledgeType")
    public String knowledgeType;

    /**
     * <p>The metadata extraction configuration. Metadata is a series of additional attributes related to the content of unstructured data. These attributes are integrated into text chunks in the form of key-value pairs. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
     */
    @NameInMap("metaExtractColumns")
    public java.util.List<CreateIndexRequestMetaExtractColumns> metaExtractColumns;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The number of RCUs for the knowledge base. This parameter is required only when pipelineCommercialType is set to enterprise. Valid values: [1, 200].</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/2997110.html">edition</a> of the knowledge base. Valid values:</p>
     * <ul>
     * <li>standard: Standard Edition</li>
     * <li>enterprise: Ultimate Edition</li>
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
     * <p>&lt;props=&quot;china&quot;&gt;The throttling handling strategy for the knowledge base dependency link. This parameter is required only when pipelineCommercialType is set to enterprise.
     * Valid values:
     * downgrade: downgrade processing (switches to lightweight link retrieval).
     * Default value: downgrade.</p>
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
         * <p>Specifies whether the column participates in model responses. If this parameter is set to true, the retrieval results of this column are used as input information when the large language model generates responses. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
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
         * <p>Specifies whether the column participates in knowledge base retrieval. If this parameter is set to true, the knowledge base is allowed to search in the data of this column. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
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
         * The field name. The name must be consistent with the header of the data table created in Application Data.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>School</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The field type. The type must be consistent with the header of the data table created in Application Data. Valid values:</p>
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
         * <p>The Chinese description of the metadata field. The description must be 0 to 1,000 characters in length and can contain Chinese characters, English letters, digits, underscores (_), hyphens (-), periods (.), and colons (:). Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Author name</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Specifies whether the metadata field and its value participate in the response generation process of the large language model together with the content of the text chunk. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableLlm")
        public Boolean enableLlm;

        /**
         * <p>Specifies whether the metadata field and its value participate in knowledge base retrieval together with the content of the text chunk. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The metadata field. The field must be 1 to 50 characters in length and can contain only English letters and underscores (_). If you specify this parameter, you must also specify the Value and Type parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>author</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value extraction method for the metadata field. Valid values:</p>
         * <ul>
         * <li>constant: constant.</li>
         * <li>variable: variable.</li>
         * <li>custom_prompt: large language model.</li>
         * <li>regular: regular expression.</li>
         * <li>keywords: keyword search.</li>
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
