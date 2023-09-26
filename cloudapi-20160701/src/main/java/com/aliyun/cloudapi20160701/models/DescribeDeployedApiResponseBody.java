// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeDeployedApiResponseBody extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BodyFormat")
    public String bodyFormat;

    @NameInMap("ConstantParameters")
    public DescribeDeployedApiResponseBodyConstantParameters constantParameters;

    @NameInMap("DeployedTime")
    public String deployedTime;

    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("ErrorCodeSamples")
    public DescribeDeployedApiResponseBodyErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    @NameInMap("FunctionComputeConfig")
    public DescribeDeployedApiResponseBodyFunctionComputeConfig functionComputeConfig;

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
    public DescribeDeployedApiResponseBodyPathParameters pathParameters;

    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    @NameInMap("PostBodyType")
    public String postBodyType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestBody")
    public DescribeDeployedApiResponseBodyRequestBody requestBody;

    @NameInMap("RequestHeaders")
    public DescribeDeployedApiResponseBodyRequestHeaders requestHeaders;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("RequestQueries")
    public DescribeDeployedApiResponseBodyRequestQueries requestQueries;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("ServiceAddress")
    public String serviceAddress;

    @NameInMap("ServiceFCEnable")
    public String serviceFCEnable;

    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    @NameInMap("ServiceVpcEnable")
    public String serviceVpcEnable;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("SystemParameters")
    public DescribeDeployedApiResponseBodySystemParameters systemParameters;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("VpcName")
    public String vpcName;

    public static DescribeDeployedApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApiResponseBody self = new DescribeDeployedApiResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDeployedApiResponseBody setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
        return this;
    }
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    public DescribeDeployedApiResponseBody setConstantParameters(DescribeDeployedApiResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeDeployedApiResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
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

    public DescribeDeployedApiResponseBody setFunctionComputeConfig(DescribeDeployedApiResponseBodyFunctionComputeConfig functionComputeConfig) {
        this.functionComputeConfig = functionComputeConfig;
        return this;
    }
    public DescribeDeployedApiResponseBodyFunctionComputeConfig getFunctionComputeConfig() {
        return this.functionComputeConfig;
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

    public DescribeDeployedApiResponseBody setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public DescribeDeployedApiResponseBody setHttpProtocol(String httpProtocol) {
        this.httpProtocol = httpProtocol;
        return this;
    }
    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    public DescribeDeployedApiResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeDeployedApiResponseBody setPathParameters(DescribeDeployedApiResponseBodyPathParameters pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public DescribeDeployedApiResponseBodyPathParameters getPathParameters() {
        return this.pathParameters;
    }

    public DescribeDeployedApiResponseBody setPostBodyDescription(String postBodyDescription) {
        this.postBodyDescription = postBodyDescription;
        return this;
    }
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    public DescribeDeployedApiResponseBody setPostBodyType(String postBodyType) {
        this.postBodyType = postBodyType;
        return this;
    }
    public String getPostBodyType() {
        return this.postBodyType;
    }

    public DescribeDeployedApiResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeployedApiResponseBody setRequestBody(DescribeDeployedApiResponseBodyRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public DescribeDeployedApiResponseBodyRequestBody getRequestBody() {
        return this.requestBody;
    }

    public DescribeDeployedApiResponseBody setRequestHeaders(DescribeDeployedApiResponseBodyRequestHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public DescribeDeployedApiResponseBodyRequestHeaders getRequestHeaders() {
        return this.requestHeaders;
    }

    public DescribeDeployedApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployedApiResponseBody setRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }
    public String getRequestMode() {
        return this.requestMode;
    }

    public DescribeDeployedApiResponseBody setRequestQueries(DescribeDeployedApiResponseBodyRequestQueries requestQueries) {
        this.requestQueries = requestQueries;
        return this;
    }
    public DescribeDeployedApiResponseBodyRequestQueries getRequestQueries() {
        return this.requestQueries;
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

    public DescribeDeployedApiResponseBody setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public DescribeDeployedApiResponseBody setServiceFCEnable(String serviceFCEnable) {
        this.serviceFCEnable = serviceFCEnable;
        return this;
    }
    public String getServiceFCEnable() {
        return this.serviceFCEnable;
    }

    public DescribeDeployedApiResponseBody setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public DescribeDeployedApiResponseBody setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
        return this;
    }
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    public DescribeDeployedApiResponseBody setServiceVpcEnable(String serviceVpcEnable) {
        this.serviceVpcEnable = serviceVpcEnable;
        return this;
    }
    public String getServiceVpcEnable() {
        return this.serviceVpcEnable;
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

    public DescribeDeployedApiResponseBody setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public static class DescribeDeployedApiResponseBodyConstantParametersConstantParameter extends TeaModel {
        @NameInMap("ConstantValue")
        public String constantValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Location")
        public String location;

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

    public static class DescribeDeployedApiResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

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

    public static class DescribeDeployedApiResponseBodyFunctionComputeConfig extends TeaModel {
        @NameInMap("FcRegionId")
        public String fcRegionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeDeployedApiResponseBodyFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyFunctionComputeConfig self = new DescribeDeployedApiResponseBodyFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyFunctionComputeConfig setFcRegionId(String fcRegionId) {
            this.fcRegionId = fcRegionId;
            return this;
        }
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        public DescribeDeployedApiResponseBodyFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDeployedApiResponseBodyFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeDeployedApiResponseBodyFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeDeployedApiResponseBodyPathParametersPathParameter extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyPathParametersPathParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyPathParametersPathParameter self = new DescribeDeployedApiResponseBodyPathParametersPathParameter();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyPathParametersPathParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeDeployedApiResponseBodyPathParametersPathParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyPathParametersPathParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyPathParametersPathParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyPathParameters extends TeaModel {
        @NameInMap("PathParameter")
        public java.util.List<DescribeDeployedApiResponseBodyPathParametersPathParameter> pathParameter;

        public static DescribeDeployedApiResponseBodyPathParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyPathParameters self = new DescribeDeployedApiResponseBodyPathParameters();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyPathParameters setPathParameter(java.util.List<DescribeDeployedApiResponseBodyPathParametersPathParameter> pathParameter) {
            this.pathParameter = pathParameter;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyPathParametersPathParameter> getPathParameter() {
            return this.pathParameter;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestBodyRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocOrder")
        public String docOrder;

        @NameInMap("DocShow")
        public String docShow;

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

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyRequestBodyRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestBodyRequestParam self = new DescribeDeployedApiResponseBodyRequestBodyRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeDeployedApiResponseBodyRequestBodyRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestBody extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeDeployedApiResponseBodyRequestBodyRequestParam> requestParam;

        public static DescribeDeployedApiResponseBodyRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestBody self = new DescribeDeployedApiResponseBodyRequestBody();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestBody setRequestParam(java.util.List<DescribeDeployedApiResponseBodyRequestBodyRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyRequestBodyRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestHeadersRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocOrder")
        public String docOrder;

        @NameInMap("DocShow")
        public String docShow;

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

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyRequestHeadersRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestHeadersRequestParam self = new DescribeDeployedApiResponseBodyRequestHeadersRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeDeployedApiResponseBodyRequestHeadersRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestHeaders extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeDeployedApiResponseBodyRequestHeadersRequestParam> requestParam;

        public static DescribeDeployedApiResponseBodyRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestHeaders self = new DescribeDeployedApiResponseBodyRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestHeaders setRequestParam(java.util.List<DescribeDeployedApiResponseBodyRequestHeadersRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyRequestHeadersRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestQueriesRequestParam extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocOrder")
        public String docOrder;

        @NameInMap("DocShow")
        public String docShow;

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

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeDeployedApiResponseBodyRequestQueriesRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestQueriesRequestParam self = new DescribeDeployedApiResponseBodyRequestQueriesRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeDeployedApiResponseBodyRequestQueriesRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeDeployedApiResponseBodyRequestQueries extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeDeployedApiResponseBodyRequestQueriesRequestParam> requestParam;

        public static DescribeDeployedApiResponseBodyRequestQueries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApiResponseBodyRequestQueries self = new DescribeDeployedApiResponseBodyRequestQueries();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApiResponseBodyRequestQueries setRequestParam(java.util.List<DescribeDeployedApiResponseBodyRequestQueriesRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeDeployedApiResponseBodyRequestQueriesRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeDeployedApiResponseBodySystemParametersSystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Location")
        public String location;

        @NameInMap("ParameterName")
        public String parameterName;

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
