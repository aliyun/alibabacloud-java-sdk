// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRequest extends TeaModel {
    /**
     * <p>The AI API protocols. Valid value:</p>
     * <ul>
     * <li>OpenAI/v1</li>
     * </ul>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    /**
     * <p>The authentication configurations.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The API base path, which must start with a forward slash (/).</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The API deployment configurations. Currently, only AI APIs support deployment configurations, and only a single deployment configuration can be passed.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>API for testing</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable authentication.</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The HTTP Ingress configurations.</p>
     */
    @NameInMap("ingressConfig")
    public CreateHttpApiRequestIngressConfig ingressConfig;

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
     * <p>The protocols that are used to call the API.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzgvmlotionbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The API type. Valid values:</p>
     * <ul>
     * <li>Http</li>
     * <li>Rest</li>
     * <li>WebSocket</li>
     * <li>HttpIngress</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The versioning configuration of the API.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static CreateHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiRequest self = new CreateHttpApiRequest();
        return TeaModel.build(map, self);
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

    public CreateHttpApiRequest setIngressConfig(CreateHttpApiRequestIngressConfig ingressConfig) {
        this.ingressConfig = ingressConfig;
        return this;
    }
    public CreateHttpApiRequestIngressConfig getIngressConfig() {
        return this.ingressConfig;
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
         * <p>The Ingress Class for listening.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>Specifies whether to update the address in Ingress Status.</p>
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
         * <p>The namespace for listening.</p>
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
