// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRequest extends TeaModel {
    /**
     * <p>Agent protocols</p>
     */
    @NameInMap("agentProtocols")
    public java.util.List<String> agentProtocols;

    /**
     * <p>$.parameters[0].schema.properties.authConfig.enumValueTitles</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The request parameters for API creation.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>$.parameters[0].schema.properties.deployConfigs.items.example</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>$.parameters[0].schema.example</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>$.parameters[0].schema.properties.aiProtocols.items.description</p>
     * 
     * <strong>example:</strong>
     * <p>$.parameters[0].schema.properties.aiProtocols.items.example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Create an API of HTTP type</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>First byte timeout</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("firstByteTimeout")
    public Integer firstByteTimeout;

    /**
     * <p>$.parameters[0].schema.properties.deployConfigs.example</p>
     */
    @NameInMap("ingressConfig")
    public CreateHttpApiRequestIngressConfig ingressConfig;

    /**
     * <p>Model category</p>
     * 
     * <strong>example:</strong>
     * <p>llm/text-to-image</p>
     */
    @NameInMap("modelCategory")
    public String modelCategory;

    /**
     * <p>$.parameters[0].schema.example</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-api</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>$.parameters[0].schema.properties.aiProtocols.description</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>Whether to remove base path when forwarding</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("removeBasePathOnForward")
    public Boolean removeBasePathOnForward;

    /**
     * <p>$.parameters[0].schema.properties.authConfig.example</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>$.parameters[0].schema.properties.deployConfigs.description</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>$.parameters[0].schema.properties.deployConfigs.items.enumValueTitles</p>
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
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>k7v5eobfzttudni2pw***</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>$.parameters[0].schema.properties.deployConfigs.enumValueTitles</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq146allhtgk***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>$.parameters[0].schema.properties.enableAuth.example</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>$.parameters[0].schema.properties.authConfig.description</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <p>$.parameters[0].schema.properties.enableAuth.description</p>
         * 
         * <strong>example:</strong>
         * <p>src-crdddallhtgtr***</p>
         */
        @NameInMap("sourceId")
        @Deprecated
        public String sourceId;

        /**
         * <p>$.parameters[0].schema.properties.enableAuth.enumValueTitles</p>
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
