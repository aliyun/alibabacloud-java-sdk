// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpServersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMcpServersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
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
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-adfef2334fa</p>
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
         * <strong>example:</strong>
         * <p>mse-faefrefxz</p>
         */
        @NameInMap("importInstanceId")
        public String importInstanceId;

        @NameInMap("importMcpServerId")
        public String importMcpServerId;

        /**
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
        @NameInMap("assembledSources")
        public java.util.List<ListMcpServersResponseBodyDataItemsAssembledSources> assembledSources;

        @NameInMap("backend")
        public Backend backend;

        /**
         * <strong>example:</strong>
         * <p>ApiGatewayHttpToMCP</p>
         */
        @NameInMap("createFromType")
        public String createFromType;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        @NameInMap("description")
        public String description;

        @NameInMap("domainIds")
        public java.util.List<String> domainIds;

        @NameInMap("domainInfos")
        public java.util.List<HttpApiDomainInfo> domainInfos;

        /**
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <strong>example:</strong>
         * <p>gw-cpv54p5***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("match")
        public HttpRouteMatch match;

        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-feaff34va</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <strong>example:</strong>
         * <p>/mcp-servers/test-mcp</p>
         */
        @NameInMap("mcpServerPath")
        public String mcpServerPath;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("mcpStatisticsEnable")
        public Boolean mcpStatisticsEnable;

        @NameInMap("nacosMcpSyncInfo")
        public ListMcpServersResponseBodyDataItemsNacosMcpSyncInfo nacosMcpSyncInfo;

        /**
         * <strong>example:</strong>
         * <p>itemcenter-dev-cluster</p>
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
         * <strong>example:</strong>
         * <p>hr-d11cj86m1hkvop6mp42g</p>
         */
        @NameInMap("routeId")
        public String routeId;

        @NameInMap("type")
        public String type;

        public static ListMcpServersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyDataItems self = new ListMcpServersResponseBodyDataItems();
            return TeaModel.build(map, self);
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
        @NameInMap("items")
        public java.util.List<ListMcpServersResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
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
