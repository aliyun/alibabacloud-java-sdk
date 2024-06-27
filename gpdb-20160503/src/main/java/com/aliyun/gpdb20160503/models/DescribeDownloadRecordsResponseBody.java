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
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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
         * 
         * <strong>example:</strong>
         * <p>1150</p>
         */
        @NameInMap("DownloadId")
        public Long downloadId;

        /**
         * <p>The URL that can be used to download the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://perth-download-task.oss-cn-beijing.aliyuncs.com/">https://perth-download-task.oss-cn-beijing.aliyuncs.com/</a>*****</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>20220509113448-20220509173448.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The state of the upload task. After you call the DownloadDiagnosisRecords operation, query diagnostic information is first uploaded to Object Storage Service (OSS). After the upload task is complete, the query diagnostic information can be downloaded. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: uploading</li>
         * <li><strong>finished</strong>: uploaded</li>
         * <li><strong>failed</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
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
