// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HeaderFieldSessionAffinityConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-session-header1</p>
     */
    @NameInMap("affinityHeaderFieldName")
    public String affinityHeaderFieldName;

    @NameInMap("disableSessionIdReuse")
    public Boolean disableSessionIdReuse;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    /**
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

    /**
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
