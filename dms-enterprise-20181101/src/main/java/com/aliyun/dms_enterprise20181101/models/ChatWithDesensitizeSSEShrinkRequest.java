// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeSSEShrinkRequest extends TeaModel {
    /**
     * <p>Output audio voice and format; only applicable to the Qwen-Omni model, provided that the modalities parameter is set to [&quot;text&quot;, &quot;audio&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AudioJson")
    public String audioJson;

    /**
     * <p>Masking category. Required when needDataMasking is true.</p>
     * 
     * <strong>example:</strong>
     * <p>UserInfo</p>
     */
    @NameInMap("DesensitizationRule")
    public String desensitizationRule;

    /**
     * <p>The embedding dimensions.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("Dimensions")
    public Integer dimensions;

    /**
     * <p>Specifies whether to enable the code interpreter feature. Takes effect only when model is qwen3-max-preview and enable_thinking is true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCodeInterpreter")
    public Boolean enableCodeInterpreter;

    /**
     * <p>Whether to enable web search.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSearch")
    public Boolean enableSearch;

    /**
     * <p>Specifies whether to enable thinking mode when using hybrid thinking models.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableThinking")
    public Boolean enableThinking;

    /**
     * <p>Specifies whether to include token usage information in the final chunk of the streaming response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeUsage")
    public Boolean includeUsage;

    /**
     * <p>The input to the embedding model.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The ID of the instance, used to specify the corresponding data masking rules. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Specifies whether to return the log probabilities of the output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logprobs")
    public Boolean logprobs;

    /**
     * <p>Limits the maximum number of tokens the model can generate. If the output exceeds this value, generation will be truncated. Suitable for scenarios where you need to control the output length.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("MaxTokens")
    public Integer maxTokens;

    /**
     * <p>The conversation context passed to the model, arranged in chronological order.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;content&quot;: &quot;你好&quot;,
     *         &quot;role&quot;: &quot;user&quot;
     *     }
     * ]</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>Output data modality; only applicable to the Qwen-Omni model.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;text&quot;,&quot;audio&quot;]</p>
     */
    @NameInMap("ModalitiesList")
    public String modalitiesListShrink;

    /**
     * <p>The model name. Supported models: Qwen series text-only Large Language Models (commercial and open-source). Multi-modal models are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Whether to enable data masking. Defaults to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDesensitization")
    public Boolean needDesensitization;

    /**
     * <p>Model configuration parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>Controls the degree of repetition in generated text. Valid values: [-2.0, 2.0]. Positive values decrease repetition, while negative values increase it.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PresencePenalty")
    public String presencePenalty;

    /**
     * <p>The format of the returned content. Valid values: text: Plain text response; json_object: Standardized JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResponseFormat")
    public String responseFormat;

    /**
     * <p>Web search strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SearchOptions")
    public String searchOptionsShrink;

    /**
     * <p>Random seed. Used to ensure the reproducibility of results under the same input and parameters. Valid values: [0, 2^31−1].</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Seed")
    public Integer seed;

    /**
     * <p>Stop sequences.</p>
     */
    @NameInMap("Stop")
    public String stopShrink;

    /**
     * <p>Specifies whether to use streaming output.</p>
     * 
     * <strong>example:</strong>
     * <p>1-68f11da7e2b826dcc63c5877-hd</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    /**
     * <p>The sampling temperature controls the diversity of the generated text. The higher the temperature, the more diverse the generated text, and conversely, the more deterministic the generated text. Valid values: [0, 2).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Temperature")
    public String temperature;

    /**
     * <p>The maximum number of tokens allowed for the model\&quot;s internal reasoning process.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("ThinkingBudget")
    public Integer thinkingBudget;

    /**
     * <p>Specifies the number of candidate tokens to consider during sampling. Higher values increase randomness, while lower values make the output more deterministic. Set to null or a value greater than 100 to disable.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <p>Specifies the number of most likely candidate tokens to return at each generation step. Valid values: [0, 5].</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TopLogprobs")
    public Integer topLogprobs;

    /**
     * <p>The probability threshold for nucleus sampling, used to control the diversity of the generated text. Higher Top-P values result in more diverse generated text. Valid values: (0,1.0].</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("TopP")
    public String topP;

    /**
     * <p>Specifies whether to increase the maximum pixel limit of input images to the equivalent of 16,384 tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlHighResolutionImages")
    public Boolean vlHighResolutionImages;

    /**
     * <p>Specifies whether to further identify non-compliant information in both input and output content, building upon the built-in content safety capabilities of the Tongyi Qianwen API.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("XDashScopeDataInspection")
    public String XDashScopeDataInspection;

    public static ChatWithDesensitizeSSEShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeSSEShrinkRequest self = new ChatWithDesensitizeSSEShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeSSEShrinkRequest setAudioJson(String audioJson) {
        this.audioJson = audioJson;
        return this;
    }
    public String getAudioJson() {
        return this.audioJson;
    }

    public ChatWithDesensitizeSSEShrinkRequest setDesensitizationRule(String desensitizationRule) {
        this.desensitizationRule = desensitizationRule;
        return this;
    }
    public String getDesensitizationRule() {
        return this.desensitizationRule;
    }

    public ChatWithDesensitizeSSEShrinkRequest setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public Integer getDimensions() {
        return this.dimensions;
    }

    public ChatWithDesensitizeSSEShrinkRequest setEnableCodeInterpreter(Boolean enableCodeInterpreter) {
        this.enableCodeInterpreter = enableCodeInterpreter;
        return this;
    }
    public Boolean getEnableCodeInterpreter() {
        return this.enableCodeInterpreter;
    }

    public ChatWithDesensitizeSSEShrinkRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public ChatWithDesensitizeSSEShrinkRequest setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public ChatWithDesensitizeSSEShrinkRequest setIncludeUsage(Boolean includeUsage) {
        this.includeUsage = includeUsage;
        return this;
    }
    public Boolean getIncludeUsage() {
        return this.includeUsage;
    }

    public ChatWithDesensitizeSSEShrinkRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ChatWithDesensitizeSSEShrinkRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ChatWithDesensitizeSSEShrinkRequest setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    public ChatWithDesensitizeSSEShrinkRequest setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public ChatWithDesensitizeSSEShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public ChatWithDesensitizeSSEShrinkRequest setModalitiesListShrink(String modalitiesListShrink) {
        this.modalitiesListShrink = modalitiesListShrink;
        return this;
    }
    public String getModalitiesListShrink() {
        return this.modalitiesListShrink;
    }

    public ChatWithDesensitizeSSEShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatWithDesensitizeSSEShrinkRequest setNeedDesensitization(Boolean needDesensitization) {
        this.needDesensitization = needDesensitization;
        return this;
    }
    public Boolean getNeedDesensitization() {
        return this.needDesensitization;
    }

    public ChatWithDesensitizeSSEShrinkRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ChatWithDesensitizeSSEShrinkRequest setPresencePenalty(String presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public String getPresencePenalty() {
        return this.presencePenalty;
    }

    public ChatWithDesensitizeSSEShrinkRequest setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public String getResponseFormat() {
        return this.responseFormat;
    }

    public ChatWithDesensitizeSSEShrinkRequest setSearchOptionsShrink(String searchOptionsShrink) {
        this.searchOptionsShrink = searchOptionsShrink;
        return this;
    }
    public String getSearchOptionsShrink() {
        return this.searchOptionsShrink;
    }

    public ChatWithDesensitizeSSEShrinkRequest setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public ChatWithDesensitizeSSEShrinkRequest setStopShrink(String stopShrink) {
        this.stopShrink = stopShrink;
        return this;
    }
    public String getStopShrink() {
        return this.stopShrink;
    }

    public ChatWithDesensitizeSSEShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public ChatWithDesensitizeSSEShrinkRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public ChatWithDesensitizeSSEShrinkRequest setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
        return this;
    }
    public Integer getThinkingBudget() {
        return this.thinkingBudget;
    }

    public ChatWithDesensitizeSSEShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ChatWithDesensitizeSSEShrinkRequest setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }

    public ChatWithDesensitizeSSEShrinkRequest setTopP(String topP) {
        this.topP = topP;
        return this;
    }
    public String getTopP() {
        return this.topP;
    }

    public ChatWithDesensitizeSSEShrinkRequest setVlHighResolutionImages(Boolean vlHighResolutionImages) {
        this.vlHighResolutionImages = vlHighResolutionImages;
        return this;
    }
    public Boolean getVlHighResolutionImages() {
        return this.vlHighResolutionImages;
    }

    public ChatWithDesensitizeSSEShrinkRequest setXDashScopeDataInspection(String XDashScopeDataInspection) {
        this.XDashScopeDataInspection = XDashScopeDataInspection;
        return this;
    }
    public String getXDashScopeDataInspection() {
        return this.XDashScopeDataInspection;
    }

}
