// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetFileMetasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
     */
    @NameInMap("DatasetFileMetaIds")
    public String datasetFileMetaIds;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
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
