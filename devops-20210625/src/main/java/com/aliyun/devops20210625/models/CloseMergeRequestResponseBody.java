// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CloseMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CloseMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CloseMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseMergeRequestResponseBody self = new CloseMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CloseMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CloseMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseMergeRequestResponseBody setResult(CloseMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloseMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public CloseMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CloseMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static CloseMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloseMergeRequestResponseBodyResult self = new CloseMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloseMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
