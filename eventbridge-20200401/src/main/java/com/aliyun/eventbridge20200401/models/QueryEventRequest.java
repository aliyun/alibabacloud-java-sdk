// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The event ID.</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>EventSource is required for querying default bus events.</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    public static QueryEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRequest self = new QueryEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public QueryEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryEventRequest setEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }
    public String getEventSource() {
        return this.eventSource;
    }

}
