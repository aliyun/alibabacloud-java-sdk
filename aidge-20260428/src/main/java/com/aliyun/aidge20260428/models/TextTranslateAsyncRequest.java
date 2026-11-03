// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateAsyncRequest extends TeaModel {
    /**
     * <p>The caller business ID. It can be up to 128 characters in length. This ID is passed through in the translation results. It is used only for asynchronous text translation and is returned as-is in the task results.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This field represents your identity and facilitates communication for various issues. If you are an internal Alibaba organization, we recommend that you specify this parameter based on the actual scenario, such as BU name-product or BU name-chat. If you are an external partner, we recommend that you specify the full name of your company. The company name must be the same as the one you used when registering your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>BUxxx-chat</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The format type of the source text. Valid values: text and html.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The ID of the intervention glossary. You must create the glossary in the console and provide its ID in the input parameters. If the intervention glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; glossary_1&quot;</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. For more information, see the supported language list below. If you do not specify this parameter, the source language is automatically detected.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of text to be translated.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceTextList")
    public java.util.List<String> sourceTextList;

    /**
     * <p>The target language code. For more information, see the supported language pair list below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The business scenario identifier. You can specify only one of the following values. After you specify a value, the translation engine uses the terminology library and style policy of the corresponding industry to output industry-specific translations. If this field is not specified or an invalid value is specified, the general translation policy is used. Valid values:</p>
     * <ul>
     * <li>e-commerce-title: cross-border e-commerce product title translation</li>
     * <li>e-commerce-description: cross-border e-commerce product description translation</li>
     * <li>e-commerce-chat: cross-border e-commerce conversation translation</li>
     * <li>e-commerce-cpv: cross-border e-commerce product CPV attribute translation</li>
     * <li>novel: novel translation</li>
     * <li>game: game translation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e-commerce-title</p>
     */
    @NameInMap("TranslateScene")
    public String translateScene;

    public static TextTranslateAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateAsyncRequest self = new TextTranslateAsyncRequest();
        return TeaModel.build(map, self);
    }

    public TextTranslateAsyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TextTranslateAsyncRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public TextTranslateAsyncRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public TextTranslateAsyncRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public TextTranslateAsyncRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TextTranslateAsyncRequest setSourceTextList(java.util.List<String> sourceTextList) {
        this.sourceTextList = sourceTextList;
        return this;
    }
    public java.util.List<String> getSourceTextList() {
        return this.sourceTextList;
    }

    public TextTranslateAsyncRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TextTranslateAsyncRequest setTranslateScene(String translateScene) {
        this.translateScene = translateScene;
        return this;
    }
    public String getTranslateScene() {
        return this.translateScene;
    }

}
