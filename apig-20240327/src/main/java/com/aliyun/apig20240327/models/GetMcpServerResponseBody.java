// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMcpServerResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public GetMcpServerResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A6E90D5-A711-54F4-A489-E33C2021EDDF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpServerResponseBody self = new GetMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpServerResponseBody setData(GetMcpServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpServerResponseBodyData getData() {
        return this.data;
    }

    public GetMcpServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMcpServerResponseBodyDataAssembledSources extends TeaModel {
        /**
         * <p>The ID of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-xdafeafzz</p>
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

        public static GetMcpServerResponseBodyDataAssembledSources build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataAssembledSources self = new GetMcpServerResponseBodyDataAssembledSources();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataAssembledSources setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public GetMcpServerResponseBodyDataAssembledSources setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public GetMcpServerResponseBodyDataAssembledSources setTools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<String> getTools() {
            return this.tools;
        }

    }

    public static class GetMcpServerResponseBodyDataDomainInfos extends TeaModel {
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.abc.com">www.abc.com</a></p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>verifyicket</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The protocol. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static GetMcpServerResponseBodyDataDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataDomainInfos self = new GetMcpServerResponseBodyDataDomainInfos();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataDomainInfos setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public GetMcpServerResponseBodyDataDomainInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpServerResponseBodyDataDomainInfos setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices extends TeaModel {
        /**
         * <p>The service port</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The gray service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service version</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The service weight</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices self = new GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig extends TeaModel {
        /**
         * <p>The backend scene type</p>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>List of backend services</p>
         */
        @NameInMap("services")
        public java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices> services;

        public static GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig self = new GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig setServices(java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class GetMcpServerResponseBodyDataGrayMcpServerConfigs extends TeaModel {
        /**
         * <p>The gray route backend configuration</p>
         */
        @NameInMap("backendConfig")
        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig backendConfig;

        /**
         * <p>The gray route matching rules</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>The gray route ID</p>
         * 
         * <strong>example:</strong>
         * <p>gray-route-xxx</p>
         */
        @NameInMap("routeId")
        public String routeId;

        public static GetMcpServerResponseBodyDataGrayMcpServerConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataGrayMcpServerConfigs self = new GetMcpServerResponseBodyDataGrayMcpServerConfigs();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigs setBackendConfig(GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }
        public GetMcpServerResponseBodyDataGrayMcpServerConfigsBackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigs setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public GetMcpServerResponseBodyDataGrayMcpServerConfigs setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

    public static class GetMcpServerResponseBodyDataNacosMcpSyncInfo extends TeaModel {
        /**
         * <p>The Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-xxxxx</p>
         */
        @NameInMap("importInstanceId")
        public String importInstanceId;

        /**
         * <p>The synchronized MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("importMcpServerId")
        public String importMcpServerId;

        /**
         * <p>The Nacos namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        @NameInMap("importNamespace")
        public String importNamespace;

        public static GetMcpServerResponseBodyDataNacosMcpSyncInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyDataNacosMcpSyncInfo self = new GetMcpServerResponseBodyDataNacosMcpSyncInfo();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyDataNacosMcpSyncInfo setImportInstanceId(String importInstanceId) {
            this.importInstanceId = importInstanceId;
            return this;
        }
        public String getImportInstanceId() {
            return this.importInstanceId;
        }

        public GetMcpServerResponseBodyDataNacosMcpSyncInfo setImportMcpServerId(String importMcpServerId) {
            this.importMcpServerId = importMcpServerId;
            return this;
        }
        public String getImportMcpServerId() {
            return this.importMcpServerId;
        }

        public GetMcpServerResponseBodyDataNacosMcpSyncInfo setImportNamespace(String importNamespace) {
            this.importNamespace = importNamespace;
            return this;
        }
        public String getImportNamespace() {
            return this.importNamespace;
        }

    }

    public static class GetMcpServerResponseBodyData extends TeaModel {
        /**
         * <p>The list of assembly sources. This parameter is required when the type parameter is set to AssemblyMCP.</p>
         */
        @NameInMap("assembledSources")
        public java.util.List<GetMcpServerResponseBodyDataAssembledSources> assembledSources;

        /**
         * <p>The backend service of the route.</p>
         */
        @NameInMap("backend")
        public Backend backend;

        /**
         * <p>Indicates the type of source for MCP server creation. Valid values: </p>
         * <p>ApiGatewayHttpToMCP 
         * ApiGatewayMcpHosting 
         * ApiGatewayAssembly 
         * NacosHttpToMCP 
         * NacosMcpHosting</p>
         * 
         * <strong>example:</strong>
         * <p>ApiGatewayHttpToMCP</p>
         */
        @NameInMap("createFromType")
        public String createFromType;

        /**
         * <p>The publishing status of the API in the current environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample MCP server</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The domain name IDs.</p>
         */
        @NameInMap("domainIds")
        public java.util.List<String> domainIds;

        /**
         * <p>The list of domain information.</p>
         */
        @NameInMap("domainInfos")
        public java.util.List<GetMcpServerResponseBodyDataDomainInfos> domainInfos;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The exposed URI path. This parameter is required when the protocol parameter is set to SSE or StreamableHTTP, and the type parameter is set to RealMCP.</p>
         * 
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2vundlhtg***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>List of gray MCP server configurations</p>
         */
        @NameInMap("grayMcpServerConfigs")
        public java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigs> grayMcpServerConfigs;

        /**
         * <p>The route match rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;product_code\&quot;:\&quot;apigw\&quot;}</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>The HTTP-to-MCP configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>config-yaml-content</p>
         */
        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>The attachment ID for the MCP server plug-in configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-adfaefwaef</p>
         */
        @NameInMap("mcpServerConfigPluginAttachmentId")
        public String mcpServerConfigPluginAttachmentId;

        /**
         * <p>The ID of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-adfefz24afg</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The MCP server access path provided by the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp-servers/test-mcp</p>
         */
        @NameInMap("mcpServerPath")
        public String mcpServerPath;

        /**
         * <p>Indicates whether MCP observability is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("mcpStatisticsEnable")
        public Boolean mcpStatisticsEnable;

        /**
         * <p>The MCP information managed and synchronized by Nacos.</p>
         */
        @NameInMap("nacosMcpSyncInfo")
        public GetMcpServerResponseBodyDataNacosMcpSyncInfo nacosMcpSyncInfo;

        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrlej***</p>
         */
        @NameInMap("routeId")
        public String routeId;

        /**
         * <p>The type of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>RealMCP</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMcpServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpServerResponseBodyData self = new GetMcpServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpServerResponseBodyData setAssembledSources(java.util.List<GetMcpServerResponseBodyDataAssembledSources> assembledSources) {
            this.assembledSources = assembledSources;
            return this;
        }
        public java.util.List<GetMcpServerResponseBodyDataAssembledSources> getAssembledSources() {
            return this.assembledSources;
        }

        public GetMcpServerResponseBodyData setBackend(Backend backend) {
            this.backend = backend;
            return this;
        }
        public Backend getBackend() {
            return this.backend;
        }

        public GetMcpServerResponseBodyData setCreateFromType(String createFromType) {
            this.createFromType = createFromType;
            return this;
        }
        public String getCreateFromType() {
            return this.createFromType;
        }

        public GetMcpServerResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetMcpServerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpServerResponseBodyData setDomainIds(java.util.List<String> domainIds) {
            this.domainIds = domainIds;
            return this;
        }
        public java.util.List<String> getDomainIds() {
            return this.domainIds;
        }

        public GetMcpServerResponseBodyData setDomainInfos(java.util.List<GetMcpServerResponseBodyDataDomainInfos> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }
        public java.util.List<GetMcpServerResponseBodyDataDomainInfos> getDomainInfos() {
            return this.domainInfos;
        }

        public GetMcpServerResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetMcpServerResponseBodyData setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public GetMcpServerResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetMcpServerResponseBodyData setGrayMcpServerConfigs(java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigs> grayMcpServerConfigs) {
            this.grayMcpServerConfigs = grayMcpServerConfigs;
            return this;
        }
        public java.util.List<GetMcpServerResponseBodyDataGrayMcpServerConfigs> getGrayMcpServerConfigs() {
            return this.grayMcpServerConfigs;
        }

        public GetMcpServerResponseBodyData setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public GetMcpServerResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public GetMcpServerResponseBodyData setMcpServerConfigPluginAttachmentId(String mcpServerConfigPluginAttachmentId) {
            this.mcpServerConfigPluginAttachmentId = mcpServerConfigPluginAttachmentId;
            return this;
        }
        public String getMcpServerConfigPluginAttachmentId() {
            return this.mcpServerConfigPluginAttachmentId;
        }

        public GetMcpServerResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public GetMcpServerResponseBodyData setMcpServerPath(String mcpServerPath) {
            this.mcpServerPath = mcpServerPath;
            return this;
        }
        public String getMcpServerPath() {
            return this.mcpServerPath;
        }

        public GetMcpServerResponseBodyData setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        public GetMcpServerResponseBodyData setNacosMcpSyncInfo(GetMcpServerResponseBodyDataNacosMcpSyncInfo nacosMcpSyncInfo) {
            this.nacosMcpSyncInfo = nacosMcpSyncInfo;
            return this;
        }
        public GetMcpServerResponseBodyDataNacosMcpSyncInfo getNacosMcpSyncInfo() {
            return this.nacosMcpSyncInfo;
        }

        public GetMcpServerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpServerResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpServerResponseBodyData setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

        public GetMcpServerResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
