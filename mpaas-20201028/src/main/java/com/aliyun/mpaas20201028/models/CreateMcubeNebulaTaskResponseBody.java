// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaTaskResponseBody extends TeaModel {
    @NameInMap("CreateMcubeNebulaTaskResult")
    public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult createMcubeNebulaTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeNebulaTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaTaskResponseBody self = new CreateMcubeNebulaTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaTaskResponseBody setCreateMcubeNebulaTaskResult(CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult createMcubeNebulaTaskResult) {
        this.createMcubeNebulaTaskResult = createMcubeNebulaTaskResult;
        return this;
    }
    public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult getCreateMcubeNebulaTaskResult() {
        return this.createMcubeNebulaTaskResult;
    }

    public CreateMcubeNebulaTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeNebulaTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeNebulaTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("NebulaTaskId")
        public String nebulaTaskId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult self = new CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult setNebulaTaskId(String nebulaTaskId) {
            this.nebulaTaskId = nebulaTaskId;
            return this;
        }
        public String getNebulaTaskId() {
            return this.nebulaTaskId;
        }

        public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeNebulaTaskResponseBodyCreateMcubeNebulaTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
