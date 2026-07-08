// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportPptArtifactRequest extends TeaModel {
    /**
     * <p>Indicates if the exported artifact is editable.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Edit")
    public Boolean edit;

    /**
     * <p>The export file type.</p>
     * 
     * <strong>example:</strong>
     * <p>ppt</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The ID of the PPT artifact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("PptArtifactId")
    public Long pptArtifactId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>Indicates if the exported file is compressed into a ZIP package.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Zip")
    public Boolean zip;

    public static ExportPptArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportPptArtifactRequest self = new ExportPptArtifactRequest();
        return TeaModel.build(map, self);
    }

    public ExportPptArtifactRequest setEdit(Boolean edit) {
        this.edit = edit;
        return this;
    }
    public Boolean getEdit() {
        return this.edit;
    }

    public ExportPptArtifactRequest setExportFileType(String exportFileType) {
        this.exportFileType = exportFileType;
        return this;
    }
    public String getExportFileType() {
        return this.exportFileType;
    }

    public ExportPptArtifactRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ExportPptArtifactRequest setPptArtifactId(Long pptArtifactId) {
        this.pptArtifactId = pptArtifactId;
        return this;
    }
    public Long getPptArtifactId() {
        return this.pptArtifactId;
    }

    public ExportPptArtifactRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ExportPptArtifactRequest setZip(Boolean zip) {
        this.zip = zip;
        return this;
    }
    public Boolean getZip() {
        return this.zip;
    }

}
