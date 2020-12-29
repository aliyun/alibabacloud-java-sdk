// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateRequest extends TeaModel {
    @NameInMap("FormatType")
    public String formatType;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("SourceText")
    public String sourceText;

    @NameInMap("Scene")
    public String scene;

    public static TranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateRequest self = new TranslateRequest();
        return TeaModel.build(map, self);
    }

    public TranslateRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public TranslateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
