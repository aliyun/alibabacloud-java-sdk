// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoryResponseBody extends TeaModel {
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
     * <p>bebf996e4b3d445d83078094b72b0d91</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Backstage_MengMeng Broadcast_Seven Niu Cloud Push Stream Callback_Official</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The AppCode authentication type supported. Valid values:</p>
     * <ul>
     * <li>DEFAULT: supported after being made available in Alibaba Cloud Marketplace</li>
     * <li>DISABLE: not supported.</li>
     * <li>HEADER : supported only in the Header parameter</li>
     * <li>HEADER_QUERY : supported in the Header or Query parameter.</li>
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
     * <li><p><strong>APP: Only authorized applications can call the API.</strong></p>
     * </li>
     * <li><p><strong>ANONYMOUS: The API can be anonymously called. In this mode, you must take note of the following rules:</strong></p>
     * <ul>
     * <li>All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</li>
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
     * <p>Backend configurations</p>
     */
    @NameInMap("BackendConfig")
    public DescribeApiHistoryResponseBodyBackendConfig backendConfig;

    /**
     * <p>Specifies whether to enable backend services.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The publishing time (UTC) of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-1113:57:38</p>
     */
    @NameInMap("DeployedTime")
    public String deployedTime;

    /**
     * <p>The description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Queries weather based on the region name</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <ul>
     * <li>Specifies whether to set <strong>DisableInternet</strong> to <strong>true</strong> to limit API calls to within the VPC.</li>
     * <li>If you set <strong>DisableInternet</strong> to <strong>false</strong>, the limit is lifted. The default value is false when you create an API.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    /**
     * <p>The sample error codes returned by the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/44392.html">ErrorCodeSample</a>.</p>
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeApiHistoryResponseBodyErrorCodeSamples errorCodeSamples;

    /**
     * <p>The sample error response from the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;errorCode&quot;:&quot;fail&quot;,&quot;errorMessage&quot;:&quot;param invalid&quot;}</p>
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <ul>
     * <li>Specifies whether to set <strong>ForceNonceCheck</strong> to <strong>true</strong> to force the check of X-Ca-Nonce during the request. This is the unique identifier of the request and is generally identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</li>
     * <li>If you set <strong>ForceNonceCheck</strong> to <strong>false</strong>, the check is not performed. The default value is false when you create an API.</li>
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
     * <p>cfb6ef799bf54fffabb0f02019ad2581</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_api</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The historical version number.</p>
     * 
     * <strong>example:</strong>
     * <p>20211022134156663</p>
     */
    @NameInMap("HistoryVersion")
    public String historyVersion;

    /**
     * <p>The configuration items of the third-party OpenID Connect authentication method.</p>
     */
    @NameInMap("OpenIdConnectConfig")
    public DescribeApiHistoryResponseBodyOpenIdConnectConfig openIdConnectConfig;

    /**
     * <p>The region where the API is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration items of API requests sent by the consumer to API Gateway.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43985.html">RequestConfig</a>.</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiHistoryResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters of API requests sent by the consumer to API Gateway.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43986.html">RequestParameter</a>.</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiHistoryResponseBodyRequestParameters requestParameters;

    /**
     * <p>The return description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    /**
     * <p>The return description of the API.</p>
     */
    @NameInMap("ResultDescriptions")
    public DescribeApiHistoryResponseBodyResultDescriptions resultDescriptions;

    /**
     * <p>The sample response.</p>
     * 
     * <strong>example:</strong>
     * <p>{\n  \&quot;status\&quot;: 0,\n  \&quot;data\&quot;: {\n    \&quot;count\&quot;: 1,\n    \&quot;list\&quot;: [\n      \&quot;352\&quot;\n    ]\n  },\n  \&quot;message\&quot;: \&quot;success\&quot;\n}</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The type of the data to return.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The information about a backend service call.</p>
     */
    @NameInMap("ServiceConfig")
    public DescribeApiHistoryResponseBodyServiceConfig serviceConfig;

    /**
     * <p>The parameters of API requests sent by API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43988.html">ServiceParameter</a>.</p>
     */
    @NameInMap("ServiceParameters")
    public DescribeApiHistoryResponseBodyServiceParameters serviceParameters;

    /**
     * <p>The mappings between parameters of requests sent by the consumer to API Gateway and parameters of requests sent by API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43989.html">ServiceParameterMap</a>.</p>
     */
    @NameInMap("ServiceParametersMap")
    public DescribeApiHistoryResponseBodyServiceParametersMap serviceParametersMap;

    /**
     * <p>The environment in which the API is requested. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong>: the production environment</li>
     * <li><strong>PRE</strong>: the pre-release environment</li>
     * <li><strong>TEST</strong>: the test environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The invocation status of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The common parameters of the APIs, in JSON format.</p>
     */
    @NameInMap("SystemParameters")
    public DescribeApiHistoryResponseBodySystemParameters systemParameters;

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
     * <p>The type of the two-way communication API. Valid values:</p>
     * <ul>
     * <li><strong>COMMON</strong>: general APIs</li>
     * <li><strong>REGISTER</strong>: registered APIs</li>
     * <li><strong>UNREGISTER</strong>: unregistered APIs</li>
     * <li><strong>NOTIFY</strong>: downstream notification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON</p>
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
         * 
         * <strong>example:</strong>
         * <p>a0305308908c4740aba9cbfd63ba99b7</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The name of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>zmapi</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>The type of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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
         * <p>for_test1</p>
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
         * <p>The sample value.</p>
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
         * <p>balabala</p>
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
         * <p>The parameter name.</p>
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
         * <p>Missing the parameter UserId</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingParameter</p>
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
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        /**
         * <p>The configuration of OpenID Connect authentication. Valid values:</p>
         * <ul>
         * <li><strong>IDTOKEN: indicates the APIs that are called by clients to obtain tokens. If you specify this value, the PublicKeyId parameter and the PublicKey parameter are required.</strong></li>
         * <li>**BUSINESS: indicates business APIs. Tokens are used to call the business APIs. If you specify this value, the IdTokenParamName parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDTOKEN</p>
         */
        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        /**
         * <p>The public key of the API.</p>
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
         * <p>The server data transmission method used for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data in key-value pairs is transmitted as forms. STREAM indicates that data is transmitted as byte streams. This parameter takes effect only when the RequestMode parameter is set to MAPPING.</p>
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
         * <p><a href="https://apigateway.aliyun.com/models/3a240a1XXXXXXXXd9ab1bf7e947b4095/9e2df550e85b4XXXXXXXX619eaab">https://apigateway.aliyun.com/models/3a240a1XXXXXXXXd9ab1bf7e947b4095/9e2df550e85b4XXXXXXXX619eaab</a></p>
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
         * <p>The HTTP method. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
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
         * <p>API path</p>
         * 
         * <strong>example:</strong>
         * <p>/api/billing/test/[type]</p>
         */
        @NameInMap("RequestPath")
        public String requestPath;

        /**
         * <p>The protocol type supported by the API. Valid values: HTTP, HTTPS, and WebSocket. Separate multiple values with commas (,), such as &quot;HTTP,HTTPS&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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

        public DescribeApiHistoryResponseBodyRequestConfig setEscapePathParam(Boolean escapePathParam) {
            this.escapePathParam = escapePathParam;
            return this;
        }
        public Boolean getEscapePathParam() {
            return this.escapePathParam;
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
         * <p>The sample value.</p>
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
         * <p>modidyTest</p>
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
         * <p>JSON scheme</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <p>The subnode description.</p>
         * 
         * <strong>example:</strong>
         * <p>for_test1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether a subnode exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasChild")
        public Boolean hasChild;

        /**
         * <p>The result ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The primary key of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mandatory")
        public Boolean mandatory;

        /**
         * <p>The result name.</p>
         * 
         * <strong>example:</strong>
         * <p>fwqf</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent node.</p>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The result type.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
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
         * <p>The event source of the managed rule.</p>
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
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <ul>
         * <li><strong>DEFAULT: the default header type in API Gateway.</strong></li>
         * <li><strong>CUSTOM: a custom header type.</strong></li>
         * <li>**CLIENT: the ContentType header type of the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        /**
         * <p>The value of the ContentType header when the ServiceProtocol parameter is set to HTTP and the ContentTypeCatagory parameter is set to DEFAULT or CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>The root path of Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://122xxxxxxx.fc.aliyun.com/2016xxxx/proxy/testSxxx.xxx/testHttp/">https://122xxxxxxx.fc.aliyun.com/2016xxxx/proxy/testSxxx.xxx/testHttp/</a></p>
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
         * <p>domain_business_control</p>
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
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The HTTP headers.</p>
         * 
         * <strong>example:</strong>
         * <p>Content-Type</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The values of the HTTP headers.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
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
         * <p>phototest02</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The stored object or folder path.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV</p>
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
         * <p>The IDs of the ELB and SLB instances in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1h497hkijewv2***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC.</p>
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
         * <p>The ContentType header type used when you call the backend service over HTTP.</p>
         * <ul>
         * <li>DEFAULT: the default header type in API Gateway</li>
         * <li>CUSTOM: a custom header type</li>
         * <li>CLIENT: the ContentType header type of the client</li>
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
         * <p>application/json</p>
         */
        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        /**
         * <p>Configuration items of EventBridge</p>
         */
        @NameInMap("EventBridgeConfig")
        public DescribeApiHistoryResponseBodyServiceConfigEventBridgeConfig eventBridgeConfig;

        /**
         * <p>Backend configuration items when the backend service is Function Compute</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>Specifies whether to enable the MOCK mode. Valid values:</p>
         * <ul>
         * <li>TRUE: The Mock mode is enabled.</li>
         * <li>FALSE: The Mock mode is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        @NameInMap("Mock")
        public String mock;

        /**
         * <p>The simulated Headers.</p>
         */
        @NameInMap("MockHeaders")
        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders mockHeaders;

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
         * <p>Information when the backend service is OSS</p>
         */
        @NameInMap("OssConfig")
        public DescribeApiHistoryResponseBodyServiceConfigOssConfig ossConfig;

        /**
         * <p>The URL used to call the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://api.a.com:8080">http://api.a.com:8080</a></p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The HTTP request method used when calling the backend service. Valid values: PUT, GET, POST, DELETE, PATCH, HEAD, OPTIONS, and ANY.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        /**
         * <p>The path used when you call the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>/object/add</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The backend service protocol. Currently, only HTTP, HTTPS, and FunctionCompute are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The timeout period of the backend service, in millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>Specifies whether to enable the VPC channel. Valid values:</p>
         * <ul>
         * <li>TRUE: The VPC channel is enabled.</li>
         * <li>FALSE: The VPC channel is not enabled.</li>
         * </ul>
         * <p>You must create the corresponding VPC access authorization before you can enable a VPC channel.</p>
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
        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig vpcConfig;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6kg9x8sx2tbxxxx</p>
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
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("DemoValue")
        public String demoValue;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>system parameters description</p>
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
