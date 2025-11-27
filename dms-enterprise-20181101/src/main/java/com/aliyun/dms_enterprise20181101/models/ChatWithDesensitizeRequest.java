// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeRequest extends TeaModel {
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
    public java.util.List<?> messages;

    /**
     * <strong>example:</strong>
     * <p>[&quot;text&quot;,&quot;audio&quot;]</p>
     */
    @NameInMap("ModalitiesList")
    public java.util.List<String> modalitiesList;

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
    public java.util.Map<String, String> searchOptions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Seed")
    public Integer seed;

    @NameInMap("Stop")
    public java.util.List<String> stop;

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

    public static ChatWithDesensitizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeRequest self = new ChatWithDesensitizeRequest();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeRequest setAudioJson(String audioJson) {
        this.audioJson = audioJson;
        return this;
    }
    public String getAudioJson() {
        return this.audioJson;
    }

    public ChatWithDesensitizeRequest setDesensitizationRule(String desensitizationRule) {
        this.desensitizationRule = desensitizationRule;
        return this;
    }
    public String getDesensitizationRule() {
        return this.desensitizationRule;
    }

    public ChatWithDesensitizeRequest setEnableCodeInterpreter(Boolean enableCodeInterpreter) {
        this.enableCodeInterpreter = enableCodeInterpreter;
        return this;
    }
    public Boolean getEnableCodeInterpreter() {
        return this.enableCodeInterpreter;
    }

    public ChatWithDesensitizeRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public ChatWithDesensitizeRequest setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public ChatWithDesensitizeRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ChatWithDesensitizeRequest setLogprobs(Boolean logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    public ChatWithDesensitizeRequest setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    public ChatWithDesensitizeRequest setMessages(java.util.List<?> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<?> getMessages() {
        return this.messages;
    }

    public ChatWithDesensitizeRequest setModalitiesList(java.util.List<String> modalitiesList) {
        this.modalitiesList = modalitiesList;
        return this;
    }
    public java.util.List<String> getModalitiesList() {
        return this.modalitiesList;
    }

    public ChatWithDesensitizeRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatWithDesensitizeRequest setNeedDesensitization(Boolean needDesensitization) {
        this.needDesensitization = needDesensitization;
        return this;
    }
    public Boolean getNeedDesensitization() {
        return this.needDesensitization;
    }

    public ChatWithDesensitizeRequest setPresencePenalty(String presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public String getPresencePenalty() {
        return this.presencePenalty;
    }

    public ChatWithDesensitizeRequest setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public String getResponseFormat() {
        return this.responseFormat;
    }

    public ChatWithDesensitizeRequest setSearchOptions(java.util.Map<String, String> searchOptions) {
        this.searchOptions = searchOptions;
        return this;
    }
    public java.util.Map<String, String> getSearchOptions() {
        return this.searchOptions;
    }

    public ChatWithDesensitizeRequest setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public ChatWithDesensitizeRequest setStop(java.util.List<String> stop) {
        this.stop = stop;
        return this;
    }
    public java.util.List<String> getStop() {
        return this.stop;
    }

    public ChatWithDesensitizeRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public ChatWithDesensitizeRequest setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
        return this;
    }
    public Integer getThinkingBudget() {
        return this.thinkingBudget;
    }

    public ChatWithDesensitizeRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ChatWithDesensitizeRequest setTopLogprobs(Integer topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }

    public ChatWithDesensitizeRequest setTopP(String topP) {
        this.topP = topP;
        return this;
    }
    public String getTopP() {
        return this.topP;
    }

    public ChatWithDesensitizeRequest setVlHighResolutionImages(Boolean vlHighResolutionImages) {
        this.vlHighResolutionImages = vlHighResolutionImages;
        return this;
    }
    public Boolean getVlHighResolutionImages() {
        return this.vlHighResolutionImages;
    }

    public ChatWithDesensitizeRequest setXDashScopeDataInspection(String XDashScopeDataInspection) {
        this.XDashScopeDataInspection = XDashScopeDataInspection;
        return this;
    }
    public String getXDashScopeDataInspection() {
        return this.XDashScopeDataInspection;
    }

}
