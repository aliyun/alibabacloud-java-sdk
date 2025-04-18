// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobRequest extends TeaModel {
    /**
     * <p>The default extraction method is &quot;doc&quot;, with the following optional values:</p>
     * <ul>
     * <li>vl: Image processing</li>
     * <li>doc: Long text RAG (Retrieval-Augmented Generation)</li>
     * <li>docUnderstanding: Long text comprehension</li>
     * <li>recommender: Recommendation type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("analysisType")
    public String analysisType;

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
     * <p>Choose one between fileUrl and fileUrlObject:</p>
     * <ul>
     * <li><p>fileUrl: Use the document URL method for a single document (supports documents with up to 1000 pages and within 100MB).</p>
     * </li>
     * <li><p>fileUrlObject: Use when calling the API via local file upload, for a single document (supports documents with up to 1000 pages and 
     * within 100MB).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Relationship between file parsing methods and supported document types. </p>
     * <ul>
     * <li>Long Text RAG: Supports pdf, doc/docx, and up to 1000 pages</li>
     * <li>Image Processing: Supports pdf, jpg, jpeg, png, bmp</li>
     * <li>Long Text Understanding: Supports pdf, doc/docx, xls/xlsx</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.pdf">https://example.com/example.pdf</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>Unique knowledge base folder ID, used for categorizing documents and controlling the scope of online Q&amp;A queries. If empty, the document will be uploaded to the tenant\&quot;s root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>folderCode</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>The unique extraction template ID is used to specify the key-value pairs to be extracted from the document. You need to log in to the template management page to configure the template and obtain the corresponding template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>templateCode</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitDocumentAnalyzeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobRequest self = new SubmitDocumentAnalyzeJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentAnalyzeJobRequest setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
        return this;
    }
    public String getAnalysisType() {
        return this.analysisType;
    }

    public SubmitDocumentAnalyzeJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocumentAnalyzeJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocumentAnalyzeJobRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitDocumentAnalyzeJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
