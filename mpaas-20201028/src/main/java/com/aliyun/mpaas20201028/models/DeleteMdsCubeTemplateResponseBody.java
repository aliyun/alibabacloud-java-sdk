// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsCubeTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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
    public DeleteMdsCubeTemplateResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMdsCubeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsCubeTemplateResponseBody self = new DeleteMdsCubeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMdsCubeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMdsCubeTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMdsCubeTemplateResponseBody setResultContent(DeleteMdsCubeTemplateResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public DeleteMdsCubeTemplateResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public DeleteMdsCubeTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMdsCubeTemplateResponseBodyResultContentData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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

        public static DeleteMdsCubeTemplateResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMdsCubeTemplateResponseBodyResultContentData self = new DeleteMdsCubeTemplateResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public DeleteMdsCubeTemplateResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteMdsCubeTemplateResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteMdsCubeTemplateResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteMdsCubeTemplateResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMdsCubeTemplateResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteMdsCubeTemplateResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public DeleteMdsCubeTemplateResponseBodyResultContentData data;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static DeleteMdsCubeTemplateResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteMdsCubeTemplateResponseBodyResultContent self = new DeleteMdsCubeTemplateResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DeleteMdsCubeTemplateResponseBodyResultContent setData(DeleteMdsCubeTemplateResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public DeleteMdsCubeTemplateResponseBodyResultContentData getData() {
            return this.data;
        }

        public DeleteMdsCubeTemplateResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
