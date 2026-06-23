// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMdsCubeTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ChangeMdsCubeTaskStatusResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ChangeMdsCubeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMdsCubeTaskStatusResponseBody self = new ChangeMdsCubeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMdsCubeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMdsCubeTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChangeMdsCubeTaskStatusResponseBody setResultContent(ChangeMdsCubeTaskStatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ChangeMdsCubeTaskStatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ChangeMdsCubeTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ChangeMdsCubeTaskStatusResponseBodyResultContentData extends TeaModel {
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

        public static ChangeMdsCubeTaskStatusResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ChangeMdsCubeTaskStatusResponseBodyResultContentData self = new ChangeMdsCubeTaskStatusResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ChangeMdsCubeTaskStatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ChangeMdsCubeTaskStatusResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static ChangeMdsCubeTaskStatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ChangeMdsCubeTaskStatusResponseBodyResultContent self = new ChangeMdsCubeTaskStatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContent setData(ChangeMdsCubeTaskStatusResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ChangeMdsCubeTaskStatusResponseBodyResultContentData getData() {
            return this.data;
        }

        public ChangeMdsCubeTaskStatusResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
