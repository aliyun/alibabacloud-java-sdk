// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the backend service.</p>
     */
    @NameInMap("BackendInfo")
    public DescribeBackendInfoResponseBodyBackendInfo backendInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AA90E87-3506-5AA6-AFFB-A4D53B4F6231</p>
     */
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
        /**
         * <p>The AccessKey of the RAM user that has the resource management permissions on Microservices Engine (MSE).</p>
         * 
         * <strong>example:</strong>
         * <p>A5FIDxxxxxx</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSWORD</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The name of the cluster to which the microservice belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("Clusters")
        public String clusters;

        /**
         * <p>The name of the group to which the microservice that is registered with Nacos belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the namespace where the microservice that is registered with Nacos resides.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The SecretKey of the RAM user that has the resource management permissions on MSE.</p>
         * 
         * <strong>example:</strong>
         * <p>dl5loxxxxxx</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The Nacos service address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1xx.2xx.3xx.4xx:8848">http://1xx.2xx.3xx.4xx:8848</a></p>
         */
        @NameInMap("ServerAddress")
        public String serverAddress;

        /**
         * <p>The microservice name.</p>
         * 
         * <strong>example:</strong>
         * <p>service-provider</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
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

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig extends TeaModel {
        /**
         * <p>The connection URL of the ZooKeeper server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.xxx:2181">http://192.168.1.xxx:2181</a></p>
         */
        @NameInMap("ConnectString")
        public String connectString;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>provider</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Service name</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig setConnectString(String connectString) {
            this.connectString = connectString;
            return this;
        }
        public String getConnectString() {
            return this.connectString;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig extends TeaModel {
        /**
         * <p>The Nacos configurations.</p>
         */
        @NameInMap("NacosConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigNacosConfig nacosConfig;

        /**
         * <p>The registry type.</p>
         * 
         * <strong>example:</strong>
         * <p>NACOS</p>
         */
        @NameInMap("RcType")
        public String rcType;

        /**
         * <p>The ZooKeeper configuration.</p>
         */
        @NameInMap("ZookeeperConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig zookeeperConfig;

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

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig setZookeeperConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig zookeeperConfig) {
            this.zookeeperConfig = zookeeperConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfigZookeeperConfig getZookeeperConfig() {
            return this.zookeeperConfig;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig extends TeaModel {
        /**
         * <p>The EDAS application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6cd0c599-dxxx-496d-b3d5-6a71c657xxxxx</p>
         */
        @NameInMap("EdasAppId")
        public String edasAppId;

        /**
         * <p>The ID of the microservices namespace in EDAS.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:edasNacos</p>
         */
        @NameInMap("MicroserviceNamespace")
        public String microserviceNamespace;

        /**
         * <p>The ID of the microservices namespace in EDAS.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:edasNacos</p>
         */
        @NameInMap("MicroserviceNamespaceId")
        public String microserviceNamespaceId;

        /**
         * <p>The name of the microservices namespace in EDAS.</p>
         * 
         * <strong>example:</strong>
         * <p>Edas-Nacos</p>
         */
        @NameInMap("MicroserviceNamespaceName")
        public String microserviceNamespaceName;

        /**
         * <p>The MSE instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-jia3n1rxxxx</p>
         */
        @NameInMap("MseInstanceId")
        public String mseInstanceId;

        /**
         * <p>The registration type.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig self = new DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setEdasAppId(String edasAppId) {
            this.edasAppId = edasAppId;
            return this;
        }
        public String getEdasAppId() {
            return this.edasAppId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setMicroserviceNamespace(String microserviceNamespace) {
            this.microserviceNamespace = microserviceNamespace;
            return this;
        }
        public String getMicroserviceNamespace() {
            return this.microserviceNamespace;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setMicroserviceNamespaceId(String microserviceNamespaceId) {
            this.microserviceNamespaceId = microserviceNamespaceId;
            return this;
        }
        public String getMicroserviceNamespaceId() {
            return this.microserviceNamespaceId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setMicroserviceNamespaceName(String microserviceNamespaceName) {
            this.microserviceNamespaceName = microserviceNamespaceName;
            return this;
        }
        public String getMicroserviceNamespaceName() {
            return this.microserviceNamespaceName;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setMseInstanceId(String mseInstanceId) {
            this.mseInstanceId = mseInstanceId;
            return this;
        }
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig extends TeaModel {
        /**
         * <p>The region ID of the event bus in EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>dds_driver</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The ARN of the RAM role to be assumed by API Gateway to access EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1975133748561***:role/aliyunserviceroleforiotlogexport</p>
         */
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
        /**
         * <p>The root path of the Function Compute service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://t*******.ap-*****.fcapp.run/">https://t*******.ap-*****.fcapp.run/</a></p>
         */
        @NameInMap("FcBaseUrl")
        public String fcBaseUrl;

        /**
         * <p>The region ID of the Function Compute service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("FcRegionId")
        public String fcRegionId;

        /**
         * <p>The type of the service in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpTrigger</p>
         */
        @NameInMap("FcType")
        public String fcType;

        /**
         * <p>The function name that is defined in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>edge_function</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>Indicates whether the backend service receives only the service path.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OnlyBusinessPath")
        public Boolean onlyBusinessPath;

        /**
         * <p>The alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>testQualifier</p>
         */
        @NameInMap("Qualifier")
        public String qualifier;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by API Gateway to access Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::31985*:role/aliyunserviceroleforbastionhostpam</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The service name that is defined in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>myservice</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("TriggerName")
        public String triggerName;

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

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

    }

    public static class DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders extends TeaModel {
        /**
         * <p>The header name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The header value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
        /**
         * <p>The header in the mocked response.</p>
         */
        @NameInMap("MockHeaders")
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfigMockHeaders> mockHeaders;

        /**
         * <p>The mocked response.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MockResult")
        public String mockResult;

        /**
         * <p>The status code in the mocked response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my_bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The region ID of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <p>The ID of the Elastic Compute Service (ECS) or Server Load Balancer (SLB) instance in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6iaale3gfef9t9cb41</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>dypls-cn-beijing-slb-pre</p>
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
        public Long port;

        /**
         * <p>The ID of the VPC access authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>2zej3ehuzg9m77kvwnfpn</p>
         */
        @NameInMap("VpcAccessId")
        public String vpcAccessId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9v96hqi6d14744sxqmx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Indicates whether HTTP or HTTPS is used.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("VpcScheme")
        public String vpcScheme;

        /**
         * <p>The host of the VPC backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi.alipan.com</p>
         */
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
        /**
         * <p>The information about the backend service when the backend service is of the Service Discovery type.</p>
         */
        @NameInMap("DiscoveryConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigDiscoveryConfig discoveryConfig;

        /**
         * <p>The EDAS configuration.</p>
         */
        @NameInMap("EdasConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig edasConfig;

        /**
         * <p>The information about the backend service whose type is EventBridge.</p>
         */
        @NameInMap("EventBridgeConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEventBridgeConfig eventBridgeConfig;

        /**
         * <p>The information about the backend service whose type is Function Compute.</p>
         */
        @NameInMap("FunctionComputeConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigFunctionComputeConfig functionComputeConfig;

        /**
         * <p>The host of the HTTP backend service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.host.com">www.host.com</a></p>
         */
        @NameInMap("HttpTargetHostName")
        public String httpTargetHostName;

        /**
         * <p>The information about the backend service when the backend service is of the Mock type.</p>
         */
        @NameInMap("MockConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigMockConfig mockConfig;

        /**
         * <p>The information about the backend service whose type is Object Storage Service (OSS).</p>
         */
        @NameInMap("OssConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigOssConfig ossConfig;

        /**
         * <p>The URL of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("ServiceAddress")
        public String serviceAddress;

        /**
         * <p>The timeout period of the backend service, in millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ServiceTimeout")
        public Integer serviceTimeout;

        /**
         * <p>The type of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The information about the backend service when the backend service is of the VPC type.</p>
         */
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

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setEdasConfig(DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig edasConfig) {
            this.edasConfig = edasConfig;
            return this;
        }
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfigEdasConfig getEdasConfig() {
            return this.edasConfig;
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

        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig setServiceTimeout(Integer serviceTimeout) {
            this.serviceTimeout = serviceTimeout;
            return this;
        }
        public Integer getServiceTimeout() {
            return this.serviceTimeout;
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
        /**
         * <p>The backend service configurations.</p>
         */
        @NameInMap("BackendConfig")
        public DescribeBackendInfoResponseBodyBackendInfoBackendModelsBackendConfig backendConfig;

        /**
         * <p>The ID of the backend service in the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>5c4995d08e8b4954b0f326e8e4f2b97d</p>
         */
        @NameInMap("BackendModelId")
        public String backendModelId;

        /**
         * <p>The description of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>testDvs 1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the backend service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-20T03:22:03.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the backend service was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-20T03:22:03.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>6fc978bb63574146b766863dd7bdf661</p>
         */
        @NameInMap("StageModeId")
        public String stageModeId;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
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
        /**
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>6fc978bb63574146b766863dd7bdf661</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The configurations of the backend service in the environment.</p>
         */
        @NameInMap("BackendModels")
        public java.util.List<DescribeBackendInfoResponseBodyBackendInfoBackendModels> backendModels;

        /**
         * <p>The name of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>testoss2</p>
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

        /**
         * <p>The time when the backend service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-22T11:10:46+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the backend service was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-11T15:18:09+08:00</p>
         */
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
