// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 响应结果
    @NameInMap("result")
    public TriggerRepositoryMirrorSyncResponseBodyResult result;

    // 请求结果
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
        // 仓库同步触发结果
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
