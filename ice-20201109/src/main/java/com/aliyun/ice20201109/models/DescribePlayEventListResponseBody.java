// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    public java.util.List<DescribePlayEventListResponseBodyEventList> eventList;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePlayEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayEventListResponseBody self = new DescribePlayEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayEventListResponseBody setEventList(java.util.List<DescribePlayEventListResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribePlayEventListResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribePlayEventListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayEventListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayEventListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlayEventListResponseBodyEventList extends TeaModel {
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

        public static DescribePlayEventListResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayEventListResponseBodyEventList self = new DescribePlayEventListResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribePlayEventListResponseBodyEventList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePlayEventListResponseBodyEventList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribePlayEventListResponseBodyEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribePlayEventListResponseBodyEventList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribePlayEventListResponseBodyEventList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
