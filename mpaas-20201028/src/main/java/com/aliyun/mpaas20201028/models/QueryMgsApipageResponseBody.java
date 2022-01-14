// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApipageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMgsApipageResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMgsApipageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApipageResponseBody self = new QueryMgsApipageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMgsApipageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMgsApipageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMgsApipageResponseBody setResultContent(QueryMgsApipageResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMgsApipageResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMgsApipageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker extends TeaModel {
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

        public static QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker self = new QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListApiInvoker extends TeaModel {
        @NameInMap("HttpInvoker")
        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker httpInvoker;

        @NameInMap("RpcInvoker")
        public String rpcInvoker;

        public static QueryMgsApipageResponseBodyResultContentListApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListApiInvoker self = new QueryMgsApipageResponseBodyResultContentListApiInvoker();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvoker setHttpInvoker(QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker httpInvoker) {
            this.httpInvoker = httpInvoker;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListApiInvokerHttpInvoker getHttpInvoker() {
            return this.httpInvoker;
        }

        public QueryMgsApipageResponseBodyResultContentListApiInvoker setRpcInvoker(String rpcInvoker) {
            this.rpcInvoker = rpcInvoker;
            return this;
        }
        public String getRpcInvoker() {
            return this.rpcInvoker;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static QueryMgsApipageResponseBodyResultContentListCacheRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListCacheRule self = new QueryMgsApipageResponseBodyResultContentListCacheRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public QueryMgsApipageResponseBodyResultContentListCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public QueryMgsApipageResponseBodyResultContentListCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule extends TeaModel {
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

        public static QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule self = new QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setErrorThreshold(Long errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }
        public Long getErrorThreshold() {
            return this.errorThreshold;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setOpenTimeoutSeconds(Long openTimeoutSeconds) {
            this.openTimeoutSeconds = openTimeoutSeconds;
            return this;
        }
        public Long getOpenTimeoutSeconds() {
            return this.openTimeoutSeconds;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setSlowRatioThreshold(Double slowRatioThreshold) {
            this.slowRatioThreshold = slowRatioThreshold;
            return this;
        }
        public Double getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setWindowsInSeconds(Long windowsInSeconds) {
            this.windowsInSeconds = windowsInSeconds;
            return this;
        }
        public Long getWindowsInSeconds() {
            return this.windowsInSeconds;
        }

        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListHeaderRule extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryMgsApipageResponseBodyResultContentListHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListHeaderRule self = new QueryMgsApipageResponseBodyResultContentListHeaderRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRule setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRule setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static QueryMgsApipageResponseBodyResultContentListHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListHeaderRules self = new QueryMgsApipageResponseBodyResultContentListHeaderRules();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApipageResponseBodyResultContentListHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListLimitRule extends TeaModel {
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

        public static QueryMgsApipageResponseBodyResultContentListLimitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListLimitRule self = new QueryMgsApipageResponseBodyResultContentListLimitRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public QueryMgsApipageResponseBodyResultContentListLimitRule setI18nResponse(String i18nResponse) {
            this.i18nResponse = i18nResponse;
            return this;
        }
        public String getI18nResponse() {
            return this.i18nResponse;
        }

        public QueryMgsApipageResponseBodyResultContentListLimitRule setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public QueryMgsApipageResponseBodyResultContentListLimitRule setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public QueryMgsApipageResponseBodyResultContentListLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListMigrateRule extends TeaModel {
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

        public static QueryMgsApipageResponseBodyResultContentListMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListMigrateRule self = new QueryMgsApipageResponseBodyResultContentListMigrateRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setFlowPercent(Long flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Long getFlowPercent() {
            return this.flowPercent;
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public QueryMgsApipageResponseBodyResultContentListMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Long percentage;

        @NameInMap("Type")
        public String type;

        public static QueryMgsApipageResponseBodyResultContentListMockRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListMockRule self = new QueryMgsApipageResponseBodyResultContentListMockRule();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public QueryMgsApipageResponseBodyResultContentListMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public QueryMgsApipageResponseBodyResultContentListMockRule setPercentage(Long percentage) {
            this.percentage = percentage;
            return this;
        }
        public Long getPercentage() {
            return this.percentage;
        }

        public QueryMgsApipageResponseBodyResultContentListMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentListRequestParams extends TeaModel {
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

        public static QueryMgsApipageResponseBodyResultContentListRequestParams build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentListRequestParams self = new QueryMgsApipageResponseBodyResultContentListRequestParams();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMgsApipageResponseBodyResultContentListRequestParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContentList extends TeaModel {
        @NameInMap("ApiInvoker")
        public QueryMgsApipageResponseBodyResultContentListApiInvoker apiInvoker;

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
        public QueryMgsApipageResponseBodyResultContentListCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("CircuitBreakerRule")
        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule circuitBreakerRule;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HeaderRule")
        public java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        public java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRules> headerRules;

        @NameInMap("Host")
        public String host;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public QueryMgsApipageResponseBodyResultContentListLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public QueryMgsApipageResponseBodyResultContentListMigrateRule migrateRule;

        @NameInMap("MockRule")
        public QueryMgsApipageResponseBodyResultContentListMockRule mockRule;

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
        public java.util.List<QueryMgsApipageResponseBodyResultContentListRequestParams> requestParams;

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

        public static QueryMgsApipageResponseBodyResultContentList build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContentList self = new QueryMgsApipageResponseBodyResultContentList();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContentList setApiInvoker(QueryMgsApipageResponseBodyResultContentListApiInvoker apiInvoker) {
            this.apiInvoker = apiInvoker;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListApiInvoker getApiInvoker() {
            return this.apiInvoker;
        }

        public QueryMgsApipageResponseBodyResultContentList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryMgsApipageResponseBodyResultContentList setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public QueryMgsApipageResponseBodyResultContentList setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public QueryMgsApipageResponseBodyResultContentList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMgsApipageResponseBodyResultContentList setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public QueryMgsApipageResponseBodyResultContentList setCacheRule(QueryMgsApipageResponseBodyResultContentListCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public QueryMgsApipageResponseBodyResultContentList setCircuitBreakerRule(QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule circuitBreakerRule) {
            this.circuitBreakerRule = circuitBreakerRule;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListCircuitBreakerRule getCircuitBreakerRule() {
            return this.circuitBreakerRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryMgsApipageResponseBodyResultContentList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMgsApipageResponseBodyResultContentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMgsApipageResponseBodyResultContentList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMgsApipageResponseBodyResultContentList setHeaderRule(java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRule> headerRule) {
            this.headerRule = headerRule;
            return this;
        }
        public java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRule> getHeaderRule() {
            return this.headerRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setHeaderRules(java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<QueryMgsApipageResponseBodyResultContentListHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public QueryMgsApipageResponseBodyResultContentList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryMgsApipageResponseBodyResultContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMgsApipageResponseBodyResultContentList setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public QueryMgsApipageResponseBodyResultContentList setLimitRule(QueryMgsApipageResponseBodyResultContentListLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListLimitRule getLimitRule() {
            return this.limitRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryMgsApipageResponseBodyResultContentList setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public QueryMgsApipageResponseBodyResultContentList setMigrateRule(QueryMgsApipageResponseBodyResultContentListMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setMockRule(QueryMgsApipageResponseBodyResultContentListMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public QueryMgsApipageResponseBodyResultContentListMockRule getMockRule() {
            return this.mockRule;
        }

        public QueryMgsApipageResponseBodyResultContentList setNeedETag(String needETag) {
            this.needETag = needETag;
            return this;
        }
        public String getNeedETag() {
            return this.needETag;
        }

        public QueryMgsApipageResponseBodyResultContentList setNeedEncrypt(String needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public String getNeedEncrypt() {
            return this.needEncrypt;
        }

        public QueryMgsApipageResponseBodyResultContentList setNeedJsonp(String needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public String getNeedJsonp() {
            return this.needJsonp;
        }

        public QueryMgsApipageResponseBodyResultContentList setNeedSign(String needSign) {
            this.needSign = needSign;
            return this;
        }
        public String getNeedSign() {
            return this.needSign;
        }

        public QueryMgsApipageResponseBodyResultContentList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public QueryMgsApipageResponseBodyResultContentList setParamGetMethod(String paramGetMethod) {
            this.paramGetMethod = paramGetMethod;
            return this;
        }
        public String getParamGetMethod() {
            return this.paramGetMethod;
        }

        public QueryMgsApipageResponseBodyResultContentList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryMgsApipageResponseBodyResultContentList setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public QueryMgsApipageResponseBodyResultContentList setRequestParams(java.util.List<QueryMgsApipageResponseBodyResultContentListRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<QueryMgsApipageResponseBodyResultContentListRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public QueryMgsApipageResponseBodyResultContentList setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public QueryMgsApipageResponseBodyResultContentList setSysId(Long sysId) {
            this.sysId = sysId;
            return this;
        }
        public Long getSysId() {
            return this.sysId;
        }

        public QueryMgsApipageResponseBodyResultContentList setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public QueryMgsApipageResponseBodyResultContentList setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public QueryMgsApipageResponseBodyResultContentList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMgsApipageResponseBodyResultContent extends TeaModel {
        @NameInMap("Current")
        public Long current;

        @NameInMap("List")
        public java.util.List<QueryMgsApipageResponseBodyResultContentList> list;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static QueryMgsApipageResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseBodyResultContent self = new QueryMgsApipageResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMgsApipageResponseBodyResultContent setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public QueryMgsApipageResponseBodyResultContent setList(java.util.List<QueryMgsApipageResponseBodyResultContentList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryMgsApipageResponseBodyResultContentList> getList() {
            return this.list;
        }

        public QueryMgsApipageResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryMgsApipageResponseBodyResultContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
