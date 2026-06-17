// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to view the details of all instances in a target region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Whether to include the raw retrieval results from the knowledge base in the response. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>Parameters for knowledge retrieval. If omitted, the operation performs a standard chat without retrieving from a knowledge base.</p>
     */
    @NameInMap("KnowledgeParams")
    public ChatWithKnowledgeBaseRequestKnowledgeParams knowledgeParams;

    /**
     * <p>The parameters for calling the large language model (LLM).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public ChatWithKnowledgeBaseRequestModelParams modelParams;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A custom system prompt template. If specified, it overrides the default prompt. The template must include the {{ text_chunks }}, {{ user_system_prompt }}, {{ graph_entities }}, and {{ graph_relations }} placeholders.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ChatWithKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseRequest self = new ChatWithKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ChatWithKnowledgeBaseRequest setIncludeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
        this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
        return this;
    }
    public Boolean getIncludeKnowledgeBaseResults() {
        return this.includeKnowledgeBaseResults;
    }

    public ChatWithKnowledgeBaseRequest setKnowledgeParams(ChatWithKnowledgeBaseRequestKnowledgeParams knowledgeParams) {
        this.knowledgeParams = knowledgeParams;
        return this;
    }
    public ChatWithKnowledgeBaseRequestKnowledgeParams getKnowledgeParams() {
        return this.knowledgeParams;
    }

    public ChatWithKnowledgeBaseRequest setModelParams(ChatWithKnowledgeBaseRequestModelParams modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public ChatWithKnowledgeBaseRequestModelParams getModelParams() {
        return this.modelParams;
    }

    public ChatWithKnowledgeBaseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatWithKnowledgeBaseRequest setPromptParams(String promptParams) {
        this.promptParams = promptParams;
        return this;
    }
    public String getPromptParams() {
        return this.promptParams;
    }

    public ChatWithKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf extends TeaModel {
        /**
         * <p>The constant <code>k</code> in the reciprocal rank fusion formula <code>1/(k + rank_i)</code>. The value must be a positive integer greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("K")
        public Long k;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf self = new ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf setK(Long k) {
            this.k = k;
            return this;
        }
        public Long getK() {
            return this.k;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight extends TeaModel {
        /**
         * <p>An array of weights corresponding to each collection specified in <code>SourceCollection</code>.</p>
         */
        @NameInMap("Weights")
        public java.util.List<Double> weights;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight self = new ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight setWeights(java.util.List<Double> weights) {
            this.weights = weights;
            return this;
        }
        public java.util.List<Double> getWeights() {
            return this.weights;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs extends TeaModel {
        /**
         * <p>Parameters to use when <code>MergeMethod</code> is set to <code>RRF</code>.</p>
         */
        @NameInMap("Rrf")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf rrf;

        /**
         * <p>Parameters to use when <code>MergeMethod</code> is set to <code>Weight</code>.</p>
         */
        @NameInMap("Weight")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight weight;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs self = new ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs setRrf(ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf rrf) {
            this.rrf = rrf;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf getRrf() {
            return this.rrf;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs setWeight(ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight weight) {
            this.weight = weight;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsWeight getWeight() {
            return this.weight;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel extends TeaModel {
        /**
         * <p>The instruction or prompt for the reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel self = new ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs extends TeaModel {
        /**
         * <p>The maximum number of entities and relationship edges to return from the knowledge graph search. Default: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GraphTopK")
        public Long graphTopK;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs self = new ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs setGraphTopK(Long graphTopK) {
            this.graphTopK = graphTopK;
            return this;
        }
        public Long getGraphTopK() {
            return this.graphTopK;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel extends TeaModel {
        /**
         * <p>The instruction or prompt for the reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel self = new ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>A filter to apply to the search, specified as a SQL <code>WHERE</code> clause.</p>
         * 
         * <strong>example:</strong>
         * <p>id = \&quot;llm-t87l87fxuhn56woc_8anu8j2d3f_file_e74635e2cc314e838543e724f6b3b1f2_10658020\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Whether to enhance the search with a knowledge graph. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        /**
         * <p>Parameters for the knowledge graph search, used when <code>GraphEnhance</code> is <code>true</code>.</p>
         */
        @NameInMap("GraphSearchArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The multi-channel recall algorithm. If omitted, the system directly compares and sorts scores from dense vector retrieval and full-text search.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code>: Uses reciprocal rank fusion. The fusion effect is controlled by the <code>k</code> parameter in <code>HybridSearchArgs</code>.</p>
         * </li>
         * <li><p><code>Weight</code>: Uses weighted sorting. The weights for vector retrieval and full-text search scores are controlled by parameters in <code>HybridSearchArgs</code>.</p>
         * </li>
         * <li><p><code>Cascaded</code>: Performs a full-text search first, followed by a vector retrieval on the results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>Parameters for the multi-channel recall algorithm. <code>RRF</code> and <code>Weight</code> are supported. The <code>HybridPathsSetting</code> parameter can specify the recall channels: <code>dense</code> (dense vector), <code>sparse</code> (sparse vector), and <code>fulltext</code> (full-text search). If this parameter is empty, <code>dense</code> and <code>fulltext</code> are used by default.</p>
         * <ul>
         * <li><code>RRF</code>: Specifies the constant <code>k</code> in the formula <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
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
         * <li><p>Two-channel recall (if <code>HybridPathsSetting</code> is not specified, only <code>alpha</code> is required):</p>
         * <ul>
         * <li>Formula: <code>alpha * dense_score + (1-alpha) * fulltext_score</code>. The <code>alpha</code> parameter represents the weight of the dense vector score relative to the full-text search score. The value must be in the range [0, 1]. A value of 0 uses only full-text search. A value of 1 uses only dense vector retrieval.</li>
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
         * <li><p>Three-channel recall:</p>
         * <ul>
         * <li>Formula: <code>normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score</code>. The <code>dense</code>, <code>sparse</code>, and <code>fulltext</code> parameters represent the weights for each channel and must be greater than or equal to 0. The system automatically normalizes these weights (for example, <code>normalized_x = x / (dense + sparse + fulltext)</code>).</li>
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
         * <p>The distance metric used for vector indexing. Valid values:</p>
         * <ul>
         * <li><p><code>l2</code>: euclidean distance.</p>
         * </li>
         * <li><p><code>ip</code>: Inner product (dot product) distance.</p>
         * </li>
         * <li><p><code>cosine</code>: cosine similarity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        /**
         * <p>The recall window. If specified, expands the context around retrieved text chunks. Must be an array of two integers, <code>[A, B]</code>, where <code>A</code> is the number of preceding chunks to include (from -10 to 0) and <code>B</code> is the number of following chunks (from 0 to 10).</p>
         * <blockquote>
         * <ul>
         * <li><p>We recommend that you use this parameter when document chunks are highly fragmented and retrieval might result in a loss of context.</p>
         * </li>
         * <li><p>Reranking is performed before windowing is applied.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The reranking factor for this collection, which overrides the top-level <code>RerankFactor</code>. If specified, it reranks the initial retrieval results to improve relevance. Valid range: (1, 5].</p>
         * <blockquote>
         * <ul>
         * <li><p>Reranking may be less efficient if document chunks are sparse.</p>
         * </li>
         * <li><p>We recommend that the number of items to rerank, calculated as <code>Ceiling(TopK * RerankFactor)</code>, does not exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The model to use for reranking.</p>
         */
        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return from this collection before merging.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Whether to enable full-text search in addition to vector retrieval. Default: <code>false</code> (uses only vector retrieval).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseFullTextRetrieval")
        public Boolean useFullTextRetrieval;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams self = new ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setGraphEnhance(Boolean graphEnhance) {
            this.graphEnhance = graphEnhance;
            return this;
        }
        public Boolean getGraphEnhance() {
            return this.graphEnhance;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setGraphSearchArgs(ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs) {
            this.graphSearchArgs = graphSearchArgs;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs getGraphSearchArgs() {
            return this.graphSearchArgs;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setHybridSearch(String hybridSearch) {
            this.hybridSearch = hybridSearch;
            return this;
        }
        public String getHybridSearch() {
            return this.hybridSearch;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setHybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }
        public java.util.Map<String, ?> getHybridSearchArgs() {
            return this.hybridSearchArgs;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setMetrics(String metrics) {
            this.metrics = metrics;
            return this;
        }
        public String getMetrics() {
            return this.metrics;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setRecallWindow(java.util.List<Long> recallWindow) {
            this.recallWindow = recallWindow;
            return this;
        }
        public java.util.List<Long> getRecallWindow() {
            return this.recallWindow;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setRerankFactor(Double rerankFactor) {
            this.rerankFactor = rerankFactor;
            return this;
        }
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setRerankModel(ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel getRerankModel() {
            return this.rerankModel;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setTopK(Long topK) {
            this.topK = topK;
            return this;
        }
        public Long getTopK() {
            return this.topK;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
            this.useFullTextRetrieval = useFullTextRetrieval;
            return this;
        }
        public Boolean getUseFullTextRetrieval() {
            return this.useFullTextRetrieval;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection extends TeaModel {
        /**
         * <p>The name of the collection to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_document_collection</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The namespace where the collection resides. Default: <code>public</code>.</p>
         * <blockquote>
         * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation and view existing namespaces by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dukang</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password for the specified namespace.</p>
         * <blockquote>
         * <p>This password is set when you call the <code>CreateNamespace</code> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespacePasswd</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>Retrieval parameters for this knowledge base collection.</p>
         */
        @NameInMap("QueryParams")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams queryParams;

        public static ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection self = new ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection setNamespacePassword(String namespacePassword) {
            this.namespacePassword = namespacePassword;
            return this;
        }
        public String getNamespacePassword() {
            return this.namespacePassword;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection setQueryParams(ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams getQueryParams() {
            return this.queryParams;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParams extends TeaModel {
        /**
         * <p>The method for merging results from multiple knowledge bases. Default: <code>RRF</code>. Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code></p>
         * </li>
         * <li><p><code>Weight</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;RRF&quot;</p>
         */
        @NameInMap("MergeMethod")
        public String mergeMethod;

        /**
         * <p>The parameters for the merge method.</p>
         */
        @NameInMap("MergeMethodArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs;

        /**
         * <p>The reranking factor. Specify this to rerank the initial vector retrieval results for improved relevance. Valid range: (1, 5].</p>
         * <blockquote>
         * <ul>
         * <li><p>Reranking may be less efficient if document chunks are sparse.</p>
         * </li>
         * <li><p>We recommend that the number of items to rerank, calculated as <code>Ceiling(TopK * RerankFactor)</code>, does not exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0001</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The model to use for reranking.</p>
         */
        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel rerankModel;

        /**
         * <p>An array of knowledge base collections to query.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceCollection")
        public java.util.List<ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection> sourceCollection;

        /**
         * <p>The number of top results to return after the results from multiple vector collection recalls are merged.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Long topK;

        public static ChatWithKnowledgeBaseRequestKnowledgeParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestKnowledgeParams self = new ChatWithKnowledgeBaseRequestKnowledgeParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setMergeMethod(String mergeMethod) {
            this.mergeMethod = mergeMethod;
            return this;
        }
        public String getMergeMethod() {
            return this.mergeMethod;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setMergeMethodArgs(ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs) {
            this.mergeMethodArgs = mergeMethodArgs;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs getMergeMethodArgs() {
            return this.mergeMethodArgs;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setRerankFactor(Double rerankFactor) {
            this.rerankFactor = rerankFactor;
            return this;
        }
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setRerankModel(ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel getRerankModel() {
            return this.rerankModel;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setSourceCollection(java.util.List<ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection> sourceCollection) {
            this.sourceCollection = sourceCollection;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection> getSourceCollection() {
            return this.sourceCollection;
        }

        public ChatWithKnowledgeBaseRequestKnowledgeParams setTopK(Long topK) {
            this.topK = topK;
            return this;
        }
        public Long getTopK() {
            return this.topK;
        }

    }

    public static class ChatWithKnowledgeBaseRequestModelParamsMessages extends TeaModel {
        /**
         * <p>The content of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a helpful assistant.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the message author. Valid values:</p>
         * <ul>
         * <li><p><code>system</code></p>
         * </li>
         * <li><p><code>user</code></p>
         * </li>
         * <li><p><code>assistant</code></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        public static ChatWithKnowledgeBaseRequestModelParamsMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestModelParamsMessages self = new ChatWithKnowledgeBaseRequestModelParamsMessages();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestModelParamsMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseRequestModelParamsMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ChatWithKnowledgeBaseRequestModelParamsToolsFunction extends TeaModel {
        /**
         * <p>The description of the function tool.</p>
         * 
         * <strong>example:</strong>
         * <p>获取天气。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the function tool.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The JSON schema of the function parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;: &quot;object&quot;, ...}</p>
         */
        @NameInMap("Parameters")
        public Object parameters;

        public static ChatWithKnowledgeBaseRequestModelParamsToolsFunction build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestModelParamsToolsFunction self = new ChatWithKnowledgeBaseRequestModelParamsToolsFunction();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestModelParamsToolsFunction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ChatWithKnowledgeBaseRequestModelParamsToolsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChatWithKnowledgeBaseRequestModelParamsToolsFunction setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

    }

    public static class ChatWithKnowledgeBaseRequestModelParamsTools extends TeaModel {
        /**
         * <p>The function information.</p>
         */
        @NameInMap("Function")
        public ChatWithKnowledgeBaseRequestModelParamsToolsFunction function;

        public static ChatWithKnowledgeBaseRequestModelParamsTools build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestModelParamsTools self = new ChatWithKnowledgeBaseRequestModelParamsTools();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestModelParamsTools setFunction(ChatWithKnowledgeBaseRequestModelParamsToolsFunction function) {
            this.function = function;
            return this;
        }
        public ChatWithKnowledgeBaseRequestModelParamsToolsFunction getFunction() {
            return this.function;
        }

    }

    public static class ChatWithKnowledgeBaseRequestModelParams extends TeaModel {
        /**
         * <p>The maximum number of tokens to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MaxTokens")
        public Long maxTokens;

        /**
         * <p>The list of messages that form the conversation history.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsMessages> messages;

        /**
         * <p>The name of the large language model to use. For a list of available models, see the <a href="https://help.aliyun.com/zh/model-studio/compatibility-of-openai-with-dashscope?spm=a2c4g.11186623.help-menu-2400256.d_2_10_0.45b5516eZIciC8%5C&scm=20140722.H_2833609._.OR_help-T_cn~zh-V_1#eadfc13038jd5">Model Studio documentation</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of candidate responses to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public Long n;

        /**
         * <p>The presence penalty. Valid range: [-2.0, 2.0].</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PresencePenalty")
        public Double presencePenalty;

        /**
         * <p>The random seed.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Seed")
        public Long seed;

        /**
         * <p>A list of stop words.</p>
         */
        @NameInMap("Stop")
        public java.util.List<String> stop;

        /**
         * <p>The sampling temperature. Valid range: (0, 2.0].</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        /**
         * <p>The list of tools.</p>
         */
        @NameInMap("Tools")
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsTools> tools;

        /**
         * <p>The probability threshold for nucleus sampling. Valid range: (0, 1.0).</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("TopP")
        public Double topP;

        public static ChatWithKnowledgeBaseRequestModelParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseRequestModelParams self = new ChatWithKnowledgeBaseRequestModelParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseRequestModelParams setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ChatWithKnowledgeBaseRequestModelParams setMessages(java.util.List<ChatWithKnowledgeBaseRequestModelParamsMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsMessages> getMessages() {
            return this.messages;
        }

        public ChatWithKnowledgeBaseRequestModelParams setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ChatWithKnowledgeBaseRequestModelParams setN(Long n) {
            this.n = n;
            return this;
        }
        public Long getN() {
            return this.n;
        }

        public ChatWithKnowledgeBaseRequestModelParams setPresencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }
        public Double getPresencePenalty() {
            return this.presencePenalty;
        }

        public ChatWithKnowledgeBaseRequestModelParams setSeed(Long seed) {
            this.seed = seed;
            return this;
        }
        public Long getSeed() {
            return this.seed;
        }

        public ChatWithKnowledgeBaseRequestModelParams setStop(java.util.List<String> stop) {
            this.stop = stop;
            return this;
        }
        public java.util.List<String> getStop() {
            return this.stop;
        }

        public ChatWithKnowledgeBaseRequestModelParams setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public ChatWithKnowledgeBaseRequestModelParams setTools(java.util.List<ChatWithKnowledgeBaseRequestModelParamsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsTools> getTools() {
            return this.tools;
        }

        public ChatWithKnowledgeBaseRequestModelParams setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

}
