// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class McpConfig extends TeaModel {
    /**
     * <p>工具的绑定配置，定义工具与 HTTP 路径和方法的映射关系</p>
     */
    @NameInMap("boundConfiguration")
    public BoundConfiguration boundConfiguration;

    /**
     * <p>MCP 代理的详细配置，包括钩子函数等，用于在 MCP 请求处理过程中执行自定义逻辑</p>
     */
    @NameInMap("mcpProxyConfiguration")
    public McpProxyConfiguration mcpProxyConfiguration;

    /**
     * <p>是否启用 MCP 代理功能，启用后可以通过代理配置对 MCP 请求进行拦截和处理</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("proxyEnabled")
    public Boolean proxyEnabled;

    /**
     * <p>会话亲和性策略，用于控制请求的路由方式。NONE：无亲和性，MCP_SSE：基于 SSE 的会话亲和性，MCP_STREAMABLE：基于流式 HTTP 的会话亲和性</p>
     * 
     * <strong>example:</strong>
     * <p>MCP_STREAMABLE</p>
     */
    @NameInMap("sessionAffinity")
    public String sessionAffinity;

    /**
     * <p>会话亲和性的详细配置信息，JSON 格式字符串，包含会话保持的具体参数</p>
     */
    @NameInMap("sessionAffinityConfig")
    public String sessionAffinityConfig;

    public static McpConfig build(java.util.Map<String, ?> map) throws Exception {
        McpConfig self = new McpConfig();
        return TeaModel.build(map, self);
    }

    public McpConfig setBoundConfiguration(BoundConfiguration boundConfiguration) {
        this.boundConfiguration = boundConfiguration;
        return this;
    }
    public BoundConfiguration getBoundConfiguration() {
        return this.boundConfiguration;
    }

    public McpConfig setMcpProxyConfiguration(McpProxyConfiguration mcpProxyConfiguration) {
        this.mcpProxyConfiguration = mcpProxyConfiguration;
        return this;
    }
    public McpProxyConfiguration getMcpProxyConfiguration() {
        return this.mcpProxyConfiguration;
    }

    public McpConfig setProxyEnabled(Boolean proxyEnabled) {
        this.proxyEnabled = proxyEnabled;
        return this;
    }
    public Boolean getProxyEnabled() {
        return this.proxyEnabled;
    }

    public McpConfig setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public McpConfig setSessionAffinityConfig(String sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
        return this;
    }
    public String getSessionAffinityConfig() {
        return this.sessionAffinityConfig;
    }

}
