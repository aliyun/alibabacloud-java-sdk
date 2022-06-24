// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class RevokePushMessageResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public RevokePushMessageResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RevokePushMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokePushMessageResponseBody self = new RevokePushMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokePushMessageResponseBody setPushResult(RevokePushMessageResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public RevokePushMessageResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public RevokePushMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokePushMessageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RevokePushMessageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class RevokePushMessageResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static RevokePushMessageResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            RevokePushMessageResponseBodyPushResult self = new RevokePushMessageResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public RevokePushMessageResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RevokePushMessageResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public RevokePushMessageResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
