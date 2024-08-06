// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class EventHeader extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on_common_search_stream</p>
     */
    @NameInMap("event")
    public String event;

    /**
     * <strong>example:</strong>
     * <p>ff3de49-cedc-47ea-ba3c-8456acd345d8</p>
     */
    @NameInMap("eventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>55c2349-cedc-47ea-ba3c-8456acd6c7d8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1403</p>
     */
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
