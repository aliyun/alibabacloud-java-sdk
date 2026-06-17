// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to include the retrieved knowledge base results in the response. Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>Parameters for knowledge retrieval. If omitted, the API performs a chat-only operation.</p>
     */
    @NameInMap("KnowledgeParams")
    public ChatWithKnowledgeBaseStreamRequestKnowledgeParams knowledgeParams;

    /**
     * <p>An object that contains parameters for the Large Language Model (LLM) call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public ChatWithKnowledgeBaseStreamRequestModelParams modelParams;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A template for the system prompt. It must include placeholders such as <code>{{text_chunks}}</code>, <code>{{user_system_prompt}}</code>, <code>{{graph_entities}}</code>, and <code>{{graph_relations}}</code>. If omitted, no custom prompt template is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The instance\&quot;s region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ChatWithKnowledgeBaseStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseStreamRequest self = new ChatWithKnowledgeBaseStreamRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseStreamRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ChatWithKnowledgeBaseStreamRequest setIncludeKnowledgeBaseResults(Boolean includeKnowledgeBaseResults) {
        this.includeKnowledgeBaseResults = includeKnowledgeBaseResults;
        return this;
    }
    public Boolean getIncludeKnowledgeBaseResults() {
        return this.includeKnowledgeBaseResults;
    }

    public ChatWithKnowledgeBaseStreamRequest setKnowledgeParams(ChatWithKnowledgeBaseStreamRequestKnowledgeParams knowledgeParams) {
        this.knowledgeParams = knowledgeParams;
        return this;
    }
    public ChatWithKnowledgeBaseStreamRequestKnowledgeParams getKnowledgeParams() {
        return this.knowledgeParams;
    }

    public ChatWithKnowledgeBaseStreamRequest setModelParams(ChatWithKnowledgeBaseStreamRequestModelParams modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public ChatWithKnowledgeBaseStreamRequestModelParams getModelParams() {
        return this.modelParams;
    }

    public ChatWithKnowledgeBaseStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatWithKnowledgeBaseStreamRequest setPromptParams(String promptParams) {
        this.promptParams = promptParams;
        return this;
    }
    public String getPromptParams() {
        return this.promptParams;
    }

    public ChatWithKnowledgeBaseStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf extends TeaModel {
        /**
         * <p>The constant <code>k</code> used in the reciprocal rank fusion (RRF) formula <code>1/(k + rank_i)</code>. The value must be an integer greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("K")
        public Long k;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf setK(Long k) {
            this.k = k;
            return this;
        }
        public Long getK() {
            return this.k;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight extends TeaModel {
        /**
         * <p>An array of weights for each <code>SourceCollection</code>.</p>
         */
        @NameInMap("Weights")
        public java.util.List<Double> weights;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight setWeights(java.util.List<Double> weights) {
            this.weights = weights;
            return this;
        }
        public java.util.List<Double> getWeights() {
            return this.weights;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs extends TeaModel {
        /**
         * <p>Parameters for the <code>RRF</code> merge method.</p>
         */
        @NameInMap("Rrf")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf rrf;

        /**
         * <p>Parameters for the <code>Weight</code> merge method.</p>
         */
        @NameInMap("Weight")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight weight;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs setRrf(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf rrf) {
            this.rrf = rrf;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf getRrf() {
            return this.rrf;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs setWeight(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight weight) {
            this.weight = weight;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsWeight getWeight() {
            return this.weight;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel extends TeaModel {
        /**
         * <p>An instruction for the rerank model.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the rerank model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs extends TeaModel {
        /**
         * <p>The number of top entities and relationship edges to return. Default value: <code>60</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("GraphTopK")
        public Long graphTopK;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs setGraphTopK(Long graphTopK) {
            this.graphTopK = graphTopK;
            return this;
        }
        public Long getGraphTopK() {
            return this.graphTopK;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel extends TeaModel {
        /**
         * <p>An instruction for the rerank model.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The name of the rerank model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setInstruct(String instruct) {
            this.instruct = instruct;
            return this;
        }
        public String getInstruct() {
            return this.instruct;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>A filter expression to apply to the search, similar to a SQL <code>WHERE</code> clause.</p>
         * 
         * <strong>example:</strong>
         * <p>method_id=\&quot;e41695f0-2851-40ac-b21d-dd337b60d71c\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>Specifies whether to enable knowledge graph enhancement. Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        /**
         * <p>The parameters for knowledge graph search.</p>
         */
        @NameInMap("GraphSearchArgs")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>Specifies the hybrid search algorithm. If omitted, the system performs a basic score comparison of vector search and full-text retrieval results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>RRF</code>: Reciprocal rank fusion. Configure the <code>k</code> parameter in <code>HybridSearchArgs</code>.</p>
         * </li>
         * <li><p><code>Weight</code>: Weighted score fusion. Use the <code>alpha</code> parameter in <code>HybridSearchArgs</code> to control the balance between vector and full-text search scores.</p>
         * </li>
         * <li><p><code>Cascaded</code>: First performs full-text retrieval, then runs a vector search on the results.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cascaded</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The arguments for the specified hybrid search algorithm. Supports <code>RRF</code> and <code>Weight</code>.</p>
         * <ul>
         * <li><code>RRF</code>: Specifies the constant <code>k</code> in the score calculation formula <code>1/(k+rank_i)</code>. <code>k</code> must be an integer greater than 1. Format:</li>
         * </ul>
         * <pre><code>{ 
         *    &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li><code>Weight</code>: Calculates the final score using the formula <code>alpha * vector_score + (1 - alpha) * text_score</code>. The <code>alpha</code> parameter balances the scores, ranging from 0 (full-text only) to 1 (vector only). Format:</li>
         * </ul>
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
         * <p>The distance metric for vector search. Valid values:</p>
         * <ul>
         * <li><p><code>l2</code>: Euclidean distance.</p>
         * </li>
         * <li><p><code>ip</code>: Inner product.</p>
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
         * <p>The recall window. Specifies a window of context to include around retrieved chunks. The value must be a two-element array <code>[A, B]</code>, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is useful when document chunks are small and a search might miss important surrounding context.</p>
         * </li>
         * <li><p>The window is applied after reranking.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The rerank factor. If specified, the system reranks the results from the vector search. The value must be greater than 1 and less than or equal to 5.</p>
         * <blockquote>
         * <ul>
         * <li><p>Reranking may be inefficient if document chunks are sparse.</p>
         * </li>
         * <li><p>The number of items to rerank, calculated as <code>ceil(TopK * RerankFactor)</code>, should not exceed 50.</p>
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
         * <p>The rerank model to use.</p>
         */
        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return from this collection.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text retrieval for hybrid search. If <code>false</code> (the default), only vector search is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseFullTextRetrieval")
        public Boolean useFullTextRetrieval;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setGraphEnhance(Boolean graphEnhance) {
            this.graphEnhance = graphEnhance;
            return this;
        }
        public Boolean getGraphEnhance() {
            return this.graphEnhance;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setGraphSearchArgs(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs) {
            this.graphSearchArgs = graphSearchArgs;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs getGraphSearchArgs() {
            return this.graphSearchArgs;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setHybridSearch(String hybridSearch) {
            this.hybridSearch = hybridSearch;
            return this;
        }
        public String getHybridSearch() {
            return this.hybridSearch;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setHybridSearchArgs(java.util.Map<String, ?> hybridSearchArgs) {
            this.hybridSearchArgs = hybridSearchArgs;
            return this;
        }
        public java.util.Map<String, ?> getHybridSearchArgs() {
            return this.hybridSearchArgs;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setMetrics(String metrics) {
            this.metrics = metrics;
            return this;
        }
        public String getMetrics() {
            return this.metrics;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setRecallWindow(java.util.List<Long> recallWindow) {
            this.recallWindow = recallWindow;
            return this;
        }
        public java.util.List<Long> getRecallWindow() {
            return this.recallWindow;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setRerankFactor(Double rerankFactor) {
            this.rerankFactor = rerankFactor;
            return this;
        }
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setRerankModel(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel getRerankModel() {
            return this.rerankModel;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setTopK(Long topK) {
            this.topK = topK;
            return this;
        }
        public Long getTopK() {
            return this.topK;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams setUseFullTextRetrieval(Boolean useFullTextRetrieval) {
            this.useFullTextRetrieval = useFullTextRetrieval;
            return this;
        }
        public Boolean getUseFullTextRetrieval() {
            return this.useFullTextRetrieval;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection extends TeaModel {
        /**
         * <p>The name of the collection to search.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_index_adb_50943_prod</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The namespace that contains the collection.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to view available namespaces.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddstar_vector</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password for the specified namespace.</p>
         * <blockquote>
         * <p>This value is specified in the <code>CreateNamespace</code> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespacePassword</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>Parameters for the knowledge base query.</p>
         */
        @NameInMap("QueryParams")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams queryParams;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection setNamespacePassword(String namespacePassword) {
            this.namespacePassword = namespacePassword;
            return this;
        }
        public String getNamespacePassword() {
            return this.namespacePassword;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection setQueryParams(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams getQueryParams() {
            return this.queryParams;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParams extends TeaModel {
        /**
         * <p>Specifies the method for merging results from multiple knowledge bases. Default: <code>RRF</code>. Valid values:</p>
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
         * <p>The arguments for the result merging method.</p>
         */
        @NameInMap("MergeMethodArgs")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs;

        /**
         * <p>Specifies the factor for reranking vector search results. The value must be greater than 1 and less than or equal to 5.</p>
         * <blockquote>
         * <ul>
         * <li><p>Reranking may be inefficient if document chunks are sparse.</p>
         * </li>
         * <li><p>The number of items to rerank, calculated as <code>ceil(TopK * RerankFactor)</code>, should not exceed 50.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The rerank model to use.</p>
         */
        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel rerankModel;

        /**
         * <p>An array of knowledge bases to search.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceCollection")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection> sourceCollection;

        /**
         * <p>The total number of top results to return after merging results from all collections.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Long topK;

        public static ChatWithKnowledgeBaseStreamRequestKnowledgeParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestKnowledgeParams self = new ChatWithKnowledgeBaseStreamRequestKnowledgeParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setMergeMethod(String mergeMethod) {
            this.mergeMethod = mergeMethod;
            return this;
        }
        public String getMergeMethod() {
            return this.mergeMethod;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setMergeMethodArgs(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs) {
            this.mergeMethodArgs = mergeMethodArgs;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs getMergeMethodArgs() {
            return this.mergeMethodArgs;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setRerankFactor(Double rerankFactor) {
            this.rerankFactor = rerankFactor;
            return this;
        }
        public Double getRerankFactor() {
            return this.rerankFactor;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setRerankModel(ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel getRerankModel() {
            return this.rerankModel;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setSourceCollection(java.util.List<ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection> sourceCollection) {
            this.sourceCollection = sourceCollection;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection> getSourceCollection() {
            return this.sourceCollection;
        }

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParams setTopK(Long topK) {
            this.topK = topK;
            return this;
        }
        public Long getTopK() {
            return this.topK;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestModelParamsMessages extends TeaModel {
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

        public static ChatWithKnowledgeBaseStreamRequestModelParamsMessages build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestModelParamsMessages self = new ChatWithKnowledgeBaseStreamRequestModelParamsMessages();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction extends TeaModel {
        /**
         * <p>A description of the function tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Get weather.</p>
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
         * <p>The parameters of the function, described as a JSON Schema object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;: &quot;object&quot;, ...}</p>
         */
        @NameInMap("Parameters")
        public Object parameters;

        public static ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction self = new ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestModelParamsTools extends TeaModel {
        /**
         * <p>The function information.</p>
         */
        @NameInMap("Function")
        public ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction function;

        public static ChatWithKnowledgeBaseStreamRequestModelParamsTools build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestModelParamsTools self = new ChatWithKnowledgeBaseStreamRequestModelParamsTools();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestModelParamsTools setFunction(ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction function) {
            this.function = function;
            return this;
        }
        public ChatWithKnowledgeBaseStreamRequestModelParamsToolsFunction getFunction() {
            return this.function;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestModelParams extends TeaModel {
        /**
         * <p>The maximum number of tokens to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MaxTokens")
        public Long maxTokens;

        /**
         * <p>A list of messages in the conversation.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsMessages> messages;

        /**
         * <p>The name of the Large Language Model to use. For a list of available models, refer to the <a href="https://help.aliyun.com/zh/model-studio/compatibility-of-openai-with-dashscope?spm=openapi-amp.newDocPublishment.0.0.257c281fH8TtM8%5C&scm=20140722.H_2833609._.OR_help-T_cn~zh-V_1#eadfc13038jd5">Model Studio documentation</a>.</p>
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
         * <p>The presence penalty. A value between -2.0 and 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PresencePenalty")
        public Double presencePenalty;

        /**
         * <p>The random seed for sampling.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Seed")
        public Long seed;

        /**
         * <p>A list of stop sequences.</p>
         */
        @NameInMap("Stop")
        public java.util.List<String> stop;

        /**
         * <p>The sampling temperature. A value between 0 and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        /**
         * <p>A list of tools the model can call.</p>
         */
        @NameInMap("Tools")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsTools> tools;

        /**
         * <p>The nucleus sampling probability threshold. A value between 0 and 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("TopP")
        public Double topP;

        public static ChatWithKnowledgeBaseStreamRequestModelParams build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamRequestModelParams self = new ChatWithKnowledgeBaseStreamRequestModelParams();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setMessages(java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsMessages> getMessages() {
            return this.messages;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setN(Long n) {
            this.n = n;
            return this;
        }
        public Long getN() {
            return this.n;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setPresencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }
        public Double getPresencePenalty() {
            return this.presencePenalty;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setSeed(Long seed) {
            this.seed = seed;
            return this;
        }
        public Long getSeed() {
            return this.seed;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setStop(java.util.List<String> stop) {
            this.stop = stop;
            return this;
        }
        public java.util.List<String> getStop() {
            return this.stop;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setTools(java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsTools> getTools() {
            return this.tools;
        }

        public ChatWithKnowledgeBaseStreamRequestModelParams setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

}
