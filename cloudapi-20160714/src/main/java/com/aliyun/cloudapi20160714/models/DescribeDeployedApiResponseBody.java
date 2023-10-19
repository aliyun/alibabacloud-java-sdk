// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployedApiResponseBody extends TeaModel {
    /**
     * <p>The signature method used by the client. Valid values:</p>
     * <br>
     * <p>*   HmacSHA256</p>
     * <p>*   HmacSHA1,HmacSHA256</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The security authentication method of the API. Valid values:</p>
     * <br>
     * <p>*   **APP: Only authorized applications can call the API.**</p>
     * <br>
     * <p>*   **ANONYMOUS: The API can be anonymously called. In this mode, you must take note of the following rules:**</p>
     * <br>
     * <p>    *   All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The constant parameters.</p>
     */
    @NameInMap("ConstantParameters")
    public DescribeDeployedApiResponseBodyConstantParameters constantParameters;

    /**
     * <p>The custom system parameters.</p>
     */
    @NameInMap("CustomSystemParameters")
    public DescribeDeployedApiResponseBodyCustomSystemParameters customSystemParameters;

    /**
     * <p>The deployment time. Format: yyyy-mm-ddhh:mm:ss.</p>
     */
    @NameInMap("DeployedTime")
    public String deployedTime;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>*   Specifies whether to set DisableInternet to **true** to limit API calls to within the VPC.</p>
     * <p>*   If you set DisableInternet to **false**, the limit is lifted.</p>
     * <br>
     * <p>>  If you do not set this parameter, the original value is not modified.</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     * <br>
     * <p>For more information, see [ErrorCodeSample](~~44392~~).</p>
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeDeployedApiResponseBodyErrorCodeSamples errorCodeSamples;

    /**
     * <p>The sample error response from the backend service.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   Specifies whether to set **ForceNonceCheck** to **true** to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</p>
     * <p>*   If you set **ForceNonceCheck** to **false**, the check is not performed. The default value is false when you create an API.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the API group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The configuration items of the third-party OpenID Connect authentication method.</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public DescribeDeployedApiResponseBodyOpenIdConnectConfig openIdConnectConfig;

    /**
     * <p>The region to which the API group belongs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Configuration items of API requests sent by the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestConfig](~~43985~~).</p>
     */
    @NameInMap("RequestConfig")
    public DescribeDeployedApiResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestParameter](~~43986~~).</p>
     */
    @NameInMap("RequestParameters")
    public DescribeDeployedApiResponseBodyRequestParameters requestParameters;

    /**
     * <p>The return description of the API.</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>The return description of the API.</p>
     */
    @NameInMap("ResultDescriptions")
    public DescribeDeployedApiResponseBodyResultDescriptions resultDescriptions;

    /**
     * <p>The sample response from the backend service.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML. Default value: JSON.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceConfig](~~43987~~).</p>
     */
    @NameInMap("ServiceConfig")
    public DescribeDeployedApiResponseBodyServiceConfig serviceConfig;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameter](~~43988~~).</p>
     */
    @NameInMap("ServiceParameters")
    public DescribeDeployedApiResponseBodyServiceParameters serviceParameters;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameterMap](~~43989~~).</p>
     */
    @NameInMap("ServiceParametersMap")
    public DescribeDeployedApiResponseBodyServiceParametersMap serviceParametersMap;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE: the pre-release environment**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>System parameters</p>
     */
    @NameInMap("SystemParameters")
    public DescribeDeployedApiResponseBodySystemParameters systemParameters;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.**</p>
     * <p>*   **PRIVATE: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static DescribeDeployedApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApiResponseBody self = new DescribeDeployedApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApiResponseBody setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public DescribeDeployedApiResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeDeployedApiResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeDeployedApiResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeDeployedApiResponseBody setConstantParameters(DescribeDeployedApiResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeDeployedApiResponseBody setCustomSystemParameters(DescribeDeployedApiResponseBodyCustomSystemParameters customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyCustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    public DescribeDeployedApiResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
    }

    public DescribeDeployedApiResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDeployedApiResponseBody setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public DescribeDeployedApiResponseBody setErrorCodeSamples(DescribeDeployedApiResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeDeployedApiResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeDeployedApiResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeDeployedApiResponseBody setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public DescribeDeployedApiResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDeployedApiResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDeployedApiResponseBody setOpenIdConnectConfig(DescribeDeployedApiResponseBodyOpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public DescribeDeployedApiResponseBodyOpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public DescribeDeployedApiResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeployedApiResponseBody setRequestConfig(DescribeDeployedApiResponseBodyRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public DescribeDeployedApiResponseBodyRequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public DescribeDeployedApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployedApiResponseBody setRequestParameters(DescribeDeployedApiResponseBodyRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyRequestParameters getRequestParameters() {
        return this.requestParameters;
    }

    public DescribeDeployedApiResponseBody setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public DescribeDeployedApiResponseBody setResultDescriptions(DescribeDeployedApiResponseBodyResultDescriptions resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public DescribeDeployedApiResponseBodyResultDescriptions getResultDescriptions() {
        return this.resultDescriptions;
    }

    public DescribeDeployedApiResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeDeployedApiResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeDeployedApiResponseBody setServiceConfig(DescribeDeployedApiResponseBodyServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public DescribeDeployedApiResponseBodyServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    public DescribeDeployedApiResponseBody setServiceParameters(DescribeDeployedApiResponseBodyServiceParameters serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyServiceParameters getServiceParameters() {
        return this.serviceParameters;
    }

    public DescribeDeployedApiResponseBody setServiceParametersMap(DescribeDeployedApiResponseBodyServiceParametersMap serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public DescribeDeployedApiResponseBodyServiceParametersMap getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public DescribeDeployedApiResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeDeployedApiResponseBody setSystemParameters(DescribeDeployedApiResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public DescribeDeployedApiResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public static class DescribeDeployedApiResponseBodyConstantParametersConstantParameter extends TeaModel {
        /**
         * <p>The constant value.</p>
         */
        @NameInMap("ConstantValue")
        public String constantValue;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyConstantParametersConstantParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyConstantParametersConstantParameter self = new DescribeDeployedApiResponseBodyConstantParametersConstantParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyConstantParametersConstantParameter setConstantValue(String constantValue) {
            this.constantValue = constantValue;
            return this;
        }
        public String getConstantValue() {
            return this.constantValue;
        }

        public DescribeDeployedApiResponseBodyConstantParametersConstantParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyConstantParametersConstantParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDeployedApiResponseBodyConstantParametersConstantParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyConstantParameters extends TeaModel {
        @NameInMap("ConstantParameter")
        public java.util.List<DescribeDeployedApiResponseBodyConstantParametersConstantParameter> constantParameter;

        public static DescribeDeployedApiResponseBodyConstantParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyConstantParameters self = new DescribeDeployedApiResponseBodyConstantParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyConstantParameters setConstantParameter(java.util.List<DescribeDeployedApiResponseBodyConstantParametersConstantParameter> constantParameter) {
            this.constantParameter = constantParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyConstantParametersConstantParameter> getConstantParameter() {
            return this.constantParameter;
        }

    }

    public static class DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter extends TeaModel {
        /**
         * <p>Example</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the custom system parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The name of the corresponding backend parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter self = new DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyCustomSystemParameters extends TeaModel {
        @NameInMap("CustomSystemParameter")
        public java.util.List<DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter;

        public static DescribeDeployedApiResponseBodyCustomSystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyCustomSystemParameters self = new DescribeDeployedApiResponseBodyCustomSystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyCustomSystemParameters setCustomSystemParameter(java.util.List<DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter) {
            this.customSystemParameter = customSystemParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyCustomSystemParametersCustomSystemParameter> getCustomSystemParameter() {
            return this.customSystemParameter;
        }

    }

    public static class DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample self = new DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeDeployedApiResponseBodyErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        public java.util.List<DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample;

        public static DescribeDeployedApiResponseBodyErrorCodeSamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyErrorCodeSamples self = new DescribeDeployedApiResponseBodyErrorCodeSamples();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyErrorCodeSamples setErrorCodeSample(java.util.List<DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample) {
            this.errorCodeSample = errorCodeSample;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

    }

    public static class DescribeDeployedApiResponseBodyOpenIdConnectConfig extends TeaModel {
        /**
         * <p>The name of the parameter that corresponds to the token.</p>
         */
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        /**
         * <p>The configuration of OpenID Connect authentication. Valid values:</p>
         * <br>
         * <p>*   **IDTOKEN: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.**</p>
         * <p>*   **BUSINESS: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.</p>
         */
        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        /**
         * <p>The public key of the API.</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <p>The ID of the public key.</p>
         */
        @NameInMap("PublicKeyId")
        public String publicKeyId;

        public static DescribeDeployedApiResponseBodyOpenIdConnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyOpenIdConnectConfig self = new DescribeDeployedApiResponseBodyOpenIdConnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyOpenIdConnectConfig setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
            return this;
        }
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        public DescribeDeployedApiResponseBodyOpenIdConnectConfig setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
            return this;
        }
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        public DescribeDeployedApiResponseBodyOpenIdConnectConfig setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public DescribeDeployedApiResponseBodyOpenIdConnectConfig setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestConfig extends TeaModel {
        /**
         * <p>This parameter takes effect only when the RequestMode parameter is set to MAPPING.</p>
         * <br>
         * <p>The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.</p>
         */
        @NameInMap("BodyFormat")
        public String bodyFormat;

        /**
         * <p>The body model.</p>
         */
        @NameInMap("BodyModel")
        public String bodyModel;

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
         * <p>The API request path. If the complete API URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the API request path is ` /object/add  `.</p>
         */
        @NameInMap("RequestPath")
        public String requestPath;

        /**
         * <p>The protocol type supported by the API. Valid values: HTTP, HTTPS, and WebSocket. Separate multiple values with commas (,), such as "HTTP,HTTPS".</p>
         */
        @NameInMap("RequestProtocol")
        public String requestProtocol;

        public static DescribeDeployedApiResponseBodyRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestConfig self = new DescribeDeployedApiResponseBodyRequestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestConfig setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setBodyModel(String bodyModel) {
            this.bodyModel = bodyModel;
            return this;
        }
        public String getBodyModel() {
            return this.bodyModel;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setRequestMode(String requestMode) {
            this.requestMode = requestMode;
            return this;
        }
        public String getRequestMode() {
            return this.requestMode;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeDeployedApiResponseBodyRequestConfig setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestParametersRequestParameter extends TeaModel {
        /**
         * <p>The name of the API parameter.</p>
         */
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        /**
         * <p>The type of the array element.</p>
         */
        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        /**
         * <p>The default value.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Example</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The order in the document.</p>
         */
        @NameInMap("DocOrder")
        public Integer docOrder;

        /**
         * <p>Specifies whether the document is public. Valid values: PUBLIC and PRIVATE.</p>
         */
        @NameInMap("DocShow")
        public String docShow;

        /**
         * <p>The hash values that can be entered when ParameterType is set to Int, Long, Float, Double, or String. Separate different values with commas (,), such as 1,2,3,4,9 or A,B,C,E,F.</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>JSON scheme</p>
         */
        @NameInMap("JsonScheme")
        public String jsonScheme;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The maximum parameter length when ParameterType is set to String.</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The maximum parameter value when ParameterType is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The minimum parameter length when ParameterType is set to String.</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>The minimum parameter value when ParameterType is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The type of a request parameter. Valid values: String, Int, Long, Float, Double, and Boolean.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The regular expression used for parameter validation when ParameterType is set to String.</p>
         */
        @NameInMap("RegularExpression")
        public String regularExpression;

        /**
         * <p>Indicates whether the parameter is required. Valid values: REQUIRED and OPTIONAL.</p>
         */
        @NameInMap("Required")
        public String required;

        public static DescribeDeployedApiResponseBodyRequestParametersRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestParametersRequestParameter self = new DescribeDeployedApiResponseBodyRequestParametersRequestParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public Integer getDocOrder() {
            return this.docOrder;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeDeployedApiResponseBodyRequestParametersRequestParameter setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestParameters extends TeaModel {
        @NameInMap("RequestParameter")
        public java.util.List<DescribeDeployedApiResponseBodyRequestParametersRequestParameter> requestParameter;

        public static DescribeDeployedApiResponseBodyRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestParameters self = new DescribeDeployedApiResponseBodyRequestParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestParameters setRequestParameter(java.util.List<DescribeDeployedApiResponseBodyRequestParametersRequestParameter> requestParameter) {
            this.requestParameter = requestParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyRequestParametersRequestParameter> getRequestParameter() {
            return this.requestParameter;
        }

    }

    public static class DescribeDeployedApiResponseBodyResultDescriptionsResultDescription extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("HasChild")
        public Boolean hasChild;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        /**
         * <p>Specifies whether the parameter is required.</p>
         */
        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Type")
        public String type;

        public static DescribeDeployedApiResponseBodyResultDescriptionsResultDescription build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyResultDescriptionsResultDescription self = new DescribeDeployedApiResponseBodyResultDescriptionsResultDescription();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setHasChild(Boolean hasChild) {
            this.hasChild = hasChild;
            return this;
        }
        public Boolean getHasChild() {
            return this.hasChild;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeDeployedApiResponseBodyResultDescriptionsResultDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDeployedApiResponseBodyResultDescriptions extends TeaModel {
        @NameInMap("ResultDescription")
        public java.util.List<DescribeDeployedApiResponseBodyResultDescriptionsResultDescription> resultDescription;

        public static DescribeDeployedApiResponseBodyResultDescriptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyResultDescriptions self = new DescribeDeployedApiResponseBodyResultDescriptions();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyResultDescriptions setResultDescription(java.util.List<DescribeDeployedApiResponseBodyResultDescriptionsResultDescription> resultDescription) {
            this.resultDescription = resultDescription;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyResultDescriptionsResultDescription> getResultDescription() {
            return this.resultDescription;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig extends TeaModel {
        /**
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <br>
         * <p>*   **DEFAULT: the default header type in API Gateway.**</p>
         * <p>*   **CUSTOM: a custom header type.**</p>
         * <p>*   **CLIENT: the ContentType header type of the client.</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The root path of Function Compute.</p>
         */
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        /**
         * <p>The type of the Function Compute instance.</p>
         */
        @NameInMap("FcType")
        public String fcType;

        /**
         * <p>The function name defined in Function Compute.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The request method.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The backend only receives the service path.</p>
         */
        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        /**
         * <p>The API request path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The alias of the function.</p>
         */
        @NameInMap("Qualifier")
        public String qualifier;

        /**
         * <p>The region where the API is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The service name defined in Function Compute.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig self = new DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setFcBaseUrl(String fcBaseUrl) {
            this.fcBaseUrl = fcBaseUrl;
            return this;
        }
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setFcType(String fcType) {
            this.fcType = fcType;
            return this;
        }
        public String getFcType() {
            return this.fcType;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setOnlyBusinessPath(Boolean onlyBusinessPath) {
            this.onlyBusinessPath = onlyBusinessPath;
            return this;
        }
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader extends TeaModel {
        /**
         * <p>The name of the HTTP header parameter.</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The value of the HTTP header parameter.</p>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader self = new DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceConfigMockHeaders extends TeaModel {
        @NameInMap("MockHeader")
        public java.util.List<DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader> mockHeader;

        public static DescribeDeployedApiResponseBodyServiceConfigMockHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceConfigMockHeaders self = new DescribeDeployedApiResponseBodyServiceConfigMockHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceConfigMockHeaders setMockHeader(java.util.List<DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader> mockHeader) {
            this.mockHeader = mockHeader;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyServiceConfigMockHeadersMockHeader> getMockHeader() {
            return this.mockHeader;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceConfigVpcConfig extends TeaModel {
        /**
         * <p>The IDs of the ELB and SLB instances in the VPC.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC access authorization.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port number that corresponds to the instance.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDeployedApiResponseBodyServiceConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceConfigVpcConfig self = new DescribeDeployedApiResponseBodyServiceConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceConfig extends TeaModel {
        /**
         * <p>Backend configuration items when the backend service is Function Compute</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>Specifies whether to enable the Mock mode. Valid values:</p>
         * <br>
         * <p>*   **TRUE: The Mock mode is enabled.**</p>
         * <p>*   **FALSE: The Mock mode is not enabled.</p>
         */
        @NameInMap("Mock")
        public String mock;

        /**
         * <p>The simulated Headers.</p>
         */
        @NameInMap("MockHeaders")
        public DescribeDeployedApiResponseBodyServiceConfigMockHeaders mockHeaders;

        /**
         * <p>The result returned when the Mock mode is enabled.</p>
         */
        @NameInMap("MockResult")
        public String mockResult;

        /**
         * <p>The status code returned for service mocking.</p>
         */
        @NameInMap("MockStatusCode")
        public Integer mockStatusCode;

        /**
         * <p>The URL used to call the back-end service. If the complete back-end service URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the value of ServiceAddress is **http://api.a.com:8080**.``</p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         */
        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The backend service protocol. Currently, only HTTP, HTTPS, and FunctionCompute are supported.</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The timeout period of the backend service, in millisecond.</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>Specifies whether to enable the VPC channel. Valid values:</p>
         * <br>
         * <p>*   **TRUE**: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.</p>
         * <p>*   **FALSE**: The VPC channel is not enabled.</p>
         */
        @NameInMap("ServiceVpcEnable")
        public String serviceVpcEnable;

        /**
         * <p>Configuration items related to VPC channels</p>
         */
        @NameInMap("VpcConfig")
        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig vpcConfig;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDeployedApiResponseBodyServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceConfig self = new DescribeDeployedApiResponseBodyServiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceConfig setFunctionComputeConfig(DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }
        public DescribeDeployedApiResponseBodyServiceConfigFunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setMock(String mock) {
            this.mock = mock;
            return this;
        }
        public String getMock() {
            return this.mock;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setMockHeaders(DescribeDeployedApiResponseBodyServiceConfigMockHeaders mockHeaders) {
            this.mockHeaders = mockHeaders;
            return this;
        }
        public DescribeDeployedApiResponseBodyServiceConfigMockHeaders getMockHeaders() {
            return this.mockHeaders;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setMockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }
        public String getMockResult() {
            return this.mockResult;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setMockStatusCode(Integer mockStatusCode) {
            this.mockStatusCode = mockStatusCode;
            return this;
        }
        public Integer getMockStatusCode() {
            return this.mockStatusCode;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServiceHttpMethod(String serviceHttpMethod) {
            this.serviceHttpMethod = serviceHttpMethod;
            return this;
        }
        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setServiceVpcEnable(String serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
            return this;
        }
        public String getServiceVpcEnable() {
            return this.serviceVpcEnable;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setVpcConfig(DescribeDeployedApiResponseBodyServiceConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeDeployedApiResponseBodyServiceConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public DescribeDeployedApiResponseBodyServiceConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceParametersServiceParameter extends TeaModel {
        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The data type of the back-end service parameter.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyServiceParametersServiceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceParametersServiceParameter self = new DescribeDeployedApiResponseBodyServiceParametersServiceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceParametersServiceParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDeployedApiResponseBodyServiceParametersServiceParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeDeployedApiResponseBodyServiceParametersServiceParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceParameters extends TeaModel {
        @NameInMap("ServiceParameter")
        public java.util.List<DescribeDeployedApiResponseBodyServiceParametersServiceParameter> serviceParameter;

        public static DescribeDeployedApiResponseBodyServiceParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceParameters self = new DescribeDeployedApiResponseBodyServiceParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceParameters setServiceParameter(java.util.List<DescribeDeployedApiResponseBodyServiceParametersServiceParameter> serviceParameter) {
            this.serviceParameter = serviceParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyServiceParametersServiceParameter> getServiceParameter() {
            return this.serviceParameter;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap extends TeaModel {
        /**
         * <p>The name of the front-end input parameter.</p>
         */
        @NameInMap("RequestParameterName")
        public String requestParameterName;

        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap self = new DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap setRequestParameterName(String requestParameterName) {
            this.requestParameterName = requestParameterName;
            return this;
        }
        public String getRequestParameterName() {
            return this.requestParameterName;
        }

        public DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyServiceParametersMap extends TeaModel {
        @NameInMap("ServiceParameterMap")
        public java.util.List<DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap;

        public static DescribeDeployedApiResponseBodyServiceParametersMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyServiceParametersMap self = new DescribeDeployedApiResponseBodyServiceParametersMap();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyServiceParametersMap setServiceParameterMap(java.util.List<DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap) {
            this.serviceParameterMap = serviceParameterMap;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyServiceParametersMapServiceParameterMap> getServiceParameterMap() {
            return this.serviceParameterMap;
        }

    }

    public static class DescribeDeployedApiResponseBodySystemParametersSystemParameter extends TeaModel {
        /**
         * <p>Examples</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The name of the corresponding backend parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodySystemParametersSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodySystemParametersSystemParameter self = new DescribeDeployedApiResponseBodySystemParametersSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodySystemParametersSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodySystemParametersSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodySystemParametersSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeDeployedApiResponseBodySystemParametersSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeDeployedApiResponseBodySystemParametersSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodySystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        public java.util.List<DescribeDeployedApiResponseBodySystemParametersSystemParameter> systemParameter;

        public static DescribeDeployedApiResponseBodySystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodySystemParameters self = new DescribeDeployedApiResponseBodySystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodySystemParameters setSystemParameter(java.util.List<DescribeDeployedApiResponseBodySystemParametersSystemParameter> systemParameter) {
            this.systemParameter = systemParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodySystemParametersSystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

    }

}
