// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class PushTemplateResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushTemplateResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushTemplateResponseBody self = new PushTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public PushTemplateResponseBody setPushResult(PushTemplateResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushTemplateResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushTemplateResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushTemplateResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushTemplateResponseBodyPushResult self = new PushTemplateResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushTemplateResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushTemplateResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushTemplateResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
