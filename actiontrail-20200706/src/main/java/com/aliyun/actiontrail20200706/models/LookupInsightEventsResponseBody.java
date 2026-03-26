// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupInsightEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<java.util.Map<String, ?>> events;

    /**
     * <strong>example:</strong>
     * <p>VjE6bHJlTGoxdm1M****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>851038F3-33AB-4C49-97D7-6AB37D35****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LookupInsightEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupInsightEventsResponseBody self = new LookupInsightEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupInsightEventsResponseBody setEvents(java.util.List<java.util.Map<String, ?>> events) {
        this.events = events;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEvents() {
        return this.events;
    }

    public LookupInsightEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupInsightEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
