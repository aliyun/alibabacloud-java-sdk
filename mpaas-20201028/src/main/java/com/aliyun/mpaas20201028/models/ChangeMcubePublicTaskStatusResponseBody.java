// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubePublicTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ChangeMcubePublicTaskStatusResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ChangeMcubePublicTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubePublicTaskStatusResponseBody self = new ChangeMcubePublicTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMcubePublicTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMcubePublicTaskStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChangeMcubePublicTaskStatusResponseBody setResultContent(ChangeMcubePublicTaskStatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ChangeMcubePublicTaskStatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ChangeMcubePublicTaskStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ChangeMcubePublicTaskStatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ChangeMcubePublicTaskStatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ChangeMcubePublicTaskStatusResponseBodyResultContent self = new ChangeMcubePublicTaskStatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ChangeMcubePublicTaskStatusResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ChangeMcubePublicTaskStatusResponseBodyResultContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ChangeMcubePublicTaskStatusResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ChangeMcubePublicTaskStatusResponseBodyResultContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ChangeMcubePublicTaskStatusResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
