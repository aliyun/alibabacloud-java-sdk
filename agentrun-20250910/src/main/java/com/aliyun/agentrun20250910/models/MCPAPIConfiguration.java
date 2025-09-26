// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPAPIConfiguration extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("exposedUriPath")
    public String exposedUriPath;

    @NameInMap("mcpStatisticsEnable")
    public Boolean mcpStatisticsEnable;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("toolId")
    public String toolId;

    public static MCPAPIConfiguration build(java.util.Map<String, ?> map) throws Exception {
        MCPAPIConfiguration self = new MCPAPIConfiguration();
        return TeaModel.build(map, self);
    }

    public MCPAPIConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MCPAPIConfiguration setExposedUriPath(String exposedUriPath) {
        this.exposedUriPath = exposedUriPath;
        return this;
    }
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    public MCPAPIConfiguration setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
        this.mcpStatisticsEnable = mcpStatisticsEnable;
        return this;
    }
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    public MCPAPIConfiguration setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public MCPAPIConfiguration setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

}
