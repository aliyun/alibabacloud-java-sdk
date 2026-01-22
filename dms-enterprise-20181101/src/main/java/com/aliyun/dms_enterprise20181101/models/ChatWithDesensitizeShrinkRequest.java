// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeShrinkRequest extends TeaModel {
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
     * <p>Specifies whether to enable Thinking Mode when using hybrid thinking models.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableThinking")
    public Boolean enableThinking;

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
     * <p>The model name. Supported Models: Qwen series text-only Large Language Models (Commercial and Open-source). Multi-modal models are not supported.</p>
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
     * 
     * <strong>example:</strong>
     * <p>[&quot;\n&quot;]</p>
     */
    @NameInMap("Stop")
    public String stopShrink;

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

    public static ChatWithDesensitizeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeShrinkRequest self = new ChatWithDesensitizeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeShrinkRequest setAudioJson(String audioJson) {
        this.audioJson = audioJson;
        return this;
    }
    public String getAudioJson() {
        return this.audioJson;
    }

    public ChatWithDesensitizeShrinkRequest setDesensitizationRule(String desensitizationRule) {
        this.desensitizationRule = desensitizationRule;
        return this;
    }
    public String getDesensitizationRule() {
        return this.desensitizationRule;
    }

    public ChatWithDesensitizeShrinkRequest setEnableCodeInterpreter(Boolean enableCodeInterpreter) {
        this.enableCodeInterpreter = enableCodeInterpreter;
        return this;
    }
    public Boolean getEnableCodeInterpreter() {
        return this.enableCodeInterpreter;
    }

    public ChatWithDesensitizeShrinkRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public ChatWithDesensitizeShrinkRequest setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public ChatWithDesensitizeShrinkRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ChatWithDesensitizeShrinkRequest setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    public ChatWithDesensitizeShrinkRequest setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public ChatWithDesensitizeShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public ChatWithDesensitizeShrinkRequest setModalitiesListShrink(String modalitiesListShrink) {
        this.modalitiesListShrink = modalitiesListShrink;
        return this;
    }
    public String getModalitiesListShrink() {
        return this.modalitiesListShrink;
    }

    public ChatWithDesensitizeShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatWithDesensitizeShrinkRequest setNeedDesensitization(Boolean needDesensitization) {
        this.needDesensitization = needDesensitization;
        return this;
    }
    public Boolean getNeedDesensitization() {
        return this.needDesensitization;
    }

    public ChatWithDesensitizeShrinkRequest setPresencePenalty(String presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public String getPresencePenalty() {
        return this.presencePenalty;
    }

    public ChatWithDesensitizeShrinkRequest setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public String getResponseFormat() {
        return this.responseFormat;
    }

    public ChatWithDesensitizeShrinkRequest setSearchOptionsShrink(String searchOptionsShrink) {
        this.searchOptionsShrink = searchOptionsShrink;
        return this;
    }
    public String getSearchOptionsShrink() {
        return this.searchOptionsShrink;
    }

    public ChatWithDesensitizeShrinkRequest setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public ChatWithDesensitizeShrinkRequest setStopShrink(String stopShrink) {
        this.stopShrink = stopShrink;
        return this;
    }
    public String getStopShrink() {
        return this.stopShrink;
    }

    public ChatWithDesensitizeShrinkRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public ChatWithDesensitizeShrinkRequest setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
        return this;
    }
    public Integer getThinkingBudget() {
        return this.thinkingBudget;
    }

    public ChatWithDesensitizeShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ChatWithDesensitizeShrinkRequest setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }

    public ChatWithDesensitizeShrinkRequest setTopP(String topP) {
        this.topP = topP;
        return this;
    }
    public String getTopP() {
        return this.topP;
    }

    public ChatWithDesensitizeShrinkRequest setVlHighResolutionImages(Boolean vlHighResolutionImages) {
        this.vlHighResolutionImages = vlHighResolutionImages;
        return this;
    }
    public Boolean getVlHighResolutionImages() {
        return this.vlHighResolutionImages;
    }

    public ChatWithDesensitizeShrinkRequest setXDashScopeDataInspection(String XDashScopeDataInspection) {
        this.XDashScopeDataInspection = XDashScopeDataInspection;
        return this;
    }
    public String getXDashScopeDataInspection() {
        return this.XDashScopeDataInspection;
    }

}
