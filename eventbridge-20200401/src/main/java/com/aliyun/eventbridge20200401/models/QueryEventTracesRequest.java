// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventTracesRequest extends TeaModel {
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

    public static QueryEventTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventTracesRequest self = new QueryEventTracesRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventTracesRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public QueryEventTracesRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
