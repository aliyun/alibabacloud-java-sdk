// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoryResponseBody extends TeaModel {
    /**
     * <p>The signature algorithm that is used if the **AuthType** parameter is set to **APP**. If no value is specified for the AllowSignatureMethod parameter, the default value HmacSHA256 is used. Valid values:</p>
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
     * <p>The name of the API.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The type of AppCode authentication. Default value: DEFAULT. Valid values:</p>
     * <br>
     * <p>*   DEFAULT: AppCode authentication is supported after the API is published in Alibaba Cloud Marketplace.</p>
     * <p>*   DISABLE: AppCode authentication is not supported.</p>
     * <p>*   HEADER: AppCode authentication is supported only in Header parameters.</p>
     * <p>*   HEADER_QUERY: AppCode authentication is supported in Header or Query parameters.</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The type of the security authentication that is used for the API. Valid values:</p>
     * <br>
     * <p>*   **APP**: The API can be called only by authorized applications.</p>
     * <br>
     * <p>*   **ANONYMOUS**: The API can be anonymously called. Take note of the following information:</p>
     * <br>
     * <p>    *   All users who have obtained the API service information can call this API. API Gateway neither authenticates callers nor sets user-specific throttling policies. If this API is a public one, you must set throttling policies for it.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The configuration items of the backend service.</p>
     */
    @NameInMap("BackendConfig")
    public DescribeApiHistoryResponseBodyBackendConfig backendConfig;

    /**
     * <p>Indicates whether the backend service is enabled.</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>The constant parameters.</p>
     */
    @NameInMap("ConstantParameters")
    public DescribeApiHistoryResponseBodyConstantParameters constantParameters;

    /**
     * <p>The custom system parameters.</p>
     */
    @NameInMap("CustomSystemParameters")
    public DescribeApiHistoryResponseBodyCustomSystemParameters customSystemParameters;

    /**
     * <p>The time when the API was published. The time is displayed in UTC.</p>
     */
    @NameInMap("DeployedTime")
    public String deployedTime;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>*   If the **DisableInternet** parameter is set to **true**, you call the API only over internal networks.</p>
     * <p>*   If the **DisableInternet** parameter is set to **false**, no limit is imposed on networks. When you create an API, the default value of this parameter is false.</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes that are returned from the backend service.</p>
     * <br>
     * <p>For more information, see [ErrorCodeSample](~~44392~~).</p>
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeApiHistoryResponseBodyErrorCodeSamples errorCodeSamples;

    /**
     * <p>The sample error response that is returned from the backend service.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   Indicates whether to forcefully check X-Ca-Nonce. X-Ca-Nonce is the unique identifier of a request and is generally identified by UUID. If the **ForceNonceCheck** parameter is set to **true**, X-Ca-Nonce is forcefully checked. After API Gateway receives this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps defend against replay attacks.</p>
     * <p>*   If the **ForceNonceCheck** parameter is set to **false**, X-Ca-Nonce is not checked. When you create an API, the default value of this parameter is false.</p>
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
     * <p>The historical version number of the API.</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    /**
     * <p>The configuration items of third-party OpenID Connect authentication.</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public DescribeApiHistoryResponseBodyOpenIdConnectConfig openIdConnectConfig;

    /**
     * <p>The ID of the region where the API is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration items of API requests that are sent from the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestConfig](~~43985~~).</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiHistoryResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters of API requests that are sent from the consumer to API Gateway.</p>
     * <br>
     * <p>For more information, see [RequestParameter](~~43986~~).</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiHistoryResponseBodyRequestParameters requestParameters;

    /**
     * <p>The response of the API.</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>The descriptions that are returned for the API.</p>
     */
    @NameInMap("ResultDescriptions")
    public DescribeApiHistoryResponseBodyResultDescriptions resultDescriptions;

    /**
     * <p>The sample response.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The type of data that is returned.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The information about backend service calls.</p>
     */
    @NameInMap("ServiceConfig")
    public DescribeApiHistoryResponseBodyServiceConfig serviceConfig;

    /**
     * <p>The parameters of API requests that are sent from API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameter](~~43988~~).</p>
     */
    @NameInMap("ServiceParameters")
    public DescribeApiHistoryResponseBodyServiceParameters serviceParameters;

    /**
     * <p>The mappings between the parameters of requests sent from the consumer to API Gateway and the parameters of requests sent from API Gateway to the backend service.</p>
     * <br>
     * <p>For more information, see [ServiceParameterMap](~~43989~~).</p>
     */
    @NameInMap("ServiceParametersMap")
    public DescribeApiHistoryResponseBodyServiceParametersMap serviceParametersMap;

    /**
     * <p>The environment to which the API is published. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**: production environment</p>
     * <p>*   **PRE**: staging environment</p>
     * <p>*   **TEST**: test environment</p>
     */
    @NameInMap("StageName")
    public String stageName;

    @NameInMap("Status")
    public String status;

    /**
     * <p>The system parameters of the API in the JSON format.</p>
     */
    @NameInMap("SystemParameters")
    public DescribeApiHistoryResponseBodySystemParameters systemParameters;

    /**
     * <p>Indicates whether the API is public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: The API is public. If you publish the definition of a public API to the production environment, the definition is displayed on the APIs page for all users.</p>
     * <p>*   **PRIVATE**: The API is private. If you publish an API group that contains a private API in Alibaba Cloud Marketplace, the API is not displayed in Alibaba Cloud Marketplace.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The type of the API that is used in bidirectional communication. Valid values:</p>
     * <br>
     * <p>*   **COMMON**: common API</p>
     * <p>*   **REGISTER**: registered API</p>
     * <p>*   **UNREGISTER**: unregistered API</p>
     * <p>*   **NOTIFY**: downstream notification API</p>
     */
    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    public static DescribeApiHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoryResponseBody self = new DescribeApiHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoryResponseBody setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public DescribeApiHistoryResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiHistoryResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApiHistoryResponseBody setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public DescribeApiHistoryResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeApiHistoryResponseBody setBackendConfig(DescribeApiHistoryResponseBodyBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public DescribeApiHistoryResponseBody setBackendEnable(Boolean backendEnable) {
        this.backendEnable = backendEnable;
        return this;
    }
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    public DescribeApiHistoryResponseBody setConstantParameters(DescribeApiHistoryResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeApiHistoryResponseBody setCustomSystemParameters(DescribeApiHistoryResponseBodyCustomSystemParameters customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyCustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    public DescribeApiHistoryResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
    }

    public DescribeApiHistoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiHistoryResponseBody setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public DescribeApiHistoryResponseBody setErrorCodeSamples(DescribeApiHistoryResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeApiHistoryResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeApiHistoryResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeApiHistoryResponseBody setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public DescribeApiHistoryResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiHistoryResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiHistoryResponseBody setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public DescribeApiHistoryResponseBody setOpenIdConnectConfig(DescribeApiHistoryResponseBodyOpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyOpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public DescribeApiHistoryResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiHistoryResponseBody setRequestConfig(DescribeApiHistoryResponseBodyRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyRequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public DescribeApiHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiHistoryResponseBody setRequestParameters(DescribeApiHistoryResponseBodyRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyRequestParameters getRequestParameters() {
        return this.requestParameters;
    }

    public DescribeApiHistoryResponseBody setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public DescribeApiHistoryResponseBody setResultDescriptions(DescribeApiHistoryResponseBodyResultDescriptions resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public DescribeApiHistoryResponseBodyResultDescriptions getResultDescriptions() {
        return this.resultDescriptions;
    }

    public DescribeApiHistoryResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeApiHistoryResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeApiHistoryResponseBody setServiceConfig(DescribeApiHistoryResponseBodyServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    public DescribeApiHistoryResponseBody setServiceParameters(DescribeApiHistoryResponseBodyServiceParameters serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyServiceParameters getServiceParameters() {
        return this.serviceParameters;
    }

    public DescribeApiHistoryResponseBody setServiceParametersMap(DescribeApiHistoryResponseBodyServiceParametersMap serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public DescribeApiHistoryResponseBodyServiceParametersMap getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public DescribeApiHistoryResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiHistoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiHistoryResponseBody setSystemParameters(DescribeApiHistoryResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public DescribeApiHistoryResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public DescribeApiHistoryResponseBody setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public static class DescribeApiHistoryResponseBodyBackendConfig extends TeaModel {
        /**
         * <p>The ID of the backend service.</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The name of the backend service.</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>The type of the backend service.</p>
         */
        @NameInMap("BackendType")
        public String backendType;

        public static DescribeApiHistoryResponseBodyBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyBackendConfig self = new DescribeApiHistoryResponseBodyBackendConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyBackendConfig setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeApiHistoryResponseBodyBackendConfig setBackendName(String backendName) {
            this.backendName = backendName;
            return this;
        }
        public String getBackendName() {
            return this.backendName;
        }

        public DescribeApiHistoryResponseBodyBackendConfig setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

    }

    public static class DescribeApiHistoryResponseBodyConstantParametersConstantParameter extends TeaModel {
        /**
         * <p>The value of the constant parameter.</p>
         */
        @NameInMap("ConstantValue")
        public String constantValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The location of the parameter. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the backend parameter that corresponds to the constant parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiHistoryResponseBodyConstantParametersConstantParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyConstantParametersConstantParameter self = new DescribeApiHistoryResponseBodyConstantParametersConstantParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyConstantParametersConstantParameter setConstantValue(String constantValue) {
            this.constantValue = constantValue;
            return this;
        }
        public String getConstantValue() {
            return this.constantValue;
        }

        public DescribeApiHistoryResponseBodyConstantParametersConstantParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyConstantParametersConstantParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiHistoryResponseBodyConstantParametersConstantParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiHistoryResponseBodyConstantParameters extends TeaModel {
        @NameInMap("ConstantParameter")
        public java.util.List<DescribeApiHistoryResponseBodyConstantParametersConstantParameter> constantParameter;

        public static DescribeApiHistoryResponseBodyConstantParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyConstantParameters self = new DescribeApiHistoryResponseBodyConstantParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyConstantParameters setConstantParameter(java.util.List<DescribeApiHistoryResponseBodyConstantParametersConstantParameter> constantParameter) {
            this.constantParameter = constantParameter;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyConstantParametersConstantParameter> getConstantParameter() {
            return this.constantParameter;
        }

    }

    public static class DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter extends TeaModel {
        /**
         * <p>The sample value of the parameter.</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The location of the parameter. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The name of the backend parameter that corresponds to the custom system parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter self = new DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiHistoryResponseBodyCustomSystemParameters extends TeaModel {
        @NameInMap("CustomSystemParameter")
        public java.util.List<DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter;

        public static DescribeApiHistoryResponseBodyCustomSystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyCustomSystemParameters self = new DescribeApiHistoryResponseBodyCustomSystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyCustomSystemParameters setCustomSystemParameter(java.util.List<DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter) {
            this.customSystemParameter = customSystemParameter;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter> getCustomSystemParameter() {
            return this.customSystemParameter;
        }

    }

    public static class DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
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

        public static DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample self = new DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeApiHistoryResponseBodyErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        public java.util.List<DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample;

        public static DescribeApiHistoryResponseBodyErrorCodeSamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyErrorCodeSamples self = new DescribeApiHistoryResponseBodyErrorCodeSamples();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyErrorCodeSamples setErrorCodeSample(java.util.List<DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample) {
            this.errorCodeSample = errorCodeSample;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

    }

    public static class DescribeApiHistoryResponseBodyOpenIdConnectConfig extends TeaModel {
        /**
         * <p>The name of the parameter that corresponds to the token.</p>
         */
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        /**
         * <p>*   ****</p>
         * <p>*   ****</p>
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

        public static DescribeApiHistoryResponseBodyOpenIdConnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyOpenIdConnectConfig self = new DescribeApiHistoryResponseBodyOpenIdConnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
            return this;
        }
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
            return this;
        }
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

    }

    public static class DescribeApiHistoryResponseBodyRequestConfig extends TeaModel {
        /**
         * <p>The format in which data was transmitted to the server for a POST or PUT request. Valid values: FORM and STREAM. FORM indicates that data was transmitted as forms that consist of key-value pairs. STREAM indicates that data was transmitted as byte streams. This parameter takes effect when the RequestMode parameter is set to MAPPING.</p>
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
         * <p>The HTTP request method. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         */
        @NameInMap("RequestHttpMethod")
        public String requestHttpMethod;

        /**
         * <p>The request mode of the parameters. Valid values:</p>
         * <br>
         * <p>*   MAPPING: Parameters are mapped. Unknown parameters are filtered out.</p>
         * <p>*   PASSTHROUGH: Parameters are passed through.</p>
         * <p>*   MAPPING_PASSTHROUGH: Parameters are mapped. Unknown parameters are passed through.</p>
         */
        @NameInMap("RequestMode")
        public String requestMode;

        /**
         * <p>The request path of the API.</p>
         */
        @NameInMap("RequestPath")
        public String requestPath;

        /**
         * <p>The type of the protocol that is supported by the API. Valid values: HTTP, HTTPS, and WebSocket. Separate multiple values with commas (,). Example: "HTTP,HTTPS".</p>
         */
        @NameInMap("RequestProtocol")
        public String requestProtocol;

        public static DescribeApiHistoryResponseBodyRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyRequestConfig self = new DescribeApiHistoryResponseBodyRequestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyRequestConfig setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setBodyModel(String bodyModel) {
            this.bodyModel = bodyModel;
            return this;
        }
        public String getBodyModel() {
            return this.bodyModel;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestMode(String requestMode) {
            this.requestMode = requestMode;
            return this;
        }
        public String getRequestMode() {
            return this.requestMode;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

    }

    public static class DescribeApiHistoryResponseBodyRequestParametersRequestParameter extends TeaModel {
        /**
         * <p>The name of the parameter in the API request.</p>
         */
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        /**
         * <p>The type of the array element.</p>
         */
        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        /**
         * <p>The default value of the parameter.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value of the parameter.</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The order in which the parameter is sorted in the document.</p>
         */
        @NameInMap("DocOrder")
        public Integer docOrder;

        /**
         * <p>Indicates whether the document is public. Valid values: **PUBLIC** and **PRIVATE**.</p>
         */
        @NameInMap("DocShow")
        public String docShow;

        /**
         * <p>The hash values can be specified if the **ParameterType** parameter is set to Int, Long, Float, Double, or String. Separate multiple hash values with commas (,). Examples: 1,2,3,4,9 and A,B,C,E,F.</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The JSON scheme.</p>
         */
        @NameInMap("JsonScheme")
        public String jsonScheme;

        /**
         * <p>The location of the parameter. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The maximum length of the parameter value if the **ParameterType** parameter is set to String.</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The maximum value of the parameter if the **ParameterType** parameter is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The minimum length of the parameter value if the **ParameterType** parameter is set to String.</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>The minimum value of the parameter if the **ParameterType** parameter is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The data type of the parameter. Valid values: String, Int, Long, Float, Double, and Boolean.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The regular expression that is used to validate the parameter if the **ParameterType** parameter is set to String.</p>
         */
        @NameInMap("RegularExpression")
        public String regularExpression;

        /**
         * <p>Indicates whether the parameter is required. Valid values: **REQUIRED** and **OPTIONAL**.</p>
         */
        @NameInMap("Required")
        public String required;

        public static DescribeApiHistoryResponseBodyRequestParametersRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyRequestParametersRequestParameter self = new DescribeApiHistoryResponseBodyRequestParametersRequestParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public Integer getDocOrder() {
            return this.docOrder;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiHistoryResponseBodyRequestParameters extends TeaModel {
        @NameInMap("RequestParameter")
        public java.util.List<DescribeApiHistoryResponseBodyRequestParametersRequestParameter> requestParameter;

        public static DescribeApiHistoryResponseBodyRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyRequestParameters self = new DescribeApiHistoryResponseBodyRequestParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyRequestParameters setRequestParameter(java.util.List<DescribeApiHistoryResponseBodyRequestParametersRequestParameter> requestParameter) {
            this.requestParameter = requestParameter;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyRequestParametersRequestParameter> getRequestParameter() {
            return this.requestParameter;
        }

    }

    public static class DescribeApiHistoryResponseBodyResultDescriptionsResultDescription extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether a subnode exists.</p>
         */
        @NameInMap("HasChild")
        public Boolean hasChild;

        /**
         * <p>The ID of the result.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The primary key of the result.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("Mandatory")
        public Boolean mandatory;

        /**
         * <p>The name of the result.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent node.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The type of the result.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeApiHistoryResponseBodyResultDescriptionsResultDescription build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyResultDescriptionsResultDescription self = new DescribeApiHistoryResponseBodyResultDescriptionsResultDescription();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setHasChild(Boolean hasChild) {
            this.hasChild = hasChild;
            return this;
        }
        public Boolean getHasChild() {
            return this.hasChild;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApiHistoryResponseBodyResultDescriptions extends TeaModel {
        @NameInMap("ResultDescription")
        public java.util.List<DescribeApiHistoryResponseBodyResultDescriptionsResultDescription> resultDescription;

        public static DescribeApiHistoryResponseBodyResultDescriptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyResultDescriptions self = new DescribeApiHistoryResponseBodyResultDescriptions();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyResultDescriptions setResultDescription(java.util.List<DescribeApiHistoryResponseBodyResultDescriptionsResultDescription> resultDescription) {
            this.resultDescription = resultDescription;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyResultDescriptionsResultDescription> getResultDescription() {
            return this.resultDescription;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig extends TeaModel {
        /**
         * <p>The ID of the region where EventBridge is deployed.</p>
         */
        @NameInMap("EventBridgeRegionId")
        public String eventBridgeRegionId;

        /**
         * <p>The event bus.</p>
         */
        @NameInMap("EventBus")
        public String eventBus;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The ARN of the RAM role that is assigned to EventBridge.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig self = new DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig setEventBridgeRegionId(String eventBridgeRegionId) {
            this.eventBridgeRegionId = eventBridgeRegionId;
            return this;
        }
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig setEventBus(String eventBus) {
            this.eventBus = eventBus;
            return this;
        }
        public String getEventBus() {
            return this.eventBus;
        }

        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig extends TeaModel {
        /**
         * <p>The ContentType header that is used if the ServiceProtocol parameter is set to HTTP. Valid values:</p>
         * <br>
         * <p>*   **DEFAULT**: the default header in API Gateway</p>
         * <p>*   **CUSTOM**: a custom header</p>
         * <p>*   **CLIENT**: the ContentType header of the client</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header if the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The root path of the service in Function Compute.</p>
         */
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        /**
         * <p>The type of the service in Function Compute.</p>
         */
        @NameInMap("FcType")
        public String fcType;

        /**
         * <p>The function name that is defined in Function Compute.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The request method.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>Indicates whether the backend receives only the service path.</p>
         */
        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        /**
         * <p>The path of the API request.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The alias of the function.</p>
         */
        @NameInMap("Qualifier")
        public String qualifier;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by API Gateway to access Function Compute.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The service name that is defined in Function Compute.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig self = new DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFcBaseUrl(String fcBaseUrl) {
            this.fcBaseUrl = fcBaseUrl;
            return this;
        }
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFcType(String fcType) {
            this.fcType = fcType;
            return this;
        }
        public String getFcType() {
            return this.fcType;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setOnlyBusinessPath(Boolean onlyBusinessPath) {
            this.onlyBusinessPath = onlyBusinessPath;
            return this;
        }
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader extends TeaModel {
        /**
         * <p>The name of the HTTP header</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The value of the HTTP header.</p>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader self = new DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigMockHeaders extends TeaModel {
        @NameInMap("MockHeader")
        public java.util.List<DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader> mockHeader;

        public static DescribeApiHistoryResponseBodyServiceConfigMockHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigMockHeaders self = new DescribeApiHistoryResponseBodyServiceConfigMockHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders setMockHeader(java.util.List<DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader> mockHeader) {
            this.mockHeader = mockHeader;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader> getMockHeader() {
            return this.mockHeader;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigOssConfig extends TeaModel {
        @NameInMap("Action")
        public String action;

        /**
         * <p>The name of the OSS bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the region where OSS is deployed.</p>
         */
        @NameInMap("OssRegionId")
        public String ossRegionId;

        public static DescribeApiHistoryResponseBodyServiceConfigOssConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigOssConfig self = new DescribeApiHistoryResponseBodyServiceConfigOssConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setOssRegionId(String ossRegionId) {
            this.ossRegionId = ossRegionId;
            return this;
        }
        public String getOssRegionId() {
            return this.ossRegionId;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigVpcConfig extends TeaModel {
        /**
         * <p>The ID of the Elastic Compute Service (ECS) or Server Load Balancer (SLB) instance in the VPC.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC.</p>
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

        /**
         * <p>The protocol of the VPC.</p>
         */
        @NameInMap("VpcScheme")
        public String vpcScheme;

        public static DescribeApiHistoryResponseBodyServiceConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigVpcConfig self = new DescribeApiHistoryResponseBodyServiceConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setVpcScheme(String vpcScheme) {
            this.vpcScheme = vpcScheme;
            return this;
        }
        public String getVpcScheme() {
            return this.vpcScheme;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfig extends TeaModel {
        /**
         * <p>The ContentType header that is used if the ServiceProtocol parameter is set to HTTP. Valid values:</p>
         * <br>
         * <p>*   DEFAULT: the default header in API Gateway</p>
         * <p>*   CUSTOM: a custom header</p>
         * <p>*   CLIENT: the ContentType header of the client</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header if the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The configuration items of EventBridge.</p>
         */
        @NameInMap("EventBridgeConfig")
        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig;

        /**
         * <p>The configuration items of the backend service whose type is Function Compute.</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>Indicates whether the mock mode is enabled. Valid values:</p>
         * <br>
         * <p>*   TRUE</p>
         * <p>*   FALSE</p>
         */
        @NameInMap("Mock")
        public String mock;

        /**
         * <p>The mock headers.</p>
         */
        @NameInMap("MockHeaders")
        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders mockHeaders;

        /**
         * <p>The result that is returned if the Mock parameter is set to TRUE.</p>
         */
        @NameInMap("MockResult")
        public String mockResult;

        /**
         * <p>The status code that is returned for service mocking.</p>
         */
        @NameInMap("MockStatusCode")
        public Integer mockStatusCode;

        /**
         * <p>The configuration items of the backend service whose type is Object Storage Service (OSS).</p>
         */
        @NameInMap("OssConfig")
        public DescribeApiHistoryResponseBodyServiceConfigOssConfig ossConfig;

        /**
         * <p>The URL that is used to call the backend service.</p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The HTTP request method that is used if the ServiceProtocol parameter is set to HTTP. Valid values: PUT, GET, POST, DELETE, PATCH, HEAD, OPTIONS, and ANY.</p>
         */
        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        /**
         * <p>The path that is used when the backend service is called.</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The protocol of the backend service. Only HTTP, HTTPS, and Function Compute are supported.</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The timeout period of the backend service. Unit: milliseconds.</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>Indicates whether the VPC channel is enabled. Valid values:</p>
         * <br>
         * <p>*   TRUE</p>
         * <p>*   FALSE</p>
         * <br>
         * <p>Before you can enable the VPC channel, make sure that a VPC authorization is added.</p>
         */
        @NameInMap("ServiceVpcEnable")
        public String serviceVpcEnable;

        /**
         * <p>The configuration items of the VPC channel.</p>
         */
        @NameInMap("VpcConfig")
        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig vpcConfig;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeApiHistoryResponseBodyServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfig self = new DescribeApiHistoryResponseBodyServiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setEventBridgeConfig(DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig) {
            this.eventBridgeConfig = eventBridgeConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setFunctionComputeConfig(DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMock(String mock) {
            this.mock = mock;
            return this;
        }
        public String getMock() {
            return this.mock;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockHeaders(DescribeApiHistoryResponseBodyServiceConfigMockHeaders mockHeaders) {
            this.mockHeaders = mockHeaders;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders getMockHeaders() {
            return this.mockHeaders;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }
        public String getMockResult() {
            return this.mockResult;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockStatusCode(Integer mockStatusCode) {
            this.mockStatusCode = mockStatusCode;
            return this;
        }
        public Integer getMockStatusCode() {
            return this.mockStatusCode;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setOssConfig(DescribeApiHistoryResponseBodyServiceConfigOssConfig ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigOssConfig getOssConfig() {
            return this.ossConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceHttpMethod(String serviceHttpMethod) {
            this.serviceHttpMethod = serviceHttpMethod;
            return this;
        }
        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceVpcEnable(String serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
            return this;
        }
        public String getServiceVpcEnable() {
            return this.serviceVpcEnable;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setVpcConfig(DescribeApiHistoryResponseBodyServiceConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceParametersServiceParameter extends TeaModel {
        /**
         * <p>The location of the parameter. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The data type of the parameter. Valid values: STRING, NUMBER, and BOOLEAN.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The name of the backend parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiHistoryResponseBodyServiceParametersServiceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceParametersServiceParameter self = new DescribeApiHistoryResponseBodyServiceParametersServiceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceParametersServiceParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiHistoryResponseBodyServiceParametersServiceParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiHistoryResponseBodyServiceParametersServiceParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceParameters extends TeaModel {
        @NameInMap("ServiceParameter")
        public java.util.List<DescribeApiHistoryResponseBodyServiceParametersServiceParameter> serviceParameter;

        public static DescribeApiHistoryResponseBodyServiceParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceParameters self = new DescribeApiHistoryResponseBodyServiceParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceParameters setServiceParameter(java.util.List<DescribeApiHistoryResponseBodyServiceParametersServiceParameter> serviceParameter) {
            this.serviceParameter = serviceParameter;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyServiceParametersServiceParameter> getServiceParameter() {
            return this.serviceParameter;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap extends TeaModel {
        /**
         * <p>The name of the frontend parameter. The name must be included in RequestParametersObject and match ApiParameterName in RequestParameters.</p>
         */
        @NameInMap("RequestParameterName")
        public String requestParameterName;

        /**
         * <p>The name of the backend parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap self = new DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap setRequestParameterName(String requestParameterName) {
            this.requestParameterName = requestParameterName;
            return this;
        }
        public String getRequestParameterName() {
            return this.requestParameterName;
        }

        public DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceParametersMap extends TeaModel {
        @NameInMap("ServiceParameterMap")
        public java.util.List<DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap;

        public static DescribeApiHistoryResponseBodyServiceParametersMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceParametersMap self = new DescribeApiHistoryResponseBodyServiceParametersMap();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceParametersMap setServiceParameterMap(java.util.List<DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap) {
            this.serviceParameterMap = serviceParameterMap;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodyServiceParametersMapServiceParameterMap> getServiceParameterMap() {
            return this.serviceParameterMap;
        }

    }

    public static class DescribeApiHistoryResponseBodySystemParametersSystemParameter extends TeaModel {
        /**
         * <p>The sample value of the parameter.</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The location of the parameter. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The name of the backend parameter that corresponds to the system parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiHistoryResponseBodySystemParametersSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodySystemParametersSystemParameter self = new DescribeApiHistoryResponseBodySystemParametersSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiHistoryResponseBodySystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        public java.util.List<DescribeApiHistoryResponseBodySystemParametersSystemParameter> systemParameter;

        public static DescribeApiHistoryResponseBodySystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodySystemParameters self = new DescribeApiHistoryResponseBodySystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodySystemParameters setSystemParameter(java.util.List<DescribeApiHistoryResponseBodySystemParametersSystemParameter> systemParameter) {
            this.systemParameter = systemParameter;
            return this;
        }
        public java.util.List<DescribeApiHistoryResponseBodySystemParametersSystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

    }

}
