// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HeaderFieldSessionAffinityConfig extends TeaModel {
    /**
     * <p>The name of the HTTP request header that passes the client session identity. The name must be 5 to 40 characters long, start with a letter, and contain only letters, numbers, hyphens (-), and underscores (_). The name cannot start with the x-fc- prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session-header1</p>
     */
    @NameInMap("affinityHeaderFieldName")
    public String affinityHeaderFieldName;

    /**
     * <p>The default value is False. If set to False, a session ID can be reused in a new request after the original session expires. The system treats this as a new session and attaches it to a new instance. If set to True, an expired session ID cannot be reused.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    /**
     * <p>The maximum number of sessions that a single instance can process simultaneously. The value must be an integer from 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    /**
     * <p>The idle timeout period for a session in seconds. A session becomes idle if no operations are performed within this period. The maximum value cannot exceed the session\&quot;s TTL. The value must be an integer from 0 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
     * <p>The session\&quot;s Time to Live (TTL) in seconds. This defines the entire lifecycle of a session, from creation to destruction. After this period expires, Function Compute automatically destroys the session and no longer guarantees affinity. The value must be an integer from 1 to 21600.</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sessionTTLInSeconds")
    public Long sessionTTLInSeconds;

    public static HeaderFieldSessionAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        HeaderFieldSessionAffinityConfig self = new HeaderFieldSessionAffinityConfig();
        return TeaModel.build(map, self);
    }

    public HeaderFieldSessionAffinityConfig setAffinityHeaderFieldName(String affinityHeaderFieldName) {
        this.affinityHeaderFieldName = affinityHeaderFieldName;
        return this;
    }
    public String getAffinityHeaderFieldName() {
        return this.affinityHeaderFieldName;
    }

    public HeaderFieldSessionAffinityConfig setDisableSessionIdReuse(Boolean disableSessionIdReuse) {
        this.disableSessionIdReuse = disableSessionIdReuse;
        return this;
    }
    public Boolean getDisableSessionIdReuse() {
        return this.disableSessionIdReuse;
    }

    public HeaderFieldSessionAffinityConfig setSessionConcurrencyPerInstance(Long sessionConcurrencyPerInstance) {
        this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
        return this;
    }
    public Long getSessionConcurrencyPerInstance() {
        return this.sessionConcurrencyPerInstance;
    }

    public HeaderFieldSessionAffinityConfig setSessionIdleTimeoutInSeconds(Long sessionIdleTimeoutInSeconds) {
        this.sessionIdleTimeoutInSeconds = sessionIdleTimeoutInSeconds;
        return this;
    }
    public Long getSessionIdleTimeoutInSeconds() {
        return this.sessionIdleTimeoutInSeconds;
    }

    public HeaderFieldSessionAffinityConfig setSessionTTLInSeconds(Long sessionTTLInSeconds) {
        this.sessionTTLInSeconds = sessionTTLInSeconds;
        return this;
    }
    public Long getSessionTTLInSeconds() {
        return this.sessionTTLInSeconds;
    }

}
