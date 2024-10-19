// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiDocResponseBody extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>b24be7e59a104e52bffbf432cc9272af</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API</p>
     * 
     * <strong>example:</strong>
     * <p>ObtainKeywordQRCodeAddress</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The security authentication method. Valid values: APP, ANONYMOUS, and APPOPENID, indicating respectively Alibaba Cloud application authentication, anonymous authentication, and third-party OpenID Connect account authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The publishing time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-13T16:00:33Z</p>
     */
    @NameInMap("DeployedTime")
    public String deployedTime;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>Lynk\&amp;Co Digital Mall OMS-UAT</p>
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
     */
    @NameInMap("ErrorCodeSamples")
    public DescribeApiDocResponseBodyErrorCodeSamples errorCodeSamples;

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
     * <p>f51d08c5b7c84342905544ebaec26d35</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>Member Age Transaction Service</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The returned API frontend definition. It is an array consisting of RequestConfig data.</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiDocResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F253FB5F-9AE1-5DDA-99B5-46BE00A3719E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned frontend input parameters in the API. It is an array consisting of RequestParameter data.</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiDocResponseBodyRequestParameters requestParameters;

    /**
     * <p>The sample response.</p>
     * 
     * <strong>example:</strong>
     * <p>{\n  \&quot;status\&quot;: 0,\n  \&quot;data\&quot;: {\n    \&quot;count\&quot;: 1,\n    \&quot;list\&quot;: [\n      \&quot;352\&quot;\n    ]\n  },\n  \&quot;message\&quot;: \&quot;success\&quot;\n}</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The return value type.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>Indicates whether the API is public. Valid values: PUBLIC and PRIVATE.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static DescribeApiDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiDocResponseBody self = new DescribeApiDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiDocResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiDocResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApiDocResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeApiDocResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
    }

    public DescribeApiDocResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiDocResponseBody setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public DescribeApiDocResponseBody setErrorCodeSamples(DescribeApiDocResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeApiDocResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeApiDocResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeApiDocResponseBody setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public DescribeApiDocResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiDocResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiDocResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiDocResponseBody setRequestConfig(DescribeApiDocResponseBodyRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public DescribeApiDocResponseBodyRequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public DescribeApiDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiDocResponseBody setRequestParameters(DescribeApiDocResponseBodyRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public DescribeApiDocResponseBodyRequestParameters getRequestParameters() {
        return this.requestParameters;
    }

    public DescribeApiDocResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeApiDocResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeApiDocResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiDocResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public static class DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        /**
         * <p>The returned error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample self = new DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeApiDocResponseBodyErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        public java.util.List<DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample;

        public static DescribeApiDocResponseBodyErrorCodeSamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyErrorCodeSamples self = new DescribeApiDocResponseBodyErrorCodeSamples();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyErrorCodeSamples setErrorCodeSample(java.util.List<DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample) {
            this.errorCodeSample = errorCodeSample;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

    }

    public static class DescribeApiDocResponseBodyRequestConfig extends TeaModel {
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

        public static DescribeApiDocResponseBodyRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestConfig self = new DescribeApiDocResponseBodyRequestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestConfig setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public DescribeApiDocResponseBodyRequestConfig setEscapePathParam(Boolean escapePathParam) {
            this.escapePathParam = escapePathParam;
            return this;
        }
        public Boolean getEscapePathParam() {
            return this.escapePathParam;
        }

        public DescribeApiDocResponseBodyRequestConfig setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public DescribeApiDocResponseBodyRequestConfig setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public DescribeApiDocResponseBodyRequestConfig setRequestMode(String requestMode) {
            this.requestMode = requestMode;
            return this;
        }
        public String getRequestMode() {
            return this.requestMode;
        }

        public DescribeApiDocResponseBodyRequestConfig setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeApiDocResponseBodyRequestConfig setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

    }

    public static class DescribeApiDocResponseBodyRequestParametersRequestParameter extends TeaModel {
        /**
         * <p>The name of the parameter in the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>Length</p>
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
         * <p>Parameters</p>
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
         * <p>The maximum length.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The data type of the parameter.</p>
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
         * <p>Indicates whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
         */
        @NameInMap("Required")
        public String required;

        public static DescribeApiDocResponseBodyRequestParametersRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestParametersRequestParameter self = new DescribeApiDocResponseBodyRequestParametersRequestParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public Integer getDocOrder() {
            return this.docOrder;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiDocResponseBodyRequestParametersRequestParameter setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiDocResponseBodyRequestParameters extends TeaModel {
        @NameInMap("RequestParameter")
        public java.util.List<DescribeApiDocResponseBodyRequestParametersRequestParameter> requestParameter;

        public static DescribeApiDocResponseBodyRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestParameters self = new DescribeApiDocResponseBodyRequestParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestParameters setRequestParameter(java.util.List<DescribeApiDocResponseBodyRequestParametersRequestParameter> requestParameter) {
            this.requestParameter = requestParameter;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyRequestParametersRequestParameter> getRequestParameter() {
            return this.requestParameter;
        }

    }

}
