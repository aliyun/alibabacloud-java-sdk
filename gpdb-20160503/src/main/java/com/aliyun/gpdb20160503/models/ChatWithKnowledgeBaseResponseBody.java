// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ChatWithKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>model response.</p>
     */
    @NameInMap("ChatCompletion")
    public ChatWithKnowledgeBaseResponseBodyChatCompletion chatCompletion;

    /**
     * <p>The returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Retrieve information from multiple knowledge bases.</p>
     */
    @NameInMap("MultiCollectionRecallResult")
    public ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResult multiCollectionRecallResult;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
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
         * <p>Arguments of the called function.</p>
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
         * <p>Function call information.</p>
         */
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
         * <p>The position of this tool in the \&quot;input\&quot; request parameter.</p>
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
         * <p>The content of the document.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>模型思维内容</p>
         * 
         * <strong>example:</strong>
         * <p>逻辑推理过程</p>
         */
        @NameInMap("ReasoningContent")
        public String reasoningContent;

        /**
         * <p>Message role:</p>
         * <ul>
         * <li>system</li>
         * <li>user</li>
         * <li>assistant</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Tool call response.</p>
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
         * <p>Finish reason.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>The sequence number of the reply.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>LLM response.</p>
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
         * <p>The number of tokens from cache hits.</p>
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
         * <p>The number of tokens consumed by the generated content.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <p>The number of tokens consumed by the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        /**
         * <p>The details about the prompt token.</p>
         */
        @NameInMap("PromptTokensDetails")
        public ChatWithKnowledgeBaseResponseBodyChatCompletionUsagePromptTokensDetails promptTokensDetails;

        /**
         * <p>The total number of tokens.</p>
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
         * <p>Text content generated in real time.</p>
         */
        @NameInMap("Choices")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyChatCompletionChoices> choices;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1758529748</p>
         */
        @NameInMap("Created")
        public Long created;

        /**
         * <p>The ID of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of tokens used in LLM output.</p>
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
         * <p>The content of the document.</p>
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
         * <p>The URL of the image result. By default, the URL is valid for 2 hours.</p>
         * <p>You can use the UrlExpiration parameter to specify a validity period.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/b4d8_207196811002111319_570c0e199f03428f812ab21fcc00dd6a</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The unique ID of the vector data.</p>
         * 
         * <strong>example:</strong>
         * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Document loader metadata.</p>
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
         * <p>The rerank score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("RerankScore")
        public Double rerankScore;

        /**
         * <p>The source of the retrieved results. 1 indicates vector retrieval, 2 indicates full-text retrieval, and 3 indicates dual-path retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RetrievalSource")
        public Long retrievalSource;

        /**
         * <p>The similarity score of the data. It is related to the <code>l2, ip, or cosine</code> algorithm that is specified when you create an index.</p>
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
         * <p>The number of tokens that are used during vectorization.</p>
         * <blockquote>
         * <p> A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
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
         * <p>The details of the entity.</p>
         */
        @NameInMap("Entities")
        public java.util.List<String> entities;

        /**
         * <p>The retrieved items.</p>
         */
        @NameInMap("Matches")
        public java.util.List<ChatWithKnowledgeBaseResponseBodyMultiCollectionRecallResultMatches> matches;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("Relations")
        public java.util.List<String> relations;

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B9E3255-4543-5B3B-9E00-6490CA64742B</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of tokens that are consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Tokens")
        public Long tokens;

        /**
         * <p>The number of tokens that are consumed during document understanding or embedding.</p>
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
