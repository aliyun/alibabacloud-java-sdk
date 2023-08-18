// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReviewMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ReviewMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static ReviewMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReviewMergeRequestResponseBody self = new ReviewMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ReviewMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReviewMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReviewMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReviewMergeRequestResponseBody setResult(ReviewMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReviewMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public ReviewMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReviewMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static ReviewMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReviewMergeRequestResponseBodyResult self = new ReviewMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReviewMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
