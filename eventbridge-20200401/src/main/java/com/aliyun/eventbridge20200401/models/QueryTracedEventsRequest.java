// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryTracedEventsRequest extends TeaModel {
    /**
     * <p>The end of the time range for the query, specified as a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1661773509000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the event bus.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyEventBus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>mse</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>eventbridge:Events:HTTPEvent</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The maximum number of entries to return per page. Use this parameter with NextToken to paginate the results.&gt;Notice: The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name of the matched rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mnsrule</p>
     */
    @NameInMap("MatchedRule")
    public String matchedRule;

    /**
     * <p>The token for retrieving the next page of results. It is returned in the response to a previous request if more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The beginning of the time range for the query, specified as a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1661773509000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The event subject.</p>
     */
    @NameInMap("Subject")
    public String subject;

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

    public QueryTracedEventsRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
