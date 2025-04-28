// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsResponseBody extends TeaModel {
    /**
     * <p>The queried download tasks.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDownloadRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>987F51BE-C4CB-332A-B159-63CE87******</p>
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
         * <p>The download task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("DownloadId")
        public Long downloadId;

        /**
         * <p>The error message returned if the download task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The query result is empty.</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>The name of the downloaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>20210806094635-20210806095135</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The status of the download task. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>finished</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
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
