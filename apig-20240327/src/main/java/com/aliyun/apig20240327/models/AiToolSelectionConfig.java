// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiToolSelectionConfig extends TeaModel {
    /**
     * <p>Conditions for activating the tool selection feature.</p>
     */
    @NameInMap("enableConditions")
    public AiToolSelectionConfigEnableConditions enableConditions;

    /**
     * <p>The status of the AI tool selection plugin.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>Configuration for query rewriting, which optimizes user queries before tool selection.</p>
     */
    @NameInMap("queryRewriting")
    public AiToolSelectionConfigQueryRewriting queryRewriting;

    /**
     * <p>Configuration for tool reranking, which controls how tools are scored and filtered.</p>
     */
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
        /**
         * <p>The minimum number of tools required to activate tool selection.</p>
         */
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
        /**
         * <p>The strategy for selecting the conversation context.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value associated with the context selection strategy, such as the number of messages to include.</p>
         */
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
        /**
         * <p>The name of the model used for query rewriting.</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The ID of the model service used for query rewriting.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The request timeout in milliseconds for the query rewriting model service.</p>
         */
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
        /**
         * <p>The custom prompt template for query rewriting. This parameter is required if <code>type</code> is set to <code>custom</code>.</p>
         */
        @NameInMap("customPrompt")
        public String customPrompt;

        /**
         * <p>The type of prompt, such as default or custom.</p>
         */
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
        /**
         * <p>The minimum number of messages in the conversation history required to activate query rewriting.</p>
         */
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
        /**
         * <p>Method for selecting the conversation context for query rewriting.</p>
         */
        @NameInMap("contextSelection")
        public AiToolSelectionConfigQueryRewritingContextSelection contextSelection;

        /**
         * <p>Whether to enable query rewriting.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The fallback strategy used if query rewriting fails or returns no results.</p>
         */
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        /**
         * <p>The maximum number of tokens to generate for the rewritten query.</p>
         */
        @NameInMap("maxOutputTokens")
        public Integer maxOutputTokens;

        /**
         * <p>Model service configuration for query rewriting.</p>
         */
        @NameInMap("modelService")
        public AiToolSelectionConfigQueryRewritingModelService modelService;

        /**
         * <p>Prompt configuration for query rewriting.</p>
         */
        @NameInMap("promptConfig")
        public AiToolSelectionConfigQueryRewritingPromptConfig promptConfig;

        /**
         * <p>Conditions for activating query rewriting.</p>
         */
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
        /**
         * <p>The name of the model used for reranking.</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The ID of the model service used for reranking.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The request timeout in milliseconds for the reranking model service.</p>
         */
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
        /**
         * <p>The fallback strategy used if tool reranking fails or returns no results.</p>
         */
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        /**
         * <p>The method for filtering tools after reranking.</p>
         */
        @NameInMap("filteringMethod")
        public String filteringMethod;

        /**
         * <p>Model service configuration for tool reranking.</p>
         */
        @NameInMap("modelService")
        public AiToolSelectionConfigToolRerankingModelService modelService;

        /**
         * <p>The minimum score a tool must have to be selected. Tools with scores below this threshold are filtered out.</p>
         */
        @NameInMap("scoreThreshold")
        public Float scoreThreshold;

        /**
         * <p>The percentage of top-ranked tools to select. This parameter only applies when <code>filteringMethod</code> is set to a percentage-based method.</p>
         */
        @NameInMap("topKPercent")
        public Integer topKPercent;

        /**
         * <p>The number of top-ranked tools to select. This parameter only applies when <code>filteringMethod</code> is set to a count-based method.</p>
         */
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
