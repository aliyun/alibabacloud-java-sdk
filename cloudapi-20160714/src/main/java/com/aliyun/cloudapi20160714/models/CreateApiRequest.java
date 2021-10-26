// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("RequestConfig")
    public String requestConfig;

    @NameInMap("ServiceConfig")
    public String serviceConfig;

    @NameInMap("RequestParameters")
    public String requestParameters;

    @NameInMap("SystemParameters")
    public String systemParameters;

    @NameInMap("ConstantParameters")
    public String constantParameters;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    @NameInMap("ResultDescriptions")
    public String resultDescriptions;

    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    public static CreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiRequest self = new CreateApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateApiRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateApiRequest setRequestConfig(String requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public String getRequestConfig() {
        return this.requestConfig;
    }

    public CreateApiRequest setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public CreateApiRequest setRequestParameters(String requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public String getRequestParameters() {
        return this.requestParameters;
    }

    public CreateApiRequest setSystemParameters(String systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public String getSystemParameters() {
        return this.systemParameters;
    }

    public CreateApiRequest setConstantParameters(String constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public String getConstantParameters() {
        return this.constantParameters;
    }

    public CreateApiRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public CreateApiRequest setServiceParametersMap(String serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public String getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public CreateApiRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateApiRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public CreateApiRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public CreateApiRequest setErrorCodeSamples(String errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public String getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public CreateApiRequest setResultDescriptions(String resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public String getResultDescriptions() {
        return this.resultDescriptions;
    }

    public CreateApiRequest setOpenIdConnectConfig(String openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public String getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public CreateApiRequest setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public CreateApiRequest setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public CreateApiRequest setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public CreateApiRequest setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public CreateApiRequest setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public CreateApiRequest setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

}
