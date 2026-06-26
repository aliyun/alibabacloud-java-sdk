// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CookieSessionAffinityConfig extends TeaModel {
    /**
     * <p>The default value is \<code>false\\</code>. When set to \<code>false\\</code>, a request with the same session ID can be sent after the session expires. The system treats this as a new session and attaches it to a new instance. When set to \<code>true\\</code>, the session ID cannot be reused after the session expires.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    /**
     * <p>The maximum number of sessions that a single instance can process at the same time. The value must be an integer from 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    /**
     * <p>The duration in seconds that a session can remain idle. If a user is inactive for this period, the session is considered idle. The maximum duration is limited by the session\&quot;s lifecycle. The value must be between 0 and 21,600.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The total lifecycle of a session in seconds, from creation to destruction. After this period, Function Compute automatically destroys the session and no longer guarantees affinity. The value must be an integer from 1 to 21,600.</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static CookieSessionAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        CookieSessionAffinityConfig self = new CookieSessionAffinityConfig();
        return TeaModel.build(map, self);
    }

    public CookieSessionAffinityConfig setDisableSessionIdReuse(Boolean disableSessionIdReuse) {
        this.disableSessionIdReuse = disableSessionIdReuse;
        return this;
    }
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
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
