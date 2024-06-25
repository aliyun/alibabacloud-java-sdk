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
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The details of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Start to upgrade NodePool nodePool/nodePool-A</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
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
         * 
         * <strong>example:</strong>
         * <p>cluster-id</p>
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
         * 
         * <strong>example:</strong>
         * <p>A234-1234-1234</p>
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
         * 
         * <strong>example:</strong>
         * <p>nodePool-id</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The time when the event started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-23T20:48:01+08:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li><code>cluster_create</code>: cluster creation.</li>
         * <li><code>cluster_scaleout</code>: cluster scale-out.</li>
         * <li><code>cluster_attach</code>: node addition.</li>
         * <li><code>cluster_delete</code>: cluster deletion.</li>
         * <li><code>cluster_upgrade</code>: cluster upgrades.</li>
         * <li><code>cluster_migrate</code>: cluster migration.</li>
         * <li><code>cluster_node_delete</code>: node removal.</li>
         * <li><code>cluster_node_drain</code>: node draining.</li>
         * <li><code>cluster_modify</code>: cluster modifications.</li>
         * <li><code>cluster_configuration_modify</code>: modifications of control plane configurations.</li>
         * <li><code>cluster_addon_install</code>: component installation.</li>
         * <li><code>cluster_addon_upgrade</code>: component updates.</li>
         * <li><code>cluster_addon_uninstall</code>: component uninstallation.</li>
         * <li><code>runtime_upgrade</code>: runtime updates.</li>
         * <li><code>nodepool_upgrade</code>: node pool upgrades.</li>
         * <li><code>nodepool_update</code>: node pool updates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nodepool_upgrade</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
