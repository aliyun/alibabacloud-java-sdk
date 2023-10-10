// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsResponseBody extends TeaModel {
    /**
     * <p>The list of events.</p>
     */
    @NameInMap("events")
    public java.util.List<DescribeClusterEventsResponseBodyEvents> events;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page_info")
    public DescribeClusterEventsResponseBodyPageInfo pageInfo;

    public static DescribeClusterEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterEventsResponseBody self = new DescribeClusterEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterEventsResponseBody setEvents(java.util.List<DescribeClusterEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeClusterEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeClusterEventsResponseBody setPageInfo(DescribeClusterEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeClusterEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeClusterEventsResponseBodyEventsData extends TeaModel {
        /**
         * <p>The severity level of the event.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   warning</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   error</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   info</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The details of the event.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The status of the event.</p>
         */
        @NameInMap("reason")
        public String reason;

        public static DescribeClusterEventsResponseBodyEventsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyEventsData self = new DescribeClusterEventsResponseBodyEventsData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyEventsData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeClusterEventsResponseBodyEventsData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeClusterEventsResponseBodyEventsData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeClusterEventsResponseBodyEvents extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("data")
        public DescribeClusterEventsResponseBodyEventsData data;

        /**
         * <p>The event ID.</p>
         */
        @NameInMap("event_id")
        public String eventId;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The subject related to the event.</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The type of event. Valid values:</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeClusterEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyEvents self = new DescribeClusterEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterEventsResponseBodyEvents setData(DescribeClusterEventsResponseBodyEventsData data) {
            this.data = data;
            return this;
        }
        public DescribeClusterEventsResponseBodyEventsData getData() {
            return this.data;
        }

        public DescribeClusterEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeClusterEventsResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeClusterEventsResponseBodyEvents setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeClusterEventsResponseBodyEvents setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeClusterEventsResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterEventsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of the page to return.</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 50.</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeClusterEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterEventsResponseBodyPageInfo self = new DescribeClusterEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterEventsResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterEventsResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterEventsResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
