// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApirestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMgsApirestResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMgsApirestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApirestResponseBody self = new QueryMgsApirestResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMgsApirestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMgsApirestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMgsApirestResponseBody setResultContent(QueryMgsApirestResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMgsApirestResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMgsApirestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker extends TeaModel {
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

        public static QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker self = new QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueApiInvoker extends TeaModel {
        @NameInMap("HttpInvoker")
        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker httpInvoker;

        @NameInMap("RpcInvoker")
        public String rpcInvoker;

        public static QueryMgsApirestResponseBodyResultContentValueApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueApiInvoker self = new QueryMgsApirestResponseBodyResultContentValueApiInvoker();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvoker setHttpInvoker(QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker httpInvoker) {
            this.httpInvoker = httpInvoker;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueApiInvokerHttpInvoker getHttpInvoker() {
            return this.httpInvoker;
        }

        public QueryMgsApirestResponseBodyResultContentValueApiInvoker setRpcInvoker(String rpcInvoker) {
            this.rpcInvoker = rpcInvoker;
            return this;
        }
        public String getRpcInvoker() {
            return this.rpcInvoker;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static QueryMgsApirestResponseBodyResultContentValueCacheRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueCacheRule self = new QueryMgsApirestResponseBodyResultContentValueCacheRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public QueryMgsApirestResponseBodyResultContentValueCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public QueryMgsApirestResponseBodyResultContentValueCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule extends TeaModel {
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

        public static QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule self = new QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setErrorThreshold(Long errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }
        public Long getErrorThreshold() {
            return this.errorThreshold;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setOpenTimeoutSeconds(Long openTimeoutSeconds) {
            this.openTimeoutSeconds = openTimeoutSeconds;
            return this;
        }
        public Long getOpenTimeoutSeconds() {
            return this.openTimeoutSeconds;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setSlowRatioThreshold(Double slowRatioThreshold) {
            this.slowRatioThreshold = slowRatioThreshold;
            return this;
        }
        public Double getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setWindowsInSeconds(Long windowsInSeconds) {
            this.windowsInSeconds = windowsInSeconds;
            return this;
        }
        public Long getWindowsInSeconds() {
            return this.windowsInSeconds;
        }

        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule extends TeaModel {
        @NameInMap("ConfigId")
        public Integer configId;

        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule self = new QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule setConfigId(Integer configId) {
            this.configId = configId;
            return this;
        }
        public Integer getConfigId() {
            return this.configId;
        }

        public QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueHeaderRule extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryMgsApirestResponseBodyResultContentValueHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueHeaderRule self = new QueryMgsApirestResponseBodyResultContentValueHeaderRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRule setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRule setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryMgsApirestResponseBodyResultContentValueHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueHeaderRules self = new QueryMgsApirestResponseBodyResultContentValueHeaderRules();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApirestResponseBodyResultContentValueHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueLimitRule extends TeaModel {
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

        public static QueryMgsApirestResponseBodyResultContentValueLimitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueLimitRule self = new QueryMgsApirestResponseBodyResultContentValueLimitRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public QueryMgsApirestResponseBodyResultContentValueLimitRule setI18nResponse(String i18nResponse) {
            this.i18nResponse = i18nResponse;
            return this;
        }
        public String getI18nResponse() {
            return this.i18nResponse;
        }

        public QueryMgsApirestResponseBodyResultContentValueLimitRule setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public QueryMgsApirestResponseBodyResultContentValueLimitRule setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public QueryMgsApirestResponseBodyResultContentValueLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueMigrateRule extends TeaModel {
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

        public static QueryMgsApirestResponseBodyResultContentValueMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueMigrateRule self = new QueryMgsApirestResponseBodyResultContentValueMigrateRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setFlowPercent(Long flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Long getFlowPercent() {
            return this.flowPercent;
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public QueryMgsApirestResponseBodyResultContentValueMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Long percentage;

        @NameInMap("Type")
        public String type;

        public static QueryMgsApirestResponseBodyResultContentValueMockRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueMockRule self = new QueryMgsApirestResponseBodyResultContentValueMockRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public QueryMgsApirestResponseBodyResultContentValueMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public QueryMgsApirestResponseBodyResultContentValueMockRule setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

        public QueryMgsApirestResponseBodyResultContentValueMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValueRequestParams extends TeaModel {
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

        public static QueryMgsApirestResponseBodyResultContentValueRequestParams build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValueRequestParams self = new QueryMgsApirestResponseBodyResultContentValueRequestParams();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApirestResponseBodyResultContentValueRequestParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContentValue extends TeaModel {
        @NameInMap("ApiInvoker")
        public QueryMgsApirestResponseBodyResultContentValueApiInvoker apiInvoker;

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
        public QueryMgsApirestResponseBodyResultContentValueCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("CircuitBreakerRule")
        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule circuitBreakerRule;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DefaultLimitRule")
        public QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule defaultLimitRule;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HeaderRule")
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRules> headerRules;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public QueryMgsApirestResponseBodyResultContentValueLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public QueryMgsApirestResponseBodyResultContentValueMigrateRule migrateRule;

        @NameInMap("MockRule")
        public QueryMgsApirestResponseBodyResultContentValueMockRule mockRule;

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
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueRequestParams> requestParams;

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

        public static QueryMgsApirestResponseBodyResultContentValue build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContentValue self = new QueryMgsApirestResponseBodyResultContentValue();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContentValue setApiInvoker(QueryMgsApirestResponseBodyResultContentValueApiInvoker apiInvoker) {
            this.apiInvoker = apiInvoker;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueApiInvoker getApiInvoker() {
            return this.apiInvoker;
        }

        public QueryMgsApirestResponseBodyResultContentValue setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryMgsApirestResponseBodyResultContentValue setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public QueryMgsApirestResponseBodyResultContentValue setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public QueryMgsApirestResponseBodyResultContentValue setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApirestResponseBodyResultContentValue setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public QueryMgsApirestResponseBodyResultContentValue setCacheRule(QueryMgsApirestResponseBodyResultContentValueCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public QueryMgsApirestResponseBodyResultContentValue setCircuitBreakerRule(QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule circuitBreakerRule) {
            this.circuitBreakerRule = circuitBreakerRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueCircuitBreakerRule getCircuitBreakerRule() {
            return this.circuitBreakerRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMgsApirestResponseBodyResultContentValue setDefaultLimitRule(QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule defaultLimitRule) {
            this.defaultLimitRule = defaultLimitRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueDefaultLimitRule getDefaultLimitRule() {
            return this.defaultLimitRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMgsApirestResponseBodyResultContentValue setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMgsApirestResponseBodyResultContentValue setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMgsApirestResponseBodyResultContentValue setHeaderRule(java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRule> headerRule) {
            this.headerRule = headerRule;
            return this;
        }
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRule> getHeaderRule() {
            return this.headerRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setHeaderRules(java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public QueryMgsApirestResponseBodyResultContentValue setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryMgsApirestResponseBodyResultContentValue setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApirestResponseBodyResultContentValue setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public QueryMgsApirestResponseBodyResultContentValue setLimitRule(QueryMgsApirestResponseBodyResultContentValueLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueLimitRule getLimitRule() {
            return this.limitRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryMgsApirestResponseBodyResultContentValue setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public QueryMgsApirestResponseBodyResultContentValue setMigrateRule(QueryMgsApirestResponseBodyResultContentValueMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setMockRule(QueryMgsApirestResponseBodyResultContentValueMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValueMockRule getMockRule() {
            return this.mockRule;
        }

        public QueryMgsApirestResponseBodyResultContentValue setNeedETag(String needETag) {
            this.needETag = needETag;
            return this;
        }
        public String getNeedETag() {
            return this.needETag;
        }

        public QueryMgsApirestResponseBodyResultContentValue setNeedEncrypt(String needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public String getNeedEncrypt() {
            return this.needEncrypt;
        }

        public QueryMgsApirestResponseBodyResultContentValue setNeedJsonp(String needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public String getNeedJsonp() {
            return this.needJsonp;
        }

        public QueryMgsApirestResponseBodyResultContentValue setNeedSign(String needSign) {
            this.needSign = needSign;
            return this;
        }
        public String getNeedSign() {
            return this.needSign;
        }

        public QueryMgsApirestResponseBodyResultContentValue setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public QueryMgsApirestResponseBodyResultContentValue setParamGetMethod(String paramGetMethod) {
            this.paramGetMethod = paramGetMethod;
            return this;
        }
        public String getParamGetMethod() {
            return this.paramGetMethod;
        }

        public QueryMgsApirestResponseBodyResultContentValue setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryMgsApirestResponseBodyResultContentValue setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public QueryMgsApirestResponseBodyResultContentValue setRequestParams(java.util.List<QueryMgsApirestResponseBodyResultContentValueRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<QueryMgsApirestResponseBodyResultContentValueRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public QueryMgsApirestResponseBodyResultContentValue setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public QueryMgsApirestResponseBodyResultContentValue setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public QueryMgsApirestResponseBodyResultContentValue setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public QueryMgsApirestResponseBodyResultContentValue setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryMgsApirestResponseBodyResultContentValue setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApirestResponseBodyResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Value")
        public QueryMgsApirestResponseBodyResultContentValue value;

        public static QueryMgsApirestResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseBodyResultContent self = new QueryMgsApirestResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMgsApirestResponseBodyResultContent setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryMgsApirestResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryMgsApirestResponseBodyResultContent setValue(QueryMgsApirestResponseBodyResultContentValue value) {
            this.value = value;
            return this;
        }
        public QueryMgsApirestResponseBodyResultContentValue getValue() {
            return this.value;
        }

    }

}
