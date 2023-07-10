// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadSQLLogsResponseBody extends TeaModel {
    @NameInMap("Records")
    public java.util.List<DescribeDownloadSQLLogsResponseBodyRecords> records;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDownloadSQLLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadSQLLogsResponseBody self = new DescribeDownloadSQLLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadSQLLogsResponseBody setRecords(java.util.List<DescribeDownloadSQLLogsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeDownloadSQLLogsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeDownloadSQLLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDownloadSQLLogsResponseBodyRecords extends TeaModel {
        @NameInMap("DownloadId")
        public Long downloadId;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Status")
        public String status;

        public static DescribeDownloadSQLLogsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadSQLLogsResponseBodyRecords self = new DescribeDownloadSQLLogsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadSQLLogsResponseBodyRecords setDownloadId(Long downloadId) {
            this.downloadId = downloadId;
            return this;
        }
        public Long getDownloadId() {
            return this.downloadId;
        }

        public DescribeDownloadSQLLogsResponseBodyRecords setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeDownloadSQLLogsResponseBodyRecords setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public DescribeDownloadSQLLogsResponseBodyRecords setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeDownloadSQLLogsResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
