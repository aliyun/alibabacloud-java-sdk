// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeDDoSEventsResponseEvents> events;

    public static DescribeDDoSEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventsResponse self = new DescribeDDoSEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSEventsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDDoSEventsResponse setEvents(java.util.List<DescribeDDoSEventsResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDDoSEventsResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeDDoSEventsResponseEvents extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeDDoSEventsResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSEventsResponseEvents self = new DescribeDDoSEventsResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSEventsResponseEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDDoSEventsResponseEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDDoSEventsResponseEvents setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeDDoSEventsResponseEvents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
