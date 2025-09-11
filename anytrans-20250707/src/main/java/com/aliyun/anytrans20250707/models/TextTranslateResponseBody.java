// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TextTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public TextTranslateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>299C57B2-EBB4-57E2-A6FE-723B874ACB74</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TextTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateResponseBody self = new TextTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public TextTranslateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TextTranslateResponseBody setData(TextTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextTranslateResponseBodyData getData() {
        return this.data;
    }

    public TextTranslateResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TextTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TextTranslateResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>491</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>891</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static TextTranslateResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateResponseBodyDataUsage self = new TextTranslateResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public TextTranslateResponseBodyDataUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public TextTranslateResponseBodyDataUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public TextTranslateResponseBodyDataUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class TextTranslateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>How does Mogujie solve the data annotation challenge by building a platform?</p>
         */
        @NameInMap("translation")
        public String translation;

        @NameInMap("usage")
        public TextTranslateResponseBodyDataUsage usage;

        public static TextTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateResponseBodyData self = new TextTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextTranslateResponseBodyData setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

        public TextTranslateResponseBodyData setUsage(TextTranslateResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public TextTranslateResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
