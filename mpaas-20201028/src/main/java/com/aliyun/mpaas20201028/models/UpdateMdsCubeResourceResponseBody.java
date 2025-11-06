// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMdsCubeResourceResponseBody extends TeaModel {
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
    public UpdateMdsCubeResourceResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateMdsCubeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMdsCubeResourceResponseBody self = new UpdateMdsCubeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMdsCubeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMdsCubeResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMdsCubeResourceResponseBody setResultContent(UpdateMdsCubeResourceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateMdsCubeResourceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public UpdateMdsCubeResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UpdateMdsCubeResourceResponseBodyResultContentData extends TeaModel {
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

        public static UpdateMdsCubeResourceResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMdsCubeResourceResponseBodyResultContentData self = new UpdateMdsCubeResourceResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public UpdateMdsCubeResourceResponseBodyResultContentData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateMdsCubeResourceResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateMdsCubeResourceResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public UpdateMdsCubeResourceResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public UpdateMdsCubeResourceResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateMdsCubeResourceResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public UpdateMdsCubeResourceResponseBodyResultContentData data;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static UpdateMdsCubeResourceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateMdsCubeResourceResponseBodyResultContent self = new UpdateMdsCubeResourceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateMdsCubeResourceResponseBodyResultContent setData(UpdateMdsCubeResourceResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public UpdateMdsCubeResourceResponseBodyResultContentData getData() {
            return this.data;
        }

        public UpdateMdsCubeResourceResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
