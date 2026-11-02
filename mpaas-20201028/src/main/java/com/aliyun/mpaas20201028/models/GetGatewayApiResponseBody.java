// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGatewayApiResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Api")
    public GetGatewayApiResponseBodyApi api;

    @NameInMap("ErrorField")
    public String errorField;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayApiResponseBody self = new GetGatewayApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayApiResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetGatewayApiResponseBody setApi(GetGatewayApiResponseBodyApi api) {
        this.api = api;
        return this;
    }
    public GetGatewayApiResponseBodyApi getApi() {
        return this.api;
    }

    public GetGatewayApiResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public GetGatewayApiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGatewayApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetGatewayApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayApiResponseBodyApiCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static GetGatewayApiResponseBodyApiCacheRule build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiCacheRule self = new GetGatewayApiResponseBodyApiCacheRule();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public GetGatewayApiResponseBodyApiCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public GetGatewayApiResponseBodyApiCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class GetGatewayApiResponseBodyApiDefaultLimitRule extends TeaModel {
        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static GetGatewayApiResponseBodyApiDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiDefaultLimitRule self = new GetGatewayApiResponseBodyApiDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class GetGatewayApiResponseBodyApiHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetGatewayApiResponseBodyApiHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiHeaderRules self = new GetGatewayApiResponseBodyApiHeaderRules();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public GetGatewayApiResponseBodyApiHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetGatewayApiResponseBodyApiHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGatewayApiResponseBodyApiHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayApiResponseBodyApiLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("Limit")
        public Double limit;

        @NameInMap("Mode")
        public String mode;

        public static GetGatewayApiResponseBodyApiLimitRule build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiLimitRule self = new GetGatewayApiResponseBodyApiLimitRule();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public GetGatewayApiResponseBodyApiLimitRule setLimit(Double limit) {
            this.limit = limit;
            return this;
        }
        public Double getLimit() {
            return this.limit;
        }

        public GetGatewayApiResponseBodyApiLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class GetGatewayApiResponseBodyApiMigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        public Integer flowPercent;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("NeedMigrate")
        public Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        public Boolean needSwitchCompletely;

        @NameInMap("UpstreamType")
        public String upstreamType;

        public static GetGatewayApiResponseBodyApiMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiMigrateRule self = new GetGatewayApiResponseBodyApiMigrateRule();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiMigrateRule setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public GetGatewayApiResponseBodyApiMigrateRule setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetGatewayApiResponseBodyApiMigrateRule setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayApiResponseBodyApiMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public GetGatewayApiResponseBodyApiMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public GetGatewayApiResponseBodyApiMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class GetGatewayApiResponseBodyApiMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Type")
        public String type;

        public static GetGatewayApiResponseBodyApiMockRule build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiMockRule self = new GetGatewayApiResponseBodyApiMockRule();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public GetGatewayApiResponseBodyApiMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public GetGatewayApiResponseBodyApiMockRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public GetGatewayApiResponseBodyApiMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGatewayApiResponseBodyApiRequestParams extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Type")
        public String type;

        public static GetGatewayApiResponseBodyApiRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApiRequestParams self = new GetGatewayApiResponseBodyApiRequestParams();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApiRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetGatewayApiResponseBodyApiRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayApiResponseBodyApiRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetGatewayApiResponseBodyApiRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayApiResponseBodyApiRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public GetGatewayApiResponseBodyApiRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGatewayApiResponseBodyApi extends TeaModel {
        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiStatus")
        public String apiStatus;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("AuthRuleName")
        public String authRuleName;

        @NameInMap("CacheRule")
        public GetGatewayApiResponseBodyApiCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DefaultLimitRule")
        public GetGatewayApiResponseBodyApiDefaultLimitRule defaultLimitRule;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("HeaderRules")
        public java.util.List<GetGatewayApiResponseBodyApiHeaderRules> headerRules;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public GetGatewayApiResponseBodyApiLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public GetGatewayApiResponseBodyApiMigrateRule migrateRule;

        @NameInMap("MockRule")
        public GetGatewayApiResponseBodyApiMockRule mockRule;

        @NameInMap("NeedEncrypt")
        public Boolean needEncrypt;

        @NameInMap("NeedJsonp")
        public Boolean needJsonp;

        @NameInMap("NeedSign")
        public Boolean needSign;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("Path")
        public String path;

        @NameInMap("RequestBodyModel")
        public String requestBodyModel;

        @NameInMap("RequestParams")
        public java.util.List<GetGatewayApiResponseBodyApiRequestParams> requestParams;

        @NameInMap("ResponseBodyModel")
        public String responseBodyModel;

        @NameInMap("RpcParameterTypes")
        public java.util.List<String> rpcParameterTypes;

        @NameInMap("Serialization")
        public String serialization;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("Timeout")
        public Integer timeout;

        public static GetGatewayApiResponseBodyApi build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiResponseBodyApi self = new GetGatewayApiResponseBodyApi();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiResponseBodyApi setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetGatewayApiResponseBodyApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetGatewayApiResponseBodyApi setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public GetGatewayApiResponseBodyApi setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetGatewayApiResponseBodyApi setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public GetGatewayApiResponseBodyApi setCacheRule(GetGatewayApiResponseBodyApiCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public GetGatewayApiResponseBodyApiCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public GetGatewayApiResponseBodyApi setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public GetGatewayApiResponseBodyApi setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetGatewayApiResponseBodyApi setDefaultLimitRule(GetGatewayApiResponseBodyApiDefaultLimitRule defaultLimitRule) {
            this.defaultLimitRule = defaultLimitRule;
            return this;
        }
        public GetGatewayApiResponseBodyApiDefaultLimitRule getDefaultLimitRule() {
            return this.defaultLimitRule;
        }

        public GetGatewayApiResponseBodyApi setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayApiResponseBodyApi setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetGatewayApiResponseBodyApi setHeaderRules(java.util.List<GetGatewayApiResponseBodyApiHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<GetGatewayApiResponseBodyApiHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public GetGatewayApiResponseBodyApi setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public GetGatewayApiResponseBodyApi setLimitRule(GetGatewayApiResponseBodyApiLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public GetGatewayApiResponseBodyApiLimitRule getLimitRule() {
            return this.limitRule;
        }

        public GetGatewayApiResponseBodyApi setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetGatewayApiResponseBodyApi setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetGatewayApiResponseBodyApi setMigrateRule(GetGatewayApiResponseBodyApiMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public GetGatewayApiResponseBodyApiMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public GetGatewayApiResponseBodyApi setMockRule(GetGatewayApiResponseBodyApiMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public GetGatewayApiResponseBodyApiMockRule getMockRule() {
            return this.mockRule;
        }

        public GetGatewayApiResponseBodyApi setNeedEncrypt(Boolean needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public Boolean getNeedEncrypt() {
            return this.needEncrypt;
        }

        public GetGatewayApiResponseBodyApi setNeedJsonp(Boolean needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public Boolean getNeedJsonp() {
            return this.needJsonp;
        }

        public GetGatewayApiResponseBodyApi setNeedSign(Boolean needSign) {
            this.needSign = needSign;
            return this;
        }
        public Boolean getNeedSign() {
            return this.needSign;
        }

        public GetGatewayApiResponseBodyApi setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetGatewayApiResponseBodyApi setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGatewayApiResponseBodyApi setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public GetGatewayApiResponseBodyApi setRequestParams(java.util.List<GetGatewayApiResponseBodyApiRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<GetGatewayApiResponseBodyApiRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public GetGatewayApiResponseBodyApi setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public GetGatewayApiResponseBodyApi setRpcParameterTypes(java.util.List<String> rpcParameterTypes) {
            this.rpcParameterTypes = rpcParameterTypes;
            return this;
        }
        public java.util.List<String> getRpcParameterTypes() {
            return this.rpcParameterTypes;
        }

        public GetGatewayApiResponseBodyApi setSerialization(String serialization) {
            this.serialization = serialization;
            return this;
        }
        public String getSerialization() {
            return this.serialization;
        }

        public GetGatewayApiResponseBodyApi setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public GetGatewayApiResponseBodyApi setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

}
