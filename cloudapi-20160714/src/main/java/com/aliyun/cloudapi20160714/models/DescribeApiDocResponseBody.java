// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiDocResponseBody extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API operation.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The authentication method. Valid values: APP and ANONYMOUS. APP indicates that only Alibaba Cloud applications can call the API. ANONYMOUS indicates that anonymous users can call the API.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The publishing time.</p>
     */
    @NameInMap("DeployedTime")
    public String deployedTime;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>*   If the value of **DisableInternet** is set to **true**, API calls are limited within the VPC.</p>
     * <p>*   If the value of **DisableInternet** is set to **false**, the limit is lifted. The default value is false when you create an API.</p>
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
     */
    @NameInMap("FailResultSample")
    public String failResultSample;

    /**
     * <p>*   If the value of **ForceNonceCheck** is set to **true**, X-Ca-Nonce must be checked during the request. This is the unique identifier of the request and is identified by UUID. After receiving this parameter, API Gateway verifies the validity of this parameter. The same value can be used only once within 15 minutes. This helps prevent replay attacks.</p>
     * <p>*   If the value of **ForceNonceCheck** is set to **false**, the X-Ca-Nonce is not checked. The default value is false when you create an API.</p>
     */
    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the group to which the API belongs.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID of the API group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The returned API frontend definition information. It is an array consisting of RequestConfig data.</p>
     */
    @NameInMap("RequestConfig")
    public DescribeApiDocResponseBodyRequestConfig requestConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned frontend request parameters.</p>
     */
    @NameInMap("RequestParameters")
    public DescribeApiDocResponseBodyRequestParameters requestParameters;

    /**
     * <p>The return descriptions of the API.</p>
     */
    @NameInMap("ResultDescriptions")
    public DescribeApiDocResponseBodyResultDescriptions resultDescriptions;

    /**
     * <p>The sample response.</p>
     */
    @NameInMap("ResultSample")
    public String resultSample;

    /**
     * <p>The format of the return value.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>Indicates whether the API is public. Valid values: PUBLIC and PRIVATE.</p>
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

    public DescribeApiDocResponseBody setResultDescriptions(DescribeApiDocResponseBodyResultDescriptions resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public DescribeApiDocResponseBodyResultDescriptions getResultDescriptions() {
        return this.resultDescriptions;
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
         * <p>The error code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the error code.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message.</p>
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
         * <br>
         * <p>The format in which data is transmitted to the server for POST and PUT requests. Valid values: FORM and STREAM. FORM indicates that data is transmitted in the key-value pair format. STREAM indicates that data is transmitted as byte streams.</p>
         */
        @NameInMap("BodyFormat")
        public String bodyFormat;

        /**
         * <p>The description of the request body.</p>
         */
        @NameInMap("PostBodyDescription")
        public String postBodyDescription;

        /**
         * <p>The HTTP method that was used to make the request. Valid values: GET, POST, DELETE, PUT, HEADER, TRACE, PATCH, CONNECT, and OPTIONS.</p>
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
         * <p>The protocol types supported by the API. Valid values: HTTP and HTTPS. Separate multiple values with commas (,), such as "HTTP,HTTPS".</p>
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
         * <p>The example value.</p>
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
         * <p>Indicates whether the document is public. Valid values: PUBLIC and PRIVATE.</p>
         */
        @NameInMap("DocShow")
        public String docShow;

        /**
         * <p>The hash values that can be entered when ParameterType is set to Int, Long, Float, Double, or String. Different values are separated with commas (,), such as 1,2,3,4,9 or A,B,C,E,F.</p>
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
         * <p>The maximum length.</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <p>The maximum value.</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The minimum length.</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        /**
         * <p>The minimum value.</p>
         */
        @NameInMap("MinValue")
        public Long minValue;

        /**
         * <p>The type of the parameter.</p>
         */
        @NameInMap("ParameterType")
        public String parameterType;

        /**
         * <p>The regular expression used for parameter validation when ParameterType is set to String.</p>
         */
        @NameInMap("RegularExpression")
        public String regularExpression;

        /**
         * <p>Indicates whether the parameter is required.</p>
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

    public static class DescribeApiDocResponseBodyResultDescriptionsResultDescription extends TeaModel {
        /**
         * <p>The description of the API.</p>
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
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Type")
        public String type;

        public static DescribeApiDocResponseBodyResultDescriptionsResultDescription build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyResultDescriptionsResultDescription self = new DescribeApiDocResponseBodyResultDescriptionsResultDescription();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setHasChild(Boolean hasChild) {
            this.hasChild = hasChild;
            return this;
        }
        public Boolean getHasChild() {
            return this.hasChild;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeApiDocResponseBodyResultDescriptionsResultDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApiDocResponseBodyResultDescriptions extends TeaModel {
        @NameInMap("ResultDescription")
        public java.util.List<DescribeApiDocResponseBodyResultDescriptionsResultDescription> resultDescription;

        public static DescribeApiDocResponseBodyResultDescriptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyResultDescriptions self = new DescribeApiDocResponseBodyResultDescriptions();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyResultDescriptions setResultDescription(java.util.List<DescribeApiDocResponseBodyResultDescriptionsResultDescription> resultDescription) {
            this.resultDescription = resultDescription;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyResultDescriptionsResultDescription> getResultDescription() {
            return this.resultDescription;
        }

    }

}
