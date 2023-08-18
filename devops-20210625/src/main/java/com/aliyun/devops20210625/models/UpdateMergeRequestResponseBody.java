// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateMergeRequestResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateMergeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestResponseBody self = new UpdateMergeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMergeRequestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMergeRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMergeRequestResponseBody setResult(UpdateMergeRequestResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMergeRequestResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMergeRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMergeRequestResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public Boolean result;

        public static UpdateMergeRequestResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestResponseBodyResult self = new UpdateMergeRequestResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
