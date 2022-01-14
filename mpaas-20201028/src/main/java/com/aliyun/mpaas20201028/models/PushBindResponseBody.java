// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBindResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushBindResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushBindResponseBody self = new PushBindResponseBody();
        return TeaModel.build(map, self);
    }

    public PushBindResponseBody setPushResult(PushBindResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushBindResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushBindResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushBindResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushBindResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushBindResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushBindResponseBodyPushResult self = new PushBindResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushBindResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushBindResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushBindResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
