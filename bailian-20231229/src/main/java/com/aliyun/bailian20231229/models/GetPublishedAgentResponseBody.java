// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetPublishedAgentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetPublishedAgentResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetPublishedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublishedAgentResponseBody self = new GetPublishedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublishedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPublishedAgentResponseBody setData(GetPublishedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPublishedAgentResponseBodyData getData() {
        return this.data;
    }

    public GetPublishedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPublishedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPublishedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishedAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig extends TeaModel {
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

        public static GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig self = new GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig setEnableAdbRecord(Boolean enableAdbRecord) {
            this.enableAdbRecord = enableAdbRecord;
            return this;
        }
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig setEnableRecord(Boolean enableRecord) {
            this.enableRecord = enableRecord;
            return this;
        }
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig setStoreCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }
        public String getStoreCode() {
            return this.storeCode;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory self = new GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigParameters extends TeaModel {
        @NameInMap("dialogRound")
        public Integer dialogRound;

        @NameInMap("maxTokens")
        public Integer maxTokens;

        @NameInMap("temperature")
        public Double temperature;

        public static GetPublishedAgentResponseBodyDataApplicationConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigParameters self = new GetPublishedAgentResponseBodyDataApplicationConfigParameters();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigParameters setDialogRound(Integer dialogRound) {
            this.dialogRound = dialogRound;
            return this;
        }
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigParameters setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigRagConfig extends TeaModel {
        @NameInMap("enableCitation")
        public Boolean enableCitation;

        @NameInMap("enableSearch")
        public Boolean enableSearch;

        @NameInMap("knowledgeBaseCodeList")
        public java.util.List<String> knowledgeBaseCodeList;

        @NameInMap("topK")
        public Integer topK;

        public static GetPublishedAgentResponseBodyDataApplicationConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigRagConfig self = new GetPublishedAgentResponseBodyDataApplicationConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigSecurity extends TeaModel {
        @NameInMap("processingStrategy")
        public String processingStrategy;

        public static GetPublishedAgentResponseBodyDataApplicationConfigSecurity build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigSecurity self = new GetPublishedAgentResponseBodyDataApplicationConfigSecurity();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigSecurity setProcessingStrategy(String processingStrategy) {
            this.processingStrategy = processingStrategy;
            return this;
        }
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigTools extends TeaModel {
        @NameInMap("type")
        public String type;

        public static GetPublishedAgentResponseBodyDataApplicationConfigTools build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigTools self = new GetPublishedAgentResponseBodyDataApplicationConfigTools();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows extends TeaModel {
        @NameInMap("type")
        public String type;

        public static GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows self = new GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPublishedAgentResponseBodyDataApplicationConfig extends TeaModel {
        @NameInMap("historyConfig")
        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig historyConfig;

        @NameInMap("longTermMemory")
        public GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory longTermMemory;

        @NameInMap("parameters")
        public GetPublishedAgentResponseBodyDataApplicationConfigParameters parameters;

        @NameInMap("ragConfig")
        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig ragConfig;

        @NameInMap("security")
        public GetPublishedAgentResponseBodyDataApplicationConfigSecurity security;

        @NameInMap("tools")
        public java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigTools> tools;

        @NameInMap("workFlows")
        public java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows> workFlows;

        public static GetPublishedAgentResponseBodyDataApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyDataApplicationConfig self = new GetPublishedAgentResponseBodyDataApplicationConfig();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setHistoryConfig(GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig historyConfig) {
            this.historyConfig = historyConfig;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfigHistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setLongTermMemory(GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory longTermMemory) {
            this.longTermMemory = longTermMemory;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfigLongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setParameters(GetPublishedAgentResponseBodyDataApplicationConfigParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfigParameters getParameters() {
            return this.parameters;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setRagConfig(GetPublishedAgentResponseBodyDataApplicationConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setSecurity(GetPublishedAgentResponseBodyDataApplicationConfigSecurity security) {
            this.security = security;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfigSecurity getSecurity() {
            return this.security;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setTools(java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigTools> getTools() {
            return this.tools;
        }

        public GetPublishedAgentResponseBodyDataApplicationConfig setWorkFlows(java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows> workFlows) {
            this.workFlows = workFlows;
            return this;
        }
        public java.util.List<GetPublishedAgentResponseBodyDataApplicationConfigWorkFlows> getWorkFlows() {
            return this.workFlows;
        }

    }

    public static class GetPublishedAgentResponseBodyData extends TeaModel {
        @NameInMap("applicationConfig")
        public GetPublishedAgentResponseBodyDataApplicationConfig applicationConfig;

        @NameInMap("code")
        public String code;

        @NameInMap("instructions")
        public String instructions;

        @NameInMap("modelId")
        public String modelId;

        @NameInMap("name")
        public String name;

        public static GetPublishedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPublishedAgentResponseBodyData self = new GetPublishedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPublishedAgentResponseBodyData setApplicationConfig(GetPublishedAgentResponseBodyDataApplicationConfig applicationConfig) {
            this.applicationConfig = applicationConfig;
            return this;
        }
        public GetPublishedAgentResponseBodyDataApplicationConfig getApplicationConfig() {
            return this.applicationConfig;
        }

        public GetPublishedAgentResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPublishedAgentResponseBodyData setInstructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
        public String getInstructions() {
            return this.instructions;
        }

        public GetPublishedAgentResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetPublishedAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
