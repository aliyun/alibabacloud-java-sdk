// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentRequest extends TeaModel {
    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>The document collection is created by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query existing document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The text content used for retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>What is AnalyticDB for PostgreSQL?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the source image file to search in image-to-image search scenarios.</p>
     * <blockquote>
     * <p>The image file must have a file extension. Supported image extensions: bmp, jpg, jpeg, png, and tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.jpg</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The publicly accessible URL of the image file in image-to-image search scenarios.</p>
     * <blockquote>
     * <p>The image file must have a file extension. Supported image extensions: bmp, jpg, jpeg, png, and tiff.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xx/myImage.jpg">https://xx/myImage.jpg</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The filter condition for the data to query, in SQL WHERE clause format. The filter is an expression that returns a Boolean value (true or false). Conditions can be simple comparison operators such as equal to (=), not equal to (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), and less than or equal to (&lt;=). Conditions can also be more complex expressions combined with logical operators (AND, OR, NOT), as well as conditions using the IN, BETWEEN, and LIKE keywords.</p>
     * <blockquote>
     * <ul>
     * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;test\&quot; AND name like \&quot;test%\&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to enable knowledge graph enhancement. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GraphEnhance")
    public Boolean graphEnhance;

    /**
     * <p>The knowledge graph retrieval parameters.</p>
     */
    @NameInMap("GraphSearchArgs")
    public QueryContentRequestGraphSearchArgs graphSearchArgs;

    /**
     * <p>The multi-channel recall algorithm. Default value: empty, which indicates that the dense vector and full-text index scores are directly compared and sorted.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RRF: Reciprocal Rank Fusion. A parameter k controls the fusion effect. For more information, see the HybridSearchArgs configuration.</li>
     * <li>Weight: Weighted sorting. Parameters control the score weights of AISearch retrieve and full-text index results before sorting. For more information, see the HybridSearchArgs configuration.</li>
     * <li>Cascaded: Full-text index retrieve is performed first, followed by AISearch retrieve based on the full-text index results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("HybridSearch")
    public String hybridSearch;

    /**
     * <p>The algorithm parameters for multi-channel recall. RRF and Weight are supported. HybridPathsSetting specifies the recall paths: dense vectors (dense), sparse vectors (sparse), and full-text index (fulltext). If this value is empty, dense vectors (dense) and full-text index (fulltext) are used by default.</p>
     * <ul>
     * <li>RRF: Specifies the constant k in the score calculation formula <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
     * </ul>
     * <pre><code>{
     *   &quot;HybridPathsSetting&quot;: {
     *     &quot;paths&quot;: &quot;dense,fulltext&quot;
     *   },
     *   &quot;RRF&quot;: {
     *     &quot;k&quot;: 60
     *   }
     * }
     * </code></pre>
     * <ul>
     * <li>Weight: <ul>
     * <li>Dual-path recall (without specifying HybridPathsSetting, only specifying alpha):<ul>
     * <li>Formula: alpha * dense_score + (1-alpha) * fulltext_score. The alpha parameter specifies the score weight between dense vectors and full-text index retrieve. Valid values: 0 to 1, where 0 indicates full-text index only and 1 indicates dense vector only:</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>{ 
     *    &quot;Weight&quot;: {
     *     &quot;alpha&quot;: 0.5
     *    }
     * }
     * </code></pre>
     * <ul>
     * <li>Three-path recall pattern:<ul>
     * <li>Formula: normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score. The dense, sparse, and fulltext values represent the weights for dense vectors, sparse vectors, and full-text index retrieve respectively. Valid values: greater than or equal to 0. The system automatically performs normalization of the weights to 0 to 1 (normalized_x = x / (dense + sparse + fulltext)).</li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>{
     *   &quot;HybridPathsSetting&quot;: {
     *      &quot;paths&quot;: &quot;dense,sparse,fulltext&quot;
     *    },
     *   &quot;Weight&quot;: {
     *     &quot;dense&quot;: 0.5,
     *     &quot;sparse&quot;: 0.3,
     *     &quot;fulltext&quot;: 0.2
     *   }
     * }
     * </code></pre>
     */
    @NameInMap("HybridSearchArgs")
    public java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs;

    /**
     * <p>Specifies whether to synchronously return the URL of the document. By default, the URL is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeFileUrl")
    public Boolean includeFileUrl;

    /**
     * <p>The metadata fields to return. Default value: empty. Separate multiple fields with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>title,page</p>
     */
    @NameInMap("IncludeMetadataFields")
    public String includeMetadataFields;

    /**
     * <p>Specifies whether to return vectors. Default value: false.</p>
     * <blockquote>
     * <ul>
     * <li><strong>false</strong>: Does not return vectors.</li>
     * <li><strong>true</strong>: Returns vectors.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeVector")
    public Boolean includeVector;

    /**
     * <p>The similarity algorithm used for retrieval. If this value is empty, the algorithm specified when the knowledge base was created is used. Leave this parameter empty unless you have specific requirements.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>l2</strong>: Euclidean distance.</li>
     * <li><strong>ip</strong>: inner product distance.</li>
     * <li><strong>cosine</strong>: cosine similarity.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cosine</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The namespace. Default value: public.</p>
     * <blockquote>
     * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and query namespaces by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace.</p>
     * <blockquote>
     * <p>This value is specified by the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    /**
     * <p>The offset for paged query. Used for paging through results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The field used for sorting. Default value: empty.</p>
     * <p>The field must belong to metadata or a default field in the table, such as id. Supported formats:</p>
     * <p>A single field, such as chunk_id.
     * Multiple fields separated by commas, such as block_id, chunk_id.
     * Descending order, such as block_id DESC, chunk_id DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>created_at</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recall window. When this value is not empty, additional context around the retrieval results is returned. The format is a two-element array: List&lt;A, B&gt;, where -10&lt;=A&lt;=0 and 0&lt;=B&lt;=10.</p>
     * <blockquote>
     * <ul>
     * <li>Use this parameter when documents are split into overly small chunks and retrieval may lose contextual information.</li>
     * <li>Reranking takes priority over windowing. Reranking is performed first, followed by windowing.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("RecallWindow")
    public java.util.List<Integer> recallWindow;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reranking factor. When this value is not empty, the AISearch retrieve results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
     * <blockquote>
     * <ul>
     * <li>Reranking is slow when documents are sparsely chunked.</li>
     * <li>The total number of reranked results (TopK × Factor, rounded up) should not exceed 50.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The rerank model parameters.</p>
     */
    @NameInMap("RerankModel")
    public QueryContentRequestRerankModel rerankModel;

    /**
     * <p>The number of top results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>The validity period of the returned image URL.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>Supports seconds (s) and days (d) as units. For example, 300s indicates a validity period of 300 seconds, and 60d indicates a validity period of 60 days.</li>
     * <li>Valid values: 60s to 365d.</li>
     * <li>Default value: 7200s (2 hours).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7200s</p>
     */
    @NameInMap("UrlExpiration")
    public String urlExpiration;

    /**
     * <p>(Deprecated) Specifies whether to use full-text retrieval (dual-path recall). Default value: false, which indicates that only vector retrieval is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFullTextRetrieval")
    public Boolean useFullTextRetrieval;

    public static QueryContentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContentRequest self = new QueryContentRequest();
        return TeaModel.build(map, self);
    }

    public QueryContentRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public QueryContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryContentRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryContentRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryContentRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public QueryContentRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public QueryContentRequest setGraphEnhance(Boolean graphEnhance) {
        this.graphEnhance = graphEnhance;
        return this;
    }
    public Boolean getGraphEnhance() {
        return this.graphEnhance;
    }

    public QueryContentRequest setGraphSearchArgs(QueryContentRequestGraphSearchArgs graphSearchArgs) {
        this.graphSearchArgs = graphSearchArgs;
        return this;
    }
    public QueryContentRequestGraphSearchArgs getGraphSearchArgs() {
        return this.graphSearchArgs;
    }

    public QueryContentRequest setHybridSearch(String hybridSearch) {
        this.hybridSearch = hybridSearch;
        return this;
    }
    public String getHybridSearch() {
        return this.hybridSearch;
    }

    public QueryContentRequest setHybridSearchArgs(java.util.Map<String, java.util.Map<String, ?>> hybridSearchArgs) {
        this.hybridSearchArgs = hybridSearchArgs;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getHybridSearchArgs() {
        return this.hybridSearchArgs;
    }

    public QueryContentRequest setIncludeFileUrl(Boolean includeFileUrl) {
        this.includeFileUrl = includeFileUrl;
        return this;
    }
    public Boolean getIncludeFileUrl() {
        return this.includeFileUrl;
    }

    public QueryContentRequest setIncludeMetadataFields(String includeMetadataFields) {
        this.includeMetadataFields = includeMetadataFields;
        return this;
    }
    public String getIncludeMetadataFields() {
        return this.includeMetadataFields;
    }

    public QueryContentRequest setIncludeVector(Boolean includeVector) {
        this.includeVector = includeVector;
        return this;
    }
    public Boolean getIncludeVector() {
        return this.includeVector;
    }

    public QueryContentRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryContentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryContentRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public QueryContentRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public QueryContentRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryContentRequest setRecallWindow(java.util.List<Integer> recallWindow) {
        this.recallWindow = recallWindow;
        return this;
    }
    public java.util.List<Integer> getRecallWindow() {
        return this.recallWindow;
    }

    public QueryContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryContentRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryContentRequest setRerankModel(QueryContentRequestRerankModel rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public QueryContentRequestRerankModel getRerankModel() {
        return this.rerankModel;
    }

    public QueryContentRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public QueryContentRequest setUrlExpiration(String urlExpiration) {
        this.urlExpiration = urlExpiration;
        return this;
    }
    public String getUrlExpiration() {
        return this.urlExpiration;
    }

    public QueryContentRequest setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
        this.useFullTextRetrieval = useFullTextRetrieval;
        return this;
    }
    public Boolean getUseFullTextRetrieval() {
        return this.useFullTextRetrieval;
    }

    public static class QueryContentRequestGraphSearchArgs extends TeaModel {
        /**
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GraphTopK")
        public Integer graphTopK;

        public static QueryContentRequestGraphSearchArgs build(java.util.Map<String, ?> map) throws Exception {
            QueryContentRequestGraphSearchArgs self = new QueryContentRequestGraphSearchArgs();
            return TeaModel.build(map, self);
        }

        public QueryContentRequestGraphSearchArgs setGraphTopK(Integer graphTopK) {
            this.graphTopK = graphTopK;
            return this;
        }
        public Integer getGraphTopK() {
            return this.graphTopK;
        }

    }

    public static class QueryContentRequestRerankModel extends TeaModel {
        /**
         * <p>This parameter can be set when RerankModel.Name is qwen3-rerank.
         * Adds a custom sorting task type description. This parameter guides the model to adopt different sorting strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the rerank model. Valid values: qwen3-rerank, gte-rerank-v2.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RerankMetadataFields")
        public String rerankMetadataFields;

        public static QueryContentRequestRerankModel build(java.util.Map<String, ?> map) throws Exception {
            QueryContentRequestRerankModel self = new QueryContentRequestRerankModel();
            return TeaModel.build(map, self);
        }

        public QueryContentRequestRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public QueryContentRequestRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryContentRequestRerankModel setRerankMetadataFields(String rerankMetadataFields) {
            this.rerankMetadataFields = rerankMetadataFields;
            return this;
        }
        public String getRerankMetadataFields() {
            return this.rerankMetadataFields;
        }

    }

}
