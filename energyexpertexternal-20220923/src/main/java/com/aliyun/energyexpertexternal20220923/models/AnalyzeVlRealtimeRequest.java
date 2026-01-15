// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AnalyzeVlRealtimeRequest extends TeaModel {
    /**
     * <p>文件名需带文件类型后缀</p>
     * 
     * <strong>example:</strong>
     * <p>test.png</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>Valid values: fileUrl and fileUrlObject.</p>
     * <ul>
     * <li>fileUrl: used as a document URL. A single document with not more than 1,000 pages and whose size does not exceed 100 MB is supported.</li>
     * <li>fileUrlObject: used when the operation is called in local file upload mode. A single document with not more than 1,000 pages and whose size does not exceed 100 MB is supported.</li>
     * </ul>
     * <blockquote>
     * <p>The relationship between file extraction methods and supported document types</p>
     * <ul>
     * <li>Long text RAG: Supports pdf, doc/docx, xlsx, csv, txt, up to 1000 pages</li>
     * <li>Image processing: Supports pdf, jpg, jpeg, png, bmp, jpe, tif, tiff, webp, heic</li>
     * <li>Long text understanding: Supports doc/docx, xlsx, pdf, csv, txt</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fileUrl: <a href="https://example.com/example.pdf">https://example.com/example.pdf</a> fileUrlObject: FileInputStream generated for a local file</p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>The language, which can be transferred. Valid values:</p>
     * <ul>
     * <li>zh-CN (default)</li>
     * <li>en-US</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The unique ID of an extraction template, which is used to specify the content to be extracted from a document. You must log on to the Template Management page to configure the template and then obtain the corresponding template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>572d24k0c95a</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static AnalyzeVlRealtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeVlRealtimeRequest self = new AnalyzeVlRealtimeRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeVlRealtimeRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AnalyzeVlRealtimeRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AnalyzeVlRealtimeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AnalyzeVlRealtimeRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
