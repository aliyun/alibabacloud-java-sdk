// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateECommerceRequest extends TeaModel {
    @NameInMap("Context")
    public String context;

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

    public static TranslateECommerceRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateECommerceRequest self = new TranslateECommerceRequest();
        return TeaModel.build(map, self);
    }

    public TranslateECommerceRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public TranslateECommerceRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateECommerceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
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

    public TranslateECommerceRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
