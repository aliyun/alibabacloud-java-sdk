// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDdosAttackEventsResponseBodyData data;

    public static DescribeDdosAttackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackEventsResponseBody self = new DescribeDdosAttackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosAttackEventsResponseBody setData(DescribeDdosAttackEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDdosAttackEventsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDdosAttackEventsResponseBodyDataEventList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("AttackType")
        public String attackType;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Duration")
        public String duration;

        public static DescribeDdosAttackEventsResponseBodyDataEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosAttackEventsResponseBodyDataEventList self = new DescribeDdosAttackEventsResponseBodyDataEventList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosAttackEventsResponseBodyDataEventList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDdosAttackEventsResponseBodyDataEventList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDdosAttackEventsResponseBodyDataEventList setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeDdosAttackEventsResponseBodyDataEventList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeDdosAttackEventsResponseBodyDataEventList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class DescribeDdosAttackEventsResponseBodyData extends TeaModel {
        @NameInMap("EventList")
        public java.util.List<DescribeDdosAttackEventsResponseBodyDataEventList> eventList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDdosAttackEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosAttackEventsResponseBodyData self = new DescribeDdosAttackEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDdosAttackEventsResponseBodyData setEventList(java.util.List<DescribeDdosAttackEventsResponseBodyDataEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<DescribeDdosAttackEventsResponseBodyDataEventList> getEventList() {
            return this.eventList;
        }

        public DescribeDdosAttackEventsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
