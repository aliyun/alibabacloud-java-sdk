// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public TriggerRepositoryMirrorSyncResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static TriggerRepositoryMirrorSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerRepositoryMirrorSyncResponseBody self = new TriggerRepositoryMirrorSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerRepositoryMirrorSyncResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TriggerRepositoryMirrorSyncResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TriggerRepositoryMirrorSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerRepositoryMirrorSyncResponseBody setResult(TriggerRepositoryMirrorSyncResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public TriggerRepositoryMirrorSyncResponseBodyResult getResult() {
        return this.result;
    }

    public TriggerRepositoryMirrorSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TriggerRepositoryMirrorSyncResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static TriggerRepositoryMirrorSyncResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            TriggerRepositoryMirrorSyncResponseBodyResult self = new TriggerRepositoryMirrorSyncResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public TriggerRepositoryMirrorSyncResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
