// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobRequest extends TeaModel {
    @NameInMap("analysisType")
    public String analysisType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.pdf">https://example.com/example.pdf</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>folderCode</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
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
