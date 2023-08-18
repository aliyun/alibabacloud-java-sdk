// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ReopenMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ReopenMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static ReopenMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReopenMergeRequestResponseBody self = new ReopenMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ReopenMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReopenMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReopenMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReopenMergeRequestResponseBody setResult(ReopenMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReopenMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public ReopenMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReopenMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static ReopenMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReopenMergeRequestResponseBodyResult self = new ReopenMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReopenMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
