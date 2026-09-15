// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PrepaidTextTranslateResponseBody extends TeaModel {
    /**
     * <p>The response code. The value &quot;success&quot; is returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The translation result data, including the translation list and usage information.</p>
     */
    @NameInMap("Data")
    public PrepaidTextTranslateResponseBodyData data;

    /**
     * <p>The error message. The value &quot;Success&quot; is returned for successful calls. For exceptions, a specific error message is returned, such as &quot;The parameters contain sensitive information. Try other input.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, used to uniquely identify a request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PrepaidTextTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepaidTextTranslateResponseBody self = new PrepaidTextTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepaidTextTranslateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrepaidTextTranslateResponseBody setData(PrepaidTextTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrepaidTextTranslateResponseBodyData getData() {
        return this.data;
    }

    public PrepaidTextTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PrepaidTextTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrepaidTextTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PrepaidTextTranslateResponseBodyDataTranslations extends TeaModel {
        /**
         * <p>The number of characters in the source text.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Characters")
        public Long characters;

        /**
         * <p>The automatically detected source language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        /**
         * <p>The translated text.</p>
         * 
         * <strong>example:</strong>
         * <p>你好世界</p>
         */
        @NameInMap("TranslatedText")
        public String translatedText;

        public static PrepaidTextTranslateResponseBodyDataTranslations build(java.util.Map<String, ?> map) throws Exception {
            PrepaidTextTranslateResponseBodyDataTranslations self = new PrepaidTextTranslateResponseBodyDataTranslations();
            return TeaModel.build(map, self);
        }

        public PrepaidTextTranslateResponseBodyDataTranslations setCharacters(Long characters) {
            this.characters = characters;
            return this;
        }
        public Long getCharacters() {
            return this.characters;
        }

        public PrepaidTextTranslateResponseBodyDataTranslations setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public PrepaidTextTranslateResponseBodyDataTranslations setTranslatedText(String translatedText) {
            this.translatedText = translatedText;
            return this;
        }
        public String getTranslatedText() {
            return this.translatedText;
        }

    }

    public static class PrepaidTextTranslateResponseBodyData extends TeaModel {
        /**
         * <p>The translation result list. Each element corresponds to a translation result for an entry in the input text list.</p>
         */
        @NameInMap("Translations")
        public java.util.List<PrepaidTextTranslateResponseBodyDataTranslations> translations;

        /**
         * <p>The usage information, including the number of input characters.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static PrepaidTextTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrepaidTextTranslateResponseBodyData self = new PrepaidTextTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrepaidTextTranslateResponseBodyData setTranslations(java.util.List<PrepaidTextTranslateResponseBodyDataTranslations> translations) {
            this.translations = translations;
            return this;
        }
        public java.util.List<PrepaidTextTranslateResponseBodyDataTranslations> getTranslations() {
            return this.translations;
        }

        public PrepaidTextTranslateResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
