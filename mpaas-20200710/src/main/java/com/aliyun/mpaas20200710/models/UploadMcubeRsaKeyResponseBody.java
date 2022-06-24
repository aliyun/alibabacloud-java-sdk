// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UploadRsaResult")
    public UploadMcubeRsaKeyResponseBodyUploadRsaResult uploadRsaResult;

    public static UploadMcubeRsaKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeRsaKeyResponseBody self = new UploadMcubeRsaKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMcubeRsaKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMcubeRsaKeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadMcubeRsaKeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UploadMcubeRsaKeyResponseBody setUploadRsaResult(UploadMcubeRsaKeyResponseBodyUploadRsaResult uploadRsaResult) {
        this.uploadRsaResult = uploadRsaResult;
        return this;
    }
    public UploadMcubeRsaKeyResponseBodyUploadRsaResult getUploadRsaResult() {
        return this.uploadRsaResult;
    }

    public static class UploadMcubeRsaKeyResponseBodyUploadRsaResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static UploadMcubeRsaKeyResponseBodyUploadRsaResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeRsaKeyResponseBodyUploadRsaResult self = new UploadMcubeRsaKeyResponseBodyUploadRsaResult();
            return TeaModel.build(map, self);
        }

        public UploadMcubeRsaKeyResponseBodyUploadRsaResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UploadMcubeRsaKeyResponseBodyUploadRsaResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public UploadMcubeRsaKeyResponseBodyUploadRsaResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
