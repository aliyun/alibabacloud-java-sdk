// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageInstanceByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMsacStageInstanceByIdResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMsacStageInstanceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageInstanceByIdResponseBody self = new DeleteMsacStageInstanceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageInstanceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMsacStageInstanceByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMsacStageInstanceByIdResponseBody setResultContent(DeleteMsacStageInstanceByIdResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMsacStageInstanceByIdResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMsacStageInstanceByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMsacStageInstanceByIdResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMsacStageInstanceByIdResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMsacStageInstanceByIdResponseBodyResultContent self = new DeleteMsacStageInstanceByIdResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMsacStageInstanceByIdResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteMsacStageInstanceByIdResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMsacStageInstanceByIdResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteMsacStageInstanceByIdResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
