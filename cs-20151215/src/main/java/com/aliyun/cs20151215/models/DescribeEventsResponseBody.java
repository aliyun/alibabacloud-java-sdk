// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    /**
     * <p>The event details.</p>
     */
    @NameInMap("events")
    public java.util.List<DescribeEventsResponseBodyEvents> events;

    /**
     * <p>The pagination token. Set this parameter to the next_token value returned from the previous API call.</p>
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
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li>info: Information.</li>
         * <li>warning: Warning.</li>
         * <li>error: Error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The event details.</p>
         * 
         * <strong>example:</strong>
         * <p>Start to upgrade NodePool nodePool/nodePool-A</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The event status.</p>
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
         * <p>The event description.</p>
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
         * <p>np6a5c86f4ecae436f8f4a3dc034a7****</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The start time of the event in ISO 8601 format, including the time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-23T20:48:01+08:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li><code>cluster_create</code>: Cluster creation.</li>
         * <li><code>cluster_scaleout</code>: Cluster scale-out.</li>
         * <li><code>cluster_attach</code>: Addition of existing nodes.</li>
         * <li><code>cluster_delete</code>: Cluster deletion.</li>
         * <li><code>cluster_upgrade</code>: Cluster upgrade.</li>
         * <li><code>cluster_migrate</code>: Cluster migration.</li>
         * <li><code>cluster_node_delete</code>: Node removal.</li>
         * <li><code>cluster_node_drain</code>: Node draining.</li>
         * <li><code>cluster_modify</code>: Cluster modification.</li>
         * <li><code>cluster_configuration_modify</code>: Cluster control configuration modification.</li>
         * <li><code>cluster_addon_install</code>: Add-on installation.</li>
         * <li><code>cluster_addon_upgrade</code>: Add-on upgrade.</li>
         * <li><code>cluster_addon_uninstall</code>: Add-on uninstallation.</li>
         * <li><code>runtime_upgrade</code>: Runtime upgrade.</li>
         * <li><code>nodepool_upgrade</code>: Node pool upgrade.</li>
         * <li><code>nodepool_update</code>: Node pool update.</li>
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
         * <p>The page number for paging in the paged query.</p>
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
