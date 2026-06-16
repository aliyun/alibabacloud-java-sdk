// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateResponseBody extends TeaModel {
    /**
     * <p>The response code. The value &quot;success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The translation result data, which contains the translation list and usage information.</p>
     */
    @NameInMap("Data")
    public TextTranslateResponseBodyData data;

    /**
     * <p>The error message. The value &quot;Success&quot; is returned for a successful call. For a failed call, a specific error message is returned, such as &quot;The parameters contain sensitive information. Try other input.&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>922E43BB-EE0E-1A29-B143-BB91BB3EA6AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TextTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateResponseBody self = new TextTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public TextTranslateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TextTranslateResponseBody setData(TextTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextTranslateResponseBodyData getData() {
        return this.data;
    }

    public TextTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TextTranslateResponseBodyDataTranslations extends TeaModel {
        /**
         * <p>The number of characters in the source text.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Characters")
        public Long characters;

        /**
         * <p>The automatically detected source language code.</p>
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

        public static TextTranslateResponseBodyDataTranslations build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateResponseBodyDataTranslations self = new TextTranslateResponseBodyDataTranslations();
            return TeaModel.build(map, self);
        }

        public TextTranslateResponseBodyDataTranslations setCharacters(Long characters) {
            this.characters = characters;
            return this;
        }
        public Long getCharacters() {
            return this.characters;
        }

        public TextTranslateResponseBodyDataTranslations setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public TextTranslateResponseBodyDataTranslations setTranslatedText(String translatedText) {
            this.translatedText = translatedText;
            return this;
        }
        public String getTranslatedText() {
            return this.translatedText;
        }

    }

    public static class TextTranslateResponseBodyData extends TeaModel {
        /**
         * <p>The list of translation results. Each element corresponds to a translation result for an entry in the input text list.</p>
         */
        @NameInMap("Translations")
        public java.util.List<TextTranslateResponseBodyDataTranslations> translations;

        /**
         * <p>The usage information, including the number of input characters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InputCharacterCount&quot;:5}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static TextTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextTranslateResponseBodyData self = new TextTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextTranslateResponseBodyData setTranslations(java.util.List<TextTranslateResponseBodyDataTranslations> translations) {
            this.translations = translations;
            return this;
        }
        public java.util.List<TextTranslateResponseBodyDataTranslations> getTranslations() {
            return this.translations;
        }

        public TextTranslateResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
