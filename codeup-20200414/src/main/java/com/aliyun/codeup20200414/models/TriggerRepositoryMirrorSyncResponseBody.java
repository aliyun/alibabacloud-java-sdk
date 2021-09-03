// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponseBody extends TeaModel {
    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 请求结果
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 响应结果
    @NameInMap("Result")
    public TriggerRepositoryMirrorSyncResponseBodyResult result;

    public static TriggerRepositoryMirrorSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerRepositoryMirrorSyncResponseBody self = new TriggerRepositoryMirrorSyncResponseBody();
        return TeaModel.build(map, self);
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

    public TriggerRepositoryMirrorSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TriggerRepositoryMirrorSyncResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TriggerRepositoryMirrorSyncResponseBody setResult(TriggerRepositoryMirrorSyncResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public TriggerRepositoryMirrorSyncResponseBodyResult getResult() {
        return this.result;
    }

    public static class TriggerRepositoryMirrorSyncResponseBodyResult extends TeaModel {
        // 仓库同步触发结果
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
