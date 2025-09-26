// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MCPBackendConfig extends TeaModel {
    @NameInMap("scene")
    public String scene;

    @NameInMap("services")
    public java.util.List<MCPServiceConfig> services;

    public static MCPBackendConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPBackendConfig self = new MCPBackendConfig();
        return TeaModel.build(map, self);
    }

    public MCPBackendConfig setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public MCPBackendConfig setServices(java.util.List<MCPServiceConfig> services) {
        this.services = services;
        return this;
    }
    public java.util.List<MCPServiceConfig> getServices() {
        return this.services;
    }

}
