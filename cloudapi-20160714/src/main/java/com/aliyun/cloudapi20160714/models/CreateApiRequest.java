// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiRequest extends TeaModel {
    /**
     * <p>The type of the two-way communication API.</p>
     * <br>
     * <p>*   **COMMON**: normal APIs</p>
     * <p>*   **REGISTER**: registered APIs</p>
     * <p>*   **UNREGISTER**: unregistered APIs</p>
     * <p>*   **NOTIFY**: downstream notification APIs</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The name of the API that you want to create. The name must be unique within the API group. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (_).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The IDof the backend service</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestConfig](https://help.aliyun.com/document_detail/43985.html).</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Specifies whether to enable backend services.</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>Specifies whether to enable backend services.</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("ConstantParameters")
    public String constantParameters;

    /**
     * <p>The description of the API. The description can be up to 180 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>If **AuthType** is set to **APP**, the valid values are:</p>
     * <br>
     * <p>*   **DEFAULT**: The default value that is used if no other values are passed. This value means that the setting of the group is used.</p>
     * <p>*   **DISABLE**: The authentication is disabled.</p>
     * <p>*   **HEADER**: AppCode can be placed in the Header parameter for authentication.</p>
     * <p>*   **HEADER_QUERY**: AppCode can be placed in the Header or Query parameter for authentication.</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   Specifies whether to set **DisableInternet** to **true** to limit API calls to within the VPC.</p>
     * <p>*   If you set **DisableInternet** to **false**, the limit is lifted. The default value is false when you create an API.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>If the **AuthType** is **APP** authentication, you need to pass this value to specify the signature algorithm. If you do not specify this parameter, the default value HmacSHA256 is used. Valid values:</p>
     * <br>
     * <p>*   HmacSHA256</p>
     * <p>*   HmacSHA1,HmacSHA256</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public String openIdConnectConfig;

    /**
     * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceConfig](https://help.aliyun.com/document_detail/43987.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestConfig")
    public String requestConfig;

    @NameInMap("RequestParameters")
    public String requestParameters;

    /**
     * <p>*   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</p>
     * <p>*   If you set **ForceNonceCheck** to **false**, the check is not performed. The default value is false when you create an API.</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    @NameInMap("ResultDescriptions")
    public String resultDescriptions;

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
     * <br>
     * <p>For more information, see [RequestParameter](https://help.aliyun.com/document_detail/43986.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>*   **PUBLIC**: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</p>
     * <p>*   **PRIVATE**: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The return description of the API.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
