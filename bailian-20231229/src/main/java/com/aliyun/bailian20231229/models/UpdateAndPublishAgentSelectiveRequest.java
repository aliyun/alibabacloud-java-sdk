// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentSelectiveRequest extends TeaModel {
    @NameInMap("applicationConfig")
    public UpdateAndPublishAgentSelectiveRequestApplicationConfig applicationConfig;

    @NameInMap("instructions")
    public String instructions;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("name")
    public String name;

    @NameInMap("sampleLibrary")
    public UpdateAndPublishAgentSelectiveRequestSampleLibrary sampleLibrary;

    public static UpdateAndPublishAgentSelectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentSelectiveRequest self = new UpdateAndPublishAgentSelectiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentSelectiveRequest setApplicationConfig(UpdateAndPublishAgentSelectiveRequestApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        return this;
    }
    public UpdateAndPublishAgentSelectiveRequestApplicationConfig getApplicationConfig() {
        return this.applicationConfig;
    }

    public UpdateAndPublishAgentSelectiveRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAndPublishAgentSelectiveRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateAndPublishAgentSelectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAndPublishAgentSelectiveRequest setSampleLibrary(UpdateAndPublishAgentSelectiveRequestSampleLibrary sampleLibrary) {
        this.sampleLibrary = sampleLibrary;
        return this;
    }
    public UpdateAndPublishAgentSelectiveRequestSampleLibrary getSampleLibrary() {
        return this.sampleLibrary;
    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig extends TeaModel {
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

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig setEnableAdbRecord(Boolean enableAdbRecord) {
            this.enableAdbRecord = enableAdbRecord;
            return this;
        }
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig setEnableRecord(Boolean enableRecord) {
            this.enableRecord = enableRecord;
            return this;
        }
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig setStoreCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }
        public String getStoreCode() {
            return this.storeCode;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters extends TeaModel {
        @NameInMap("dialogRound")
        public Integer dialogRound;

        @NameInMap("maxTokens")
        public Integer maxTokens;

        @NameInMap("temperature")
        public Double temperature;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters setDialogRound(Integer dialogRound) {
            this.dialogRound = dialogRound;
            return this;
        }
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig extends TeaModel {
        @NameInMap("answerScope")
        public String answerScope;

        @NameInMap("enableCitation")
        public Boolean enableCitation;

        @NameInMap("enableSearch")
        public Boolean enableSearch;

        @NameInMap("enableWebSearch")
        public String enableWebSearch;

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

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setAnswerScope(String answerScope) {
            this.answerScope = answerScope;
            return this;
        }
        public String getAnswerScope() {
            return this.answerScope;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setEnableWebSearch(String enableWebSearch) {
            this.enableWebSearch = enableWebSearch;
            return this;
        }
        public String getEnableWebSearch() {
            return this.enableWebSearch;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setFixedReplyDetail(String fixedReplyDetail) {
            this.fixedReplyDetail = fixedReplyDetail;
            return this;
        }
        public String getFixedReplyDetail() {
            return this.fixedReplyDetail;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setPromptStrategy(String promptStrategy) {
            this.promptStrategy = promptStrategy;
            return this;
        }
        public String getPromptStrategy() {
            return this.promptStrategy;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setRagRejectType(String ragRejectType) {
            this.ragRejectType = ragRejectType;
            return this;
        }
        public String getRagRejectType() {
            return this.ragRejectType;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setRejectFilterPrompt(String rejectFilterPrompt) {
            this.rejectFilterPrompt = rejectFilterPrompt;
            return this;
        }
        public String getRejectFilterPrompt() {
            return this.rejectFilterPrompt;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setRejectFilterType(String rejectFilterType) {
            this.rejectFilterType = rejectFilterType;
            return this;
        }
        public String getRejectFilterType() {
            return this.rejectFilterType;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setRetrieveMaxLength(Integer retrieveMaxLength) {
            this.retrieveMaxLength = retrieveMaxLength;
            return this;
        }
        public Integer getRetrieveMaxLength() {
            return this.retrieveMaxLength;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity extends TeaModel {
        @NameInMap("processingStrategy")
        public String processingStrategy;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity setProcessingStrategy(String processingStrategy) {
            this.processingStrategy = processingStrategy;
            return this;
        }
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigTools extends TeaModel {
        @NameInMap("type")
        public String type;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigTools self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigTools();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows extends TeaModel {
        @NameInMap("type")
        public String type;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows self = new UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestApplicationConfig extends TeaModel {
        @NameInMap("historyConfig")
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig historyConfig;

        @NameInMap("longTermMemory")
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory longTermMemory;

        @NameInMap("parameters")
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters parameters;

        @NameInMap("ragConfig")
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig ragConfig;

        @NameInMap("security")
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity security;

        @NameInMap("tools")
        public java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigTools> tools;

        @NameInMap("workFlows")
        public java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows> workFlows;

        public static UpdateAndPublishAgentSelectiveRequestApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestApplicationConfig self = new UpdateAndPublishAgentSelectiveRequestApplicationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setHistoryConfig(UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig historyConfig) {
            this.historyConfig = historyConfig;
            return this;
        }
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigHistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setLongTermMemory(UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory longTermMemory) {
            this.longTermMemory = longTermMemory;
            return this;
        }
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigLongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setParameters(UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigParameters getParameters() {
            return this.parameters;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setRagConfig(UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setSecurity(UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity security) {
            this.security = security;
            return this;
        }
        public UpdateAndPublishAgentSelectiveRequestApplicationConfigSecurity getSecurity() {
            return this.security;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setTools(java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigTools> getTools() {
            return this.tools;
        }

        public UpdateAndPublishAgentSelectiveRequestApplicationConfig setWorkFlows(java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows> workFlows) {
            this.workFlows = workFlows;
            return this;
        }
        public java.util.List<UpdateAndPublishAgentSelectiveRequestApplicationConfigWorkFlows> getWorkFlows() {
            return this.workFlows;
        }

    }

    public static class UpdateAndPublishAgentSelectiveRequestSampleLibrary extends TeaModel {
        @NameInMap("enableSample")
        public Boolean enableSample;

        @NameInMap("sampleLibraryIdList")
        public java.util.List<String> sampleLibraryIdList;

        @NameInMap("topK")
        public Integer topK;

        public static UpdateAndPublishAgentSelectiveRequestSampleLibrary build(java.util.Map<String, ?> map) throws Exception {
            UpdateAndPublishAgentSelectiveRequestSampleLibrary self = new UpdateAndPublishAgentSelectiveRequestSampleLibrary();
            return TeaModel.build(map, self);
        }

        public UpdateAndPublishAgentSelectiveRequestSampleLibrary setEnableSample(Boolean enableSample) {
            this.enableSample = enableSample;
            return this;
        }
        public Boolean getEnableSample() {
            return this.enableSample;
        }

        public UpdateAndPublishAgentSelectiveRequestSampleLibrary setSampleLibraryIdList(java.util.List<String> sampleLibraryIdList) {
            this.sampleLibraryIdList = sampleLibraryIdList;
            return this;
        }
        public java.util.List<String> getSampleLibraryIdList() {
            return this.sampleLibraryIdList;
        }

        public UpdateAndPublishAgentSelectiveRequestSampleLibrary setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

}
