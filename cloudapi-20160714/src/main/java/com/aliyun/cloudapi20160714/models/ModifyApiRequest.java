// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiRequest extends TeaModel {
    /**
     * <p>The type of the two-way communication API. Valid values:</p>
     * <ul>
     * <li><strong>COMMON</strong>: general APIs</li>
     * <li><strong>REGISTER</strong>: registered APIs</li>
     * <li><strong>UNREGISTER</strong>: unregistered APIs</li>
     * <li><strong>NOTIFY</strong>: downstream notification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HmacSHA256</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8afff6c8c4c6447abb035812e4d66b65</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ApiName</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Configuration Mode</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>Specifies whether to enable backend services.</p>
     * 
     * <strong>example:</strong>
     * <p>0d105f80a8f340408bd34954d4e4ff22</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("ConstantParameters")
    public String constantParameters;

    /**
     * <p>The description of the API. The description can be up to 180 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Api description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The AppCode authentication type supported. Valid values:</p>
     * <ul>
     * <li>DEFAULT: supported after being made available in Alibaba Cloud Marketplace</li>
     * <li>DISABLE: not supported</li>
     * <li>HEADER : supported only in the Header parameter</li>
     * <li>HEADER_QUERY: supported in the Header or Query parameter</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <ul>
     * <li>Specifies whether to set DisableInternet to <strong>true</strong> to limit API calls to within the VPC.</li>
     * <li>If you set DisableInternet to <strong>false</strong>, the limit if lifted.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not set this parameter, the original value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>927d50c0f2e54b359919923d908bb015</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The client-side request signature method of the API. Valid values:</p>
     * <ul>
     * <li>HmacSHA256</li>
     * <li>HmacSHA1,HmacSHA256</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;OpenIdApiType\&quot;:\&quot;IDTOKEN\&quot;,\&quot;PublicKey\&quot;:\&quot;lzlj1573\&quot;,\&quot;IdTokenParamName\&quot;:\&quot;\&quot;,\&quot;PublicKeyId\&quot;:\&quot;lzljorders\&quot;}</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    /**
     * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestProtocol&quot;:&quot;HTTP&quot;,&quot;RequestHttpMethod&quot;:&quot;GET&quot;,&quot;RequestPath&quot;:&quot;/v3/getUserTest/[userId]&quot;,&quot;BodyFormat&quot;:&quot;FORM&quot;,&quot;PostBodyDescription&quot;:&quot;&quot;}</p>
     */
    @NameInMap("RequestConfig")
    public String requestConfig;

    @NameInMap("RequestParameters")
    public String requestParameters;

    /**
     * <ul>
     * <li>Specifies whether to set <strong>ForceNonceCheck</strong> to <strong>true</strong> to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</li>
     * <li>If you set <strong>ForceNonceCheck</strong> to <strong>false</strong>, the check is not performed. If you do not set this parameter, the original value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    @NameInMap("ResultDescriptions")
    public String resultDescriptions;

    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The sample response from the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>HTML</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ServiceProtocol&quot;:&quot;HTTP&quot;,&quot;ServiceHttpMethod&quot;:&quot;GET&quot;,&quot;ServiceAddress&quot;:&quot;<a href="http://www.customerdomain.com%22,%22ServiceTimeout%22:%221000%22,%22ServicePath%22:%22/v3/getUserTest/%5BuserId%5D%22%7D">http://www.customerdomain.com&quot;,&quot;ServiceTimeout&quot;:&quot;1000&quot;,&quot;ServicePath&quot;:&quot;/v3/getUserTest/[userId]&quot;}</a></p>
     */
    @NameInMap("ServiceConfig")
    public String serviceConfig;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    @NameInMap("SystemParameters")
    public String systemParameters;

    /**
     * <p>Specifies whether the API is public. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC</strong>: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</li>
     * <li><strong>PRIVATE</strong>: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The returned description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
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
