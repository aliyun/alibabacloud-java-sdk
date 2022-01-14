// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMsacStageByIdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMsacStageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageByIdResponseBody self = new DeleteMsacStageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMsacStageByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMsacStageByIdResponseBody setResultContent(DeleteMsacStageByIdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMsacStageByIdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMsacStageByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMsacStageByIdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMsacStageByIdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMsacStageByIdResponseBodyResultContent self = new DeleteMsacStageByIdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMsacStageByIdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMsacStageByIdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMsacStageByIdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMsacStageByIdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
