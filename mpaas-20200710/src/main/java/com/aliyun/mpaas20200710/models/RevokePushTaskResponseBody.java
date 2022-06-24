// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class RevokePushTaskResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public RevokePushTaskResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RevokePushTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokePushTaskResponseBody self = new RevokePushTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokePushTaskResponseBody setPushResult(RevokePushTaskResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public RevokePushTaskResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public RevokePushTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokePushTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RevokePushTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class RevokePushTaskResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static RevokePushTaskResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            RevokePushTaskResponseBodyPushResult self = new RevokePushTaskResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public RevokePushTaskResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RevokePushTaskResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public RevokePushTaskResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
