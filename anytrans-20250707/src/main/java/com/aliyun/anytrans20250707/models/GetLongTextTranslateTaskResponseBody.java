// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetLongTextTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetLongTextTranslateTaskResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>AC642EEB-C29D-54DF-8F52-622565BBB78A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetLongTextTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLongTextTranslateTaskResponseBody self = new GetLongTextTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLongTextTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLongTextTranslateTaskResponseBody setData(GetLongTextTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLongTextTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetLongTextTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLongTextTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLongTextTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLongTextTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLongTextTranslateTaskResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>495</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>515</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1010</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetLongTextTranslateTaskResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GetLongTextTranslateTaskResponseBodyDataUsage self = new GetLongTextTranslateTaskResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GetLongTextTranslateTaskResponseBodyDataUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetLongTextTranslateTaskResponseBodyDataUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetLongTextTranslateTaskResponseBodyDataUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetLongTextTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Featured Double Color Ball experts: Liu Ke and A Wang both hit the second prize, winning 1.43 million!</p>
         */
        @NameInMap("translation")
        public String translation;

        @NameInMap("usage")
        public GetLongTextTranslateTaskResponseBodyDataUsage usage;

        public static GetLongTextTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLongTextTranslateTaskResponseBodyData self = new GetLongTextTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLongTextTranslateTaskResponseBodyData setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

        public GetLongTextTranslateTaskResponseBodyData setUsage(GetLongTextTranslateTaskResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetLongTextTranslateTaskResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
