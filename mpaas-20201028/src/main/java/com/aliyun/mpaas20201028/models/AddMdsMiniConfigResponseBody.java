// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class AddMdsMiniConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public AddMdsMiniConfigResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static AddMdsMiniConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMdsMiniConfigResponseBody self = new AddMdsMiniConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMdsMiniConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMdsMiniConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddMdsMiniConfigResponseBody setResultContent(AddMdsMiniConfigResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public AddMdsMiniConfigResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public AddMdsMiniConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class AddMdsMiniConfigResponseBodyResultContentData extends TeaModel {
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

        public static AddMdsMiniConfigResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            AddMdsMiniConfigResponseBodyResultContentData self = new AddMdsMiniConfigResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public AddMdsMiniConfigResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddMdsMiniConfigResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddMdsMiniConfigResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public AddMdsMiniConfigResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public AddMdsMiniConfigResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class AddMdsMiniConfigResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public AddMdsMiniConfigResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static AddMdsMiniConfigResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            AddMdsMiniConfigResponseBodyResultContent self = new AddMdsMiniConfigResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public AddMdsMiniConfigResponseBodyResultContent setData(AddMdsMiniConfigResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public AddMdsMiniConfigResponseBodyResultContentData getData() {
            return this.data;
        }

        public AddMdsMiniConfigResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
