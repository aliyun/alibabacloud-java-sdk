// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiListApiInfo extends TeaModel {
    /**
     * <p>The collection of agent protocols for the model API.</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>The API protocols created by scenario. APIs created by selecting models provide open paths through modelApiInfo.</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The API authentication configurations created by scenario.</p>
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
     * <p>The read-only association identifier for the creation request. It is returned only within approximately 24 hours after the first persistence and when the association with the same instance is unique after normal authentication. It is omitted when the identifier is historical, expired, or ambiguous. You cannot use this identifier to determine whether publishing or authorization is successful, nor does it replace the creation idempotency record.</p>
     * 
     * <strong>example:</strong>
     * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
     */
    @NameInMap("creationClientToken")
    public String creationClientToken;

    /**
     * <p>The optional read-only deletion status of the new model API. Deleting indicates that the deletion request is accepted but not completed. DeleteFailed indicates that the background deletion failed, and you can use the original clientToken to retry DeleteModelApi. This field is not returned for normal deployment and historical undeployment. The absence of this field does not indicate that the deletion is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>Deleting</p>
     */
    @NameInMap("deleteStatus")
    public String deleteStatus;

    /**
     * <p>The publish status of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;example-scope&quot;:{&quot;deployedCnt&quot;:1,&quot;cnt&quot;:1}}</p>
     */
    @NameInMap("deployCntMap")
    public java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> deployCntMap;

    /**
     * <p>The API deployment configurations and associated services created by scenario, provided as read-only list information.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The read-only reason for deployment or deletion failure.</p>
     * 
     * <strong>example:</strong>
     * <p>The model configuration is unavailable</p>
     */
    @NameInMap("deployErrorMessage")
    public String deployErrorMessage;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>Model API for business integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The selected domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The read-only domain details and default domain flag.</p>
     */
    @NameInMap("domainInfos")
    public java.util.List<ModelApiDomainInfo> domainInfos;

    /**
     * <p>Specifies whether to enable authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The read-only default environment ID of the bound instance.</p>
     * 
     * <strong>example:</strong>
     * <p>env-d00000000000000000000</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The publish environment context of the API.</p>
     */
    @NameInMap("environments")
    public java.util.List<ModelApiListApiInfoEnvironments> environments;

    /**
     * <p>The ID of the gateway instance to which the API belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-d00000000000000000000</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The read-only information of the bound instance.</p>
     */
    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    /**
     * <p>The model API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxx</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    /**
     * <p>The HTTP ingress API information.</p>
     */
    @NameInMap("ingressInfo")
    public ModelApiListApiInfoIngressInfo ingressInfo;

    /**
     * <p>The public selection information of the model API.</p>
     */
    @NameInMap("modelApiInfo")
    public ModelApiListApiInfoModelApiInfo modelApiInfo;

    /**
     * <p>The read-only runtime diagnostics of the model card, derived from the original markers of the deployment configuration. This is used only for the readability and diagnosability of abnormal drafts.</p>
     */
    @NameInMap("modelCardRuntimeDiagnostics")
    public java.util.List<ModelApiListApiInfoModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics;

    /**
     * <p>The model category of the model API.</p>
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
     * <p>The inline configurations for AI request logs and AI security protection.</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<ModelApiPolicyConfig> policyConfigs;

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
     * <p>The deployment status on the bound instance. In the new version, Undeploying indicates that the deletion is in progress, and UndeployFailed indicates that the deletion failed. Refer to deleteStatus to determine whether the operation is a deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The API type.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The API versioning information.</p>
     */
    @NameInMap("versionInfo")
    public HttpApiVersionInfo versionInfo;

    public static ModelApiListApiInfo build(java.util.Map<String, ?> map) throws Exception {
        ModelApiListApiInfo self = new ModelApiListApiInfo();
        return TeaModel.build(map, self);
    }

    public ModelApiListApiInfo setAgentProtocols(java.util.List<String> agentProtocols) {
        this.agentProtocols = agentProtocols;
        return this;
    }
    public java.util.List<String> getAgentProtocols() {
        return this.agentProtocols;
    }

    public ModelApiListApiInfo setAiProtocols(java.util.List<String> aiProtocols) {
        this.aiProtocols = aiProtocols;
        return this;
    }
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    public ModelApiListApiInfo setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public ModelApiListApiInfo setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public ModelApiListApiInfo setCreationClientToken(String creationClientToken) {
        this.creationClientToken = creationClientToken;
        return this;
    }
    public String getCreationClientToken() {
        return this.creationClientToken;
    }

    public ModelApiListApiInfo setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }
    public String getDeleteStatus() {
        return this.deleteStatus;
    }

    public ModelApiListApiInfo setDeployCntMap(java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> deployCntMap) {
        this.deployCntMap = deployCntMap;
        return this;
    }
    public java.util.Map<String, ModelApiListApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
    }

    public ModelApiListApiInfo setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public ModelApiListApiInfo setDeployErrorMessage(String deployErrorMessage) {
        this.deployErrorMessage = deployErrorMessage;
        return this;
    }
    public String getDeployErrorMessage() {
        return this.deployErrorMessage;
    }

    public ModelApiListApiInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelApiListApiInfo setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public ModelApiListApiInfo setDomainInfos(java.util.List<ModelApiDomainInfo> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public java.util.List<ModelApiDomainInfo> getDomainInfos() {
        return this.domainInfos;
    }

    public ModelApiListApiInfo setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public ModelApiListApiInfo setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ModelApiListApiInfo setEnvironments(java.util.List<ModelApiListApiInfoEnvironments> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<ModelApiListApiInfoEnvironments> getEnvironments() {
        return this.environments;
    }

    public ModelApiListApiInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModelApiListApiInfo setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public ModelApiListApiInfo setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public ModelApiListApiInfo setIngressInfo(ModelApiListApiInfoIngressInfo ingressInfo) {
        this.ingressInfo = ingressInfo;
        return this;
    }
    public ModelApiListApiInfoIngressInfo getIngressInfo() {
        return this.ingressInfo;
    }

    public ModelApiListApiInfo setModelApiInfo(ModelApiListApiInfoModelApiInfo modelApiInfo) {
        this.modelApiInfo = modelApiInfo;
        return this;
    }
    public ModelApiListApiInfoModelApiInfo getModelApiInfo() {
        return this.modelApiInfo;
    }

    public ModelApiListApiInfo setModelCardRuntimeDiagnostics(java.util.List<ModelApiListApiInfoModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics) {
        this.modelCardRuntimeDiagnostics = modelCardRuntimeDiagnostics;
        return this;
    }
    public java.util.List<ModelApiListApiInfoModelCardRuntimeDiagnostics> getModelCardRuntimeDiagnostics() {
        return this.modelCardRuntimeDiagnostics;
    }

    public ModelApiListApiInfo setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public ModelApiListApiInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelApiListApiInfo setPolicyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<ModelApiPolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public ModelApiListApiInfo setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public ModelApiListApiInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModelApiListApiInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModelApiListApiInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModelApiListApiInfo setVersionInfo(HttpApiVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }
    public HttpApiVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public static class ModelApiListApiInfoEnvironmentsGatewayInfo extends TeaModel {
        /**
         * <p>The edition of the gateway instance. Valid values: Professional, Serverless, MultiTenantServerless, and Unknown.</p>
         * 
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
         * <p>The name of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static ModelApiListApiInfoEnvironmentsGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoEnvironmentsGatewayInfo self = new ModelApiListApiInfoEnvironmentsGatewayInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoEnvironmentsGatewayInfo setGatewayEdition(String gatewayEdition) {
            this.gatewayEdition = gatewayEdition;
            return this;
        }
        public String getGatewayEdition() {
            return this.gatewayEdition;
        }

        public ModelApiListApiInfoEnvironmentsGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ModelApiListApiInfoEnvironmentsGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModelApiListApiInfoEnvironmentsServiceConfigs extends TeaModel {
        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The name of the service.</p>
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
         * <p>The ID of the service.</p>
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

        public static ModelApiListApiInfoEnvironmentsServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoEnvironmentsServiceConfigs self = new ModelApiListApiInfoEnvironmentsServiceConfigs();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ModelApiListApiInfoEnvironmentsServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ModelApiListApiInfoEnvironmentsSubDomains extends TeaModel {
        /**
         * <p>The ID of the domain name.</p>
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

        public static ModelApiListApiInfoEnvironmentsSubDomains build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoEnvironmentsSubDomains self = new ModelApiListApiInfoEnvironmentsSubDomains();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoEnvironmentsSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ModelApiListApiInfoEnvironmentsSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModelApiListApiInfoEnvironmentsSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ModelApiListApiInfoEnvironmentsSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ModelApiListApiInfoEnvironments extends TeaModel {
        /**
         * <p>The alias of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The release scenario.</p>
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
         * <p>The custom domain name information published by the user.</p>
         */
        @NameInMap("customDomains")
        public java.util.List<HttpApiDomainInfo> customDomains;

        /**
         * <p>The read-only reason for the release failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The model configuration is unavailable</p>
         */
        @NameInMap("deployErrorMessage")
        public String deployErrorMessage;

        /**
         * <p>The release status of the API in the current environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>The ID of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The gateway instance information to which the current environment belongs.</p>
         */
        @NameInMap("gatewayInfo")
        public ModelApiListApiInfoEnvironmentsGatewayInfo gatewayInfo;

        /**
         * <p>The name of the environment.</p>
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
        public java.util.List<ModelApiListApiInfoEnvironmentsServiceConfigs> serviceConfigs;

        /**
         * <p>The list of default domain names for the environment.</p>
         */
        @NameInMap("subDomains")
        public java.util.List<ModelApiListApiInfoEnvironmentsSubDomains> subDomains;

        public static ModelApiListApiInfoEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoEnvironments self = new ModelApiListApiInfoEnvironments();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoEnvironments setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ModelApiListApiInfoEnvironments setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public ModelApiListApiInfoEnvironments setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public ModelApiListApiInfoEnvironments setCustomDomains(java.util.List<HttpApiDomainInfo> customDomains) {
            this.customDomains = customDomains;
            return this;
        }
        public java.util.List<HttpApiDomainInfo> getCustomDomains() {
            return this.customDomains;
        }

        public ModelApiListApiInfoEnvironments setDeployErrorMessage(String deployErrorMessage) {
            this.deployErrorMessage = deployErrorMessage;
            return this;
        }
        public String getDeployErrorMessage() {
            return this.deployErrorMessage;
        }

        public ModelApiListApiInfoEnvironments setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ModelApiListApiInfoEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ModelApiListApiInfoEnvironments setGatewayInfo(ModelApiListApiInfoEnvironmentsGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public ModelApiListApiInfoEnvironmentsGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public ModelApiListApiInfoEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModelApiListApiInfoEnvironments setServiceConfigs(java.util.List<ModelApiListApiInfoEnvironmentsServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<ModelApiListApiInfoEnvironmentsServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public ModelApiListApiInfoEnvironments setSubDomains(java.util.List<ModelApiListApiInfoEnvironmentsSubDomains> subDomains) {
            this.subDomains = subDomains;
            return this;
        }
        public java.util.List<ModelApiListApiInfoEnvironmentsSubDomains> getSubDomains() {
            return this.subDomains;
        }

    }

    public static class ModelApiListApiInfoIngressInfoEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-d00000000000000000000</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        public static ModelApiListApiInfoIngressInfoEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoIngressInfoEnvironmentInfo self = new ModelApiListApiInfoIngressInfoEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoIngressInfoEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

    }

    public static class ModelApiListApiInfoIngressInfoK8sClusterInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c00000000000000000000000000000001</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static ModelApiListApiInfoIngressInfoK8sClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoIngressInfoK8sClusterInfo self = new ModelApiListApiInfoIngressInfoK8sClusterInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoIngressInfoK8sClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ModelApiListApiInfoIngressInfo extends TeaModel {
        /**
         * <p>The environment context.</p>
         */
        @NameInMap("environmentInfo")
        public ModelApiListApiInfoIngressInfoEnvironmentInfo environmentInfo;

        /**
         * <p>The ingress class being listened to.</p>
         * 
         * <strong>example:</strong>
         * <p>apig</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>The Kubernetes cluster information.</p>
         */
        @NameInMap("k8sClusterInfo")
        public ModelApiListApiInfoIngressInfoK8sClusterInfo k8sClusterInfo;

        /**
         * <p>Specifies whether to update the address in the ingress status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-d00000000000000000000</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The watched namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static ModelApiListApiInfoIngressInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoIngressInfo self = new ModelApiListApiInfoIngressInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoIngressInfo setEnvironmentInfo(ModelApiListApiInfoIngressInfoEnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public ModelApiListApiInfoIngressInfoEnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public ModelApiListApiInfoIngressInfo setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public ModelApiListApiInfoIngressInfo setK8sClusterInfo(ModelApiListApiInfoIngressInfoK8sClusterInfo k8sClusterInfo) {
            this.k8sClusterInfo = k8sClusterInfo;
            return this;
        }
        public ModelApiListApiInfoIngressInfoK8sClusterInfo getK8sClusterInfo() {
            return this.k8sClusterInfo;
        }

        public ModelApiListApiInfoIngressInfo setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public ModelApiListApiInfoIngressInfo setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ModelApiListApiInfoIngressInfo setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class ModelApiListApiInfoModelApiInfoResolvedModelSelection extends TeaModel {
        /**
         * <p>Indicates whether the group expansion collection for the current configuration is completely read. A complete empty group returns true and an empty array. A missing, invalid group, or read failure returns false. This does not represent the online release or consumer permission status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("complete")
        public Boolean complete;

        /**
         * <p>The model card IDs of the publicly selected models for the current configuration, stably sorted and deduplicated. Logical models retain their own IDs, excluding fallback-only targets or underlying execution cards of logical models. If complete is false, this is an empty array and must not be interpreted as zero models.</p>
         */
        @NameInMap("modelCardIds")
        public java.util.List<String> modelCardIds;

        public static ModelApiListApiInfoModelApiInfoResolvedModelSelection build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoModelApiInfoResolvedModelSelection self = new ModelApiListApiInfoModelApiInfoResolvedModelSelection();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoModelApiInfoResolvedModelSelection setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public ModelApiListApiInfoModelApiInfoResolvedModelSelection setModelCardIds(java.util.List<String> modelCardIds) {
            this.modelCardIds = modelCardIds;
            return this;
        }
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

    }

    public static class ModelApiListApiInfoModelApiInfo extends TeaModel {
        /**
         * <p>The save state of the direct supply fallback. A value of false indicates that it is disabled. This only reflects the saved configuration and does not indicate successful release or activation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("directSupplyFallbackEnabled")
        public Boolean directSupplyFallbackEnabled;

        /**
         * <p>The model exposure mode. Only SELECTED is supported in the first phase.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECTED</p>
         */
        @NameInMap("exposureMode")
        public String exposureMode;

        /**
         * <p>The model selection configuration.</p>
         */
        @NameInMap("modelSelection")
        public ModelSelection modelSelection;

        /**
         * <p>The read-only public model collection for the current configuration. If complete is false, the collection is unknown, and partial members must not be used as the full count.</p>
         */
        @NameInMap("resolvedModelSelection")
        public ModelApiListApiInfoModelApiInfoResolvedModelSelection resolvedModelSelection;

        /**
         * <p>The routing mode. Only Direct is supported in the first phase.</p>
         * 
         * <strong>example:</strong>
         * <p>Direct</p>
         */
        @NameInMap("routingMode")
        public String routingMode;

        public static ModelApiListApiInfoModelApiInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoModelApiInfo self = new ModelApiListApiInfoModelApiInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoModelApiInfo setDirectSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
            this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
            return this;
        }
        public Boolean getDirectSupplyFallbackEnabled() {
            return this.directSupplyFallbackEnabled;
        }

        public ModelApiListApiInfoModelApiInfo setExposureMode(String exposureMode) {
            this.exposureMode = exposureMode;
            return this;
        }
        public String getExposureMode() {
            return this.exposureMode;
        }

        public ModelApiListApiInfoModelApiInfo setModelSelection(ModelSelection modelSelection) {
            this.modelSelection = modelSelection;
            return this;
        }
        public ModelSelection getModelSelection() {
            return this.modelSelection;
        }

        public ModelApiListApiInfoModelApiInfo setResolvedModelSelection(ModelApiListApiInfoModelApiInfoResolvedModelSelection resolvedModelSelection) {
            this.resolvedModelSelection = resolvedModelSelection;
            return this;
        }
        public ModelApiListApiInfoModelApiInfoResolvedModelSelection getResolvedModelSelection() {
            return this.resolvedModelSelection;
        }

        public ModelApiListApiInfoModelApiInfo setRoutingMode(String routingMode) {
            this.routingMode = routingMode;
            return this;
        }
        public String getRoutingMode() {
            return this.routingMode;
        }

    }

    public static class ModelApiListApiInfoModelCardRuntimeDiagnostics extends TeaModel {
        /**
         * <p>The index of the corresponding deployment configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("deployConfigIndex")
        public Integer deployConfigIndex;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d00000000000000000000</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>Indicates whether the marker of the deployment configuration is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("invalidConfiguration")
        public Boolean invalidConfiguration;

        /**
         * <p>The list of reasons for invalidity.</p>
         */
        @NameInMap("reasons")
        public java.util.List<String> reasons;

        public static ModelApiListApiInfoModelCardRuntimeDiagnostics build(java.util.Map<String, ?> map) throws Exception {
            ModelApiListApiInfoModelCardRuntimeDiagnostics self = new ModelApiListApiInfoModelCardRuntimeDiagnostics();
            return TeaModel.build(map, self);
        }

        public ModelApiListApiInfoModelCardRuntimeDiagnostics setDeployConfigIndex(Integer deployConfigIndex) {
            this.deployConfigIndex = deployConfigIndex;
            return this;
        }
        public Integer getDeployConfigIndex() {
            return this.deployConfigIndex;
        }

        public ModelApiListApiInfoModelCardRuntimeDiagnostics setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ModelApiListApiInfoModelCardRuntimeDiagnostics setInvalidConfiguration(Boolean invalidConfiguration) {
            this.invalidConfiguration = invalidConfiguration;
            return this;
        }
        public Boolean getInvalidConfiguration() {
            return this.invalidConfiguration;
        }

        public ModelApiListApiInfoModelCardRuntimeDiagnostics setReasons(java.util.List<String> reasons) {
            this.reasons = reasons;
            return this;
        }
        public java.util.List<String> getReasons() {
            return this.reasons;
        }

    }

}
