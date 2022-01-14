// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsMiniprogramTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMdsMiniprogramTaskResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMdsMiniprogramTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsMiniprogramTaskResponseBody self = new CreateMdsMiniprogramTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMdsMiniprogramTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMdsMiniprogramTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMdsMiniprogramTaskResponseBody setResultContent(CreateMdsMiniprogramTaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMdsMiniprogramTaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMdsMiniprogramTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMdsMiniprogramTaskResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMdsMiniprogramTaskResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsMiniprogramTaskResponseBodyResultContentData self = new CreateMdsMiniprogramTaskResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateMdsMiniprogramTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateMdsMiniprogramTaskResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static CreateMdsMiniprogramTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsMiniprogramTaskResponseBodyResultContent self = new CreateMdsMiniprogramTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContent setData(CreateMdsMiniprogramTaskResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateMdsMiniprogramTaskResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateMdsMiniprogramTaskResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
