// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiRequest extends TeaModel {
    /**
     * <p>The type of the two-way communication API. Valid values:</p>
     * <br>
     * <p>*   **COMMON**: general APIs</p>
     * <p>*   **REGISTER**: registered APIs</p>
     * <p>*   **UNREGISTER**: unregistered APIs</p>
     * <p>*   **NOTIFY**: downstream notification</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The ID of the backend service.</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Configuration Mode</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>Specifies whether to enable backend services.</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     */
    @NameInMap("ConstantParameters")
    public String constantParameters;

    /**
     * <p>The description of the API. The description can be up to 180 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The AppCode authentication type supported. Valid values:</p>
     * <br>
     * <p>*   DEFAULT: supported after being made available in Alibaba Cloud Marketplace</p>
     * <p>*   DISABLE: not supported</p>
     * <p>*   HEADER : supported only in the Header parameter</p>
     * <p>*   HEADER_QUERY: supported in the Header or Query parameter</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The returned description of the API.</p>
     */
    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   Specifies whether to set DisableInternet to **true** to limit API calls to within the VPC.</p>
     * <p>*   If you set DisableInternet to **false**, the limit if lifted.</p>
     * <br>
     * <p>>  If you do not set this parameter, the original value is used.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The client-side request signature method of the API. Valid values:</p>
     * <br>
     * <p>*   HmacSHA256</p>
     * <p>*   HmacSHA1,HmacSHA256</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    /**
     * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
     */
    @NameInMap("RequestConfig")
    public String requestConfig;

    /**
     * <p>System parameter</p>
     */
    @NameInMap("RequestParameters")
    public String requestParameters;

    /**
     * <p>*   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</p>
     * <p>*   If you set **ForceNonceCheck** to **false**, the check is not performed. If you do not set this parameter, the original value is used.</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>The configuration items of the third-party OpenID Connect authentication method.</p>
     */
    @NameInMap("ResultDescriptions")
    public String resultDescriptions;

    /**
     * <p>The sample error response from the backend service.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The sample response from the backend service.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     */
    @NameInMap("ServiceConfig")
    public String serviceConfig;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. This value is used only to generate documents. It does not affect the returned results.</p>
     */
    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    /**
     * <p>Constant parameter</p>
     */
    @NameInMap("SystemParameters")
    public String systemParameters;

    /**
     * <p>Specifies whether the API is public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</p>
     * <p>*   **PRIVATE**: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The returned description of the API.</p>
     */
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

    public ModifyApiRequest setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public ModifyApiRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ModifyApiRequest setBackendEnable(Boolean backendEnable) {
        this.backendEnable = backendEnable;
        return this;
    }
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    public ModifyApiRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public ModifyApiRequest setConstantParameters(String constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public String getConstantParameters() {
        return this.constantParameters;
    }

    public ModifyApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiRequest setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
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

    public ModifyApiRequest setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
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

    public ModifyApiRequest setRequestParameters(String requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public String getRequestParameters() {
        return this.requestParameters;
    }

    public ModifyApiRequest setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
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

    public ModifyApiRequest setSystemParameters(String systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public String getSystemParameters() {
        return this.systemParameters;
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
