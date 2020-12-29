// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateECommerceRequest extends TeaModel {
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

    public static TranslateECommerceRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateECommerceRequest self = new TranslateECommerceRequest();
        return TeaModel.build(map, self);
    }

    public TranslateECommerceRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateECommerceRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TranslateECommerceRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateECommerceRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public TranslateECommerceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
