// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsResponseBody extends TeaModel {
    /**
     * <p>The end of the time range when event details were queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The returned event details.</p>
     * <br>
     * <p>For more information about the fields in an event log, see [ActionTrail event log reference](~~28819~~).</p>
     */
    @NameInMap("Events")
    public java.util.List<java.util.Map<String, ?>> events;

    /**
     * <p>The token used to return the next page of query results.</p>
     * <br>
     * <p>> This parameter is not returned if no more results are to be returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range when event details were queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static LookupEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsResponseBody self = new LookupEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupEventsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LookupEventsResponseBody setEvents(java.util.List<java.util.Map<String, ?>> events) {
        this.events = events;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getEvents() {
        return this.events;
    }

    public LookupEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LookupEventsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
