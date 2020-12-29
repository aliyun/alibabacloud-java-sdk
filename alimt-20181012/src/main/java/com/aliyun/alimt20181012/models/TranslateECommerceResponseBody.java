// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateECommerceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TranslateECommerceResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static TranslateECommerceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateECommerceResponseBody self = new TranslateECommerceResponseBody();
        return TeaModel.build(map, self);
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

    public TranslateECommerceResponseBody setData(TranslateECommerceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateECommerceResponseBodyData getData() {
        return this.data;
    }

    public TranslateECommerceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class TranslateECommerceResponseBodyData extends TeaModel {
        @NameInMap("WordCount")
        public String wordCount;

        @NameInMap("Translated")
        public String translated;

        public static TranslateECommerceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateECommerceResponseBodyData self = new TranslateECommerceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateECommerceResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

        public TranslateECommerceResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

    }

}
