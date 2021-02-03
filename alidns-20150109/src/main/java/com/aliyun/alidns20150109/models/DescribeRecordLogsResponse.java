// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("RecordLogs")
    @Validation(required = true)
    public DescribeRecordLogsResponseRecordLogs recordLogs;

    public static DescribeRecordLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsResponse self = new DescribeRecordLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordLogsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeRecordLogsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordLogsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordLogsResponse setRecordLogs(DescribeRecordLogsResponseRecordLogs recordLogs) {
        this.recordLogs = recordLogs;
        return this;
    }
    public DescribeRecordLogsResponseRecordLogs getRecordLogs() {
        return this.recordLogs;
    }

    public static class DescribeRecordLogsResponseRecordLogsRecordLog extends TeaModel {
        @NameInMap("ActionTime")
        @Validation(required = true)
        public String actionTime;

        @NameInMap("ActionTimestamp")
        @Validation(required = true)
        public Long actionTimestamp;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        public static DescribeRecordLogsResponseRecordLogsRecordLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseRecordLogsRecordLog self = new DescribeRecordLogsResponseRecordLogsRecordLog();
            return TeaModel.build(map, self);
        }

        public DescribeRecordLogsResponseRecordLogsRecordLog setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public DescribeRecordLogsResponseRecordLogsRecordLog setActionTimestamp(Long actionTimestamp) {
            this.actionTimestamp = actionTimestamp;
            return this;
        }
        public Long getActionTimestamp() {
            return this.actionTimestamp;
        }

        public DescribeRecordLogsResponseRecordLogsRecordLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeRecordLogsResponseRecordLogsRecordLog setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRecordLogsResponseRecordLogsRecordLog setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

    }

    public static class DescribeRecordLogsResponseRecordLogs extends TeaModel {
        @NameInMap("RecordLog")
        @Validation(required = true)
        public java.util.List<DescribeRecordLogsResponseRecordLogsRecordLog> recordLog;

        public static DescribeRecordLogsResponseRecordLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordLogsResponseRecordLogs self = new DescribeRecordLogsResponseRecordLogs();
            return TeaModel.build(map, self);
        }

        public DescribeRecordLogsResponseRecordLogs setRecordLog(java.util.List<DescribeRecordLogsResponseRecordLogsRecordLog> recordLog) {
            this.recordLog = recordLog;
            return this;
        }
        public java.util.List<DescribeRecordLogsResponseRecordLogsRecordLog> getRecordLog() {
            return this.recordLog;
        }

    }

}
