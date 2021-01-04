// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeCcEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventList")
    public java.util.List<DescribeCcEventsResponseBodyEventList> eventList;

    @NameInMap("Total")
    public Integer total;

    public static DescribeCcEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcEventsResponseBody self = new DescribeCcEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcEventsResponseBody setEventList(java.util.List<DescribeCcEventsResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribeCcEventsResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribeCcEventsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeCcEventsResponseBodyEventList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("AttackFinished")
        public Boolean attackFinished;

        @NameInMap("MaxQps")
        public Integer maxQps;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("BlockedCount")
        public Integer blockedCount;

        public static DescribeCcEventsResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcEventsResponseBodyEventList self = new DescribeCcEventsResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribeCcEventsResponseBodyEventList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCcEventsResponseBodyEventList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCcEventsResponseBodyEventList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCcEventsResponseBodyEventList setAttackFinished(Boolean attackFinished) {
            this.attackFinished = attackFinished;
            return this;
        }
        public Boolean getAttackFinished() {
            return this.attackFinished;
        }

        public DescribeCcEventsResponseBodyEventList setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public DescribeCcEventsResponseBodyEventList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeCcEventsResponseBodyEventList setBlockedCount(Integer blockedCount) {
            this.blockedCount = blockedCount;
            return this;
        }
        public Integer getBlockedCount() {
            return this.blockedCount;
        }

    }

}
