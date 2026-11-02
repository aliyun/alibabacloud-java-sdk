// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateGatewayApiResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Api")
    public CreateGatewayApiResponseBodyApi api;

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

    public static CreateGatewayApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayApiResponseBody self = new CreateGatewayApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayApiResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateGatewayApiResponseBody setApi(CreateGatewayApiResponseBodyApi api) {
        this.api = api;
        return this;
    }
    public CreateGatewayApiResponseBodyApi getApi() {
        return this.api;
    }

    public CreateGatewayApiResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public CreateGatewayApiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateGatewayApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGatewayApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateGatewayApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateGatewayApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGatewayApiResponseBodyApiCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static CreateGatewayApiResponseBodyApiCacheRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiCacheRule self = new CreateGatewayApiResponseBodyApiCacheRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public CreateGatewayApiResponseBodyApiCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public CreateGatewayApiResponseBodyApiCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateGatewayApiResponseBodyApiDefaultLimitRule extends TeaModel {
        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static CreateGatewayApiResponseBodyApiDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiDefaultLimitRule self = new CreateGatewayApiResponseBodyApiDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class CreateGatewayApiResponseBodyApiHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateGatewayApiResponseBodyApiHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiHeaderRules self = new CreateGatewayApiResponseBodyApiHeaderRules();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public CreateGatewayApiResponseBodyApiHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateGatewayApiResponseBodyApiHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateGatewayApiResponseBodyApiHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGatewayApiResponseBodyApiLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("Limit")
        public Double limit;

        @NameInMap("Mode")
        public String mode;

        public static CreateGatewayApiResponseBodyApiLimitRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiLimitRule self = new CreateGatewayApiResponseBodyApiLimitRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public CreateGatewayApiResponseBodyApiLimitRule setLimit(Double limit) {
            this.limit = limit;
            return this;
        }
        public Double getLimit() {
            return this.limit;
        }

        public CreateGatewayApiResponseBodyApiLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateGatewayApiResponseBodyApiMigrateRule extends TeaModel {
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

        public static CreateGatewayApiResponseBodyApiMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiMigrateRule self = new CreateGatewayApiResponseBodyApiMigrateRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public CreateGatewayApiResponseBodyApiMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class CreateGatewayApiResponseBodyApiMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Type")
        public String type;

        public static CreateGatewayApiResponseBodyApiMockRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiMockRule self = new CreateGatewayApiResponseBodyApiMockRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public CreateGatewayApiResponseBodyApiMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public CreateGatewayApiResponseBodyApiMockRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateGatewayApiResponseBodyApiMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateGatewayApiResponseBodyApiRequestParams extends TeaModel {
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

        public static CreateGatewayApiResponseBodyApiRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApiRequestParams self = new CreateGatewayApiResponseBodyApiRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApiRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateGatewayApiResponseBodyApiRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGatewayApiResponseBodyApiRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateGatewayApiResponseBodyApiRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGatewayApiResponseBodyApiRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public CreateGatewayApiResponseBodyApiRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateGatewayApiResponseBodyApi extends TeaModel {
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
        public CreateGatewayApiResponseBodyApiCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DefaultLimitRule")
        public CreateGatewayApiResponseBodyApiDefaultLimitRule defaultLimitRule;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("HeaderRules")
        public java.util.List<CreateGatewayApiResponseBodyApiHeaderRules> headerRules;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public CreateGatewayApiResponseBodyApiLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public CreateGatewayApiResponseBodyApiMigrateRule migrateRule;

        @NameInMap("MockRule")
        public CreateGatewayApiResponseBodyApiMockRule mockRule;

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
        public java.util.List<CreateGatewayApiResponseBodyApiRequestParams> requestParams;

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

        public static CreateGatewayApiResponseBodyApi build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiResponseBodyApi self = new CreateGatewayApiResponseBodyApi();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiResponseBodyApi setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public CreateGatewayApiResponseBodyApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CreateGatewayApiResponseBodyApi setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public CreateGatewayApiResponseBodyApi setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public CreateGatewayApiResponseBodyApi setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public CreateGatewayApiResponseBodyApi setCacheRule(CreateGatewayApiResponseBodyApiCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public CreateGatewayApiResponseBodyApiCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public CreateGatewayApiResponseBodyApi setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public CreateGatewayApiResponseBodyApi setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateGatewayApiResponseBodyApi setDefaultLimitRule(CreateGatewayApiResponseBodyApiDefaultLimitRule defaultLimitRule) {
            this.defaultLimitRule = defaultLimitRule;
            return this;
        }
        public CreateGatewayApiResponseBodyApiDefaultLimitRule getDefaultLimitRule() {
            return this.defaultLimitRule;
        }

        public CreateGatewayApiResponseBodyApi setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGatewayApiResponseBodyApi setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreateGatewayApiResponseBodyApi setHeaderRules(java.util.List<CreateGatewayApiResponseBodyApiHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<CreateGatewayApiResponseBodyApiHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public CreateGatewayApiResponseBodyApi setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public CreateGatewayApiResponseBodyApi setLimitRule(CreateGatewayApiResponseBodyApiLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public CreateGatewayApiResponseBodyApiLimitRule getLimitRule() {
            return this.limitRule;
        }

        public CreateGatewayApiResponseBodyApi setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateGatewayApiResponseBodyApi setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public CreateGatewayApiResponseBodyApi setMigrateRule(CreateGatewayApiResponseBodyApiMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public CreateGatewayApiResponseBodyApiMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public CreateGatewayApiResponseBodyApi setMockRule(CreateGatewayApiResponseBodyApiMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public CreateGatewayApiResponseBodyApiMockRule getMockRule() {
            return this.mockRule;
        }

        public CreateGatewayApiResponseBodyApi setNeedEncrypt(Boolean needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public Boolean getNeedEncrypt() {
            return this.needEncrypt;
        }

        public CreateGatewayApiResponseBodyApi setNeedJsonp(Boolean needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public Boolean getNeedJsonp() {
            return this.needJsonp;
        }

        public CreateGatewayApiResponseBodyApi setNeedSign(Boolean needSign) {
            this.needSign = needSign;
            return this;
        }
        public Boolean getNeedSign() {
            return this.needSign;
        }

        public CreateGatewayApiResponseBodyApi setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateGatewayApiResponseBodyApi setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateGatewayApiResponseBodyApi setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public CreateGatewayApiResponseBodyApi setRequestParams(java.util.List<CreateGatewayApiResponseBodyApiRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<CreateGatewayApiResponseBodyApiRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public CreateGatewayApiResponseBodyApi setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public CreateGatewayApiResponseBodyApi setRpcParameterTypes(java.util.List<String> rpcParameterTypes) {
            this.rpcParameterTypes = rpcParameterTypes;
            return this;
        }
        public java.util.List<String> getRpcParameterTypes() {
            return this.rpcParameterTypes;
        }

        public CreateGatewayApiResponseBodyApi setSerialization(String serialization) {
            this.serialization = serialization;
            return this;
        }
        public String getSerialization() {
            return this.serialization;
        }

        public CreateGatewayApiResponseBodyApi setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public CreateGatewayApiResponseBodyApi setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

}
