// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationRequest extends TeaModel {
    /**
     * <p>If the **AuthType** parameter is set to **APP**, you must include this parameter to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
     * <br>
     * <p>*   HmacSHA256</p>
     * <p>*   HmacSHA1,HmacSHA256</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The ID of the API.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>If the **AuthType** parameter is set to **APP**, the valid values are:</p>
     * <br>
     * <p>*   **DEFAULT**: The default value that is used if no other values are passed. This value indicates that the settings of the group are used.</p>
     * <p>*   **DISABLE**: The authentication is disabled.</p>
     * <p>*   **HEADER**: AppCode can be placed in the Header parameter for authentication.</p>
     * <p>*   **HEADER_QUERY**: AppCode can be placed in the Header or Query parameter for authentication.</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>API安全认证类型，目前可以取值：</p>
     * <br>
     * <p>- **APP**：只允许已授权的APP调用</p>
     * <p>- **ANONYMOUS**：允许匿名调用，设置为允许匿名调用需要注意：</p>
     * <p>     - 任何能够获取该API服务信息的人，都将能够调用该API。网关不会对调用者做身份认证，也无法设置按用户的流量控制，若开放该API请设置好按API的流量控制；</p>
     * <p>     - AppCodeAuthType的值不会生效。</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The name of the backend service. This parameter takes effect only when the UseBackendService parameter is set to TRUE.</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>This parameter takes effect only when the **RequestMode** parameter is set to **MAPPING**.</p>
     * <br>
     * <p>The format in which data is transmitted to the server for POST and PUT requests. Valid values: **FORM** and **STREAM**. FORM indicates that data is transmitted in the key-value pair format. STREAM indicates that data is transmitted as byte streams.</p>
     */
    @NameInMap("BodyFormat")
    public String bodyFormat;

    /**
     * <p>The body model.</p>
     */
    @NameInMap("BodyModel")
    public String bodyModel;

    /**
     * <p>The ContentType configuration of the backend request.</p>
     * <br>
     * <p>*   DEFAULT: the default configuration in API Gateway</p>
     * <p>*   CUSTOM: a custom configuration</p>
     */
    @NameInMap("ContentTypeCategory")
    public String contentTypeCategory;

    /**
     * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
     */
    @NameInMap("ContentTypeValue")
    public String contentTypeValue;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>*   Specifies whether to call the API only in an internal network. If the **DisableInternet** parameter is set to **true**, the API can be called only in an internal network.</p>
     * <p>*   If the **DisableInternet** parameter is set to **false**, the API can be called over the Internet and in an internal network.</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     * <br>
     * <p>For more information, see [ErrorCodeSample](https://help.aliyun.com/document_detail/44392.html).</p>
     */
    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    /**
     * <p>The sample error response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   Specifies whether to forcibly check X-Ca-Nonce. If the **ForceNonceCheck** parameter is set to **true**, X-Ca-Nonce is forcibly checked. X-Ca-Nonce is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</p>
     * <p>*   If the **ForceNonceCheck** parameter is set to **false**, X-Ca-Nonce is not checked. If you do not modify this parameter when you modify an API, the original value is used.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The Function Compute configuration.</p>
     */
    @NameInMap("FunctionComputeConfig")
    public String functionComputeConfig;

    /**
     * <p>The HTTP configuration.</p>
     */
    @NameInMap("HttpConfig")
    public String httpConfig;

    /**
     * <p>The Mock configuration.</p>
     */
    @NameInMap("MockConfig")
    public String mockConfig;

    /**
     * <p>The name of the model.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The OSS configuration.</p>
     */
    @NameInMap("OssConfig")
    public String ossConfig;

    /**
     * <p>The description of the request body.</p>
     */
    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    /**
     * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
     */
    @NameInMap("RequestHttpMethod")
    public String requestHttpMethod;

    /**
     * <p>The request mode. Valid values:</p>
     * <br>
     * <p>*   MAPPING: Parameters are mapped. Unknown parameters are filtered out.</p>
     * <p>*   PASSTHROUGH: Parameters are passed through.</p>
     * <p>*   MAPPING_PASSTHROUGH: Parameters are mapped. Unknown parameters are passed through.</p>
     */
    @NameInMap("RequestMode")
    public String requestMode;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestParameter](https://help.aliyun.com/document_detail/43986.html).</p>
     */
    @NameInMap("RequestParameters")
    public String requestParameters;

    /**
     * <p>The path of the API request. If the complete API URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the path of the API request is `/object/add`.</p>
     */
    @NameInMap("RequestPath")
    public String requestPath;

    /**
     * <p>The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as "HTTP,HTTPS".</p>
     */
    @NameInMap("RequestProtocol")
    public String requestProtocol;

    /**
     * <p>The sample response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. This value is used only to generate documents. It does not affect the returned result.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameter](https://help.aliyun.com/document_detail/43988.html).</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameterMap](https://help.aliyun.com/document_detail/43989.html).</p>
     */
    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    /**
     * <p>The protocol that is used to access backend services. Valid values:</p>
     * <br>
     * <p>*   Http: for backend services that use HTTP or HTTPS</p>
     * <p>*   Vpc: for backend services that use VPC</p>
     * <p>*   FC: for Function Compute</p>
     * <p>*   OSS: for Object Storage Service</p>
     * <p>*   Mock: for backend services that use the Mock mode</p>
     * <p>*   EventBridge: for EventBridge</p>
     * <br>
     * <p>You must specify the config value for the corresponding backend service.</p>
     */
    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    /**
     * <p>The timeout period of the backend service. Unit: milliseconds.</p>
     */
    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    /**
     * <p>Specifies whether to use the information about the created backend service. Valid values:</p>
     * <br>
     * <p>*   TRUE: uses the information about the created backend service.</p>
     * <p>*   FALSE: uses the information about the custom backend service.</p>
     */
    @NameInMap("UseBackendService")
    public Boolean useBackendService;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC:** The API is public. If this parameter is set to PUBLIC, the API is displayed on the APIs page for all users after the API is published to the production environment.</p>
     * <p>*   **PRIVATE:** The API is private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The VPC configuration.</p>
     */
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
