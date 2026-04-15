// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseTestApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DocumentParseTestApiResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
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

    public static DocumentParseTestApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseTestApiResponseBody self = new DocumentParseTestApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DocumentParseTestApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocumentParseTestApiResponseBody setData(DocumentParseTestApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DocumentParseTestApiResponseBodyData getData() {
        return this.data;
    }

    public DocumentParseTestApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocumentParseTestApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocumentParseTestApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DocumentParseTestApiResponseBodyDataUsage extends TeaModel {
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

        public static DocumentParseTestApiResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            DocumentParseTestApiResponseBodyDataUsage self = new DocumentParseTestApiResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public DocumentParseTestApiResponseBodyDataUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public DocumentParseTestApiResponseBodyDataUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public DocumentParseTestApiResponseBodyDataUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class DocumentParseTestApiResponseBodyData extends TeaModel {
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
        public DocumentParseTestApiResponseBodyDataUsage usage;

        public static DocumentParseTestApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DocumentParseTestApiResponseBodyData self = new DocumentParseTestApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DocumentParseTestApiResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DocumentParseTestApiResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DocumentParseTestApiResponseBodyData setUsage(DocumentParseTestApiResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public DocumentParseTestApiResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
