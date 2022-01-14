// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushUnBindResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushUnBindResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushUnBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushUnBindResponseBody self = new PushUnBindResponseBody();
        return TeaModel.build(map, self);
    }

    public PushUnBindResponseBody setPushResult(PushUnBindResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushUnBindResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushUnBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushUnBindResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushUnBindResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushUnBindResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushUnBindResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushUnBindResponseBodyPushResult self = new PushUnBindResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushUnBindResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushUnBindResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushUnBindResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
