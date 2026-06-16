// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateRequest extends TeaModel {
    /**
     * <p>The format type of the source text. Optional. Valid values: text (plain text format) and html (web page format that preserves HTML tags).</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The intervention glossary ID. Optional. Create the glossary in the console and provide its ID. If the glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The source language code. Optional. If not specified, the language is automatically detected. Set to auto for automatic language detection.</p>
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
     * <p>The target language code. Required. More than 100 language directions are supported. For details, refer to the supported language directions list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TextTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateRequest self = new TextTranslateRequest();
        return TeaModel.build(map, self);
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

}
