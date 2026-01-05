// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class FileUploadCallbackResponseBody extends TeaModel {
    @NameInMap("Data")
    public FileUploadCallbackResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>841BC14F-8E21-56B0-A7D6-593C5841AC84</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FileUploadCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileUploadCallbackResponseBody self = new FileUploadCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public FileUploadCallbackResponseBody setData(FileUploadCallbackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FileUploadCallbackResponseBodyData getData() {
        return this.data;
    }

    public FileUploadCallbackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FileUploadCallbackResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FileUploadCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FileUploadCallbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FileUploadCallbackResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static FileUploadCallbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FileUploadCallbackResponseBodyData self = new FileUploadCallbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FileUploadCallbackResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
