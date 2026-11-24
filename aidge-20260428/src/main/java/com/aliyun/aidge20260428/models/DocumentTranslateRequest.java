// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DocumentTranslateRequest extends TeaModel {
    /**
     * <p>Supports PDF, WORD, and EXCEL formats. Use uppercase letters for the input parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PDF</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>● Specify the intervention glossary ID when the intervention feature is required.<br>● Supports custom translation results, including:<br>○ Do-not-translate (ABC-ABC).<br>○ Specified translation (ABC-DEF).<br>○ Translation omission (ABC-null).
     * Commonly used in scenarios such as brand word protection.<br>Example value: &quot;glossary_1&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The target language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The OSS URL path of the document to be translated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&OSSAccessKeyId=LTAI5tE8X3****6SRU1V8dig&Signature=8niQY2HtMQY7h****SUdyORML9E%3D">https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&amp;OSSAccessKeyId=LTAI5tE8X3****6SRU1V8dig&amp;Signature=8niQY2HtMQY7h****SUdyORML9E%3D</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DocumentTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        DocumentTranslateRequest self = new DocumentTranslateRequest();
        return TeaModel.build(map, self);
    }

    public DocumentTranslateRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DocumentTranslateRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public DocumentTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public DocumentTranslateRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
