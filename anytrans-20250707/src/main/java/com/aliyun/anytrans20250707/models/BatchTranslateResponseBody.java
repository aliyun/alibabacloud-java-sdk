// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchTranslateResponseBodyData data;

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
     * <p>3BE338D3-16B1-513F-8DD2-57C8528DEAAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>520</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public Long code;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Featured Double Color Ball experts: Liu Ke and A Wang both hit the second prize, winning 1.43 million!</p>
         */
        @NameInMap("translation")
        public String translation;

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
