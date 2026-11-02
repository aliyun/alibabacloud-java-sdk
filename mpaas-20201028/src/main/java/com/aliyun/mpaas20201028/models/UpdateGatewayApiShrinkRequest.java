// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiShrinkRequest extends TeaModel {
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
    public String cacheRuleShrink;

    @NameInMap("Charset")
    public String charset;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("DefaultLimitRule")
    public String defaultLimitRuleShrink;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("HeaderRules")
    public String headerRulesShrink;

    @NameInMap("InterfaceType")
    public String interfaceType;

    @NameInMap("LimitRule")
    public String limitRuleShrink;

    @NameInMap("Method")
    public String method;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("MigrateRule")
    public String migrateRuleShrink;

    @NameInMap("MockRule")
    public String mockRuleShrink;

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
    public String requestParamsShrink;

    @NameInMap("ResponseBodyModel")
    public String responseBodyModel;

    @NameInMap("RpcParameterTypes")
    public String rpcParameterTypesShrink;

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

    public static UpdateGatewayApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiShrinkRequest self = new UpdateGatewayApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiShrinkRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public UpdateGatewayApiShrinkRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateGatewayApiShrinkRequest setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public UpdateGatewayApiShrinkRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public UpdateGatewayApiShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGatewayApiShrinkRequest setAuthRuleName(String authRuleName) {
        this.authRuleName = authRuleName;
        return this;
    }
    public String getAuthRuleName() {
        return this.authRuleName;
    }

    public UpdateGatewayApiShrinkRequest setCacheRuleShrink(String cacheRuleShrink) {
        this.cacheRuleShrink = cacheRuleShrink;
        return this;
    }
    public String getCacheRuleShrink() {
        return this.cacheRuleShrink;
    }

    public UpdateGatewayApiShrinkRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public UpdateGatewayApiShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UpdateGatewayApiShrinkRequest setDefaultLimitRuleShrink(String defaultLimitRuleShrink) {
        this.defaultLimitRuleShrink = defaultLimitRuleShrink;
        return this;
    }
    public String getDefaultLimitRuleShrink() {
        return this.defaultLimitRuleShrink;
    }

    public UpdateGatewayApiShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayApiShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateGatewayApiShrinkRequest setHeaderRulesShrink(String headerRulesShrink) {
        this.headerRulesShrink = headerRulesShrink;
        return this;
    }
    public String getHeaderRulesShrink() {
        return this.headerRulesShrink;
    }

    public UpdateGatewayApiShrinkRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public UpdateGatewayApiShrinkRequest setLimitRuleShrink(String limitRuleShrink) {
        this.limitRuleShrink = limitRuleShrink;
        return this;
    }
    public String getLimitRuleShrink() {
        return this.limitRuleShrink;
    }

    public UpdateGatewayApiShrinkRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateGatewayApiShrinkRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateGatewayApiShrinkRequest setMigrateRuleShrink(String migrateRuleShrink) {
        this.migrateRuleShrink = migrateRuleShrink;
        return this;
    }
    public String getMigrateRuleShrink() {
        return this.migrateRuleShrink;
    }

    public UpdateGatewayApiShrinkRequest setMockRuleShrink(String mockRuleShrink) {
        this.mockRuleShrink = mockRuleShrink;
        return this;
    }
    public String getMockRuleShrink() {
        return this.mockRuleShrink;
    }

    public UpdateGatewayApiShrinkRequest setNeedEncrypt(Boolean needEncrypt) {
        this.needEncrypt = needEncrypt;
        return this;
    }
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    public UpdateGatewayApiShrinkRequest setNeedJsonp(Boolean needJsonp) {
        this.needJsonp = needJsonp;
        return this;
    }
    public Boolean getNeedJsonp() {
        return this.needJsonp;
    }

    public UpdateGatewayApiShrinkRequest setNeedSign(Boolean needSign) {
        this.needSign = needSign;
        return this;
    }
    public Boolean getNeedSign() {
        return this.needSign;
    }

    public UpdateGatewayApiShrinkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public UpdateGatewayApiShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateGatewayApiShrinkRequest setRequestBodyModel(String requestBodyModel) {
        this.requestBodyModel = requestBodyModel;
        return this;
    }
    public String getRequestBodyModel() {
        return this.requestBodyModel;
    }

    public UpdateGatewayApiShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

    public UpdateGatewayApiShrinkRequest setResponseBodyModel(String responseBodyModel) {
        this.responseBodyModel = responseBodyModel;
        return this;
    }
    public String getResponseBodyModel() {
        return this.responseBodyModel;
    }

    public UpdateGatewayApiShrinkRequest setRpcParameterTypesShrink(String rpcParameterTypesShrink) {
        this.rpcParameterTypesShrink = rpcParameterTypesShrink;
        return this;
    }
    public String getRpcParameterTypesShrink() {
        return this.rpcParameterTypesShrink;
    }

    public UpdateGatewayApiShrinkRequest setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

    public UpdateGatewayApiShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateGatewayApiShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateGatewayApiShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
