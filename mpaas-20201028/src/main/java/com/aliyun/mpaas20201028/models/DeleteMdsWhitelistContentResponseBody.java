// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsWhitelistContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public DeleteMdsWhitelistContentResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMdsWhitelistContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsWhitelistContentResponseBody self = new DeleteMdsWhitelistContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMdsWhitelistContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMdsWhitelistContentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMdsWhitelistContentResponseBody setResultContent(DeleteMdsWhitelistContentResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMdsWhitelistContentResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMdsWhitelistContentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMdsWhitelistContentResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMdsWhitelistContentResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMdsWhitelistContentResponseBodyResultContentData self = new DeleteMdsWhitelistContentResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public DeleteMdsWhitelistContentResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteMdsWhitelistContentResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteMdsWhitelistContentResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMdsWhitelistContentResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteMdsWhitelistContentResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public DeleteMdsWhitelistContentResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static DeleteMdsWhitelistContentResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMdsWhitelistContentResponseBodyResultContent self = new DeleteMdsWhitelistContentResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMdsWhitelistContentResponseBodyResultContent setData(DeleteMdsWhitelistContentResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public DeleteMdsWhitelistContentResponseBodyResultContentData getData() {
            return this.data;
        }

        public DeleteMdsWhitelistContentResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
