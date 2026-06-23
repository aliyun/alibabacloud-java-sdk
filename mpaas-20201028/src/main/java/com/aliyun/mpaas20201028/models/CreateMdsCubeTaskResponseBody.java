// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMdsCubeTaskResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMdsCubeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeTaskResponseBody self = new CreateMdsCubeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMdsCubeTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMdsCubeTaskResponseBody setResultContent(CreateMdsCubeTaskResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMdsCubeTaskResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMdsCubeTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMdsCubeTaskResponseBodyResultContentData extends TeaModel {
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

        public static CreateMdsCubeTaskResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeTaskResponseBodyResultContentData self = new CreateMdsCubeTaskResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeTaskResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMdsCubeTaskResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMdsCubeTaskResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMdsCubeTaskResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMdsCubeTaskResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateMdsCubeTaskResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateMdsCubeTaskResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static CreateMdsCubeTaskResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeTaskResponseBodyResultContent self = new CreateMdsCubeTaskResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeTaskResponseBodyResultContent setData(CreateMdsCubeTaskResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateMdsCubeTaskResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateMdsCubeTaskResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
