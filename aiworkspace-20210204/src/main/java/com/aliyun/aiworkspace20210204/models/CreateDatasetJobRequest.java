// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SemanticIndex</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <strong>example:</strong>
     * <p>Full</p>
     */
    @NameInMap("JobMode")
    public String jobMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;modelId\&quot;:\&quot;xxx\&quot;}</p>
     */
    @NameInMap("JobSpec")
    public String jobSpec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobRequest self = new CreateDatasetJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public CreateDatasetJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetJobRequest setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public CreateDatasetJobRequest setJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public String getJobMode() {
        return this.jobMode;
    }

    public CreateDatasetJobRequest setJobSpec(String jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }
    public String getJobSpec() {
        return this.jobSpec;
    }

    public CreateDatasetJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
