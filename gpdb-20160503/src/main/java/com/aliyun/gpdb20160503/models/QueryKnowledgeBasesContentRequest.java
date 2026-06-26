// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentRequest extends TeaModel {
    /**
     * <p>The text content used for retrieval.</p>
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
     * <p>The method used to merge results from multiple knowledge bases. Default value: RRF. Valid values:</p>
     * <ul>
     * <li>RRF</li>
     * <li>Weight.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("MergeMethod")
    public String mergeMethod;

    /**
     * <p>The parameters for the merge method of each SourceCollection.</p>
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
     * <p>The reranking factor. If this parameter is not empty, the vector retrieval results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
     * <blockquote>
     * <ul>
     * <li>Reranking is slow when document chunks are sparse.</li>
     * <li>The recommended reranking count (TopK × Factor, rounded up) should not exceed 50.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The reranking model parameters for performing an additional reranking on the overall results after multi-channel merging.</p>
     */
    @NameInMap("RerankModel")
    public QueryKnowledgeBasesContentRequestRerankModel rerankModel;

    /**
     * <p>The information about the multiple collections to retrieve.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCollection")
    public java.util.List<QueryKnowledgeBasesContentRequestSourceCollection> sourceCollection;

    /**
     * <p>The number of top results to return after multi-channel recall merging.</p>
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
         * <p>The k constant in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1.</p>
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
         * <p>The weight array for each SourceCollection.</p>
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
         * <p>The configurable parameters when MergeMethod is set to RRF.</p>
         */
        @NameInMap("Rrf")
        public QueryKnowledgeBasesContentRequestMergeMethodArgsRrf rrf;

        /**
         * <p>The configurable parameters when MergeMethod is set to Weight.</p>
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
         * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description that guides the model to adopt different ranking strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the reranking model. Valid values: qwen3-rerank, gte-rerank-v2.</p>
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
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
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
         * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description that guides the model to adopt different ranking strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the reranking model. Valid values: qwen3-rerank, gte-rerank-v2.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RerankMetadataFields")
        public String rerankMetadataFields;

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

        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel setRerankMetadataFields(String rerankMetadataFields) {
            this.rerankMetadataFields = rerankMetadataFields;
            return this;
        }
        public String getRerankMetadataFields() {
            return this.rerankMetadataFields;
        }

    }

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>The filter conditions for the data to query, in SQL WHERE clause format. This is an expression that returns a Boolean value (true or false). The conditions can be simple comparison operators such as equal to (=), not equal to (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal to (&gt;=), and less than or equal to (&lt;=). They can also be more complex expressions combined with logical operators (AND, OR, NOT), as well as conditions that use keywords such as IN, BETWEEN, and LIKE.</p>
         * <blockquote>
         * <ul>
         * <li>For detailed syntax, refer to: <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>id = \&quot;llm-52tvykqt6u67iw73_j6ovptwjk7_file_6ce3da1f7e69495d9f491f2180c86973_11967297\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Specifies whether to enable knowledge graph enhancement. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        /**
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
         */
        @NameInMap("GraphSearchArgs")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The multi-channel recall algorithm. Default value: empty (the scores from dense vectors and full-text retrieval are directly compared and sorted).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RRF: reciprocal rank fusion. A parameter k controls the fusion effect. For more information, see the HybridSearchArgs configuration.</li>
         * <li>Weight: weighted ranking. Parameters control the score weights of vector retrieval and full-text retrieval before sorting. For more information, see the HybridSearchArgs configuration.</li>
         * <li>Cascaded: full-text retrieval is performed first, followed by vector retrieval on the full-text results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cascaded</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The algorithm parameters for multi-channel recall. RRF and Weight are supported. HybridPathsSetting specifies the recall paths: dense vectors (dense), sparse vectors (sparse), and full-text retrieval (fulltext). If this value is empty, dense vectors (dense) and full-text retrieval (fulltext) are used by default.</p>
         * <ul>
         * <li>RRF: specifies the k constant in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
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
         * <li>Formula: alpha * dense_score + (1-alpha) * fulltext_score. The alpha parameter specifies the score weight between dense vectors and full-text retrieval. Valid values: 0 to 1, where 0 indicates full-text retrieval only and 1 indicates dense vectors only:</li>
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
         * <li>Formula: normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score. dense, sparse, and fulltext represent the weights for dense vectors, sparse vectors, and full-text retrieval respectively. Valid values: greater than or equal to 0. The system automatically performs normalization on the weights to 0 to 1 (normalized_x = x / (dense + sparse + fulltext)).</li>
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
         * <p>The method used to build the vector index. Valid values:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: inner product distance.</li>
         * <li>cosine: cosine similarity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        /**
         * <p>The offset for paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The field used for sorting. Default value: empty.</p>
         * <p>The field must belong to metadata or a default field in the table, such as id. Supported formats:</p>
         * <p>A single field, such as chunk_id.
         * Multiple fields separated by commas, such as block_id, chunk_id.
         * Descending order is supported, such as block_id DESC, chunk_id DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>file_id,sort_num</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <p>The recall window. If this value is not empty, the context of the retrieval results is included. The format is a two-element array: List&lt;A, B&gt;, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
         * <blockquote>
         * <ul>
         * <li>Use this parameter when document chunks are too small and retrieval may lose context information.</li>
         * <li>Reranking takes priority over windowing. Reranking is performed first, followed by windowing.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The reranking factor. If this parameter is not empty, the vector retrieval results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document chunks are sparse.</li>
         * <li>The recommended reranking count (TopK × Factor, rounded up) should not exceed 50.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The reranking model parameters.</p>
         */
        @NameInMap("RerankModel")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>776</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text retrieval (dual-path recall). Default value: false, which indicates that only vector retrieval is used.</p>
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
         * <p>The name of the document collection.</p>
         * <blockquote>
         * <p>The document collection is created by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to view existing document collections.</p>
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
         * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and view the list by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ns_cloud_index</p>
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
         * <p>ns_password</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>The filter conditions for the data to query, in SQL WHERE clause format.</p>
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
