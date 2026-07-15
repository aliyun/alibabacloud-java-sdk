// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketMcpConfig extends TeaModel {
    /**
     * <p>The MCP Server configuration.</p>
     */
    @NameInMap("mcpServerConfig")
    public HiMarketMcpConfigMcpServerConfig mcpServerConfig;

    /**
     * <p>The MCP Server name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-server</p>
     */
    @NameInMap("mcpServerName")
    public String mcpServerName;

    /**
     * <p>The metadata.</p>
     */
    @NameInMap("meta")
    public HiMarketMcpConfigMeta meta;

    /**
     * <p>The MCP tool definitions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;search\&quot;,\&quot;description\&quot;:\&quot;搜索工具\&quot;}]</p>
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
         * <p>The list of associated domain names.</p>
         */
        @NameInMap("domains")
        public java.util.List<HiMarketDomain> domains;

        /**
         * <p>The path exposed by the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
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
         * <p>The MCP protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
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
