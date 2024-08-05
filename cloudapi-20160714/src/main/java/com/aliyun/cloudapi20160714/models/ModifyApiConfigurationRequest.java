// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationRequest extends TeaModel {
    /**
     * <p>If the <strong>AuthType</strong> parameter is set to <strong>APP</strong>, you must include this parameter to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
     * <ul>
     * <li>HmacSHA256</li>
     * <li>HmacSHA1,HmacSHA256</li>
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
     * <p>baacc592e63a4cb6a41920d9d3f91f38</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>testModifyApiName</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>If the <strong>AuthType</strong> parameter is set to <strong>APP</strong>, the valid values are:</p>
     * <ul>
     * <li><strong>DEFAULT</strong>: The default value that is used if no other values are passed. This value indicates that the settings of the group are used.</li>
     * <li><strong>DISABLE</strong>: The authentication is disabled.</li>
     * <li><strong>HEADER</strong>: AppCode can be placed in the Header parameter for authentication.</li>
     * <li><strong>HEADER_QUERY</strong>: AppCode can be placed in the Header or Query parameter for authentication.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>API安全认证类型，目前可以取值：</p>
     * <ul>
     * <li><strong>APP</strong>：只允许已授权的APP调用</li>
     * <li><strong>ANONYMOUS</strong>：允许匿名调用，设置为允许匿名调用需要注意：<ul>
     * <li>任何能够获取该API服务信息的人，都将能够调用该API。网关不会对调用者做身份认证，也无法设置按用户的流量控制，若开放该API请设置好按API的流量控制；</li>
     * <li>AppCodeAuthType的值不会生效。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The name of the backend service. This parameter takes effect only when the UseBackendService parameter is set to TRUE.</p>
     * 
     * <strong>example:</strong>
     * <p>testBackendService</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>This parameter takes effect only when the <strong>RequestMode</strong> parameter is set to <strong>MAPPING</strong>.</p>
     * <p>The format in which data is transmitted to the server for POST and PUT requests. Valid values: <strong>FORM</strong> and <strong>STREAM</strong>. FORM indicates that data is transmitted in the key-value pair format. STREAM indicates that data is transmitted as byte streams.</p>
     * 
     * <strong>example:</strong>
     * <p>STREAM</p>
     */
    @NameInMap("BodyFormat")
    public String bodyFormat;

    /**
     * <p>The body model.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://apigateway.aliyun.com/models/f4e7333c****40dcbaf7c9da553ccd8d/3ab61f775b****d4bc35e993****87aa8">https://apigateway.aliyun.com/models/f4e7333c****40dcbaf7c9da553ccd8d/3ab61f775b****d4bc35e993****87aa8</a></p>
     */
    @NameInMap("BodyModel")
    public String bodyModel;

    /**
     * <p>The ContentType configuration of the backend request.</p>
     * <ul>
     * <li>DEFAULT: the default configuration in API Gateway</li>
     * <li>CUSTOM: a custom configuration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("ContentTypeCategory")
    public String contentTypeCategory;

    /**
     * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
     */
    @NameInMap("ContentTypeValue")
    public String contentTypeValue;

    /**
     * <p>The description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>TestModifyDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <ul>
     * <li>Specifies whether to call the API only in an internal network. If the <strong>DisableInternet</strong> parameter is set to <strong>true</strong>, the API can be called only in an internal network.</li>
     * <li>If the <strong>DisableInternet</strong> parameter is set to <strong>false</strong>, the API can be called over the Internet and in an internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44392.html">ErrorCodeSample</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Code&quot;:&quot;400&quot;,&quot;Message&quot;:&quot;Missing the userId&quot;,&quot;Description&quot;:&quot;param invalid&quot;}]</p>
     */
    @NameInMap("ErrorCodeSamples")
    public String errorCodeSamples;

    /**
     * <p>The sample error response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;errorCode&quot;:&quot;fail&quot;,&quot;errorMessage&quot;:&quot;param invalid&quot;}</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <ul>
     * <li>Specifies whether to forcibly check X-Ca-Nonce. If the <strong>ForceNonceCheck</strong> parameter is set to <strong>true</strong>, X-Ca-Nonce is forcibly checked. X-Ca-Nonce is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</li>
     * <li>If the <strong>ForceNonceCheck</strong> parameter is set to <strong>false</strong>, X-Ca-Nonce is not checked. If you do not modify this parameter when you modify an API, the original value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The Function Compute configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FcType&quot;:&quot;FCEvent&quot;,&quot;FcRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;RoleArn&quot;:&quot;acs:ram::xxxxxxxx:role/aliyunserviceroleforapigateway&quot;,&quot;selectServiceName&quot;:&quot;fcTest&quot;,&quot;FunctionName&quot;:&quot;funcTest&quot;,&quot;selectFunctionName&quot;:&quot;funcTest&quot;,&quot;Qualifier&quot;:&quot;LATEST&quot;,&quot;Path&quot;:&quot;&quot;,&quot;FcBaseUrl&quot;:&quot;&quot;,&quot;ServiceName&quot;:&quot;fcTest&quot;}</p>
     */
    @NameInMap("FunctionComputeConfig")
    public String functionComputeConfig;

    /**
     * <p>The HTTP configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceAddress&quot;:&quot;<a href="http://test.api.com%22,%22servicePath%22:%22/test/api%22,%22serviceHttpMethod%22:%22GET%22%7D">http://test.api.com&quot;,&quot;servicePath&quot;:&quot;/test/api&quot;,&quot;serviceHttpMethod&quot;:&quot;GET&quot;}</a></p>
     */
    @NameInMap("HttpConfig")
    public String httpConfig;

    /**
     * <p>The Mock configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MockResult&quot;:&quot;test&quot;,&quot;MockHeaders&quot;:[{&quot;HeaderName&quot;:&quot;testHeader&quot;,&quot;HeaderValue&quot;:&quot;testHeader&quot;}],&quot;MockStatusCode&quot;:&quot;400&quot;}</p>
     */
    @NameInMap("MockConfig")
    public String mockConfig;

    /**
     * <p>The name of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The OSS configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;Key&quot;:&quot;/test.html&quot;,&quot;BucketName&quot;:&quot;test-api-oss&quot;,&quot;Action&quot;:&quot;GetObject&quot;}</p>
     */
    @NameInMap("OssConfig")
    public String ossConfig;

    /**
     * <p>The description of the request body.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the request body</p>
     */
    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    /**
     * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("RequestHttpMethod")
    public String requestHttpMethod;

    /**
     * <p>The request mode. Valid values:</p>
     * <ul>
     * <li>MAPPING: Parameters are mapped. Unknown parameters are filtered out.</li>
     * <li>PASSTHROUGH: Parameters are passed through.</li>
     * <li>MAPPING_PASSTHROUGH: Parameters are mapped. Unknown parameters are passed through.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MAPPING</p>
     */
    @NameInMap("RequestMode")
    public String requestMode;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43986.html">RequestParameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:2},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;OPTIONAL&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;header1&quot;,&quot;DefaultValue&quot;:&quot;123124&quot;,&quot;Location&quot;:&quot;Head&quot;},{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:2},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;header2&quot;,&quot;DefaultValue&quot;:&quot;&quot;,&quot;Location&quot;:&quot;Head&quot;},{&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Query&quot;,&quot;orderNumber&quot;:3},&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;OPTIONAL&quot;,&quot;isHide&quot;:false,&quot;ApiParameterName&quot;:&quot;query1&quot;,&quot;DefaultValue&quot;:&quot;1245&quot;,&quot;Location&quot;:&quot;Query&quot;},{&quot;ApiParameterName&quot;:&quot;CaClientIp&quot;,&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Query&quot;,&quot;orderNumber&quot;:0},&quot;Location&quot;:&quot;Query&quot;,&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;Description&quot;:&quot;ClientIP&quot;},{&quot;ApiParameterName&quot;:&quot;testConstant&quot;,&quot;ParameterLocation&quot;:{&quot;name&quot;:&quot;Head&quot;,&quot;orderNumber&quot;:0},&quot;Location&quot;:&quot;Head&quot;,&quot;ParameterType&quot;:&quot;String&quot;,&quot;Required&quot;:&quot;REQUIRED&quot;,&quot;DefaultValue&quot;:&quot;111&quot;}]</p>
     */
    @NameInMap("RequestParameters")
    public String requestParameters;

    /**
     * <p>The path of the API request. If the complete API URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the path of the API request is <code>/object/add</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/api</p>
     */
    @NameInMap("RequestPath")
    public String requestPath;

    /**
     * <p>The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as &quot;HTTP,HTTPS&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("RequestProtocol")
    public String requestProtocol;

    /**
     * <p>The sample response from the backend service. This value is used only to generate documents. It does not affect the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{\n  \&quot;status\&quot;: 0,\n  \&quot;data\&quot;: {\n    \&quot;count\&quot;: 1,\n    \&quot;list\&quot;: [\n      \&quot;352\&quot;\n    ]\n  },\n  \&quot;message\&quot;: \&quot;success\&quot;\n}</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. This value is used only to generate documents. It does not affect the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43988.html">ServiceParameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ServiceParameterName&quot;:&quot;header1&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;header2&quot;,&quot;Location&quot;:&quot;Query&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;query1&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;REQUEST&quot;},{&quot;ServiceParameterName&quot;:&quot;ipp&quot;,&quot;Location&quot;:&quot;Query&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;SYSTEM&quot;},{&quot;ServiceParameterName&quot;:&quot;testConstant&quot;,&quot;Location&quot;:&quot;Head&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;ParameterCatalog&quot;:&quot;CONSTANT&quot;}]</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43989.html">ServiceParameterMap</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ServiceParameterName&quot;:&quot;header1&quot;,&quot;RequestParameterName&quot;:&quot;header1&quot;},{&quot;ServiceParameterName&quot;:&quot;header2&quot;,&quot;RequestParameterName&quot;:&quot;header2&quot;},{&quot;ServiceParameterName&quot;:&quot;query1&quot;,&quot;RequestParameterName&quot;:&quot;query1&quot;},{&quot;ServiceParameterName&quot;:&quot;ipp&quot;,&quot;RequestParameterName&quot;:&quot;CaClientIp&quot;},{&quot;ServiceParameterName&quot;:&quot;testConstant&quot;,&quot;RequestParameterName&quot;:&quot;testConstant&quot;}]</p>
     */
    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    /**
     * <p>The protocol that is used to access backend services. Valid values:</p>
     * <ul>
     * <li>Http: for backend services that use HTTP or HTTPS</li>
     * <li>Vpc: for backend services that use VPC</li>
     * <li>FC: for Function Compute</li>
     * <li>OSS: for Object Storage Service</li>
     * <li>Mock: for backend services that use the Mock mode</li>
     * <li>EventBridge: for EventBridge</li>
     * </ul>
     * <p>You must specify the config value for the corresponding backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    /**
     * <p>The timeout period of the backend service. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    /**
     * <p>Specifies whether to use the information about the created backend service. Valid values:</p>
     * <ul>
     * <li>TRUE: uses the information about the created backend service.</li>
     * <li>FALSE: uses the information about the custom backend service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("UseBackendService")
    public Boolean useBackendService;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC:</strong> The API is public. If this parameter is set to PUBLIC, the API is displayed on the APIs page for all users after the API is published to the production environment.</li>
     * <li><strong>PRIVATE:</strong> The API is private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The VPC configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VpcId&quot;:&quot;vpc-xxxxxxx&quot;,&quot;Name&quot;:&quot;testVpc&quot;,&quot;InstanceId&quot;:&quot;i-p0ssssss&quot;,&quot;Port&quot;:80,&quot;servicePath&quot;:&quot;/test/vpc&quot;,&quot;serviceHttpMethod&quot;:&quot;HEAD&quot;}</p>
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
