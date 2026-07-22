// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateRequest extends TeaModel {
    /**
     * <p>The business scenario identifier. Optional. Valid values: e-commerce-title, e-commerce-description, e-commerce-chat, e-commerce-cpv, novel, game. If not specified or invalid, the general translation strategy is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCompany-Chat</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. Optional. Supports text (plain text format) and html (web page format, preserving HTML tags).</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The intervention glossary ID. Optional. The glossary must be created separately in the console and its ID provided. If the glossary ID is empty, the translation result is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. Optional. If not specified, the language is automatically detected. You can pass auto for language detection.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of texts to translate. Required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello world&quot;]</p>
     */
    @NameInMap("SourceTextList")
    public java.util.List<String> sourceTextList;

    /**
     * <p>The target language code. Required. Supports more than 100 language directions. For details, refer to the supported language directions list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The format of the translation text. <strong>html</strong> (web page format. This setting processes both the source text and translated text in HTML format). <strong>text</strong> (text format. This setting processes both the source text and translated result as plain text without format processing).</p>
     * 
     * <strong>example:</strong>
     * <p>e-commerce-title</p>
     */
    @NameInMap("TranslateScene")
    public String translateScene;

    public static TextTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateRequest self = new TextTranslateRequest();
        return TeaModel.build(map, self);
    }

    public TextTranslateRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public TextTranslateRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TextTranslateRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public TextTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TextTranslateRequest setSourceTextList(java.util.List<String> sourceTextList) {
        this.sourceTextList = sourceTextList;
        return this;
    }
    public java.util.List<String> getSourceTextList() {
        return this.sourceTextList;
    }

    public TextTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TextTranslateRequest setTranslateScene(String translateScene) {
        this.translateScene = translateScene;
        return this;
    }
    public String getTranslateScene() {
        return this.translateScene;
    }

}
