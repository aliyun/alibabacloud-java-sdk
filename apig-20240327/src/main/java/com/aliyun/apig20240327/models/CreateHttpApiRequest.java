// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRequest extends TeaModel {
    /**
     * <p>The list of protocols supported by the agent. This parameter is required when type is set to Agent. For other types, you do not need to specify this parameter.</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>The list of AI API protocols. This parameter is required and only one protocol can be specified when type is set to LLM. This parameter is required and multiple protocols can be specified when type is set to Ai. For other types, this parameter is not required. Example: OpenAI/v1.</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The permission authentication configuration. This parameter is required when enableAuth is set to true.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The base path of the API. It must start with a forward slash (/), be up to 256 bytes in length, and contain no spaces. This parameter is required when type is set to Rest. When type is set to LLM, Ai, or Agent, this parameter is optional and defaults to /.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The ID of the associated gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-abc123xyz789</p>
     */
    @NameInMap("belongGatewayId")
    public String belongGatewayId;

    /**
     * <p>The list of deployment configurations for the HTTP API. This parameter is required and only one deployment configuration can be specified when type is set to LLM or Ai. For other types, this parameter is not validated at the request layer.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Test API for integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to only preview the operation without executing it.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    @Deprecated
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable permission authentication. This parameter is validated when type is set to LLM, Ai, or Agent. When type is set to Rest, this parameter is not validated at the request layer.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The timeout period for waiting for the backend to return the first byte.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("firstByteTimeout")
    public Integer firstByteTimeout;

    /**
     * <p>The configuration information of the HTTP Ingress API. This parameter is required and cannot be null when type is set to HttpIngress. For other types, you do not need to specify this parameter.</p>
     */
    @NameInMap("ingressConfig")
    public CreateHttpApiRequestIngressConfig ingressConfig;

    /**
     * <p>The AI model category. This parameter is optional when type is set to LLM or Ai. For other types, you do not need to specify this parameter. Valid values: Text (text generation), Image (image generation), Audio (audio processing), Video (video generation), MultiModal (multimodal), Embedding (vector embedding), Rerank (reranking), and Others (others).</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("modelCategory")
    public String modelCategory;

    /**
     * <p>The name of the HTTP API, which is used to identify the current API resource, such as test-api.</p>
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
     * <p>The conflict merging strategy for import.</p>
     * 
     * <strong>example:</strong>
     * <p>ExistFirst</p>
     */
    @NameInMap("strategy")
    public String strategy;

    /**
     * <p>The type of the HTTP API. Valid values: Http (common HTTP API), Rest (RESTful API), WebSocket (WebSocket API), HttpIngress (HTTP API accessed through Ingress), LLM (large language model API), and Agent (agent API).</p>
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

    /**
     * <p>The idempotency token. A globally unique value generated by the caller (a UUID is recommended). The value can be up to 64 characters in length. If you make a repeated request with the same ClientToken and identical request parameters within approximately 24 hours after the initial request succeeds, the system directly returns the httpApiId created by the initial request and does not create a duplicate HTTP API. If a repeated request has the same ClientToken but different request parameters, the system returns the IdempotentParameterMismatch error. If the initial request is still being processed, the system returns the IdempotentProcessing error. If this parameter is not specified, idempotency control is disabled, and the behavior remains the same as in previous versions.</p>
     * 
     * <strong>example:</strong>
     * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

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

    public CreateHttpApiRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
         * <p>The Ingress class to listen on.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>Specifies whether to update the address in the Ingress status.</p>
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
         * <p>The namespace to watch.</p>
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
