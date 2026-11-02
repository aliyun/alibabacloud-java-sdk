// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateGatewayApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiStatus")
    public String apiStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthRuleName")
    public String authRuleName;

    @NameInMap("CacheRule")
    public CreateGatewayApiRequestCacheRule cacheRule;

    @NameInMap("Charset")
    public String charset;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DefaultLimitRule")
    public CreateGatewayApiRequestDefaultLimitRule defaultLimitRule;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("HeaderRules")
    public java.util.List<CreateGatewayApiRequestHeaderRules> headerRules;

    @NameInMap("InterfaceType")
    public String interfaceType;

    @NameInMap("LimitRule")
    public CreateGatewayApiRequestLimitRule limitRule;

    @NameInMap("Method")
    public String method;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("MigrateRule")
    public CreateGatewayApiRequestMigrateRule migrateRule;

    @NameInMap("MockRule")
    public CreateGatewayApiRequestMockRule mockRule;

    @NameInMap("NeedEncrypt")
    public Boolean needEncrypt;

    @NameInMap("NeedJsonp")
    public Boolean needJsonp;

    @NameInMap("NeedSign")
    public Boolean needSign;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("Path")
    public String path;

    @NameInMap("RequestBodyModel")
    public String requestBodyModel;

    @NameInMap("RequestParams")
    public java.util.List<CreateGatewayApiRequestRequestParams> requestParams;

    @NameInMap("ResponseBodyModel")
    public String responseBodyModel;

    @NameInMap("RpcParameterTypes")
    public java.util.List<String> rpcParameterTypes;

    @NameInMap("Serialization")
    public String serialization;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateGatewayApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayApiRequest self = new CreateGatewayApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateGatewayApiRequest setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public CreateGatewayApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public CreateGatewayApiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateGatewayApiRequest setAuthRuleName(String authRuleName) {
        this.authRuleName = authRuleName;
        return this;
    }
    public String getAuthRuleName() {
        return this.authRuleName;
    }

    public CreateGatewayApiRequest setCacheRule(CreateGatewayApiRequestCacheRule cacheRule) {
        this.cacheRule = cacheRule;
        return this;
    }
    public CreateGatewayApiRequestCacheRule getCacheRule() {
        return this.cacheRule;
    }

    public CreateGatewayApiRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public CreateGatewayApiRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateGatewayApiRequest setDefaultLimitRule(CreateGatewayApiRequestDefaultLimitRule defaultLimitRule) {
        this.defaultLimitRule = defaultLimitRule;
        return this;
    }
    public CreateGatewayApiRequestDefaultLimitRule getDefaultLimitRule() {
        return this.defaultLimitRule;
    }

    public CreateGatewayApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGatewayApiRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateGatewayApiRequest setHeaderRules(java.util.List<CreateGatewayApiRequestHeaderRules> headerRules) {
        this.headerRules = headerRules;
        return this;
    }
    public java.util.List<CreateGatewayApiRequestHeaderRules> getHeaderRules() {
        return this.headerRules;
    }

    public CreateGatewayApiRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public CreateGatewayApiRequest setLimitRule(CreateGatewayApiRequestLimitRule limitRule) {
        this.limitRule = limitRule;
        return this;
    }
    public CreateGatewayApiRequestLimitRule getLimitRule() {
        return this.limitRule;
    }

    public CreateGatewayApiRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateGatewayApiRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public CreateGatewayApiRequest setMigrateRule(CreateGatewayApiRequestMigrateRule migrateRule) {
        this.migrateRule = migrateRule;
        return this;
    }
    public CreateGatewayApiRequestMigrateRule getMigrateRule() {
        return this.migrateRule;
    }

    public CreateGatewayApiRequest setMockRule(CreateGatewayApiRequestMockRule mockRule) {
        this.mockRule = mockRule;
        return this;
    }
    public CreateGatewayApiRequestMockRule getMockRule() {
        return this.mockRule;
    }

    public CreateGatewayApiRequest setNeedEncrypt(Boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
        return this;
    }
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    public CreateGatewayApiRequest setNeedJsonp(Boolean needJsonp) {
        this.needJsonp = needJsonp;
        return this;
    }
    public Boolean getNeedJsonp() {
        return this.needJsonp;
    }

    public CreateGatewayApiRequest setNeedSign(Boolean needSign) {
        this.needSign = needSign;
        return this;
    }
    public Boolean getNeedSign() {
        return this.needSign;
    }

    public CreateGatewayApiRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CreateGatewayApiRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateGatewayApiRequest setRequestBodyModel(String requestBodyModel) {
        this.requestBodyModel = requestBodyModel;
        return this;
    }
    public String getRequestBodyModel() {
        return this.requestBodyModel;
    }

    public CreateGatewayApiRequest setRequestParams(java.util.List<CreateGatewayApiRequestRequestParams> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.List<CreateGatewayApiRequestRequestParams> getRequestParams() {
        return this.requestParams;
    }

    public CreateGatewayApiRequest setResponseBodyModel(String responseBodyModel) {
        this.responseBodyModel = responseBodyModel;
        return this;
    }
    public String getResponseBodyModel() {
        return this.responseBodyModel;
    }

    public CreateGatewayApiRequest setRpcParameterTypes(java.util.List<String> rpcParameterTypes) {
        this.rpcParameterTypes = rpcParameterTypes;
        return this;
    }
    public java.util.List<String> getRpcParameterTypes() {
        return this.rpcParameterTypes;
    }

    public CreateGatewayApiRequest setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

    public CreateGatewayApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGatewayApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateGatewayApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateGatewayApiRequestCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static CreateGatewayApiRequestCacheRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestCacheRule self = new CreateGatewayApiRequestCacheRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public CreateGatewayApiRequestCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public CreateGatewayApiRequestCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class CreateGatewayApiRequestDefaultLimitRule extends TeaModel {
        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static CreateGatewayApiRequestDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestDefaultLimitRule self = new CreateGatewayApiRequestDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class CreateGatewayApiRequestHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateGatewayApiRequestHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestHeaderRules self = new CreateGatewayApiRequestHeaderRules();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public CreateGatewayApiRequestHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateGatewayApiRequestHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateGatewayApiRequestHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGatewayApiRequestLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("Limit")
        public Double limit;

        @NameInMap("Mode")
        public String mode;

        public static CreateGatewayApiRequestLimitRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestLimitRule self = new CreateGatewayApiRequestLimitRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public CreateGatewayApiRequestLimitRule setLimit(Double limit) {
            this.limit = limit;
            return this;
        }
        public Double getLimit() {
            return this.limit;
        }

        public CreateGatewayApiRequestLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateGatewayApiRequestMigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        public Integer flowPercent;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("NeedMigrate")
        public Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        public Boolean needSwitchCompletely;

        public static CreateGatewayApiRequestMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestMigrateRule self = new CreateGatewayApiRequestMigrateRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestMigrateRule setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public CreateGatewayApiRequestMigrateRule setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreateGatewayApiRequestMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public CreateGatewayApiRequestMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

    }

    public static class CreateGatewayApiRequestMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Type")
        public String type;

        public static CreateGatewayApiRequestMockRule build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestMockRule self = new CreateGatewayApiRequestMockRule();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public CreateGatewayApiRequestMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public CreateGatewayApiRequestMockRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateGatewayApiRequestMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateGatewayApiRequestRequestParams extends TeaModel {
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

        public static CreateGatewayApiRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiRequestRequestParams self = new CreateGatewayApiRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiRequestRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateGatewayApiRequestRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGatewayApiRequestRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateGatewayApiRequestRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGatewayApiRequestRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public CreateGatewayApiRequestRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
