// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<DescribeDDoSEventsResponseBodyEvents> events;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>3289457398</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>3289457324</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>blackhole_start</p>
         */
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
