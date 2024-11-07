// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexShrinkRequest extends TeaModel {
    /**
     * <p>The list of primary key IDs of the categories to be imported into the knowledge base.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

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
    public String columnsShrink;

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
     * <p>The list of primary key IDs of the documents to be imported into the knowledge base.</p>
     */
    @NameInMap("DocumentIds")
    public String documentIdsShrink;

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

    @NameInMap("metaExtractColumns")
    public String metaExtractColumnsShrink;

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

    public CreateIndexShrinkRequest setMetaExtractColumnsShrink(String metaExtractColumnsShrink) {
        this.metaExtractColumnsShrink = metaExtractColumnsShrink;
        return this;
    }
    public String getMetaExtractColumnsShrink() {
        return this.metaExtractColumnsShrink;
    }

}
