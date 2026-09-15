// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class GuiChatCompletionStreamRequest extends TeaModel {
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
    public GuiChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs;

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
    public java.util.List<GuiChatCompletionStreamRequestMessages> messages;

    @NameInMap("metadata")
    public GuiChatCompletionStreamRequestMetadata metadata;

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
    public GuiChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs;

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
     * <p>medium</p>
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
    public GuiChatCompletionStreamRequestResponseFormat responseFormat;

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
     * <p>[&quot;DONE&quot;]</p>
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
    public GuiChatCompletionStreamRequestStreamOptions streamOptions;

    @NameInMap("structuredOutputs")
    public GuiChatCompletionStreamRequestStructuredOutputs structuredOutputs;

    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("temperature")
    public Double temperature;

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

    public static GuiChatCompletionStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        GuiChatCompletionStreamRequest self = new GuiChatCompletionStreamRequest();
        return TeaModel.build(map, self);
    }

    public GuiChatCompletionStreamRequest setAllowedTokenIds(java.util.List<Long> allowedTokenIds) {
        this.allowedTokenIds = allowedTokenIds;
        return this;
    }
    public java.util.List<Long> getAllowedTokenIds() {
        return this.allowedTokenIds;
    }

    public GuiChatCompletionStreamRequest setBadWords(java.util.List<String> badWords) {
        this.badWords = badWords;
        return this;
    }
    public java.util.List<String> getBadWords() {
        return this.badWords;
    }

    public GuiChatCompletionStreamRequest setChatTemplateKwargs(GuiChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs) {
        this.chatTemplateKwargs = chatTemplateKwargs;
        return this;
    }
    public GuiChatCompletionStreamRequestChatTemplateKwargs getChatTemplateKwargs() {
        return this.chatTemplateKwargs;
    }

    public GuiChatCompletionStreamRequest setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    public GuiChatCompletionStreamRequest setIgnoreEos(Boolean ignoreEos) {
        this.ignoreEos = ignoreEos;
        return this;
    }
    public Boolean getIgnoreEos() {
        return this.ignoreEos;
    }

    public GuiChatCompletionStreamRequest setIncludeReasoning(Boolean includeReasoning) {
        this.includeReasoning = includeReasoning;
        return this;
    }
    public Boolean getIncludeReasoning() {
        return this.includeReasoning;
    }

    public GuiChatCompletionStreamRequest setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    public GuiChatCompletionStreamRequest setMaxCompletionTokens(Long maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
        return this;
    }
    public Long getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }

    public GuiChatCompletionStreamRequest setMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    public GuiChatCompletionStreamRequest setMessages(java.util.List<GuiChatCompletionStreamRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<GuiChatCompletionStreamRequestMessages> getMessages() {
        return this.messages;
    }

    public GuiChatCompletionStreamRequest setMetadata(GuiChatCompletionStreamRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public GuiChatCompletionStreamRequestMetadata getMetadata() {
        return this.metadata;
    }

    public GuiChatCompletionStreamRequest setMinP(Double minP) {
        this.minP = minP;
        return this;
    }
    public Double getMinP() {
        return this.minP;
    }

    public GuiChatCompletionStreamRequest setMinTokens(Long minTokens) {
        this.minTokens = minTokens;
        return this;
    }
    public Long getMinTokens() {
        return this.minTokens;
    }

    public GuiChatCompletionStreamRequest setMmProcessorKwargs(GuiChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs) {
        this.mmProcessorKwargs = mmProcessorKwargs;
        return this;
    }
    public GuiChatCompletionStreamRequestMmProcessorKwargs getMmProcessorKwargs() {
        return this.mmProcessorKwargs;
    }

    public GuiChatCompletionStreamRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GuiChatCompletionStreamRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public GuiChatCompletionStreamRequest setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
        return this;
    }
    public Boolean getParallelToolCalls() {
        return this.parallelToolCalls;
    }

    public GuiChatCompletionStreamRequest setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public Double getPresencePenalty() {
        return this.presencePenalty;
    }

    public GuiChatCompletionStreamRequest setPromptLogprobs(Long promptLogprobs) {
        this.promptLogprobs = promptLogprobs;
        return this;
    }
    public Long getPromptLogprobs() {
        return this.promptLogprobs;
    }

    public GuiChatCompletionStreamRequest setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
        return this;
    }
    public String getReasoningEffort() {
        return this.reasoningEffort;
    }

    public GuiChatCompletionStreamRequest setRepetitionPenalty(Double repetitionPenalty) {
        this.repetitionPenalty = repetitionPenalty;
        return this;
    }
    public Double getRepetitionPenalty() {
        return this.repetitionPenalty;
    }

    public GuiChatCompletionStreamRequest setResponseFormat(GuiChatCompletionStreamRequestResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public GuiChatCompletionStreamRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    public GuiChatCompletionStreamRequest setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

    public GuiChatCompletionStreamRequest setSkipSpecialTokens(Boolean skipSpecialTokens) {
        this.skipSpecialTokens = skipSpecialTokens;
        return this;
    }
    public Boolean getSkipSpecialTokens() {
        return this.skipSpecialTokens;
    }

    public GuiChatCompletionStreamRequest setStop(java.util.List<String> stop) {
        this.stop = stop;
        return this;
    }
    public java.util.List<String> getStop() {
        return this.stop;
    }

    public GuiChatCompletionStreamRequest setStopTokenIds(java.util.List<Long> stopTokenIds) {
        this.stopTokenIds = stopTokenIds;
        return this;
    }
    public java.util.List<Long> getStopTokenIds() {
        return this.stopTokenIds;
    }

    public GuiChatCompletionStreamRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public GuiChatCompletionStreamRequest setStreamOptions(GuiChatCompletionStreamRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }
    public GuiChatCompletionStreamRequestStreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    public GuiChatCompletionStreamRequest setStructuredOutputs(GuiChatCompletionStreamRequestStructuredOutputs structuredOutputs) {
        this.structuredOutputs = structuredOutputs;
        return this;
    }
    public GuiChatCompletionStreamRequestStructuredOutputs getStructuredOutputs() {
        return this.structuredOutputs;
    }

    public GuiChatCompletionStreamRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public GuiChatCompletionStreamRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public GuiChatCompletionStreamRequest setTopLogprobs(Long topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    public Long getTopLogprobs() {
        return this.topLogprobs;
    }

    public GuiChatCompletionStreamRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

    public static class GuiChatCompletionStreamRequestChatTemplateKwargs extends TeaModel {
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

        public static GuiChatCompletionStreamRequestChatTemplateKwargs build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestChatTemplateKwargs self = new GuiChatCompletionStreamRequestChatTemplateKwargs();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestChatTemplateKwargs setEnableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        public GuiChatCompletionStreamRequestChatTemplateKwargs setPreserveThinking(Boolean preserveThinking) {
            this.preserveThinking = preserveThinking;
            return this;
        }
        public Boolean getPreserveThinking() {
            return this.preserveThinking;
        }

    }

    public static class GuiChatCompletionStreamRequestMessagesContentImageUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/screenshot.png">https://example.com/screenshot.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GuiChatCompletionStreamRequestMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestMessagesContentImageUrl self = new GuiChatCompletionStreamRequestMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GuiChatCompletionStreamRequestMessagesContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data:image/png;base64,...</p>
         */
        @NameInMap("imageData")
        public String imageData;

        @NameInMap("imageUrl")
        public GuiChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <strong>example:</strong>
         * <p>点击搜索按钮</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GuiChatCompletionStreamRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestMessagesContent self = new GuiChatCompletionStreamRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestMessagesContent setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public GuiChatCompletionStreamRequestMessagesContent setImageUrl(GuiChatCompletionStreamRequestMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public GuiChatCompletionStreamRequestMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public GuiChatCompletionStreamRequestMessagesContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GuiChatCompletionStreamRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GuiChatCompletionStreamRequestMessages extends TeaModel {
        @NameInMap("content")
        public java.util.List<GuiChatCompletionStreamRequestMessagesContent> content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>call_gui_1</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        public static GuiChatCompletionStreamRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestMessages self = new GuiChatCompletionStreamRequestMessages();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestMessages setContent(java.util.List<GuiChatCompletionStreamRequestMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GuiChatCompletionStreamRequestMessagesContent> getContent() {
            return this.content;
        }

        public GuiChatCompletionStreamRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GuiChatCompletionStreamRequestMessages setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

    }

    public static class GuiChatCompletionStreamRequestMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
         */
        @NameInMap("appList")
        public java.util.List<String> appList;

        /**
         * <strong>example:</strong>
         * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
         */
        @NameInMap("availableApps")
        public java.util.List<String> availableApps;

        /**
         * <strong>example:</strong>
         * <p>previous action completed</p>
         */
        @NameInMap("harnessMessage")
        public String harnessMessage;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("screenHeight")
        public Long screenHeight;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("screenWidth")
        public Long screenWidth;

        public static GuiChatCompletionStreamRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestMetadata self = new GuiChatCompletionStreamRequestMetadata();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestMetadata setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

        public GuiChatCompletionStreamRequestMetadata setAvailableApps(java.util.List<String> availableApps) {
            this.availableApps = availableApps;
            return this;
        }
        public java.util.List<String> getAvailableApps() {
            return this.availableApps;
        }

        public GuiChatCompletionStreamRequestMetadata setHarnessMessage(String harnessMessage) {
            this.harnessMessage = harnessMessage;
            return this;
        }
        public String getHarnessMessage() {
            return this.harnessMessage;
        }

        public GuiChatCompletionStreamRequestMetadata setScreenHeight(Long screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Long getScreenHeight() {
            return this.screenHeight;
        }

        public GuiChatCompletionStreamRequestMetadata setScreenWidth(Long screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Long getScreenWidth() {
            return this.screenWidth;
        }

    }

    public static class GuiChatCompletionStreamRequestMmProcessorKwargs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("maxDynamicPatch")
        public Long maxDynamicPatch;

        public static GuiChatCompletionStreamRequestMmProcessorKwargs build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestMmProcessorKwargs self = new GuiChatCompletionStreamRequestMmProcessorKwargs();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestMmProcessorKwargs setMaxDynamicPatch(Long maxDynamicPatch) {
            this.maxDynamicPatch = maxDynamicPatch;
            return this;
        }
        public Long getMaxDynamicPatch() {
            return this.maxDynamicPatch;
        }

    }

    public static class GuiChatCompletionStreamRequestResponseFormat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>json_object</p>
         */
        @NameInMap("type")
        public String type;

        public static GuiChatCompletionStreamRequestResponseFormat build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestResponseFormat self = new GuiChatCompletionStreamRequestResponseFormat();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestResponseFormat setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GuiChatCompletionStreamRequestStreamOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("includeUsage")
        public Boolean includeUsage;

        public static GuiChatCompletionStreamRequestStreamOptions build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestStreamOptions self = new GuiChatCompletionStreamRequestStreamOptions();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestStreamOptions setIncludeUsage(Boolean includeUsage) {
            this.includeUsage = includeUsage;
            return this;
        }
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

    }

    public static class GuiChatCompletionStreamRequestStructuredOutputs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;tap&quot;,&quot;type&quot;]</p>
         */
        @NameInMap("choice")
        public java.util.List<String> choice;

        public static GuiChatCompletionStreamRequestStructuredOutputs build(java.util.Map<String, ?> map) throws Exception {
            GuiChatCompletionStreamRequestStructuredOutputs self = new GuiChatCompletionStreamRequestStructuredOutputs();
            return TeaModel.build(map, self);
        }

        public GuiChatCompletionStreamRequestStructuredOutputs setChoice(java.util.List<String> choice) {
            this.choice = choice;
            return this;
        }
        public java.util.List<String> getChoice() {
            return this.choice;
        }

    }

}
