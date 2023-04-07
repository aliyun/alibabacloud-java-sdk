// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CopyCdsFileModel")
    public CopyCdsFileResponseBodyCopyCdsFileModel copyCdsFileModel;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

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
