// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Endpoint")
        public String endpoint;

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

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FileSource")
        public String fileSource;

        @NameInMap("JobKey")
        public String jobKey;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("JobStatusDesc")
        public String jobStatusDesc;

        @NameInMap("UploadOSSParam")
        public GetUserUploadFileJobResponseBodyUploadFileJobDetailUploadOSSParam uploadOSSParam;

        @NameInMap("UploadType")
        public String uploadType;

        @NameInMap("UploadURL")
        public String uploadURL;

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
