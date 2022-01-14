// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushReportResponseBody extends TeaModel {
    @NameInMap("PushResult")
    public PushReportResponseBodyPushResult pushResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static PushReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushReportResponseBody self = new PushReportResponseBody();
        return TeaModel.build(map, self);
    }

    public PushReportResponseBody setPushResult(PushReportResponseBodyPushResult pushResult) {
        this.pushResult = pushResult;
        return this;
    }
    public PushReportResponseBodyPushResult getPushResult() {
        return this.pushResult;
    }

    public PushReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushReportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushReportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class PushReportResponseBodyPushResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static PushReportResponseBodyPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushReportResponseBodyPushResult self = new PushReportResponseBodyPushResult();
            return TeaModel.build(map, self);
        }

        public PushReportResponseBodyPushResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public PushReportResponseBodyPushResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public PushReportResponseBodyPushResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
