// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class PaChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>The whitelist of allowed token IDs for generation.</p>
     * 
     * <strong>example:</strong>
     * <p>[10,11]</p>
     */
    @NameInMap("allowedTokenIds")
    public java.util.List<Long> allowedTokenIds;

    /**
     * <p>The list of banned words or strings for generation.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;blocked&quot;]</p>
     */
    @NameInMap("badWords")
    public java.util.List<String> badWords;

    /**
     * <p>The vLLM or OpenAI-compatible template parameter object. Request values are merged with the default values of the model. Request keys with the same name take precedence and are passed to the model as-is.</p>
     */
    @NameInMap("chatTemplateKwargs")
    public PaChatCompletionStreamRequestChatTemplateKwargs chatTemplateKwargs;

    /**
     * <p>The frequency penalty parameter, passed through to the Mobile Planner Agent model.</p>
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
     * <p>Specifies whether to require the upstream to return reasoning content. The specific capability depends on the model.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeReasoning")
    public Boolean includeReasoning;

    /**
     * <p>A model-compatible parameter with the JSON field logprobs. Whether it is accepted and takes effect depends on the model used by the instance. The current agent response does not provide token log probability details.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("logprobs")
    public Boolean logprobs;

    /**
     * <p>The maximum number of completion tokens. If provided, the value must be greater than 0 and is passed as an OpenAI-compatible model parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxCompletionTokens")
    public Long maxCompletionTokens;

    /**
     * <p>The OpenAI-compatible maximum number of tokens to generate. If provided, it must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("maxTokens")
    public Long maxTokens;

    /**
     * <p>The list of conversation messages. For the first call, you can submit a single turn or multiple turns of conversation. When continuing a session with an existing session ID, retain the complete and unmodified prefix of historical messages and append the messages for the current turn. Tool results are associated by using role=tool and the corresponding tool_call_id.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<PaChatCompletionStreamRequestMessages> messages;

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
     * <p>The multimodal preprocessor arguments, which are passed through to vLLM as-is by key.</p>
     */
    @NameInMap("mmProcessorKwargs")
    public PaChatCompletionStreamRequestMmProcessorKwargs mmProcessorKwargs;

    /**
     * <p>Reserved for OpenAI client compatibility. This parameter is ignored during routing. The actual model is determined by the published configuration of the instance, and the model field in the response is fixed to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Set this parameter to 1. Whether this parameter is accepted depends on the model. The current Mobile Planner Agent response does not return multiple candidate results. Do not use it for multi-candidate returns.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("n")
    public Long n;

    /**
     * <p>Specifies whether the model is allowed to generate multiple tool calls in parallel.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("parallelToolCalls")
    public Boolean parallelToolCalls;

    /**
     * <p>The presence penalty parameter, passed through to the Mobile Planner Agent model.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("presencePenalty")
    public Double presencePenalty;

    /**
     * <p>A model-compatible parameter with the JSON field prompt_logprobs. Whether it is accepted depends on the model. The current agent response does not return input token probability details.</p>
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
     * <p>high</p>
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
     * <p>The structured response format, such as json_object or json_schema.</p>
     */
    @NameInMap("responseFormat")
    public PaChatCompletionStreamRequestResponseFormat responseFormat;

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
     * <p>The stop sequences. Compatible with a single string or an array of strings. The array format is shown here.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;END&quot;]</p>
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
     * <p>Specifies whether to use SSE streaming responses. You must set this parameter to true for this API operation.</p>
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
    public PaChatCompletionStreamRequestStreamOptions streamOptions;

    /**
     * <p>The vLLM structured output constraints.</p>
     */
    @NameInMap("structuredOutputs")
    public PaChatCompletionStreamRequestStructuredOutputs structuredOutputs;

    /**
     * <p>The sampling temperature. This is passed as an OpenAI-compatible model parameter and overrides the default value of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("temperature")
    public Double temperature;

    /**
     * <p>The tool choice strategy, which supports auto, none, required, or a named choice supported by the model.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("toolChoice")
    public String toolChoice;

    /**
     * <p>The array of function tool definitions available for the current request. Mobile Planner Agent registers each named function to the runtime toolkit and streams back tool_calls.</p>
     */
    @NameInMap("tools")
    public java.util.List<PaChatCompletionStreamRequestTools> tools;

    /**
     * <p>The vLLM Top-K sampling parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topK")
    public Long topK;

    /**
     * <p>A model-compatible parameter with the JSON field top_logprobs. It is used for models that support this feature. The current agent response does not provide candidate token probability details.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("topLogprobs")
    public Long topLogprobs;

    /**
     * <p>The Top-P sampling parameter. It is passed as an OpenAI-compatible model parameter to override the model default.</p>
     * 
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
         * <p>Specifies whether the model generates reasoning_content through chat_template_kwargs. This value is passed to the model used by the Mobile Planner Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableThinking")
        public Boolean enableThinking;

        /**
         * <p>Specifies whether the model retains and reuses existing thinking content in subsequent turns. This value is passed through as-is according to vLLM or Qwen chat_template_kwargs.</p>
         * 
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
         * <p>The image address. Remote images must use HTTPS. You can also pass a Base64 data URL.</p>
         * 
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
        /**
         * <p>The image reference when the type is set to image_url. HTTPS URLs and data:image/...;base64,... formats are supported.</p>
         */
        @NameInMap("imageUrl")
        public PaChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>The non-empty text when type is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyze this image</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The type of the content part. Mobile Planner Agent user messages support text or image_url.</p>
         * 
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
         * <p>The JSON object string of the function arguments.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
         */
        @NameInMap("arguments")
        public String arguments;

        /**
         * <p>The name of the function to call.</p>
         * 
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
        /**
         * <p>The function information of the historical tool invocation, including the name and arguments in JSON string format. Subsequent turns should retain the actual return values.</p>
         */
        @NameInMap("function")
        public PaChatCompletionStreamRequestMessagesToolCallsFunction function;

        /**
         * <p>The tool invocation ID. Subsequent tool messages reference this ID by using tool_call_id.</p>
         * 
         * <strong>example:</strong>
         * <p>call_weather_1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The tool invocation type. Currently, this is fixed to function.</p>
         * 
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
         * <p>The content of the message. The Mobile Planner Agent supports text and multimodal content. Image URLs or Base64 data URLs are passed through to the Mobile Planner Agent model that supports multimodal inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Analyze the image content&quot;}]</p>
         */
        @NameInMap("content")
        public java.util.List<PaChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>The role of the message: user, assistant, tool, system, or developer. The system or developer role is used to override optional text instructions for the current turn. If omitted, the instructions in the instance configuration are used. Tool results use the tool role and are associated with a tool_call_id.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Required when role is set to tool. The value must match the id in the preceding assistant.tool_calls.</p>
         * 
         * <strong>example:</strong>
         * <p>call_weather_1</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        /**
         * <p>The list of function invocations that can be included when role is set to assistant. This is used to continue multi-turn tool invocations.</p>
         */
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
         * <p>Example: The maximum number of dynamic image patches allowed for vision models.</p>
         * 
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
         * <p>The type of the response format, such as text, json_object, or json_schema.</p>
         * 
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
         * <p>Specifies whether to output the usage statistics block before data:[DONE].</p>
         * 
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
         * <p>The set of allowed enumeration text values.</p>
         * 
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
         * <p>The example parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the city to query the weather for</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The JSON Schema type of the example city field.</p>
         * 
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
        /**
         * <p>The schema for the example business parameter city. The actual fields are determined by the caller\&quot;s tool definition.</p>
         */
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
        /**
         * <p>The property definitions of the JSON Schema.</p>
         */
        @NameInMap("properties")
        public PaChatCompletionStreamRequestToolsFunctionParametersProperties properties;

        /**
         * <p>The array of required field names in the JSON Schema.</p>
         */
        @NameInMap("required")
        public java.util.List<String> required;

        /**
         * <p>The root schema type of the function parameters, typically object.</p>
         * 
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
         * <p>The description of the function purpose, used by the model to determine when to call the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Query the weather in a specified city</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the function. It must not be empty and is used to match assistant.tool_calls with subsequent tool results.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON Schema for the function parameters. It is passed to the model as raw JSON. If not provided, an empty object schema is used.</p>
         */
        @NameInMap("parameters")
        public PaChatCompletionStreamRequestToolsFunctionParameters parameters;

        /**
         * <p>Specifies whether the model is required to strictly follow the JSON Schema of the function parameters.</p>
         * 
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
        /**
         * <p>The function tool definition, including the name, description, and JSON Schema parameters.</p>
         */
        @NameInMap("function")
        public PaChatCompletionStreamRequestToolsFunction function;

        /**
         * <p>The type of the tool. Currently, it must be function.</p>
         * 
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
