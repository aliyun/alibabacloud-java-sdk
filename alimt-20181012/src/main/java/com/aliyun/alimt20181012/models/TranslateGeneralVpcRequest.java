// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralVpcRequest extends TeaModel {
    @NameInMap("Context")
    public String context;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateGeneralVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralVpcRequest self = new TranslateGeneralVpcRequest();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralVpcRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public TranslateGeneralVpcRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateGeneralVpcRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TranslateGeneralVpcRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateGeneralVpcRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public TranslateGeneralVpcRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
