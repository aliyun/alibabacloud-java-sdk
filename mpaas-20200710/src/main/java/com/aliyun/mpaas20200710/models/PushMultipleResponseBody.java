// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class PushMultipleResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushMultipleResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushMultipleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMultipleResponseBody self = new PushMultipleResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMultipleResponseBody setPushResult(PushMultipleResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushMultipleResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushMultipleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMultipleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushMultipleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushMultipleResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushMultipleResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushMultipleResponseBodyPushResult self = new PushMultipleResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushMultipleResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushMultipleResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushMultipleResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
