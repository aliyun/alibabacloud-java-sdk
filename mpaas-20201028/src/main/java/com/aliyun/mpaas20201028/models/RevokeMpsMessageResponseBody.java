// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsMessageResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public RevokeMpsMessageResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RevokeMpsMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsMessageResponseBody self = new RevokeMpsMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeMpsMessageResponseBody setPushResult(RevokeMpsMessageResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public RevokeMpsMessageResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public RevokeMpsMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeMpsMessageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RevokeMpsMessageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class RevokeMpsMessageResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static RevokeMpsMessageResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            RevokeMpsMessageResponseBodyPushResult self = new RevokeMpsMessageResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public RevokeMpsMessageResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RevokeMpsMessageResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public RevokeMpsMessageResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
