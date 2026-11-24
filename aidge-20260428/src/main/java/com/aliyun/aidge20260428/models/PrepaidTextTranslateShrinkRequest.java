// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PrepaidTextTranslateShrinkRequest extends TeaModel {
    /**
     * <p>The business scenario identifier. This parameter is optional. Valid values: e-commerce-title, e-commerce-description, e-commerce-chat, e-commerce-cpv, novel, and game. If this parameter is not specified or is invalid, the general translation policy is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba-Product</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. This parameter is optional. Valid values: text (plain text format) and html (web page format, which retains HTML tags).</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The ID of the intervention glossary. This parameter is optional. You must create the glossary in the console and provide its ID. If the provided intervention glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_glossary</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. This parameter is optional. If you do not specify this parameter, the language is automatically detected. You can set this parameter to auto to enable language detection.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of text to translate. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello world&quot;]</p>
     */
    @NameInMap("SourceTextList")
    public String sourceTextListShrink;

    /**
     * <p>The target language code. This parameter is required. More than 100 language pairs are supported. For details, see the list of supported language pairs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The format of the text to translate. <strong>html</strong>: web page format. If you set this parameter to html, the source text and translated text are processed in HTML format. <strong>text</strong>: text format. If you set this parameter to text, the source text and translated text are processed as plain text without format processing.</p>
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
