// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class PaChatCompletionStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[10,11]</p>
     */
    @NameInMap("allowedTokenIds")
    public java.util.List<Long> allowedTokenIds;

    /**
     * <strong>example:</strong>
     * <p>[&quot;blocked&quot;]</p>
     */
    @NameInMap("badWords")
    public java.util.List<String> badWords;

    @NameInMap("chatTemplateKwargs")
    public PaChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("frequencyPenalty")
    public Double frequencyPenalty;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreEos")
    public Boolean ignoreEos;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeReasoning")
    public Boolean includeReasoning;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("logprobs")
    public Boolean logprobs;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxCompletionTokens")
    public Long maxCompletionTokens;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxTokens")
    public Long maxTokens;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<PaChatCompletionStreamRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("minP")
    public Double minP;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minTokens")
    public Long minTokens;

    @NameInMap("mmProcessorKwargs")
    public PaChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs;

    @NameInMap("model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("n")
    public Long n;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("parallelToolCalls")
    public Boolean parallelToolCalls;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("presencePenalty")
    public Double presencePenalty;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("promptLogprobs")
    public Long promptLogprobs;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("reasoningEffort")
    public String reasoningEffort;

    /**
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("repetitionPenalty")
    public Double repetitionPenalty;

    @NameInMap("responseFormat")
    public PaChatCompletionStreamRequestResponseFormat responseFormat;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("seed")
    public Long seed;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skipSpecialTokens")
    public Boolean skipSpecialTokens;

    /**
     * <strong>example:</strong>
     * <p>[&quot;END&quot;]</p>
     */
    @NameInMap("stop")
    public java.util.List<String> stop;

    /**
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("stopTokenIds")
    public java.util.List<Long> stopTokenIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("streamOptions")
    public PaChatCompletionStreamRequestStreamOptions streamOptions;

    @NameInMap("structuredOutputs")
    public PaChatCompletionStreamRequestStructuredOutputs structuredOutputs;

    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("temperature")
    public Double temperature;

    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("toolChoice")
    public String toolChoice;

    @NameInMap("tools")
    public java.util.List<PaChatCompletionStreamRequestTools> tools;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topK")
    public Long topK;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("topLogprobs")
    public Long topLogprobs;

    /**
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("topP")
    public Double topP;

    public static PaChatCompletionStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        PaChatCompletionStreamRequest self = new PaChatCompletionStreamRequest();
        return TeaModel.build(map, self);
    }

    public PaChatCompletionStreamRequest setAllowedTokenIds(java.util.List<Long> allowedTokenIds) {
        this.allowedTokenIds = allowedTokenIds;
        return this;
    }
    public java.util.List<Long> getAllowedTokenIds() {
        return this.allowedTokenIds;
    }

    public PaChatCompletionStreamRequest setBadWords(java.util.List<String> badWords) {
        this.badWords = badWords;
        return this;
    }
    public java.util.List<String> getBadWords() {
        return this.badWords;
    }

    public PaChatCompletionStreamRequest setChatTemplateKwargs(PaChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs) {
        this.chatTemplateKwargs = chatTemplateKwargs;
        return this;
    }
    public PaChatCompletionStreamRequestChatTemplateKwargs getChatTemplateKwargs() {
        return this.chatTemplateKwargs;
    }

    public PaChatCompletionStreamRequest setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    public PaChatCompletionStreamRequest setIgnoreEos(Boolean ignoreEos) {
        this.ignoreEos = ignoreEos;
        return this;
    }
    public Boolean getIgnoreEos() {
        return this.ignoreEos;
    }

    public PaChatCompletionStreamRequest setIncludeReasoning(Boolean includeReasoning) {
        this.includeReasoning = includeReasoning;
        return this;
    }
    public Boolean getIncludeReasoning() {
        return this.includeReasoning;
    }

    public PaChatCompletionStreamRequest setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    public PaChatCompletionStreamRequest setMaxCompletionTokens(Long maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
        return this;
    }
    public Long getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }

    public PaChatCompletionStreamRequest setMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    public PaChatCompletionStreamRequest setMessages(java.util.List<PaChatCompletionStreamRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<PaChatCompletionStreamRequestMessages> getMessages() {
        return this.messages;
    }

    public PaChatCompletionStreamRequest setMinP(Double minP) {
        this.minP = minP;
        return this;
    }
    public Double getMinP() {
        return this.minP;
    }

    public PaChatCompletionStreamRequest setMinTokens(Long minTokens) {
        this.minTokens = minTokens;
        return this;
    }
    public Long getMinTokens() {
        return this.minTokens;
    }

    public PaChatCompletionStreamRequest setMmProcessorKwargs(PaChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs) {
        this.mmProcessorKwargs = mmProcessorKwargs;
        return this;
    }
    public PaChatCompletionStreamRequestMmProcessorKwargs getMmProcessorKwargs() {
        return this.mmProcessorKwargs;
    }

    public PaChatCompletionStreamRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PaChatCompletionStreamRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public PaChatCompletionStreamRequest setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
        return this;
    }
    public Boolean getParallelToolCalls() {
        return this.parallelToolCalls;
    }

    public PaChatCompletionStreamRequest setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public Double getPresencePenalty() {
        return this.presencePenalty;
    }

    public PaChatCompletionStreamRequest setPromptLogprobs(Long promptLogprobs) {
        this.promptLogprobs = promptLogprobs;
        return this;
    }
    public Long getPromptLogprobs() {
        return this.promptLogprobs;
    }

    public PaChatCompletionStreamRequest setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
        return this;
    }
    public String getReasoningEffort() {
        return this.reasoningEffort;
    }

    public PaChatCompletionStreamRequest setRepetitionPenalty(Double repetitionPenalty) {
        this.repetitionPenalty = repetitionPenalty;
        return this;
    }
    public Double getRepetitionPenalty() {
        return this.repetitionPenalty;
    }

    public PaChatCompletionStreamRequest setResponseFormat(PaChatCompletionStreamRequestResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public PaChatCompletionStreamRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    public PaChatCompletionStreamRequest setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

    public PaChatCompletionStreamRequest setSkipSpecialTokens(Boolean skipSpecialTokens) {
        this.skipSpecialTokens = skipSpecialTokens;
        return this;
    }
    public Boolean getSkipSpecialTokens() {
        return this.skipSpecialTokens;
    }

    public PaChatCompletionStreamRequest setStop(java.util.List<String> stop) {
        this.stop = stop;
        return this;
    }
    public java.util.List<String> getStop() {
        return this.stop;
    }

    public PaChatCompletionStreamRequest setStopTokenIds(java.util.List<Long> stopTokenIds) {
        this.stopTokenIds = stopTokenIds;
        return this;
    }
    public java.util.List<Long> getStopTokenIds() {
        return this.stopTokenIds;
    }

    public PaChatCompletionStreamRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public PaChatCompletionStreamRequest setStreamOptions(PaChatCompletionStreamRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }
    public PaChatCompletionStreamRequestStreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    public PaChatCompletionStreamRequest setStructuredOutputs(PaChatCompletionStreamRequestStructuredOutputs structuredOutputs) {
        this.structuredOutputs = structuredOutputs;
        return this;
    }
    public PaChatCompletionStreamRequestStructuredOutputs getStructuredOutputs() {
        return this.structuredOutputs;
    }

    public PaChatCompletionStreamRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public PaChatCompletionStreamRequest setToolChoice(String toolChoice) {
        this.toolChoice = toolChoice;
        return this;
    }
    public String getToolChoice() {
        return this.toolChoice;
    }

    public PaChatCompletionStreamRequest setTools(java.util.List<PaChatCompletionStreamRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<PaChatCompletionStreamRequestTools> getTools() {
        return this.tools;
    }

    public PaChatCompletionStreamRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public PaChatCompletionStreamRequest setTopLogprobs(Long topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    public Long getTopLogprobs() {
        return this.topLogprobs;
    }

    public PaChatCompletionStreamRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

    public static class PaChatCompletionStreamRequestChatTemplateKwargs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableThinking")
        public Boolean enableThinking;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("preserveThinking")
        public Boolean preserveThinking;

        public static PaChatCompletionStreamRequestChatTemplateKwargs build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestChatTemplateKwargs self = new PaChatCompletionStreamRequestChatTemplateKwargs();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestChatTemplateKwargs setEnableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        public PaChatCompletionStreamRequestChatTemplateKwargs setPreserveThinking(Boolean preserveThinking) {
            this.preserveThinking = preserveThinking;
            return this;
        }
        public Boolean getPreserveThinking() {
            return this.preserveThinking;
        }

    }

    public static class PaChatCompletionStreamRequestMessagesContentImageUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/image.png">https://example.com/image.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static PaChatCompletionStreamRequestMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMessagesContentImageUrl self = new PaChatCompletionStreamRequestMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PaChatCompletionStreamRequestMessagesContent extends TeaModel {
        @NameInMap("imageUrl")
        public PaChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <strong>example:</strong>
         * <p>请分析这张图片</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMessagesContent self = new PaChatCompletionStreamRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMessagesContent setImageUrl(PaChatCompletionStreamRequestMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public PaChatCompletionStreamRequestMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public PaChatCompletionStreamRequestMessagesContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public PaChatCompletionStreamRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaChatCompletionStreamRequestMessagesToolCallsFunction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;杭州&quot;}</p>
         */
        @NameInMap("arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        public static PaChatCompletionStreamRequestMessagesToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMessagesToolCallsFunction self = new PaChatCompletionStreamRequestMessagesToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMessagesToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public PaChatCompletionStreamRequestMessagesToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class PaChatCompletionStreamRequestMessagesToolCalls extends TeaModel {
        @NameInMap("function")
        public PaChatCompletionStreamRequestMessagesToolCallsFunction function;

        /**
         * <strong>example:</strong>
         * <p>call_weather_1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>function</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestMessagesToolCalls build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMessagesToolCalls self = new PaChatCompletionStreamRequestMessagesToolCalls();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMessagesToolCalls setFunction(PaChatCompletionStreamRequestMessagesToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public PaChatCompletionStreamRequestMessagesToolCallsFunction getFunction() {
            return this.function;
        }

        public PaChatCompletionStreamRequestMessagesToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PaChatCompletionStreamRequestMessagesToolCalls setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaChatCompletionStreamRequestMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>请分析图片内容</p>
         */
        @NameInMap("content")
        public java.util.List<PaChatCompletionStreamRequestMessagesContent> content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>call_weather_1</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        @NameInMap("toolCalls")
        public java.util.List<PaChatCompletionStreamRequestMessagesToolCalls> toolCalls;

        public static PaChatCompletionStreamRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMessages self = new PaChatCompletionStreamRequestMessages();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMessages setContent(java.util.List<PaChatCompletionStreamRequestMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<PaChatCompletionStreamRequestMessagesContent> getContent() {
            return this.content;
        }

        public PaChatCompletionStreamRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public PaChatCompletionStreamRequestMessages setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

        public PaChatCompletionStreamRequestMessages setToolCalls(java.util.List<PaChatCompletionStreamRequestMessagesToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<PaChatCompletionStreamRequestMessagesToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class PaChatCompletionStreamRequestMmProcessorKwargs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("maxDynamicPatch")
        public Long maxDynamicPatch;

        public static PaChatCompletionStreamRequestMmProcessorKwargs build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestMmProcessorKwargs self = new PaChatCompletionStreamRequestMmProcessorKwargs();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestMmProcessorKwargs setMaxDynamicPatch(Long maxDynamicPatch) {
            this.maxDynamicPatch = maxDynamicPatch;
            return this;
        }
        public Long getMaxDynamicPatch() {
            return this.maxDynamicPatch;
        }

    }

    public static class PaChatCompletionStreamRequestResponseFormat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>json_object</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestResponseFormat build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestResponseFormat self = new PaChatCompletionStreamRequestResponseFormat();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestResponseFormat setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaChatCompletionStreamRequestStreamOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("includeUsage")
        public Boolean includeUsage;

        public static PaChatCompletionStreamRequestStreamOptions build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestStreamOptions self = new PaChatCompletionStreamRequestStreamOptions();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestStreamOptions setIncludeUsage(Boolean includeUsage) {
            this.includeUsage = includeUsage;
            return this;
        }
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

    }

    public static class PaChatCompletionStreamRequestStructuredOutputs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;yes&quot;,&quot;no&quot;]</p>
         */
        @NameInMap("choice")
        public java.util.List<String> choice;

        public static PaChatCompletionStreamRequestStructuredOutputs build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestStructuredOutputs self = new PaChatCompletionStreamRequestStructuredOutputs();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestStructuredOutputs setChoice(java.util.List<String> choice) {
            this.choice = choice;
            return this;
        }
        public java.util.List<String> getChoice() {
            return this.choice;
        }

    }

    public static class PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>要查询天气的城市名称</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity self = new PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaChatCompletionStreamRequestToolsFunctionParametersProperties extends TeaModel {
        @NameInMap("city")
        public PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity city;

        public static PaChatCompletionStreamRequestToolsFunctionParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestToolsFunctionParametersProperties self = new PaChatCompletionStreamRequestToolsFunctionParametersProperties();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestToolsFunctionParametersProperties setCity(PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity city) {
            this.city = city;
            return this;
        }
        public PaChatCompletionStreamRequestToolsFunctionParametersPropertiesCity getCity() {
            return this.city;
        }

    }

    public static class PaChatCompletionStreamRequestToolsFunctionParameters extends TeaModel {
        @NameInMap("properties")
        public PaChatCompletionStreamRequestToolsFunctionParametersProperties properties;

        @NameInMap("required")
        public java.util.List<String> required;

        /**
         * <strong>example:</strong>
         * <p>object</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestToolsFunctionParameters build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestToolsFunctionParameters self = new PaChatCompletionStreamRequestToolsFunctionParameters();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestToolsFunctionParameters setProperties(PaChatCompletionStreamRequestToolsFunctionParametersProperties properties) {
            this.properties = properties;
            return this;
        }
        public PaChatCompletionStreamRequestToolsFunctionParametersProperties getProperties() {
            return this.properties;
        }

        public PaChatCompletionStreamRequestToolsFunctionParameters setRequired(java.util.List<String> required) {
            this.required = required;
            return this;
        }
        public java.util.List<String> getRequired() {
            return this.required;
        }

        public PaChatCompletionStreamRequestToolsFunctionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PaChatCompletionStreamRequestToolsFunction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>查询指定城市天气</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("parameters")
        public PaChatCompletionStreamRequestToolsFunctionParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("strict")
        public Boolean strict;

        public static PaChatCompletionStreamRequestToolsFunction build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestToolsFunction self = new PaChatCompletionStreamRequestToolsFunction();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestToolsFunction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PaChatCompletionStreamRequestToolsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PaChatCompletionStreamRequestToolsFunction setParameters(PaChatCompletionStreamRequestToolsFunctionParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public PaChatCompletionStreamRequestToolsFunctionParameters getParameters() {
            return this.parameters;
        }

        public PaChatCompletionStreamRequestToolsFunction setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

    public static class PaChatCompletionStreamRequestTools extends TeaModel {
        @NameInMap("function")
        public PaChatCompletionStreamRequestToolsFunction function;

        /**
         * <strong>example:</strong>
         * <p>function</p>
         */
        @NameInMap("type")
        public String type;

        public static PaChatCompletionStreamRequestTools build(java.util.Map<String, ?> map) throws Exception {
            PaChatCompletionStreamRequestTools self = new PaChatCompletionStreamRequestTools();
            return TeaModel.build(map, self);
        }

        public PaChatCompletionStreamRequestTools setFunction(PaChatCompletionStreamRequestToolsFunction function) {
            this.function = function;
            return this;
        }
        public PaChatCompletionStreamRequestToolsFunction getFunction() {
            return this.function;
        }

        public PaChatCompletionStreamRequestTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
