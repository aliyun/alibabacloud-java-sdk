// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDEFE9F2-B3B4-42D0-83AE-ECF9FC067DCD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the file upload task.</p>
     */
    @NameInMap("UploadFileJobDetail")
    public GetUserUploadFileJobResponseBodyUploadFileJobDetail uploadFileJobDetail;

    public static GetUserUploadFileJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadFileJobResponseBody self = new GetUserUploadFileJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserUploadFileJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserUploadFileJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserUploadFileJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserUploadFileJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserUploadFileJobResponseBody setUploadFileJobDetail(GetUserUploadFileJobResponseBodyUploadFileJobDetail uploadFileJobDetail) {
        this.uploadFileJobDetail = uploadFileJobDetail;
        return this;
    }
    public GetUserUploadFileJobResponseBodyUploadFileJobDetail getUploadFileJobDetail() {
        return this.uploadFileJobDetail;
    }

    public static class GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test_bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss-cn-hangzhou.aliyuncs.com">http://oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The name of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>test.sql</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        public static GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam build(java.util.Map<String, ?> map) throws Exception {
            GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam self = new GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam();
            return TeaModel.build(map, self);
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class GetUserUploadFileJobResponseBodyUploadFileJobDetail extends TeaModel {
        /**
         * <p>The key of the file that is returned after the file is uploaded. You can use this key when you upload the file as an attachment in a ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>upload_3c7edea3-e4c3-4403-857d-737043036f69_test.sql</p>
         */
        @NameInMap("AttachmentKey")
        public String attachmentKey;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The size of the file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>2968269</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The purpose of the uploaded file. Valid values:</p>
         * <ul>
         * <li><strong>datacorrect</strong>: The file is uploaded to change data.</li>
         * <li><strong>order_info_attachment</strong>: The file is uploaded as an attachment in a ticket.</li>
         * <li><strong>big-file</strong>: The file is uploaded to import multiple data records at a time.</li>
         * <li><strong>sqlreview</strong>: The file is uploaded for SQL review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>datacorrect</p>
         */
        @NameInMap("FileSource")
        public String fileSource;

        /**
         * <p>The key of the file upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>65254a4c1614235217749100e</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        /**
         * <p>The status of the file upload task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The file upload task was initialized.</li>
         * <li><strong>PENDING</strong>: The file upload task waited to be run.</li>
         * <li><strong>BE_SCHEDULED</strong>: The file upload task waited to be scheduled.</li>
         * <li><strong>FAIL</strong>: The file upload task failed.</li>
         * <li><strong>SUCCESS</strong>: The file upload task was successful.</li>
         * <li><strong>RUNNING</strong>: The file upload task was being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The information about the status of the file upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("JobStatusDesc")
        public String jobStatusDesc;

        /**
         * <p>The information about the Object Storage Service (OSS) bucket from which the file is uploaded.</p>
         * <blockquote>
         * <p>This parameter is returned if the value of <strong>UploadType</strong> is <strong>OSS</strong>.</p>
         * </blockquote>
         */
        @NameInMap("UploadOSSParam")
        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam uploadOSSParam;

        /**
         * <p>The method used to upload the file. Valid values:</p>
         * <ul>
         * <li><strong>URL</strong></li>
         * <li><strong>OSS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("UploadType")
        public String uploadType;

        /**
         * <p>The URL of the file.</p>
         * <blockquote>
         * <p>This parameter is returned if the value of <strong>UploadType</strong> is <strong>URL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx/test.sql">http://xxxx/test.sql</a></p>
         */
        @NameInMap("UploadURL")
        public String uploadURL;

        /**
         * <p>The size of the uploaded file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>2968269</p>
         */
        @NameInMap("UploadedSize")
        public Long uploadedSize;

        public static GetUserUploadFileJobResponseBodyUploadFileJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetUserUploadFileJobResponseBodyUploadFileJobDetail self = new GetUserUploadFileJobResponseBodyUploadFileJobDetail();
            return TeaModel.build(map, self);
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setAttachmentKey(String attachmentKey) {
            this.attachmentKey = attachmentKey;
            return this;
        }
        public String getAttachmentKey() {
            return this.attachmentKey;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setFileSource(String fileSource) {
            this.fileSource = fileSource;
            return this;
        }
        public String getFileSource() {
            return this.fileSource;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setJobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }
        public String getJobKey() {
            return this.jobKey;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setJobStatusDesc(String jobStatusDesc) {
            this.jobStatusDesc = jobStatusDesc;
            return this;
        }
        public String getJobStatusDesc() {
            return this.jobStatusDesc;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setUploadOSSParam(GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam uploadOSSParam) {
            this.uploadOSSParam = uploadOSSParam;
            return this;
        }
        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam getUploadOSSParam() {
            return this.uploadOSSParam;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setUploadType(String uploadType) {
            this.uploadType = uploadType;
            return this;
        }
        public String getUploadType() {
            return this.uploadType;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setUploadURL(String uploadURL) {
            this.uploadURL = uploadURL;
            return this;
        }
        public String getUploadURL() {
            return this.uploadURL;
        }

        public GetUserUploadFileJobResponseBodyUploadFileJobDetail setUploadedSize(Long uploadedSize) {
            this.uploadedSize = uploadedSize;
            return this;
        }
        public Long getUploadedSize() {
            return this.uploadedSize;
        }

    }

}
