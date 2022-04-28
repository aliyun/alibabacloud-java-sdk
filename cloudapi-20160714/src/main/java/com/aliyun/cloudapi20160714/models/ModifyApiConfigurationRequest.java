// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationRequest extends TeaModel {
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BackendName")
    public String backendName;

    @NameInMap("BodyFormat")
    public String bodyFormat;

    @NameInMap("BodyModel")
    public String bodyModel;

    @NameInMap("ContentTypeCategory")
    public String contentTypeCategory;

    @NameInMap("ContentTypeValue")
    public String contentTypeValue;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    @NameInMap("FunctionComputeConfig")
    public String functionComputeConfig;

    @NameInMap("HttpConfig")
    public String httpConfig;

    @NameInMap("MockConfig")
    public String mockConfig;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("OssConfig")
    public String ossConfig;

    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    @NameInMap("RequestHttpMethod")
    public String requestHttpMethod;

    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("RequestParameters")
    public String requestParameters;

    @NameInMap("RequestPath")
    public String requestPath;

    @NameInMap("RequestProtocol")
    public String requestProtocol;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    @NameInMap("UseBackendService")
    public Boolean useBackendService;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("VpcConfig")
    public String vpcConfig;

    public static ModifyApiConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiConfigurationRequest self = new ModifyApiConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiConfigurationRequest setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public ModifyApiConfigurationRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ModifyApiConfigurationRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ModifyApiConfigurationRequest setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public ModifyApiConfigurationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ModifyApiConfigurationRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public ModifyApiConfigurationRequest setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
        return this;
    }
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    public ModifyApiConfigurationRequest setBodyModel(String bodyModel) {
        this.bodyModel = bodyModel;
        return this;
    }
    public String getBodyModel() {
        return this.bodyModel;
    }

    public ModifyApiConfigurationRequest setContentTypeCategory(String contentTypeCategory) {
        this.contentTypeCategory = contentTypeCategory;
        return this;
    }
    public String getContentTypeCategory() {
        return this.contentTypeCategory;
    }

    public ModifyApiConfigurationRequest setContentTypeValue(String contentTypeValue) {
        this.contentTypeValue = contentTypeValue;
        return this;
    }
    public String getContentTypeValue() {
        return this.contentTypeValue;
    }

    public ModifyApiConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiConfigurationRequest setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public ModifyApiConfigurationRequest setErrorCodeSamples(String errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public String getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public ModifyApiConfigurationRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public ModifyApiConfigurationRequest setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public ModifyApiConfigurationRequest setFunctionComputeConfig(String functionComputeConfig) {
        this.functionComputeConfig = functionComputeConfig;
        return this;
    }
    public String getFunctionComputeConfig() {
        return this.functionComputeConfig;
    }

    public ModifyApiConfigurationRequest setHttpConfig(String httpConfig) {
        this.httpConfig = httpConfig;
        return this;
    }
    public String getHttpConfig() {
        return this.httpConfig;
    }

    public ModifyApiConfigurationRequest setMockConfig(String mockConfig) {
        this.mockConfig = mockConfig;
        return this;
    }
    public String getMockConfig() {
        return this.mockConfig;
    }

    public ModifyApiConfigurationRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModifyApiConfigurationRequest setOssConfig(String ossConfig) {
        this.ossConfig = ossConfig;
        return this;
    }
    public String getOssConfig() {
        return this.ossConfig;
    }

    public ModifyApiConfigurationRequest setPostBodyDescription(String postBodyDescription) {
        this.postBodyDescription = postBodyDescription;
        return this;
    }
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    public ModifyApiConfigurationRequest setRequestHttpMethod(String requestHttpMethod) {
        this.requestHttpMethod = requestHttpMethod;
        return this;
    }
    public String getRequestHttpMethod() {
        return this.requestHttpMethod;
    }

    public ModifyApiConfigurationRequest setRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }
    public String getRequestMode() {
        return this.requestMode;
    }

    public ModifyApiConfigurationRequest setRequestParameters(String requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public String getRequestParameters() {
        return this.requestParameters;
    }

    public ModifyApiConfigurationRequest setRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }
    public String getRequestPath() {
        return this.requestPath;
    }

    public ModifyApiConfigurationRequest setRequestProtocol(String requestProtocol) {
        this.requestProtocol = requestProtocol;
        return this;
    }
    public String getRequestProtocol() {
        return this.requestProtocol;
    }

    public ModifyApiConfigurationRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public ModifyApiConfigurationRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public ModifyApiConfigurationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiConfigurationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public ModifyApiConfigurationRequest setServiceParametersMap(String serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public String getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public ModifyApiConfigurationRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public ModifyApiConfigurationRequest setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
        return this;
    }
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    public ModifyApiConfigurationRequest setUseBackendService(Boolean useBackendService) {
        this.useBackendService = useBackendService;
        return this;
    }
    public Boolean getUseBackendService() {
        return this.useBackendService;
    }

    public ModifyApiConfigurationRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public ModifyApiConfigurationRequest setVpcConfig(String vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public String getVpcConfig() {
        return this.vpcConfig;
    }

}
