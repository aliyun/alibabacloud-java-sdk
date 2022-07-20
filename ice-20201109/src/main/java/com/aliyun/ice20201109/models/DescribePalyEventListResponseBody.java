// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    public java.util.List<DescribePalyEventListResponseBodyEventList> eventList;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCnt")
    public Long totalCnt;

    public static DescribePalyEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyEventListResponseBody self = new DescribePalyEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePalyEventListResponseBody setEventList(java.util.List<DescribePalyEventListResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribePalyEventListResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribePalyEventListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePalyEventListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePalyEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePalyEventListResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribePalyEventListResponseBodyEventList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Topic")
        public String topic;

        public static DescribePalyEventListResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribePalyEventListResponseBodyEventList self = new DescribePalyEventListResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribePalyEventListResponseBodyEventList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePalyEventListResponseBodyEventList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribePalyEventListResponseBodyEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribePalyEventListResponseBodyEventList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribePalyEventListResponseBodyEventList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
