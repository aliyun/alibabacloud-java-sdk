// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistResponseBody extends TeaModel {
    @NameInMap("DeleteWhitelistResult")
    public DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult deleteWhitelistResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcubeWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistResponseBody self = new DeleteMcubeWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeWhitelistResponseBody setDeleteWhitelistResult(DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult deleteWhitelistResult) {
        this.deleteWhitelistResult = deleteWhitelistResult;
        return this;
    }
    public DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult getDeleteWhitelistResult() {
        return this.deleteWhitelistResult;
    }

    public DeleteMcubeWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcubeWhitelistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcubeWhitelistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult self = new DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult();
            return TeaModel.build(map, self);
        }

        public DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMcubeWhitelistResponseBodyDeleteWhitelistResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
