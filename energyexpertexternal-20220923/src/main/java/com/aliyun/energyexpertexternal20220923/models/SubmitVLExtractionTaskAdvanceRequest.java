// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitVLExtractionTaskAdvanceRequest extends TeaModel {
    /**
     * <p>The filename must include the file type suffix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>Choose one of fileUrl or fileUrlObject:</p>
     * <ul>
     * <li><p>fileUrl: Use by providing the document URL, for a single document (supports up to 1000 pages and 100MB in size)</p>
     * </li>
     * <li><p>fileUrlObject: Use when calling the interface with local file upload, for a single document (supports up to 1000 pages and 100 MB in size)</p>
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
     * <ul>
     * <li>Unique knowledge base folder ID, used when you need to categorize documents and control the scope of online Q&amp;A queries.</li>
     * <li>The folder ID needs to be obtained from the intelligent document console after logging in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>Unique parsing template ID, used to specify the key-value pairs to be extracted from the document. You need to configure the template on the template management page and then obtain the corresponding template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>572d24k0c95a</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitVLExtractionTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVLExtractionTaskAdvanceRequest self = new SubmitVLExtractionTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVLExtractionTaskAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitVLExtractionTaskAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitVLExtractionTaskAdvanceRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitVLExtractionTaskAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
