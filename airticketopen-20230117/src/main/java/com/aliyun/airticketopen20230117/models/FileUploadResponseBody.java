// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FileUploadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public FileUploadResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static FileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileUploadResponseBody self = new FileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public FileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FileUploadResponseBody setData(FileUploadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FileUploadResponseBodyData getData() {
        return this.data;
    }

    public FileUploadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FileUploadResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public FileUploadResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public FileUploadResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public FileUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FileUploadResponseBodyData extends TeaModel {
        @NameInMap("uploaded_file_url")
        public String uploadedFileUrl;

        public static FileUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FileUploadResponseBodyData self = new FileUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FileUploadResponseBodyData setUploadedFileUrl(String uploadedFileUrl) {
            this.uploadedFileUrl = uploadedFileUrl;
            return this;
        }
        public String getUploadedFileUrl() {
            return this.uploadedFileUrl;
        }

    }

}
