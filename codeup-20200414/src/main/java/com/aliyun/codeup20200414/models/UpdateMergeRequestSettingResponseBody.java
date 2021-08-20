// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestSettingResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public UpdateMergeRequestSettingResponseBodyResult result;

    public static UpdateMergeRequestSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestSettingResponseBody self = new UpdateMergeRequestSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestSettingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMergeRequestSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMergeRequestSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateMergeRequestSettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMergeRequestSettingResponseBody setResult(UpdateMergeRequestSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMergeRequestSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateMergeRequestSettingResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static UpdateMergeRequestSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMergeRequestSettingResponseBodyResult self = new UpdateMergeRequestSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMergeRequestSettingResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
