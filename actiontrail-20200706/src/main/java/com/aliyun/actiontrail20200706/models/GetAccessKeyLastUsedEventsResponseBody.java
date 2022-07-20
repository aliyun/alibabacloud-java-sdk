// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<GetAccessKeyLastUsedEventsResponseBodyEvents> events;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyLastUsedEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedEventsResponseBody self = new GetAccessKeyLastUsedEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedEventsResponseBody setEvents(java.util.List<GetAccessKeyLastUsedEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<GetAccessKeyLastUsedEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public GetAccessKeyLastUsedEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyLastUsedEventsResponseBodyEvents extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("Source")
        public String source;

        @NameInMap("UsedTimestamp")
        public Long usedTimestamp;

        public static GetAccessKeyLastUsedEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedEventsResponseBodyEvents self = new GetAccessKeyLastUsedEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedEventsResponseBodyEvents setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAccessKeyLastUsedEventsResponseBodyEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetAccessKeyLastUsedEventsResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAccessKeyLastUsedEventsResponseBodyEvents setUsedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

    }

}
