// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RunMsaDiffResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public RunMsaDiffResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static RunMsaDiffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMsaDiffResponseBody self = new RunMsaDiffResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMsaDiffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunMsaDiffResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RunMsaDiffResponseBody setResultContent(RunMsaDiffResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public RunMsaDiffResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public RunMsaDiffResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class RunMsaDiffResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static RunMsaDiffResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            RunMsaDiffResponseBodyResultContent self = new RunMsaDiffResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public RunMsaDiffResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunMsaDiffResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RunMsaDiffResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RunMsaDiffResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
