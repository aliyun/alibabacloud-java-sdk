// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyApiRequest extends TeaModel {
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("Description")
    public String description;

    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    @NameInMap("RequestConfig")
    public String requestConfig;

    @NameInMap("RequestParamters")
    public String requestParamters;

    @NameInMap("ResultDescriptions")
    public String resultDescriptions;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServiceConfig")
    public String serviceConfig;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    public static ModifyApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiRequest self = new ModifyApiRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiRequest setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public ModifyApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ModifyApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ModifyApiRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ModifyApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiRequest setErrorCodeSamples(String errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public String getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public ModifyApiRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public ModifyApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiRequest setOpenIdConnectConfig(String openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public String getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public ModifyApiRequest setRequestConfig(String requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public String getRequestConfig() {
        return this.requestConfig;
    }

    public ModifyApiRequest setRequestParamters(String requestParamters) {
        this.requestParamters = requestParamters;
        return this;
    }
    public String getRequestParamters() {
        return this.requestParamters;
    }

    public ModifyApiRequest setResultDescriptions(String resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public String getResultDescriptions() {
        return this.resultDescriptions;
    }

    public ModifyApiRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public ModifyApiRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public ModifyApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiRequest setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public ModifyApiRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public ModifyApiRequest setServiceParametersMap(String serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public String getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public ModifyApiRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public ModifyApiRequest setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

}
