// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class LogMsaQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public LogMsaQueryResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static LogMsaQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LogMsaQueryResponseBody self = new LogMsaQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public LogMsaQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LogMsaQueryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LogMsaQueryResponseBody setResultContent(LogMsaQueryResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public LogMsaQueryResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public LogMsaQueryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class LogMsaQueryResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static LogMsaQueryResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            LogMsaQueryResponseBodyResultContent self = new LogMsaQueryResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public LogMsaQueryResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public LogMsaQueryResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public LogMsaQueryResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public LogMsaQueryResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
