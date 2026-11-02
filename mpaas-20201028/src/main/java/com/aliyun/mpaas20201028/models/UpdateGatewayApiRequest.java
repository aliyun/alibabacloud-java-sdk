// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

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
    public UpdateGatewayApiRequestCacheRule cacheRule;

    @NameInMap("Charset")
    public String charset;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DefaultLimitRule")
    public UpdateGatewayApiRequestDefaultLimitRule defaultLimitRule;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("HeaderRules")
    public java.util.List<UpdateGatewayApiRequestHeaderRules> headerRules;

    @NameInMap("InterfaceType")
    public String interfaceType;

    @NameInMap("LimitRule")
    public UpdateGatewayApiRequestLimitRule limitRule;

    @NameInMap("Method")
    public String method;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("MigrateRule")
    public UpdateGatewayApiRequestMigrateRule migrateRule;

    @NameInMap("MockRule")
    public UpdateGatewayApiRequestMockRule mockRule;

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
    public java.util.List<UpdateGatewayApiRequestRequestParams> requestParams;

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

    public static UpdateGatewayApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiRequest self = new UpdateGatewayApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public UpdateGatewayApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateGatewayApiRequest setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public UpdateGatewayApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public UpdateGatewayApiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGatewayApiRequest setAuthRuleName(String authRuleName) {
        this.authRuleName = authRuleName;
        return this;
    }
    public String getAuthRuleName() {
        return this.authRuleName;
    }

    public UpdateGatewayApiRequest setCacheRule(UpdateGatewayApiRequestCacheRule cacheRule) {
        this.cacheRule = cacheRule;
        return this;
    }
    public UpdateGatewayApiRequestCacheRule getCacheRule() {
        return this.cacheRule;
    }

    public UpdateGatewayApiRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public UpdateGatewayApiRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UpdateGatewayApiRequest setDefaultLimitRule(UpdateGatewayApiRequestDefaultLimitRule defaultLimitRule) {
        this.defaultLimitRule = defaultLimitRule;
        return this;
    }
    public UpdateGatewayApiRequestDefaultLimitRule getDefaultLimitRule() {
        return this.defaultLimitRule;
    }

    public UpdateGatewayApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayApiRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateGatewayApiRequest setHeaderRules(java.util.List<UpdateGatewayApiRequestHeaderRules> headerRules) {
        this.headerRules = headerRules;
        return this;
    }
    public java.util.List<UpdateGatewayApiRequestHeaderRules> getHeaderRules() {
        return this.headerRules;
    }

    public UpdateGatewayApiRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public UpdateGatewayApiRequest setLimitRule(UpdateGatewayApiRequestLimitRule limitRule) {
        this.limitRule = limitRule;
        return this;
    }
    public UpdateGatewayApiRequestLimitRule getLimitRule() {
        return this.limitRule;
    }

    public UpdateGatewayApiRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateGatewayApiRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateGatewayApiRequest setMigrateRule(UpdateGatewayApiRequestMigrateRule migrateRule) {
        this.migrateRule = migrateRule;
        return this;
    }
    public UpdateGatewayApiRequestMigrateRule getMigrateRule() {
        return this.migrateRule;
    }

    public UpdateGatewayApiRequest setMockRule(UpdateGatewayApiRequestMockRule mockRule) {
        this.mockRule = mockRule;
        return this;
    }
    public UpdateGatewayApiRequestMockRule getMockRule() {
        return this.mockRule;
    }

    public UpdateGatewayApiRequest setNeedEncrypt(Boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
        return this;
    }
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    public UpdateGatewayApiRequest setNeedJsonp(Boolean needJsonp) {
        this.needJsonp = needJsonp;
        return this;
    }
    public Boolean getNeedJsonp() {
        return this.needJsonp;
    }

    public UpdateGatewayApiRequest setNeedSign(Boolean needSign) {
        this.needSign = needSign;
        return this;
    }
    public Boolean getNeedSign() {
        return this.needSign;
    }

    public UpdateGatewayApiRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public UpdateGatewayApiRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateGatewayApiRequest setRequestBodyModel(String requestBodyModel) {
        this.requestBodyModel = requestBodyModel;
        return this;
    }
    public String getRequestBodyModel() {
        return this.requestBodyModel;
    }

    public UpdateGatewayApiRequest setRequestParams(java.util.List<UpdateGatewayApiRequestRequestParams> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.List<UpdateGatewayApiRequestRequestParams> getRequestParams() {
        return this.requestParams;
    }

    public UpdateGatewayApiRequest setResponseBodyModel(String responseBodyModel) {
        this.responseBodyModel = responseBodyModel;
        return this;
    }
    public String getResponseBodyModel() {
        return this.responseBodyModel;
    }

    public UpdateGatewayApiRequest setRpcParameterTypes(java.util.List<String> rpcParameterTypes) {
        this.rpcParameterTypes = rpcParameterTypes;
        return this;
    }
    public java.util.List<String> getRpcParameterTypes() {
        return this.rpcParameterTypes;
    }

    public UpdateGatewayApiRequest setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

    public UpdateGatewayApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateGatewayApiRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateGatewayApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateGatewayApiRequestCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static UpdateGatewayApiRequestCacheRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestCacheRule self = new UpdateGatewayApiRequestCacheRule();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public UpdateGatewayApiRequestCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public UpdateGatewayApiRequestCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class UpdateGatewayApiRequestDefaultLimitRule extends TeaModel {
        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static UpdateGatewayApiRequestDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestDefaultLimitRule self = new UpdateGatewayApiRequestDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class UpdateGatewayApiRequestHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayApiRequestHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestHeaderRules self = new UpdateGatewayApiRequestHeaderRules();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public UpdateGatewayApiRequestHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public UpdateGatewayApiRequestHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayApiRequestHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayApiRequestLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("Limit")
        public Double limit;

        @NameInMap("Mode")
        public String mode;

        public static UpdateGatewayApiRequestLimitRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestLimitRule self = new UpdateGatewayApiRequestLimitRule();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public UpdateGatewayApiRequestLimitRule setLimit(Double limit) {
            this.limit = limit;
            return this;
        }
        public Double getLimit() {
            return this.limit;
        }

        public UpdateGatewayApiRequestLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateGatewayApiRequestMigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        public Integer flowPercent;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("NeedMigrate")
        public Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        public Boolean needSwitchCompletely;

        public static UpdateGatewayApiRequestMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestMigrateRule self = new UpdateGatewayApiRequestMigrateRule();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestMigrateRule setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public UpdateGatewayApiRequestMigrateRule setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdateGatewayApiRequestMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public UpdateGatewayApiRequestMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

    }

    public static class UpdateGatewayApiRequestMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Type")
        public String type;

        public static UpdateGatewayApiRequestMockRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestMockRule self = new UpdateGatewayApiRequestMockRule();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public UpdateGatewayApiRequestMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public UpdateGatewayApiRequestMockRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public UpdateGatewayApiRequestMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateGatewayApiRequestRequestParams extends TeaModel {
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

        public static UpdateGatewayApiRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiRequestRequestParams self = new UpdateGatewayApiRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiRequestRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateGatewayApiRequestRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateGatewayApiRequestRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public UpdateGatewayApiRequestRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayApiRequestRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public UpdateGatewayApiRequestRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
