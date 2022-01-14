// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubeNebulaTaskStatusResponseBody extends TeaModel {
    @NameInMap("ChangeMcubeNebulaTaskStatusResult")
    public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ChangeMcubeNebulaTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeNebulaTaskStatusResponseBody self = new ChangeMcubeNebulaTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeNebulaTaskStatusResponseBody setChangeMcubeNebulaTaskStatusResult(ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult) {
        this.changeMcubeNebulaTaskStatusResult = changeMcubeNebulaTaskStatusResult;
        return this;
    }
    public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult getChangeMcubeNebulaTaskStatusResult() {
        return this.changeMcubeNebulaTaskStatusResult;
    }

    public ChangeMcubeNebulaTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMcubeNebulaTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChangeMcubeNebulaTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult build(java.util.Map<String, ?> map) throws Exception {
            ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult self = new ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult();
            return TeaModel.build(map, self);
        }

        public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ChangeMcubeNebulaTaskStatusResponseBodyChangeMcubeNebulaTaskStatusResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
