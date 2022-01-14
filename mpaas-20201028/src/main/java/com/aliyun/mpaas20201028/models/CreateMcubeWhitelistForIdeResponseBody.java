// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeResponseBody extends TeaModel {
    @NameInMap("CreateWhitelistForIdeResult")
    public CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult createWhitelistForIdeResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeWhitelistForIdeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistForIdeResponseBody self = new CreateMcubeWhitelistForIdeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistForIdeResponseBody setCreateWhitelistForIdeResult(CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult createWhitelistForIdeResult) {
        this.createWhitelistForIdeResult = createWhitelistForIdeResult;
        return this;
    }
    public CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult getCreateWhitelistForIdeResult() {
        return this.createWhitelistForIdeResult;
    }

    public CreateMcubeWhitelistForIdeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeWhitelistForIdeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeWhitelistForIdeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult extends TeaModel {
        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("WhitelistId")
        public String whitelistId;

        public static CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult self = new CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateMcubeWhitelistForIdeResponseBodyCreateWhitelistForIdeResult setWhitelistId(String whitelistId) {
            this.whitelistId = whitelistId;
            return this;
        }
        public String getWhitelistId() {
            return this.whitelistId;
        }

    }

}
