// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test workspace</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("JobLifecycle")
    public Integer jobLifecycle;

    /**
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>MyTestRamRole</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTestWorkspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkspaceRequest setJobLifecycle(Integer jobLifecycle) {
        this.jobLifecycle = jobLifecycle;
        return this;
    }
    public Integer getJobLifecycle() {
        return this.jobLifecycle;
    }

    public UpdateWorkspaceRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateWorkspaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateWorkspaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
