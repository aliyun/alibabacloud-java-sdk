// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListGatewayApisResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Apis")
    public java.util.List<ListGatewayApisResponseBodyApis> apis;

    @NameInMap("ErrorField")
    public String errorField;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListGatewayApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayApisResponseBody self = new ListGatewayApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayApisResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListGatewayApisResponseBody setApis(java.util.List<ListGatewayApisResponseBodyApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<ListGatewayApisResponseBodyApis> getApis() {
        return this.apis;
    }

    public ListGatewayApisResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public ListGatewayApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayApisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGatewayApisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGatewayApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGatewayApisResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListGatewayApisResponseBodyApisCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        public String cacheKey;

        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        public static ListGatewayApisResponseBodyApisCacheRule build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisCacheRule self = new ListGatewayApisResponseBodyApisCacheRule();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisCacheRule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public ListGatewayApisResponseBodyApisCacheRule setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public ListGatewayApisResponseBodyApisCacheRule setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

    public static class ListGatewayApisResponseBodyApisDefaultLimitRule extends TeaModel {
        @NameInMap("DefaultLimit")
        public Boolean defaultLimit;

        public static ListGatewayApisResponseBodyApisDefaultLimitRule build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisDefaultLimitRule self = new ListGatewayApisResponseBodyApisDefaultLimitRule();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisDefaultLimitRule setDefaultLimit(Boolean defaultLimit) {
            this.defaultLimit = defaultLimit;
            return this;
        }
        public Boolean getDefaultLimit() {
            return this.defaultLimit;
        }

    }

    public static class ListGatewayApisResponseBodyApisHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("Location")
        public String location;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListGatewayApisResponseBodyApisHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisHeaderRules self = new ListGatewayApisResponseBodyApisHeaderRules();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisHeaderRules setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public ListGatewayApisResponseBodyApisHeaderRules setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGatewayApisResponseBodyApisHeaderRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayApisResponseBodyApisHeaderRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGatewayApisResponseBodyApisLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        public String defaultResponse;

        @NameInMap("Limit")
        public Double limit;

        @NameInMap("Mode")
        public String mode;

        public static ListGatewayApisResponseBodyApisLimitRule build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisLimitRule self = new ListGatewayApisResponseBodyApisLimitRule();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisLimitRule setDefaultResponse(String defaultResponse) {
            this.defaultResponse = defaultResponse;
            return this;
        }
        public String getDefaultResponse() {
            return this.defaultResponse;
        }

        public ListGatewayApisResponseBodyApisLimitRule setLimit(Double limit) {
            this.limit = limit;
            return this;
        }
        public Double getLimit() {
            return this.limit;
        }

        public ListGatewayApisResponseBodyApisLimitRule setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListGatewayApisResponseBodyApisMigrateRule extends TeaModel {
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

        public static ListGatewayApisResponseBodyApisMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisMigrateRule self = new ListGatewayApisResponseBodyApisMigrateRule();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisMigrateRule setFlowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        public ListGatewayApisResponseBodyApisMigrateRule setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListGatewayApisResponseBodyApisMigrateRule setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayApisResponseBodyApisMigrateRule setNeedMigrate(Boolean needMigrate) {
            this.needMigrate = needMigrate;
            return this;
        }
        public Boolean getNeedMigrate() {
            return this.needMigrate;
        }

        public ListGatewayApisResponseBodyApisMigrateRule setNeedSwitchCompletely(Boolean needSwitchCompletely) {
            this.needSwitchCompletely = needSwitchCompletely;
            return this;
        }
        public Boolean getNeedSwitchCompletely() {
            return this.needSwitchCompletely;
        }

        public ListGatewayApisResponseBodyApisMigrateRule setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

    }

    public static class ListGatewayApisResponseBodyApisMockRule extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        @NameInMap("NeedMock")
        public Boolean needMock;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Type")
        public String type;

        public static ListGatewayApisResponseBodyApisMockRule build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisMockRule self = new ListGatewayApisResponseBodyApisMockRule();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisMockRule setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

        public ListGatewayApisResponseBodyApisMockRule setNeedMock(Boolean needMock) {
            this.needMock = needMock;
            return this;
        }
        public Boolean getNeedMock() {
            return this.needMock;
        }

        public ListGatewayApisResponseBodyApisMockRule setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListGatewayApisResponseBodyApisMockRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayApisResponseBodyApisRequestParams extends TeaModel {
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

        public static ListGatewayApisResponseBodyApisRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApisRequestParams self = new ListGatewayApisResponseBodyApisRequestParams();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApisRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGatewayApisResponseBodyApisRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayApisResponseBodyApisRequestParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGatewayApisResponseBodyApisRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayApisResponseBodyApisRequestParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGatewayApisResponseBodyApisRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayApisResponseBodyApis extends TeaModel {
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
        public ListGatewayApisResponseBodyApisCacheRule cacheRule;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("DefaultLimitRule")
        public ListGatewayApisResponseBodyApisDefaultLimitRule defaultLimitRule;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("HeaderRules")
        public java.util.List<ListGatewayApisResponseBodyApisHeaderRules> headerRules;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("LimitRule")
        public ListGatewayApisResponseBodyApisLimitRule limitRule;

        @NameInMap("Method")
        public String method;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("MigrateRule")
        public ListGatewayApisResponseBodyApisMigrateRule migrateRule;

        @NameInMap("MockRule")
        public ListGatewayApisResponseBodyApisMockRule mockRule;

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
        public java.util.List<ListGatewayApisResponseBodyApisRequestParams> requestParams;

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

        public static ListGatewayApisResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApisResponseBodyApis self = new ListGatewayApisResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public ListGatewayApisResponseBodyApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListGatewayApisResponseBodyApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListGatewayApisResponseBodyApis setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public ListGatewayApisResponseBodyApis setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListGatewayApisResponseBodyApis setAuthRuleName(String authRuleName) {
            this.authRuleName = authRuleName;
            return this;
        }
        public String getAuthRuleName() {
            return this.authRuleName;
        }

        public ListGatewayApisResponseBodyApis setCacheRule(ListGatewayApisResponseBodyApisCacheRule cacheRule) {
            this.cacheRule = cacheRule;
            return this;
        }
        public ListGatewayApisResponseBodyApisCacheRule getCacheRule() {
            return this.cacheRule;
        }

        public ListGatewayApisResponseBodyApis setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListGatewayApisResponseBodyApis setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListGatewayApisResponseBodyApis setDefaultLimitRule(ListGatewayApisResponseBodyApisDefaultLimitRule defaultLimitRule) {
            this.defaultLimitRule = defaultLimitRule;
            return this;
        }
        public ListGatewayApisResponseBodyApisDefaultLimitRule getDefaultLimitRule() {
            return this.defaultLimitRule;
        }

        public ListGatewayApisResponseBodyApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayApisResponseBodyApis setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListGatewayApisResponseBodyApis setHeaderRules(java.util.List<ListGatewayApisResponseBodyApisHeaderRules> headerRules) {
            this.headerRules = headerRules;
            return this;
        }
        public java.util.List<ListGatewayApisResponseBodyApisHeaderRules> getHeaderRules() {
            return this.headerRules;
        }

        public ListGatewayApisResponseBodyApis setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public ListGatewayApisResponseBodyApis setLimitRule(ListGatewayApisResponseBodyApisLimitRule limitRule) {
            this.limitRule = limitRule;
            return this;
        }
        public ListGatewayApisResponseBodyApisLimitRule getLimitRule() {
            return this.limitRule;
        }

        public ListGatewayApisResponseBodyApis setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGatewayApisResponseBodyApis setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListGatewayApisResponseBodyApis setMigrateRule(ListGatewayApisResponseBodyApisMigrateRule migrateRule) {
            this.migrateRule = migrateRule;
            return this;
        }
        public ListGatewayApisResponseBodyApisMigrateRule getMigrateRule() {
            return this.migrateRule;
        }

        public ListGatewayApisResponseBodyApis setMockRule(ListGatewayApisResponseBodyApisMockRule mockRule) {
            this.mockRule = mockRule;
            return this;
        }
        public ListGatewayApisResponseBodyApisMockRule getMockRule() {
            return this.mockRule;
        }

        public ListGatewayApisResponseBodyApis setNeedEncrypt(Boolean needEncrypt) {
            this.needEncrypt = needEncrypt;
            return this;
        }
        public Boolean getNeedEncrypt() {
            return this.needEncrypt;
        }

        public ListGatewayApisResponseBodyApis setNeedJsonp(Boolean needJsonp) {
            this.needJsonp = needJsonp;
            return this;
        }
        public Boolean getNeedJsonp() {
            return this.needJsonp;
        }

        public ListGatewayApisResponseBodyApis setNeedSign(Boolean needSign) {
            this.needSign = needSign;
            return this;
        }
        public Boolean getNeedSign() {
            return this.needSign;
        }

        public ListGatewayApisResponseBodyApis setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGatewayApisResponseBodyApis setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayApisResponseBodyApis setRequestBodyModel(String requestBodyModel) {
            this.requestBodyModel = requestBodyModel;
            return this;
        }
        public String getRequestBodyModel() {
            return this.requestBodyModel;
        }

        public ListGatewayApisResponseBodyApis setRequestParams(java.util.List<ListGatewayApisResponseBodyApisRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<ListGatewayApisResponseBodyApisRequestParams> getRequestParams() {
            return this.requestParams;
        }

        public ListGatewayApisResponseBodyApis setResponseBodyModel(String responseBodyModel) {
            this.responseBodyModel = responseBodyModel;
            return this;
        }
        public String getResponseBodyModel() {
            return this.responseBodyModel;
        }

        public ListGatewayApisResponseBodyApis setRpcParameterTypes(java.util.List<String> rpcParameterTypes) {
            this.rpcParameterTypes = rpcParameterTypes;
            return this;
        }
        public java.util.List<String> getRpcParameterTypes() {
            return this.rpcParameterTypes;
        }

        public ListGatewayApisResponseBodyApis setSerialization(String serialization) {
            this.serialization = serialization;
            return this;
        }
        public String getSerialization() {
            return this.serialization;
        }

        public ListGatewayApisResponseBodyApis setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGatewayApisResponseBodyApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

}
