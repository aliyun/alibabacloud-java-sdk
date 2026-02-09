// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiPublishRevisionInfo extends TeaModel {
    /**
     * <p>The publishing scenario.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SingleService</li>
     * <li>MultiServiceByRatio</li>
     * <li>MultiServiceByContent</li>
     * <li>MultiServiceByTag</li>
     * <li>Mock</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SingleService</p>
     */
    @NameInMap("backendScene")
    public String backendScene;

    /**
     * <p>The type of the backend service.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DNS: a DNS domain name</li>
     * <li>Service: an existing service</li>
     * <li>VIP: a fixed IP address</li>
     * <li>CloudProduct: a cloud service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Service</p>
     */
    @NameInMap("backendType")
    public String backendType;

    /**
     * <p>The cloud service configurations.</p>
     */
    @NameInMap("cloudProductConfig")
    public HttpApiPublishRevisionInfoCloudProductConfig cloudProductConfig;

    /**
     * <p>The publishing timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1718807057927</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The custom domain names.</p>
     */
    @NameInMap("customDomains")
    public java.util.List<HttpApiDomainInfo> customDomains;

    /**
     * <p>The configurations of DNS domain names. For single-service publishing, only one entry is allowed. For other scenarios, multiple entries are allowed.</p>
     */
    @NameInMap("dnsConfigs")
    public java.util.List<HttpApiPublishRevisionInfoDnsConfigs> dnsConfigs;

    /**
     * <p>The environment information.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentInfo")
    public HttpApiPublishRevisionInfoEnvironmentInfo environmentInfo;

    /**
     * <p>Specifies whether the current version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isCurrentVersion")
    public Boolean isCurrentVersion;

    /**
     * <p>The operations.</p>
     */
    @NameInMap("operations")
    public java.util.List<HttpApiOperationInfo> operations;

    /**
     * <p>The published version.</p>
     * 
     * <strong>example:</strong>
     * <p>apr-xxx</p>
     */
    @NameInMap("revisionId")
    public String revisionId;

    /**
     * <p>The configurations of existing services. For single-service publishing, only one entry is allowed. For other scenarios, multiple entries are allowed.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<HttpApiPublishRevisionInfoServiceConfigs> serviceConfigs;

    /**
     * <p>The default domain names of the environment.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx.com</p>
     */
    @NameInMap("subDomains")
    public java.util.List<HttpApiDomainInfo> subDomains;

    /**
     * <p>The configurations of fixed IP addresses. For single-service publishing, only one entry is allowed. For other scenarios, multiple entries are allowed.</p>
     */
    @NameInMap("vipConfigs")
    public java.util.List<HttpApiPublishRevisionInfoVipConfigs> vipConfigs;

    public static HttpApiPublishRevisionInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiPublishRevisionInfo self = new HttpApiPublishRevisionInfo();
        return TeaModel.build(map, self);
    }

    public HttpApiPublishRevisionInfo setBackendScene(String backendScene) {
        this.backendScene = backendScene;
        return this;
    }
    public String getBackendScene() {
        return this.backendScene;
    }

    public HttpApiPublishRevisionInfo setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public HttpApiPublishRevisionInfo setCloudProductConfig(HttpApiPublishRevisionInfoCloudProductConfig cloudProductConfig) {
        this.cloudProductConfig = cloudProductConfig;
        return this;
    }
    public HttpApiPublishRevisionInfoCloudProductConfig getCloudProductConfig() {
        return this.cloudProductConfig;
    }

    public HttpApiPublishRevisionInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public HttpApiPublishRevisionInfo setCustomDomains(java.util.List<HttpApiDomainInfo> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<HttpApiDomainInfo> getCustomDomains() {
        return this.customDomains;
    }

    public HttpApiPublishRevisionInfo setDnsConfigs(java.util.List<HttpApiPublishRevisionInfoDnsConfigs> dnsConfigs) {
        this.dnsConfigs = dnsConfigs;
        return this;
    }
    public java.util.List<HttpApiPublishRevisionInfoDnsConfigs> getDnsConfigs() {
        return this.dnsConfigs;
    }

    public HttpApiPublishRevisionInfo setEnvironmentInfo(HttpApiPublishRevisionInfoEnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
        return this;
    }
    public HttpApiPublishRevisionInfoEnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    public HttpApiPublishRevisionInfo setIsCurrentVersion(Boolean isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
        return this;
    }
    public Boolean getIsCurrentVersion() {
        return this.isCurrentVersion;
    }

    public HttpApiPublishRevisionInfo setOperations(java.util.List<HttpApiOperationInfo> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<HttpApiOperationInfo> getOperations() {
        return this.operations;
    }

    public HttpApiPublishRevisionInfo setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public HttpApiPublishRevisionInfo setServiceConfigs(java.util.List<HttpApiPublishRevisionInfoServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<HttpApiPublishRevisionInfoServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public HttpApiPublishRevisionInfo setSubDomains(java.util.List<HttpApiDomainInfo> subDomains) {
        this.subDomains = subDomains;
        return this;
    }
    public java.util.List<HttpApiDomainInfo> getSubDomains() {
        return this.subDomains;
    }

    public HttpApiPublishRevisionInfo setVipConfigs(java.util.List<HttpApiPublishRevisionInfoVipConfigs> vipConfigs) {
        this.vipConfigs = vipConfigs;
        return this;
    }
    public java.util.List<HttpApiPublishRevisionInfoVipConfigs> getVipConfigs() {
        return this.vipConfigs;
    }

    public static class HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs extends TeaModel {
        /**
         * <p>The associated service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The K8s service name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The K8s namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public String weight;

        public static HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs self = new HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs extends TeaModel {
        /**
         * <p>The associated service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-function</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The function version or alias.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs self = new HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs extends TeaModel {
        /**
         * <p>The associated service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The service group.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The Nacos service name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Nacos namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs self = new HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiPublishRevisionInfoCloudProductConfig extends TeaModel {
        /**
         * <p>The type of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>FC</p>
         */
        @NameInMap("cloudProductType")
        public String cloudProductType;

        /**
         * <p>The ACK configurations.</p>
         */
        @NameInMap("containerServiceConfigs")
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs> containerServiceConfigs;

        /**
         * <p>The Function Compute configurations.</p>
         */
        @NameInMap("functionConfigs")
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs> functionConfigs;

        /**
         * <p>The MSE Nacos configurations.</p>
         */
        @NameInMap("mseNacosConfigs")
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs> mseNacosConfigs;

        public static HttpApiPublishRevisionInfoCloudProductConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoCloudProductConfig self = new HttpApiPublishRevisionInfoCloudProductConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoCloudProductConfig setCloudProductType(String cloudProductType) {
            this.cloudProductType = cloudProductType;
            return this;
        }
        public String getCloudProductType() {
            return this.cloudProductType;
        }

        public HttpApiPublishRevisionInfoCloudProductConfig setContainerServiceConfigs(java.util.List<HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs> containerServiceConfigs) {
            this.containerServiceConfigs = containerServiceConfigs;
            return this;
        }
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigContainerServiceConfigs> getContainerServiceConfigs() {
            return this.containerServiceConfigs;
        }

        public HttpApiPublishRevisionInfoCloudProductConfig setFunctionConfigs(java.util.List<HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs> functionConfigs) {
            this.functionConfigs = functionConfigs;
            return this;
        }
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigFunctionConfigs> getFunctionConfigs() {
            return this.functionConfigs;
        }

        public HttpApiPublishRevisionInfoCloudProductConfig setMseNacosConfigs(java.util.List<HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs> mseNacosConfigs) {
            this.mseNacosConfigs = mseNacosConfigs;
            return this;
        }
        public java.util.List<HttpApiPublishRevisionInfoCloudProductConfigMseNacosConfigs> getMseNacosConfigs() {
            return this.mseNacosConfigs;
        }

    }

    public static class HttpApiPublishRevisionInfoDnsConfigs extends TeaModel {
        /**
         * <p>The DNS domain names.</p>
         */
        @NameInMap("dnsList")
        public java.util.List<String> dnsList;

        /**
         * <p>The matching condition. This condition is valid only in content-based routing.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The weight. Valid values: [1,100]. This parameter is valid only in proportional routing.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiPublishRevisionInfoDnsConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoDnsConfigs self = new HttpApiPublishRevisionInfoDnsConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoDnsConfigs setDnsList(java.util.List<String> dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public java.util.List<String> getDnsList() {
            return this.dnsList;
        }

        public HttpApiPublishRevisionInfoDnsConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoDnsConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance 1</p>
         */
        @NameInMap("name")
        public String name;

        public static HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo self = new HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HttpApiPublishRevisionInfoEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The instance information.</p>
         */
        @NameInMap("gatewayInfo")
        public HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo gatewayInfo;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static HttpApiPublishRevisionInfoEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoEnvironmentInfo self = new HttpApiPublishRevisionInfoEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoEnvironmentInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public HttpApiPublishRevisionInfoEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public HttpApiPublishRevisionInfoEnvironmentInfo setGatewayInfo(HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public HttpApiPublishRevisionInfoEnvironmentInfoGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public HttpApiPublishRevisionInfoEnvironmentInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HttpApiPublishRevisionInfoServiceConfigs extends TeaModel {
        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiPublishRevisionInfoServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoServiceConfigs self = new HttpApiPublishRevisionInfoServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiPublishRevisionInfoServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiPublishRevisionInfoServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiPublishRevisionInfoServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public HttpApiPublishRevisionInfoServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiPublishRevisionInfoVipConfigs extends TeaModel {
        /**
         * <p>The IP addresses.</p>
         */
        @NameInMap("endpoints")
        public java.util.List<String> endpoints;

        /**
         * <p>The matching condition. This condition is valid only in content-based routing.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The weight. Valid values: [1,100]. This parameter is valid only in proportional routing.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiPublishRevisionInfoVipConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPublishRevisionInfoVipConfigs self = new HttpApiPublishRevisionInfoVipConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPublishRevisionInfoVipConfigs setEndpoints(java.util.List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<String> getEndpoints() {
            return this.endpoints;
        }

        public HttpApiPublishRevisionInfoVipConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiPublishRevisionInfoVipConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
