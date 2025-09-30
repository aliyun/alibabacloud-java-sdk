// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeKnowledgeBaseResults")
    public Boolean includeKnowledgeBaseResults;

    @NameInMap("KnowledgeParams")
    public ChatWithKnowledgeBaseRequestKnowledgeParams knowledgeParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelParams")
    public ChatWithKnowledgeBaseRequestModelParams modelParams;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PromptParams")
    public String promptParams;

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

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf extends TeaModel {
        /**
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
        @NameInMap("Rrf")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgsRrf rrf;

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

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs extends TeaModel {
        /**
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

    public static class ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>id = \&quot;llm-t87l87fxuhn56woc_8anu8j2d3f_file_e74635e2cc314e838543e724f6b3b1f2_10658020\&quot;</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GraphEnhance")
        public Boolean graphEnhance;

        @NameInMap("GraphSearchArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollectionQueryParamsGraphSearchArgs graphSearchArgs;

        /**
         * <strong>example:</strong>
         * <p>RRF</p>
         */
        @NameInMap("HybridSearch")
        public String hybridSearch;

        @NameInMap("HybridSearchArgs")
        public java.util.Map<String, ?> hybridSearchArgs;

        /**
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        @NameInMap("RecallWindow")
        public java.util.List<Long> recallWindow;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Long topK;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_document_collection</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <strong>example:</strong>
         * <p>dukang</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespacePasswd</p>
         */
        @NameInMap("NamespacePassword")
        public String namespacePassword;

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
         * <strong>example:</strong>
         * <p>&quot;RRF&quot;</p>
         */
        @NameInMap("MergeMethod")
        public String mergeMethod;

        @NameInMap("MergeMethodArgs")
        public ChatWithKnowledgeBaseRequestKnowledgeParamsMergeMethodArgs mergeMethodArgs;

        /**
         * <strong>example:</strong>
         * <p>1.0001</p>
         */
        @NameInMap("RerankFactor")
        public Double rerankFactor;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceCollection")
        public java.util.List<ChatWithKnowledgeBaseRequestKnowledgeParamsSourceCollection> sourceCollection;

        /**
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
        @NameInMap("Content")
        public String content;

        /**
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
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MaxTokens")
        public Long maxTokens;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Messages")
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsMessages> messages;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public Long n;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PresencePenalty")
        public Double presencePenalty;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Seed")
        public Long seed;

        @NameInMap("Stop")
        public java.util.List<String> stop;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        @NameInMap("Tools")
        public java.util.List<ChatWithKnowledgeBaseRequestModelParamsTools> tools;

        /**
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
