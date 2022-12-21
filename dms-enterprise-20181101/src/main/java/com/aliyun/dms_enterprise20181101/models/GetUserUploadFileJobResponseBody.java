// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    @NameInMap("Success")
    public Boolean success;

    // The details of the file upload task.
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
        // The name of the OSS bucket.
        @NameInMap("BucketName")
        public String bucketName;

        // The endpoint of the OSS bucket.
        @NameInMap("Endpoint")
        public String endpoint;

        // The name of the OSS object.
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
        // The key of the file that is returned after the file is uploaded. You can use this key when you upload the file as an attachment in a ticket.
        @NameInMap("AttachmentKey")
        public String attachmentKey;

        // The name of the file.
        @NameInMap("FileName")
        public String fileName;

        // The size of the file. Unit: byte.
        @NameInMap("FileSize")
        public Long fileSize;

        // The purpose of the uploaded file. Valid values:
        // 
        // *   **datacorrect**: The file is uploaded to change data.
        // *   **order_info_attachment**: The file is uploaded as an attachment in a ticket.
        // *   **big-file**: The file is uploaded to import multiple data records at a time.
        // *   **sqlreview**: The file is uploaded for SQL review.
        @NameInMap("FileSource")
        public String fileSource;

        // The key of the file upload task.
        @NameInMap("JobKey")
        public String jobKey;

        // The status of the file upload task. Valid values:
        // 
        // *   **INIT**: The task was initialized.
        // *   **PENDING**: The task waited to be run.
        // *   **BE_SCHEDULED**: The task waited to be scheduled.
        // *   **FAIL**: The task failed.
        // *   **SUCCESS**: The task was run as expected.
        // *   **RUNNING**: The task was being run.
        @NameInMap("JobStatus")
        public String jobStatus;

        // The information about the status of the file upload task.
        @NameInMap("JobStatusDesc")
        public String jobStatusDesc;

        // The information about the Object Storage Service (OSS) bucket from which the file is uploaded.
        // 
        // >  This parameter is returned if the **UploadType** parameter is set to **OSS**.
        @NameInMap("UploadOSSParam")
        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam uploadOSSParam;

        // The method used to upload the file. Valid values:
        // 
        // *   **URL**
        // *   **OSS**
        @NameInMap("UploadType")
        public String uploadType;

        // The URL of the file.
        // 
        // >  This parameter is returned if the **UploadType** parameter is set to **URL**.
        @NameInMap("UploadURL")
        public String uploadURL;

        // The size of the uploaded file. Unit: byte.
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
