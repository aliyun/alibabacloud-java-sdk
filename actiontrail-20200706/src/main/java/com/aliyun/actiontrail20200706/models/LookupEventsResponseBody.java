// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsResponseBody extends TeaModel {
    /**
     * <p>The end of the time range of the retrieved events.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-22T14:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of retrieved events.</p>
     */
    @NameInMap("Events")
    public java.util.List<java.util.Map<String, ?>> events;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p>If NextToken is empty, no next page exists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FD79665A-CE8B-49D4-82E6-5EE2E0E7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range of the retrieved events.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-15T14:00:00Z</p>
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
