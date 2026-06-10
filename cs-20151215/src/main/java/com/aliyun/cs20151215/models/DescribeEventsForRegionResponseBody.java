// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsForRegionResponseBody extends TeaModel {
    /**
     * <p>A list of events.</p>
     */
    @NameInMap("events")
    public java.util.List<DescribeEventsForRegionResponseBodyEvents> events;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If this parameter is empty, all results have been returned.</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page_info")
    public DescribeEventsForRegionResponseBodyPageInfo pageInfo;

    public static DescribeEventsForRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsForRegionResponseBody self = new DescribeEventsForRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsForRegionResponseBody setEvents(java.util.List<DescribeEventsForRegionResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeEventsForRegionResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeEventsForRegionResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEventsForRegionResponseBody setPageInfo(DescribeEventsForRegionResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeEventsForRegionResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeEventsForRegionResponseBodyEventsData extends TeaModel {
        /**
         * <p>The event level.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The event message.</p>
         * 
         * <strong>example:</strong>
         * <p>Start to upgrade NodePool nodePool/nodePool-A</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The reason for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("reason")
        public String reason;

        public static DescribeEventsForRegionResponseBodyEventsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsForRegionResponseBodyEventsData self = new DescribeEventsForRegionResponseBodyEventsData();
            return TeaModel.build(map, self);
        }

        public DescribeEventsForRegionResponseBodyEventsData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeEventsForRegionResponseBodyEventsData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeEventsForRegionResponseBodyEventsData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeEventsForRegionResponseBodyEvents extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The event data.</p>
         */
        @NameInMap("data")
        public DescribeEventsForRegionResponseBodyEventsData data;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e-9ad04f72-8ee7-46bf-a02c-e4a06b39****</p>
         */
        @NameInMap("event_id")
        public String eventId;

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>task</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The event subject.</p>
         * 
         * <strong>example:</strong>
         * <p>npdd89dc2b76c04f14b06774883b******</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-14T10:00:56+08:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>nodePool_upgrade</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeEventsForRegionResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsForRegionResponseBodyEvents self = new DescribeEventsForRegionResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeEventsForRegionResponseBodyEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeEventsForRegionResponseBodyEvents setData(DescribeEventsForRegionResponseBodyEventsData data) {
            this.data = data;
            return this;
        }
        public DescribeEventsForRegionResponseBodyEventsData getData() {
            return this.data;
        }

        public DescribeEventsForRegionResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeEventsForRegionResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeEventsForRegionResponseBodyEvents setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeEventsForRegionResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeEventsForRegionResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeEventsForRegionResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeEventsForRegionResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsForRegionResponseBodyPageInfo self = new DescribeEventsForRegionResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEventsForRegionResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEventsForRegionResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeEventsForRegionResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
