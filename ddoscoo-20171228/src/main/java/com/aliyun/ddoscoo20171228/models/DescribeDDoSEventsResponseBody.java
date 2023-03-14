// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<DescribeDDoSEventsResponseBodyEvents> events;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeDDoSEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventsResponseBody self = new DescribeDDoSEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventsResponseBody setEvents(java.util.List<DescribeDDoSEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDDoSEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeDDoSEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSEventsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDDoSEventsResponseBodyEvents extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeDDoSEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSEventsResponseBodyEvents self = new DescribeDDoSEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSEventsResponseBodyEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDoSEventsResponseBodyEvents setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeDDoSEventsResponseBodyEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDDoSEventsResponseBodyEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
