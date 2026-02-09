// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpRoute extends TeaModel {
    /**
     * <p>The backend configuration</p>
     */
    @NameInMap("backend")
    public Backend backend;

    /**
     * <p>builtin</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("builtin")
    public String builtin;

    /**
     * <p>The creation timestamp in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>1726649310593</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The deployment status</p>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("deployStatus")
    public String deployStatus;

    /**
     * <p>The description of the route</p>
     * 
     * <strong>example:</strong>
     * <p>Route for user management API</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>List of domain information</p>
     */
    @NameInMap("domainInfos")
    public java.util.List<HttpRouteDomainInfos> domainInfos;

    /**
     * <p>The environment information</p>
     */
    @NameInMap("environmentInfo")
    public HttpRouteEnvironmentInfo environmentInfo;

    /**
     * <p>gatewayStatus</p>
     */
    @NameInMap("gatewayStatus")
    public java.util.Map<String, String> gatewayStatus;

    /**
     * <p>The route matching rules</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <p>The MCP server information</p>
     */
    @NameInMap("mcpServerInfo")
    public HttpRouteMcpServerInfo mcpServerInfo;

    /**
     * <p>The name of the route</p>
     * 
     * <strong>example:</strong>
     * <p>itemcenter-pre-route</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The unique identifier of the route</p>
     * 
     * <strong>example:</strong>
     * <p>hr-crf5l7tlhtgp91t***</p>
     */
    @NameInMap("routeId")
    public String routeId;

    /**
     * <p>The last update timestamp in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>1726819895636</p>
     */
    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static HttpRoute build(java.util.Map<String, ?> map) throws Exception {
        HttpRoute self = new HttpRoute();
        return TeaModel.build(map, self);
    }

    public HttpRoute setBackend(Backend backend) {
        this.backend = backend;
        return this;
    }
    public Backend getBackend() {
        return this.backend;
    }

    public HttpRoute setBuiltin(String builtin) {
        this.builtin = builtin;
        return this;
    }
    public String getBuiltin() {
        return this.builtin;
    }

    public HttpRoute setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public HttpRoute setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public HttpRoute setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpRoute setDomainInfos(java.util.List<HttpRouteDomainInfos> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public java.util.List<HttpRouteDomainInfos> getDomainInfos() {
        return this.domainInfos;
    }

    public HttpRoute setEnvironmentInfo(HttpRouteEnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
        return this;
    }
    public HttpRouteEnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    public HttpRoute setGatewayStatus(java.util.Map<String, String> gatewayStatus) {
        this.gatewayStatus = gatewayStatus;
        return this;
    }
    public java.util.Map<String, String> getGatewayStatus() {
        return this.gatewayStatus;
    }

    public HttpRoute setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public HttpRoute setMcpServerInfo(HttpRouteMcpServerInfo mcpServerInfo) {
        this.mcpServerInfo = mcpServerInfo;
        return this;
    }
    public HttpRouteMcpServerInfo getMcpServerInfo() {
        return this.mcpServerInfo;
    }

    public HttpRoute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpRoute setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public HttpRoute setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class HttpRouteDomainInfos extends TeaModel {
        /**
         * <p>The domain ID</p>
         * 
         * <strong>example:</strong>
         * <p>d-cr3v7dllhtgi9s***</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter.dev</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The domain protocol</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpRouteDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteDomainInfos self = new HttpRouteDomainInfos();
            return TeaModel.build(map, self);
        }

        public HttpRouteDomainInfos setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpRouteDomainInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteDomainInfos setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpRouteEnvironmentInfoGatewayInfo extends TeaModel {
        /**
         * <p>The gateway ID</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cqoohqtlh***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The gateway name</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-gateway</p>
         */
        @NameInMap("name")
        public String name;

        public static HttpRouteEnvironmentInfoGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfoGatewayInfo self = new HttpRouteEnvironmentInfoGatewayInfo();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfoGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public HttpRouteEnvironmentInfoGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HttpRouteEnvironmentInfoSubDomains extends TeaModel {
        /**
         * <p>The subdomain ID</p>
         * 
         * <strong>example:</strong>
         * <p>d-cqu19hdlhtgjuv4***</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The subdomain name</p>
         * 
         * <strong>example:</strong>
         * <p>env-crmic3llht***-cn-hangzhou-vpc.alicloudapi.com</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>networkType</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The subdomain protocol</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpRouteEnvironmentInfoSubDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfoSubDomains self = new HttpRouteEnvironmentInfoSubDomains();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfoSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpRouteEnvironmentInfoSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteEnvironmentInfoSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public HttpRouteEnvironmentInfoSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpRouteEnvironmentInfo extends TeaModel {
        /**
         * <p>The environment alias</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The environment ID</p>
         * 
         * <strong>example:</strong>
         * <p>env-crhq1u5lhtgju***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>The gateway information</p>
         */
        @NameInMap("gatewayInfo")
        public HttpRouteEnvironmentInfoGatewayInfo gatewayInfo;

        /**
         * <p>The environment name</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-pre</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>List of subdomain information</p>
         */
        @NameInMap("subDomains")
        public java.util.List<HttpRouteEnvironmentInfoSubDomains> subDomains;

        public static HttpRouteEnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteEnvironmentInfo self = new HttpRouteEnvironmentInfo();
            return TeaModel.build(map, self);
        }

        public HttpRouteEnvironmentInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public HttpRouteEnvironmentInfo setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public HttpRouteEnvironmentInfo setGatewayInfo(HttpRouteEnvironmentInfoGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public HttpRouteEnvironmentInfoGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public HttpRouteEnvironmentInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteEnvironmentInfo setSubDomains(java.util.List<HttpRouteEnvironmentInfoSubDomains> subDomains) {
            this.subDomains = subDomains;
            return this;
        }
        public java.util.List<HttpRouteEnvironmentInfoSubDomains> getSubDomains() {
            return this.subDomains;
        }

    }

    public static class HttpRouteMcpServerInfoMcpRouteConfig extends TeaModel {
        /**
         * <p>mcp route path</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <p>The MCP protocol</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpRouteMcpServerInfoMcpRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteMcpServerInfoMcpRouteConfig self = new HttpRouteMcpServerInfoMcpRouteConfig();
            return TeaModel.build(map, self);
        }

        public HttpRouteMcpServerInfoMcpRouteConfig setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public HttpRouteMcpServerInfoMcpRouteConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpRouteMcpServerInfo extends TeaModel {
        /**
         * <p>The creation type</p>
         * 
         * <strong>example:</strong>
         * <p>Nacos</p>
         */
        @NameInMap("createFromType")
        public String createFromType;

        /**
         * <p>The imported instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>import-001</p>
         */
        @NameInMap("importInstanceId")
        public String importInstanceId;

        /**
         * <p>The imported Nacos MCP server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-002</p>
         */
        @NameInMap("importMcpServerId")
        public String importMcpServerId;

        /**
         * <p>The imported namespace</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("importNamespace")
        public String importNamespace;

        /**
         * <p>The MCP route configuration</p>
         */
        @NameInMap("mcpRouteConfig")
        public HttpRouteMcpServerInfoMcpRouteConfig mcpRouteConfig;

        /**
         * <p>The MCP server configuration content</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;config\&quot;:{}}</p>
         */
        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        public static HttpRouteMcpServerInfo build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteMcpServerInfo self = new HttpRouteMcpServerInfo();
            return TeaModel.build(map, self);
        }

        public HttpRouteMcpServerInfo setCreateFromType(String createFromType) {
            this.createFromType = createFromType;
            return this;
        }
        public String getCreateFromType() {
            return this.createFromType;
        }

        public HttpRouteMcpServerInfo setImportInstanceId(String importInstanceId) {
            this.importInstanceId = importInstanceId;
            return this;
        }
        public String getImportInstanceId() {
            return this.importInstanceId;
        }

        public HttpRouteMcpServerInfo setImportMcpServerId(String importMcpServerId) {
            this.importMcpServerId = importMcpServerId;
            return this;
        }
        public String getImportMcpServerId() {
            return this.importMcpServerId;
        }

        public HttpRouteMcpServerInfo setImportNamespace(String importNamespace) {
            this.importNamespace = importNamespace;
            return this;
        }
        public String getImportNamespace() {
            return this.importNamespace;
        }

        public HttpRouteMcpServerInfo setMcpRouteConfig(HttpRouteMcpServerInfoMcpRouteConfig mcpRouteConfig) {
            this.mcpRouteConfig = mcpRouteConfig;
            return this;
        }
        public HttpRouteMcpServerInfoMcpRouteConfig getMcpRouteConfig() {
            return this.mcpRouteConfig;
        }

        public HttpRouteMcpServerInfo setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

    }

}
