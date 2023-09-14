// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventsRequest extends TeaModel {
    /**
     * <p>The end of the time range when event traces are queried. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the event bus.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    /**
     * <p>The event type.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. Up to 100 entries can be returned in a call.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the event rule that is matched.</p>
     */
    @NameInMap("MatchedRule")
    public String matchedRule;

    /**
     * <p>If you configure Limit and excess return values exist, this parameter is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The beginning of the time range to query event traces. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryTracedEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTracedEventsRequest self = new QueryTracedEventsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTracedEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTracedEventsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public QueryTracedEventsRequest setEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }
    public String getEventSource() {
        return this.eventSource;
    }

    public QueryTracedEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public QueryTracedEventsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryTracedEventsRequest setMatchedRule(String matchedRule) {
        this.matchedRule = matchedRule;
        return this;
    }
    public String getMatchedRule() {
        return this.matchedRule;
    }

    public QueryTracedEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryTracedEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
