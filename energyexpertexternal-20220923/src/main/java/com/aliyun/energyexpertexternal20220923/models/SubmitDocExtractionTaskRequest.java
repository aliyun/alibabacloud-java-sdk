// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocExtractionTaskRequest extends TeaModel {
    /**
     * <p>Document parsing type:
     * Supports rag and long text understanding types, default is rag.</p>
     * 
     * <strong>example:</strong>
     * <p>rag</p>
     */
    @NameInMap("extractType")
    public String extractType;

    /**
     * <p>The filename must include the file type extension.</p>
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
     * <li><p>fileUrl: Use by providing the document URL, for a single document (supports up to 1000 pages, 100MB in size)</p>
     * </li>
     * <li><p>fileUrlObject: Use when calling the interface with local file upload, for a single document (supports up to 1000 pages, 100 MB in size)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The relationship between file parsing methods and supported document types</p>
     * <ul>
     * <li>Long text RAG: Supports pdf, doc/docx, up to 1000 pages</li>
     * <li>Image processing: Supports pdf, jpg, jpeg, png, bmp</li>
     * <li>Long text understanding: Supports pdf, doc/docx, xls/xlsx</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fileUrl：<a href="https://example.com/example.pdf">https://example.com/example.pdf</a>
     * fileUrlObject：FileInputStream generated from a local file</p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <ul>
     * <li>A unique knowledge base folder ID, used when you need to categorize documents and control the scope of documents for online Q&amp;A queries.</li>
     * <li>The folder ID needs to be obtained by logging into the intelligent document console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>A unique parsing template ID used to specify the key-value pairs to be extracted from the document. You need to log in to the template management page to configure the template and obtain the corresponding template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>572d24k0c95a</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitDocExtractionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocExtractionTaskRequest self = new SubmitDocExtractionTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocExtractionTaskRequest setExtractType(String extractType) {
        this.extractType = extractType;
        return this;
    }
    public String getExtractType() {
        return this.extractType;
    }

    public SubmitDocExtractionTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocExtractionTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocExtractionTaskRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitDocExtractionTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
