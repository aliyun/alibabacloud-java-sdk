// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniTaskResponseBody extends TeaModel {
    @NameInMap("CreateMiniTaskResult")
    public CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult createMiniTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeMiniTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniTaskResponseBody self = new CreateMcubeMiniTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniTaskResponseBody setCreateMiniTaskResult(CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult createMiniTaskResult) {
        this.createMiniTaskResult = createMiniTaskResult;
        return this;
    }
    public CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult getCreateMiniTaskResult() {
        return this.createMiniTaskResult;
    }

    public CreateMcubeMiniTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeMiniTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeMiniTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskId")
        public String miniTaskId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult self = new CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult setMiniTaskId(String miniTaskId) {
            this.miniTaskId = miniTaskId;
            return this;
        }
        public String getMiniTaskId() {
            return this.miniTaskId;
        }

        public CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeMiniTaskResponseBodyCreateMiniTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
