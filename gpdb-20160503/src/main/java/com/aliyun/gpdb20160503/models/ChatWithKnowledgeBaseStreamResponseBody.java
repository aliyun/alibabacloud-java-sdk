// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseStreamResponseBody extends TeaModel {
    /**
     * <p>The model response.</p>
     */
    @NameInMap("ChatCompletion")
    public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion chatCompletion;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The recall information from multiple knowledge bases.</p>
     */
    @NameInMap("MultiCollectionRecallResult")
    public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult multiCollectionRecallResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: Successful.</li>
     * <li><strong>fail</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ChatWithKnowledgeBaseStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatWithKnowledgeBaseStreamResponseBody self = new ChatWithKnowledgeBaseStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatWithKnowledgeBaseStreamResponseBody setChatCompletion(ChatWithKnowledgeBaseStreamResponseBodyChatCompletion chatCompletion) {
        this.chatCompletion = chatCompletion;
        return this;
    }
    public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion getChatCompletion() {
        return this.chatCompletion;
    }

    public ChatWithKnowledgeBaseStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatWithKnowledgeBaseStreamResponseBody setMultiCollectionRecallResult(ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult multiCollectionRecallResult) {
        this.multiCollectionRecallResult = multiCollectionRecallResult;
        return this;
    }
    public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult getMultiCollectionRecallResult() {
        return this.multiCollectionRecallResult;
    }

    public ChatWithKnowledgeBaseStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatWithKnowledgeBaseStreamResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction extends TeaModel {
        /**
         * <p>The arguments of the called function.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;hangzhou&quot;}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <p>The name of the called function.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;get_weather&quot;</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls extends TeaModel {
        /**
         * <p>The information about the called function.</p>
         */
        @NameInMap("Function")
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction function;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;chatcmpl-c1bebafa-cc48-44e2-88c6-1a3572952f8e&quot;</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The index of this tool in the Input request parameter, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls setFunction(ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCallsFunction getFunction() {
            return this.function;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage extends TeaModel {
        /**
         * <p>The document content.</p>
         * 
         * <strong>example:</strong>
         * <p>The weather in Hangzhou is sunny.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The chain-of-thought content of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Logical reasoning process</p>
         */
        @NameInMap("ReasoningContent")
        public String reasoningContent;

        /**
         * <p>The message role. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>user</li>
         * <li>assistant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The tool invocation response.</p>
         */
        @NameInMap("ToolCalls")
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls> toolCalls;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage setReasoningContent(String reasoningContent) {
            this.reasoningContent = reasoningContent;
            return this;
        }
        public String getReasoningContent() {
            return this.reasoningContent;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage setToolCalls(java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessageToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices extends TeaModel {
        /**
         * <p>The stop reason.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>The response index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The large language model response.</p>
         */
        @NameInMap("Message")
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage message;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices setMessage(ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage message) {
            this.message = message;
            return this;
        }
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails extends TeaModel {
        /**
         * <p>The number of tokens that hit the cache.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("CachedTokens")
        public Long cachedTokens;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails setCachedTokens(Long cachedTokens) {
            this.cachedTokens = cachedTokens;
            return this;
        }
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage extends TeaModel {
        /**
         * <p>The number of tokens consumed for generating the content.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <p>The number of tokens consumed by the input prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        /**
         * <p>The prompt token details.</p>
         */
        @NameInMap("PromptTokensDetails")
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage setCompletionTokens(Long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage setPromptTokens(Long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage setPromptTokensDetails(ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails) {
            this.promptTokensDetails = promptTokensDetails;
            return this;
        }
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsagePromptTokensDetails getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyChatCompletion extends TeaModel {
        /**
         * <p>The text content generated in real time.</p>
         */
        @NameInMap("Choices")
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices> choices;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1758529748</p>
         */
        @NameInMap("Created")
        public Long created;

        /**
         * <p>The response ID.</p>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the model used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of tokens used by the large language model output.</p>
         */
        @NameInMap("Usage")
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage usage;

        public static ChatWithKnowledgeBaseStreamResponseBodyChatCompletion build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyChatCompletion self = new ChatWithKnowledgeBaseStreamResponseBodyChatCompletion();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion setChoices(java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyChatCompletionChoices> getChoices() {
            return this.choices;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletion setUsage(ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage usage) {
            this.usage = usage;
            return this;
        }
        public ChatWithKnowledgeBaseStreamResponseBodyChatCompletionUsage getUsage() {
            return this.usage;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches extends TeaModel {
        /**
         * <p>The document content.</p>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB PostgreSQL vector database.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>a14b0221-e3f2-4cf2-96cd-b3c293510770.jpg</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The public URL of the image in the query result. The URL is valid for 2 hours by default.</p>
         * <p>You can specify a custom validity period by using the UrlExpiration parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dailyshort-sh.oss-cn-shanghai.aliyuncs.com/vod-8efba5/f06147795c6c71f080605420848d0302/0ca34d5743a84bf7c68f489a60715dac-ld.mp4">http://dailyshort-sh.oss-cn-shanghai.aliyuncs.com/vod-8efba5/f06147795c6c71f080605420848d0302/0ca34d5743a84bf7c68f489a60715dac-ld.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The unique ID of this vector data entry.</p>
         * <blockquote>
         * <p>If this value is empty, the database automatically generates a UUID. If this value is not empty and conflicts with an existing ID in the database, the API data overwrites the existing value in the database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metadata generated by the document loader during loading.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;page&quot;:1}</p>
         */
        @NameInMap("LoaderMetadata")
        public Object loaderMetadata;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The reranking score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <p>The source of the retrieve result. A value of 1 indicates AISearch retrieve, 2 indicates full-text index retrieve, and 3 indicates multi-channel recall.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("RetrievalSource")
        public Long retrievalSource;

        /**
         * <p>The similarity score of this data entry. The scoring algorithm is related to the algorithm specified during index creation (l2, ip, or cosine).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The vector data.</p>
         */
        @NameInMap("Vector")
        public java.util.List<Double> vector;

        public static ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches self = new ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setLoaderMetadata(Object loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public Object getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setRerankScore(Double rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }
        public Double getRerankScore() {
            return this.rerankScore;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setRetrievalSource(Long retrievalSource) {
            this.retrievalSource = retrievalSource;
            return this;
        }
        public Long getRetrievalSource() {
            return this.retrievalSource;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches setVector(java.util.List<Double> vector) {
            this.vector = vector;
            return this;
        }
        public java.util.List<Double> getVector() {
            return this.vector;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage extends TeaModel {
        /**
         * <p>The number of tokens used during vectorization.</p>
         * <blockquote>
         * <p>A token is the smallest unit into which input text is segmented. A token can be a word, a phrase, a punctuation mark, or a character.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>158</p>
         */
        @NameInMap("EmbeddingTokens")
        public Long embeddingTokens;

        public static ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage self = new ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage setEmbeddingTokens(Long embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public Long getEmbeddingTokens() {
            return this.embeddingTokens;
        }

    }

    public static class ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult extends TeaModel {
        /**
         * <p>The entity details.</p>
         */
        @NameInMap("Entities")
        public java.util.List<String> entities;

        /**
         * <p>The recall items.</p>
         */
        @NameInMap("Matches")
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches> matches;

        /**
         * <p>The relation names.</p>
         */
        @NameInMap("Relations")
        public java.util.List<String> relations;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The API execution status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The execution is successful.</li>
         * <li><strong>fail</strong>: The execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Tokens")
        public Long tokens;

        /**
         * <p>The number of tokens or entries consumed by document understanding or embedding.</p>
         */
        @NameInMap("Usage")
        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage usage;

        public static ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult build(java.util.Map<String, ?> map) throws Exception {
            ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult self = new ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult();
            return TeaModel.build(map, self);
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setEntities(java.util.List<String> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<String> getEntities() {
            return this.entities;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setMatches(java.util.List<ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches> matches) {
            this.matches = matches;
            return this;
        }
        public java.util.List<ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultMatches> getMatches() {
            return this.matches;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setRelations(java.util.List<String> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<String> getRelations() {
            return this.relations;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setTokens(Long tokens) {
            this.tokens = tokens;
            return this;
        }
        public Long getTokens() {
            return this.tokens;
        }

        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResult setUsage(ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage usage) {
            this.usage = usage;
            return this;
        }
        public ChatWithKnowledgeBaseStreamResponseBodyMultiCollectionRecallResultUsage getUsage() {
            return this.usage;
        }

    }

}
