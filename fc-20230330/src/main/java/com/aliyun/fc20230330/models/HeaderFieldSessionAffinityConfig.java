// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HeaderFieldSessionAffinityConfig extends TeaModel {
    @NameInMap("affinityHeaderFieldName")
    public String affinityHeaderFieldName;

    @NameInMap("sessionConcurrencyPerInstance")
    public Long sessionConcurrencyPerInstance;

    @NameInMap("sessionIdleTimeoutInSeconds")
    public Long sessionIdleTimeoutInSeconds;

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
