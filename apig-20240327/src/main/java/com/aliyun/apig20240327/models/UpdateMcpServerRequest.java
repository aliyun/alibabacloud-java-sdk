// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateMcpServerRequest extends TeaModel {
    /**
     * <p>The list of assembled sources. This parameter is required when type is AssemblyMCP.</p>
     */
    @NameInMap("assembledSources")
    public java.util.List<UpdateMcpServerRequestAssembledSources> assembledSources;

    /**
     * <p>The backend service configuration of the route.</p>
     */
    @NameInMap("backendConfig")
    public UpdateMcpServerRequestBackendConfig backendConfig;

    /**
     * <p>The creation source type. Valid values:</p>
     * <ul>
     * <li>ApiGatewayHttpToMCP: gateway-managed HTTP-to-MCP conversion.</li>
     * <li>ApiGatewayProxyMcpHosting: gateway-managed MCP direct proxy.</li>
     * <li>ApiGatewayAssembly: gateway MCP assembly.</li>
     * <li>NacosHttpToMCP: gateway-managed Nacos-synced HTTP-to-MCP conversion.</li>
     * <li>NacosMcpHosting: gateway-managed Nacos-synced MCP direct proxy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ApiGatewayMcpHosting</p>
     */
    @NameInMap("createFromType")
    public String createFromType;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>商品中心服务路由</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain name IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The exposed URI path. This parameter is required when protocol is SSE or StreamableHTTP and type is RealMCP.</p>
     * 
     * <strong>example:</strong>
     * <p>/sse</p>
     */
    @NameInMap("exposedUriPath")
    public String exposedUriPath;

    /**
     * <p>The list of canary release MCP server route configurations.</p>
     */
    @NameInMap("grayMcpServerConfigs")
    public java.util.List<UpdateMcpServerRequestGrayMcpServerConfigs> grayMcpServerConfigs;

    /**
     * <p>The route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <p>The HTTP-to-MCP configuration.</p>
     */
    @NameInMap("mcpServerConfig")
    public UpdateMcpServerRequestMcpServerConfig mcpServerConfig;

    /**
     * <p>Specifies whether to enable MCP observability. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("mcpStatisticsEnable")
    public Boolean mcpStatisticsEnable;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li>HTTP: HTTP protocol.</li>
     * <li>HTTPS: HTTPS protocol.</li>
     * <li>SSE: Server-Sent Events protocol.</li>
     * <li>StreamableHTTP: streamable HTTP protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The MCP server type filter. Valid values:</p>
     * <ul>
     * <li>RealMCP</li>
     * <li>AssemblyMCP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RealMCP</p>
     */
    @NameInMap("type")
    public String type;

    public static UpdateMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServerRequest self = new UpdateMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServerRequest setAssembledSources(java.util.List<UpdateMcpServerRequestAssembledSources> assembledSources) {
        this.assembledSources = assembledSources;
        return this;
    }
    public java.util.List<UpdateMcpServerRequestAssembledSources> getAssembledSources() {
        return this.assembledSources;
    }

    public UpdateMcpServerRequest setBackendConfig(UpdateMcpServerRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public UpdateMcpServerRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public UpdateMcpServerRequest setCreateFromType(String createFromType) {
        this.createFromType = createFromType;
        return this;
    }
    public String getCreateFromType() {
        return this.createFromType;
    }

    public UpdateMcpServerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMcpServerRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public UpdateMcpServerRequest setExposedUriPath(String exposedUriPath) {
        this.exposedUriPath = exposedUriPath;
        return this;
    }
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    public UpdateMcpServerRequest setGrayMcpServerConfigs(java.util.List<UpdateMcpServerRequestGrayMcpServerConfigs> grayMcpServerConfigs) {
        this.grayMcpServerConfigs = grayMcpServerConfigs;
        return this;
    }
    public java.util.List<UpdateMcpServerRequestGrayMcpServerConfigs> getGrayMcpServerConfigs() {
        return this.grayMcpServerConfigs;
    }

    public UpdateMcpServerRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public UpdateMcpServerRequest setMcpServerConfig(UpdateMcpServerRequestMcpServerConfig mcpServerConfig) {
        this.mcpServerConfig = mcpServerConfig;
        return this;
    }
    public UpdateMcpServerRequestMcpServerConfig getMcpServerConfig() {
        return this.mcpServerConfig;
    }

    public UpdateMcpServerRequest setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
        this.mcpStatisticsEnable = mcpStatisticsEnable;
        return this;
    }
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    public UpdateMcpServerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateMcpServerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateMcpServerRequestAssembledSources extends TeaModel {
        /**
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-afaefaefaf</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The MCP server name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The list of MCP tools.</p>
         */
        @NameInMap("tools")
        public java.util.List<String> tools;

        public static UpdateMcpServerRequestAssembledSources build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestAssembledSources self = new UpdateMcpServerRequestAssembledSources();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestAssembledSources setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public UpdateMcpServerRequestAssembledSources setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public UpdateMcpServerRequestAssembledSources setTools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<String> getTools() {
            return this.tools;
        }

    }

    public static class UpdateMcpServerRequestBackendConfigServices extends TeaModel {
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
         * <li>TCP</li>
         * <li>HTTP</li>
         * <li>DUBBO</li>
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

        public static UpdateMcpServerRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestBackendConfigServices self = new UpdateMcpServerRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMcpServerRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateMcpServerRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateMcpServerRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateMcpServerRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateMcpServerRequestBackendConfig extends TeaModel {
        /**
         * <p>The backend service scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The backend services.</p>
         */
        @NameInMap("services")
        public java.util.List<UpdateMcpServerRequestBackendConfigServices> services;

        public static UpdateMcpServerRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestBackendConfig self = new UpdateMcpServerRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateMcpServerRequestBackendConfig setServices(java.util.List<UpdateMcpServerRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<UpdateMcpServerRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices extends TeaModel {
        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol.</p>
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
         * <p>gray-svc-123</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The version number.</p>
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

        public static UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices self = new UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig extends TeaModel {
        /**
         * <p>The backend scenario.</p>
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
        public java.util.List<UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> services;

        public static UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig self = new UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig setServices(java.util.List<UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<UpdateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class UpdateMcpServerRequestGrayMcpServerConfigs extends TeaModel {
        /**
         * <p>The backend configuration.</p>
         */
        @NameInMap("backendConfig")
        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig backendConfig;

        /**
         * <p>The route match rule.</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>route-123</p>
         */
        @NameInMap("routeId")
        public String routeId;

        public static UpdateMcpServerRequestGrayMcpServerConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestGrayMcpServerConfigs self = new UpdateMcpServerRequestGrayMcpServerConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestGrayMcpServerConfigs setBackendConfig(UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }
        public UpdateMcpServerRequestGrayMcpServerConfigsBackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigs setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public UpdateMcpServerRequestGrayMcpServerConfigs setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

    public static class UpdateMcpServerRequestMcpServerConfig extends TeaModel {
        /**
         * <p>The MCP server configuration. This parameter is mutually exclusive with swaggerConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-server-spec-yaml</p>
         */
        @NameInMap("mcpServerSpec")
        public String mcpServerSpec;

        /**
         * <p>The Swagger document for HTTP-to-MCP conversion. The document must comply with the OpenAPI 3.0 specification.</p>
         * 
         * <strong>example:</strong>
         * <p>swagger-content</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        public static UpdateMcpServerRequestMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpServerRequestMcpServerConfig self = new UpdateMcpServerRequestMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpServerRequestMcpServerConfig setMcpServerSpec(String mcpServerSpec) {
            this.mcpServerSpec = mcpServerSpec;
            return this;
        }
        public String getMcpServerSpec() {
            return this.mcpServerSpec;
        }

        public UpdateMcpServerRequestMcpServerConfig setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

    }

}
