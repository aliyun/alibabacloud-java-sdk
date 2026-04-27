// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseOnlineApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DocumentParseOnlineApiResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DocumentParseOnlineApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseOnlineApiResponseBody self = new DocumentParseOnlineApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DocumentParseOnlineApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocumentParseOnlineApiResponseBody setData(DocumentParseOnlineApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DocumentParseOnlineApiResponseBodyData getData() {
        return this.data;
    }

    public DocumentParseOnlineApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocumentParseOnlineApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocumentParseOnlineApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DocumentParseOnlineApiResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        public static DocumentParseOnlineApiResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            DocumentParseOnlineApiResponseBodyDataUsage self = new DocumentParseOnlineApiResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public DocumentParseOnlineApiResponseBodyDataUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public DocumentParseOnlineApiResponseBodyDataUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public DocumentParseOnlineApiResponseBodyDataUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class DocumentParseOnlineApiResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[\&quot;LTAI5tQcqrTt1jrRbZf7mHFs\&quot;]</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>BAA69D16-9453-5A8F-AE3C-498D956A0A73</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Usage")
        public DocumentParseOnlineApiResponseBodyDataUsage usage;

        public static DocumentParseOnlineApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DocumentParseOnlineApiResponseBodyData self = new DocumentParseOnlineApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DocumentParseOnlineApiResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DocumentParseOnlineApiResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DocumentParseOnlineApiResponseBodyData setUsage(DocumentParseOnlineApiResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public DocumentParseOnlineApiResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
