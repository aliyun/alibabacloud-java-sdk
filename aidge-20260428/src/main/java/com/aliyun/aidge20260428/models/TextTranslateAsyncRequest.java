// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateAsyncRequest extends TeaModel {
    /**
     * <p>The caller business ID. It is used only for asynchronous text translation and returned as-is in the task result. It can be up to 128 characters in length and is passed through in the translation results.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The name of the caller&quot;s business, which represents your identity and facilitates subsequent communication. If you are an internal Alibaba team, specify this parameter based on the actual scenario, such as BU name-product or BU name-chat. If you are an external partner, specify the full name of your company. The company name must be the same as the one used when you registered your Alibaba Cloud account.</p>
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
     * <p>The source language code. For more information, see the supported language list below. If this parameter is not specified, the source language is automatically detected.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The list of texts to be translated.</p>
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
     * <p>The business scenario identifier. You can specify only one of the following values. After a value is specified, the translation engine invokes the terminology library and style strategy of the corresponding industry to output more industry-aligned translations. If this field is not specified or an invalid value is specified, the general translation strategy is used. Valid values: e-commerce-title for cross-border e-commerce product title translation, e-commerce-description for cross-border e-commerce product description translation, e-commerce-chat for cross-border e-commerce session translation, e-commerce-cpv for cross-border e-commerce product CPV attribute translation, novel for novel translation, and game for game translation.</p>
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
