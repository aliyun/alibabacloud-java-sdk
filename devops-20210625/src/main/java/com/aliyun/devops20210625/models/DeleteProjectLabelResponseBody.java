// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectLabelResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteProjectLabelResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static DeleteProjectLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectLabelResponseBody self = new DeleteProjectLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectLabelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteProjectLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteProjectLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProjectLabelResponseBody setResult(DeleteProjectLabelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteProjectLabelResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteProjectLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteProjectLabelResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static DeleteProjectLabelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteProjectLabelResponseBodyResult self = new DeleteProjectLabelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteProjectLabelResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
