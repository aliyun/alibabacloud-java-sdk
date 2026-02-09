// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRouteRequest extends TeaModel {
    /**
     * <p>The backend service configurations for the route.</p>
     */
    @NameInMap("backendConfig")
    public CreateHttpApiRouteRequestBackendConfig backendConfig;

    /**
     * <p>deployConfigs</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The route description.</p>
     * 
     * <strong>example:</strong>
     * <p>User logon route</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cpqnr6tlhtgubcv***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <p>The MCP route configuration</p>
     */
    @NameInMap("mcpRouteConfig")
    public CreateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig;

    /**
     * <p>The route name.</p>
     * 
     * <strong>example:</strong>
     * <p>login</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The route-level policy configurations</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<HttpApiPolicyConfigs> policyConfigs;

    public static CreateHttpApiRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiRouteRequest self = new CreateHttpApiRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiRouteRequest setBackendConfig(CreateHttpApiRouteRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public CreateHttpApiRouteRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public CreateHttpApiRouteRequest setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public CreateHttpApiRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHttpApiRouteRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public CreateHttpApiRouteRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreateHttpApiRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public CreateHttpApiRouteRequest setMcpRouteConfig(CreateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig) {
        this.mcpRouteConfig = mcpRouteConfig;
        return this;
    }
    public CreateHttpApiRouteRequestMcpRouteConfig getMcpRouteConfig() {
        return this.mcpRouteConfig;
    }

    public CreateHttpApiRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHttpApiRouteRequest setPolicyConfigs(java.util.List<HttpApiPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public static class CreateHttpApiRouteRequestBackendConfigServices extends TeaModel {
        /**
         * <p>The service port (omit for dynamic ports).</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
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
         * <p>svc-crbgq0dlhtgr***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service version (valid only in tag-based scenarios).</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The traffic weight percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static CreateHttpApiRouteRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiRouteRequestBackendConfigServices self = new CreateHttpApiRouteRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiRouteRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateHttpApiRouteRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateHttpApiRouteRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public CreateHttpApiRouteRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHttpApiRouteRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateHttpApiRouteRequestBackendConfig extends TeaModel {
        /**
         * <p>The backend service scenario. Valid values:</p>
         * <ul>
         * <li>SingleService</li>
         * <li>MultiServiceByRatio</li>
         * <li>Mock</li>
         * <li>Redirect</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The list of backend services.</p>
         */
        @NameInMap("services")
        public java.util.List<CreateHttpApiRouteRequestBackendConfigServices> services;

        public static CreateHttpApiRouteRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiRouteRequestBackendConfig self = new CreateHttpApiRouteRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiRouteRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateHttpApiRouteRequestBackendConfig setServices(java.util.List<CreateHttpApiRouteRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<CreateHttpApiRouteRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class CreateHttpApiRouteRequestMcpRouteConfig extends TeaModel {
        /**
         * <p>The exposed URI path</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <p>mcpStatisticsEnable</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("mcpStatisticsEnable")
        public Boolean mcpStatisticsEnable;

        /**
         * <p>The MCP protocol</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP,HTTPS</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static CreateHttpApiRouteRequestMcpRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiRouteRequestMcpRouteConfig self = new CreateHttpApiRouteRequestMcpRouteConfig();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiRouteRequestMcpRouteConfig setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public CreateHttpApiRouteRequestMcpRouteConfig setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        public CreateHttpApiRouteRequestMcpRouteConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
