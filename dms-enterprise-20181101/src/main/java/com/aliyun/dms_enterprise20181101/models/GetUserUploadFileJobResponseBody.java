// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The key of the file that is returned after the file is uploaded. You can use this key when you upload the file as an attachment in a ticket.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The endpoint of the OSS bucket.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The size of the file. Unit: byte.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the OSS bucket.</p>
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
         * <p>The information about the Object Storage Service (OSS) bucket from which the file is uploaded.</p>
         * <br>
         * <p>>  This parameter is returned if the **UploadType** parameter is set to **OSS**.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The URL of the file.</p>
         * <br>
         * <p>>  This parameter is returned if the **UploadType** parameter is set to **URL**.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The ID of the request.</p>
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
        @NameInMap("AttachmentKey")
        public String attachmentKey;

        /**
         * <p>The key of the file upload task. You can call the [CreateUploadFileJob](~~206059~~) or [CreateUploadOSSFileJob](~~206060~~) operation to query the key.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>-1</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The information about the status of the file upload task.</p>
         */
        @NameInMap("FileSource")
        public String fileSource;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("JobKey")
        public String jobKey;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("JobStatusDesc")
        public String jobStatusDesc;

        /**
         * <p>The size of the uploaded file. Unit: byte.</p>
         */
        @NameInMap("UploadOSSParam")
        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam uploadOSSParam;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("UploadType")
        public String uploadType;

        /**
         * <p>The purpose of the uploaded file. Valid values:</p>
         * <br>
         * <p>*   **datacorrect**: The file is uploaded to change data.</p>
         * <p>*   **order_info_attachment**: The file is uploaded as an attachment in a ticket.</p>
         * <p>*   **big-file**: The file is uploaded to import multiple data records at a time.</p>
         * <p>*   **sqlreview**: The file is uploaded for SQL review.</p>
         */
        @NameInMap("UploadURL")
        public String uploadURL;

        /**
         * <p>The key of the file upload task.</p>
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
