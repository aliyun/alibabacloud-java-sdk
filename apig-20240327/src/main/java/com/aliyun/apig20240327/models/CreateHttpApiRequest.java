// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRequest extends TeaModel {
    /**
     * <p>The list of protocols supported by the agent. This parameter is required when type is set to Agent. This parameter is not required for other types.</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>The AI API protocols. This parameter is required when type is set to LLM, and only one protocol can be specified. This parameter is required when type is set to Ai, and multiple protocols can be specified. This parameter is not required for other types.</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The authentication configuration. This parameter is required when enableAuth is set to true.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The API base path. The path must start with a forward slash (/), cannot exceed 256 bytes in length, and cannot contain spaces. This parameter is required when type is set to Rest. When type is set to LLM, Ai, or Agent, this parameter is optional and defaults to /.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The ID of the gateway to which the API belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-abc123xyz789</p>
     */
    @NameInMap("belongGatewayId")
    public String belongGatewayId;

    /**
     * <p>The API deployment configurations. This parameter is required when type is set to LLM or Ai, and only one deployment configuration can be specified. This parameter is not validated at the request level for other types.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test API for integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run without executing the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    @Deprecated
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable authentication. This parameter is validated when type is set to LLM, Ai, or Agent. This parameter is not validated at the request level when type is set to Rest.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The timeout period for waiting for the first byte from the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("firstByteTimeout")
    public Integer firstByteTimeout;

    /**
     * <p>The HTTP Ingress API configuration. This parameter is required and cannot be nil when type is set to HttpIngress. This parameter is not required for other types.</p>
     */
    @NameInMap("ingressConfig")
    public CreateHttpApiRequestIngressConfig ingressConfig;

    /**
     * <p>The model category. This parameter is optional when type is set to LLM or Ai. This parameter is not required for other types.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("modelCategory")
    public String modelCategory;

    /**
     * <p>The API name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The list of API access protocols.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>Specifies whether to remove the base path when forwarding requests.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("removeBasePathOnForward")
    public Boolean removeBasePathOnForward;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The conflict merge strategy for import.</p>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>The type of the HTTP API. Valid values:</p>
     * <ul>
     * <li>Http</li>
     * <li>Rest</li>
     * <li>WebSocket</li>
     * <li>HttpIngress</li>
     * <li>LLM</li>
     * <li>Agent</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The API versioning configuration.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static CreateHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiRequest self = new CreateHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiRequest setAgentProtocols(java.util.List<String> agentProtocols) {
        this.agentProtocols = agentProtocols;
        return this;
    }
    public java.util.List<String> getAgentProtocols() {
        return this.agentProtocols;
    }

    public CreateHttpApiRequest setAiProtocols(java.util.List<String> aiProtocols) {
        this.aiProtocols = aiProtocols;
        return this;
    }
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    public CreateHttpApiRequest setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public CreateHttpApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public CreateHttpApiRequest setBelongGatewayId(String belongGatewayId) {
        this.belongGatewayId = belongGatewayId;
        return this;
    }
    public String getBelongGatewayId() {
        return this.belongGatewayId;
    }

    public CreateHttpApiRequest setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public CreateHttpApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public CreateHttpApiRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateHttpApiRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public CreateHttpApiRequest setFirstByteTimeout(Integer firstByteTimeout) {
        this.firstByteTimeout = firstByteTimeout;
        return this;
    }
    public Integer getFirstByteTimeout() {
        return this.firstByteTimeout;
    }

    public CreateHttpApiRequest setIngressConfig(CreateHttpApiRequestIngressConfig ingressConfig) {
        this.ingressConfig = ingressConfig;
        return this;
    }
    public CreateHttpApiRequestIngressConfig getIngressConfig() {
        return this.ingressConfig;
    }

    public CreateHttpApiRequest setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }
    public String getModelCategory() {
        return this.modelCategory;
    }

    public CreateHttpApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHttpApiRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public CreateHttpApiRequest setRemoveBasePathOnForward(Boolean removeBasePathOnForward) {
        this.removeBasePathOnForward = removeBasePathOnForward;
        return this;
    }
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    public CreateHttpApiRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHttpApiRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public CreateHttpApiRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateHttpApiRequest setVersionConfig(HttpApiVersionConfig versionConfig) {
        this.versionConfig = versionConfig;
        return this;
    }
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static class CreateHttpApiRequestIngressConfig extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>k7v5eobfzttudni2pw***</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq146allhtgk***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The Ingress Class to listen on.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>Specifies whether to update the address in the Ingress Status.</p>
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
         * <p>src-crdddallhtgtr***</p>
         */
        @NameInMap("sourceId")
        @Deprecated
        public String sourceId;

        /**
         * <p>The namespace to listen on.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static CreateHttpApiRequestIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiRequestIngressConfig self = new CreateHttpApiRequestIngressConfig();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiRequestIngressConfig setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateHttpApiRequestIngressConfig setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public CreateHttpApiRequestIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public CreateHttpApiRequestIngressConfig setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        @Deprecated
        public CreateHttpApiRequestIngressConfig setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public CreateHttpApiRequestIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

}
