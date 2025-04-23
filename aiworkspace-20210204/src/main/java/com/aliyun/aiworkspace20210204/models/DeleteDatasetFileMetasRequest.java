// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetFileMetasRequest extends TeaModel {
    /**
     * <p>The metadata ID of the dataset file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaIds")
    public String datasetFileMetaIds;

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>132602</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDatasetFileMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetFileMetasRequest self = new DeleteDatasetFileMetasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetFileMetasRequest setDatasetFileMetaIds(String datasetFileMetaIds) {
        this.datasetFileMetaIds = datasetFileMetaIds;
        return this;
    }
    public String getDatasetFileMetaIds() {
        return this.datasetFileMetaIds;
    }

    public DeleteDatasetFileMetasRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public DeleteDatasetFileMetasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
