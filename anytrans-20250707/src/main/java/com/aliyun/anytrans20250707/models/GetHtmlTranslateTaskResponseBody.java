// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetHtmlTranslateTaskResponseBody extends TeaModel {
    /**
     * <p>The operation status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetHtmlTranslateTaskResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the server.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Use this ID to trace the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04B53310-CB1A-14B4-AC85-26C154D8366A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetHtmlTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHtmlTranslateTaskResponseBody self = new GetHtmlTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHtmlTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHtmlTranslateTaskResponseBody setData(GetHtmlTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHtmlTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetHtmlTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHtmlTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHtmlTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHtmlTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHtmlTranslateTaskResponseBodyDataUsage extends TeaModel {
        /**
         * <p>The number of tokens in the input.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <p>The number of tokens in the output.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <p>The total number of tokens for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetHtmlTranslateTaskResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GetHtmlTranslateTaskResponseBodyDataUsage self = new GetHtmlTranslateTaskResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GetHtmlTranslateTaskResponseBodyDataUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetHtmlTranslateTaskResponseBodyDataUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetHtmlTranslateTaskResponseBodyDataUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetHtmlTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <p>Translation Result</p>
         * 
         * <strong>example:</strong>
         * <!DOCTYPE html>
         * 
         * <html lang="zh-CN">
         * <head>
         * <meta charset="utf-8"/>
         * <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
         * <title>My First Webpage</title>
         * </head>
         * <body>
         * <h1>Welcome to my webpage!</h1>
         * <p>This is a simple HTML page.</p>
         * <p>Learning HTML is the first step to entering web development.</p>
         * <a href="https://www.example.com">Click here to visit the sample website</a>
         * </body>
         * </html>
         */
        @NameInMap("translation")
        public String translation;

        /**
         * <p>Details about token usage.</p>
         */
        @NameInMap("usage")
        public GetHtmlTranslateTaskResponseBodyDataUsage usage;

        public static GetHtmlTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHtmlTranslateTaskResponseBodyData self = new GetHtmlTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHtmlTranslateTaskResponseBodyData setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

        public GetHtmlTranslateTaskResponseBodyData setUsage(GetHtmlTranslateTaskResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetHtmlTranslateTaskResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
