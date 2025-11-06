// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMcpServerRequest extends TeaModel {
    @NameInMap("assembledSources")
    public java.util.List<CreateMcpServerRequestAssembledSources> assembledSources;

    @NameInMap("backendConfig")
    public CreateMcpServerRequestBackendConfig backendConfig;

    @NameInMap("createFromType")
    public String createFromType;

    /**
     * <strong>example:</strong>
     * <p>mcp tool fetch time</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <strong>example:</strong>
     * <p>/sse</p>
     */
    @NameInMap("exposedUriPath")
    public String exposedUriPath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qac0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("mcpStatisticsEnable")
    public Boolean mcpStatisticsEnable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fetch-time</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
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

    public CreateMcpServerRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
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
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-sdfa3qgavz</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

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
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>svc-crbgq0dlhtgr***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>2.1.6</p>
         */
        @NameInMap("version")
        public String version;

        /**
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
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

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

}
