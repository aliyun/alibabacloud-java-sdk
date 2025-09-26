// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPAPI extends TeaModel {
    @NameInMap("backendConfig")
    public MCPBackendConfig backendConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("exposedUriPath")
    public String exposedUriPath;

    @NameInMap("match")
    public MCPMatch match;

    @NameInMap("mcpStatisticsEnable")
    public Boolean mcpStatisticsEnable;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("toolId")
    public String toolId;

    @NameInMap("toolsConfig")
    public String toolsConfig;

    public static MCPAPI build(java.util.Map<String, ?> map) throws Exception {
        MCPAPI self = new MCPAPI();
        return TeaModel.build(map, self);
    }

    public MCPAPI setBackendConfig(MCPBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public MCPBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public MCPAPI setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MCPAPI setExposedUriPath(String exposedUriPath) {
        this.exposedUriPath = exposedUriPath;
        return this;
    }
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    public MCPAPI setMatch(MCPMatch match) {
        this.match = match;
        return this;
    }
    public MCPMatch getMatch() {
        return this.match;
    }

    public MCPAPI setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
        this.mcpStatisticsEnable = mcpStatisticsEnable;
        return this;
    }
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    public MCPAPI setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public MCPAPI setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public MCPAPI setToolsConfig(String toolsConfig) {
        this.toolsConfig = toolsConfig;
        return this;
    }
    public String getToolsConfig() {
        return this.toolsConfig;
    }

}
