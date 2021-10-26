// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoryResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("WebSocketApiType")
    public String webSocketApiType;

    @NameInMap("DisableInternet")
    public Boolean disableInternet;

    @NameInMap("ResultBodyModel")
    public String resultBodyModel;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("AppCodeAuthType")
    public String appCodeAuthType;

    @NameInMap("AllowSignatureMethod")
    public String allowSignatureMethod;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ForceNonceCheck")
    public Boolean forceNonceCheck;

    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("FailResultSample")
    public String failResultSample;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("DeployedTime")
    public String deployedTime;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("HistoryVersion")
    public String historyVersion;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("RequestConfig")
    public DescribeApiHistoryResponseBodyRequestConfig requestConfig;

    @NameInMap("ServiceConfig")
    public DescribeApiHistoryResponseBodyServiceConfig serviceConfig;

    @NameInMap("OpenIdConnectConfig")
    public DescribeApiHistoryResponseBodyOpenIdConnectConfig openIdConnectConfig;

    @NameInMap("ErrorCodeSamples")
    public DescribeApiHistoryResponseBodyErrorCodeSamples errorCodeSamples;

    @NameInMap("ResultDescriptions")
    public DescribeApiHistoryResponseBodyResultDescriptions resultDescriptions;

    @NameInMap("SystemParameters")
    public DescribeApiHistoryResponseBodySystemParameters systemParameters;

    @NameInMap("CustomSystemParameters")
    public DescribeApiHistoryResponseBodyCustomSystemParameters customSystemParameters;

    @NameInMap("ConstantParameters")
    public DescribeApiHistoryResponseBodyConstantParameters constantParameters;

    @NameInMap("RequestParameters")
    public DescribeApiHistoryResponseBodyRequestParameters requestParameters;

    @NameInMap("ServiceParameters")
    public DescribeApiHistoryResponseBodyServiceParameters serviceParameters;

    @NameInMap("ServiceParametersMap")
    public DescribeApiHistoryResponseBodyServiceParametersMap serviceParametersMap;

    public static DescribeApiHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoryResponseBody self = new DescribeApiHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiHistoryResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiHistoryResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public DescribeApiHistoryResponseBody setWebSocketApiType(String webSocketApiType) {
        this.webSocketApiType = webSocketApiType;
        return this;
    }
    public String getWebSocketApiType() {
        return this.webSocketApiType;
    }

    public DescribeApiHistoryResponseBody setDisableInternet(Boolean disableInternet) {
        this.disableInternet = disableInternet;
        return this;
    }
    public Boolean getDisableInternet() {
        return this.disableInternet;
    }

    public DescribeApiHistoryResponseBody setResultBodyModel(String resultBodyModel) {
        this.resultBodyModel = resultBodyModel;
        return this;
    }
    public String getResultBodyModel() {
        return this.resultBodyModel;
    }

    public DescribeApiHistoryResponseBody setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public DescribeApiHistoryResponseBody setAppCodeAuthType(String appCodeAuthType) {
        this.appCodeAuthType = appCodeAuthType;
        return this;
    }
    public String getAppCodeAuthType() {
        return this.appCodeAuthType;
    }

    public DescribeApiHistoryResponseBody setAllowSignatureMethod(String allowSignatureMethod) {
        this.allowSignatureMethod = allowSignatureMethod;
        return this;
    }
    public String getAllowSignatureMethod() {
        return this.allowSignatureMethod;
    }

    public DescribeApiHistoryResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiHistoryResponseBody setForceNonceCheck(Boolean forceNonceCheck) {
        this.forceNonceCheck = forceNonceCheck;
        return this;
    }
    public Boolean getForceNonceCheck() {
        return this.forceNonceCheck;
    }

    public DescribeApiHistoryResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public DescribeApiHistoryResponseBody setFailResultSample(String failResultSample) {
        this.failResultSample = failResultSample;
        return this;
    }
    public String getFailResultSample() {
        return this.failResultSample;
    }

    public DescribeApiHistoryResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeApiHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiHistoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiHistoryResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiHistoryResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiHistoryResponseBody setDeployedTime(String deployedTime) {
        this.deployedTime = deployedTime;
        return this;
    }
    public String getDeployedTime() {
        return this.deployedTime;
    }

    public DescribeApiHistoryResponseBody setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiHistoryResponseBody setHistoryVersion(String historyVersion) {
        this.historyVersion = historyVersion;
        return this;
    }
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public DescribeApiHistoryResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApiHistoryResponseBody setRequestConfig(DescribeApiHistoryResponseBodyRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyRequestConfig getRequestConfig() {
        return this.requestConfig;
    }

    public DescribeApiHistoryResponseBody setServiceConfig(DescribeApiHistoryResponseBodyServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    public DescribeApiHistoryResponseBody setOpenIdConnectConfig(DescribeApiHistoryResponseBodyOpenIdConnectConfig openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
        return this;
    }
    public DescribeApiHistoryResponseBodyOpenIdConnectConfig getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    public DescribeApiHistoryResponseBody setErrorCodeSamples(DescribeApiHistoryResponseBodyErrorCodeSamples errorCodeSamples) {
        this.errorCodeSamples = errorCodeSamples;
        return this;
    }
    public DescribeApiHistoryResponseBodyErrorCodeSamples getErrorCodeSamples() {
        return this.errorCodeSamples;
    }

    public DescribeApiHistoryResponseBody setResultDescriptions(DescribeApiHistoryResponseBodyResultDescriptions resultDescriptions) {
        this.resultDescriptions = resultDescriptions;
        return this;
    }
    public DescribeApiHistoryResponseBodyResultDescriptions getResultDescriptions() {
        return this.resultDescriptions;
    }

    public DescribeApiHistoryResponseBody setSystemParameters(DescribeApiHistoryResponseBodySystemParameters systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodySystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public DescribeApiHistoryResponseBody setCustomSystemParameters(DescribeApiHistoryResponseBodyCustomSystemParameters customSystemParameters) {
        this.customSystemParameters = customSystemParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyCustomSystemParameters getCustomSystemParameters() {
        return this.customSystemParameters;
    }

    public DescribeApiHistoryResponseBody setConstantParameters(DescribeApiHistoryResponseBodyConstantParameters constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyConstantParameters getConstantParameters() {
        return this.constantParameters;
    }

    public DescribeApiHistoryResponseBody setRequestParameters(DescribeApiHistoryResponseBodyRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }
    public DescribeApiHistoryResponseBodyRequestParameters getRequestParameters() {
        return this.requestParameters;
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

    public static class DescribeApiHistoryResponseBodyRequestConfig extends TeaModel {
        @NameInMap("BodyModel")
        public String bodyModel;

        @NameInMap("RequestPath")
        public String requestPath;

        @NameInMap("RequestHttpMethod")
        public String requestHttpMethod;

        @NameInMap("BodyFormat")
        public String bodyFormat;

        @NameInMap("RequestMode")
        public String requestMode;

        @NameInMap("PostBodyDescription")
        public String postBodyDescription;

        @NameInMap("RequestProtocol")
        public String requestProtocol;

        public static DescribeApiHistoryResponseBodyRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyRequestConfig self = new DescribeApiHistoryResponseBodyRequestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyRequestConfig setBodyModel(String bodyModel) {
            this.bodyModel = bodyModel;
            return this;
        }
        public String getBodyModel() {
            return this.bodyModel;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public String getRequestPath() {
            return this.requestPath;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestHttpMethod(String requestHttpMethod) {
            this.requestHttpMethod = requestHttpMethod;
            return this;
        }
        public String getRequestHttpMethod() {
            return this.requestHttpMethod;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setBodyFormat(String bodyFormat) {
            this.bodyFormat = bodyFormat;
            return this;
        }
        public String getBodyFormat() {
            return this.bodyFormat;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestMode(String requestMode) {
            this.requestMode = requestMode;
            return this;
        }
        public String getRequestMode() {
            return this.requestMode;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setPostBodyDescription(String postBodyDescription) {
            this.postBodyDescription = postBodyDescription;
            return this;
        }
        public String getPostBodyDescription() {
            return this.postBodyDescription;
        }

        public DescribeApiHistoryResponseBodyRequestConfig setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader extends TeaModel {
        @NameInMap("HeaderValue")
        public String headerValue;

        @NameInMap("HeaderName")
        public String headerName;

        public static DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader self = new DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

        public DescribeApiHistoryResponseBodyServiceConfigMockHeadersMockHeader setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
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

    public static class DescribeApiHistoryResponseBodyServiceConfigVpcConfig extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcScheme")
        public String vpcScheme;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Name")
        public String name;

        public static DescribeApiHistoryResponseBodyServiceConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigVpcConfig self = new DescribeApiHistoryResponseBodyServiceConfigVpcConfig();
            return TeaModel.build(map, self);
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

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig extends TeaModel {
        @NameInMap("FcType")
        public String fcType;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Method")
        public String method;

        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        @NameInMap("Path")
        public String path;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Qualifier")
        public String qualifier;

        public static DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig self = new DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFcType(String fcType) {
            this.fcType = fcType;
            return this;
        }
        public String getFcType() {
            return this.fcType;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFcBaseUrl(String fcBaseUrl) {
            this.fcBaseUrl = fcBaseUrl;
            return this;
        }
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setOnlyBusinessPath(Boolean onlyBusinessPath) {
            this.onlyBusinessPath = onlyBusinessPath;
            return this;
        }
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfigOssConfig extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Action")
        public String action;

        @NameInMap("OssRegionId")
        public String ossRegionId;

        @NameInMap("BucketName")
        public String bucketName;

        public static DescribeApiHistoryResponseBodyServiceConfigOssConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfigOssConfig self = new DescribeApiHistoryResponseBodyServiceConfigOssConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setOssRegionId(String ossRegionId) {
            this.ossRegionId = ossRegionId;
            return this;
        }
        public String getOssRegionId() {
            return this.ossRegionId;
        }

        public DescribeApiHistoryResponseBodyServiceConfigOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

    }

    public static class DescribeApiHistoryResponseBodyServiceConfig extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("MockStatusCode")
        public Integer mockStatusCode;

        @NameInMap("ContentTypeValue")
        public String contentTypeValue;

        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        @NameInMap("ServicePath")
        public String servicePath;

        @NameInMap("ContentTypeCatagory")
        public String contentTypeCatagory;

        @NameInMap("ServiceAddress")
        public String serviceAddress;

        @NameInMap("Mock")
        public String mock;

        @NameInMap("ServiceVpcEnable")
        public String serviceVpcEnable;

        @NameInMap("MockResult")
        public String mockResult;

        @NameInMap("ServiceHttpMethod")
        public String serviceHttpMethod;

        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        @NameInMap("MockHeaders")
        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders mockHeaders;

        @NameInMap("VpcConfig")
        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig vpcConfig;

        @NameInMap("FunctionComputeConfig")
        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig;

        @NameInMap("OssConfig")
        public DescribeApiHistoryResponseBodyServiceConfigOssConfig ossConfig;

        public static DescribeApiHistoryResponseBodyServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyServiceConfig self = new DescribeApiHistoryResponseBodyServiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyServiceConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockStatusCode(Integer mockStatusCode) {
            this.mockStatusCode = mockStatusCode;
            return this;
        }
        public Integer getMockStatusCode() {
            return this.mockStatusCode;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setContentTypeValue(String contentTypeValue) {
            this.contentTypeValue = contentTypeValue;
            return this;
        }
        public String getContentTypeValue() {
            return this.contentTypeValue;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setContentTypeCatagory(String contentTypeCatagory) {
            this.contentTypeCatagory = contentTypeCatagory;
            return this;
        }
        public String getContentTypeCatagory() {
            return this.contentTypeCatagory;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMock(String mock) {
            this.mock = mock;
            return this;
        }
        public String getMock() {
            return this.mock;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceVpcEnable(String serviceVpcEnable) {
            this.serviceVpcEnable = serviceVpcEnable;
            return this;
        }
        public String getServiceVpcEnable() {
            return this.serviceVpcEnable;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }
        public String getMockResult() {
            return this.mockResult;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceHttpMethod(String serviceHttpMethod) {
            this.serviceHttpMethod = serviceHttpMethod;
            return this;
        }
        public String getServiceHttpMethod() {
            return this.serviceHttpMethod;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setMockHeaders(DescribeApiHistoryResponseBodyServiceConfigMockHeaders mockHeaders) {
            this.mockHeaders = mockHeaders;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigMockHeaders getMockHeaders() {
            return this.mockHeaders;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setVpcConfig(DescribeApiHistoryResponseBodyServiceConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setFunctionComputeConfig(DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigFunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        public DescribeApiHistoryResponseBodyServiceConfig setOssConfig(DescribeApiHistoryResponseBodyServiceConfigOssConfig ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public DescribeApiHistoryResponseBodyServiceConfigOssConfig getOssConfig() {
            return this.ossConfig;
        }

    }

    public static class DescribeApiHistoryResponseBodyOpenIdConnectConfig extends TeaModel {
        @NameInMap("OpenIdApiType")
        public String openIdApiType;

        @NameInMap("IdTokenParamName")
        public String idTokenParamName;

        @NameInMap("PublicKeyId")
        public String publicKeyId;

        @NameInMap("PublicKey")
        public String publicKey;

        public static DescribeApiHistoryResponseBodyOpenIdConnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyOpenIdConnectConfig self = new DescribeApiHistoryResponseBodyOpenIdConnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setOpenIdApiType(String openIdApiType) {
            this.openIdApiType = openIdApiType;
            return this;
        }
        public String getOpenIdApiType() {
            return this.openIdApiType;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setIdTokenParamName(String idTokenParamName) {
            this.idTokenParamName = idTokenParamName;
            return this;
        }
        public String getIdTokenParamName() {
            return this.idTokenParamName;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

        public DescribeApiHistoryResponseBodyOpenIdConnectConfig setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

    public static class DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Description")
        public String description;

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

        public DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeApiHistoryResponseBodyErrorCodeSamplesErrorCodeSample setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    public static class DescribeApiHistoryResponseBodyResultDescriptionsResultDescription extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Key")
        public String key;

        @NameInMap("HasChild")
        public Boolean hasChild;

        @NameInMap("Description")
        public String description;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeApiHistoryResponseBodyResultDescriptionsResultDescription build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyResultDescriptionsResultDescription self = new DescribeApiHistoryResponseBodyResultDescriptionsResultDescription();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setHasChild(Boolean hasChild) {
            this.hasChild = hasChild;
            return this;
        }
        public Boolean getHasChild() {
            return this.hasChild;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
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

        public DescribeApiHistoryResponseBodyResultDescriptionsResultDescription setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    public static class DescribeApiHistoryResponseBodySystemParametersSystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("Location")
        public String location;

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

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiHistoryResponseBodySystemParametersSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
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

    public static class DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("Location")
        public String location;

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

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeApiHistoryResponseBodyCustomSystemParametersCustomSystemParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
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

    public static class DescribeApiHistoryResponseBodyConstantParametersConstantParameter extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Location")
        public String location;

        @NameInMap("ServiceParameterName")
        public String serviceParameterName;

        @NameInMap("ConstantValue")
        public String constantValue;

        public static DescribeApiHistoryResponseBodyConstantParametersConstantParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyConstantParametersConstantParameter self = new DescribeApiHistoryResponseBodyConstantParametersConstantParameter();
            return TeaModel.build(map, self);
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

        public DescribeApiHistoryResponseBodyConstantParametersConstantParameter setConstantValue(String constantValue) {
            this.constantValue = constantValue;
            return this;
        }
        public String getConstantValue() {
            return this.constantValue;
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

    public static class DescribeApiHistoryResponseBodyRequestParametersRequestParameter extends TeaModel {
        @NameInMap("JsonScheme")
        public String jsonScheme;

        @NameInMap("MaxValue")
        public Long maxValue;

        @NameInMap("ArrayItemsType")
        public String arrayItemsType;

        @NameInMap("MinValue")
        public Long minValue;

        @NameInMap("DocShow")
        public String docShow;

        @NameInMap("MaxLength")
        public Long maxLength;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ApiParameterName")
        public String apiParameterName;

        @NameInMap("EnumValue")
        public String enumValue;

        @NameInMap("DemoValue")
        public String demoValue;

        @NameInMap("Required")
        public String required;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParameterType")
        public String parameterType;

        @NameInMap("RegularExpression")
        public String regularExpression;

        @NameInMap("MinLength")
        public Long minLength;

        @NameInMap("DocOrder")
        public Integer docOrder;

        @NameInMap("Location")
        public String location;

        public static DescribeApiHistoryResponseBodyRequestParametersRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiHistoryResponseBodyRequestParametersRequestParameter self = new DescribeApiHistoryResponseBodyRequestParametersRequestParameter();
            return TeaModel.build(map, self);
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setJsonScheme(String jsonScheme) {
            this.jsonScheme = jsonScheme;
            return this;
        }
        public String getJsonScheme() {
            return this.jsonScheme;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setArrayItemsType(String arrayItemsType) {
            this.arrayItemsType = arrayItemsType;
            return this;
        }
        public String getArrayItemsType() {
            return this.arrayItemsType;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMinValue(Long minValue) {
            this.minValue = minValue;
            return this;
        }
        public Long getMinValue() {
            return this.minValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDocShow(String docShow) {
            this.docShow = docShow;
            return this;
        }
        public String getDocShow() {
            return this.docShow;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setApiParameterName(String apiParameterName) {
            this.apiParameterName = apiParameterName;
            return this;
        }
        public String getApiParameterName() {
            return this.apiParameterName;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDemoValue(String demoValue) {
            this.demoValue = demoValue;
            return this;
        }
        public String getDemoValue() {
            return this.demoValue;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setDocOrder(Integer docOrder) {
            this.docOrder = docOrder;
            return this;
        }
        public Integer getDocOrder() {
            return this.docOrder;
        }

        public DescribeApiHistoryResponseBodyRequestParametersRequestParameter setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
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

    public static class DescribeApiHistoryResponseBodyServiceParametersServiceParameter extends TeaModel {
        @NameInMap("Location")
        public String location;

        @NameInMap("ParameterType")
        public String parameterType;

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
        @NameInMap("RequestParameterName")
        public String requestParameterName;

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

}
