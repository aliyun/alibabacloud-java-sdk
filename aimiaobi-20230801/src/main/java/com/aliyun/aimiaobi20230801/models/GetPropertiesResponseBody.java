// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPropertiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPropertiesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
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

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources self = new GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPropertiesResponseBodyDataIntelligentSearchConfigSearchSamplesArticles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stared")
        public Boolean stared;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com">http://xxx.com</a></p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
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
        @NameInMap("CopilotPreciseSearchSources")
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources> copilotPreciseSearchSources;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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

        public GetPropertiesResponseBodyDataIntelligentSearchConfig setCopilotPreciseSearchSources(java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources> copilotPreciseSearchSources) {
            this.copilotPreciseSearchSources = copilotPreciseSearchSources;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataIntelligentSearchConfigCopilotPreciseSearchSources> getCopilotPreciseSearchSources() {
            return this.copilotPreciseSearchSources;
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

    public static class GetPropertiesResponseBodyDataSearchSourceList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Name")
        public String name;

        public static GetPropertiesResponseBodyDataSearchSourceList build(java.util.Map<String, ?> map) throws Exception {
            GetPropertiesResponseBodyDataSearchSourceList self = new GetPropertiesResponseBodyDataSearchSourceList();
            return TeaModel.build(map, self);
        }

        public GetPropertiesResponseBodyDataSearchSourceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPropertiesResponseBodyDataSearchSourceList setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetPropertiesResponseBodyDataSearchSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPropertiesResponseBodyDataSearchSources extends TeaModel {
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1:1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1024*1024</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01RzKicz1W0YWzYkWcK_!!6000000002726-2-tps-132-104.png">https://img.alicdn.com/imgextra/i4/O1CN01RzKicz1W0YWzYkWcK_!!6000000002726-2-tps-132-104.png</a></p>
         */
        @NameInMap("Pic")
        public String pic;

        /**
         * <strong>example:</strong>
         * <auto>
         */
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

        @NameInMap("SearchSourceList")
        public java.util.List<GetPropertiesResponseBodyDataSearchSourceList> searchSourceList;

        @NameInMap("SearchSources")
        public java.util.List<GetPropertiesResponseBodyDataSearchSources> searchSources;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        public GetPropertiesResponseBodyData setSearchSourceList(java.util.List<GetPropertiesResponseBodyDataSearchSourceList> searchSourceList) {
            this.searchSourceList = searchSourceList;
            return this;
        }
        public java.util.List<GetPropertiesResponseBodyDataSearchSourceList> getSearchSourceList() {
            return this.searchSourceList;
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
