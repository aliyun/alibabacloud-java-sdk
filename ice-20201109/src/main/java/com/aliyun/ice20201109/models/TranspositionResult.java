// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TranspositionResult extends TeaModel {
    /**
     * <ul>
     * <li>The target language of the translation.</li>
     * <li>This field is only used in translation-related scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <ul>
     * <li>The translated text corresponding to the matched hotwords. Maximum length: 100 characters.</li>
     * <li>This field is only used in translation-related scenarios.</li>
     * </ul>
     */
    @NameInMap("TranslatedText")
    public String translatedText;

    public static TranspositionResult build(java.util.Map<String, ?> map) throws Exception {
        TranspositionResult self = new TranspositionResult();
        return TeaModel.build(map, self);
    }

    public TranspositionResult setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TranspositionResult setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
        return this;
    }
    public String getTranslatedText() {
        return this.translatedText;
    }

}
