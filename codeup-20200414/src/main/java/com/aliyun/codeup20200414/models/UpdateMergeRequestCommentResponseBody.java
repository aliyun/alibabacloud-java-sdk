// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestCommentResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public UpdateMergeRequestCommentResponseBodyResult result;

    public static UpdateMergeRequestCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestCommentResponseBody self = new UpdateMergeRequestCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestCommentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMergeRequestCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMergeRequestCommentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateMergeRequestCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMergeRequestCommentResponseBody setResult(UpdateMergeRequestCommentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMergeRequestCommentResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateMergeRequestCommentResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static UpdateMergeRequestCommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestCommentResponseBodyResult self = new UpdateMergeRequestCommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestCommentResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
