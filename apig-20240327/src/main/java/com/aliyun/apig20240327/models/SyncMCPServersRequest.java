// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SyncMCPServersRequest extends TeaModel {
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtg***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("nacosMcpServers")
    public java.util.List<SyncMCPServersRequestNacosMcpServers> nacosMcpServers;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>src-d40mff6m1hkpt84vep60</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static SyncMCPServersRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMCPServersRequest self = new SyncMCPServersRequest();
        return TeaModel.build(map, self);
    }

    public SyncMCPServersRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public SyncMCPServersRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SyncMCPServersRequest setNacosMcpServers(java.util.List<SyncMCPServersRequestNacosMcpServers> nacosMcpServers) {
        this.nacosMcpServers = nacosMcpServers;
        return this;
    }
    public java.util.List<SyncMCPServersRequestNacosMcpServers> getNacosMcpServers() {
        return this.nacosMcpServers;
    }

    public SyncMCPServersRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SyncMCPServersRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public static class SyncMCPServersRequestNacosMcpServers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        /**
         * <strong>example:</strong>
         * <p>mse-24afmoioxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-d3s8qo6m1hknegofa3bg</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        @NameInMap("protocols")
        public java.util.List<String> protocols;

        public static SyncMCPServersRequestNacosMcpServers build(java.util.Map<String, ?> map) throws Exception {
            SyncMCPServersRequestNacosMcpServers self = new SyncMCPServersRequestNacosMcpServers();
            return TeaModel.build(map, self);
        }

        public SyncMCPServersRequestNacosMcpServers setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public SyncMCPServersRequestNacosMcpServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SyncMCPServersRequestNacosMcpServers setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public SyncMCPServersRequestNacosMcpServers setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public SyncMCPServersRequestNacosMcpServers setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

    }

}
