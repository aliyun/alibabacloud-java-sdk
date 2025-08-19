// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MCPSSESessionAffinityConfig extends TeaModel {
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    @NameInMap("sseEndpointPath")
    public String sseEndpointPath;

    public static MCPSSESessionAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPSSESessionAffinityConfig self = new MCPSSESessionAffinityConfig();
        return TeaModel.build(map, self);
    }

    public MCPSSESessionAffinityConfig setSessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
        this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
        return this;
    }
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
    }

    public MCPSSESessionAffinityConfig setSseEndpointPath(String sseEndpointPath) {
        this.sseEndpointPath = sseEndpointPath;
        return this;
    }
    public String getSseEndpointPath() {
        return this.sseEndpointPath;
    }

}
