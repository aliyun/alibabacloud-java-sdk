// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentRequest extends TeaModel {
    @NameInMap("applicationConfig")
    public UpdateAndPublishAgentRequestApplicationConfig applicationConfig;

    @NameInMap("instructions")
    public String instructions;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("name")
    public String name;

    @NameInMap("sampleLibrary")
    public UpdateAndPublishAgentRequestSampleLibrary sampleLibrary;

    public static UpdateAndPublishAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentRequest self = new UpdateAndPublishAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentRequest setApplicationConfig(UpdateAndPublishAgentRequestApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        return this;
    }
    public UpdateAndPublishAgentRequestApplicationConfig getApplicationConfig() {
        return this.applicationConfig;
    }

    public UpdateAndPublishAgentRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAndPublishAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateAndPublishAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAndPublishAgentRequest setSampleLibrary(UpdateAndPublishAgentRequestSampleLibrary sampleLibrary) {
        this.sampleLibrary = sampleLibrary;
        return this;
    }
    public UpdateAndPublishAgentRequestSampleLibrary getSampleLibrary() {
        return this.sampleLibrary;
    }

    public static class UpdateAndPublishAgentRequestApplicationConfigHistoryConfig extends TeaModel {
        @NameInMap("enableAdbRecord")
        public Boolean enableAdbRecord;

        @NameInMap("enableRecord")
        public Boolean enableRecord;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("region")
        public String region;

        @NameInMap("storeCode")
        public String storeCode;

        public static UpdateAndPublishAgentRequestApplicationConfigHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigHistoryConfig self = new UpdateAndPublishAgentRequestApplicationConfigHistoryConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig setEnableAdbRecord(Boolean enableAdbRecord) {
            this.enableAdbRecord = enableAdbRecord;
            return this;
        }
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig setEnableRecord(Boolean enableRecord) {
            this.enableRecord = enableRecord;
            return this;
        }
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig setStoreCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }
        public String getStoreCode() {
            return this.storeCode;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigLongTermMemory extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static UpdateAndPublishAgentRequestApplicationConfigLongTermMemory build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigLongTermMemory self = new UpdateAndPublishAgentRequestApplicationConfigLongTermMemory();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigLongTermMemory setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigParameters extends TeaModel {
        @NameInMap("dialogRound")
        public Integer dialogRound;

        @NameInMap("maxTokens")
        public Integer maxTokens;

        @NameInMap("temperature")
        public Double temperature;

        public static UpdateAndPublishAgentRequestApplicationConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigParameters self = new UpdateAndPublishAgentRequestApplicationConfigParameters();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigParameters setDialogRound(Integer dialogRound) {
            this.dialogRound = dialogRound;
            return this;
        }
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        public UpdateAndPublishAgentRequestApplicationConfigParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAndPublishAgentRequestApplicationConfigParameters setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigRagConfig extends TeaModel {
        @NameInMap("answerScope")
        public String answerScope;

        @NameInMap("enableCitation")
        public Boolean enableCitation;

        @NameInMap("enableSearch")
        public Boolean enableSearch;

        @NameInMap("enableWebSearch")
        public Boolean enableWebSearch;

        @NameInMap("fixedReplyDetail")
        public String fixedReplyDetail;

        @NameInMap("knowledgeBaseCodeList")
        public java.util.List<String> knowledgeBaseCodeList;

        @NameInMap("promptStrategy")
        public String promptStrategy;

        @NameInMap("ragRejectType")
        public String ragRejectType;

        @NameInMap("rejectFilterPrompt")
        public String rejectFilterPrompt;

        @NameInMap("rejectFilterType")
        public String rejectFilterType;

        @NameInMap("retrieveMaxLength")
        public Integer retrieveMaxLength;

        @NameInMap("topK")
        public Integer topK;

        public static UpdateAndPublishAgentRequestApplicationConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigRagConfig self = new UpdateAndPublishAgentRequestApplicationConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setAnswerScope(String answerScope) {
            this.answerScope = answerScope;
            return this;
        }
        public String getAnswerScope() {
            return this.answerScope;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setEnableWebSearch(Boolean enableWebSearch) {
            this.enableWebSearch = enableWebSearch;
            return this;
        }
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setFixedReplyDetail(String fixedReplyDetail) {
            this.fixedReplyDetail = fixedReplyDetail;
            return this;
        }
        public String getFixedReplyDetail() {
            return this.fixedReplyDetail;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setPromptStrategy(String promptStrategy) {
            this.promptStrategy = promptStrategy;
            return this;
        }
        public String getPromptStrategy() {
            return this.promptStrategy;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setRagRejectType(String ragRejectType) {
            this.ragRejectType = ragRejectType;
            return this;
        }
        public String getRagRejectType() {
            return this.ragRejectType;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setRejectFilterPrompt(String rejectFilterPrompt) {
            this.rejectFilterPrompt = rejectFilterPrompt;
            return this;
        }
        public String getRejectFilterPrompt() {
            return this.rejectFilterPrompt;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setRejectFilterType(String rejectFilterType) {
            this.rejectFilterType = rejectFilterType;
            return this;
        }
        public String getRejectFilterType() {
            return this.rejectFilterType;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setRetrieveMaxLength(Integer retrieveMaxLength) {
            this.retrieveMaxLength = retrieveMaxLength;
            return this;
        }
        public Integer getRetrieveMaxLength() {
            return this.retrieveMaxLength;
        }

        public UpdateAndPublishAgentRequestApplicationConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigSecurity extends TeaModel {
        @NameInMap("processingStrategy")
        public String processingStrategy;

        public static UpdateAndPublishAgentRequestApplicationConfigSecurity build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigSecurity self = new UpdateAndPublishAgentRequestApplicationConfigSecurity();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigSecurity setProcessingStrategy(String processingStrategy) {
            this.processingStrategy = processingStrategy;
            return this;
        }
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigTools extends TeaModel {
        @NameInMap("type")
        public String type;

        public static UpdateAndPublishAgentRequestApplicationConfigTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigTools self = new UpdateAndPublishAgentRequestApplicationConfigTools();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfigWorkFlows extends TeaModel {
        @NameInMap("type")
        public String type;

        public static UpdateAndPublishAgentRequestApplicationConfigWorkFlows build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfigWorkFlows self = new UpdateAndPublishAgentRequestApplicationConfigWorkFlows();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfigWorkFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAndPublishAgentRequestApplicationConfig extends TeaModel {
        @NameInMap("historyConfig")
        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig historyConfig;

        @NameInMap("longTermMemory")
        public UpdateAndPublishAgentRequestApplicationConfigLongTermMemory longTermMemory;

        @NameInMap("parameters")
        public UpdateAndPublishAgentRequestApplicationConfigParameters parameters;

        @NameInMap("ragConfig")
        public UpdateAndPublishAgentRequestApplicationConfigRagConfig ragConfig;

        @NameInMap("security")
        public UpdateAndPublishAgentRequestApplicationConfigSecurity security;

        @NameInMap("tools")
        public java.util.List<UpdateAndPublishAgentRequestApplicationConfigTools> tools;

        @NameInMap("workFlows")
        public java.util.List<UpdateAndPublishAgentRequestApplicationConfigWorkFlows> workFlows;

        public static UpdateAndPublishAgentRequestApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestApplicationConfig self = new UpdateAndPublishAgentRequestApplicationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestApplicationConfig setHistoryConfig(UpdateAndPublishAgentRequestApplicationConfigHistoryConfig historyConfig) {
            this.historyConfig = historyConfig;
            return this;
        }
        public UpdateAndPublishAgentRequestApplicationConfigHistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setLongTermMemory(UpdateAndPublishAgentRequestApplicationConfigLongTermMemory longTermMemory) {
            this.longTermMemory = longTermMemory;
            return this;
        }
        public UpdateAndPublishAgentRequestApplicationConfigLongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setParameters(UpdateAndPublishAgentRequestApplicationConfigParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateAndPublishAgentRequestApplicationConfigParameters getParameters() {
            return this.parameters;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setRagConfig(UpdateAndPublishAgentRequestApplicationConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public UpdateAndPublishAgentRequestApplicationConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setSecurity(UpdateAndPublishAgentRequestApplicationConfigSecurity security) {
            this.security = security;
            return this;
        }
        public UpdateAndPublishAgentRequestApplicationConfigSecurity getSecurity() {
            return this.security;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setTools(java.util.List<UpdateAndPublishAgentRequestApplicationConfigTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateAndPublishAgentRequestApplicationConfigTools> getTools() {
            return this.tools;
        }

        public UpdateAndPublishAgentRequestApplicationConfig setWorkFlows(java.util.List<UpdateAndPublishAgentRequestApplicationConfigWorkFlows> workFlows) {
            this.workFlows = workFlows;
            return this;
        }
        public java.util.List<UpdateAndPublishAgentRequestApplicationConfigWorkFlows> getWorkFlows() {
            return this.workFlows;
        }

    }

    public static class UpdateAndPublishAgentRequestSampleLibrary extends TeaModel {
        @NameInMap("enableSample")
        public Boolean enableSample;

        @NameInMap("sampleLibraryIdList")
        public java.util.List<String> sampleLibraryIdList;

        @NameInMap("topK")
        public Integer topK;

        public static UpdateAndPublishAgentRequestSampleLibrary build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentRequestSampleLibrary self = new UpdateAndPublishAgentRequestSampleLibrary();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentRequestSampleLibrary setEnableSample(Boolean enableSample) {
            this.enableSample = enableSample;
            return this;
        }
        public Boolean getEnableSample() {
            return this.enableSample;
        }

        public UpdateAndPublishAgentRequestSampleLibrary setSampleLibraryIdList(java.util.List<String> sampleLibraryIdList) {
            this.sampleLibraryIdList = sampleLibraryIdList;
            return this;
        }
        public java.util.List<String> getSampleLibraryIdList() {
            return this.sampleLibraryIdList;
        }

        public UpdateAndPublishAgentRequestSampleLibrary setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

}
