// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateShrinkRequest extends TeaModel {
    /**
     * <p>This field represents your identity and facilitates communication for various issues.<br>● If you are an internal Alibaba organization, pass a value based on your actual scenario, such as BU name-product or BU name-chat.<br>● If you are an external Alibaba partner, pass the full name of your company. This company name must be consistent with the company name used when you registered your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCompany-Chat</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. This parameter is optional. Valid values: text (plain text format) and html (web page format that preserves HTML tags).</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The intervention glossary ID. This parameter is optional. The glossary must be created separately in the console, and its ID must be provided. If the glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. If not specified, the language is automatically detected. This parameter is optional. You can pass auto for language detection. For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of texts to be translated. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello world&quot;]</p>
     */
    @NameInMap("SourceTextList")
    public String sourceTextListShrink;

    /**
     * <p>The target language code. This parameter is required. For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The business scenario identifier. You can pass only one of the following values. When specified, the translation engine invokes the corresponding industry terminology library and style strategy to produce translations that better fit the industry. If this field is not specified or an invalid value is passed, the general translation strategy is used.
     * Valid values:<br>● e-commerce-title: cross-border e-commerce product title translation<br>● e-commerce-description: cross-border e-commerce product description translation<br>● e-commerce-chat: cross-border e-commerce conversation translation<br>● e-commerce-cpv: cross-border e-commerce product CPV attribute translation<br>● novel: novel translation<br>● game: game translation</p>
     * 
     * <strong>example:</strong>
     * <p>e-commerce-title</p>
     */
    @NameInMap("TranslateScene")
    public String translateScene;

    public static TextTranslateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateShrinkRequest self = new TextTranslateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TextTranslateShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public TextTranslateShrinkRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TextTranslateShrinkRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public TextTranslateShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TextTranslateShrinkRequest setSourceTextListShrink(String sourceTextListShrink) {
        this.sourceTextListShrink = sourceTextListShrink;
        return this;
    }
    public String getSourceTextListShrink() {
        return this.sourceTextListShrink;
    }

    public TextTranslateShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TextTranslateShrinkRequest setTranslateScene(String translateScene) {
        this.translateScene = translateScene;
        return this;
    }
    public String getTranslateScene() {
        return this.translateScene;
    }

}
