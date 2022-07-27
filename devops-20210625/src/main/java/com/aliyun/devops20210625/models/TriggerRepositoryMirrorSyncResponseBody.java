// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public TriggerRepositoryMirrorSyncResponseBodyResult result;

    @NameInMap("success")
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
        @NameInMap("result")
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
