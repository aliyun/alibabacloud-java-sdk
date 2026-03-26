// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class McpProxyConfiguration extends TeaModel {
    /**
     * <p>MCP 代理的钩子函数配置列表，每个钩子可以在请求处理的不同阶段执行自定义逻辑</p>
     */
    @NameInMap("hooks")
    public java.util.List<Hook> hooks;

    public static McpProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
        McpProxyConfiguration self = new McpProxyConfiguration();
        return TeaModel.build(map, self);
    }

    public McpProxyConfiguration setHooks(java.util.List<Hook> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<Hook> getHooks() {
        return this.hooks;
    }

}
