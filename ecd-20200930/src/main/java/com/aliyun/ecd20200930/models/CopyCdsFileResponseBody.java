// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileResponseBody extends TeaModel {
    /**
     * <p>The execution result. A value of <code>success</code> indicates success. Otherwise, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of copying the file.</p>
     */
    @NameInMap("CopyCdsFileModel")
    public CopyCdsFileResponseBodyCopyCdsFileModel copyCdsFileModel;

    /**
     * <p>The error message. This parameter is not returned if Code is <code>success</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93AD30C1-16B8-5C54-AD23-A51FF53F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CopyCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCdsFileResponseBody self = new CopyCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCdsFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CopyCdsFileResponseBody setCopyCdsFileModel(CopyCdsFileResponseBodyCopyCdsFileModel copyCdsFileModel) {
        this.copyCdsFileModel = copyCdsFileModel;
        return this;
    }
    public CopyCdsFileResponseBodyCopyCdsFileModel getCopyCdsFileModel() {
        return this.copyCdsFileModel;
    }

    public CopyCdsFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CopyCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyCdsFileResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CopyCdsFileResponseBodyCopyCdsFileModel extends TeaModel {
        /**
         * <p>The asynchronous task ID. This field is not returned when a file is copied. When a folder is copied, the copy operation is performed asynchronously in the background, so this field is returned. You can call <a href="https://help.aliyun.com/document_detail/2357404.html">GetAsyncTask</a> and pass in this asynchronous task ID to obtain the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>4221bf6e6ab43a255edc4463bffa6f5f5d31****</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <p>The ID of the new file or folder after the copy operation.</p>
         * 
         * <strong>example:</strong>
         * <p>6400727cb878821bcb414615a609b4072463****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static CopyCdsFileResponseBodyCopyCdsFileModel build(java.util.Map<String, ?> map) throws Exception {
            CopyCdsFileResponseBodyCopyCdsFileModel self = new CopyCdsFileResponseBodyCopyCdsFileModel();
            return TeaModel.build(map, self);
        }

        public CopyCdsFileResponseBodyCopyCdsFileModel setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public CopyCdsFileResponseBodyCopyCdsFileModel setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
