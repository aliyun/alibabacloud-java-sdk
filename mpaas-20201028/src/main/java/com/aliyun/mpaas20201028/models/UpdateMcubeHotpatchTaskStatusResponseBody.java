// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMcubeHotpatchTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdateHotpatchTaskStatusResult")
    public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult updateHotpatchTaskStatusResult;

    public static UpdateMcubeHotpatchTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeHotpatchTaskStatusResponseBody self = new UpdateMcubeHotpatchTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeHotpatchTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMcubeHotpatchTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMcubeHotpatchTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateMcubeHotpatchTaskStatusResponseBody setUpdateHotpatchTaskStatusResult(UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult updateHotpatchTaskStatusResult) {
        this.updateHotpatchTaskStatusResult = updateHotpatchTaskStatusResult;
        return this;
    }
    public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult getUpdateHotpatchTaskStatusResult() {
        return this.updateHotpatchTaskStatusResult;
    }

    public static class UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Result")
        public String result;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult self = new UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult();
            return TeaModel.build(map, self);
        }

        public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public UpdateMcubeHotpatchTaskStatusResponseBodyUpdateHotpatchTaskStatusResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
