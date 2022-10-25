// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteRepositoryTagResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteRepositoryTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagResponseBody self = new DeleteRepositoryTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryTagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryTagResponseBody setResult(DeleteRepositoryTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryTagResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryTagResponseBodyResult extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        public static DeleteRepositoryTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryTagResponseBodyResult self = new DeleteRepositoryTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryTagResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
