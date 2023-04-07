// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MoveCdsFileModel")
    public MoveCdsFileResponseBodyMoveCdsFileModel moveCdsFileModel;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        @NameInMap("Exist")
        public Boolean exist;

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
