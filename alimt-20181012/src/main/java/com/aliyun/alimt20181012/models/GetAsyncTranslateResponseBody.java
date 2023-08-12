// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetAsyncTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAsyncTranslateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAsyncTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTranslateResponseBody self = new GetAsyncTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTranslateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAsyncTranslateResponseBody setData(GetAsyncTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncTranslateResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAsyncTranslateResponseBodyData extends TeaModel {
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        @NameInMap("Status")
        public String status;

        @NameInMap("TranslatedText")
        public String translatedText;

        @NameInMap("WordCount")
        public String wordCount;

        public static GetAsyncTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncTranslateResponseBodyData self = new GetAsyncTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncTranslateResponseBodyData setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public GetAsyncTranslateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncTranslateResponseBodyData setTranslatedText(String translatedText) {
            this.translatedText = translatedText;
            return this;
        }
        public String getTranslatedText() {
            return this.translatedText;
        }

        public GetAsyncTranslateResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

    }

}
