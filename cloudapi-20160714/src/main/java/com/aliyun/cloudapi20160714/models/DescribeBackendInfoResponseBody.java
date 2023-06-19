// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendInfoResponseBody extends TeaModel {
    @NameInMap("BackendInfo")
    public DescribeBackendInfoResponseBodyBackendInfo backendInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackendInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendInfoResponseBody self = new DescribeBackendInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackendInfoResponseBody setBackendInfo(DescribeBackendInfoResponseBodyBackendInfo backendInfo) {
        this.backendInfo = backendInfo;
        return this;
    }
    public DescribeBackendInfoResponseBodyBackendInfo getBackendInfo() {
        return this.backendInfo;
    }

    public DescribeBackendInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Clusters")
        public String clusters;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Password")
        public String password;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("ServerAddress")
        public String serverAddress;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("UserName")
        public String userName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setClusters(String clusters) {
            this.clusters = clusters;
            return this;
        }
        public String getClusters() {
            return this.clusters;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setServerAddress(String serverAddress) {
            this.serverAddress = serverAddress;
            return this;
        }
        public String getServerAddress() {
            return this.serverAddress;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig extends TeaModel {
        @NameInMap("NacosConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig nacosConfig;

        @NameInMap("RcType")
        public String rcType;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig setNacosConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig nacosConfig) {
            this.nacosConfig = nacosConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig getNacosConfig() {
            return this.nacosConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig setRcType(String rcType) {
            this.rcType = rcType;
            return this;
        }
        public String getRcType() {
            return this.rcType;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig extends TeaModel {
        @NameInMap("EventBridgeRegionId")
        public String eventBridgeRegionId;

        @NameInMap("EventBus")
        public String eventBus;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("RoleArn")
        public String roleArn;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig setEventBridgeRegionId(String eventBridgeRegionId) {
            this.eventBridgeRegionId = eventBridgeRegionId;
            return this;
        }
        public String getEventBridgeRegionId() {
            return this.eventBridgeRegionId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig setEventBus(String eventBus) {
            this.eventBus = eventBus;
            return this;
        }
        public String getEventBus() {
            return this.eventBus;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig extends TeaModel {
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        @NameInMap("FcRegionId")
        public String fcRegionId;

        @NameInMap("FcType")
        public String fcType;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        @NameInMap("Qualifier")
        public String qualifier;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setFcBaseUrl(String fcBaseUrl) {
            this.fcBaseUrl = fcBaseUrl;
            return this;
        }
        public String getFcBaseUrl() {
            return this.fcBaseUrl;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setFcRegionId(String fcRegionId) {
            this.fcRegionId = fcRegionId;
            return this;
        }
        public String getFcRegionId() {
            return this.fcRegionId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setFcType(String fcType) {
            this.fcType = fcType;
            return this;
        }
        public String getFcType() {
            return this.fcType;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setOnlyBusinessPath(Boolean onlyBusinessPath) {
            this.onlyBusinessPath = onlyBusinessPath;
            return this;
        }
        public Boolean getOnlyBusinessPath() {
            return this.onlyBusinessPath;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders extends TeaModel {
        @NameInMap("HeaderName")
        public String headerName;

        @NameInMap("HeaderValue")
        public String headerValue;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig extends TeaModel {
        @NameInMap("MockHeaders")
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders> mockHeaders;

        @NameInMap("MockResult")
        public String mockResult;

        @NameInMap("MockStatusCode")
        public String mockStatusCode;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig setMockHeaders(java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders> mockHeaders) {
            this.mockHeaders = mockHeaders;
            return this;
        }
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders> getMockHeaders() {
            return this.mockHeaders;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig setMockResult(String mockResult) {
            this.mockResult = mockResult;
            return this;
        }
        public String getMockResult() {
            return this.mockResult;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig setMockStatusCode(String mockStatusCode) {
            this.mockStatusCode = mockStatusCode;
            return this;
        }
        public String getMockStatusCode() {
            return this.mockStatusCode;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("OssRegionId")
        public String ossRegionId;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig setOssRegionId(String ossRegionId) {
            this.ossRegionId = ossRegionId;
            return this;
        }
        public String getOssRegionId() {
            return this.ossRegionId;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public Long port;

        @NameInMap("VpcAccessId")
        public String vpcAccessId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcScheme")
        public String vpcScheme;

        @NameInMap("VpcTargetHostName")
        public String vpcTargetHostName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setVpcAccessId(String vpcAccessId) {
            this.vpcAccessId = vpcAccessId;
            return this;
        }
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setVpcScheme(String vpcScheme) {
            this.vpcScheme = vpcScheme;
            return this;
        }
        public String getVpcScheme() {
            return this.vpcScheme;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig setVpcTargetHostName(String vpcTargetHostName) {
            this.vpcTargetHostName = vpcTargetHostName;
            return this;
        }
        public String getVpcTargetHostName() {
            return this.vpcTargetHostName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig extends TeaModel {
        @NameInMap("DiscoveryConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig discoveryConfig;

        @NameInMap("EventBridgeConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig eventBridgeConfig;

        @NameInMap("FunctionComputeConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig functionComputeConfig;

        @NameInMap("HttpTargetHostName")
        public String httpTargetHostName;

        @NameInMap("MockConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig mockConfig;

        @NameInMap("OssConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig ossConfig;

        @NameInMap("ServiceAddress")
        public String serviceAddress;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpcConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig vpcConfig;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setDiscoveryConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig discoveryConfig) {
            this.discoveryConfig = discoveryConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig getDiscoveryConfig() {
            return this.discoveryConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setEventBridgeConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig eventBridgeConfig) {
            this.eventBridgeConfig = eventBridgeConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig getEventBridgeConfig() {
            return this.eventBridgeConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setFunctionComputeConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig functionComputeConfig) {
            this.functionComputeConfig = functionComputeConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig getFunctionComputeConfig() {
            return this.functionComputeConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setHttpTargetHostName(String httpTargetHostName) {
            this.httpTargetHostName = httpTargetHostName;
            return this;
        }
        public String getHttpTargetHostName() {
            return this.httpTargetHostName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setMockConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig mockConfig) {
            this.mockConfig = mockConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig getMockConfig() {
            return this.mockConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setOssConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig getOssConfig() {
            return this.ossConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setVpcConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModels extends TeaModel {
        @NameInMap("BackendConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig backendConfig;

        @NameInMap("BackendModelId")
        public String backendModelId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("StageModeId")
        public String stageModeId;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModels self = new DescribeBackendInfoResponseBodyBackendInfoBackendModels();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setBackendConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setBackendModelId(String backendModelId) {
            this.backendModelId = backendModelId;
            return this;
        }
        public String getBackendModelId() {
            return this.backendModelId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setStageModeId(String stageModeId) {
            this.stageModeId = stageModeId;
            return this;
        }
        public String getStageModeId() {
            return this.stageModeId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModels setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfo extends TeaModel {
        @NameInMap("BackendId")
        public String backendId;

        @NameInMap("BackendModels")
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModels> backendModels;

        @NameInMap("BackendName")
        public String backendName;

        @NameInMap("BackendType")
        public String backendType;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeBackendInfoResponseBodyBackendInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfo self = new DescribeBackendInfoResponseBodyBackendInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfo setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setBackendModels(java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModels> backendModels) {
            this.backendModels = backendModels;
            return this;
        }
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModels> getBackendModels() {
            return this.backendModels;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setBackendName(String backendName) {
            this.backendName = backendName;
            return this;
        }
        public String getBackendName() {
            return this.backendName;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackendInfoResponseBodyBackendInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
