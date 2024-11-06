// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadSQLLogsResponseBody extends TeaModel {
    /**
     * <p>List of download records.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDownloadSQLLogsResponseBodyRecords> records;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FDE9942A-D919-527B-B559-5D0F6F20CCEC</p>
     */
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
        /**
         * <p>Download record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1150</p>
         */
        @NameInMap("DownloadId")
        public Long downloadId;

        /**
         * <p>Download link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://perth-download-task.oss-cn-beijing.aliyuncs.com/">https://perth-download-task.oss-cn-beijing.aliyuncs.com/</a>*****</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>20220509113448-20220509173448.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Task status, with possible values being:</p>
         * <ul>
         * <li><strong>running</strong>: Downloading.</li>
         * <li><strong>finished</strong>: Completed.</li>
         * <li><strong>failed</strong>: Download failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
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
