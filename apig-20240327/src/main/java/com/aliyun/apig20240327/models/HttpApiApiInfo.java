// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiApiInfo extends TeaModel {
    /**
     * <p>The list of agent protocols.</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>The list of AI protocols.</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The authentication configuration.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The API base path.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The API operation publish status.</p>
     */
    @NameInMap("deployCntMap")
    public java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap;

    /**
     * <p>The list of API deployment configurations.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test API</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The publish environment context of the API.</p>
     */
    @NameInMap("environments")
    public java.util.List<HttpApiApiInfoEnvironments> environments;

    /**
     * <p>The ID of the gateway instance to which the API belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>HTTP API ID。</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxx</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    /**
     * <p>The HTTP Ingress API information.</p>
     */
    @NameInMap("ingressInfo")
    public HttpApiApiInfoIngressInfo ingressInfo;

    /**
     * <p>The model category.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("modelCategory")
    public String modelCategory;

    /**
     * <p>The API name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The list of API protocols.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The API type.</p>
     * 
     * <strong>example:</strong>
     * <p>Rest</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The API version control information.</p>
     */
    @NameInMap("versionInfo")
    public HttpApiVersionInfo versionInfo;

    public static HttpApiApiInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiApiInfo self = new HttpApiApiInfo();
        return TeaModel.build(map, self);
    }

    public HttpApiApiInfo setAgentProtocols(java.util.List<String> agentProtocols) {
        this.agentProtocols = agentProtocols;
        return this;
    }
    public java.util.List<String> getAgentProtocols() {
        return this.agentProtocols;
    }

    public HttpApiApiInfo setAiProtocols(java.util.List<String> aiProtocols) {
        this.aiProtocols = aiProtocols;
        return this;
    }
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    public HttpApiApiInfo setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public HttpApiApiInfo setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public HttpApiApiInfo setDeployCntMap(java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap) {
        this.deployCntMap = deployCntMap;
        return this;
    }
    public java.util.Map<String, HttpApiApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
    }

    public HttpApiApiInfo setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public HttpApiApiInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpApiApiInfo setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public HttpApiApiInfo setEnvironments(java.util.List<HttpApiApiInfoEnvironments> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<HttpApiApiInfoEnvironments> getEnvironments() {
        return this.environments;
    }

    public HttpApiApiInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HttpApiApiInfo setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public HttpApiApiInfo setIngressInfo(HttpApiApiInfoIngressInfo ingressInfo) {
        this.ingressInfo = ingressInfo;
        return this;
    }
    public HttpApiApiInfoIngressInfo getIngressInfo() {
        return this.ingressInfo;
    }

    public HttpApiApiInfo setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public HttpApiApiInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiApiInfo setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public HttpApiApiInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public HttpApiApiInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HttpApiApiInfo setVersionInfo(HttpApiVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }
    public HttpApiVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public static class HttpApiApiInfoEnvironmentsGatewayInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MultiTenantServerless</p>
         */
        @NameInMap("gatewayEdition")
        public String gatewayEdition;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The gateway instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static HttpApiApiInfoEnvironmentsGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsGatewayInfo self = new HttpApiApiInfoEnvironmentsGatewayInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsGatewayInfo setGatewayEdition(String gatewayEdition) {
            this.gatewayEdition = gatewayEdition;
            return this;
        }
        public String getGatewayEdition() {
            return this.gatewayEdition;
        }

        public HttpApiApiInfoEnvironmentsGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public HttpApiApiInfoEnvironmentsGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HttpApiApiInfoEnvironmentsServiceConfigs extends TeaModel {
        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The match condition.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsServiceConfigs self = new HttpApiApiInfoEnvironmentsServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsSubDomains extends TeaModel {
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xxx</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The access protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpApiApiInfoEnvironmentsSubDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsSubDomains self = new HttpApiApiInfoEnvironmentsSubDomains();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiApiInfoEnvironmentsSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public HttpApiApiInfoEnvironmentsSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpApiApiInfoEnvironments extends TeaModel {
        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The deployment scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("backendScene")
        public String backendScene;

        /**
         * <p>The backend type.</p>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("backendType")
        public String backendType;

        /**
         * <p>The domain name information published by the user.</p>
         */
        @NameInMap("customDomains")
        public java.util.List<HttpApiDomainInfo> customDomains;

        /**
         * <p>The deployment status of the API in the current environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The gateway instance information for the current environment.</p>
         */
        @NameInMap("gatewayInfo")
        public HttpApiApiInfoEnvironmentsGatewayInfo gatewayInfo;

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The existing service configurations.</p>
         */
        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> serviceConfigs;

        /**
         * <p>The list of default domain names for the environment.</p>
         */
        @NameInMap("subDomains")
        public java.util.List<HttpApiApiInfoEnvironmentsSubDomains> subDomains;

        public static HttpApiApiInfoEnvironments build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironments self = new HttpApiApiInfoEnvironments();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironments setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public HttpApiApiInfoEnvironments setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public HttpApiApiInfoEnvironments setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public HttpApiApiInfoEnvironments setCustomDomains(java.util.List<HttpApiDomainInfo> customDomains) {
            this.customDomains = customDomains;
            return this;
        }
        public java.util.List<HttpApiDomainInfo> getCustomDomains() {
            return this.customDomains;
        }

        public HttpApiApiInfoEnvironments setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public HttpApiApiInfoEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public HttpApiApiInfoEnvironments setGatewayInfo(HttpApiApiInfoEnvironmentsGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public HttpApiApiInfoEnvironmentsGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public HttpApiApiInfoEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironments setServiceConfigs(java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public HttpApiApiInfoEnvironments setSubDomains(java.util.List<HttpApiApiInfoEnvironmentsSubDomains> subDomains) {
            this.subDomains = subDomains;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsSubDomains> getSubDomains() {
            return this.subDomains;
        }

    }

    public static class HttpApiApiInfoIngressInfoEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        public static HttpApiApiInfoIngressInfoEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoIngressInfoEnvironmentInfo self = new HttpApiApiInfoIngressInfoEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoIngressInfoEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

    }

    public static class HttpApiApiInfoIngressInfoK8sClusterInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca435c77cba1547cca9311957bcxxxxxx</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static HttpApiApiInfoIngressInfoK8sClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoIngressInfoK8sClusterInfo self = new HttpApiApiInfoIngressInfoK8sClusterInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoIngressInfoK8sClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class HttpApiApiInfoIngressInfo extends TeaModel {
        /**
         * <p>The environment context.</p>
         */
        @NameInMap("environmentInfo")
        public HttpApiApiInfoIngressInfoEnvironmentInfo environmentInfo;

        /**
         * <p>The monitored Ingress Class.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>The Kubernetes cluster information.</p>
         */
        @NameInMap("k8sClusterInfo")
        public HttpApiApiInfoIngressInfoK8sClusterInfo k8sClusterInfo;

        /**
         * <p>Specifies whether to update the address in Ingress Status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-xxx</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The monitored namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static HttpApiApiInfoIngressInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoIngressInfo self = new HttpApiApiInfoIngressInfo();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoIngressInfo setEnvironmentInfo(HttpApiApiInfoIngressInfoEnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public HttpApiApiInfoIngressInfoEnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public HttpApiApiInfoIngressInfo setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public HttpApiApiInfoIngressInfo setK8sClusterInfo(HttpApiApiInfoIngressInfoK8sClusterInfo k8sClusterInfo) {
            this.k8sClusterInfo = k8sClusterInfo;
            return this;
        }
        public HttpApiApiInfoIngressInfoK8sClusterInfo getK8sClusterInfo() {
            return this.k8sClusterInfo;
        }

        public HttpApiApiInfoIngressInfo setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public HttpApiApiInfoIngressInfo setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public HttpApiApiInfoIngressInfo setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

}
