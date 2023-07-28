// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsResponseBody extends TeaModel {
    /**
     * <p>Details about the download tasks.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDownloadRecordsResponseBodyRecords> records;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDownloadRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadRecordsResponseBody self = new DescribeDownloadRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadRecordsResponseBody setRecords(java.util.List<DescribeDownloadRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeDownloadRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeDownloadRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDownloadRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The ID of the download task.</p>
         */
        @NameInMap("DownloadId")
        public Long downloadId;

        /**
         * <p>The error message returned when the download task has failed.</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>The name of the downloaded file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The status of the download task.</p>
         * <br>
         * <p>*   **running**: The download task is currently in progress.</p>
         * <p>*   **finished**: The download task is complete.</p>
         * <p>*   **failed**: The download task has failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The download URL of the file.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeDownloadRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadRecordsResponseBodyRecords self = new DescribeDownloadRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadRecordsResponseBodyRecords setDownloadId(Long downloadId) {
            this.downloadId = downloadId;
            return this;
        }
        public Long getDownloadId() {
            return this.downloadId;
        }

        public DescribeDownloadRecordsResponseBodyRecords setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public DescribeDownloadRecordsResponseBodyRecords setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeDownloadRecordsResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDownloadRecordsResponseBodyRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
