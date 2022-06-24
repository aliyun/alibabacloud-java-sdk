// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteCubecardWhitelistContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteCubecardWhitelistContentResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteCubecardWhitelistContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCubecardWhitelistContentResponseBody self = new DeleteCubecardWhitelistContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCubecardWhitelistContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCubecardWhitelistContentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteCubecardWhitelistContentResponseBody setResultContent(DeleteCubecardWhitelistContentResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteCubecardWhitelistContentResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteCubecardWhitelistContentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteCubecardWhitelistContentResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteCubecardWhitelistContentResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCubecardWhitelistContentResponseBodyResultContentData self = new DeleteCubecardWhitelistContentResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteCubecardWhitelistContentResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public DeleteCubecardWhitelistContentResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static DeleteCubecardWhitelistContentResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteCubecardWhitelistContentResponseBodyResultContent self = new DeleteCubecardWhitelistContentResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContent setData(DeleteCubecardWhitelistContentResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public DeleteCubecardWhitelistContentResponseBodyResultContentData getData() {
            return this.data;
        }

        public DeleteCubecardWhitelistContentResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
