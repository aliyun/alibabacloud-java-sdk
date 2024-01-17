// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPropertiesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPropertiesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPropertiesResponseBody self = new GetPropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPropertiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPropertiesResponseBody setData(GetPropertiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPropertiesResponseBodyData getData() {
        return this.data;
    }

    public GetPropertiesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPropertiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPropertiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPropertiesResponseBodyDataConsoleConfig extends TeaModel {
        @NameInMap("TipContent")
        public String tipContent;

        @NameInMap("Title")
        public String title;

        public static GetPropertiesResponseBodyDataConsoleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataConsoleConfig self = new GetPropertiesResponseBodyDataConsoleConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataConsoleConfig setTipContent(String tipContent) {
            this.tipContent = tipContent;
            return this;
        }
        public String getTipContent() {
            return this.tipContent;
        }

        public GetPropertiesResponseBodyDataConsoleConfig setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles extends TeaModel {
        @NameInMap("Select")
        public Boolean select;

        @NameInMap("Stared")
        public Boolean stared;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles self = new GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles setStared(Boolean stared) {
            this.stared = stared;
            return this;
        }
        public Boolean getStared() {
            return this.stared;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles> articles;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("Text")
        public String text;

        public static GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples self = new GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples setArticles(java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles> getArticles() {
            return this.articles;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Name")
        public String name;

        public static GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources self = new GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfig extends TeaModel {
        @NameInMap("ProductDescription")
        public String productDescription;

        @NameInMap("SearchSamples")
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples> searchSamples;

        @NameInMap("SearchSources")
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources> searchSources;

        public static GetPropertiesResponseBodyDataIntelligentSearchConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataIntelligentSearchConfig self = new GetPropertiesResponseBodyDataIntelligentSearchConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfig setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }
        public String getProductDescription() {
            return this.productDescription;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfig setSearchSamples(java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples> searchSamples) {
            this.searchSamples = searchSamples;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamples> getSearchSamples() {
            return this.searchSamples;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfig setSearchSources(java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSources> getSearchSources() {
            return this.searchSources;
        }

    }

    public static class GetPropertiesResponseBodyDataSearchSources extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static GetPropertiesResponseBodyDataSearchSources build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataSearchSources self = new GetPropertiesResponseBodyDataSearchSources();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataSearchSources setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetPropertiesResponseBodyDataSearchSources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPropertiesResponseBodyDataUserInfo extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Username")
        public String username;

        public static GetPropertiesResponseBodyDataUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataUserInfo self = new GetPropertiesResponseBodyDataUserInfo();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataUserInfo setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetPropertiesResponseBodyDataUserInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetPropertiesResponseBodyDataUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPropertiesResponseBodyDataUserInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetPropertiesResponseBodyDataWanxiangImageSizeConfig extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetPropertiesResponseBodyDataWanxiangImageSizeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataWanxiangImageSizeConfig self = new GetPropertiesResponseBodyDataWanxiangImageSizeConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataWanxiangImageSizeConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPropertiesResponseBodyDataWanxiangImageSizeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPropertiesResponseBodyDataWanxiangImageStyleConfig extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Pic")
        public String pic;

        @NameInMap("Value")
        public String value;

        public static GetPropertiesResponseBodyDataWanxiangImageStyleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataWanxiangImageStyleConfig self = new GetPropertiesResponseBodyDataWanxiangImageStyleConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataWanxiangImageStyleConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPropertiesResponseBodyDataWanxiangImageStyleConfig setPic(String pic) {
            this.pic = pic;
            return this;
        }
        public String getPic() {
            return this.pic;
        }

        public GetPropertiesResponseBodyDataWanxiangImageStyleConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPropertiesResponseBodyData extends TeaModel {
        @NameInMap("ChatConfig")
        public java.util.Map<String, ?> chatConfig;

        @NameInMap("ConsoleConfig")
        public GetPropertiesResponseBodyDataConsoleConfig consoleConfig;

        @NameInMap("GeneralConfigMap")
        public java.util.Map<String, ?> generalConfigMap;

        @NameInMap("IntelligentSearchConfig")
        public GetPropertiesResponseBodyDataIntelligentSearchConfig intelligentSearchConfig;

        @NameInMap("SearchSources")
        public java.util.List<GetPropertiesResponseBodyDataSearchSources> searchSources;

        @NameInMap("SlrAuthorized")
        public Boolean slrAuthorized;

        @NameInMap("UserInfo")
        public GetPropertiesResponseBodyDataUserInfo userInfo;

        @NameInMap("WanxiangImageSizeConfig")
        public java.util.List<GetPropertiesResponseBodyDataWanxiangImageSizeConfig> wanxiangImageSizeConfig;

        @NameInMap("WanxiangImageStyleConfig")
        public java.util.List<GetPropertiesResponseBodyDataWanxiangImageStyleConfig> wanxiangImageStyleConfig;

        public static GetPropertiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyData self = new GetPropertiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyData setChatConfig(java.util.Map<String, ?> chatConfig) {
            this.chatConfig = chatConfig;
            return this;
        }
        public java.util.Map<String, ?> getChatConfig() {
            return this.chatConfig;
        }

        public GetPropertiesResponseBodyData setConsoleConfig(GetPropertiesResponseBodyDataConsoleConfig consoleConfig) {
            this.consoleConfig = consoleConfig;
            return this;
        }
        public GetPropertiesResponseBodyDataConsoleConfig getConsoleConfig() {
            return this.consoleConfig;
        }

        public GetPropertiesResponseBodyData setGeneralConfigMap(java.util.Map<String, ?> generalConfigMap) {
            this.generalConfigMap = generalConfigMap;
            return this;
        }
        public java.util.Map<String, ?> getGeneralConfigMap() {
            return this.generalConfigMap;
        }

        public GetPropertiesResponseBodyData setIntelligentSearchConfig(GetPropertiesResponseBodyDataIntelligentSearchConfig intelligentSearchConfig) {
            this.intelligentSearchConfig = intelligentSearchConfig;
            return this;
        }
        public GetPropertiesResponseBodyDataIntelligentSearchConfig getIntelligentSearchConfig() {
            return this.intelligentSearchConfig;
        }

        public GetPropertiesResponseBodyData setSearchSources(java.util.List<GetPropertiesResponseBodyDataSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataSearchSources> getSearchSources() {
            return this.searchSources;
        }

        public GetPropertiesResponseBodyData setSlrAuthorized(Boolean slrAuthorized) {
            this.slrAuthorized = slrAuthorized;
            return this;
        }
        public Boolean getSlrAuthorized() {
            return this.slrAuthorized;
        }

        public GetPropertiesResponseBodyData setUserInfo(GetPropertiesResponseBodyDataUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public GetPropertiesResponseBodyDataUserInfo getUserInfo() {
            return this.userInfo;
        }

        public GetPropertiesResponseBodyData setWanxiangImageSizeConfig(java.util.List<GetPropertiesResponseBodyDataWanxiangImageSizeConfig> wanxiangImageSizeConfig) {
            this.wanxiangImageSizeConfig = wanxiangImageSizeConfig;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataWanxiangImageSizeConfig> getWanxiangImageSizeConfig() {
            return this.wanxiangImageSizeConfig;
        }

        public GetPropertiesResponseBodyData setWanxiangImageStyleConfig(java.util.List<GetPropertiesResponseBodyDataWanxiangImageStyleConfig> wanxiangImageStyleConfig) {
            this.wanxiangImageStyleConfig = wanxiangImageStyleConfig;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataWanxiangImageStyleConfig> getWanxiangImageStyleConfig() {
            return this.wanxiangImageStyleConfig;
        }

    }

}
