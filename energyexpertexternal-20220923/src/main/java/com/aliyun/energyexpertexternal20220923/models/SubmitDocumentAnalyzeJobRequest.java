// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobRequest extends TeaModel {
    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("folderId")
    public String folderId;

    @NameInMap("ossUrl")
    public String ossUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static SubmitDocumentAnalyzeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobRequest self = new SubmitDocumentAnalyzeJobRequest();
        return TeaModel.build(map, self);
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

    public SubmitDocumentAnalyzeJobRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public SubmitDocumentAnalyzeJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
