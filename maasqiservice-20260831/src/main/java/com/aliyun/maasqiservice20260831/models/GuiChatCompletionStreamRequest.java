// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class GuiChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>The whitelist of token IDs that are allowed to be generated.</p>
     * 
     * <strong>example:</strong>
     * <p>[10,11]</p>
     */
    @NameInMap("allowedTokenIds")
    public java.util.List<Long> allowedTokenIds;

    /**
     * <p>The list of words or strings that are banned from being generated.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;blocked&quot;]</p>
     */
    @NameInMap("badWords")
    public java.util.List<String> badWords;

    /**
     * <p>The vLLM or OpenAI-compatible template parameter object. The request values override the default values with the same names in the model and are passed as-is to the primary model of the Mobile-Use Agent.</p>
     */
    @NameInMap("chatTemplateKwargs")
    public GuiChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs;

    /**
     * <p>The frequency penalty parameter, which is passed through to the primary model of the Mobile-Use Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("frequencyPenalty")
    public Double frequencyPenalty;

    /**
     * <p>Specifies whether to ignore the end-of-sequence (EOS) token and continue generation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ignoreEos")
    public Boolean ignoreEos;

    /**
     * <p>Specifies whether to request the upstream to generate the reasoning field. The client-facing results of the Mobile-Use Agent do not directly expose internal thinking.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeReasoning")
    public Boolean includeReasoning;

    /**
     * <p>The model compatibility parameter. The JSON field is logprobs. Whether this parameter is accepted and takes effect depends on the model used by the instance. The current Mobile-Use Agent response does not provide token log probability details.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("logprobs")
    public Boolean logprobs;

    /**
     * <p>The OpenAI-compatible maximum number of completion tokens. If provided, the value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxCompletionTokens")
    public Long maxCompletionTokens;

    /**
     * <p>The OpenAI-compatible maximum number of generated tokens. If provided, the value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxTokens")
    public Long maxTokens;

    /**
     * <p>The messages for the current Mobile-Use Agent step. The first step can only contain one user message. Subsequent steps can only contain one tool message followed by one user message. Complete multi-round history is not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<GuiChatCompletionStreamRequestMessages> messages;

    /**
     * <p>The metadata for the Mobile-Use Agent step. Supports screen_width, screen_height, available_apps, and the compatibility field harness_message. The tool receipt and harness_message cannot be passed at the same time.</p>
     */
    @NameInMap("metadata")
    public GuiChatCompletionStreamRequestMetadata metadata;

    /**
     * <p>The vLLM Min-P sampling parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("minP")
    public Double minP;

    /**
     * <p>The minimum number of tokens to generate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minTokens")
    public Long minTokens;

    /**
     * <p>The multimodal preprocessor parameters, passed through to the Mobile-Use Agent primary model as-is by key.</p>
     */
    @NameInMap("mmProcessorKwargs")
    public GuiChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs;

    /**
     * <p>Reserved for OpenAI client compatibility. This parameter is ignored during routing. The model is determined by the published configuration of the instance, and the model field in the response is always an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Set this parameter to 1. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return multiple candidate actions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("n")
    public Long n;

    /**
     * <p>The model-compatible switch to invoke parallel tool calling. This parameter does not expand the set of Mobile-Use Agent actions active for this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("parallelToolCalls")
    public Boolean parallelToolCalls;

    /**
     * <p>The presence penalty parameter, passed through to the Mobile-Use Agent primary model.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("presencePenalty")
    public Double presencePenalty;

    /**
     * <p>A model-compatible parameter. The JSON field is prompt_logprobs. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return input token probability details.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("promptLogprobs")
    public Long promptLogprobs;

    /**
     * <p>The OpenAI-compatible reasoning effort, such as low, medium, or high.</p>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("reasoningEffort")
    public String reasoningEffort;

    /**
     * <p>The vLLM repetition penalty parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("repetitionPenalty")
    public Double repetitionPenalty;

    /**
     * <p>The model-compatible structured output options. This parameter does not change the final Mobile-Use Agent tool calling structure when you invoke this operation. Avoid output constraint Settings that conflict with the action protocol.</p>
     */
    @NameInMap("responseFormat")
    public GuiChatCompletionStreamRequestResponseFormat responseFormat;

    /**
     * <p>The random seed.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("seed")
    public Long seed;

    /**
     * <p>Specifies whether to skip special tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skipSpecialTokens")
    public Boolean skipSpecialTokens;

    /**
     * <p>The stop sequences. This parameter is compatible with a single string or an array of strings. The array format is shown here.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;DONE&quot;]</p>
     */
    @NameInMap("stop")
    public java.util.List<String> stop;

    /**
     * <p>The list of vLLM stop token IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("stopTokenIds")
    public java.util.List<Long> stopTokenIds;

    /**
     * <p>Specifies whether to use Server-Sent Events (SSE) for streaming responses. You must set this parameter to true for this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The OpenAI-compatible streaming options.</p>
     */
    @NameInMap("streamOptions")
    public GuiChatCompletionStreamRequestStreamOptions streamOptions;

    /**
     * <p>The vLLM structured output constraints.</p>
     */
    @NameInMap("structuredOutputs")
    public GuiChatCompletionStreamRequestStructuredOutputs structuredOutputs;

    /**
     * <p>The sampling temperature, which overrides the default value of the Mobile-Use Agent primary model.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("temperature")
    public Double temperature;

    /**
     * <p>The vLLM Top-K sampling parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topK")
    public Long topK;

    /**
     * <p>A model-compatible parameter. The JSON field is top_logprobs. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return candidate token probability details.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("topLogprobs")
    public Long topLogprobs;

    /**
     * <p>The Top-P nucleus sampling parameter, which overrides the default value of the Mobile-Use Agent primary model.</p>
     * 
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
         * <p>chat_template_kwargs.enable_thinking: the request-level switch for model thinking, which overrides the default value with the same name. Enabling this switch does not cause the Mobile-Use Agent response to return reasoning_content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableThinking")
        public Boolean enableThinking;

        /**
         * <p>Specifies whether to preserve the existing thinking context in subsequent rounds. This parameter is passed as-is according to the vLLM or Qwen chat_template_kwargs.</p>
         * 
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
         * <p>A publicly accessible HTTPS image URL or a Base64 image data URL. Each round of user messages must and can only contain one current screenshot. Expired or inaccessible image addresses are rejected.</p>
         * 
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
         * <p>The compatible inline image field for input_image. You can pass a Base64 data URL.</p>
         * 
         * <strong>example:</strong>
         * <p>data:image/png;base64,...</p>
         */
        @NameInMap("imageData")
        public String imageData;

        /**
         * <p>The screenshot reference. Supports an image_url string or an object containing a url field. The object format is shown here.</p>
         */
        @NameInMap("imageUrl")
        public GuiChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>The text content, which can describe the current operation objective or supplement the current page state.</p>
         * 
         * <strong>example:</strong>
         * <p>Click the search button</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The type of the content item. Use text or input_text for text. Use image_url or input_image for screenshots.</p>
         * 
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
        /**
         * <p>The message content. For a user message, use a content array that contains exactly one current screenshot and optionally attached task text. Screenshots support public HTTPS URLs or Base64 image data URLs. When role is set to tool, fill in the actual execution result of the previous action, which can be a non-empty string, object, or array.</p>
         */
        @NameInMap("content")
        public java.util.List<GuiChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>The message role. The current input must end with a user message. If an execution receipt from the previous round exists, the preceding message must be a tool message.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Required when role is set to tool. References the tool_call ID from the previous Mobile-Use Agent response.</p>
         * 
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
         * <p>The compatible alias for available_apps, which is also an array of app name strings.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
         */
        @NameInMap("appList")
        public java.util.List<String> appList;

        /**
         * <p>The supplementary list of application names for the Standard Edition of Mobile-Use Agent. The JSON field is available_apps. The newly passed list replaces the previous supplementary items, but the default applications are retained. An empty array does not clear the default applications. The Dedicated Edition of Mobile-Use Agent does not use this list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
         */
        @NameInMap("availableApps")
        public java.util.List<String> availableApps;

        /**
         * <p>The Mobile-Use Agent Harness receipt text for legacy clients. This cannot be passed at the same time as the preceding tool message. New clients should prioritize using [tool,user] messages.</p>
         * 
         * <strong>example:</strong>
         * <p>previous action completed</p>
         */
        @NameInMap("harnessMessage")
        public String harnessMessage;

        /**
         * <p>The screen height as a positive integer. For Base64 images, the width and height are parsed from the image itself. For URL images, this value is used for the runtime screen size.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("screenHeight")
        public Long screenHeight;

        /**
         * <p>The screen width as a positive integer. For Base64 images, the width and height are parsed from the image itself. For URL images, this value is used for the runtime screen size.</p>
         * 
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
         * <p>The maximum number of dynamic image patches allowed by the vision model.</p>
         * 
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
         * <p>The response format type, such as text, json_object, or json_schema.</p>
         * 
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
         * <p>Specifies whether to output the usage statistics block before data:[DONE].</p>
         * 
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
         * <p>The set of allowed enum text values.</p>
         * 
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
