// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RdsTriggerConfig extends TeaModel {
    @NameInMap("concurrency")
    public Long concurrency;

    @NameInMap("eventFormat")
    public String eventFormat;

    @NameInMap("retry")
    public Long retry;

    @NameInMap("subscriptionObjects")
    public java.util.List<String> subscriptionObjects;

    public static RdsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        RdsTriggerConfig self = new RdsTriggerConfig();
        return TeaModel.build(map, self);
    }

    public RdsTriggerConfig setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public RdsTriggerConfig setEventFormat(String eventFormat) {
        this.eventFormat = eventFormat;
        return this;
    }
    public String getEventFormat() {
        return this.eventFormat;
    }

    public RdsTriggerConfig setRetry(Long retry) {
        this.retry = retry;
        return this;
    }
    public Long getRetry() {
        return this.retry;
    }

    public RdsTriggerConfig setSubscriptionObjects(java.util.List<String> subscriptionObjects) {
        this.subscriptionObjects = subscriptionObjects;
        return this;
    }
    public java.util.List<String> getSubscriptionObjects() {
        return this.subscriptionObjects;
    }

}
