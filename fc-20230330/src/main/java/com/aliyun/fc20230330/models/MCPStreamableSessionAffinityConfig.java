// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MCPStreamableSessionAffinityConfig extends TeaModel {
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

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
