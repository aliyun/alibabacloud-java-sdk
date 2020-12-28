// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class LookupEventsRequest extends TeaModel {
    @NameInMap("Event")
    public String event;

    @NameInMap("Request")
    public String request;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("User")
    public String user;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("EventRW")
    public String eventRW;

    @NameInMap("EventAccessKeyId")
    public String eventAccessKeyId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static LookupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsRequest self = new LookupEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupEventsRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public LookupEventsRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public LookupEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public LookupEventsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public LookupEventsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public LookupEventsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public LookupEventsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public LookupEventsRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public LookupEventsRequest setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public LookupEventsRequest setEventAccessKeyId(String eventAccessKeyId) {
        this.eventAccessKeyId = eventAccessKeyId;
        return this;
    }
    public String getEventAccessKeyId() {
        return this.eventAccessKeyId;
    }

    public LookupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public LookupEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
