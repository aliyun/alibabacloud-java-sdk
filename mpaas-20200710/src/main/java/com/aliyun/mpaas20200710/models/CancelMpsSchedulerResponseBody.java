// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CancelMpsSchedulerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CancelMpsSchedulerResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CancelMpsSchedulerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMpsSchedulerResponseBody self = new CancelMpsSchedulerResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMpsSchedulerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelMpsSchedulerResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelMpsSchedulerResponseBody setResultContent(CancelMpsSchedulerResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CancelMpsSchedulerResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CancelMpsSchedulerResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CancelMpsSchedulerResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public String success;

        public static CancelMpsSchedulerResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CancelMpsSchedulerResponseBodyResultContent self = new CancelMpsSchedulerResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CancelMpsSchedulerResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CancelMpsSchedulerResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CancelMpsSchedulerResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CancelMpsSchedulerResponseBodyResultContent setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
