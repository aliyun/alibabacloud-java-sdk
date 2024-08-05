// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiRequest extends TeaModel {
    /**
     * <p>The type of the two-way communication API.</p>
     * <ul>
     * <li><strong>COMMON</strong>: normal APIs</li>
     * <li><strong>REGISTER</strong>: registered APIs</li>
     * <li><strong>UNREGISTER</strong>: unregistered APIs</li>
     * <li><strong>NOTIFY</strong>: downstream notification APIs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HmacSHA256</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The name of the API that you want to create. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ApiName</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The IDof the backend service</p>
     * 
     * <strong>example:</strong>
     * <p>HEADER</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43985.html">RequestConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Specifies whether to enable backend services.</p>
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
     * <p>a0305308908c4740aba9cbfd63ba99b7</p>
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
     * <p>If <strong>AuthType</strong> is set to <strong>APP</strong>, the valid values are:</p>
     * <ul>
     * <li><strong>DEFAULT</strong>: The default value that is used if no other values are passed. This value means that the setting of the group is used.</li>
     * <li><strong>DISABLE</strong>: The authentication is disabled.</li>
     * <li><strong>HEADER</strong>: AppCode can be placed in the Header parameter for authentication.</li>
     * <li><strong>HEADER_QUERY</strong>: AppCode can be placed in the Header or Query parameter for authentication.</li>
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
     * <li>Specifies whether to set <strong>DisableInternet</strong> to <strong>true</strong> to limit API calls to within the VPC.</li>
     * <li>If you set <strong>DisableInternet</strong> to <strong>false</strong>, the limit is lifted. The default value is false when you create an API.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>If the <strong>AuthType</strong> is <strong>APP</strong> authentication, you need to pass this value to specify the signature algorithm. If you do not specify this parameter, the default value HmacSHA256 is used. Valid values:</p>
     * <ul>
     * <li>HmacSHA256</li>
     * <li>HmacSHA1,HmacSHA256</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;openIdApiType\&quot;:null,\&quot;idTokenParamName\&quot;:null,\&quot;publicKeyId\&quot;:null,\&quot;publicKey\&quot;:null}</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    /**
     * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43987.html">ServiceConfig</a>.</p>
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
     * <li>If you set <strong>ForceNonceCheck</strong> to <strong>false</strong>, the check is not performed. The default value is false when you create an API.</li>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43986.html">RequestParameter</a>.</p>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateApiRequestTag> tag;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
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
     * <p>The return description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    public static CreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiRequest self = new CreateApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiRequest setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public CreateApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateApiRequest setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public CreateApiRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateApiRequest setBackendEnable(Boolean backendEnable) {
        this.backendEnable = backendEnable;
        return this;
    }
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    public CreateApiRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public CreateApiRequest setConstantParameters(String constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public String getConstantParameters() {
        return this.constantParameters;
    }

    public CreateApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiRequest setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public CreateApiRequest setErrorCodeSamples(String errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public String getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public CreateApiRequest setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public CreateApiRequest setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public CreateApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateApiRequest setOpenIdConnectConfig(String openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public String getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public CreateApiRequest setRequestConfig(String requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public String getRequestConfig() {
        return this.requestConfig;
    }

    public CreateApiRequest setRequestParameters(String requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public String getRequestParameters() {
        return this.requestParameters;
    }

    public CreateApiRequest setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public CreateApiRequest setResultDescriptions(String resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public String getResultDescriptions() {
        return this.resultDescriptions;
    }

    public CreateApiRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public CreateApiRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateApiRequest setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
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

    public CreateApiRequest setSystemParameters(String systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public String getSystemParameters() {
        return this.systemParameters;
    }

    public CreateApiRequest setTag(java.util.List<CreateApiRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateApiRequestTag> getTag() {
        return this.tag;
    }

    public CreateApiRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateApiRequest setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public static class CreateApiRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApiRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateApiRequestTag self = new CreateApiRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateApiRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApiRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
