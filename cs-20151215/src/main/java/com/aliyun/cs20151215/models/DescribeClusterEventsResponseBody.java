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
     * <p>The pagination token.</p>
     */
    @NameInMap("next_token")
    public String nextToken;

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

    public DescribeClusterEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
         * <p>The event level.</p>
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
         * <p>Start to upgrade NodePool nodePool/npdd89dc2b76c04f14b06774883b******</p>
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
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("data")
        public DescribeClusterEventsResponseBodyEventsData data;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-9ad04f72-8ee7-46bf-a02c-e4a06b39****</p>
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
         * <p>The operation object associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>npdd89dc2b76c04f14b06774883b******</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The start time of the event. The time is in ISO 8601 format and includes time zone information.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-14T10:00:56+08:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>cluster_create: Creates a cluster.</li>
         * <li>cluster_scaleout: Scales out a cluster.</li>
         * <li>cluster_attach: Adds existing nodes.</li>
         * <li>cluster_delete: Deletes a cluster.</li>
         * <li>cluster_upgrade: Upgrades a cluster.</li>
         * <li>cluster_migrate: Migrates a cluster.</li>
         * <li>cluster_node_delete: Removes a node.</li>
         * <li>cluster_node_drain: Drains a node.</li>
         * <li>cluster_modify: Modifies a cluster.</li>
         * <li>cluster_configuration_modify: Modifies the control configurations of a cluster.</li>
         * <li>cluster_addon_install: Installs a component.</li>
         * <li>cluster_addon_upgrade: Upgrades a component.</li>
         * <li>cluster_addon_uninstall: Uninstalls a component.</li>
         * <li>runtime_upgrade: Upgrades the runtime.</li>
         * <li>nodepool_upgrade: Upgrades a node pool.</li>
         * <li>nodepool_update: Updates a node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nodepool_update</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The maximum number of results to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>126</p>
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
