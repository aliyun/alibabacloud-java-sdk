// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMgsApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListMgsApiResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMgsApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMgsApiResponseBody self = new ListMgsApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMgsApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMgsApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMgsApiResponseBody setResultContent(ListMgsApiResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListMgsApiResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListMgsApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Method")
        public String method;

        @NameInMap("Path")
        public String path;

        public static ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker self = new ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueApiInvoker extends TeaModel {
        @NameInMap("HttpInvoker")
        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker httpInvoker;

        @NameInMap("RpcInvoker")
        public String rpcInvoker;

        public static ListMgsApiResponseBodyResultContentValueApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueApiInvoker self = new ListMgsApiResponseBodyResultContentValueApiInvoker();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueApiInvoker setHttpInvoker(ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker httpInvoker) {
            this.httpInvoker = httpInvoker;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueApiInvokerHttpInvoker getHttpInvoker() {
            return this.httpInvoker;
        }

        public ListMgsApiResponseBodyResultContentValueApiInvoker setRpcInvoker(String rpcInvoker) {
            this.rpcInvoker = rpcInvoker;
            return this;
        }
        public String getRpcInvoker() {
            return this.rpcInvoker;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static ListMgsApiResponseBodyResultContentValueCacheRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueCacheRule self = new ListMgsApiResponseBodyResultContentValueCacheRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public ListMgsApiResponseBodyResultContentValueCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public ListMgsApiResponseBodyResultContentValueCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueCircuitBreakerRule extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("ErrorThreshold")
        public Long errorThreshold;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Model")
        public String model;

        @NameInMap("OpenTimeoutSeconds")
        public Long openTimeoutSeconds;

        @NameInMap("SlowRatioThreshold")
        public Double slowRatioThreshold;

        @NameInMap("SwitchStatus")
        public String switchStatus;

        @NameInMap("WindowsInSeconds")
        public Long windowsInSeconds;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListMgsApiResponseBodyResultContentValueCircuitBreakerRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueCircuitBreakerRule self = new ListMgsApiResponseBodyResultContentValueCircuitBreakerRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setErrorThreshold(Long errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }
        public Long getErrorThreshold() {
            return this.errorThreshold;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setOpenTimeoutSeconds(Long openTimeoutSeconds) {
            this.openTimeoutSeconds = openTimeoutSeconds;
            return this;
        }
        public Long getOpenTimeoutSeconds() {
            return this.openTimeoutSeconds;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setSlowRatioThreshold(Double slowRatioThreshold) {
            this.slowRatioThreshold = slowRatioThreshold;
            return this;
        }
        public Double getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setWindowsInSeconds(Long windowsInSeconds) {
            this.windowsInSeconds = windowsInSeconds;
            return this;
        }
        public Long getWindowsInSeconds() {
            return this.windowsInSeconds;
        }

        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueHeaderRule extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListMgsApiResponseBodyResultContentValueHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueHeaderRule self = new ListMgsApiResponseBodyResultContentValueHeaderRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRule setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRule setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListMgsApiResponseBodyResultContentValueHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueHeaderRules self = new ListMgsApiResponseBodyResultContentValueHeaderRules();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMgsApiResponseBodyResultContentValueHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("I18nResponse")
        public String i18nResponse;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Mode")
        public String mode;

        public static ListMgsApiResponseBodyResultContentValueLimitRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueLimitRule self = new ListMgsApiResponseBodyResultContentValueLimitRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public ListMgsApiResponseBodyResultContentValueLimitRule setI18nResponse(String i18nResponse) {
            this.i18nResponse = i18nResponse;
            return this;
        }
        public String getI18nResponse() {
            return this.i18nResponse;
        }

        public ListMgsApiResponseBodyResultContentValueLimitRule setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public ListMgsApiResponseBodyResultContentValueLimitRule setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public ListMgsApiResponseBodyResultContentValueLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueMigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        public Long flowPercent;

        @NameInMap("NeedMigrate")
        public Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        public Boolean needSwitchCompletely;

        @NameInMap("SysId")
        public Long sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("UpstreamType")
        public String upstreamType;

        public static ListMgsApiResponseBodyResultContentValueMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueMigrateRule self = new ListMgsApiResponseBodyResultContentValueMigrateRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setFlowPercent(Long flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Long getFlowPercent() {
            return this.flowPercent;
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListMgsApiResponseBodyResultContentValueMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Long percentage;

        @NameInMap("Type")
        public String type;

        public static ListMgsApiResponseBodyResultContentValueMockRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueMockRule self = new ListMgsApiResponseBodyResultContentValueMockRule();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public ListMgsApiResponseBodyResultContentValueMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public ListMgsApiResponseBodyResultContentValueMockRule setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

        public ListMgsApiResponseBodyResultContentValueMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValueRequestParams extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListMgsApiResponseBodyResultContentValueRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValueRequestParams self = new ListMgsApiResponseBodyResultContentValueRequestParams();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMgsApiResponseBodyResultContentValueRequestParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListMgsApiResponseBodyResultContentValue extends TeaModel {
        @NameInMap("ApiInvoker")
        public ListMgsApiResponseBodyResultContentValueApiInvoker apiInvoker;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiStatus")
        public String apiStatus;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AuthRuleName")
        public String authRuleName;

        @NameInMap("CacheRule")
        public ListMgsApiResponseBodyResultContentValueCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("CircuitBreakerRule")
        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule circuitBreakerRule;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HeaderRule")
        public java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        public java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRules> headerRules;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public ListMgsApiResponseBodyResultContentValueLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public ListMgsApiResponseBodyResultContentValueMigrateRule migrateRule;

        @NameInMap("MockRule")
        public ListMgsApiResponseBodyResultContentValueMockRule mockRule;

        @NameInMap("NeedETag")
        public String needETag;

        @NameInMap("NeedEncrypt")
        public String needEncrypt;

        @NameInMap("NeedJsonp")
        public String needJsonp;

        @NameInMap("NeedSign")
        public String needSign;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ParamGetMethod")
        public String paramGetMethod;

        @NameInMap("Path")
        public String path;

        @NameInMap("RequestBodyModel")
        public String requestBodyModel;

        @NameInMap("RequestParams")
        public java.util.List<ListMgsApiResponseBodyResultContentValueRequestParams> requestParams;

        @NameInMap("ResponseBodyModel")
        public String responseBodyModel;

        @NameInMap("SysId")
        public Long sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListMgsApiResponseBodyResultContentValue build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContentValue self = new ListMgsApiResponseBodyResultContentValue();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContentValue setApiInvoker(ListMgsApiResponseBodyResultContentValueApiInvoker apiInvoker) {
            this.apiInvoker = apiInvoker;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueApiInvoker getApiInvoker() {
            return this.apiInvoker;
        }

        public ListMgsApiResponseBodyResultContentValue setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListMgsApiResponseBodyResultContentValue setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public ListMgsApiResponseBodyResultContentValue setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListMgsApiResponseBodyResultContentValue setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMgsApiResponseBodyResultContentValue setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public ListMgsApiResponseBodyResultContentValue setCacheRule(ListMgsApiResponseBodyResultContentValueCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public ListMgsApiResponseBodyResultContentValue setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListMgsApiResponseBodyResultContentValue setCircuitBreakerRule(ListMgsApiResponseBodyResultContentValueCircuitBreakerRule circuitBreakerRule) {
            this.circuitBreakerRule = circuitBreakerRule;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueCircuitBreakerRule getCircuitBreakerRule() {
            return this.circuitBreakerRule;
        }

        public ListMgsApiResponseBodyResultContentValue setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListMgsApiResponseBodyResultContentValue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMgsApiResponseBodyResultContentValue setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMgsApiResponseBodyResultContentValue setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMgsApiResponseBodyResultContentValue setHeaderRule(java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRule> headerRule) {
            this.headerRule = headerRule;
            return this;
        }
        public java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRule> getHeaderRule() {
            return this.headerRule;
        }

        public ListMgsApiResponseBodyResultContentValue setHeaderRules(java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<ListMgsApiResponseBodyResultContentValueHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public ListMgsApiResponseBodyResultContentValue setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListMgsApiResponseBodyResultContentValue setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMgsApiResponseBodyResultContentValue setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public ListMgsApiResponseBodyResultContentValue setLimitRule(ListMgsApiResponseBodyResultContentValueLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueLimitRule getLimitRule() {
            return this.limitRule;
        }

        public ListMgsApiResponseBodyResultContentValue setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListMgsApiResponseBodyResultContentValue setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListMgsApiResponseBodyResultContentValue setMigrateRule(ListMgsApiResponseBodyResultContentValueMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public ListMgsApiResponseBodyResultContentValue setMockRule(ListMgsApiResponseBodyResultContentValueMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public ListMgsApiResponseBodyResultContentValueMockRule getMockRule() {
            return this.mockRule;
        }

        public ListMgsApiResponseBodyResultContentValue setNeedETag(String needETag) {
            this.needETag = needETag;
            return this;
        }
        public String getNeedETag() {
            return this.needETag;
        }

        public ListMgsApiResponseBodyResultContentValue setNeedEncrypt(String needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public String getNeedEncrypt() {
            return this.needEncrypt;
        }

        public ListMgsApiResponseBodyResultContentValue setNeedJsonp(String needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public String getNeedJsonp() {
            return this.needJsonp;
        }

        public ListMgsApiResponseBodyResultContentValue setNeedSign(String needSign) {
            this.needSign = needSign;
            return this;
        }
        public String getNeedSign() {
            return this.needSign;
        }

        public ListMgsApiResponseBodyResultContentValue setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListMgsApiResponseBodyResultContentValue setParamGetMethod(String paramGetMethod) {
            this.paramGetMethod = paramGetMethod;
            return this;
        }
        public String getParamGetMethod() {
            return this.paramGetMethod;
        }

        public ListMgsApiResponseBodyResultContentValue setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListMgsApiResponseBodyResultContentValue setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public ListMgsApiResponseBodyResultContentValue setRequestParams(java.util.List<ListMgsApiResponseBodyResultContentValueRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<ListMgsApiResponseBodyResultContentValueRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public ListMgsApiResponseBodyResultContentValue setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public ListMgsApiResponseBodyResultContentValue setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public ListMgsApiResponseBodyResultContentValue setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListMgsApiResponseBodyResultContentValue setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListMgsApiResponseBodyResultContentValue setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListMgsApiResponseBodyResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Value")
        public java.util.List<ListMgsApiResponseBodyResultContentValue> value;

        public static ListMgsApiResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseBodyResultContent self = new ListMgsApiResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListMgsApiResponseBodyResultContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListMgsApiResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMgsApiResponseBodyResultContent setValue(java.util.List<ListMgsApiResponseBodyResultContentValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<ListMgsApiResponseBodyResultContentValue> getValue() {
            return this.value;
        }

    }

}
