// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<DescribeDomainAttackEventsResponseBodyEvents> events;

    @NameInMap("Total")
    public Long total;

    public static DescribeDomainAttackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventsResponseBody self = new DescribeDomainAttackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAttackEventsResponseBody setEvents(java.util.List<DescribeDomainAttackEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDomainAttackEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeDomainAttackEventsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDomainAttackEventsResponseBodyEvents extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("MaxQps")
        public Integer maxQps;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("BlockCount")
        public Long blockCount;

        public static DescribeDomainAttackEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAttackEventsResponseBodyEvents self = new DescribeDomainAttackEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAttackEventsResponseBodyEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainAttackEventsResponseBodyEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDomainAttackEventsResponseBodyEvents setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainAttackEventsResponseBodyEvents setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeDomainAttackEventsResponseBodyEvents setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DescribeDomainAttackEventsResponseBodyEvents setBlockCount(Long blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Long getBlockCount() {
            return this.blockCount;
        }

    }

}
