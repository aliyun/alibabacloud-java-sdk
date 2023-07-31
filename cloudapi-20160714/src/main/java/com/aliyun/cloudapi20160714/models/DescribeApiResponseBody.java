// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiResponseBody extends TeaModel {
    /**
     * <p>The region ID of the API.</p>
     */
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>Specifies whether to enable backend services.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>If **AuthType** is set to **APP**, this value must be passed to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
     * <br>
     * <p>*   HmacSHA256</p>
     * <p>*   HmacSHA1,HmacSHA256</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The last modification time of the API.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the backend service.</p>
     */
    @NameInMap("BackendConfig")
    public DescribeApiResponseBodyBackendConfig backendConfig;

    /**
     * <p>Backend configurations</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>Description</p>
     */
    @NameInMap("ConstantParameters")
    public DescribeApiResponseBodyConstantParameters constantParameters;

    /**
     * <p>The name of the API, which is unique in the group.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Examples</p>
     */
    @NameInMap("CustomSystemParameters")
    public DescribeApiResponseBodyCustomSystemParameters customSystemParameters;

    /**
     * <p>The name of the runtime environment. Valid values: RELEASE and TEST.</p>
     */
    @NameInMap("DeployedInfos")
    public DescribeApiResponseBodyDeployedInfos deployedInfos;

    /**
     * <p>The name of the API group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The returned description of the API.</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>Error codes</p>
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeApiResponseBodyErrorCodeSamples errorCodeSamples;

    /**
     * <p>The security authentication method of the API. Valid values:</p>
     * <br>
     * <p>*   **APP**: Only authorized applications can call the API.</p>
     * <br>
     * <p>*   **ANONYMOUS**: The API can be anonymously called. In this mode, you must take note of the following rules:</p>
     * <br>
     * <p>    *   All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</p>
     * <p>    *   We recommend that you do not make the API whose security authentication method is ANONYMOUS available in Alibaba Cloud Marketplace because API Gateway cannot meter calls on the caller or limit the number of calls on the API. If you want to make the API group to which the API belongs available in Alibaba Cloud Marketplace, we recommend that you move the API to another group, set its type to PRIVATE, or set its security authentication method to APP.</p>
     * <br>
     * <p>*   **APPOPENID**: The OpenID Connect account authentication method is used. Only applications authorized by OpenID Connect can call the API. If this method is selected, the OpenIdConnectConfig parameter is required.</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</p>
     * <p>*   **PRIVATE**: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>Specifies whether to enable the Mock mode. Valid values:</p>
     * <br>
     * <p>*   OPEN: The Mock mode is enabled.</p>
     * <p>*   CLOSED: The Mock mode is not enabled.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The result returned for service mocking.</p>
     */
    @NameInMap("Mock")
    public String mock;

    /**
     * <p>The creation time of the API.</p>
     */
    @NameInMap("MockResult")
    public String mockResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The OpenID Connect mode. Valid values:</p>
     * <br>
     * <p>*   **IDTOKEN**: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.</p>
     * <p>*   **BUSINESS**: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public DescribeApiResponseBodyOpenIdConnectConfig openIdConnectConfig;

    /**
     * <p>Specifies whether to carry the header : X-Ca-Nonce when calling an API. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent reply attacks. Valid values:</p>
     * <br>
     * <p>*   **true**: This field is forcibly checked when an API is requested to prevent replay attacks.</p>
     * <p>*   **false**: This field is not checked.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The body model.</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiResponseBodyRequestConfig requestConfig;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The JSON Schema used for JSON validation when **ParameterType** is set to String.</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiResponseBodyRequestParameters requestParameters;

    /**
     * <p>The sample response from the backend service.</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>If **AuthType** is set to **APP**, the valid values are:</p>
     * <br>
     * <p>*   **DEFAULT**: The default value that is used if no other values are passed. This value means that the setting of the group is used.</p>
     * <p>*   **DISABLE**: The authentication is disabled.</p>
     * <p>*   **HEADER**: AppCode can be placed in the Header parameter for authentication.</p>
     * <p>*   **HEADER_QUERY**: AppCode can be placed in the Header or Query parameter for authentication.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The type of the two-way communication API. Valid values:</p>
     * <br>
     * <p>*   **COMMON**: general APIs</p>
     * <p>*   **REGISTER**: registered APIs</p>
     * <p>*   **UNREGISTER**: unregistered APIs</p>
     * <p>*   **NOTIFY**: downstream notification</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The application name in AONE.</p>
     */
    @NameInMap("ServiceConfig")
    public DescribeApiResponseBodyServiceConfig serviceConfig;

    /**
     * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
     */
    @NameInMap("ServiceParameters")
    public DescribeApiResponseBodyServiceParameters serviceParameters;

    /**
     * <p>The corresponding frontend parameter name. It must be included in RequestParametersObject and matches ApiParameterName in RequestParameter data.</p>
     */
    @NameInMap("ServiceParametersMap")
    public DescribeApiResponseBodyServiceParametersMap serviceParametersMap;

    /**
     * <p>Examples</p>
     */
    @NameInMap("SystemParameters")
    public DescribeApiResponseBodySystemParameters systemParameters;

    /**
     * <p>The sample error response from the backend service.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>Specifies whether to limit API calls to within the VPC. Valid values:</p>
     * <br>
     * <p>*   **true**: Only API calls from the VPC are supported.</p>
     * <p>*   **false**: API calls from the VPC and Internet are both supported.</p>
     */
    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    public static DescribeApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiResponseBody self = new DescribeApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiResponseBody setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public DescribeApiResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApiResponseBody setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public DescribeApiResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeApiResponseBody setBackendConfig(DescribeApiResponseBodyBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public DescribeApiResponseBodyBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public DescribeApiResponseBody setBackendEnable(Boolean backendEnable) {
        this.backendEnable = backendEnable;
        return this;
    }
    public Boolean getBackendEnable() {
        return this.backendEnable;
    }

    public DescribeApiResponseBody setConstantParameters(DescribeApiResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeApiResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeApiResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiResponseBody setCustomSystemParameters(DescribeApiResponseBodyCustomSystemParameters customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
        return this;
    }
    public DescribeApiResponseBodyCustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    public DescribeApiResponseBody setDeployedInfos(DescribeApiResponseBodyDeployedInfos deployedInfos) {
        this.deployedInfos = deployedInfos;
        return this;
    }
    public DescribeApiResponseBodyDeployedInfos getDeployedInfos() {
        return this.deployedInfos;
    }

    public DescribeApiResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiResponseBody setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public DescribeApiResponseBody setErrorCodeSamples(DescribeApiResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeApiResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeApiResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeApiResponseBody setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public DescribeApiResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiResponseBody setMock(String mock) {
        this.mock = mock;
        return this;
    }
    public String getMock() {
        return this.mock;
    }

    public DescribeApiResponseBody setMockResult(String mockResult) {
        this.mockResult = mockResult;
        return this;
    }
    public String getMockResult() {
        return this.mockResult;
    }

    public DescribeApiResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiResponseBody setOpenIdConnectConfig(DescribeApiResponseBodyOpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public DescribeApiResponseBodyOpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public DescribeApiResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiResponseBody setRequestConfig(DescribeApiResponseBodyRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public DescribeApiResponseBodyRequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public DescribeApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiResponseBody setRequestParameters(DescribeApiResponseBodyRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public DescribeApiResponseBodyRequestParameters getRequestParameters() {
        return this.requestParameters;
    }

    public DescribeApiResponseBody setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public DescribeApiResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeApiResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeApiResponseBody setServiceConfig(DescribeApiResponseBodyServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public DescribeApiResponseBodyServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    public DescribeApiResponseBody setServiceParameters(DescribeApiResponseBodyServiceParameters serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public DescribeApiResponseBodyServiceParameters getServiceParameters() {
        return this.serviceParameters;
    }

    public DescribeApiResponseBody setServiceParametersMap(DescribeApiResponseBodyServiceParametersMap serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public DescribeApiResponseBodyServiceParametersMap getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public DescribeApiResponseBody setSystemParameters(DescribeApiResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeApiResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public DescribeApiResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public DescribeApiResponseBody setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public static class DescribeApiResponseBodyBackendConfig extends TeaModel {
        /**
         * <p>Backend service type</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>The name of the backend service.</p>
         */
        @NameInMap("BackendType")
        public String backendType;

        public static DescribeApiResponseBodyBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyBackendConfig self = new DescribeApiResponseBodyBackendConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyBackendConfig setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeApiResponseBodyBackendConfig setBackendName(String backendName) {
            this.backendName = backendName;
            return this;
        }
        public String getBackendName() {
            return this.backendName;
        }

        public DescribeApiResponseBodyBackendConfig setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

    }

    public static class DescribeApiResponseBodyConstantParametersConstantParameter extends TeaModel {
        /**
         * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
         */
        @NameInMap("ConstantValue")
        public String constantValue;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiResponseBodyConstantParametersConstantParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyConstantParametersConstantParameter self = new DescribeApiResponseBodyConstantParametersConstantParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyConstantParametersConstantParameter setConstantValue(String constantValue) {
            this.constantValue = constantValue;
            return this;
        }
        public String getConstantValue() {
            return this.constantValue;
        }

        public DescribeApiResponseBodyConstantParametersConstantParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiResponseBodyConstantParametersConstantParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiResponseBodyConstantParametersConstantParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiResponseBodyConstantParameters extends TeaModel {
        @NameInMap("ConstantParameter")
        public java.util.List<DescribeApiResponseBodyConstantParametersConstantParameter> constantParameter;

        public static DescribeApiResponseBodyConstantParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyConstantParameters self = new DescribeApiResponseBodyConstantParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyConstantParameters setConstantParameter(java.util.List<DescribeApiResponseBodyConstantParametersConstantParameter> constantParameter) {
            this.constantParameter = constantParameter;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyConstantParametersConstantParameter> getConstantParameter() {
            return this.constantParameter;
        }

    }

    public static class DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter extends TeaModel {
        /**
         * <p>Description</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>Client IP Address</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the corresponding backend parameter.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>System parameters sent by API Gateway to the backend service</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter self = new DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiResponseBodyCustomSystemParameters extends TeaModel {
        @NameInMap("CustomSystemParameter")
        public java.util.List<DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter;

        public static DescribeApiResponseBodyCustomSystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyCustomSystemParameters self = new DescribeApiResponseBodyCustomSystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyCustomSystemParameters setCustomSystemParameter(java.util.List<DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter) {
            this.customSystemParameter = customSystemParameter;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyCustomSystemParametersCustomSystemParameter> getCustomSystemParameter() {
            return this.customSystemParameter;
        }

    }

    public static class DescribeApiResponseBodyDeployedInfosDeployedInfo extends TeaModel {
        /**
         * <p>auditing</p>
         */
        @NameInMap("DeployedStatus")
        public String deployedStatus;

        /**
         * <p>The deployment status. Valid values: DEPLOYED and NONDEPLOYED.</p>
         */
        @NameInMap("EffectiveVersion")
        public String effectiveVersion;

        /**
         * <p>The effective version.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribeApiResponseBodyDeployedInfosDeployedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyDeployedInfosDeployedInfo self = new DescribeApiResponseBodyDeployedInfosDeployedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyDeployedInfosDeployedInfo setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
            return this;
        }
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        public DescribeApiResponseBodyDeployedInfosDeployedInfo setEffectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        public DescribeApiResponseBodyDeployedInfosDeployedInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApiResponseBodyDeployedInfos extends TeaModel {
        @NameInMap("DeployedInfo")
        public java.util.List<DescribeApiResponseBodyDeployedInfosDeployedInfo> deployedInfo;

        public static DescribeApiResponseBodyDeployedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyDeployedInfos self = new DescribeApiResponseBodyDeployedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyDeployedInfos setDeployedInfo(java.util.List<DescribeApiResponseBodyDeployedInfosDeployedInfo> deployedInfo) {
            this.deployedInfo = deployedInfo;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyDeployedInfosDeployedInfo> getDeployedInfo() {
            return this.deployedInfo;
        }

    }

    public static class DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        /**
         * <p>Model</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The UserId parameter is missing from the request.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Description</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Error message</p>
         */
        @NameInMap("Model")
        public String model;

        public static DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample self = new DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class DescribeApiResponseBodyErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        public java.util.List<DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample;

        public static DescribeApiResponseBodyErrorCodeSamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyErrorCodeSamples self = new DescribeApiResponseBodyErrorCodeSamples();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyErrorCodeSamples setErrorCodeSample(java.util.List<DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample) {
            this.errorCodeSample = errorCodeSample;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyErrorCodeSamplesErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

    }

    public static class DescribeApiResponseBodyOpenIdConnectConfig extends TeaModel {
        /**
         * <p>The ID of the public key.</p>
         */
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        /**
         * <p>The name of the parameter that corresponds to the token.</p>
         */
        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        /**
         * <p>The sample error codes returned by the backend service.</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <p>The public key.</p>
         */
        @NameInMap("PublicKeyId")
        public String publicKeyId;

        public static DescribeApiResponseBodyOpenIdConnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyOpenIdConnectConfig self = new DescribeApiResponseBodyOpenIdConnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyOpenIdConnectConfig setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
            return this;
        }
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        public DescribeApiResponseBodyOpenIdConnectConfig setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
            return this;
        }
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        public DescribeApiResponseBodyOpenIdConnectConfig setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public DescribeApiResponseBodyOpenIdConnectConfig setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

    }

    public static class DescribeApiResponseBodyRequestConfig extends TeaModel {
        /**
         * <p>The request mode. Valid values: MAPPING and PASSTHROUGH.</p>
         */
        @NameInMap("BodyFormat")
        public String bodyFormat;

        /**
         * <p>The API request path. If the complete API URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the API request path is ` /object/add  `.</p>
         */
        @NameInMap("BodyModel")
        public String bodyModel;

        /**
         * <p>The protocol type supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as "HTTP,HTTPS".</p>
         */
        @NameInMap("PostBodyDescription")
        public String postBodyDescription;

        /**
         * <p>This parameter takes effect only when the RequestMode parameter is set to MAPPING.********</p>
         * <br>
         * <p>The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.</p>
         */
        @NameInMap("RequestHttpMethod")
        public String requestHttpMethod;

        /**
         * <p>The description of the request body.</p>
         */
        @NameInMap("RequestMode")
        public String requestMode;

        /**
         * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         */
        @NameInMap("RequestPath")
        public String requestPath;

        /**
         * <p>The configuration items of API requests sent by API Gateway to the backend service.</p>
         */
        @NameInMap("RequestProtocol")
        public String requestProtocol;

        public static DescribeApiResponseBodyRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyRequestConfig self = new DescribeApiResponseBodyRequestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyRequestConfig setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public DescribeApiResponseBodyRequestConfig setBodyModel(String bodyModel) {
            this.bodyModel = bodyModel;
            return this;
        }
        public String getBodyModel() {
            return this.bodyModel;
        }

        public DescribeApiResponseBodyRequestConfig setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public DescribeApiResponseBodyRequestConfig setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public DescribeApiResponseBodyRequestConfig setRequestMode(String requestMode) {
            this.requestMode = requestMode;
            return this;
        }
        public String getRequestMode() {
            return this.requestMode;
        }

        public DescribeApiResponseBodyRequestConfig setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeApiResponseBodyRequestConfig setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

    }

    public static class DescribeApiResponseBodyRequestParametersRequestParameter extends TeaModel {
        /**
         * <p>The hash values that can be entered when **ParameterType** is set to Int, Long, Float, Double, or String. Separate different values with commas (,), such as 1,2,3,4,9 or A,B,C,E,F.</p>
         */
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        /**
         * <p>The minimum parameter value when **ParameterType** is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether the parameter is required. Valid values: **REQUIRED** and **OPTIONAL**.</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>Age</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("DocOrder")
        public Integer docOrder;

        /**
         * <p>The maximum parameter length when **ParameterType** is set to String.</p>
         */
        @NameInMap("DocShow")
        public String docShow;

        /**
         * <p>Examples</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The maximum parameter value when **ParameterType** is set to Int, Long, Float, or Double.</p>
         */
        @NameInMap("JsonScheme")
        public String jsonScheme;

        /**
         * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The default value.</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The type of the array element.</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The order in the document.</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>Indicates whether the document is public. Valid values: **PUBLIC** and **PRIVATE**.</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The regular expression used for parameter validation when **ParameterType** is set to String.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The minimum parameter length when **ParameterType** is set to String.</p>
         */
        @NameInMap("RegularExpression")
        public String regularExpression;

        /**
         * <p>Description</p>
         */
        @NameInMap("Required")
        public String required;

        public static DescribeApiResponseBodyRequestParametersRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyRequestParametersRequestParameter self = new DescribeApiResponseBodyRequestParametersRequestParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public Integer getDocOrder() {
            return this.docOrder;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiResponseBodyRequestParametersRequestParameter setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiResponseBodyRequestParameters extends TeaModel {
        @NameInMap("RequestParameter")
        public java.util.List<DescribeApiResponseBodyRequestParametersRequestParameter> requestParameter;

        public static DescribeApiResponseBodyRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyRequestParameters self = new DescribeApiResponseBodyRequestParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyRequestParameters setRequestParameter(java.util.List<DescribeApiResponseBodyRequestParametersRequestParameter> requestParameter) {
            this.requestParameter = requestParameter;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyRequestParametersRequestParameter> getRequestParameter() {
            return this.requestParameter;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigEventBridgeConfig extends TeaModel {
        /**
         * <p>The Arn that is authorized by a RAM user to EventBridge.</p>
         */
        @NameInMap("EventBridgeRegionId")
        public String eventBridgeRegionId;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("EventBus")
        public String eventBus;

        /**
         * <p>The ID of the region where the EventBridge instance is located.</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>Configuration items of the third-party OpenID Connect authentication method</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static DescribeApiResponseBodyServiceConfigEventBridgeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigEventBridgeConfig self = new DescribeApiResponseBodyServiceConfigEventBridgeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigEventBridgeConfig setEventBridgeRegionId(String eventBridgeRegionId) {
            this.eventBridgeRegionId = eventBridgeRegionId;
            return this;
        }
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        public DescribeApiResponseBodyServiceConfigEventBridgeConfig setEventBus(String eventBus) {
            this.eventBus = eventBus;
            return this;
        }
        public String getEventBus() {
            return this.eventBus;
        }

        public DescribeApiResponseBodyServiceConfigEventBridgeConfig setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeApiResponseBodyServiceConfigEventBridgeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigFunctionComputeConfig extends TeaModel {
        /**
         * <p>The API request path.</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The region where the Function Compute instance is located.</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The value of the ContentType header when the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         */
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.</p>
         */
        @NameInMap("FcType")
        public String fcType;

        /**
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <br>
         * <p>*   **DEFAULT**: the default header type in API Gateway</p>
         * <p>*   **CUSTOM**: a custom header type</p>
         * <p>*   **CLIENT**: the ContentType header type of the client</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The root path of Function Compute.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The function name defined in Function Compute.</p>
         */
        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        /**
         * <p>The service name defined in Function Compute.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Information when the backend service is OSS</p>
         */
        @NameInMap("Qualifier")
        public String qualifier;

        /**
         * <p>The backend only receives the service path.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The request method.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The alias of the function.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeApiResponseBodyServiceConfigFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigFunctionComputeConfig self = new DescribeApiResponseBodyServiceConfigFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setFcBaseUrl(String fcBaseUrl) {
            this.fcBaseUrl = fcBaseUrl;
            return this;
        }
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setFcType(String fcType) {
            this.fcType = fcType;
            return this;
        }
        public String getFcType() {
            return this.fcType;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setOnlyBusinessPath(Boolean onlyBusinessPath) {
            this.onlyBusinessPath = onlyBusinessPath;
            return this;
        }
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigMockHeadersMockHeader extends TeaModel {
        /**
         * <p>Configuration items related to VPC channels</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The name of the HTTP header.</p>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static DescribeApiResponseBodyServiceConfigMockHeadersMockHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigMockHeadersMockHeader self = new DescribeApiResponseBodyServiceConfigMockHeadersMockHeader();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigMockHeadersMockHeader setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeApiResponseBodyServiceConfigMockHeadersMockHeader setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigMockHeaders extends TeaModel {
        @NameInMap("MockHeader")
        public java.util.List<DescribeApiResponseBodyServiceConfigMockHeadersMockHeader> mockHeader;

        public static DescribeApiResponseBodyServiceConfigMockHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigMockHeaders self = new DescribeApiResponseBodyServiceConfigMockHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigMockHeaders setMockHeader(java.util.List<DescribeApiResponseBodyServiceConfigMockHeadersMockHeader> mockHeader) {
            this.mockHeader = mockHeader;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyServiceConfigMockHeadersMockHeader> getMockHeader() {
            return this.mockHeader;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigOssConfig extends TeaModel {
        @NameInMap("Action")
        public String action;

        /**
         * <p>Configuration items of EventBridge</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Key")
        public String key;

        /**
         * <p>The OSS bucket.</p>
         */
        @NameInMap("OssRegionId")
        public String ossRegionId;

        public static DescribeApiResponseBodyServiceConfigOssConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigOssConfig self = new DescribeApiResponseBodyServiceConfigOssConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigOssConfig setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeApiResponseBodyServiceConfigOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeApiResponseBodyServiceConfigOssConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiResponseBodyServiceConfigOssConfig setOssRegionId(String ossRegionId) {
            this.ossRegionId = ossRegionId;
            return this;
        }
        public String getOssRegionId() {
            return this.ossRegionId;
        }

    }

    public static class DescribeApiResponseBodyServiceConfigVpcConfig extends TeaModel {
        /**
         * <p>The port number that corresponds to the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Backend configuration items when the backend service is Function Compute</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the VPC access authorization.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The VPC protocol.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the ECS or SLB instance in the VPC.</p>
         */
        @NameInMap("VpcScheme")
        public String vpcScheme;

        public static DescribeApiResponseBodyServiceConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfigVpcConfig self = new DescribeApiResponseBodyServiceConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfigVpcConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApiResponseBodyServiceConfigVpcConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApiResponseBodyServiceConfigVpcConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApiResponseBodyServiceConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApiResponseBodyServiceConfigVpcConfig setVpcScheme(String vpcScheme) {
            this.vpcScheme = vpcScheme;
            return this;
        }
        public String getVpcScheme() {
            return this.vpcScheme;
        }

    }

    public static class DescribeApiResponseBodyServiceConfig extends TeaModel {
        /**
         * <p>The status code returned for service mocking.</p>
         */
        @NameInMap("AoneAppName")
        public String aoneAppName;

        /**
         * <p>The URL used to call the back-end service. If the complete back-end service URL is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, the value of **ServiceAddress** is `http://api.a.com:8080`.</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The protocol used by the backend service. Valid values: HTTP and HTTPS.</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The event bus.</p>
         */
        @NameInMap("EventBridgeConfig")
        public DescribeApiResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig;

        /**
         * <p>The type of the Function Compute instance.</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>Specifies whether to enable the VPC channel. Valid values:</p>
         * <br>
         * <p>*   **TRUE**: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.</p>
         * <p>*   **FALSE**: The VPC channel is not enabled.</p>
         */
        @NameInMap("Mock")
        public String mock;

        /**
         * <p>The value of the HTTP header.</p>
         */
        @NameInMap("MockHeaders")
        public DescribeApiResponseBodyServiceConfigMockHeaders mockHeaders;

        /**
         * <p>The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         */
        @NameInMap("MockResult")
        public String mockResult;

        /**
         * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         */
        @NameInMap("MockStatusCode")
        public Integer mockStatusCode;

        /**
         * <p>The ID of the region where the OSS instance is located.</p>
         */
        @NameInMap("OssConfig")
        public DescribeApiResponseBodyServiceConfigOssConfig ossConfig;

        /**
         * <p>Specifies whether to enable the Mock mode. Valid values:</p>
         * <br>
         * <p>*   **TRUE**: The Mock mode is enabled.</p>
         * <p>*   **FALSE**: The Mock mode is not enabled.</p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The timeout period of the backend service. Unit: milliseconds.</p>
         */
        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        /**
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <br>
         * <p>*   **DEFAULT**: the default header type in API Gateway</p>
         * <p>*   **CUSTOM**: a custom header type</p>
         * <p>*   **CLIENT**: the ContentType header type of the client</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The path used to call the back-end service. If the complete back-end service path is `http://api.a.com:8080/object/add?key1=value1&key2=value2`, **ServicePath** is `/object/add`.</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The simulated headers.</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>The result returned when the Mock mode is enabled.</p>
         */
        @NameInMap("ServiceVpcEnable")
        public String serviceVpcEnable;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcConfig")
        public DescribeApiResponseBodyServiceConfigVpcConfig vpcConfig;

        public static DescribeApiResponseBodyServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceConfig self = new DescribeApiResponseBodyServiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceConfig setAoneAppName(String aoneAppName) {
            this.aoneAppName = aoneAppName;
            return this;
        }
        public String getAoneAppName() {
            return this.aoneAppName;
        }

        public DescribeApiResponseBodyServiceConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiResponseBodyServiceConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiResponseBodyServiceConfig setEventBridgeConfig(DescribeApiResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig) {
            this.eventBridgeConfig = eventBridgeConfig;
            return this;
        }
        public DescribeApiResponseBodyServiceConfigEventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        public DescribeApiResponseBodyServiceConfig setFunctionComputeConfig(DescribeApiResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }
        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        public DescribeApiResponseBodyServiceConfig setMock(String mock) {
            this.mock = mock;
            return this;
        }
        public String getMock() {
            return this.mock;
        }

        public DescribeApiResponseBodyServiceConfig setMockHeaders(DescribeApiResponseBodyServiceConfigMockHeaders mockHeaders) {
            this.mockHeaders = mockHeaders;
            return this;
        }
        public DescribeApiResponseBodyServiceConfigMockHeaders getMockHeaders() {
            return this.mockHeaders;
        }

        public DescribeApiResponseBodyServiceConfig setMockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }
        public String getMockResult() {
            return this.mockResult;
        }

        public DescribeApiResponseBodyServiceConfig setMockStatusCode(Integer mockStatusCode) {
            this.mockStatusCode = mockStatusCode;
            return this;
        }
        public Integer getMockStatusCode() {
            return this.mockStatusCode;
        }

        public DescribeApiResponseBodyServiceConfig setOssConfig(DescribeApiResponseBodyServiceConfigOssConfig ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public DescribeApiResponseBodyServiceConfigOssConfig getOssConfig() {
            return this.ossConfig;
        }

        public DescribeApiResponseBodyServiceConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public DescribeApiResponseBodyServiceConfig setServiceHttpMethod(String serviceHttpMethod) {
            this.serviceHttpMethod = serviceHttpMethod;
            return this;
        }
        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        public DescribeApiResponseBodyServiceConfig setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public DescribeApiResponseBodyServiceConfig setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public DescribeApiResponseBodyServiceConfig setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        public DescribeApiResponseBodyServiceConfig setServiceVpcEnable(String serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
            return this;
        }
        public String getServiceVpcEnable() {
            return this.serviceVpcEnable;
        }

        public DescribeApiResponseBodyServiceConfig setVpcConfig(DescribeApiResponseBodyServiceConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeApiResponseBodyServiceConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

    public static class DescribeApiResponseBodyServiceParametersServiceParameter extends TeaModel {
        /**
         * <p>The data type of the back-end service parameter.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiResponseBodyServiceParametersServiceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceParametersServiceParameter self = new DescribeApiResponseBodyServiceParametersServiceParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceParametersServiceParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiResponseBodyServiceParametersServiceParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiResponseBodyServiceParametersServiceParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiResponseBodyServiceParameters extends TeaModel {
        @NameInMap("ServiceParameter")
        public java.util.List<DescribeApiResponseBodyServiceParametersServiceParameter> serviceParameter;

        public static DescribeApiResponseBodyServiceParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceParameters self = new DescribeApiResponseBodyServiceParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceParameters setServiceParameter(java.util.List<DescribeApiResponseBodyServiceParametersServiceParameter> serviceParameter) {
            this.serviceParameter = serviceParameter;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyServiceParametersServiceParameter> getServiceParameter() {
            return this.serviceParameter;
        }

    }

    public static class DescribeApiResponseBodyServiceParametersMapServiceParameterMap extends TeaModel {
        /**
         * <p>The name of the backend service parameter.</p>
         */
        @NameInMap("RequestParameterName")
        public String requestParameterName;

        /**
         * <p>The API publishing status.</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiResponseBodyServiceParametersMapServiceParameterMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceParametersMapServiceParameterMap self = new DescribeApiResponseBodyServiceParametersMapServiceParameterMap();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceParametersMapServiceParameterMap setRequestParameterName(String requestParameterName) {
            this.requestParameterName = requestParameterName;
            return this;
        }
        public String getRequestParameterName() {
            return this.requestParameterName;
        }

        public DescribeApiResponseBodyServiceParametersMapServiceParameterMap setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiResponseBodyServiceParametersMap extends TeaModel {
        @NameInMap("ServiceParameterMap")
        public java.util.List<DescribeApiResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap;

        public static DescribeApiResponseBodyServiceParametersMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyServiceParametersMap self = new DescribeApiResponseBodyServiceParametersMap();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyServiceParametersMap setServiceParameterMap(java.util.List<DescribeApiResponseBodyServiceParametersMapServiceParameterMap> serviceParameterMap) {
            this.serviceParameterMap = serviceParameterMap;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyServiceParametersMapServiceParameterMap> getServiceParameterMap() {
            return this.serviceParameterMap;
        }

    }

    public static class DescribeApiResponseBodySystemParametersSystemParameter extends TeaModel {
        /**
         * <p>Description</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>Client IP Address</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the corresponding backend parameter.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>Custom system parameters</p>
         */
        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeApiResponseBodySystemParametersSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodySystemParametersSystemParameter self = new DescribeApiResponseBodySystemParametersSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodySystemParametersSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiResponseBodySystemParametersSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiResponseBodySystemParametersSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiResponseBodySystemParametersSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiResponseBodySystemParametersSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeApiResponseBodySystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        public java.util.List<DescribeApiResponseBodySystemParametersSystemParameter> systemParameter;

        public static DescribeApiResponseBodySystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodySystemParameters self = new DescribeApiResponseBodySystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodySystemParameters setSystemParameter(java.util.List<DescribeApiResponseBodySystemParametersSystemParameter> systemParameter) {
            this.systemParameter = systemParameter;
            return this;
        }
        public java.util.List<DescribeApiResponseBodySystemParametersSystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

    }

}
