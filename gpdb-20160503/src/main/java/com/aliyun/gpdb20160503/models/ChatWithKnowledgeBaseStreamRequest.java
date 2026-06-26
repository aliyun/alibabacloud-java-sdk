// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to return recall results. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>The knowledge retrieval parameter object. If this parameter is not specified, only chat is performed.</p>
     */
    @NameInMap("KnowledgeParams")
    public ChatWithKnowledgeBaseStreamRequestKnowledgeParams knowledgeParams;

    /**
     * <p>The large language model (LLM) invocation parameter object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public ChatWithKnowledgeBaseStreamRequestModelParams modelParams;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The system prompt template. The template must include {{ text_chunks }}, {{ user_system_prompt }}, {{ graph_entities }}, and {{ graph_relations }}. If not specified, this part does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;参考以下知识回答问题:{{ text_chunks }}&quot;</p>
     */
    @NameInMap("PromptParams")
    public String promptParams;

    /**
     * <p>The ID of the region where the instance resides.</p>
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
         * <p>The k constant in the score calculation formula <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1.</p>
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
         * <p>The weight array for each SourceCollection.</p>
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
         * <p>The configurable parameters when MergeMethod is set to RRF.</p>
         */
        @NameInMap("Rrf")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgsRrf rrf;

        /**
         * <p>The configurable parameters when MergeMethod is set to Weight.</p>
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
         * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description to guide the model to adopt different ranking strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The reranking model name. Valid values: qwen3-rerank, gte-rerank-v2.</p>
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
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
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
         * <p>This parameter can be set when RerankModel.Name is set to qwen3-rerank. Specifies a custom ranking task type description to guide the model to adopt different ranking strategies.</p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <p>The reranking model name. Valid values: qwen3-rerank, gte-rerank-v2.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RerankMetadataFields")
        public String rerankMetadataFields;

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

        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setRerankMetadataFields(String rerankMetadataFields) {
            this.rerankMetadataFields = rerankMetadataFields;
            return this;
        }
        public String getRerankMetadataFields() {
            return this.rerankMetadataFields;
        }

    }

    public static class ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>The filter condition for the data to update, in SQL WHERE clause format.</p>
         * 
         * <strong>example:</strong>
         * <p>method_id=\&quot;e41695f0-2851-40ac-b21d-dd337b60d71c\&quot;</p>
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
         * <p>The knowledge graph retrieval parameters.</p>
         */
        @NameInMap("GraphSearchArgs")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The multi-channel recall algorithm. Default value: empty (AISearch and full-text index scores are directly compared and sorted).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RRF: Reciprocal rank fusion. A parameter k controls the fusion effect. For more information, see HybridSearchArgs.</li>
         * <li>Weight: Weighted reranking. A parameter alpha controls the score weight between AISearch and full-text index results, then performs reranking. For more information, see HybridSearchArgs.</li>
         * <li>Cascaded: Full-text index retrieve is performed first, followed by AISearch retrieve on the full-text index results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cascaded</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The algorithm parameters for multi-channel recall. RRF and Weight are supported:</p>
         * <ul>
         * <li>RRF: The k constant in the score calculation formula <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
         * </ul>
         * <pre><code>{ 
         *    &quot;RRF&quot;: {
         *     &quot;k&quot;: 60
         *    }
         * }
         * </code></pre>
         * <ul>
         * <li>Weight: The calculation formula is <code>alpha * vector_score + (1-alpha) * text_score</code>. The parameter alpha specifies the score weight between vector and full-text retrieval. Valid values: 0 to 1, where 0 indicates full-text only and 1 indicates vector only:</li>
         * </ul>
         * <pre><code>{ 
         *    &quot;Weight&quot;: {
         *     &quot;alpha&quot;: 0.5
         *    }
         * }
         * ```.
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
         * <p>The recall window. If this value is not empty, additional context is returned for retrieval results. The format is a two-element array: List&lt;A, B&gt;, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
         * <blockquote>
         * <ul>
         * <li>Use this parameter when documents are segmented too finely and retrieval may lose contextual information.</li>
         * <li>Reranking takes priority over windowing. Reranking is performed first, followed by windowing.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The reranking factor. If this value is not empty, the AISearch retrieve results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document chunks are sparse.</li>
         * <li>The recommended number of reranked items (TopK × Factor, rounded up) should not exceed 50.</li>
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
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text index (multi-channel recall). Default value: false. Only AISearch retrieve is used.</p>
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
         * <p>The name of the collection to recall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_index_adb_50943_prod</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The namespace.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query the list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddstar_vector</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password of the namespace.</p>
         * <blockquote>
         * <p>This value is specified in the CreateNamespace operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespacePassword</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>The parameters related to retrieval from this knowledge base.</p>
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
         * <p>The method for merging results from multiple knowledge bases. Default value: RRF. Valid values:</p>
         * <ul>
         * <li>RRF</li>
         * <li>Weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;RRF&quot;</p>
         */
        @NameInMap("MergeMethod")
        public String mergeMethod;

        /**
         * <p>The parameters for merging results from multiple knowledge bases.</p>
         */
        @NameInMap("MergeMethodArgs")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs;

        /**
         * <p>The reranking factor. If this value is not empty, the AISearch retrieve results are reranked. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document chunks are sparse.</li>
         * <li>The recommended number of reranked items (TopK × Factor, rounded up) should not exceed 50.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>The reranking model parameters for performing an additional reranking on the merged results from multiple retrieval paths.</p>
         */
        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseStreamRequestKnowledgeParamsRerankModel rerankModel;

        /**
         * <p>The knowledge base.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceCollection")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestKnowledgeParamsSourceCollection> sourceCollection;

        /**
         * <p>The number of top results to return after merging recall results from multiple vector collections.</p>
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
         * <p>The message content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a helpful assistant.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The message role. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>user</li>
         * <li>assistant.</li>
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
         * <p>The description of the function tool.</p>
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
         * <p>The JSON Schema of the function parameters.</p>
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
         * <p>The message list.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsMessages> messages;

        /**
         * <p>The name of the large language model to use. For valid values, see <a href="https://www.alibabacloud.com/help/en/model-studio/compatibility-of-openai-with-dashscope#eadfc13038jd5">Model Studio documentation</a>.</p>
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
         * <p>The presence penalty coefficient. Valid values: -2.0 to 2.0.</p>
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
         * <p>The list of stop words.</p>
         */
        @NameInMap("Stop")
        public java.util.List<String> stop;

        /**
         * <p>The sampling temperature. Valid values: 0 to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        /**
         * <p>The tool list.</p>
         */
        @NameInMap("Tools")
        public java.util.List<ChatWithKnowledgeBaseStreamRequestModelParamsTools> tools;

        /**
         * <p>The nucleus sampling probability threshold. Valid values: 0 to 1.</p>
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
