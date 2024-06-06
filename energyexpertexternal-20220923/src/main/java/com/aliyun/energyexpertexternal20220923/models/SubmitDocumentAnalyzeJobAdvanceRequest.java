// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobAdvanceRequest extends TeaModel {
    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("folderId")
    public String folderId;

    @NameInMap("ossUrl")
    public java.io.InputStream ossUrlObject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitDocumentAnalyzeJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobAdvanceRequest self = new SubmitDocumentAnalyzeJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setOssUrlObject(java.io.InputStream ossUrlObject) {
        this.ossUrlObject = ossUrlObject;
        return this;
    }
    public java.io.InputStream getOssUrlObject() {
        return this.ossUrlObject;
    }

    public SubmitDocumentAnalyzeJobAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
