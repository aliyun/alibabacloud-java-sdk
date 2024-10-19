// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiResponseBody extends TeaModel {
    /**
     * <p>If <strong>AuthType</strong> is set to <strong>APP</strong>, this value must be passed to specify the signature algorithm. If you do not specify a value, HmacSHA256 is used by default. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>8afff6c8c4c6447abb035812e4d66b65</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API, which is unique in the group.</p>
     * 
     * <strong>example:</strong>
     * <p>ApiName</p>
     */
    @NameInMap("ApiName")
    public String apiName;

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
     * <p>HEADER</p>
     */
    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    /**
     * <p>The security authentication method of the API. Valid values:</p>
     * <ul>
     * <li><p><strong>APP</strong>: Only authorized applications can call the API.</p>
     * </li>
     * <li><p><strong>ANONYMOUS</strong>: The API can be anonymously called. In this mode, you must take note of the following rules:</p>
     * <ul>
     * <li>All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</li>
     * <li>We recommend that you do not make the API whose security authentication method is ANONYMOUS available in Alibaba Cloud Marketplace because API Gateway cannot meter calls on the caller or limit the number of calls on the API. If you want to make the API group to which the API belongs available in Alibaba Cloud Marketplace, we recommend that you move the API to another group, set its type to PRIVATE, or set its security authentication method to APP.</li>
     * </ul>
     * </li>
     * <li><p><strong>APPOPENID</strong>: The OpenID Connect account authentication method is used. Only applications authorized by OpenID Connect can call the API. If this method is selected, the OpenIdConnectConfig parameter is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Backend configurations</p>
     */
    @NameInMap("BackendConfig")
    public DescribeApiResponseBodyBackendConfig backendConfig;

    /**
     * <p>Specifies whether to enable backend services.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BackendEnable")
    public Boolean backendEnable;

    /**
     * <p>System parameters sent by API Gateway to the backend service</p>
     */
    @NameInMap("ConstantParameters")
    public DescribeApiResponseBodyConstantParameters constantParameters;

    /**
     * <p>The creation time of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-28T09:50:43Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Custom system parameters</p>
     */
    @NameInMap("CustomSystemParameters")
    public DescribeApiResponseBodyCustomSystemParameters customSystemParameters;

    /**
     * <p>The API publishing status.</p>
     */
    @NameInMap("DeployedInfos")
    public DescribeApiResponseBodyDeployedInfos deployedInfos;

    /**
     * <p>The description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Api description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to limit API calls to within the VPC. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Only API calls from the VPC are supported.</li>
     * <li><strong>false</strong>: API calls from the VPC and Internet are both supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeApiResponseBodyErrorCodeSamples errorCodeSamples;

    /**
     * <p>The sample error response from the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>Specifies whether to carry the header : X-Ca-Nonce when calling an API. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent reply attacks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: This field is forcibly checked when an API is requested to prevent replay attacks.</li>
     * <li><strong>false</strong>: This field is not checked.</li>
     * </ul>
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
     * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>ApiTest</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to enable the Mock mode. Valid values:</p>
     * <ul>
     * <li>OPEN: The Mock mode is enabled.</li>
     * <li>CLOSED: The Mock mode is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSED</p>
     */
    @NameInMap("Mock")
    public String mock;

    /**
     * <p>The result returned for service mocking.</p>
     * 
     * <strong>example:</strong>
     * <p>test result</p>
     */
    @NameInMap("MockResult")
    public String mockResult;

    /**
     * <p>The last modification time of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-28T13:13:12Z</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>Configuration items of the third-party OpenID Connect authentication method</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public DescribeApiResponseBodyOpenIdConnectConfig openIdConnectConfig;

    /**
     * <p>The region ID of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D0FF585F-7966-40CF-BC60-75DB070B23D5&lt;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiResponseBodyRequestParameters requestParameters;

    /**
     * <p>The returned description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>The sample response from the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The format of the response from the backend service. Valid values: JSON, TEXT, BINARY, XML, and HTML.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The configuration items of API requests that API Gateway sends to the backend service.</p>
     */
    @NameInMap("ServiceConfig")
    public DescribeApiResponseBodyServiceConfig serviceConfig;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     */
    @NameInMap("ServiceParameters")
    public DescribeApiResponseBodyServiceParameters serviceParameters;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     */
    @NameInMap("ServiceParametersMap")
    public DescribeApiResponseBodyServiceParametersMap serviceParametersMap;

    /**
     * <p>System parameters sent by API Gateway to the backend service</p>
     */
    @NameInMap("SystemParameters")
    public DescribeApiResponseBodySystemParameters systemParameters;

    /**
     * <p>Tag List.</p>
     */
    @NameInMap("TagList")
    public DescribeApiResponseBodyTagList tagList;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC</strong>: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.</li>
     * <li><strong>PRIVATE</strong>: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The type of the two-way communication API.</p>
     * <ul>
     * <li><strong>COMMON</strong>: common API</li>
     * <li><strong>REGISTER</strong>: registered API</li>
     * <li><strong>UNREGISTER</strong>: unregistered API</li>
     * <li><strong>NOTIFY</strong>: downstream notification API</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
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

    public DescribeApiResponseBody setTagList(DescribeApiResponseBodyTagList tagList) {
        this.tagList = tagList;
        return this;
    }
    public DescribeApiResponseBodyTagList getTagList() {
        return this.tagList;
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
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>0038e00c3dca44fcba3a94015d8f5bbf</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The name of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>testoss</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>Backend service type</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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
         * <p>The constant parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>constance</p>
         */
        @NameInMap("ConstantValue")
        public String constantValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>constance</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The mapped parameter name in the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>constance</p>
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
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Client IP Address</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
         * 
         * <strong>example:</strong>
         * <p>CaClientIp</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The mapped parameter name in the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>clientIp</p>
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
         * <p>The deployment status. Valid values: DEPLOYED and NONDEPLOYED.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOYED</p>
         */
        @NameInMap("DeployedStatus")
        public String deployedStatus;

        /**
         * <p>The effective version.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EffectiveVersion")
        public String effectiveVersion;

        /**
         * <p>The environment to which the API is published. Valid values: RELEASE and TEST.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
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
         * <p>The returned error code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The UserId parameter is missing from the request.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Missing the parameter UserId</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;*\&quot;]</p>
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
         * <p>The name of the parameter that corresponds to the token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        /**
         * <p>The OpenID Connect mode. Valid values:</p>
         * <ul>
         * <li><strong>IDTOKEN</strong>: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.</li>
         * <li><strong>BUSINESS</strong>: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDTOKEN</p>
         */
        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        /**
         * <p>The public key.</p>
         * 
         * <strong>example:</strong>
         * <p>EB1837F8693CCED0BF750B3AD48467BEB569E780A14591CF92</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <p>The ID of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>88483727556929326703309904351185815489</p>
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
         * <p>This parameter takes effect only when the RequestMode parameter is set to MAPPING.********</p>
         * <p>The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams.</p>
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
         * <p><a href="https://apigateway.aliyun.com/models/3a240a127dcc4afd9ab1bf7e947b4095/9e2df550e85b4121a79ec33e2619eaab">https://apigateway.aliyun.com/models/3a240a127dcc4afd9ab1bf7e947b4095/9e2df550e85b4121a79ec33e2619eaab</a></p>
         */
        @NameInMap("BodyModel")
        public String bodyModel;

        /**
         * <p>Whether to escape the Path parameter, if true, the [param] on the Path will be treated as a regular character.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EscapePathParam")
        public Boolean escapePathParam;

        /**
         * <p>The description of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>fwefwef</p>
         */
        @NameInMap("PostBodyDescription")
        public String postBodyDescription;

        /**
         * <p>The HTTP method used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("RequestHttpMethod")
        public String requestHttpMethod;

        /**
         * <p>The request mode. Valid values: MAPPING and PASSTHROUGH.</p>
         * 
         * <strong>example:</strong>
         * <p>MAPPING</p>
         */
        @NameInMap("RequestMode")
        public String requestMode;

        /**
         * <p>The API request path. If the complete API URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the API request path is <code>/object/add </code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/billing/test/[type]</p>
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

        public DescribeApiResponseBodyRequestConfig setEscapePathParam(Boolean escapePathParam) {
            this.escapePathParam = escapePathParam;
            return this;
        }
        public Boolean getEscapePathParam() {
            return this.escapePathParam;
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        /**
         * <p>The type of the array element.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Age</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The order in which the parameter is sorted in the document.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DocOrder")
        public Integer docOrder;

        /**
         * <p>Indicates whether the document is public. Valid values: <strong>PUBLIC</strong> and <strong>PRIVATE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("DocShow")
        public String docShow;

        /**
         * <p>The hash values that are supported when <strong>ParameterType</strong> is set to Int, Long, Float, Double, or String. Separate values with commas (,). Examples: 1,2,3,4,9 and A,B,C,E,F.</p>
         * 
         * <strong>example:</strong>
         * <p>boy,girl</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The JSON Schema used for JSON validation when <strong>ParameterType</strong> is set to String.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("JsonScheme")
        public String jsonScheme;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The maximum parameter length when <strong>ParameterType</strong> is set to String.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The maximum parameter value when <strong>ParameterType</strong> is set to Int, Long, Float, or Double.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The minimum parameter length when <strong>ParameterType</strong> is set to String.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>The minimum parameter value when <strong>ParameterType</strong> is set to Int, Long, Float, or Double.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The data type of the parameter. Valid values: String, Int, Long, Float, Double, and Boolean.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The regular expression that is used for parameter validation when <strong>ParameterType</strong> is set to String.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RegularExpression")
        public String regularExpression;

        /**
         * <p>Indicates whether the parameter is required. Valid values: <strong>REQUIRED</strong> and <strong>OPTIONAL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
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
         * <p>The ID of the region where the EventBridge instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("EventBridgeRegionId")
        public String eventBridgeRegionId;

        /**
         * <p>The event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>testBus</p>
         */
        @NameInMap("EventBus")
        public String eventBus;

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>baas_driver</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The Arn that is authorized by a RAM user to EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1933122015759***:role/adminoidcaliyun</p>
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
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <ul>
         * <li><strong>DEFAULT</strong>: the default header type in API Gateway</li>
         * <li><strong>CUSTOM</strong>: a custom header type</li>
         * <li><strong>CLIENT</strong>: the ContentType header type of the client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header when the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The root path of Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://1227****64334133.ap-southeast-1-int***al.fc.aliyuncs.com/201****-15/proxy/test****ice.LATEST/testHttp/">https://1227****64334133.ap-southeast-1-int***al.fc.aliyuncs.com/201****-15/proxy/test****ice.LATEST/testHttp/</a></p>
         */
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        /**
         * <p>The type of the Function Compute instance.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpTrigger</p>
         */
        @NameInMap("FcType")
        public String fcType;

        /**
         * <p>The function name defined in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>edge_function</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The request method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The backend only receives the service path.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        /**
         * <p>The API request path.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/offline/cacheData</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Qualifier")
        public String qualifier;

        /**
         * <p>The region where the Function Compute instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role to be assumed by API Gateway to access Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::111***:role/aliyunserviceroleforsas</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The service name defined in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>fcservicename</p>
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
         * <p>The HTTP header.</p>
         * 
         * <strong>example:</strong>
         * <p>Content-Length</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The value of the HTTP header.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
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
        /**
         * <p>The operation options on OSS. Valid values:</p>
         * <ul>
         * <li>GetObject</li>
         * <li>PostObject</li>
         * <li>DeleteObject</li>
         * <li>PutObject</li>
         * <li>HeadObject</li>
         * <li>GetObjectMeta</li>
         * <li>AppendObject</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GetObject</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cbg-db</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The stored object or folder path.</p>
         * 
         * <strong>example:</strong>
         * <p>/folder/test.json</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the region where the OSS instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The ID of the ECS or SLB instance in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1h497hkijewv2***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC access authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>glmall-app-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port number that corresponds to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeafsc3fygk1***</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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
         * <p>The application name in AONE.</p>
         * 
         * <strong>example:</strong>
         * <p>ib-blank</p>
         */
        @NameInMap("AoneAppName")
        public String aoneAppName;

        /**
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <ul>
         * <li><strong>DEFAULT</strong>: the default header type in API Gateway</li>
         * <li><strong>CUSTOM</strong>: a custom header type</li>
         * <li><strong>CLIENT</strong>: the ContentType header type of the client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded; charset=UTF-8</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>Configuration items of EventBridge</p>
         */
        @NameInMap("EventBridgeConfig")
        public DescribeApiResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig;

        /**
         * <p>Backend configuration items when the backend service is Function Compute</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeApiResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>Specifies whether to enable the Mock mode. Valid values:</p>
         * <ul>
         * <li><strong>TRUE</strong>: The Mock mode is enabled.</li>
         * <li><strong>FALSE</strong>: The Mock mode is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        @NameInMap("Mock")
        public String mock;

        /**
         * <p>The simulated headers.</p>
         */
        @NameInMap("MockHeaders")
        public DescribeApiResponseBodyServiceConfigMockHeaders mockHeaders;

        /**
         * <p>The result returned when the Mock mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>test result</p>
         */
        @NameInMap("MockResult")
        public String mockResult;

        /**
         * <p>The status code returned for service mocking.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MockStatusCode")
        public Integer mockStatusCode;

        /**
         * <p>The information returned when the backend service is Object Storage Service (OSS).</p>
         */
        @NameInMap("OssConfig")
        public DescribeApiResponseBodyServiceConfigOssConfig ossConfig;

        /**
         * <p>The URL used to call the back-end service. If the complete back-end service URL is <code>http://api.a.com:8080/object/add?key1=value1&amp;key2=value2</code>, the value of ServiceAddress is <strong><a href="http://api.a.com:8080">http://api.a.com:8080</a></strong>.``</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://api.a.com:8080">http://api.a.com:8080</a></p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The HTTP method used to call a backend service. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        /**
         * <strong>example:</strong>
         * <p>/object/add</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The protocol used by the backend service. Valid values: HTTP and HTTPS.</p>
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
         * <p>1000</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>Specifies whether to enable the VPC channel. Valid values:</p>
         * <ul>
         * <li><strong>TRUE</strong>: The VPC channel is enabled. You must create the corresponding VPC access authorization before you can enable a VPC channel.</li>
         * <li><strong>FALSE</strong>: The VPC channel is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        @NameInMap("ServiceVpcEnable")
        public String serviceVpcEnable;

        /**
         * <p>Configuration items related to VPC channels</p>
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
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The data type of the parameter. Valid values: STRING, NUMBER, and BOOLEAN.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The mapped parameter name in the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>clientIp</p>
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
         * <p>The corresponding frontend parameter name. The value must be contained in RequestParametersObject and match RequestParam.ApiParameterName.</p>
         * 
         * <strong>example:</strong>
         * <p>sex</p>
         */
        @NameInMap("RequestParameterName")
        public String requestParameterName;

        /**
         * <p>The mapped parameter name in the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>sex</p>
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
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Client IP Address</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter location. Valid values: BODY, HEAD, QUERY, and PATH.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The system parameter. Valid values: CaClientIp, CaDomain, CaRequestHandleTime, CaAppId, CaRequestId, CaHttpSchema, and CaProxy.</p>
         * 
         * <strong>example:</strong>
         * <p>CaClientIp</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The mapped parameter name in the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>clientIp</p>
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

    public static class DescribeApiResponseBodyTagListTag extends TeaModel {
        /**
         * <p>Label key.</p>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>Label value.</p>
         * 
         * <strong>example:</strong>
         * <p>value3</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeApiResponseBodyTagListTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyTagListTag self = new DescribeApiResponseBodyTagListTag();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyTagListTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeApiResponseBodyTagListTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeApiResponseBodyTagList extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeApiResponseBodyTagListTag> tag;

        public static DescribeApiResponseBodyTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiResponseBodyTagList self = new DescribeApiResponseBodyTagList();
            return TeaModel.build(map, self);
        }

        public DescribeApiResponseBodyTagList setTag(java.util.List<DescribeApiResponseBodyTagListTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeApiResponseBodyTagListTag> getTag() {
            return this.tag;
        }

    }

}
