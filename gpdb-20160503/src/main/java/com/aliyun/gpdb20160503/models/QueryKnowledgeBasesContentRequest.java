// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentRequest extends TeaModel {
    /**
     * <p>The text content to search for.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>What is ADBPG?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view the details of all AnalyticDB for PostgreSQL instances in a specific region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method for merging results from multiple knowledge bases. The default value is <code>RRF</code>. Valid values:</p>
     * <ul>
     * <li><p>RRF</p>
     * </li>
     * <li><p>Weight</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("MergeMethod")
    public String mergeMethod;

    /**
     * <p>The arguments for the specified <code>MergeMethod</code>.</p>
     */
    @NameInMap("MergeMethodArgs")
    public QueryKnowledgeBasesContentRequestMergeMethodArgs mergeMethodArgs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reranking factor. If specified, the system reranks the final merged results. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
     * <blockquote>
     * <ul>
     * <li><p>Sparse document chunking reduces reranking efficiency.</p>
     * </li>
     * <li><p>We recommend that the number of items to rerank (TopK × Factor, rounded up) does not exceed 50.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>Parameters for the rerank model applied to the final merged results.</p>
     */
    @NameInMap("RerankModel")
    public QueryKnowledgeBasesContentRequestRerankModel rerankModel;

    /**
     * <p>The source collections to search.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCollection")
    public java.util.List<QueryKnowledgeBasesContentRequestSourceCollection> sourceCollection;

    /**
     * <p>The number of top results to return after the results from all recall paths are merged.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Long topK;

    public static QueryKnowledgeBasesContentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeBasesContentRequest self = new QueryKnowledgeBasesContentRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeBasesContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryKnowledgeBasesContentRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryKnowledgeBasesContentRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public QueryKnowledgeBasesContentRequest setMergeMethodArgs(QueryKnowledgeBasesContentRequestMergeMethodArgs mergeMethodArgs) {
        this.mergeMethodArgs = mergeMethodArgs;
        return this;
    }
    public QueryKnowledgeBasesContentRequestMergeMethodArgs getMergeMethodArgs() {
        return this.mergeMethodArgs;
    }

    public QueryKnowledgeBasesContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryKnowledgeBasesContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryKnowledgeBasesContentRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryKnowledgeBasesContentRequest setRerankModel(QueryKnowledgeBasesContentRequestRerankModel rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public QueryKnowledgeBasesContentRequestRerankModel getRerankModel() {
        return this.rerankModel;
    }

    public QueryKnowledgeBasesContentRequest setSourceCollection(java.util.List<QueryKnowledgeBasesContentRequestSourceCollection> sourceCollection) {
        this.sourceCollection = sourceCollection;
        return this;
    }
    public java.util.List<QueryKnowledgeBasesContentRequestSourceCollection> getSourceCollection() {
        return this.sourceCollection;
    }

    public QueryKnowledgeBasesContentRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public static class QueryKnowledgeBasesContentRequestMergeMethodArgsRrf extends TeaModel {
        /**
         * <p>The constant <code>k</code> in the scoring formula <code>1/(k+rank_i)</code>. It must be a positive integer greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("K")
        public Long k;

        public static QueryKnowledgeBasesContentRequestMergeMethodArgsRrf build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestMergeMethodArgsRrf self = new QueryKnowledgeBasesContentRequestMergeMethodArgsRrf();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestMergeMethodArgsRrf setK(Long k) {
            this.k = k;
            return this;
        }
        public Long getK() {
            return this.k;
        }

    }

    public static class QueryKnowledgeBasesContentRequestMergeMethodArgsWeight extends TeaModel {
        /**
         * <p>An array of weights for each source collection.</p>
         */
        @NameInMap("Weights")
        public java.util.List<Double> weights;

        public static QueryKnowledgeBasesContentRequestMergeMethodArgsWeight build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestMergeMethodArgsWeight self = new QueryKnowledgeBasesContentRequestMergeMethodArgsWeight();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestMergeMethodArgsWeight setWeights(java.util.List<Double> weights) {
            this.weights = weights;
            return this;
        }
        public java.util.List<Double> getWeights() {
            return this.weights;
        }

    }

    public static class QueryKnowledgeBasesContentRequestMergeMethodArgs extends TeaModel {
        /**
         * <p>The parameters that you can configure when <code>MergeMethod</code> is set to <code>RRF</code>.</p>
         */
        @NameInMap("Rrf")
        public QueryKnowledgeBasesContentRequestMergeMethodArgsRrf rrf;

        /**
         * <p>The parameters that you can configure when <code>MergeMethod</code> is set to <code>Weight</code>.</p>
         */
        @NameInMap("Weight")
        public QueryKnowledgeBasesContentRequestMergeMethodArgsWeight weight;

        public static QueryKnowledgeBasesContentRequestMergeMethodArgs build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestMergeMethodArgs self = new QueryKnowledgeBasesContentRequestMergeMethodArgs();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestMergeMethodArgs setRrf(QueryKnowledgeBasesContentRequestMergeMethodArgsRrf rrf) {
            this.rrf = rrf;
            return this;
        }
        public QueryKnowledgeBasesContentRequestMergeMethodArgsRrf getRrf() {
            return this.rrf;
        }

        public QueryKnowledgeBasesContentRequestMergeMethodArgs setWeight(QueryKnowledgeBasesContentRequestMergeMethodArgsWeight weight) {
            this.weight = weight;
            return this;
        }
        public QueryKnowledgeBasesContentRequestMergeMethodArgsWeight getWeight() {
            return this.weight;
        }

    }

    public static class QueryKnowledgeBasesContentRequestRerankModel extends TeaModel {
        /**
         * <p>This parameter can be set only when <code>RerankModel.Name</code> is <code>qwen3-rerank</code>. Use this parameter to provide a custom instruction that guides the model\&quot;s ranking strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the rerank model. Valid values: <code>qwen3-rerank</code> and <code>gte-rerank-v2</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static QueryKnowledgeBasesContentRequestRerankModel build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestRerankModel self = new QueryKnowledgeBasesContentRequestRerankModel();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public QueryKnowledgeBasesContentRequestRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs extends TeaModel {
        /**
         * <p>The number of top entities and relationship edges to return. The default value is 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GraphTopK")
        public Long graphTopK;

        public static QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs self = new QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs setGraphTopK(Long graphTopK) {
            this.graphTopK = graphTopK;
            return this;
        }
        public Long getGraphTopK() {
            return this.graphTopK;
        }

    }

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel extends TeaModel {
        /**
         * <p>This parameter can be set only when <code>RerankModel.Name</code> is <code>qwen3-rerank</code>. Use this parameter to provide a custom instruction that guides the model\&quot;s ranking strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the rerank model. Valid values: <code>qwen3-rerank</code> and <code>gte-rerank-v2</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel self = new QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>A filter expression for the data to retrieve, formatted as a SQL <code>WHERE</code> clause. This is a Boolean expression that evaluates to <code>true</code> or <code>false</code>. The expression can include simple comparison operators (such as <code>=</code>, <code>&lt;&gt;</code>, <code>!=</code>, <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, and <code>&lt;=</code>), logical operators (<code>AND</code>, <code>OR</code>, <code>NOT</code>), and keywords such as <code>IN</code>, <code>BETWEEN</code>, and <code>LIKE</code>.</p>
         * <blockquote>
         * <ul>
         * <li>For syntax details, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">PostgreSQL WHERE</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>id = \&quot;llm-52tvykqt6u67iw73_j6ovptwjk7_file_6ce3da1f7e69495d9f491f2180c86973_11967297\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Specifies whether to enable knowledge graph enhancement. The default value is <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        /**
         * <p>Parameters for the graph search.</p>
         */
        @NameInMap("GraphSearchArgs")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The hybrid search algorithm. If this parameter is not specified, the system directly compares and sorts the scores from dense vector and full-text searches.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code>: Reciprocal rank fusion. Uses a parameter <code>k</code> to control the fusion effect. For more information, see the <code>HybridSearchArgs</code> parameter.</p>
         * </li>
         * <li><p><code>Weight</code>: Weighted ranking. Uses parameters to control the score weights from different retrieval paths, such as dense vector and full-text searches, before sorting. For more information, see the <code>HybridSearchArgs</code> parameter.</p>
         * </li>
         * <li><p><code>Cascaded</code>: Performs a full-text search first, and then performs a vector search on the results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cascaded</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The parameters for the hybrid search algorithm. <code>RRF</code> and <code>Weight</code> are supported. <code>HybridPathsSetting</code> specifies the retrieval paths: dense vectors (<code>dense</code>), sparse vectors (<code>sparse</code>), and full-text search (<code>fulltext</code>). If this parameter is not specified, the default paths are <code>dense</code> and <code>fulltext</code>.</p>
         * <ul>
         * <li><code>RRF</code>: Specifies the constant <code>k</code> in the scoring formula <code>1/(k+rank_i)</code>. <code>k</code> must be a positive integer greater than 1. Format:</li>
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
         * <li><p><code>Weight</code>:</p>
         * <ul>
         * <li><p>Two-path retrieval (the default if you do not specify <code>HybridPathsSetting</code>):</p>
         * <ul>
         * <li>Scoring formula: <code>alpha * dense_score + (1-alpha) * fulltext_score</code>. The <code>alpha</code> parameter represents the score weight of dense vectors relative to full-text search. The value must be in the range of [0, 1]. A value of 0 indicates full-text search only, and a value of 1 indicates dense vector search only.</li>
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
         * <li><p>Three-path retrieval:</p>
         * <ul>
         * <li>Scoring formula: <code>normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score</code>. The <code>dense</code>, <code>sparse</code>, and <code>fulltext</code> parameters represent the weights for dense vectors, sparse vectors, and full-text search, respectively. The value of each weight must be greater than or equal to 0. The system automatically normalizes the weights to a range of [0, 1] (for example, <code>normalized_x = x / (dense + sparse + fulltext)</code>).</li>
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
        public java.util.Map<String, ?> hybridSearchArgs;

        /**
         * <p>The distance metric used for building the vector index. Valid values:</p>
         * <ul>
         * <li><p><code>l2</code>: Euclidean distance.</p>
         * </li>
         * <li><p><code>ip</code>: Inner product distance.</p>
         * </li>
         * <li><p><code>cosine</code>: Cosine similarity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        /**
         * <p>The offset for paged queries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>Specifies the field by which to sort the results. By default, this parameter is empty.</p>
         * <p>The field must be a metadata field or a default field in the table, such as <code>id</code>. The following formats are supported:</p>
         * <p>A single field, such as <code>chunk_id</code>. Multiple fields separated by commas, such as <code>block_id, chunk_id</code>. Descending order, such as <code>block_id DESC, chunk_id DESC</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>file_id,sort_num</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <p>The recall window. If specified, adds context from surrounding document chunks to the search results. The format is a two-element array <code>[A, B]</code>, where <code>-10 &lt;= A &lt;= 0</code> and <code>0 &lt;= B &lt;= 10</code>.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is recommended for finely chunked documents where retrieval might otherwise lose context.</p>
         * </li>
         * <li><p>The system applies reranking before applying the recall window.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The reranking factor. If specified, the system reranks the results from this source collection before they are merged. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li><p>Sparse document chunking reduces reranking efficiency.</p>
         * </li>
         * <li><p>We recommend that the number of items to rerank (TopK × Factor, rounded up) does not exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>Parameters for the rerank model applied to the results from this specific source collection before the final merge.</p>
         */
        @NameInMap("RerankModel")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return from this source collection.</p>
         * 
         * <strong>example:</strong>
         * <p>776</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text search, which enables two-path retrieval. The default value is <code>false</code>, which indicates that only vector retrieval is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseFullTextRetrieval")
        public Boolean useFullTextRetrieval;

        public static QueryKnowledgeBasesContentRequestSourceCollectionQueryParams build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestSourceCollectionQueryParams self = new QueryKnowledgeBasesContentRequestSourceCollectionQueryParams();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setGraphEnhance(Boolean graphEnhance) {
            this.graphEnhance = graphEnhance;
            return this;
        }
        public Boolean getGraphEnhance() {
            return this.graphEnhance;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setGraphSearchArgs(QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs) {
            this.graphSearchArgs = graphSearchArgs;
            return this;
        }
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs getGraphSearchArgs() {
            return this.graphSearchArgs;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setHybridSearch(String hybridSearch) {
            this.hybridSearch = hybridSearch;
            return this;
        }
        public String getHybridSearch() {
            return this.hybridSearch;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setHybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }
        public java.util.Map<String, ?> getHybridSearchArgs() {
            return this.hybridSearchArgs;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setMetrics(String metrics) {
            this.metrics = metrics;
            return this;
        }
        public String getMetrics() {
            return this.metrics;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setRecallWindow(java.util.List<Long> recallWindow) {
            this.recallWindow = recallWindow;
            return this;
        }
        public java.util.List<Long> getRecallWindow() {
            return this.recallWindow;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setRerankFactor(Double rerankFactor) {
            this.rerankFactor = rerankFactor;
            return this;
        }
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setRerankModel(QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel getRerankModel() {
            return this.rerankModel;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setTopK(Long topK) {
            this.topK = topK;
            return this;
        }
        public Long getTopK() {
            return this.topK;
        }

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
            this.useFullTextRetrieval = useFullTextRetrieval;
            return this;
        }
        public Boolean getUseFullTextRetrieval() {
            return this.useFullTextRetrieval;
        }

    }

    public static class QueryKnowledgeBasesContentRequestSourceCollection extends TeaModel {
        /**
         * <p>The document collection name.</p>
         * <blockquote>
         * <p>To create a document collection, call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. To view existing document collections, call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>knowledge22</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The namespace.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to view existing namespaces.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ns_cloud_index</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password for the namespace.</p>
         * <blockquote>
         * <p>You specify this value when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns_password</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>The query parameters for the source collection.</p>
         */
        @NameInMap("QueryParams")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams queryParams;

        public static QueryKnowledgeBasesContentRequestSourceCollection build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgeBasesContentRequestSourceCollection self = new QueryKnowledgeBasesContentRequestSourceCollection();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgeBasesContentRequestSourceCollection setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public QueryKnowledgeBasesContentRequestSourceCollection setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryKnowledgeBasesContentRequestSourceCollection setNamespacePassword(String namespacePassword) {
            this.namespacePassword = namespacePassword;
            return this;
        }
        public String getNamespacePassword() {
            return this.namespacePassword;
        }

        public QueryKnowledgeBasesContentRequestSourceCollection setQueryParams(QueryKnowledgeBasesContentRequestSourceCollectionQueryParams queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParams getQueryParams() {
            return this.queryParams;
        }

    }

}
