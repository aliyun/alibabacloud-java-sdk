// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushSimpleResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushSimpleResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushSimpleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleResponseBody self = new PushSimpleResponseBody();
        return TeaModel.build(map, self);
    }

    public PushSimpleResponseBody setPushResult(PushSimpleResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushSimpleResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushSimpleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushSimpleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushSimpleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushSimpleResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushSimpleResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushSimpleResponseBodyPushResult self = new PushSimpleResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushSimpleResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushSimpleResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushSimpleResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
