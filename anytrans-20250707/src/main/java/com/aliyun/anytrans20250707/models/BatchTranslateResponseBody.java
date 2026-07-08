// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateResponseBody extends TeaModel {
    /**
     * <p>The status code for the overall API call.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload that contains the translation results.</p>
     */
    @NameInMap("data")
    public BatchTranslateResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
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
     * <p>The unique identifier for the request. Use this ID for tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>3BE338D3-16B1-513F-8DD2-57C8528DEAAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BatchTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateResponseBody self = new BatchTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchTranslateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchTranslateResponseBody setData(BatchTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchTranslateResponseBodyData getData() {
        return this.data;
    }

    public BatchTranslateResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchTranslateResponseBodyDataTranslationListUsage extends TeaModel {
        /**
         * <p>The number of tokens in the source text.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <p>The number of tokens in the generated translation.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <p>The total number of tokens processed for the translation (the sum of <code>inputTokens</code> and <code>outputTokens</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static BatchTranslateResponseBodyDataTranslationListUsage build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateResponseBodyDataTranslationListUsage self = new BatchTranslateResponseBodyDataTranslationListUsage();
            return TeaModel.build(map, self);
        }

        public BatchTranslateResponseBodyDataTranslationListUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public BatchTranslateResponseBodyDataTranslationListUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public BatchTranslateResponseBodyDataTranslationListUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class BatchTranslateResponseBodyDataTranslationList extends TeaModel {
        /**
         * <p>The status code for the individual translation within the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <p>The language code of the detected source language.</p>
         */
        @NameInMap("detectedLang")
        public String detectedLang;

        /**
         * <p>The zero-based index of this result, which corresponds to the order of the source text in the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The status message for the individual translation.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The translated text.</p>
         * 
         * <strong>example:</strong>
         * <p>What will the weather be like tomorrow?</p>
         */
        @NameInMap("translation")
        public String translation;

        /**
         * <p>An object detailing the token usage for this translation.</p>
         */
        @NameInMap("usage")
        public BatchTranslateResponseBodyDataTranslationListUsage usage;

        public static BatchTranslateResponseBodyDataTranslationList build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateResponseBodyDataTranslationList self = new BatchTranslateResponseBodyDataTranslationList();
            return TeaModel.build(map, self);
        }

        public BatchTranslateResponseBodyDataTranslationList setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public BatchTranslateResponseBodyDataTranslationList setDetectedLang(String detectedLang) {
            this.detectedLang = detectedLang;
            return this;
        }
        public String getDetectedLang() {
            return this.detectedLang;
        }

        public BatchTranslateResponseBodyDataTranslationList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public BatchTranslateResponseBodyDataTranslationList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchTranslateResponseBodyDataTranslationList setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

        public BatchTranslateResponseBodyDataTranslationList setUsage(BatchTranslateResponseBodyDataTranslationListUsage usage) {
            this.usage = usage;
            return this;
        }
        public BatchTranslateResponseBodyDataTranslationListUsage getUsage() {
            return this.usage;
        }

    }

    public static class BatchTranslateResponseBodyData extends TeaModel {
        /**
         * <p>An array of translation results, one for each text provided in the request.</p>
         */
        @NameInMap("translationList")
        public java.util.List<BatchTranslateResponseBodyDataTranslationList> translationList;

        public static BatchTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateResponseBodyData self = new BatchTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchTranslateResponseBodyData setTranslationList(java.util.List<BatchTranslateResponseBodyDataTranslationList> translationList) {
            this.translationList = translationList;
            return this;
        }
        public java.util.List<BatchTranslateResponseBodyDataTranslationList> getTranslationList() {
            return this.translationList;
        }

    }

}
