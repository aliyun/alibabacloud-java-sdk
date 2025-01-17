// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetAsyncTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAsyncTranslateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        /**
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("TranslatedText")
        public String translatedText;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
