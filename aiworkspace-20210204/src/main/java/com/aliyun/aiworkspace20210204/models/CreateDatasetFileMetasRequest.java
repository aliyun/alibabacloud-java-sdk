// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetFileMetasRequest extends TeaModel {
    /**
     * <p>The metadata of the file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetFileMetas")
    public java.util.List<DatasetFileMetaContentCreate> datasetFileMetas;

    /**
     * <p>The dataset version name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetFileMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetFileMetasRequest self = new CreateDatasetFileMetasRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetFileMetasRequest setDatasetFileMetas(java.util.List<DatasetFileMetaContentCreate> datasetFileMetas) {
        this.datasetFileMetas = datasetFileMetas;
        return this;
    }
    public java.util.List<DatasetFileMetaContentCreate> getDatasetFileMetas() {
        return this.datasetFileMetas;
    }

    public CreateDatasetFileMetasRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public CreateDatasetFileMetasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
