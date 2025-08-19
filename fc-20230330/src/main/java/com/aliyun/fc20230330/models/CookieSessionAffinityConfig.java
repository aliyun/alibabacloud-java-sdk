// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CookieSessionAffinityConfig extends TeaModel {
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static CookieSessionAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        CookieSessionAffinityConfig self = new CookieSessionAffinityConfig();
        return TeaModel.build(map, self);
    }

    public CookieSessionAffinityConfig setSessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
        this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
        return this;
    }
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
    }

    public CookieSessionAffinityConfig setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public CookieSessionAffinityConfig setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
