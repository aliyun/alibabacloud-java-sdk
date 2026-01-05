// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteFileUploadResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteFileUploadResponseBodyData data;

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
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteFileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileUploadResponseBody self = new DeleteFileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileUploadResponseBody setData(DeleteFileUploadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteFileUploadResponseBodyData getData() {
        return this.data;
    }

    public DeleteFileUploadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteFileUploadResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteFileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFileUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteFileUploadResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static DeleteFileUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteFileUploadResponseBodyData self = new DeleteFileUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteFileUploadResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
