// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class MergeMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public MergeMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static MergeMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeMergeRequestResponseBody self = new MergeMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MergeMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MergeMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeMergeRequestResponseBody setResult(MergeMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MergeMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public MergeMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MergeMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static MergeMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MergeMergeRequestResponseBodyResult self = new MergeMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MergeMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
