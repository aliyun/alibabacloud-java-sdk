// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>A list of events.</p>
     */
    @NameInMap("events")
    public java.util.List<DescribeEventsResponseBodyEvents> events;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is absent from the response, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

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

    public DescribeEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li><p>info: An informational message.</p>
         * </li>
         * <li><p>warning: A warning.</p>
         * </li>
         * <li><p>error: An error.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>A human-readable description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Start to upgrade NodePool nodePool/nodePool-A</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>A brief, machine-readable string that describes the reason for the event.</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cf62854ac2130470897be7a27ed1f****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The event details.</p>
         */
        @NameInMap("data")
        public DescribeEventsResponseBodyEventsData data;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e-dba703c8-953b-40d8-82e8-cb713590****</p>
         */
        @NameInMap("event_id")
        public String eventId;

        /**
         * <p>The source of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>task</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The object that the event is about.</p>
         * 
         * <strong>example:</strong>
         * <p>np6a5c86f4ecae436f8f4a3dc034a7****</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The event timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-23T20:48:01+08:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li><p><code>cluster_create</code>: A cluster is created.</p>
         * </li>
         * <li><p><code>cluster_scaleout</code>: A cluster is scaled out.</p>
         * </li>
         * <li><p><code>cluster_attach</code>: An existing node is added.</p>
         * </li>
         * <li><p><code>cluster_delete</code>: A cluster is deleted.</p>
         * </li>
         * <li><p><code>cluster_upgrade</code>: A cluster is upgraded.</p>
         * </li>
         * <li><p><code>cluster_migrate</code>: A cluster is migrated.</p>
         * </li>
         * <li><p><code>cluster_node_delete</code>: A node is removed.</p>
         * </li>
         * <li><p><code>cluster_node_drain</code>: A node is drained.</p>
         * </li>
         * <li><p><code>cluster_modify</code>: A cluster is modified.</p>
         * </li>
         * <li><p><code>cluster_configuration_modify</code>: The control plane configuration of a cluster is modified.</p>
         * </li>
         * <li><p><code>cluster_addon_install</code>: An add-on is installed.</p>
         * </li>
         * <li><p><code>cluster_addon_upgrade</code>: An add-on is upgraded.</p>
         * </li>
         * <li><p><code>cluster_addon_uninstall</code>: An add-on is uninstalled.</p>
         * </li>
         * <li><p><code>runtime_upgrade</code>: The runtime is upgraded.</p>
         * </li>
         * <li><p><code>nodepool_upgrade</code>: A node pool is upgraded.</p>
         * </li>
         * <li><p><code>nodepool_update</code>: A node pool is updated.</p>
         * </li>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries that match the query.</p>
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
