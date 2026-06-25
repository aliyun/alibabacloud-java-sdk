// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetJobRequest extends TeaModel {
    /**
     * <p>The name of the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The description of the dataset job.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a job description of a dataset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the workspace. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetJobRequest self = new UpdateDatasetJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetJobRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public UpdateDatasetJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasetJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
