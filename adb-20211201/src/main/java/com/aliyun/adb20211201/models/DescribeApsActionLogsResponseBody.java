// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsActionLogsResponseBody extends TeaModel {
    @NameInMap("ActionLogs")
    public java.util.List<DescribeApsActionLogsResponseBodyActionLogs> actionLogs;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("WorkloadId")
    public String workloadId;

    public static DescribeApsActionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsActionLogsResponseBody self = new DescribeApsActionLogsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Context")
        public String context;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("State")
        public String state;

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
