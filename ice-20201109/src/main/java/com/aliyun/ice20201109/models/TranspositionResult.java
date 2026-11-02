// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TranspositionResult extends TeaModel {
    /**
     * <ul>
     * <li>The target language for translation transposition. For more information, see the list of target languages for video translation.</li>
     * <li>This field is only used in video translation scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <ul>
     * <li>The text after translation transposition, which is the expected output text after the matched hot word is translated. The maximum length is 100 characters.</li>
     * <li>This field is only used in scenarios related to the translation feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
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
