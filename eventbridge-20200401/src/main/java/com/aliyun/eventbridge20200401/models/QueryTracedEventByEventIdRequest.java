// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventByEventIdRequest extends TeaModel {
    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The event ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1935debf-ddac-49dc-a090-d4f2857a046d</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The name of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>mse</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    public static QueryTracedEventByEventIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventByEventIdRequest self = new QueryTracedEventByEventIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventByEventIdRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public QueryTracedEventByEventIdRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryTracedEventByEventIdRequest setEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }
    public String getEventSource() {
        return this.eventSource;
    }

}
