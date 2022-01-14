// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpCrowdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMcdpCrowdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcdpCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpCrowdResponseBody self = new DeleteMcdpCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcdpCrowdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcdpCrowdResponseBody setResultContent(DeleteMcdpCrowdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMcdpCrowdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMcdpCrowdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcdpCrowdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcdpCrowdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcdpCrowdResponseBodyResultContent self = new DeleteMcdpCrowdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMcdpCrowdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMcdpCrowdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMcdpCrowdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMcdpCrowdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
