// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MCPSSESessionAffinityConfig extends TeaModel {
    /**
     * <p>The maximum number of sessions that a single instance can handle through simultaneous processing. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    /**
     * <p>The SSE path.</p>
     * 
     * <strong>example:</strong>
     * <p>/sse</p>
     */
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
