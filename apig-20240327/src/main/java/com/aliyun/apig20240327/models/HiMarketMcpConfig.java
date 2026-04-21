// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketMcpConfig extends TeaModel {
    @NameInMap("mcpServerConfig")
    public HiMarketMcpConfigMcpServerConfig mcpServerConfig;

    @NameInMap("mcpServerName")
    public String mcpServerName;

    @NameInMap("meta")
    public HiMarketMcpConfigMeta meta;

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
        @NameInMap("domains")
        public java.util.List<HiMarketDomain> domains;

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
