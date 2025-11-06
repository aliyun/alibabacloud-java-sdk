// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeResourceResponseBody extends TeaModel {
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
    public CreateMdsCubeResourceResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMdsCubeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeResourceResponseBody self = new CreateMdsCubeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMdsCubeResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMdsCubeResourceResponseBody setResultContent(CreateMdsCubeResourceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMdsCubeResourceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMdsCubeResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMdsCubeResourceResponseBodyResultContentData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1019</p>
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

        public static CreateMdsCubeResourceResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeResourceResponseBodyResultContentData self = new CreateMdsCubeResourceResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeResourceResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMdsCubeResourceResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMdsCubeResourceResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMdsCubeResourceResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMdsCubeResourceResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateMdsCubeResourceResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateMdsCubeResourceResponseBodyResultContentData data;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static CreateMdsCubeResourceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMdsCubeResourceResponseBodyResultContent self = new CreateMdsCubeResourceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMdsCubeResourceResponseBodyResultContent setData(CreateMdsCubeResourceResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateMdsCubeResourceResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateMdsCubeResourceResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
