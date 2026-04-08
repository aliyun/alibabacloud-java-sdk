// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiToolSelectionConfig extends TeaModel {
    @NameInMap("enableConditions")
    public AiToolSelectionConfigEnableConditions enableConditions;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    @NameInMap("queryRewriting")
    public AiToolSelectionConfigQueryRewriting queryRewriting;

    @NameInMap("toolReranking")
    public AiToolSelectionConfigToolReranking toolReranking;

    public static AiToolSelectionConfig build(java.util.Map<String, ?> map) throws Exception {
        AiToolSelectionConfig self = new AiToolSelectionConfig();
        return TeaModel.build(map, self);
    }

    public AiToolSelectionConfig setEnableConditions(AiToolSelectionConfigEnableConditions enableConditions) {
        this.enableConditions = enableConditions;
        return this;
    }
    public AiToolSelectionConfigEnableConditions getEnableConditions() {
        return this.enableConditions;
    }

    public AiToolSelectionConfig setPluginStatus(AiPluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    public AiToolSelectionConfig setQueryRewriting(AiToolSelectionConfigQueryRewriting queryRewriting) {
        this.queryRewriting = queryRewriting;
        return this;
    }
    public AiToolSelectionConfigQueryRewriting getQueryRewriting() {
        return this.queryRewriting;
    }

    public AiToolSelectionConfig setToolReranking(AiToolSelectionConfigToolReranking toolReranking) {
        this.toolReranking = toolReranking;
        return this;
    }
    public AiToolSelectionConfigToolReranking getToolReranking() {
        return this.toolReranking;
    }

    public static class AiToolSelectionConfigEnableConditions extends TeaModel {
        @NameInMap("toolCountThreshold")
        public Integer toolCountThreshold;

        public static AiToolSelectionConfigEnableConditions build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigEnableConditions self = new AiToolSelectionConfigEnableConditions();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigEnableConditions setToolCountThreshold(Integer toolCountThreshold) {
            this.toolCountThreshold = toolCountThreshold;
            return this;
        }
        public Integer getToolCountThreshold() {
            return this.toolCountThreshold;
        }

    }

    public static class AiToolSelectionConfigQueryRewritingContextSelection extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public Integer value;

        public static AiToolSelectionConfigQueryRewritingContextSelection build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigQueryRewritingContextSelection self = new AiToolSelectionConfigQueryRewritingContextSelection();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigQueryRewritingContextSelection setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AiToolSelectionConfigQueryRewritingContextSelection setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class AiToolSelectionConfigQueryRewritingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static AiToolSelectionConfigQueryRewritingModelService build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigQueryRewritingModelService self = new AiToolSelectionConfigQueryRewritingModelService();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigQueryRewritingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AiToolSelectionConfigQueryRewritingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiToolSelectionConfigQueryRewritingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class AiToolSelectionConfigQueryRewritingPromptConfig extends TeaModel {
        @NameInMap("customPrompt")
        public String customPrompt;

        @NameInMap("type")
        public String type;

        public static AiToolSelectionConfigQueryRewritingPromptConfig build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigQueryRewritingPromptConfig self = new AiToolSelectionConfigQueryRewritingPromptConfig();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigQueryRewritingPromptConfig setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public AiToolSelectionConfigQueryRewritingPromptConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AiToolSelectionConfigQueryRewritingTriggerConditions extends TeaModel {
        @NameInMap("messageCountThreshold")
        public Integer messageCountThreshold;

        public static AiToolSelectionConfigQueryRewritingTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigQueryRewritingTriggerConditions self = new AiToolSelectionConfigQueryRewritingTriggerConditions();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigQueryRewritingTriggerConditions setMessageCountThreshold(Integer messageCountThreshold) {
            this.messageCountThreshold = messageCountThreshold;
            return this;
        }
        public Integer getMessageCountThreshold() {
            return this.messageCountThreshold;
        }

    }

    public static class AiToolSelectionConfigQueryRewriting extends TeaModel {
        @NameInMap("contextSelection")
        public AiToolSelectionConfigQueryRewritingContextSelection contextSelection;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("maxOutputTokens")
        public Integer maxOutputTokens;

        @NameInMap("modelService")
        public AiToolSelectionConfigQueryRewritingModelService modelService;

        @NameInMap("promptConfig")
        public AiToolSelectionConfigQueryRewritingPromptConfig promptConfig;

        @NameInMap("triggerConditions")
        public AiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions;

        public static AiToolSelectionConfigQueryRewriting build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigQueryRewriting self = new AiToolSelectionConfigQueryRewriting();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigQueryRewriting setContextSelection(AiToolSelectionConfigQueryRewritingContextSelection contextSelection) {
            this.contextSelection = contextSelection;
            return this;
        }
        public AiToolSelectionConfigQueryRewritingContextSelection getContextSelection() {
            return this.contextSelection;
        }

        public AiToolSelectionConfigQueryRewriting setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AiToolSelectionConfigQueryRewriting setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public AiToolSelectionConfigQueryRewriting setMaxOutputTokens(Integer maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public AiToolSelectionConfigQueryRewriting setModelService(AiToolSelectionConfigQueryRewritingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public AiToolSelectionConfigQueryRewritingModelService getModelService() {
            return this.modelService;
        }

        public AiToolSelectionConfigQueryRewriting setPromptConfig(AiToolSelectionConfigQueryRewritingPromptConfig promptConfig) {
            this.promptConfig = promptConfig;
            return this;
        }
        public AiToolSelectionConfigQueryRewritingPromptConfig getPromptConfig() {
            return this.promptConfig;
        }

        public AiToolSelectionConfigQueryRewriting setTriggerConditions(AiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public AiToolSelectionConfigQueryRewritingTriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

    }

    public static class AiToolSelectionConfigToolRerankingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static AiToolSelectionConfigToolRerankingModelService build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigToolRerankingModelService self = new AiToolSelectionConfigToolRerankingModelService();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigToolRerankingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AiToolSelectionConfigToolRerankingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiToolSelectionConfigToolRerankingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class AiToolSelectionConfigToolReranking extends TeaModel {
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("filteringMethod")
        public String filteringMethod;

        @NameInMap("modelService")
        public AiToolSelectionConfigToolRerankingModelService modelService;

        @NameInMap("scoreThreshold")
        public Float scoreThreshold;

        @NameInMap("topKPercent")
        public Integer topKPercent;

        @NameInMap("topNCount")
        public Integer topNCount;

        public static AiToolSelectionConfigToolReranking build(java.util.Map<String, ?> map) throws Exception {
            AiToolSelectionConfigToolReranking self = new AiToolSelectionConfigToolReranking();
            return TeaModel.build(map, self);
        }

        public AiToolSelectionConfigToolReranking setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public AiToolSelectionConfigToolReranking setFilteringMethod(String filteringMethod) {
            this.filteringMethod = filteringMethod;
            return this;
        }
        public String getFilteringMethod() {
            return this.filteringMethod;
        }

        public AiToolSelectionConfigToolReranking setModelService(AiToolSelectionConfigToolRerankingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public AiToolSelectionConfigToolRerankingModelService getModelService() {
            return this.modelService;
        }

        public AiToolSelectionConfigToolReranking setScoreThreshold(Float scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Float getScoreThreshold() {
            return this.scoreThreshold;
        }

        public AiToolSelectionConfigToolReranking setTopKPercent(Integer topKPercent) {
            this.topKPercent = topKPercent;
            return this;
        }
        public Integer getTopKPercent() {
            return this.topKPercent;
        }

        public AiToolSelectionConfigToolReranking setTopNCount(Integer topNCount) {
            this.topNCount = topNCount;
            return this;
        }
        public Integer getTopNCount() {
            return this.topNCount;
        }

    }

}
