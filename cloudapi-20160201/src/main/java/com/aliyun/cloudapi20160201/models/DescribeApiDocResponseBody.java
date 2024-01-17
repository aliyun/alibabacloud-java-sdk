// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiDocResponseBody extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("BodyFormat")
    public String bodyFormat;

    @NameInMap("DeployedTime")
    public String deployedTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ErrorCodeSamples")
    public DescribeApiDocResponseBodyErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("HttpMethod")
    public String httpMethod;

    @NameInMap("HttpProtocol")
    public String httpProtocol;

    @NameInMap("Path")
    public String path;

    @NameInMap("PathParameters")
    public DescribeApiDocResponseBodyPathParameters pathParameters;

    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    @NameInMap("PostBodyType")
    public String postBodyType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestBody")
    public DescribeApiDocResponseBodyRequestBody requestBody;

    @NameInMap("RequestHeaders")
    public DescribeApiDocResponseBodyRequestHeaders requestHeaders;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestQueries")
    public DescribeApiDocResponseBodyRequestQueries requestQueries;

    @NameInMap("ResultDescriptions")
    public DescribeApiDocResponseBodyResultDescriptions resultDescriptions;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SdkDemos")
    public DescribeApiDocResponseBodySdkDemos sdkDemos;

    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    @NameInMap("StageName")
    public String stageName;

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

    public DescribeApiDocResponseBody setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
        return this;
    }
    public String getBodyFormat() {
        return this.bodyFormat;
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

    public DescribeApiDocResponseBody setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public DescribeApiDocResponseBody setHttpProtocol(String httpProtocol) {
        this.httpProtocol = httpProtocol;
        return this;
    }
    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    public DescribeApiDocResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeApiDocResponseBody setPathParameters(DescribeApiDocResponseBodyPathParameters pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public DescribeApiDocResponseBodyPathParameters getPathParameters() {
        return this.pathParameters;
    }

    public DescribeApiDocResponseBody setPostBodyDescription(String postBodyDescription) {
        this.postBodyDescription = postBodyDescription;
        return this;
    }
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    public DescribeApiDocResponseBody setPostBodyType(String postBodyType) {
        this.postBodyType = postBodyType;
        return this;
    }
    public String getPostBodyType() {
        return this.postBodyType;
    }

    public DescribeApiDocResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiDocResponseBody setRequestBody(DescribeApiDocResponseBodyRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public DescribeApiDocResponseBodyRequestBody getRequestBody() {
        return this.requestBody;
    }

    public DescribeApiDocResponseBody setRequestHeaders(DescribeApiDocResponseBodyRequestHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public DescribeApiDocResponseBodyRequestHeaders getRequestHeaders() {
        return this.requestHeaders;
    }

    public DescribeApiDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiDocResponseBody setRequestQueries(DescribeApiDocResponseBodyRequestQueries requestQueries) {
        this.requestQueries = requestQueries;
        return this;
    }
    public DescribeApiDocResponseBodyRequestQueries getRequestQueries() {
        return this.requestQueries;
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

    public DescribeApiDocResponseBody setSdkDemos(DescribeApiDocResponseBodySdkDemos sdkDemos) {
        this.sdkDemos = sdkDemos;
        return this;
    }
    public DescribeApiDocResponseBodySdkDemos getSdkDemos() {
        return this.sdkDemos;
    }

    public DescribeApiDocResponseBody setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
        return this;
    }
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    public DescribeApiDocResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public static class DescribeApiDocResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

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

    public static class DescribeApiDocResponseBodyPathParametersPathParameter extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        public static DescribeApiDocResponseBodyPathParametersPathParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyPathParametersPathParameter self = new DescribeApiDocResponseBodyPathParametersPathParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyPathParametersPathParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiDocResponseBodyPathParametersPathParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiDocResponseBodyPathParametersPathParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeApiDocResponseBodyPathParameters extends TeaModel {
        @NameInMap("PathParameter")
        public java.util.List<DescribeApiDocResponseBodyPathParametersPathParameter> pathParameter;

        public static DescribeApiDocResponseBodyPathParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyPathParameters self = new DescribeApiDocResponseBodyPathParameters();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyPathParameters setPathParameter(java.util.List<DescribeApiDocResponseBodyPathParametersPathParameter> pathParameter) {
            this.pathParameter = pathParameter;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyPathParametersPathParameter> getPathParameter() {
            return this.pathParameter;
        }

    }

    public static class DescribeApiDocResponseBodyRequestBodyRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnumValue")
        public String enumValue;

        @NameInMap("JsonScheme")
        public String jsonScheme;

        @NameInMap("MaxLength")
        public Long maxLength;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("MinLength")
        public Long minLength;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("RegularExpression")
        public String regularExpression;

        @NameInMap("Required")
        public String required;

        public static DescribeApiDocResponseBodyRequestBodyRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestBodyRequestParam self = new DescribeApiDocResponseBodyRequestBodyRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiDocResponseBodyRequestBodyRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiDocResponseBodyRequestBody extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeApiDocResponseBodyRequestBodyRequestParam> requestParam;

        public static DescribeApiDocResponseBodyRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestBody self = new DescribeApiDocResponseBodyRequestBody();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestBody setRequestParam(java.util.List<DescribeApiDocResponseBodyRequestBodyRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyRequestBodyRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeApiDocResponseBodyRequestHeadersRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnumValue")
        public String enumValue;

        @NameInMap("JsonScheme")
        public String jsonScheme;

        @NameInMap("MaxLength")
        public Long maxLength;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("MinLength")
        public Long minLength;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("RegularExpression")
        public String regularExpression;

        @NameInMap("Required")
        public String required;

        public static DescribeApiDocResponseBodyRequestHeadersRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestHeadersRequestParam self = new DescribeApiDocResponseBodyRequestHeadersRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiDocResponseBodyRequestHeadersRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiDocResponseBodyRequestHeaders extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeApiDocResponseBodyRequestHeadersRequestParam> requestParam;

        public static DescribeApiDocResponseBodyRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestHeaders self = new DescribeApiDocResponseBodyRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestHeaders setRequestParam(java.util.List<DescribeApiDocResponseBodyRequestHeadersRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyRequestHeadersRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeApiDocResponseBodyRequestQueriesRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnumValue")
        public String enumValue;

        @NameInMap("JsonScheme")
        public String jsonScheme;

        @NameInMap("MaxLength")
        public Long maxLength;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("MinLength")
        public Long minLength;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("RegularExpression")
        public String regularExpression;

        @NameInMap("Required")
        public String required;

        public static DescribeApiDocResponseBodyRequestQueriesRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestQueriesRequestParam self = new DescribeApiDocResponseBodyRequestQueriesRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeApiDocResponseBodyRequestQueriesRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class DescribeApiDocResponseBodyRequestQueries extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeApiDocResponseBodyRequestQueriesRequestParam> requestParam;

        public static DescribeApiDocResponseBodyRequestQueries build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodyRequestQueries self = new DescribeApiDocResponseBodyRequestQueries();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodyRequestQueries setRequestParam(java.util.List<DescribeApiDocResponseBodyRequestQueriesRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodyRequestQueriesRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeApiDocResponseBodyResultDescriptionsResultDescription extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("HasChild")
        public Boolean hasChild;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

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

    public static class DescribeApiDocResponseBodySdkDemosSdkDemo extends TeaModel {
        @NameInMap("CallDemo")
        public String callDemo;

        @NameInMap("IdeKey")
        public String ideKey;

        public static DescribeApiDocResponseBodySdkDemosSdkDemo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodySdkDemosSdkDemo self = new DescribeApiDocResponseBodySdkDemosSdkDemo();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodySdkDemosSdkDemo setCallDemo(String callDemo) {
            this.callDemo = callDemo;
            return this;
        }
        public String getCallDemo() {
            return this.callDemo;
        }

        public DescribeApiDocResponseBodySdkDemosSdkDemo setIdeKey(String ideKey) {
            this.ideKey = ideKey;
            return this;
        }
        public String getIdeKey() {
            return this.ideKey;
        }

    }

    public static class DescribeApiDocResponseBodySdkDemos extends TeaModel {
        @NameInMap("SdkDemo")
        public java.util.List<DescribeApiDocResponseBodySdkDemosSdkDemo> sdkDemo;

        public static DescribeApiDocResponseBodySdkDemos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiDocResponseBodySdkDemos self = new DescribeApiDocResponseBodySdkDemos();
            return TeaModel.build(map, self);
        }

        public DescribeApiDocResponseBodySdkDemos setSdkDemo(java.util.List<DescribeApiDocResponseBodySdkDemosSdkDemo> sdkDemo) {
            this.sdkDemo = sdkDemo;
            return this;
        }
        public java.util.List<DescribeApiDocResponseBodySdkDemosSdkDemo> getSdkDemo() {
            return this.sdkDemo;
        }

    }

}
