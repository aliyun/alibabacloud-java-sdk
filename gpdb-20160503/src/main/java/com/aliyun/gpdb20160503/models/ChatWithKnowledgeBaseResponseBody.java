// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseResponseBody extends TeaModel {
    @NameInMap("ChatCompletion")
    public ChatWithKnowledgeBaseResponseBodyChatCompletion chatCompletion;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("MultiCollectionRecallResult")
    public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult multiCollectionRecallResult;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ChatWithKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseResponseBody self = new ChatWithKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseResponseBody setChatCompletion(ChatWithKnowledgeBaseResponseBodyChatCompletion chatCompletion) {
        this.chatCompletion = chatCompletion;
        return this;
    }
    public ChatWithKnowledgeBaseResponseBodyChatCompletion getChatCompletion() {
        return this.chatCompletion;
    }

    public ChatWithKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatWithKnowledgeBaseResponseBody setMultiCollectionRecallResult(ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult multiCollectionRecallResult) {
        this.multiCollectionRecallResult = multiCollectionRecallResult;
        return this;
    }
    public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult getMultiCollectionRecallResult() {
        return this.multiCollectionRecallResult;
    }

    public ChatWithKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatWithKnowledgeBaseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;hangzhou&quot;}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>&quot;get_weather&quot;</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction self = new ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls extends TeaModel {
        @NameInMap("Function")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction function;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;chatcmpl-c1bebafa-cc48-44e2-88c6-1a3572952f8e&quot;</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls self = new ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls setFunction(ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction getFunction() {
            return this.function;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        @NameInMap("ToolCalls")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls> toolCalls;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage self = new ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage setToolCalls(java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        @NameInMap("Message")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage message;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionChoices build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionChoices self = new ChatWithKnowledgeBaseResponseBodyChatCompletionChoices();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoices setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoices setMessage(ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage message) {
            this.message = message;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("CachedTokens")
        public Long cachedTokens;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails self = new ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails setCachedTokens(Long cachedTokens) {
            this.cachedTokens = cachedTokens;
            return this;
        }
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletionUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        @NameInMap("PromptTokensDetails")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletionUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletionUsage self = new ChatWithKnowledgeBaseResponseBodyChatCompletionUsage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage setCompletionTokens(Long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage setPromptTokens(Long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage setPromptTokensDetails(ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails) {
            this.promptTokensDetails = promptTokensDetails;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyChatCompletion extends TeaModel {
        @NameInMap("Choices")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoices> choices;

        /**
         * <strong>example:</strong>
         * <p>1758529748</p>
         */
        @NameInMap("Created")
        public Long created;

        /**
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("Usage")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage usage;

        public static ChatWithKnowledgeBaseResponseBodyChatCompletion build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyChatCompletion self = new ChatWithKnowledgeBaseResponseBodyChatCompletion();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletion setChoices(java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoices> getChoices() {
            return this.choices;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletion setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ChatWithKnowledgeBaseResponseBodyChatCompletion setUsage(ChatWithKnowledgeBaseResponseBodyChatCompletionUsage usage) {
            this.usage = usage;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsage getUsage() {
            return this.usage;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Source")
        public Long source;

        public static ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata self = new ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>process_info_19b9df4dc9ad4bf2b30eb2faa4a9a987.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{&quot;page&quot;:1}</p>
         */
        @NameInMap("LoaderMetadata")
        public Object loaderMetadata;

        @NameInMap("Metadata")
        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata metadata;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RetrievalSource")
        public Long retrievalSource;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Score")
        public Double score;

        @NameInMap("Vector")
        public java.util.List<Double> vector;

        public static ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches self = new ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setLoaderMetadata(Object loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public Object getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setMetadata(ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatchesMetadata getMetadata() {
            return this.metadata;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setRerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }
        public Double getRerankScore() {
            return this.rerankScore;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setRetrievalSource(Long retrievalSource) {
            this.retrievalSource = retrievalSource;
            return this;
        }
        public Long getRetrievalSource() {
            return this.retrievalSource;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setVector(java.util.List<Double> vector) {
            this.vector = vector;
            return this;
        }
        public java.util.List<Double> getVector() {
            return this.vector;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("EmbeddingTokens")
        public Long embeddingTokens;

        public static ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage self = new ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage setEmbeddingTokens(Long embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public Long getEmbeddingTokens() {
            return this.embeddingTokens;
        }

    }

    public static class ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<String> entities;

        @NameInMap("Matches")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches> matches;

        @NameInMap("Relations")
        public java.util.List<String> relations;

        /**
         * <strong>example:</strong>
         * <p>6B9E3255-4543-5B3B-9E00-6490CA64742B</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Tokens")
        public Long tokens;

        @NameInMap("Usage")
        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage usage;

        public static ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult self = new ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setEntities(java.util.List<String> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<String> getEntities() {
            return this.entities;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setMatches(java.util.List<ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches> matches) {
            this.matches = matches;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches> getMatches() {
            return this.matches;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setRelations(java.util.List<String> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<String> getRelations() {
            return this.relations;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setTokens(Long tokens) {
            this.tokens = tokens;
            return this;
        }
        public Long getTokens() {
            return this.tokens;
        }

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult setUsage(ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultUsage getUsage() {
            return this.usage;
        }

    }

}
