// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsActionLogsResponseBody extends TeaModel {
    /**
     * <p>The information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;AuthAction&quot;: &quot;xxx&quot;,
     *   &quot;AuthPrincipalDisplayName&quot;: &quot;sampleName&quot;,
     *   &quot;AuthPrincipalOwnerId&quot;: &quot;111111111111111111&quot;,
     *   &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *   &quot;AuthResource&quot;: &quot;xxx&quot;,
     *   &quot;NoPermissionType&quot;: &quot;xxx&quot;,
     *   &quot;PolicyType&quot;: &quot;xxx&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The queried logs.</p>
     */
    @NameInMap("ActionLogs")
    public java.util.List<DescribeApsActionLogsResponseBodyActionLogs> actionLogs;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EDBA27-AF3E-5966-9503-FD1557E19167</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The ID of the real-time data ingestion job.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-hz109vpvt4fg8528d****</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    public static DescribeApsActionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsActionLogsResponseBody self = new DescribeApsActionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsActionLogsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeApsActionLogsResponseBody setActionLogs(java.util.List<DescribeApsActionLogsResponseBodyActionLogs> actionLogs) {
        this.actionLogs = actionLogs;
        return this;
    }
    public java.util.List<DescribeApsActionLogsResponseBodyActionLogs> getActionLogs() {
        return this.actionLogs;
    }

    public DescribeApsActionLogsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApsActionLogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsActionLogsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeApsActionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsActionLogsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeApsActionLogsResponseBody setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public static class DescribeApsActionLogsResponseBodyActionLogs extends TeaModel {
        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>DDL migration job finished</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <p>The phase during which the log was generated. Valid values:</p>
         * <ul>
         * <li><strong>StructureMigrate</strong>: schema migration.</li>
         * <li><strong>FullDataSync</strong>: full data synchronization.</li>
         * <li><strong>IncrementalSync</strong>: incremental data synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullDataSync</p>
         */
        @NameInMap("Stage")
        public String stage;

        /**
         * <p>The type of the log. Multiple log types are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>INFO</strong></li>
         * <li><strong>WARN</strong></li>
         * <li><strong>ERROR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO,WARN,ERROR</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the log was generated. The time follows the ISO 8601 standard in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-01T05:46:30Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeApsActionLogsResponseBodyActionLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsActionLogsResponseBodyActionLogs self = new DescribeApsActionLogsResponseBodyActionLogs();
            return TeaModel.build(map, self);
        }

        public DescribeApsActionLogsResponseBodyActionLogs setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public DescribeApsActionLogsResponseBodyActionLogs setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeApsActionLogsResponseBodyActionLogs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeApsActionLogsResponseBodyActionLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
