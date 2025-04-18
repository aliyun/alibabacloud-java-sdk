// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocParsingTaskRequest extends TeaModel {
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
     * <li><p>fileUrl: Use by providing the document URL, for a single document (supports up to 1000 pages and 100MB in size)</p>
     * </li>
     * <li><p>fileUrlObject: Use when calling the interface with local file upload, for a single document (supports up to 1000 pages and 100 MB in size)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The relationship between file parsing methods and supported document types</p>
     * <ul>
     * <li>Long Text RAG: Supports pdf, doc/docx, supports up to 1000 pages</li>
     * <li>Image Processing: Supports pdf, jpg, jpeg, png, bmp</li>
     * <li>Long Text Understanding: Supports pdf, doc/docx, xls/xlsx</li>
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
     * <li>Unique knowledge base folder ID, used when categorizing documents and controlling the scope of documents for online Q&amp;A queries.</li>
     * <li>The folder ID needs to be obtained from the Intelligent Document Console after logging in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>Whether to parse image content within the document.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("needAnalyzeImg")
    public Boolean needAnalyzeImg;

    public static SubmitDocParsingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParsingTaskRequest self = new SubmitDocParsingTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocParsingTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocParsingTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocParsingTaskRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitDocParsingTaskRequest setNeedAnalyzeImg(Boolean needAnalyzeImg) {
        this.needAnalyzeImg = needAnalyzeImg;
        return this;
    }
    public Boolean getNeedAnalyzeImg() {
        return this.needAnalyzeImg;
    }

}
