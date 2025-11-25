// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateForHtmlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchTranslateForHtmlResponseBodyData data;

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

    public static BatchTranslateForHtmlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchTranslateForHtmlResponseBody self = new BatchTranslateForHtmlResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchTranslateForHtmlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchTranslateForHtmlResponseBody setData(BatchTranslateForHtmlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchTranslateForHtmlResponseBodyData getData() {
        return this.data;
    }

    public BatchTranslateForHtmlResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchTranslateForHtmlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchTranslateForHtmlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchTranslateForHtmlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchTranslateForHtmlResponseBodyDataTranslationListUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>53</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>61</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static BatchTranslateForHtmlResponseBodyDataTranslationListUsage build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlResponseBodyDataTranslationListUsage self = new BatchTranslateForHtmlResponseBodyDataTranslationListUsage();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationListUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationListUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationListUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class BatchTranslateForHtmlResponseBodyDataTranslationList extends TeaModel {
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
         * <p>OK</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>What will the weather be like tomorrow?</p>
         */
        @NameInMap("translation")
        public String translation;

        @NameInMap("usage")
        public BatchTranslateForHtmlResponseBodyDataTranslationListUsage usage;

        public static BatchTranslateForHtmlResponseBodyDataTranslationList build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlResponseBodyDataTranslationList self = new BatchTranslateForHtmlResponseBodyDataTranslationList();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationList setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationList setTranslation(String translation) {
            this.translation = translation;
            return this;
        }
        public String getTranslation() {
            return this.translation;
        }

        public BatchTranslateForHtmlResponseBodyDataTranslationList setUsage(BatchTranslateForHtmlResponseBodyDataTranslationListUsage usage) {
            this.usage = usage;
            return this;
        }
        public BatchTranslateForHtmlResponseBodyDataTranslationListUsage getUsage() {
            return this.usage;
        }

    }

    public static class BatchTranslateForHtmlResponseBodyData extends TeaModel {
        @NameInMap("translationList")
        public java.util.List<BatchTranslateForHtmlResponseBodyDataTranslationList> translationList;

        public static BatchTranslateForHtmlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchTranslateForHtmlResponseBodyData self = new BatchTranslateForHtmlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchTranslateForHtmlResponseBodyData setTranslationList(java.util.List<BatchTranslateForHtmlResponseBodyDataTranslationList> translationList) {
            this.translationList = translationList;
            return this;
        }
        public java.util.List<BatchTranslateForHtmlResponseBodyDataTranslationList> getTranslationList() {
            return this.translationList;
        }

    }

}
