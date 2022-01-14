// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsTaskResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public RevokeMpsTaskResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RevokeMpsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsTaskResponseBody self = new RevokeMpsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeMpsTaskResponseBody setPushResult(RevokeMpsTaskResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public RevokeMpsTaskResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public RevokeMpsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeMpsTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RevokeMpsTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class RevokeMpsTaskResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static RevokeMpsTaskResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            RevokeMpsTaskResponseBodyPushResult self = new RevokeMpsTaskResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public RevokeMpsTaskResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RevokeMpsTaskResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public RevokeMpsTaskResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
