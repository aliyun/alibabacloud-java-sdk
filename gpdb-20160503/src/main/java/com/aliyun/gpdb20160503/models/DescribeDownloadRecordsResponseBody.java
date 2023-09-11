// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsResponseBody extends TeaModel {
    /**
     * <p>The URL that is used to download the file.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDownloadRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
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
         * <p>The ID of the download record.</p>
         */
        @NameInMap("DownloadId")
        public Long downloadId;

        /**
         * <p>The URL that can be used to download the file.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The state of the upload task. After you call the DownloadDiagnosisRecords operation, query diagnostic information is first uploaded to Object Storage Service (OSS). After the upload task is complete, the query diagnostic information can be downloaded. Valid values:</p>
         * <br>
         * <p>*   **running**: uploading</p>
         * <p>*   **finished**: uploaded</p>
         * <p>*   **failed**: failed</p>
         */
        @NameInMap("Status")
        public String status;

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

        public DescribeDownloadRecordsResponseBodyRecords setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
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

    }

}
