// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobAdvanceRequest extends TeaModel {
    @NameInMap("fileName")
    public String fileName;

    @NameInMap("fileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitDocumentAnalyzeJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobAdvanceRequest self = new SubmitDocumentAnalyzeJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
