// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ChangeMcubePublicTaskStatusResponseBody extends TeaModel {
    @NameInMap("ChangeResult")
    public ChangeMcubePublicTaskStatusResponseBodyChangeResult changeResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ChangeMcubePublicTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubePublicTaskStatusResponseBody self = new ChangeMcubePublicTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMcubePublicTaskStatusResponseBody setChangeResult(ChangeMcubePublicTaskStatusResponseBodyChangeResult changeResult) {
        this.changeResult = changeResult;
        return this;
    }
    public ChangeMcubePublicTaskStatusResponseBodyChangeResult getChangeResult() {
        return this.changeResult;
    }

    public ChangeMcubePublicTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMcubePublicTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChangeMcubePublicTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ChangeMcubePublicTaskStatusResponseBodyChangeResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ChangeMcubePublicTaskStatusResponseBodyChangeResult build(java.util.Map<String, ?> map) throws Exception {
            ChangeMcubePublicTaskStatusResponseBodyChangeResult self = new ChangeMcubePublicTaskStatusResponseBodyChangeResult();
            return TeaModel.build(map, self);
        }

        public ChangeMcubePublicTaskStatusResponseBodyChangeResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ChangeMcubePublicTaskStatusResponseBodyChangeResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChangeMcubePublicTaskStatusResponseBodyChangeResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ChangeMcubePublicTaskStatusResponseBodyChangeResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
