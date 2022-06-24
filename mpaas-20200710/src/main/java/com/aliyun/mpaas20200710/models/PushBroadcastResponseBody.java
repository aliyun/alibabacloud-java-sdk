// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class PushBroadcastResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushBroadcastResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushBroadcastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushBroadcastResponseBody self = new PushBroadcastResponseBody();
        return TeaModel.build(map, self);
    }

    public PushBroadcastResponseBody setPushResult(PushBroadcastResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushBroadcastResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushBroadcastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushBroadcastResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushBroadcastResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushBroadcastResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushBroadcastResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushBroadcastResponseBodyPushResult self = new PushBroadcastResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushBroadcastResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushBroadcastResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushBroadcastResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
