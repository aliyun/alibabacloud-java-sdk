// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("events")
    public java.util.List<DescribeEventsResponseBodyEvents> events;

    /**
     * <p>The pagination information.</p>
     */
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
        /**
         * <p>The severity level of the event.</p>
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
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("data")
        public DescribeEventsResponseBodyEventsData data;

        /**
         * <p>The event ID.</p>
         */
        @NameInMap("event_id")
        public String eventId;

        /**
         * <p>The source of the event.</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The subject of the event.</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <br>
         * <p>*   `cluster_create`: cluster creation.</p>
         * <p>*   `cluster_scaleout`: cluster scale-out.</p>
         * <p>*   `cluster_attach`: node addition.</p>
         * <p>*   `cluster_delete`: cluster deletion.</p>
         * <p>*   `cluster_upgrade`: cluster upgrades.</p>
         * <p>*   `cluster_migrate`: cluster migration.</p>
         * <p>*   `cluster_node_delete`: node removal.</p>
         * <p>*   `cluster_node_drain`: node draining.</p>
         * <p>*   `cluster_modify`: cluster modifications.</p>
         * <p>*   `cluster_configuration_modify`: modifications of control plane configurations.</p>
         * <p>*   `cluster_addon_install`: component installation.</p>
         * <p>*   `cluster_addon_upgrade`: component updates.</p>
         * <p>*   `cluster_addon_uninstall`: component uninstallation.</p>
         * <p>*   `runtime_upgrade`: runtime updates.</p>
         * <p>*   `nodepool_upgrade`: node pool upgrades.</p>
         * <p>*   `nodepool_update`: node pool updates.</p>
         */
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
        /**
         * <p>The page number.</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
