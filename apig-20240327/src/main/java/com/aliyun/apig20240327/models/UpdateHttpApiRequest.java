// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRequest extends TeaModel {
    /**
     * <p>List of AI protocols.</p>
     */
    @NameInMap("aiProtocols")
    public java.util.List<String> aiProtocols;

    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>Base path of the API, which must start with a \&quot;/\&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>List of API deployment configurations.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>API description.</p>
     * 
     * <strong>example:</strong>
     * <p>更新API描述</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>Configuration information for the HTTP Ingress API.</p>
     */
    @NameInMap("ingressConfig")
    public UpdateHttpApiRequestIngressConfig ingressConfig;

    /**
     * <p>List of API access protocols.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>API versioning configuration.</p>
     */
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static UpdateHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRequest self = new UpdateHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRequest setAiProtocols(java.util.List<String> aiProtocols) {
        this.aiProtocols = aiProtocols;
        return this;
    }
    public java.util.List<String> getAiProtocols() {
        return this.aiProtocols;
    }

    public UpdateHttpApiRequest setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public UpdateHttpApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public UpdateHttpApiRequest setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public UpdateHttpApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHttpApiRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public UpdateHttpApiRequest setIngressConfig(UpdateHttpApiRequestIngressConfig ingressConfig) {
        this.ingressConfig = ingressConfig;
        return this;
    }
    public UpdateHttpApiRequestIngressConfig getIngressConfig() {
        return this.ingressConfig;
    }

    public UpdateHttpApiRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public UpdateHttpApiRequest setVersionConfig(HttpApiVersionConfig versionConfig) {
        this.versionConfig = versionConfig;
        return this;
    }
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

    public static class UpdateHttpApiRequestIngressConfig extends TeaModel {
        /**
         * <p>Environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cr6ql0tlhtgmc****</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Ingress Class being listened to.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <p>Whether to update the address in the Ingress Status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <p>Source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-crdddallhtgtr****</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>Watched namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static UpdateHttpApiRequestIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRequestIngressConfig self = new UpdateHttpApiRequestIngressConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRequestIngressConfig setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public UpdateHttpApiRequestIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public UpdateHttpApiRequestIngressConfig setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public UpdateHttpApiRequestIngressConfig setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public UpdateHttpApiRequestIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

}
