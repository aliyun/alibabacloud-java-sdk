// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetFileMetasRequest extends TeaModel {
    /**
     * <p>The metadata records to be updated for the dataset files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetFileMetas")
    public java.util.List<DatasetFileMetaConentUpdate> datasetFileMetas;

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The ID of the tagging job that is associated with the metadata tag of the dataset file.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjob-hv0b1****u8taig3y</p>
     */
    @NameInMap("TagJobId")
    public String tagJobId;

    /**
     * <p>The ID of the workspace to which the dataset belongs. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>796**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetFileMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetFileMetasRequest self = new UpdateDatasetFileMetasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetFileMetasRequest setDatasetFileMetas(java.util.List<DatasetFileMetaConentUpdate> datasetFileMetas) {
        this.datasetFileMetas = datasetFileMetas;
        return this;
    }
    public java.util.List<DatasetFileMetaConentUpdate> getDatasetFileMetas() {
        return this.datasetFileMetas;
    }

    public UpdateDatasetFileMetasRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public UpdateDatasetFileMetasRequest setTagJobId(String tagJobId) {
        this.tagJobId = tagJobId;
        return this;
    }
    public String getTagJobId() {
        return this.tagJobId;
    }

    public UpdateDatasetFileMetasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
