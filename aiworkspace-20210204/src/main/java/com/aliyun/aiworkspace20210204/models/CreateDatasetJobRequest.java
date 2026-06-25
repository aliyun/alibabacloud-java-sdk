// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobRequest extends TeaModel {
    /**
     * <p>The name of the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a job description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The task operation.</p>
     * <ul>
     * <li><p>SemanticIndex: semantic index</p>
     * </li>
     * <li><p>IntelligentTag: intelligent tagging</p>
     * </li>
     * <li><p>FileMetaExport: metadata export</p>
     * </li>
     * <li><p>FileMetaBuild: build and update metadata</p>
     * </li>
     * <li><p>IntelligentTagRevert: revoke intelligent tagging</p>
     * </li>
     * <li><p>FileMetaImport: metadata import</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SemanticIndex</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <p>The task type.</p>
     * <ul>
     * <li><p>Full (default): forces the processing of all metadata. This task takes a long time to execute.</p>
     * </li>
     * <li><p>Increment: processes only changed or unsuccessfully processed metadata. The SemanticIndex and IntelligentTag tasks support Increment and Full. Other tasks support only Full.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Full</p>
     */
    @NameInMap("JobMode")
    public String jobMode;

    /**
     * <p>The task details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;modelId\&quot;:\&quot;xxx\&quot;}</p>
     */
    @NameInMap("JobSpec")
    public String jobSpec;

    /**
     * <p>The workspace ID. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
