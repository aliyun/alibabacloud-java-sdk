// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportPptArtifactRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Edit")
    public Boolean edit;

    /**
     * <strong>example:</strong>
     * <p>ppt</p>
     */
    @NameInMap("ExportFileType")
    public String exportFileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("PptArtifactId")
    public Long pptArtifactId;

    /**
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
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
