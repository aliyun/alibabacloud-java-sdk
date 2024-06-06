// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateECommerceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TranslateECommerceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TranslateECommerceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateECommerceResponseBody self = new TranslateECommerceResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateECommerceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TranslateECommerceResponseBody setData(TranslateECommerceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateECommerceResponseBodyData getData() {
        return this.data;
    }

    public TranslateECommerceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateECommerceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateECommerceResponseBodyData extends TeaModel {
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        @NameInMap("Translated")
        public String translated;

        @NameInMap("WordCount")
        public String wordCount;

        public static TranslateECommerceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateECommerceResponseBodyData self = new TranslateECommerceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateECommerceResponseBodyData setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public TranslateECommerceResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

        public TranslateECommerceResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

    }

}
