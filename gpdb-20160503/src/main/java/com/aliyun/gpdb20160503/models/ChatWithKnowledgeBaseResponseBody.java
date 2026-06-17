// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response from the large language model.</p>
     */
    @NameInMap("ChatCompletion")
    public ChatWithKnowledgeBaseResponseBodyChatCompletion chatCompletion;

    /**
     * <p>A message that provides details about the status of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The recall results from multiple knowledge bases.</p>
     */
    @NameInMap("MultiCollectionRecallResult")
    public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult multiCollectionRecallResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The final status of the request. Valid values:</p>
     * <ul>
     * <li><p><code>success</code>: The request was successful.</p>
     * </li>
     * <li><p><code>fail</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The arguments to pass to the function.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;hangzhou&quot;}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <p>The name of the function to call.</p>
         * 
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
        /**
         * <p>The function that the model wants to call.</p>
         */
        @NameInMap("Function")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessageToolCallsFunction function;

        /**
         * <p>The ID of the tool call.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;chatcmpl-c1bebafa-cc48-44e2-88c6-1a3572952f8e&quot;</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The index of the tool call.</p>
         * 
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
        /**
         * <p>The content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>The weather in Hangzhou is sunny.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The model\&quot;s reasoning process.</p>
         * 
         * <strong>example:</strong>
         * <p>Logical reasoning process</p>
         */
        @NameInMap("ReasoningContent")
        public String reasoningContent;

        /**
         * <p>The role of the message:</p>
         * <ul>
         * <li><p><code>system</code></p>
         * </li>
         * <li><p><code>user</code></p>
         * </li>
         * <li><p><code>assistant</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>A list of tool calls generated by the model.</p>
         */
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

        public ChatWithKnowledgeBaseResponseBodyChatCompletionChoicesMessage setReasoningContent(String reasoningContent) {
            this.reasoningContent = reasoningContent;
            return this;
        }
        public String getReasoningContent() {
            return this.reasoningContent;
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
         * <p>The reason the model stopped generating tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>The index of this choice in the <code>Choices</code> array.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The message generated by the large language model.</p>
         */
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
         * <p>The number of prompt tokens that resulted in a cache hit.</p>
         * 
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
         * <p>The number of tokens in the generated response.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <p>The number of tokens in the input prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        /**
         * <p>Details of the prompt tokens.</p>
         */
        @NameInMap("PromptTokensDetails")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails;

        /**
         * <p>The total number of tokens used in the request (prompt tokens + completion tokens).</p>
         * 
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
        /**
         * <p>A list of chat completion choices.</p>
         */
        @NameInMap("Choices")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoices> choices;

        /**
         * <p>The creation time of the response, as a Unix timestamp.</p>
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
         * <p>The model that generated the response.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Token usage statistics for the chat completion.</p>
         */
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

    public static class ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches extends TeaModel {
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
         * <p>process_info_19b9df4dc9ad4bf2b30eb2faa4a9a987.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The public URL of the file. By default, the URL is valid for 2 hours.</p>
         * <p>You can specify a custom validity period by using the <code>UrlExpiration</code> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The unique ID of the vector.</p>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metadata generated when the document was loaded.</p>
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
         * <p>0.1</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <p>The retrieval source. Valid values: <code>1</code> for vector retrieval, <code>2</code> for full-text search, and <code>3</code> for two-channel recall.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RetrievalSource")
        public Long retrievalSource;

        /**
         * <p>The similarity score. The score is based on the algorithm <code>(l2/ip/cosine)</code> specified when the index was created.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The vector data.</p>
         */
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

        public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
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
         * <p>The number of tokens used for vectorization.</p>
         * <blockquote>
         * <p>A token is the smallest unit of text. A token can be a word, a phrase, a punctuation mark, or a character.</p>
         * </blockquote>
         * 
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
        /**
         * <p>A list of identified entity types.</p>
         */
        @NameInMap("Entities")
        public java.util.List<String> entities;

        /**
         * <p>The recalled items.</p>
         */
        @NameInMap("Matches")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches> matches;

        /**
         * <p>The relationship edges.</p>
         */
        @NameInMap("Relations")
        public java.util.List<String> relations;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B9E3255-4543-5B3B-9E00-6490CA64742B</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The status of the recall operation. Valid values:</p>
         * <ul>
         * <li><p><code>success</code>: The recall was successful.</p>
         * </li>
         * <li><p><code>fail</code>: The recall failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of tokens consumed by the recall process.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Tokens")
        public Long tokens;

        /**
         * <p>Usage statistics for the recall, such as the number of tokens for vectorization.</p>
         */
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
