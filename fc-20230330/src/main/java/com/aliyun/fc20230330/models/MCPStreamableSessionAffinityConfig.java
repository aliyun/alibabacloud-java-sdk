// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MCPStreamableSessionAffinityConfig extends TeaModel {
    /**
     * <p>The maximum number of sessions for simultaneous processing by a single instance. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    /**
     * <p>The maximum idle time in seconds before a session enters an idle state due to user inactivity. The maximum duration is the upper limit of a single session lifecycle. Valid values: 0 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The time-to-live of a session in seconds, covering the entire process from creation and usage to final destruction. If the time-to-live is exceeded, Function Compute automatically destroys the session and no longer guarantees affinity. Valid values: 1 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static MCPStreamableSessionAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPStreamableSessionAffinityConfig self = new MCPStreamableSessionAffinityConfig();
        return TeaModel.build(map, self);
    }

    public MCPStreamableSessionAffinityConfig setSessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
        this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
        return this;
    }
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
    }

    public MCPStreamableSessionAffinityConfig setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public MCPStreamableSessionAffinityConfig setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
