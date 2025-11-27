// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AudioJson")
    public String audioJson;

    /**
     * <strong>example:</strong>
     * <p>UserInfo</p>
     */
    @NameInMap("DesensitizationRule")
    public String desensitizationRule;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCodeInterpreter")
    public Boolean enableCodeInterpreter;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSearch")
    public Boolean enableSearch;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableThinking")
    public Boolean enableThinking;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logprobs")
    public Boolean logprobs;

    /**
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("MaxTokens")
    public Integer maxTokens;

    /**
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
     * <strong>example:</strong>
     * <p>[&quot;text&quot;,&quot;audio&quot;]</p>
     */
    @NameInMap("ModalitiesList")
    public String modalitiesListShrink;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDesensitization")
    public Boolean needDesensitization;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PresencePenalty")
    public String presencePenalty;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResponseFormat")
    public String responseFormat;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SearchOptions")
    public String searchOptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Seed")
    public Integer seed;

    @NameInMap("Stop")
    public String stopShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Temperature")
    public String temperature;

    /**
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("ThinkingBudget")
    public Integer thinkingBudget;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TopLogprobs")
    public Integer topLogprobs;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("TopP")
    public String topP;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlHighResolutionImages")
    public Boolean vlHighResolutionImages;

    /**
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
