// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AnalyzeVlRealtimeAdvanceRequest extends TeaModel {
    /**
     * <p>Choose one of fileUrl or fileUrlObject:</p>
     * <ul>
     * <li><p>fileUrl: Use in the form of a document URL, for a single document (supports up to 1000 pages and 100MB)</p>
     * </li>
     * <li><p>fileUrlObject: Use when calling the interface with local file upload, for a single document (supports up to 1000 pages and 100 MB)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The relationship between file parsing methods and supported document types</p>
     * <ul>
     * <li>Long Text RAG: Supports pdf, doc/docx, up to 1000 pages</li>
     * <li>Image Processing: Supports pdf, jpg, jpeg, png, bmp</li>
     * <li>Long Text Understanding: Supports pdf, doc/docx, xls/xlsx</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fileUrl：<a href="https://example.com/example.pdf">https://example.com/example.pdf</a>
     * fileUrlObject：本地文件生成的FileInputStream</p>
     */
    @NameInMap("fileUrl")
    public java.io.InputStream fileUrlObject;

    /**
     * <p>Language, parameters that can be passed</p>
     * <ul>
     * <li>zh-CN: Chinese (default)</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>A unique parsing template ID used to specify the key-value pairs to be extracted from the document. You need to log in to the template management page, configure the template, and then get the corresponding template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>572d24k0c95a</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static AnalyzeVlRealtimeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeVlRealtimeAdvanceRequest self = new AnalyzeVlRealtimeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeVlRealtimeAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public AnalyzeVlRealtimeAdvanceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AnalyzeVlRealtimeAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
