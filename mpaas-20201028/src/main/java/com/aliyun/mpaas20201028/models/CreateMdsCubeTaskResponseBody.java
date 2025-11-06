// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0CC8A9CB-9BA3-13FD-A404-6E2E7461881A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMdsCubeTaskResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1010</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>0CC8A9CB-9BA3-13FD-A404-6E2E7461881A</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>0CC8A9CB-9BA3-13FD-A404-6E2E7461881A</p>
         */
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
