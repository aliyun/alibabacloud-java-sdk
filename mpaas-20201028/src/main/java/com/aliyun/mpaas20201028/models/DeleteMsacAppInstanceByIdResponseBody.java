// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacAppInstanceByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMsacAppInstanceByIdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMsacAppInstanceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacAppInstanceByIdResponseBody self = new DeleteMsacAppInstanceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMsacAppInstanceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMsacAppInstanceByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMsacAppInstanceByIdResponseBody setResultContent(DeleteMsacAppInstanceByIdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMsacAppInstanceByIdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMsacAppInstanceByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMsacAppInstanceByIdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMsacAppInstanceByIdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMsacAppInstanceByIdResponseBodyResultContent self = new DeleteMsacAppInstanceByIdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMsacAppInstanceByIdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMsacAppInstanceByIdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMsacAppInstanceByIdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMsacAppInstanceByIdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
