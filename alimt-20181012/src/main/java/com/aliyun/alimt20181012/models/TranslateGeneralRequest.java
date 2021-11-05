// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralRequest extends TeaModel {
    @NameInMap("FormatType")
    public String formatType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("SourceText")
    public String sourceText;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralRequest self = new TranslateGeneralRequest();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateGeneralRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TranslateGeneralRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateGeneralRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public TranslateGeneralRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
