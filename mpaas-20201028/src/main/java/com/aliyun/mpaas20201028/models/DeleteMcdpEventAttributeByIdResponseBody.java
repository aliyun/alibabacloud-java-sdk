// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventAttributeByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMcdpEventAttributeByIdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcdpEventAttributeByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventAttributeByIdResponseBody self = new DeleteMcdpEventAttributeByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventAttributeByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcdpEventAttributeByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcdpEventAttributeByIdResponseBody setResultContent(DeleteMcdpEventAttributeByIdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMcdpEventAttributeByIdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMcdpEventAttributeByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcdpEventAttributeByIdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcdpEventAttributeByIdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcdpEventAttributeByIdResponseBodyResultContent self = new DeleteMcdpEventAttributeByIdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMcdpEventAttributeByIdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMcdpEventAttributeByIdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMcdpEventAttributeByIdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMcdpEventAttributeByIdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
