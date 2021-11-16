// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("events")
    public java.util.List<DescribeEventsResponseBodyEvents> events;

    @NameInMap("page_info")
    public DescribeEventsResponseBodyPageInfo pageInfo;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setEvents(java.util.List<DescribeEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeEventsResponseBody setPageInfo(DescribeEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeEventsResponseBodyEventsData extends TeaModel {
        // 事件级别
        @NameInMap("level")
        public String level;

        // 事件详情
        @NameInMap("message")
        public String message;

        // 事件状态
        @NameInMap("reason")
        public String reason;

        public static DescribeEventsResponseBodyEventsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEventsData self = new DescribeEventsResponseBodyEventsData();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEventsData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEventsResponseBodyEventsData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeEventsResponseBodyEventsData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeEventsResponseBodyEvents extends TeaModel {
        // 集群ID
        @NameInMap("cluster_id")
        public String clusterId;

        // 事件描述
        @NameInMap("data")
        public DescribeEventsResponseBodyEventsData data;

        // 事件ID
        @NameInMap("event_id")
        public String eventId;

        // 事件源
        @NameInMap("source")
        public String source;

        // 事件
        @NameInMap("subject")
        public String subject;

        // 事件开始事件
        @NameInMap("time")
        public String time;

        // 事件类型
        @NameInMap("type")
        public String type;

        public static DescribeEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyEvents self = new DescribeEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeEventsResponseBodyEvents setData(DescribeEventsResponseBodyEventsData data) {
            this.data = data;
            return this;
        }
        public DescribeEventsResponseBodyEventsData getData() {
            return this.data;
        }

        public DescribeEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeEventsResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeEventsResponseBodyEvents setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeEventsResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeEventsResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEventsResponseBodyPageInfo extends TeaModel {
        // 每页记录数量
        @NameInMap("page_number")
        public Long pageNumber;

        // 页数
        @NameInMap("page_size")
        public Long pageSize;

        // 结果总数
        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyPageInfo self = new DescribeEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEventsResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeEventsResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
