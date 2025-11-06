// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateMcpServerRequest extends TeaModel {
    @NameInMap("assembledSources")
    public java.util.List<UpdateMcpServerRequestAssembledSources> assembledSources;

    @NameInMap("backendConfig")
    public UpdateMcpServerRequestBackendConfig backendConfig;

    @NameInMap("createFromType")
    public String createFromType;

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

    public UpdateMcpServerRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
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
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

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
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
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
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

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

}
