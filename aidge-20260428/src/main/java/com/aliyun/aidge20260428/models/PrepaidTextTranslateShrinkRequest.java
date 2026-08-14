// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PrepaidTextTranslateShrinkRequest extends TeaModel {
    /**
     * <p>The business scenario identifier. This parameter is optional. Valid values: e-commerce-title, e-commerce-description, e-commerce-chat, e-commerce-cpv, novel, game. If not specified or an invalid value is passed, the general translation strategy is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba-商品</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. This parameter is optional. Supports text (plain text format) and html (web page format, preserving HTML tags).</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The intervention glossary ID. This parameter is optional. The glossary must be created separately in the console, and its ID must be provided. If the glossary ID is empty, the translation result is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_glossary</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. This parameter is optional. If not specified, the language is automatically detected. You can pass auto for language detection.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of texts to translate. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello world&quot;]</p>
     */
    @NameInMap("SourceTextList")
    public String sourceTextListShrink;

    /**
     * <p>The target language code. This parameter is required. More than 100 language directions are supported. For details, refer to the supported language directions list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The format of the translation text. html (web page format. This setting processes both the source text and translated text in HTML format) or text (text format. This setting processes both the source text and translated result as plain text without format processing).</p>
     * 
     * <strong>example:</strong>
     * <p>e-commerce-title</p>
     */
    @NameInMap("TranslateScene")
    public String translateScene;

    public static PrepaidTextTranslateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepaidTextTranslateShrinkRequest self = new PrepaidTextTranslateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PrepaidTextTranslateShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public PrepaidTextTranslateShrinkRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public PrepaidTextTranslateShrinkRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public PrepaidTextTranslateShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public PrepaidTextTranslateShrinkRequest setSourceTextListShrink(String sourceTextListShrink) {
        this.sourceTextListShrink = sourceTextListShrink;
        return this;
    }
    public String getSourceTextListShrink() {
        return this.sourceTextListShrink;
    }

    public PrepaidTextTranslateShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public PrepaidTextTranslateShrinkRequest setTranslateScene(String translateScene) {
        this.translateScene = translateScene;
        return this;
    }
    public String getTranslateScene() {
        return this.translateScene;
    }

}
