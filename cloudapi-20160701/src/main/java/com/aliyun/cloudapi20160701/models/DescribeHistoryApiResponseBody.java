// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeHistoryApiResponseBody extends TeaModel {
    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BodyFormat")
    public String bodyFormat;

    @NameInMap("ConstantParameters")
    public DescribeHistoryApiResponseBodyConstantParameters constantParameters;

    @NameInMap("CustomSystemParameters")
    public DescribeHistoryApiResponseBodyCustomSystemParameters customSystemParameters;

    @NameInMap("DeployedTime")
    public String deployedTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ErrorCodeSamples")
    public DescribeHistoryApiResponseBodyErrorCodeSamples errorCodeSamples;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("FunctionComputeConfig")
    public DescribeHistoryApiResponseBodyFunctionComputeConfig functionComputeConfig;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("HttpMethod")
    public String httpMethod;

    @NameInMap("HttpProtocol")
    public String httpProtocol;

    @NameInMap("Mock")
    public String mock;

    @NameInMap("MockResult")
    public String mockResult;

    @NameInMap("OpenIdConnectConfig")
    public DescribeHistoryApiResponseBodyOpenIdConnectConfig openIdConnectConfig;

    @NameInMap("OriginResultDescription")
    public String originResultDescription;

    @NameInMap("Path")
    public String path;

    @NameInMap("PathParameters")
    public DescribeHistoryApiResponseBodyPathParameters pathParameters;

    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    @NameInMap("PostBodyType")
    public String postBodyType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestBody")
    public DescribeHistoryApiResponseBodyRequestBody requestBody;

    @NameInMap("RequestHeaders")
    public DescribeHistoryApiResponseBodyRequestHeaders requestHeaders;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestMode")
    public String requestMode;

    @NameInMap("RequestQueries")
    public DescribeHistoryApiResponseBodyRequestQueries requestQueries;

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

    @NameInMap("Status")
    public String status;

    @NameInMap("SystemParameters")
    public DescribeHistoryApiResponseBodySystemParameters systemParameters;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("VpcName")
    public String vpcName;

    public static DescribeHistoryApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryApiResponseBody self = new DescribeHistoryApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryApiResponseBody setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public DescribeHistoryApiResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeHistoryApiResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeHistoryApiResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeHistoryApiResponseBody setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
        return this;
    }
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    public DescribeHistoryApiResponseBody setConstantParameters(DescribeHistoryApiResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeHistoryApiResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeHistoryApiResponseBody setCustomSystemParameters(DescribeHistoryApiResponseBodyCustomSystemParameters customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
        return this;
    }
    public DescribeHistoryApiResponseBodyCustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    public DescribeHistoryApiResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
    }

    public DescribeHistoryApiResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeHistoryApiResponseBody setErrorCodeSamples(DescribeHistoryApiResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeHistoryApiResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeHistoryApiResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeHistoryApiResponseBody setFunctionComputeConfig(DescribeHistoryApiResponseBodyFunctionComputeConfig functionComputeConfig) {
        this.functionComputeConfig = functionComputeConfig;
        return this;
    }
    public DescribeHistoryApiResponseBodyFunctionComputeConfig getFunctionComputeConfig() {
        return this.functionComputeConfig;
    }

    public DescribeHistoryApiResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeHistoryApiResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeHistoryApiResponseBody setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public DescribeHistoryApiResponseBody setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public DescribeHistoryApiResponseBody setHttpProtocol(String httpProtocol) {
        this.httpProtocol = httpProtocol;
        return this;
    }
    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    public DescribeHistoryApiResponseBody setMock(String mock) {
        this.mock = mock;
        return this;
    }
    public String getMock() {
        return this.mock;
    }

    public DescribeHistoryApiResponseBody setMockResult(String mockResult) {
        this.mockResult = mockResult;
        return this;
    }
    public String getMockResult() {
        return this.mockResult;
    }

    public DescribeHistoryApiResponseBody setOpenIdConnectConfig(DescribeHistoryApiResponseBodyOpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public DescribeHistoryApiResponseBodyOpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public DescribeHistoryApiResponseBody setOriginResultDescription(String originResultDescription) {
        this.originResultDescription = originResultDescription;
        return this;
    }
    public String getOriginResultDescription() {
        return this.originResultDescription;
    }

    public DescribeHistoryApiResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeHistoryApiResponseBody setPathParameters(DescribeHistoryApiResponseBodyPathParameters pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public DescribeHistoryApiResponseBodyPathParameters getPathParameters() {
        return this.pathParameters;
    }

    public DescribeHistoryApiResponseBody setPostBodyDescription(String postBodyDescription) {
        this.postBodyDescription = postBodyDescription;
        return this;
    }
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    public DescribeHistoryApiResponseBody setPostBodyType(String postBodyType) {
        this.postBodyType = postBodyType;
        return this;
    }
    public String getPostBodyType() {
        return this.postBodyType;
    }

    public DescribeHistoryApiResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryApiResponseBody setRequestBody(DescribeHistoryApiResponseBodyRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public DescribeHistoryApiResponseBodyRequestBody getRequestBody() {
        return this.requestBody;
    }

    public DescribeHistoryApiResponseBody setRequestHeaders(DescribeHistoryApiResponseBodyRequestHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public DescribeHistoryApiResponseBodyRequestHeaders getRequestHeaders() {
        return this.requestHeaders;
    }

    public DescribeHistoryApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryApiResponseBody setRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }
    public String getRequestMode() {
        return this.requestMode;
    }

    public DescribeHistoryApiResponseBody setRequestQueries(DescribeHistoryApiResponseBodyRequestQueries requestQueries) {
        this.requestQueries = requestQueries;
        return this;
    }
    public DescribeHistoryApiResponseBodyRequestQueries getRequestQueries() {
        return this.requestQueries;
    }

    public DescribeHistoryApiResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeHistoryApiResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeHistoryApiResponseBody setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public DescribeHistoryApiResponseBody setServiceFCEnable(String serviceFCEnable) {
        this.serviceFCEnable = serviceFCEnable;
        return this;
    }
    public String getServiceFCEnable() {
        return this.serviceFCEnable;
    }

    public DescribeHistoryApiResponseBody setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public DescribeHistoryApiResponseBody setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
        return this;
    }
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    public DescribeHistoryApiResponseBody setServiceVpcEnable(String serviceVpcEnable) {
        this.serviceVpcEnable = serviceVpcEnable;
        return this;
    }
    public String getServiceVpcEnable() {
        return this.serviceVpcEnable;
    }

    public DescribeHistoryApiResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHistoryApiResponseBody setSystemParameters(DescribeHistoryApiResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeHistoryApiResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public DescribeHistoryApiResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public DescribeHistoryApiResponseBody setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public static class DescribeHistoryApiResponseBodyConstantParametersConstantParameter extends TeaModel {
        @NameInMap("ConstantValue")
        public String constantValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Location")
        public String location;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeHistoryApiResponseBodyConstantParametersConstantParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyConstantParametersConstantParameter self = new DescribeHistoryApiResponseBodyConstantParametersConstantParameter();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyConstantParametersConstantParameter setConstantValue(String constantValue) {
            this.constantValue = constantValue;
            return this;
        }
        public String getConstantValue() {
            return this.constantValue;
        }

        public DescribeHistoryApiResponseBodyConstantParametersConstantParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyConstantParametersConstantParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeHistoryApiResponseBodyConstantParametersConstantParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyConstantParameters extends TeaModel {
        @NameInMap("ConstantParameter")
        public java.util.List<DescribeHistoryApiResponseBodyConstantParametersConstantParameter> constantParameter;

        public static DescribeHistoryApiResponseBodyConstantParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyConstantParameters self = new DescribeHistoryApiResponseBodyConstantParameters();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyConstantParameters setConstantParameter(java.util.List<DescribeHistoryApiResponseBodyConstantParametersConstantParameter> constantParameter) {
            this.constantParameter = constantParameter;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyConstantParametersConstantParameter> getConstantParameter() {
            return this.constantParameter;
        }

    }

    public static class DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter extends TeaModel {
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

        public static DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter self = new DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyCustomSystemParameters extends TeaModel {
        @NameInMap("CustomSystemParameter")
        public java.util.List<DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter;

        public static DescribeHistoryApiResponseBodyCustomSystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyCustomSystemParameters self = new DescribeHistoryApiResponseBodyCustomSystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyCustomSystemParameters setCustomSystemParameter(java.util.List<DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter> customSystemParameter) {
            this.customSystemParameter = customSystemParameter;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyCustomSystemParametersCustomSystemParameter> getCustomSystemParameter() {
            return this.customSystemParameter;
        }

    }

    public static class DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("Message")
        public String message;

        public static DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample self = new DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeHistoryApiResponseBodyErrorCodeSamples extends TeaModel {
        @NameInMap("ErrorCodeSample")
        public java.util.List<DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample;

        public static DescribeHistoryApiResponseBodyErrorCodeSamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyErrorCodeSamples self = new DescribeHistoryApiResponseBodyErrorCodeSamples();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyErrorCodeSamples setErrorCodeSample(java.util.List<DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample> errorCodeSample) {
            this.errorCodeSample = errorCodeSample;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyErrorCodeSamplesErrorCodeSample> getErrorCodeSample() {
            return this.errorCodeSample;
        }

    }

    public static class DescribeHistoryApiResponseBodyFunctionComputeConfig extends TeaModel {
        @NameInMap("FcRegionId")
        public String fcRegionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeHistoryApiResponseBodyFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyFunctionComputeConfig self = new DescribeHistoryApiResponseBodyFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyFunctionComputeConfig setFcRegionId(String fcRegionId) {
            this.fcRegionId = fcRegionId;
            return this;
        }
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        public DescribeHistoryApiResponseBodyFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeHistoryApiResponseBodyFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeHistoryApiResponseBodyFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeHistoryApiResponseBodyOpenIdConnectConfig extends TeaModel {
        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        @NameInMap("PublicKey")
        public String publicKey;

        @NameInMap("PublicKeyId")
        public String publicKeyId;

        public static DescribeHistoryApiResponseBodyOpenIdConnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyOpenIdConnectConfig self = new DescribeHistoryApiResponseBodyOpenIdConnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyOpenIdConnectConfig setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
            return this;
        }
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        public DescribeHistoryApiResponseBodyOpenIdConnectConfig setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
            return this;
        }
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        public DescribeHistoryApiResponseBodyOpenIdConnectConfig setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public DescribeHistoryApiResponseBodyOpenIdConnectConfig setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

    }

    public static class DescribeHistoryApiResponseBodyPathParametersPathParameter extends TeaModel {
        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        public static DescribeHistoryApiResponseBodyPathParametersPathParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyPathParametersPathParameter self = new DescribeHistoryApiResponseBodyPathParametersPathParameter();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyPathParametersPathParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeHistoryApiResponseBodyPathParametersPathParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodyPathParametersPathParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyPathParametersPathParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyPathParameters extends TeaModel {
        @NameInMap("PathParameter")
        public java.util.List<DescribeHistoryApiResponseBodyPathParametersPathParameter> pathParameter;

        public static DescribeHistoryApiResponseBodyPathParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyPathParameters self = new DescribeHistoryApiResponseBodyPathParameters();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyPathParameters setPathParameter(java.util.List<DescribeHistoryApiResponseBodyPathParametersPathParameter> pathParameter) {
            this.pathParameter = pathParameter;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyPathParametersPathParameter> getPathParameter() {
            return this.pathParameter;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestBodyRequestParam extends TeaModel {
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

        public static DescribeHistoryApiResponseBodyRequestBodyRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestBodyRequestParam self = new DescribeHistoryApiResponseBodyRequestBodyRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeHistoryApiResponseBodyRequestBodyRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestBody extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeHistoryApiResponseBodyRequestBodyRequestParam> requestParam;

        public static DescribeHistoryApiResponseBodyRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestBody self = new DescribeHistoryApiResponseBodyRequestBody();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestBody setRequestParam(java.util.List<DescribeHistoryApiResponseBodyRequestBodyRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyRequestBodyRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestHeadersRequestParam extends TeaModel {
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

        public static DescribeHistoryApiResponseBodyRequestHeadersRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestHeadersRequestParam self = new DescribeHistoryApiResponseBodyRequestHeadersRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeHistoryApiResponseBodyRequestHeadersRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestHeaders extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeHistoryApiResponseBodyRequestHeadersRequestParam> requestParam;

        public static DescribeHistoryApiResponseBodyRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestHeaders self = new DescribeHistoryApiResponseBodyRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestHeaders setRequestParam(java.util.List<DescribeHistoryApiResponseBodyRequestHeadersRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyRequestHeadersRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestQueriesRequestParam extends TeaModel {
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

        public static DescribeHistoryApiResponseBodyRequestQueriesRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestQueriesRequestParam self = new DescribeHistoryApiResponseBodyRequestQueriesRequestParam();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setDocOrder(String docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public String getDocOrder() {
            return this.docOrder;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setParameterType(String parameterType) {
            this.parameterType = parameterType;
            return this;
        }
        public String getParameterType() {
            return this.parameterType;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setRegularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            return this;
        }
        public String getRegularExpression() {
            return this.regularExpression;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeHistoryApiResponseBodyRequestQueriesRequestParam setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodyRequestQueries extends TeaModel {
        @NameInMap("RequestParam")
        public java.util.List<DescribeHistoryApiResponseBodyRequestQueriesRequestParam> requestParam;

        public static DescribeHistoryApiResponseBodyRequestQueries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodyRequestQueries self = new DescribeHistoryApiResponseBodyRequestQueries();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodyRequestQueries setRequestParam(java.util.List<DescribeHistoryApiResponseBodyRequestQueriesRequestParam> requestParam) {
            this.requestParam = requestParam;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodyRequestQueriesRequestParam> getRequestParam() {
            return this.requestParam;
        }

    }

    public static class DescribeHistoryApiResponseBodySystemParametersSystemParameter extends TeaModel {
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

        public static DescribeHistoryApiResponseBodySystemParametersSystemParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodySystemParametersSystemParameter self = new DescribeHistoryApiResponseBodySystemParametersSystemParameter();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodySystemParametersSystemParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeHistoryApiResponseBodySystemParametersSystemParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHistoryApiResponseBodySystemParametersSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeHistoryApiResponseBodySystemParametersSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeHistoryApiResponseBodySystemParametersSystemParameter setServiceParameterName(String serviceParameterName) {
            this.serviceParameterName = serviceParameterName;
            return this;
        }
        public String getServiceParameterName() {
            return this.serviceParameterName;
        }

    }

    public static class DescribeHistoryApiResponseBodySystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        public java.util.List<DescribeHistoryApiResponseBodySystemParametersSystemParameter> systemParameter;

        public static DescribeHistoryApiResponseBodySystemParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryApiResponseBodySystemParameters self = new DescribeHistoryApiResponseBodySystemParameters();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryApiResponseBodySystemParameters setSystemParameter(java.util.List<DescribeHistoryApiResponseBodySystemParametersSystemParameter> systemParameter) {
            this.systemParameter = systemParameter;
            return this;
        }
        public java.util.List<DescribeHistoryApiResponseBodySystemParametersSystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

    }

}
