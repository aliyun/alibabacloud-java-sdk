// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TranslateGeneralResponseBodyData data;

    public static TranslateGeneralResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralResponseBody self = new TranslateGeneralResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TranslateGeneralResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateGeneralResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateGeneralResponseBody setData(TranslateGeneralResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateGeneralResponseBodyData getData() {
        return this.data;
    }

    public static class TranslateGeneralResponseBodyData extends TeaModel {
        @NameInMap("Translated")
        public String translated;

        @NameInMap("WordCount")
        public String wordCount;

        public static TranslateGeneralResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateGeneralResponseBodyData self = new TranslateGeneralResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateGeneralResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

        public TranslateGeneralResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

    }

}
