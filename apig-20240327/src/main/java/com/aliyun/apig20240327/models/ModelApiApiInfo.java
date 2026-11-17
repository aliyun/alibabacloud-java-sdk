// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiApiInfo extends TeaModel {
    /**
     * <p>The collection of agent protocols for the model API.</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>The API base path.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The read-only correlation identifier for creation requests. It is returned only when the association with the same instance is unique within approximately 24 hours after the first persistence following normal authentication. It is omitted for historical, expired, or ambiguous cases. This identifier cannot be used to determine the success of publishing or authorization, nor does it replace the creation of idempotent records.</p>
     * 
     * <strong>example:</strong>
     * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
     */
    @NameInMap("creationClientToken")
    public String creationClientToken;

    /**
     * <p>The deletion status of the new version model API. This field is read-only and optional. Deleting indicates that the deletion request is accepted but not yet completed. DeleteFailed indicates that the background deletion failed, and you can use the original clientToken to retry the DeleteModelApi operation. This field is not returned for normal publishing and historical undeployment. The absence of this field does not indicate that the deletion is complete.</p>
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
    public java.util.Map<String, ModelApiApiInfoDeployCntMapValue> deployCntMap;

    /**
     * <p>The reason for the deployment or deletion failure. This field is read-only.</p>
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
     * <p>The read-only domain name details and the default domain name flag.</p>
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
     * <p>The default environment ID of the bound instance. This field is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>env-d00000000000000000000</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

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
    public ModelApiApiInfoIngressInfo ingressInfo;

    /**
     * <p>The model API public selection information.</p>
     */
    @NameInMap("modelApiInfo")
    public ModelApiApiInfoModelApiInfo modelApiInfo;

    /**
     * <p>The read-only runtime diagnostic information for model cards, derived from the original markers of the deployment configuration. It is used only for the readability and diagnostics of abnormal drafts.</p>
     */
    @NameInMap("modelCardRuntimeDiagnostics")
    public java.util.List<ModelApiApiInfoModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics;

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
     * <p>The collection of successfully published per-path executable models. This field is read-only. It is empty when a snapshot is missing, which does not represent consumer permission.</p>
     */
    @NameInMap("publishedEndpoints")
    public java.util.List<ModelApiApiInfoPublishedEndpoints> publishedEndpoints;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The publishing status on the bound instance. In the new version, the status is Undeploying when a deletion is in progress, and UndeployFailed when a deletion fails. To determine whether an operation is a deletion, refer to the deleteStatus field.</p>
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

    public static ModelApiApiInfo build(java.util.Map<String, ?> map) throws Exception {
        ModelApiApiInfo self = new ModelApiApiInfo();
        return TeaModel.build(map, self);
    }

    public ModelApiApiInfo setAgentProtocols(java.util.List<String> agentProtocols) {
        this.agentProtocols = agentProtocols;
        return this;
    }
    public java.util.List<String> getAgentProtocols() {
        return this.agentProtocols;
    }

    public ModelApiApiInfo setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public ModelApiApiInfo setCreationClientToken(String creationClientToken) {
        this.creationClientToken = creationClientToken;
        return this;
    }
    public String getCreationClientToken() {
        return this.creationClientToken;
    }

    public ModelApiApiInfo setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }
    public String getDeleteStatus() {
        return this.deleteStatus;
    }

    public ModelApiApiInfo setDeployCntMap(java.util.Map<String, ModelApiApiInfoDeployCntMapValue> deployCntMap) {
        this.deployCntMap = deployCntMap;
        return this;
    }
    public java.util.Map<String, ModelApiApiInfoDeployCntMapValue> getDeployCntMap() {
        return this.deployCntMap;
    }

    public ModelApiApiInfo setDeployErrorMessage(String deployErrorMessage) {
        this.deployErrorMessage = deployErrorMessage;
        return this;
    }
    public String getDeployErrorMessage() {
        return this.deployErrorMessage;
    }

    public ModelApiApiInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelApiApiInfo setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public ModelApiApiInfo setDomainInfos(java.util.List<ModelApiDomainInfo> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public java.util.List<ModelApiDomainInfo> getDomainInfos() {
        return this.domainInfos;
    }

    public ModelApiApiInfo setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public ModelApiApiInfo setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ModelApiApiInfo setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModelApiApiInfo setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public ModelApiApiInfo setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public ModelApiApiInfo setIngressInfo(ModelApiApiInfoIngressInfo ingressInfo) {
        this.ingressInfo = ingressInfo;
        return this;
    }
    public ModelApiApiInfoIngressInfo getIngressInfo() {
        return this.ingressInfo;
    }

    public ModelApiApiInfo setModelApiInfo(ModelApiApiInfoModelApiInfo modelApiInfo) {
        this.modelApiInfo = modelApiInfo;
        return this;
    }
    public ModelApiApiInfoModelApiInfo getModelApiInfo() {
        return this.modelApiInfo;
    }

    public ModelApiApiInfo setModelCardRuntimeDiagnostics(java.util.List<ModelApiApiInfoModelCardRuntimeDiagnostics> modelCardRuntimeDiagnostics) {
        this.modelCardRuntimeDiagnostics = modelCardRuntimeDiagnostics;
        return this;
    }
    public java.util.List<ModelApiApiInfoModelCardRuntimeDiagnostics> getModelCardRuntimeDiagnostics() {
        return this.modelCardRuntimeDiagnostics;
    }

    public ModelApiApiInfo setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public ModelApiApiInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelApiApiInfo setPolicyConfigs(java.util.List<ModelApiPolicyConfig> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<ModelApiPolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public ModelApiApiInfo setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public ModelApiApiInfo setPublishedEndpoints(java.util.List<ModelApiApiInfoPublishedEndpoints> publishedEndpoints) {
        this.publishedEndpoints = publishedEndpoints;
        return this;
    }
    public java.util.List<ModelApiApiInfoPublishedEndpoints> getPublishedEndpoints() {
        return this.publishedEndpoints;
    }

    public ModelApiApiInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModelApiApiInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModelApiApiInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModelApiApiInfo setVersionInfo(HttpApiVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }
    public HttpApiVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public static class ModelApiApiInfoIngressInfoEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-d00000000000000000000</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        public static ModelApiApiInfoIngressInfoEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoIngressInfoEnvironmentInfo self = new ModelApiApiInfoIngressInfoEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoIngressInfoEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

    }

    public static class ModelApiApiInfoIngressInfoK8sClusterInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c00000000000000000000000000000001</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static ModelApiApiInfoIngressInfoK8sClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoIngressInfoK8sClusterInfo self = new ModelApiApiInfoIngressInfoK8sClusterInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoIngressInfoK8sClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ModelApiApiInfoIngressInfo extends TeaModel {
        /**
         * <p>The environment context.</p>
         */
        @NameInMap("environmentInfo")
        public ModelApiApiInfoIngressInfoEnvironmentInfo environmentInfo;

        /**
         * <p>The ingress class.</p>
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
        public ModelApiApiInfoIngressInfoK8sClusterInfo k8sClusterInfo;

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

        public static ModelApiApiInfoIngressInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoIngressInfo self = new ModelApiApiInfoIngressInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoIngressInfo setEnvironmentInfo(ModelApiApiInfoIngressInfoEnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public ModelApiApiInfoIngressInfoEnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public ModelApiApiInfoIngressInfo setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public ModelApiApiInfoIngressInfo setK8sClusterInfo(ModelApiApiInfoIngressInfoK8sClusterInfo k8sClusterInfo) {
            this.k8sClusterInfo = k8sClusterInfo;
            return this;
        }
        public ModelApiApiInfoIngressInfoK8sClusterInfo getK8sClusterInfo() {
            return this.k8sClusterInfo;
        }

        public ModelApiApiInfoIngressInfo setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public ModelApiApiInfoIngressInfo setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ModelApiApiInfoIngressInfo setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class ModelApiApiInfoModelApiInfoResolvedModelSelection extends TeaModel {
        /**
         * <p>Indicates whether the expanded collection of the current configuration is fully read. A fully empty group returns true and an empty array. Missing, invalid groups, or read failures return false. This does not reflect the online publishing or consumer permission status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("complete")
        public Boolean complete;

        /**
         * <p>The identities of the models selected for public exposure in the current configuration, stably sorted and deduplicated. Logical models retain their own IDs and do not include fallback-only targets or underlying execution cards of logical models. If complete is false, this is an empty array and must not be interpreted as zero models.</p>
         */
        @NameInMap("modelCardIds")
        public java.util.List<String> modelCardIds;

        public static ModelApiApiInfoModelApiInfoResolvedModelSelection build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoModelApiInfoResolvedModelSelection self = new ModelApiApiInfoModelApiInfoResolvedModelSelection();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoModelApiInfoResolvedModelSelection setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public ModelApiApiInfoModelApiInfoResolvedModelSelection setModelCardIds(java.util.List<String> modelCardIds) {
            this.modelCardIds = modelCardIds;
            return this;
        }
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

    }

    public static class ModelApiApiInfoModelApiInfo extends TeaModel {
        /**
         * <p>The saved state of the direct supply fallback. A value of false indicates that it is disabled. This only reflects the saved configuration and does not indicate successful publishing or activation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("directSupplyFallbackEnabled")
        public Boolean directSupplyFallbackEnabled;

        /**
         * <p>The model exposure mode. Only SELECTED is supported in Phase 1.</p>
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
         * <p>The read-only collection of publicly exposed models for the current configuration. It retains the modelSelection edit source, but the successful online collection is still subject to publishedEndpoints.</p>
         */
        @NameInMap("resolvedModelSelection")
        public ModelApiApiInfoModelApiInfoResolvedModelSelection resolvedModelSelection;

        /**
         * <p>The routing mode. Only Direct is supported in Phase 1.</p>
         * 
         * <strong>example:</strong>
         * <p>Direct</p>
         */
        @NameInMap("routingMode")
        public String routingMode;

        public static ModelApiApiInfoModelApiInfo build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoModelApiInfo self = new ModelApiApiInfoModelApiInfo();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoModelApiInfo setDirectSupplyFallbackEnabled(Boolean directSupplyFallbackEnabled) {
            this.directSupplyFallbackEnabled = directSupplyFallbackEnabled;
            return this;
        }
        public Boolean getDirectSupplyFallbackEnabled() {
            return this.directSupplyFallbackEnabled;
        }

        public ModelApiApiInfoModelApiInfo setExposureMode(String exposureMode) {
            this.exposureMode = exposureMode;
            return this;
        }
        public String getExposureMode() {
            return this.exposureMode;
        }

        public ModelApiApiInfoModelApiInfo setModelSelection(ModelSelection modelSelection) {
            this.modelSelection = modelSelection;
            return this;
        }
        public ModelSelection getModelSelection() {
            return this.modelSelection;
        }

        public ModelApiApiInfoModelApiInfo setResolvedModelSelection(ModelApiApiInfoModelApiInfoResolvedModelSelection resolvedModelSelection) {
            this.resolvedModelSelection = resolvedModelSelection;
            return this;
        }
        public ModelApiApiInfoModelApiInfoResolvedModelSelection getResolvedModelSelection() {
            return this.resolvedModelSelection;
        }

        public ModelApiApiInfoModelApiInfo setRoutingMode(String routingMode) {
            this.routingMode = routingMode;
            return this;
        }
        public String getRoutingMode() {
            return this.routingMode;
        }

    }

    public static class ModelApiApiInfoModelCardRuntimeDiagnostics extends TeaModel {
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

        public static ModelApiApiInfoModelCardRuntimeDiagnostics build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoModelCardRuntimeDiagnostics self = new ModelApiApiInfoModelCardRuntimeDiagnostics();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoModelCardRuntimeDiagnostics setDeployConfigIndex(Integer deployConfigIndex) {
            this.deployConfigIndex = deployConfigIndex;
            return this;
        }
        public Integer getDeployConfigIndex() {
            return this.deployConfigIndex;
        }

        public ModelApiApiInfoModelCardRuntimeDiagnostics setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ModelApiApiInfoModelCardRuntimeDiagnostics setInvalidConfiguration(Boolean invalidConfiguration) {
            this.invalidConfiguration = invalidConfiguration;
            return this;
        }
        public Boolean getInvalidConfiguration() {
            return this.invalidConfiguration;
        }

        public ModelApiApiInfoModelCardRuntimeDiagnostics setReasons(java.util.List<String> reasons) {
            this.reasons = reasons;
            return this;
        }
        public java.util.List<String> getReasons() {
            return this.reasons;
        }

    }

    public static class ModelApiApiInfoPublishedEndpoints extends TeaModel {
        /**
         * <p>The name of the successfully published built-in endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>model-responses</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The collection of executable ModelCard IDs successfully published for this path.</p>
         */
        @NameInMap("modelCardIds")
        public java.util.List<String> modelCardIds;

        public static ModelApiApiInfoPublishedEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ModelApiApiInfoPublishedEndpoints self = new ModelApiApiInfoPublishedEndpoints();
            return TeaModel.build(map, self);
        }

        public ModelApiApiInfoPublishedEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ModelApiApiInfoPublishedEndpoints setModelCardIds(java.util.List<String> modelCardIds) {
            this.modelCardIds = modelCardIds;
            return this;
        }
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

    }

}
