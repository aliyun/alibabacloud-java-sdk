// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Events")
    @Validation(required = true)
    public java.util.List<DescribeDomainAttackEventsResponseEvents> events;

    public static DescribeDomainAttackEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventsResponse self = new DescribeDomainAttackEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAttackEventsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDomainAttackEventsResponse setEvents(java.util.List<DescribeDomainAttackEventsResponseEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeDomainAttackEventsResponseEvents> getEvents() {
        return this.events;
    }

    public static class DescribeDomainAttackEventsResponseEvents extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("Finished")
        @Validation(required = true)
        public Boolean finished;

        @NameInMap("MaxQps")
        @Validation(required = true)
        public Integer maxQps;

        @NameInMap("BlockCount")
        @Validation(required = true)
        public Long blockCount;

        public static DescribeDomainAttackEventsResponseEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAttackEventsResponseEvents self = new DescribeDomainAttackEventsResponseEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAttackEventsResponseEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDomainAttackEventsResponseEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainAttackEventsResponseEvents setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeDomainAttackEventsResponseEvents setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DescribeDomainAttackEventsResponseEvents setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainAttackEventsResponseEvents setBlockCount(Long blockCount) {
            this.blockCount = blockCount;
            return this;
        }
        public Long getBlockCount() {
            return this.blockCount;
        }

    }

}
