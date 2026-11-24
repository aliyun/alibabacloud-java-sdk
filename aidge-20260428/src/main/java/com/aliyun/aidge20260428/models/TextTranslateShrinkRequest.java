// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateShrinkRequest extends TeaModel {
    /**
     * <p>This field represents your identity and facilitates communication for various issues. If you are an internal Alibaba organization, we recommend that you specify this parameter based on the actual scenario, such as BU name-product or BU name-chat. If you are an external Alibaba partner, we recommend that you specify the full name of your company. The company name must be the same as the company name you used when registering your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCompany-Chat</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. This parameter is optional. Valid values:</p>
     * <ul>
     * <li>text: Plain text format.</li>
     * <li>html: Web page format, which retains HTML tags.</li>
     * </ul>
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
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. If this parameter is not specified, the language is automatically detected. This parameter is optional. You can set this parameter to auto for language identification.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.      </p>
     * <p>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of text to be translated. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Hello world&quot;]</p>
     */
    @NameInMap("SourceTextList")
    public String sourceTextListShrink;

    /**
     * <p>The target language code. This parameter is required.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.      </p>
     * <p>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The business scenario identifier. You can specify only one of the following values. After the value is specified, the translation engine calls the terminology library and style policy of the corresponding industry to output translations that better fit the industry. If this parameter is not specified or an invalid value is specified, the general translation policy is used. Valid values:</p>
     * <ul>
     * <li>e-commerce-title: Cross-border e-commerce product title translation.</li>
     * <li>e-commerce-description: Cross-border e-commerce product description translation.</li>
     * <li>e-commerce-chat: Cross-border e-commerce conversation translation.</li>
     * <li>e-commerce-cpv: Cross-border e-commerce product CPV attribute translation.</li>
     * <li>novel: Novel translation.</li>
     * <li>game: Game translation.</li>
     * </ul>
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
