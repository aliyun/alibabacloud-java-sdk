// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetFileMetasRequest extends TeaModel {
    /**
     * <p>A list of file metadata content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetFileMetas")
    public java.util.List<DatasetFileMetaContentCreate> datasetFileMetas;

    /**
     * <p>The name of the dataset version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The ID of the workspace where the dataset is located. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
