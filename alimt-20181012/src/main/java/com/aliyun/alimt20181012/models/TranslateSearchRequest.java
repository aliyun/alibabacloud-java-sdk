// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>今天天气不错</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateSearchRequest self = new TranslateSearchRequest();
        return TeaModel.build(map, self);
    }

    public TranslateSearchRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TranslateSearchRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TranslateSearchRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateSearchRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public TranslateSearchRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
