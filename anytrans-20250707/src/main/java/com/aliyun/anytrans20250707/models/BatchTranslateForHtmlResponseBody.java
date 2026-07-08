// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class BatchTranslateForHtmlResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchTranslateForHtmlResponseBodyData data;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("inputTokens")
        public Long inputTokens;

        @NameInMap("outputTokens")
        public Long outputTokens;

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
        @NameInMap("code")
        public Long code;

        @NameInMap("detectedLang")
        public String detectedLang;

        @NameInMap("index")
        public String index;

        @NameInMap("message")
        public String message;

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

        public BatchTranslateForHtmlResponseBodyDataTranslationList setDetectedLang(String detectedLang) {
            this.detectedLang = detectedLang;
            return this;
        }
        public String getDetectedLang() {
            return this.detectedLang;
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
