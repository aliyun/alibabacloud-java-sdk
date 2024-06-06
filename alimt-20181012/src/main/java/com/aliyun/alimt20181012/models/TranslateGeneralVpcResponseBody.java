// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralVpcResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TranslateGeneralVpcResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TranslateGeneralVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralVpcResponseBody self = new TranslateGeneralVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralVpcResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TranslateGeneralVpcResponseBody setData(TranslateGeneralVpcResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateGeneralVpcResponseBodyData getData() {
        return this.data;
    }

    public TranslateGeneralVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateGeneralVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateGeneralVpcResponseBodyData extends TeaModel {
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        @NameInMap("Translated")
        public String translated;

        @NameInMap("WordCount")
        public String wordCount;

        public static TranslateGeneralVpcResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateGeneralVpcResponseBodyData self = new TranslateGeneralVpcResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateGeneralVpcResponseBodyData setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public TranslateGeneralVpcResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

        public TranslateGeneralVpcResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

    }

}
