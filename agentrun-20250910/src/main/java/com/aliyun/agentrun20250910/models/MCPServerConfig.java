// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPServerConfig extends TeaModel {
    @NameInMap("serverUrl")
    public String serverUrl;

    @NameInMap("ssePath")
    public String ssePath;

    @NameInMap("transportType")
    public String transportType;

    public static MCPServerConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPServerConfig self = new MCPServerConfig();
        return TeaModel.build(map, self);
    }

    public MCPServerConfig setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public MCPServerConfig setSsePath(String ssePath) {
        this.ssePath = ssePath;
        return this;
    }
    public String getSsePath() {
        return this.ssePath;
    }

    public MCPServerConfig setTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    public String getTransportType() {
        return this.transportType;
    }

}
