// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRouteRequest extends TeaModel {
    /**
     * <p>The backend service configuration of the route.</p>
     */
    @NameInMap("backendConfig")
    public UpdateHttpApiRouteRequestBackendConfig backendConfig;

    /**
     * <p>The route description.</p>
     * 
     * <strong>example:</strong>
     * <p>Product center service route</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of domain name IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cquqsollhtgid***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <p>The MCP route configuration.</p>
     */
    @NameInMap("mcpRouteConfig")
    public UpdateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig;

    /**
     * <p>The route-level policy configurations.</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<HttpApiPolicyConfigs> policyConfigs;

    public static UpdateHttpApiRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRouteRequest self = new UpdateHttpApiRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRouteRequest setBackendConfig(UpdateHttpApiRouteRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public UpdateHttpApiRouteRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public UpdateHttpApiRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHttpApiRouteRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public UpdateHttpApiRouteRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateHttpApiRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public UpdateHttpApiRouteRequest setMcpRouteConfig(UpdateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig) {
        this.mcpRouteConfig = mcpRouteConfig;
        return this;
    }
    public UpdateHttpApiRouteRequestMcpRouteConfig getMcpRouteConfig() {
        return this.mcpRouteConfig;
    }

    public UpdateHttpApiRouteRequest setPolicyConfigs(java.util.List<HttpApiPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public static class UpdateHttpApiRouteRequestBackendConfigServices extends TeaModel {
        /**
         * <p>The service group. Used in HTTP-to-Dubbo conversion scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The HTTP-to-Dubbo protocol conversion configuration. Only supported for SingleService MSE_NACOS DUBBO backends of HTTP APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dubboServiceName&quot;:&quot;com.alibaba.nacos.example.dubbo.service.DemoService&quot;,&quot;dubboServiceVersion&quot;:&quot;1.0.0&quot;,&quot;dubboServiceGroup&quot;:&quot;DEV&quot;,&quot;methodMapList&quot;:[{&quot;dubboMethodName&quot;:&quot;sayName&quot;,&quot;httpMethod&quot;:&quot;ALL_GET&quot;,&quot;methodPath&quot;:&quot;/dubbo/sayName&quot;,&quot;passThroughAllHeaders&quot;:&quot;PASS_ALL&quot;}]}</p>
         */
        @NameInMap("httpDubboTranscoder")
        public HttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The target model name. This field is shared by multiple existing model backend scenarios. The specific routing or model rewrite semantics are determined by backendConfig.scene. This field is required for the SemanticRouter scenario. If not specified in the AiAutoRouter scenario, the default model of the AI service is used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The service namespace. Used in HTTP-to-Dubbo conversion scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The service port. Do not specify this parameter for dynamic ports.</p>
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
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service source type. Use MSE_NACOS for HTTP-to-Dubbo conversion scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_NACOS</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The percentage value of the traffic ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static UpdateHttpApiRouteRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfigServices self = new UpdateHttpApiRouteRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setHttpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
            this.httpDubboTranscoder = httpDubboTranscoder;
            return this;
        }
        public HttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateHttpApiRouteRequestBackendConfig extends TeaModel {
        /**
         * <p>The backend service scenario.</p>
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
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services;

        public static UpdateHttpApiRouteRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfig self = new UpdateHttpApiRouteRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHttpApiRouteRequestBackendConfig setServices(java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class UpdateHttpApiRouteRequestMcpRouteConfig extends TeaModel {
        /**
         * <p>The exposed URI path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp/chat</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <p>Specifies whether to enable MCP statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("mcpStatisticsEnable")
        public Boolean mcpStatisticsEnable;

        /**
         * <p>The MCP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static UpdateHttpApiRouteRequestMcpRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestMcpRouteConfig self = new UpdateHttpApiRouteRequestMcpRouteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
