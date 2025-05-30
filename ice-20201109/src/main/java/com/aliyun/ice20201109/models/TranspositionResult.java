// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class TranspositionResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <strong>example:</strong>
     * <p>你好</p>
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
