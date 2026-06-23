// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchRollbackTaskResponseBody extends TeaModel {
    @NameInMap("CreateHotpatchRollbackTaskResult")
    public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult createHotpatchRollbackTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeHotpatchRollbackTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchRollbackTaskResponseBody self = new CreateMcubeHotpatchRollbackTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchRollbackTaskResponseBody setCreateHotpatchRollbackTaskResult(CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult createHotpatchRollbackTaskResult) {
        this.createHotpatchRollbackTaskResult = createHotpatchRollbackTaskResult;
        return this;
    }
    public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult getCreateHotpatchRollbackTaskResult() {
        return this.createHotpatchRollbackTaskResult;
    }

    public CreateMcubeHotpatchRollbackTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeHotpatchRollbackTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeHotpatchRollbackTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("RollbackTaskId")
        public String rollbackTaskId;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult self = new CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult setRollbackTaskId(String rollbackTaskId) {
            this.rollbackTaskId = rollbackTaskId;
            return this;
        }
        public String getRollbackTaskId() {
            return this.rollbackTaskId;
        }

        public CreateMcubeHotpatchRollbackTaskResponseBodyCreateHotpatchRollbackTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
