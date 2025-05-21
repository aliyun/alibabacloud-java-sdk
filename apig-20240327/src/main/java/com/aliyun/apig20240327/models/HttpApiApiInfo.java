// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiApiInfo extends TeaModel {
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    @NameInMap("deployCntMap")
    public java.util.Map<String, HttpApiApiInfoDeployCntMapValue> deployCntMap;

    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    @NameInMap("description")
    public String description;

    @NameInMap("enabelAuth")
    public Boolean enabelAuth;

    @NameInMap("environments")
    public java.util.List<HttpApiApiInfoEnvironments> environments;

    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>api-xxx</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    @NameInMap("ingressInfo")
    public HttpApiApiInfoIngressInfo ingressInfo;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Rest</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("versionInfo")
    public HttpApiVersionInfo versionInfo;

    public static HttpApiApiInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiApiInfo self = new HttpApiApiInfo();
        return TeaModel.build(map, self);
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

    public HttpApiApiInfo setEnabelAuth(Boolean enabelAuth) {
        this.enabelAuth = enabelAuth;
        return this;
    }
    public Boolean getEnabelAuth() {
        return this.enabelAuth;
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
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static HttpApiApiInfoEnvironmentsGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsGatewayInfo self = new HttpApiApiInfoEnvironmentsGatewayInfo();
            return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>demo-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
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
         * <strong>example:</strong>
         * <p>d-xxx</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
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
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("backendScene")
        public String backendScene;

        /**
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("backendType")
        public String backendType;

        @NameInMap("customDomains")
        public java.util.List<HttpApiDomainInfo> customDomains;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("gatewayInfo")
        public HttpApiApiInfoEnvironmentsGatewayInfo gatewayInfo;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> serviceConfigs;

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
        @NameInMap("environmentInfo")
        public HttpApiApiInfoIngressInfoEnvironmentInfo environmentInfo;

        @NameInMap("ingressClass")
        public String ingressClass;

        @NameInMap("k8sClusterInfo")
        public HttpApiApiInfoIngressInfoK8sClusterInfo k8sClusterInfo;

        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        @NameInMap("sourceId")
        public String sourceId;

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
