// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the target region, including the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to return the recall results. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    /**
     * <p>The knowledge retrieval parameter object. If not specified, only chat is performed.</p>
     */
    @NameInMap("KnowledgeParams")
    public ChatWithKnowledgeBaseRequestKnowledgeParams knowledgeParams;

    /**
     * <p>The large language model (LLM) invocation parameter object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public ChatWithKnowledgeBaseRequestModelParams modelParams;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The system prompt template, which must include {{ text_chunks }}, {{ user_system_prompt }}, {{ graph_entities }}, and {{ graph_relations }}. If not specified, this part does not take effect.</p>
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
         * <p>The k constant in the scoring algorithm 1/(k+rank_i). The value must be a positive integer greater than 1.</p>
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
         * <p>The weight array for each SourceCollection.</p>
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
         * <p>The configurable parameters when MergeMethod is set to RRF.</p>
         */
        @NameInMap("Rrf")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf rrf;

        /**
         * <p>The configurable parameters when MergeMethod is set to Weight.</p>
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
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
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
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
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
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query</p>
         */
        @NameInMap("Instruct")
        public String instruct;

        /**
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RerankMetadataFields")
        public String rerankMetadataFields;

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

        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel setRerankMetadataFields(String rerankMetadataFields) {
            this.rerankMetadataFields = rerankMetadataFields;
            return this;
        }
        public String getRerankMetadataFields() {
            return this.rerankMetadataFields;
        }

    }

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams extends TeaModel {
        /**
         * <p>The filter condition for the data to be updated, in SQL WHERE clause format.</p>
         * 
         * <strong>example:</strong>
         * <p>id = \&quot;llm-t87l87fxuhn56woc_8anu8j2d3f_file_e74635e2cc314e838543e724f6b3b1f2_10658020\&quot;</p>
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
         * <p>The number of top entities and relationship edges to return. Default value: 60.</p>
         */
        @NameInMap("GraphSearchArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <p>The multi-path recall algorithm. Default is empty (i.e., directly compares and sorts the dense vector and full-text scores).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RRF: Reciprocal Rank Fusion. Has a parameter k to control the fusion effect. See HybridSearchArgs configuration for details.</li>
         * <li>Weight: Weight-based sorting. Uses parameters to control the score weights of vector and full-text retrieval, then sorts. See HybridSearchArgs configuration for details.</li>
         * <li>Cascaded: First performs full-text retrieval, then performs vector retrieval on top of it.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        /**
         * <p>The algorithm parameters for multi-path recall. Currently supports RRF and Weight. HybridPathsSetting can specify recall of dense vectors (dense), sparse vectors (sparse), and full-text retrieval (fulltext). If the value is empty, dense vectors (dense) and full-text retrieval (fulltext) are recalled by default.</p>
         * <ul>
         * <li>RRF: Specifies the k constant in the scoring algorithm <code>1/(k+rank_i)</code>. The value must be a positive integer greater than 1. Format:</li>
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
         * <li>Formula: alpha * dense_score + (1-alpha) * fulltext_score. The parameter alpha represents the score weight between dense vector and full-text retrieval, ranging from 0 to 1, where 0 means full-text only and 1 means dense vector only:</li>
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
         * <li>Three-path recall mode:<ul>
         * <li>Formula: normalized_dense * dense_score + normalized_sparse * sparse_score + normalized_fulltext * fulltext_score. Where dense, sparse, and fulltext represent the weights for dense vector, sparse vector, and full-text retrieval respectively, with values greater than or equal to 0. The system automatically normalizes the weights to the range 0-1 (i.e., normalized_x = x / (dense + sparse + fulltext)).</li>
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
         * <p>The method used when building the vector index. Valid values:</p>
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
         * <p>The recall window. When this value is not empty, additional context of the retrieval results is returned. The format is a 2-element array: List&lt;A, B&gt;, where -10 &lt;= A &lt;= 0 and 0 &lt;= B &lt;= 10.</p>
         * <blockquote>
         * <ul>
         * <li>It is recommended to use this parameter when document segmentation is too granular and retrieval may lose contextual information.</li>
         * <li>Reranking takes priority over windowing, meaning reranking is performed first, then windowing is applied.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <p>The reranking factor. When this value is not empty, the vector retrieval results are reranked. Value range: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document segmentation is sparse.</li>
         * <li>It is recommended that the number of items to rerank (TopK * Factor, rounded up) does not exceed 50.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsRerankModel rerankModel;

        /**
         * <p>The number of top results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
         * <p>Specifies whether to use full-text retrieval (dual-path recall). Default value: false, which means only vector retrieval is used.</p>
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
         * <p>The name of the collection to recall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_document_collection</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The namespace. Default value: public.</p>
         * <blockquote>
         * <p>You can create a namespace by calling the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation, and view the list by calling the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dukang</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password corresponding to the namespace.</p>
         * <blockquote>
         * <p>This value is specified in the CreateNamespace operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespacePasswd</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

        /**
         * <p>The parameters related to knowledge base retrieval.</p>
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
         * <p>The method for merging multiple knowledge bases. Default is RRF. Valid values:</p>
         * <ul>
         * <li>RRF</li>
         * <li>Weight</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;RRF&quot;</p>
         */
        @NameInMap("MergeMethod")
        public String mergeMethod;

        /**
         * <p>The parameters for multi-knowledge base fusion.</p>
         */
        @NameInMap("MergeMethodArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs;

        /**
         * <p>The reranking factor. When this value is not empty, the vector retrieval results are reranked. Value range: 1 &lt; RerankFactor &lt;= 5.</p>
         * <blockquote>
         * <ul>
         * <li>Reranking is slow when document segmentation is sparse.</li>
         * <li>It is recommended that the number of items to rerank (TopK * Factor, rounded up) does not exceed 50.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0001</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        @NameInMap("RerankModel")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsRerankModel rerankModel;

        /**
         * <p>The list of knowledge bases.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceCollection")
        public java.util.List<ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection> sourceCollection;

        /**
         * <p>The number of top results to return after merging the recall results from multiple vector collections.</p>
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
         * <li>assistant</li>
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
         * <p>The function tool description.</p>
         * 
         * <strong>example:</strong>
         * <p>获取天气。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The function tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The function parameters in JSON Schema format.</p>
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
         * <p>The message list.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsMessages> messages;

        /**
         * <p>The name of the large model to use. For valid values, see: <a href="https://help.aliyun.com/zh/model-studio/compatibility-of-openai-with-dashscope?spm=a2c4g.11186623.help-menu-2400256.d_2_10_0.45b5516eZIciC8&scm=20140722.H_2833609._.OR_help-T_cn~zh-V_1#eadfc13038jd5">Bailian Help Documentation</a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of candidate replies to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public Long n;

        /**
         * <p>The presence penalty coefficient (-2.0 to 2.0).</p>
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
         * <p>The stop word list.</p>
         */
        @NameInMap("Stop")
        public java.util.List<String> stop;

        /**
         * <p>The sampling temperature (0 to 2).</p>
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
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsTools> tools;

        /**
         * <p>The nucleus sampling probability threshold (0 to 1).</p>
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
