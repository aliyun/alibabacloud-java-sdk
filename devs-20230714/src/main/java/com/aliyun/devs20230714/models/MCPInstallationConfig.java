// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class MCPInstallationConfig extends TeaModel {
    @NameInMap("mcpServers")
    public MCPServerInstallationConfig mcpServers;

    public static MCPInstallationConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPInstallationConfig self = new MCPInstallationConfig();
        return TeaModel.build(map, self);
    }

    public MCPInstallationConfig setMcpServers(MCPServerInstallationConfig mcpServers) {
        this.mcpServers = mcpServers;
        return this;
    }
    public MCPServerInstallationConfig getMcpServers() {
        return this.mcpServers;
    }

}
