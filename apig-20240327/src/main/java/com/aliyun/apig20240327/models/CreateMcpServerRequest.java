// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMcpServerRequest extends TeaModel {
    /**
     * <p>The list of assembly sources. This parameter is required when the type parameter is set to AssemblyMCP.</p>
     */
    @NameInMap("assembledSources")
    public java.util.List<CreateMcpServerRequestAssembledSources> assembledSources;

    /**
     * <p>The backend service configurations for the route.</p>
     */
    @NameInMap("backendConfig")
    public CreateMcpServerRequestBackendConfig backendConfig;

    /**
     * <p>Creates the MCP server from the specified type.</p>
     */
    @NameInMap("createFromType")
    public String createFromType;

    /**
     * <p>The MCP server description.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp tool fetch time</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The exposed URI path. This parameter is required when the protocol parameter is set to SSE or StreamableHTTP, and the type parameter is set to RealMCP.</p>
     * 
     * <strong>example:</strong>
     * <p>/sse</p>
     */
    @NameInMap("exposedUriPath")
    public String exposedUriPath;

    /**
     * <p>The ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qac0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("grayMcpServerConfigs")
    public java.util.List<CreateMcpServerRequestGrayMcpServerConfigs> grayMcpServerConfigs;

    /**
     * <p>The route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    @NameInMap("mcpServerConfig")
    public CreateMcpServerRequestMcpServerConfig mcpServerConfig;

    /**
     * <p>Specifies whether MCP observability is enabled. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("mcpStatisticsEnable")
    public Boolean mcpStatisticsEnable;

    /**
     * <p>The name of the MCP server. The name must match the regular expression ^<a href="%5B-a-z0-9%5D%5C*%5Ba-z0-9%5D">a-z0-9</a>?(.<a href="%5B-a-z0-9%5D%5C*%5Ba-z0-9%5D">a-z0-9</a>?)\*$ and can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fetch-time</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The protocol type. Valid values: HTTP, HTTPS, SSE, and StreamableHTTP</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The type. Valid value:</p>
     * <p>RealMCP: regular MCP service</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RealMCP</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServerRequest self = new CreateMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpServerRequest setAssembledSources(java.util.List<CreateMcpServerRequestAssembledSources> assembledSources) {
        this.assembledSources = assembledSources;
        return this;
    }
    public java.util.List<CreateMcpServerRequestAssembledSources> getAssembledSources() {
        return this.assembledSources;
    }

    public CreateMcpServerRequest setBackendConfig(CreateMcpServerRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public CreateMcpServerRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public CreateMcpServerRequest setCreateFromType(String createFromType) {
        this.createFromType = createFromType;
        return this;
    }
    public String getCreateFromType() {
        return this.createFromType;
    }

    public CreateMcpServerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMcpServerRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public CreateMcpServerRequest setExposedUriPath(String exposedUriPath) {
        this.exposedUriPath = exposedUriPath;
        return this;
    }
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    public CreateMcpServerRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateMcpServerRequest setGrayMcpServerConfigs(java.util.List<CreateMcpServerRequestGrayMcpServerConfigs> grayMcpServerConfigs) {
        this.grayMcpServerConfigs = grayMcpServerConfigs;
        return this;
    }
    public java.util.List<CreateMcpServerRequestGrayMcpServerConfigs> getGrayMcpServerConfigs() {
        return this.grayMcpServerConfigs;
    }

    public CreateMcpServerRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public CreateMcpServerRequest setMcpServerConfig(CreateMcpServerRequestMcpServerConfig mcpServerConfig) {
        this.mcpServerConfig = mcpServerConfig;
        return this;
    }
    public CreateMcpServerRequestMcpServerConfig getMcpServerConfig() {
        return this.mcpServerConfig;
    }

    public CreateMcpServerRequest setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
        this.mcpStatisticsEnable = mcpStatisticsEnable;
        return this;
    }
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    public CreateMcpServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMcpServerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateMcpServerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMcpServerRequestAssembledSources extends TeaModel {
        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-sdfa3qgavz</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The list of the MCP tools.</p>
         */
        @NameInMap("tools")
        public java.util.List<String> tools;

        public static CreateMcpServerRequestAssembledSources build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestAssembledSources self = new CreateMcpServerRequestAssembledSources();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestAssembledSources setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateMcpServerRequestAssembledSources setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public CreateMcpServerRequestAssembledSources setTools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<String> getTools() {
            return this.tools;
        }

    }

    public static class CreateMcpServerRequestBackendConfigServices extends TeaModel {
        /**
         * <p>The backend node port of the service.</p>
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
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.6</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static CreateMcpServerRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestBackendConfigServices self = new CreateMcpServerRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMcpServerRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpServerRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public CreateMcpServerRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateMcpServerRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateMcpServerRequestBackendConfig extends TeaModel {
        /**
         * <p>The scenario of the backend service.</p>
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
        public java.util.List<CreateMcpServerRequestBackendConfigServices> services;

        public static CreateMcpServerRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestBackendConfig self = new CreateMcpServerRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateMcpServerRequestBackendConfig setServices(java.util.List<CreateMcpServerRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<CreateMcpServerRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices extends TeaModel {
        @NameInMap("port")
        public Integer port;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("version")
        public String version;

        @NameInMap("weight")
        public Integer weight;

        public static CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices self = new CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateMcpServerRequestGrayMcpServerConfigsBackendConfig extends TeaModel {
        @NameInMap("scene")
        public String scene;

        @NameInMap("services")
        public java.util.List<CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> services;

        public static CreateMcpServerRequestGrayMcpServerConfigsBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestGrayMcpServerConfigsBackendConfig self = new CreateMcpServerRequestGrayMcpServerConfigsBackendConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfig setServices(java.util.List<CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<CreateMcpServerRequestGrayMcpServerConfigsBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class CreateMcpServerRequestGrayMcpServerConfigs extends TeaModel {
        @NameInMap("backendConfig")
        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfig backendConfig;

        @NameInMap("match")
        public HttpRouteMatch match;

        @NameInMap("routeId")
        public String routeId;

        public static CreateMcpServerRequestGrayMcpServerConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestGrayMcpServerConfigs self = new CreateMcpServerRequestGrayMcpServerConfigs();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestGrayMcpServerConfigs setBackendConfig(CreateMcpServerRequestGrayMcpServerConfigsBackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }
        public CreateMcpServerRequestGrayMcpServerConfigsBackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        public CreateMcpServerRequestGrayMcpServerConfigs setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public CreateMcpServerRequestGrayMcpServerConfigs setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

    public static class CreateMcpServerRequestMcpServerConfig extends TeaModel {
        @NameInMap("mcpServerSpec")
        public String mcpServerSpec;

        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        public static CreateMcpServerRequestMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpServerRequestMcpServerConfig self = new CreateMcpServerRequestMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpServerRequestMcpServerConfig setMcpServerSpec(String mcpServerSpec) {
            this.mcpServerSpec = mcpServerSpec;
            return this;
        }
        public String getMcpServerSpec() {
            return this.mcpServerSpec;
        }

        public CreateMcpServerRequestMcpServerConfig setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

    }

}
