// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileResponseBody extends TeaModel {
    /**
     * <p>The execution result. The value <code>success</code> indicates that the operation is successful. Otherwise, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. This parameter is not returned if Code is <code>success</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The result of the move file operation.</p>
     */
    @NameInMap("MoveCdsFileModel")
    public MoveCdsFileResponseBodyMoveCdsFileModel moveCdsFileModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
    public Boolean success;

    public static MoveCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileResponseBody self = new MoveCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MoveCdsFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MoveCdsFileResponseBody setMoveCdsFileModel(MoveCdsFileResponseBodyMoveCdsFileModel moveCdsFileModel) {
        this.moveCdsFileModel = moveCdsFileModel;
        return this;
    }
    public MoveCdsFileResponseBodyMoveCdsFileModel getMoveCdsFileModel() {
        return this.moveCdsFileModel;
    }

    public MoveCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveCdsFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MoveCdsFileResponseBodyMoveCdsFileModel extends TeaModel {
        /**
         * <p>The asynchronous task ID. This field is not returned when a file is copied. When a folder is copied, the copy operation is performed asynchronously in the background, so this field is returned. You can call <a href="https://help.aliyun.com/document_detail/2357404.html">GetAsyncTask</a> and pass in this asynchronous task ID to obtain the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>fe307518-825a-4c8b-a69c-958f0e8a****</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <p>Indicates whether the file already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exist")
        public Boolean exist;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63636837e47e5a24a8a940218bef395c210e****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static MoveCdsFileResponseBodyMoveCdsFileModel build(java.util.Map<String, ?> map) throws Exception {
            MoveCdsFileResponseBodyMoveCdsFileModel self = new MoveCdsFileResponseBodyMoveCdsFileModel();
            return TeaModel.build(map, self);
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setExist(Boolean exist) {
            this.exist = exist;
            return this;
        }
        public Boolean getExist() {
            return this.exist;
        }

        public MoveCdsFileResponseBodyMoveCdsFileModel setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
