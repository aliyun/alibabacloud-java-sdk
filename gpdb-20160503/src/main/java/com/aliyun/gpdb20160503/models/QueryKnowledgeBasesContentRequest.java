// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentRequest extends TeaModel {
    /**
     * <p>The text content for retrieval.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method used to merge multiple knowledge bases. Default value: RRF. Valid values:</p>
     * <ul>
     * <li>RRF</li>
     * <li>Weight</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("MergeMethod")
    public String mergeMethod;

    /**
     * <p>The parameters of the merge method for each SourceCollection.</p>
     */
    @NameInMap("MergeMethodArgs")
    public QueryKnowledgeBasesContentRequestMergeMethodArgs mergeMethodArgs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rerank factor. If you specify this parameter, the vector retrieval results are reranked once more. Valid values: 1\&lt;RerankFactor&lt;=5.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the document is segmented into sparse parts, reranking is inefficient.</p>
     * </li>
     * <li><p>We recommend that the number of reranked results (the ceiling of TopK × RerankFactor) not exceed 50.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The information about collections to retrieve from.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCollection")
    public java.util.List<QueryKnowledgeBasesContentRequestSourceCollection> sourceCollection;

    /**
     * <p>Set the number of top results to be returned after merging results from multiple path retrieval.</p>
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
         * <p>The smoothing constant k in the formula to calculate the score: 1/(k + rank_i). The k constant must be a positive integer greater than 1.</p>
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
         * <p>An array of weights for each SourceCollection.</p>
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
         * <p>The parameter that can be configured when the MergeMethod parameter is set to RRF.</p>
         */
        @NameInMap("Rrf")
        public QueryKnowledgeBasesContentRequestMergeMethodArgsRrf rrf;

        /**
         * <p>The parameter that you can configure when you set the MergeMethod parameter to Weight.</p>
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

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs extends TeaModel {
        /**
         * <p>Returns the top number of entities and relationship edges. Default value: 60.</p>
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

    public static class QueryKnowledgeBasesContentRequestSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>The filter condition that is used to query data. Specify this parameter in a format that is the same as the WHERE clause. The parameter is an expression that returns a Boolean value of TRUE or FALSE. The condition can be a simple comparison using operators such as equal (=), not equal (&lt;&gt; or !=), greater than (&gt;), less than (&lt;), greater than or equal (&gt;=), or less than or equal (&lt;=). It can also be a more complex expression combining multiple conditions with logical operators (AND, OR, NOT), or use keywords such as IN, BETWEEN, and LIKE.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>For the syntax, see <a href="https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/">https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-where/</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id = \&quot;llm-52tvykqt6u67iw73_j6ovptwjk7_file_6ce3da1f7e69495d9f491f2180c86973_11967297\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Whether to enable knowledge graph enhancement. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        /**
         * <p>Returns the top number of entities and relationship edges. Default value: 60.</p>
         */
        @NameInMap("GraphSearchArgs")
        public QueryKnowledgeBasesContentRequestSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The dual-path retrieval algorithm. This parameter is empty by default, which specifies that scores of vector retrieval and full-text retrieval are directly compared and sorted together.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RRF: The reciprocal rank fusion (RRF) algorithm uses a constant k to control the fusion effect. For more information, see the description of the HybridSearchArgs parameter.</li>
         * <li>Weight: This algorithm uses the alpha parameter to specify the proportion of the vector search score and the full-text search score and then sorts by weight. For more information, see the description of the HybridSearchArgs parameter.</li>
         * <li>Cascaded: This algorithm performs first full-text retrieval and then vector retrieval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cascaded</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The parameters of the dual-path retrieval algorithm. RRF and Weight are supported at this time:</p>
         * <ul>
         * <li>RRF: Specifies the smoothing constant k in the formula to calculate the score: <code>1/(k + rank_i)</code>. The k constant must be a positive integer greater than 1. The format:</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{ 
         *    &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li>Weight: The score is computed as <code>alpha * vector_score + (1 - alpha) * text_score</code>. The parameter alpha controls the weighting between vector search and full-text search scores, with a valid range of [0, 1]. 0 specifies only full-text search score. 1 specifies only vector search score.</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{ 
         *    &quot;Weight&quot;: {
         *     &quot;alpha&quot;: 0.5
         *    }
         * }
         * </code></pre>
         */
        @NameInMap("HybridSearchArgs")
        public java.util.Map<String, ?> hybridSearchArgs;

        /**
         * <p>The method that is used to create vector indexes. Valid values:</p>
         * <ul>
         * <li>l2: Euclidean distance.</li>
         * <li>ip: Inner product distance.</li>
         * <li>cosine: Cosine similarity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        /**
         * <p>Offset for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The fields by which to sort the results. This parameter is empty by default.</p>
         * <p>The field must be either a metadata field or a default field in the table (e.g., id). Supported formats include:</p>
         * <p>Single field, such as chunk_id. Multiple fields that are separated by commas (,), such as block_id,chunk_id. Descending order is supported, such as block_id DESC,chunk_id DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>file_id,sort_num</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <p>The retrieval window. If you specify this parameter, the context of the retrieved result is added in the output. Format: List\&lt;A, B&gt;. Valid values: -10&lt;=A&lt;=0 and 0&lt;=B&lt;=10.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>We recommend that you specify this parameter if the source document is segmented into large numbers of pieces, which may result in loss of contextual information during retrieval.</p>
         * </li>
         * <li><p>Perform re-ranking before windowing.</p>
         * </li>
         * </ul>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The rerank factor. If you specify this parameter, the vector retrieval results are reranked once more. Valid values: 1\&lt;RerankFactor&lt;=5.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the document is segmented into sparse parts, reranking is inefficient.</p>
         * </li>
         * <li><p>We recommend that the number of reranked results (the ceiling of TopK × RerankFactor) not exceed 50.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The number of top results.</p>
         * 
         * <strong>example:</strong>
         * <p>776</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text retrieval (dual-path retrieval). The default value is false, which means only vector retrieval is used.</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation to create a document collection and call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query a list of document collections.</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
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
         * <p> The value of this parameter is specified when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns_password</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>The condition that is used to filter the data to be updated. Specify this parameter in a format that is the same as the WHERE clause.</p>
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
