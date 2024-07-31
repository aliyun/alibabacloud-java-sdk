// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateAndPulishAgentRequest extends TeaModel {
    @NameInMap("applicationConfig")
    public CreateAndPulishAgentRequestApplicationConfig applicationConfig;

    @NameInMap("instructions")
    public String instructions;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("name")
    public String name;

    public static CreateAndPulishAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPulishAgentRequest self = new CreateAndPulishAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndPulishAgentRequest setApplicationConfig(CreateAndPulishAgentRequestApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        return this;
    }
    public CreateAndPulishAgentRequestApplicationConfig getApplicationConfig() {
        return this.applicationConfig;
    }

    public CreateAndPulishAgentRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public CreateAndPulishAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateAndPulishAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateAndPulishAgentRequestApplicationConfigHistoryConfig extends TeaModel {
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

        public static CreateAndPulishAgentRequestApplicationConfigHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigHistoryConfig self = new CreateAndPulishAgentRequestApplicationConfigHistoryConfig();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig setEnableAdbRecord(Boolean enableAdbRecord) {
            this.enableAdbRecord = enableAdbRecord;
            return this;
        }
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig setEnableRecord(Boolean enableRecord) {
            this.enableRecord = enableRecord;
            return this;
        }
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig setStoreCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }
        public String getStoreCode() {
            return this.storeCode;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigLongTermMemory extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static CreateAndPulishAgentRequestApplicationConfigLongTermMemory build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigLongTermMemory self = new CreateAndPulishAgentRequestApplicationConfigLongTermMemory();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigLongTermMemory setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigParameters extends TeaModel {
        @NameInMap("dialogRound")
        public Integer dialogRound;

        @NameInMap("maxTokens")
        public Integer maxTokens;

        @NameInMap("temperature")
        public Double temperature;

        public static CreateAndPulishAgentRequestApplicationConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigParameters self = new CreateAndPulishAgentRequestApplicationConfigParameters();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigParameters setDialogRound(Integer dialogRound) {
            this.dialogRound = dialogRound;
            return this;
        }
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        public CreateAndPulishAgentRequestApplicationConfigParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public CreateAndPulishAgentRequestApplicationConfigParameters setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigRagConfig extends TeaModel {
        @NameInMap("enableCitation")
        public Boolean enableCitation;

        @NameInMap("enableSearch")
        public Boolean enableSearch;

        @NameInMap("knowledgeBaseCodeList")
        public java.util.List<String> knowledgeBaseCodeList;

        @NameInMap("topK")
        public Integer topK;

        public static CreateAndPulishAgentRequestApplicationConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigRagConfig self = new CreateAndPulishAgentRequestApplicationConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigRagConfig setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public CreateAndPulishAgentRequestApplicationConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public CreateAndPulishAgentRequestApplicationConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public CreateAndPulishAgentRequestApplicationConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigSecurityConfig extends TeaModel {
        @NameInMap("processingStrategy")
        public String processingStrategy;

        public static CreateAndPulishAgentRequestApplicationConfigSecurityConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigSecurityConfig self = new CreateAndPulishAgentRequestApplicationConfigSecurityConfig();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigSecurityConfig setProcessingStrategy(String processingStrategy) {
            this.processingStrategy = processingStrategy;
            return this;
        }
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigTools extends TeaModel {
        @NameInMap("type")
        public String type;

        public static CreateAndPulishAgentRequestApplicationConfigTools build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigTools self = new CreateAndPulishAgentRequestApplicationConfigTools();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfigWorkFlows extends TeaModel {
        @NameInMap("type")
        public String type;

        public static CreateAndPulishAgentRequestApplicationConfigWorkFlows build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfigWorkFlows self = new CreateAndPulishAgentRequestApplicationConfigWorkFlows();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfigWorkFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAndPulishAgentRequestApplicationConfig extends TeaModel {
        @NameInMap("historyConfig")
        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig historyConfig;

        @NameInMap("longTermMemory")
        public CreateAndPulishAgentRequestApplicationConfigLongTermMemory longTermMemory;

        @NameInMap("parameters")
        public CreateAndPulishAgentRequestApplicationConfigParameters parameters;

        @NameInMap("ragConfig")
        public CreateAndPulishAgentRequestApplicationConfigRagConfig ragConfig;

        @NameInMap("securityConfig")
        public CreateAndPulishAgentRequestApplicationConfigSecurityConfig securityConfig;

        @NameInMap("tools")
        public java.util.List<CreateAndPulishAgentRequestApplicationConfigTools> tools;

        @NameInMap("workFlows")
        public java.util.List<CreateAndPulishAgentRequestApplicationConfigWorkFlows> workFlows;

        public static CreateAndPulishAgentRequestApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPulishAgentRequestApplicationConfig self = new CreateAndPulishAgentRequestApplicationConfig();
            return TeaModel.build(map, self);
        }

        public CreateAndPulishAgentRequestApplicationConfig setHistoryConfig(CreateAndPulishAgentRequestApplicationConfigHistoryConfig historyConfig) {
            this.historyConfig = historyConfig;
            return this;
        }
        public CreateAndPulishAgentRequestApplicationConfigHistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        public CreateAndPulishAgentRequestApplicationConfig setLongTermMemory(CreateAndPulishAgentRequestApplicationConfigLongTermMemory longTermMemory) {
            this.longTermMemory = longTermMemory;
            return this;
        }
        public CreateAndPulishAgentRequestApplicationConfigLongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        public CreateAndPulishAgentRequestApplicationConfig setParameters(CreateAndPulishAgentRequestApplicationConfigParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public CreateAndPulishAgentRequestApplicationConfigParameters getParameters() {
            return this.parameters;
        }

        public CreateAndPulishAgentRequestApplicationConfig setRagConfig(CreateAndPulishAgentRequestApplicationConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public CreateAndPulishAgentRequestApplicationConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

        public CreateAndPulishAgentRequestApplicationConfig setSecurityConfig(CreateAndPulishAgentRequestApplicationConfigSecurityConfig securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public CreateAndPulishAgentRequestApplicationConfigSecurityConfig getSecurityConfig() {
            return this.securityConfig;
        }

        public CreateAndPulishAgentRequestApplicationConfig setTools(java.util.List<CreateAndPulishAgentRequestApplicationConfigTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateAndPulishAgentRequestApplicationConfigTools> getTools() {
            return this.tools;
        }

        public CreateAndPulishAgentRequestApplicationConfig setWorkFlows(java.util.List<CreateAndPulishAgentRequestApplicationConfigWorkFlows> workFlows) {
            this.workFlows = workFlows;
            return this;
        }
        public java.util.List<CreateAndPulishAgentRequestApplicationConfigWorkFlows> getWorkFlows() {
            return this.workFlows;
        }

    }

}
