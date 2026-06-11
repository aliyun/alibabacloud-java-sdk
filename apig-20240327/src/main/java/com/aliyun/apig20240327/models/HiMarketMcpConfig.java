// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketMcpConfig extends TeaModel {
    /**
     * <p>Configuration for the MCP server.</p>
     */
    @NameInMap("mcpServerConfig")
    public HiMarketMcpConfigMcpServerConfig mcpServerConfig;

    /**
     * <p>A unique name for the MCP server.</p>
     */
    @NameInMap("mcpServerName")
    public String mcpServerName;

    /**
     * <p>Metadata for the configuration.</p>
     */
    @NameInMap("meta")
    public HiMarketMcpConfigMeta meta;

    /**
     * <p>The tools associated with this configuration, typically provided as a JSON-formatted string.</p>
     */
    @NameInMap("tools")
    public String tools;

    public static HiMarketMcpConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketMcpConfig self = new HiMarketMcpConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketMcpConfig setMcpServerConfig(HiMarketMcpConfigMcpServerConfig mcpServerConfig) {
        this.mcpServerConfig = mcpServerConfig;
        return this;
    }
    public HiMarketMcpConfigMcpServerConfig getMcpServerConfig() {
        return this.mcpServerConfig;
    }

    public HiMarketMcpConfig setMcpServerName(String mcpServerName) {
        this.mcpServerName = mcpServerName;
        return this;
    }
    public String getMcpServerName() {
        return this.mcpServerName;
    }

    public HiMarketMcpConfig setMeta(HiMarketMcpConfigMeta meta) {
        this.meta = meta;
        return this;
    }
    public HiMarketMcpConfigMeta getMeta() {
        return this.meta;
    }

    public HiMarketMcpConfig setTools(String tools) {
        this.tools = tools;
        return this;
    }
    public String getTools() {
        return this.tools;
    }

    public static class HiMarketMcpConfigMcpServerConfig extends TeaModel {
        /**
         * <p>The domains managed by the server.</p>
         */
        @NameInMap("domains")
        public java.util.List<HiMarketDomain> domains;

        /**
         * <p>The base path for the service endpoint.</p>
         */
        @NameInMap("path")
        public String path;

        public static HiMarketMcpConfigMcpServerConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketMcpConfigMcpServerConfig self = new HiMarketMcpConfigMcpServerConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketMcpConfigMcpServerConfig setDomains(java.util.List<HiMarketDomain> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<HiMarketDomain> getDomains() {
            return this.domains;
        }

        public HiMarketMcpConfigMcpServerConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class HiMarketMcpConfigMeta extends TeaModel {
        /**
         * <p>The communication protocol. Can be <code>http</code> or <code>https</code>.</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HiMarketMcpConfigMeta build(java.util.Map<String, ?> map) throws Exception {
            HiMarketMcpConfigMeta self = new HiMarketMcpConfigMeta();
            return TeaModel.build(map, self);
        }

        public HiMarketMcpConfigMeta setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
