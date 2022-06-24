// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ExistMcubeRsaKeyResponseBody extends TeaModel {
    @NameInMap("CheckRsaKeyResult")
    public ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult checkRsaKeyResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ExistMcubeRsaKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExistMcubeRsaKeyResponseBody self = new ExistMcubeRsaKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExistMcubeRsaKeyResponseBody setCheckRsaKeyResult(ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult checkRsaKeyResult) {
        this.checkRsaKeyResult = checkRsaKeyResult;
        return this;
    }
    public ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult getCheckRsaKeyResult() {
        return this.checkRsaKeyResult;
    }

    public ExistMcubeRsaKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExistMcubeRsaKeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExistMcubeRsaKeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult build(java.util.Map<String, ?> map) throws Exception {
            ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult self = new ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult();
            return TeaModel.build(map, self);
        }

        public ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ExistMcubeRsaKeyResponseBodyCheckRsaKeyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
