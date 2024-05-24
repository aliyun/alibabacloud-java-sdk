// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20190102.models;

import com.aliyun.tea.*;

public class TranslateECommerceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

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

    public TranslateECommerceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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
        @NameInMap("Translated")
        public String translated;

        @NameInMap("WordCount")
        public String wordCount;

        public static TranslateECommerceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateECommerceResponseBodyData self = new TranslateECommerceResponseBodyData();
            return TeaModel.build(map, self);
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
