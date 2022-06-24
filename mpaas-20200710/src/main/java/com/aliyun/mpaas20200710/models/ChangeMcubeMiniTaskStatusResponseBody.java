// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusResponseBody extends TeaModel {
    @NameInMap("ChangeMiniTaskStatusResult")
    public ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult changeMiniTaskStatusResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ChangeMcubeMiniTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusResponseBody self = new ChangeMcubeMiniTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeMiniTaskStatusResponseBody setChangeMiniTaskStatusResult(ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult changeMiniTaskStatusResult) {
        this.changeMiniTaskStatusResult = changeMiniTaskStatusResult;
        return this;
    }
    public ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult getChangeMiniTaskStatusResult() {
        return this.changeMiniTaskStatusResult;
    }

    public ChangeMcubeMiniTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMcubeMiniTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChangeMcubeMiniTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult build(java.util.Map<String, ?> map) throws Exception {
            ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult self = new ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult();
            return TeaModel.build(map, self);
        }

        public ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ChangeMcubeMiniTaskStatusResponseBodyChangeMiniTaskStatusResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
