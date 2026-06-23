// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMdsCubeTemplateResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMdsCubeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeTemplateResponseBody self = new CreateMdsCubeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMdsCubeTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMdsCubeTemplateResponseBody setResultContent(CreateMdsCubeTemplateResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMdsCubeTemplateResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMdsCubeTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMdsCubeTemplateResponseBodyResultContentData extends TeaModel {
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

        public static CreateMdsCubeTemplateResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeTemplateResponseBodyResultContentData self = new CreateMdsCubeTemplateResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeTemplateResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMdsCubeTemplateResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMdsCubeTemplateResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMdsCubeTemplateResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMdsCubeTemplateResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateMdsCubeTemplateResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateMdsCubeTemplateResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static CreateMdsCubeTemplateResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeTemplateResponseBodyResultContent self = new CreateMdsCubeTemplateResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeTemplateResponseBodyResultContent setData(CreateMdsCubeTemplateResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateMdsCubeTemplateResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateMdsCubeTemplateResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
