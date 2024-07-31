// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPublishedAgentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListPublishedAgentResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static ListPublishedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAgentResponseBody self = new ListPublishedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPublishedAgentResponseBody setData(ListPublishedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPublishedAgentResponseBodyData getData() {
        return this.data;
    }

    public ListPublishedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPublishedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublishedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishedAgentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig extends TeaModel {
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

        public static ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig self = new ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig setEnableAdbRecord(Boolean enableAdbRecord) {
            this.enableAdbRecord = enableAdbRecord;
            return this;
        }
        public Boolean getEnableAdbRecord() {
            return this.enableAdbRecord;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig setEnableRecord(Boolean enableRecord) {
            this.enableRecord = enableRecord;
            return this;
        }
        public Boolean getEnableRecord() {
            return this.enableRecord;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig setStoreCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }
        public String getStoreCode() {
            return this.storeCode;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory self = new ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigParameters extends TeaModel {
        @NameInMap("dialogRound")
        public Integer dialogRound;

        @NameInMap("maxTokens")
        public Integer maxTokens;

        @NameInMap("temperature")
        public Double temperature;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigParameters self = new ListPublishedAgentResponseBodyDataListApplicationConfigParameters();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigParameters setDialogRound(Integer dialogRound) {
            this.dialogRound = dialogRound;
            return this;
        }
        public Integer getDialogRound() {
            return this.dialogRound;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigParameters setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig extends TeaModel {
        @NameInMap("enableCitation")
        public Boolean enableCitation;

        @NameInMap("enableSearch")
        public Boolean enableSearch;

        @NameInMap("knowledgeBaseCodeList")
        public java.util.List<String> knowledgeBaseCodeList;

        @NameInMap("topK")
        public Integer topK;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig self = new ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig setEnableCitation(Boolean enableCitation) {
            this.enableCitation = enableCitation;
            return this;
        }
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig setKnowledgeBaseCodeList(java.util.List<String> knowledgeBaseCodeList) {
            this.knowledgeBaseCodeList = knowledgeBaseCodeList;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseCodeList() {
            return this.knowledgeBaseCodeList;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigSecurity extends TeaModel {
        @NameInMap("processingStrategy")
        public String processingStrategy;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigSecurity build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigSecurity self = new ListPublishedAgentResponseBodyDataListApplicationConfigSecurity();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigSecurity setProcessingStrategy(String processingStrategy) {
            this.processingStrategy = processingStrategy;
            return this;
        }
        public String getProcessingStrategy() {
            return this.processingStrategy;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigTools extends TeaModel {
        @NameInMap("type")
        public String type;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigTools build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigTools self = new ListPublishedAgentResponseBodyDataListApplicationConfigTools();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows extends TeaModel {
        @NameInMap("type")
        public String type;

        public static ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows self = new ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPublishedAgentResponseBodyDataListApplicationConfig extends TeaModel {
        @NameInMap("historyConfig")
        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig historyConfig;

        @NameInMap("longTermMemory")
        public ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory longTermMemory;

        @NameInMap("parameters")
        public ListPublishedAgentResponseBodyDataListApplicationConfigParameters parameters;

        @NameInMap("ragConfig")
        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig ragConfig;

        @NameInMap("security")
        public ListPublishedAgentResponseBodyDataListApplicationConfigSecurity security;

        @NameInMap("tools")
        public java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigTools> tools;

        @NameInMap("workFlows")
        public java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows> workFlows;

        public static ListPublishedAgentResponseBodyDataListApplicationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataListApplicationConfig self = new ListPublishedAgentResponseBodyDataListApplicationConfig();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setHistoryConfig(ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig historyConfig) {
            this.historyConfig = historyConfig;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfigHistoryConfig getHistoryConfig() {
            return this.historyConfig;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setLongTermMemory(ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory longTermMemory) {
            this.longTermMemory = longTermMemory;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfigLongTermMemory getLongTermMemory() {
            return this.longTermMemory;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setParameters(ListPublishedAgentResponseBodyDataListApplicationConfigParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfigParameters getParameters() {
            return this.parameters;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setRagConfig(ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setSecurity(ListPublishedAgentResponseBodyDataListApplicationConfigSecurity security) {
            this.security = security;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfigSecurity getSecurity() {
            return this.security;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setTools(java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigTools> getTools() {
            return this.tools;
        }

        public ListPublishedAgentResponseBodyDataListApplicationConfig setWorkFlows(java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows> workFlows) {
            this.workFlows = workFlows;
            return this;
        }
        public java.util.List<ListPublishedAgentResponseBodyDataListApplicationConfigWorkFlows> getWorkFlows() {
            return this.workFlows;
        }

    }

    public static class ListPublishedAgentResponseBodyDataList extends TeaModel {
        @NameInMap("applicationConfig")
        public ListPublishedAgentResponseBodyDataListApplicationConfig applicationConfig;

        @NameInMap("code")
        public String code;

        @NameInMap("instructions")
        public String instructions;

        @NameInMap("modelId")
        public String modelId;

        @NameInMap("name")
        public String name;

        public static ListPublishedAgentResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyDataList self = new ListPublishedAgentResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyDataList setApplicationConfig(ListPublishedAgentResponseBodyDataListApplicationConfig applicationConfig) {
            this.applicationConfig = applicationConfig;
            return this;
        }
        public ListPublishedAgentResponseBodyDataListApplicationConfig getApplicationConfig() {
            return this.applicationConfig;
        }

        public ListPublishedAgentResponseBodyDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPublishedAgentResponseBodyDataList setInstructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
        public String getInstructions() {
            return this.instructions;
        }

        public ListPublishedAgentResponseBodyDataList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListPublishedAgentResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPublishedAgentResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListPublishedAgentResponseBodyDataList> list;

        @NameInMap("pageNo")
        public Integer pageNo;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("total")
        public Integer total;

        public static ListPublishedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedAgentResponseBodyData self = new ListPublishedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishedAgentResponseBodyData setList(java.util.List<ListPublishedAgentResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPublishedAgentResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPublishedAgentResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListPublishedAgentResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPublishedAgentResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
