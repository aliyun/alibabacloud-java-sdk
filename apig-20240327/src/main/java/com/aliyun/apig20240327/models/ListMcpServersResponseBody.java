// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpServersResponseBody extends TeaModel {
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
    public ListMcpServersResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMcpServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServersResponseBody self = new ListMcpServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpServersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpServersResponseBody setData(ListMcpServersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMcpServersResponseBodyData getData() {
        return this.data;
    }

    public ListMcpServersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMcpServersResponseBodyDataItemsAssembledSources extends TeaModel {
        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-adfef2334fa</p>
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
         * <p>The list of MCP tools.</p>
         */
        @NameInMap("tools")
        public java.util.List<String> tools;

        public static ListMcpServersResponseBodyDataItemsAssembledSources build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyDataItemsAssembledSources self = new ListMcpServersResponseBodyDataItemsAssembledSources();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyDataItemsAssembledSources setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public ListMcpServersResponseBodyDataItemsAssembledSources setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public ListMcpServersResponseBodyDataItemsAssembledSources setTools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<String> getTools() {
            return this.tools;
        }

    }

    public static class ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo extends TeaModel {
        /**
         * <p>The Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-faefrefxz</p>
         */
        @NameInMap("importInstanceId")
        public String importInstanceId;

        /**
         * <p>The synchronized MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nacos-mcp-001</p>
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

        public static ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo self = new ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo setImportInstanceId(String importInstanceId) {
            this.importInstanceId = importInstanceId;
            return this;
        }
        public String getImportInstanceId() {
            return this.importInstanceId;
        }

        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo setImportMcpServerId(String importMcpServerId) {
            this.importMcpServerId = importMcpServerId;
            return this;
        }
        public String getImportMcpServerId() {
            return this.importMcpServerId;
        }

        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo setImportNamespace(String importNamespace) {
            this.importNamespace = importNamespace;
            return this;
        }
        public String getImportNamespace() {
            return this.importNamespace;
        }

    }

    public static class ListMcpServersResponseBodyDataItems extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <p>The list of assembly sources. This parameter is required when the type parameter is set to AssemblyMCP.</p>
         */
        @NameInMap("assembledSources")
        public java.util.List<ListMcpServersResponseBodyDataItemsAssembledSources> assembledSources;

        /**
         * <p>The backend service of the route.</p>
         */
        @NameInMap("backend")
        public Backend backend;

        /**
         * <p>The type of source for MCP server creation. Valid values: </p>
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
         * <p>My MCP Server</p>
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
        public java.util.List<HttpApiDomainInfo> domainInfos;

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
         * <p>gw-cpv54p5***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The route match rule.</p>
         */
        @NameInMap("match")
        public HttpRouteMatch match;

        /**
         * <p>The HTTP-to-MCP configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp spec content</p>
         */
        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-feaff34va</p>
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
         * <p>The MCP information synchronized and managed by Nacos.</p>
         */
        @NameInMap("nacosMcpSyncInfo")
        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo nacosMcpSyncInfo;

        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-dev-cluster</p>
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
         * <p>The ID of the MCP server associated route.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-d11cj86m1hkvop6mp42g</p>
         */
        @NameInMap("routeId")
        public String routeId;

        /**
         * <p>The type of the MCP server. Valid values: RealMCP and AssemblyMCP.</p>
         * 
         * <strong>example:</strong>
         * <p>RealMCP</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMcpServersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyDataItems self = new ListMcpServersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyDataItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListMcpServersResponseBodyDataItems setAssembledSources(java.util.List<ListMcpServersResponseBodyDataItemsAssembledSources> assembledSources) {
            this.assembledSources = assembledSources;
            return this;
        }
        public java.util.List<ListMcpServersResponseBodyDataItemsAssembledSources> getAssembledSources() {
            return this.assembledSources;
        }

        public ListMcpServersResponseBodyDataItems setBackend(Backend backend) {
            this.backend = backend;
            return this;
        }
        public Backend getBackend() {
            return this.backend;
        }

        public ListMcpServersResponseBodyDataItems setCreateFromType(String createFromType) {
            this.createFromType = createFromType;
            return this;
        }
        public String getCreateFromType() {
            return this.createFromType;
        }

        public ListMcpServersResponseBodyDataItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListMcpServersResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpServersResponseBodyDataItems setDomainIds(java.util.List<String> domainIds) {
            this.domainIds = domainIds;
            return this;
        }
        public java.util.List<String> getDomainIds() {
            return this.domainIds;
        }

        public ListMcpServersResponseBodyDataItems setDomainInfos(java.util.List<HttpApiDomainInfo> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }
        public java.util.List<HttpApiDomainInfo> getDomainInfos() {
            return this.domainInfos;
        }

        public ListMcpServersResponseBodyDataItems setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListMcpServersResponseBodyDataItems setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public ListMcpServersResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListMcpServersResponseBodyDataItems setMatch(HttpRouteMatch match) {
            this.match = match;
            return this;
        }
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        public ListMcpServersResponseBodyDataItems setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public ListMcpServersResponseBodyDataItems setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public ListMcpServersResponseBodyDataItems setMcpServerPath(String mcpServerPath) {
            this.mcpServerPath = mcpServerPath;
            return this;
        }
        public String getMcpServerPath() {
            return this.mcpServerPath;
        }

        public ListMcpServersResponseBodyDataItems setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        public ListMcpServersResponseBodyDataItems setNacosMcpSyncInfo(ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo nacosMcpSyncInfo) {
            this.nacosMcpSyncInfo = nacosMcpSyncInfo;
            return this;
        }
        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo getNacosMcpSyncInfo() {
            return this.nacosMcpSyncInfo;
        }

        public ListMcpServersResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpServersResponseBodyDataItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMcpServersResponseBodyDataItems setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

        public ListMcpServersResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMcpServersResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP servers.</p>
         */
        @NameInMap("items")
        public java.util.List<ListMcpServersResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListMcpServersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyData self = new ListMcpServersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyData setItems(java.util.List<ListMcpServersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListMcpServersResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListMcpServersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMcpServersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcpServersResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
