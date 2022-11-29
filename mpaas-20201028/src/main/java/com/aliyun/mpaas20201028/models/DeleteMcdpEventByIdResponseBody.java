// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMcdpEventByIdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcdpEventByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventByIdResponseBody self = new DeleteMcdpEventByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcdpEventByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcdpEventByIdResponseBody setResultContent(DeleteMcdpEventByIdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMcdpEventByIdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMcdpEventByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcdpEventByIdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcdpEventByIdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcdpEventByIdResponseBodyResultContent self = new DeleteMcdpEventByIdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMcdpEventByIdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMcdpEventByIdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMcdpEventByIdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMcdpEventByIdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
