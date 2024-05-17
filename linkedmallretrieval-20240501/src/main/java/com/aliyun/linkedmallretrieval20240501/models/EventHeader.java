// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class EventHeader extends TeaModel {
    @NameInMap("event")
    public String event;

    @NameInMap("eventId")
    public String eventId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("responseTime")
    public Long responseTime;

    public static EventHeader build(java.util.Map<String, ?> map) throws Exception {
        EventHeader self = new EventHeader();
        return TeaModel.build(map, self);
    }

    public EventHeader setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public EventHeader setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventHeader setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EventHeader setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
        return this;
    }
    public Long getResponseTime() {
        return this.responseTime;
    }

}
