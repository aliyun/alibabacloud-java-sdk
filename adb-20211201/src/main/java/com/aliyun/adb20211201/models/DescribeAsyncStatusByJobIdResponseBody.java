// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAsyncStatusByJobIdResponseBody extends TeaModel {
    @NameInMap("JobStatus")
    public DescribeAsyncStatusByJobIdResponseBodyJobStatus jobStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAsyncStatusByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncStatusByJobIdResponseBody self = new DescribeAsyncStatusByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncStatusByJobIdResponseBody setJobStatus(DescribeAsyncStatusByJobIdResponseBodyJobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public DescribeAsyncStatusByJobIdResponseBodyJobStatus getJobStatus() {
        return this.jobStatus;
    }

    public DescribeAsyncStatusByJobIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAsyncStatusByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncStatusByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAsyncStatusByJobIdResponseBodyJobStatus extends TeaModel {
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Readable")
        public Boolean readable;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        public static DescribeAsyncStatusByJobIdResponseBodyJobStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncStatusByJobIdResponseBodyJobStatus self = new DescribeAsyncStatusByJobIdResponseBodyJobStatus();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setReadable(Boolean readable) {
            this.readable = readable;
            return this;
        }
        public Boolean getReadable() {
            return this.readable;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAsyncStatusByJobIdResponseBodyJobStatus setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
