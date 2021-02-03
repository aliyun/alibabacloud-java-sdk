// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("RecordLogs")
    public DescribeRecordLogsResponseBodyRecordLogs recordLogs;

    public static DescribeRecordLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsResponseBody self = new DescribeRecordLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeRecordLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordLogsResponseBody setRecordLogs(DescribeRecordLogsResponseBodyRecordLogs recordLogs) {
        this.recordLogs = recordLogs;
        return this;
    }
    public DescribeRecordLogsResponseBodyRecordLogs getRecordLogs() {
        return this.recordLogs;
    }

    public static class DescribeRecordLogsResponseBodyRecordLogsRecordLog extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionTimestamp")
        public Long actionTimestamp;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Message")
        public String message;

        @NameInMap("ActionTime")
        public String actionTime;

        public static DescribeRecordLogsResponseBodyRecordLogsRecordLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseBodyRecordLogsRecordLog self = new DescribeRecordLogsResponseBodyRecordLogsRecordLog();
            return TeaModel.build(map, self);
        }

        public DescribeRecordLogsResponseBodyRecordLogsRecordLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeRecordLogsResponseBodyRecordLogsRecordLog setActionTimestamp(Long actionTimestamp) {
            this.actionTimestamp = actionTimestamp;
            return this;
        }
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        public DescribeRecordLogsResponseBodyRecordLogsRecordLog setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeRecordLogsResponseBodyRecordLogsRecordLog setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRecordLogsResponseBodyRecordLogsRecordLog setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

    }

    public static class DescribeRecordLogsResponseBodyRecordLogs extends TeaModel {
        @NameInMap("RecordLog")
        public java.util.List<DescribeRecordLogsResponseBodyRecordLogsRecordLog> recordLog;

        public static DescribeRecordLogsResponseBodyRecordLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseBodyRecordLogs self = new DescribeRecordLogsResponseBodyRecordLogs();
            return TeaModel.build(map, self);
        }

        public DescribeRecordLogsResponseBodyRecordLogs setRecordLog(java.util.List<DescribeRecordLogsResponseBodyRecordLogsRecordLog> recordLog) {
            this.recordLog = recordLog;
            return this;
        }
        public java.util.List<DescribeRecordLogsResponseBodyRecordLogsRecordLog> getRecordLog() {
            return this.recordLog;
        }

    }

}
