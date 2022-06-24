// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistResponseBody extends TeaModel {
    @NameInMap("CreateWhitelistResult")
    public CreateMcubeWhitelistResponseBodyCreateWhitelistResult createWhitelistResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistResponseBody self = new CreateMcubeWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistResponseBody setCreateWhitelistResult(CreateMcubeWhitelistResponseBodyCreateWhitelistResult createWhitelistResult) {
        this.createWhitelistResult = createWhitelistResult;
        return this;
    }
    public CreateMcubeWhitelistResponseBodyCreateWhitelistResult getCreateWhitelistResult() {
        return this.createWhitelistResult;
    }

    public CreateMcubeWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeWhitelistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeWhitelistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeWhitelistResponseBodyCreateWhitelistResult extends TeaModel {
        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("WhitelistId")
        public String whitelistId;

        public static CreateMcubeWhitelistResponseBodyCreateWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeWhitelistResponseBodyCreateWhitelistResult self = new CreateMcubeWhitelistResponseBodyCreateWhitelistResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeWhitelistResponseBodyCreateWhitelistResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeWhitelistResponseBodyCreateWhitelistResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateMcubeWhitelistResponseBodyCreateWhitelistResult setWhitelistId(String whitelistId) {
            this.whitelistId = whitelistId;
            return this;
        }
        public String getWhitelistId() {
            return this.whitelistId;
        }

    }

}
