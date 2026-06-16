// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DocumentTranslateRequest extends TeaModel {
    /**
     * <p>The type of the document. Valid values: PDF and Word. Size limits: Word 200 MB/300 pages, PDF 200 MB/300 pages. The maximum size of a single file is 200 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PDF</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The glossary ID to use when the glossary feature is required. Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for brand name protection.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The target language. The language code uses the two-letter ISO 639-1 standard.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The OSS URL of the document to be translated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&OSSAccessKeyId=LTAI5tE8X3gEy66SRU1V8dig&Signature=8niQY2HtMQY7h05zmSUdyORML9E%3D">https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&amp;OSSAccessKeyId=LTAI5tE8X3gEy66SRU1V8dig&amp;Signature=8niQY2HtMQY7h05zmSUdyORML9E%3D</a></p>
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
