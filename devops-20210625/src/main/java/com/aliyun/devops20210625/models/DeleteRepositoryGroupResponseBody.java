// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRepositoryGroupResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteRepositoryGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryGroupResponseBody self = new DeleteRepositoryGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRepositoryGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteRepositoryGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRepositoryGroupResponseBody setResult(DeleteRepositoryGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRepositoryGroupResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteRepositoryGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteRepositoryGroupResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static DeleteRepositoryGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRepositoryGroupResponseBodyResult self = new DeleteRepositoryGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRepositoryGroupResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
