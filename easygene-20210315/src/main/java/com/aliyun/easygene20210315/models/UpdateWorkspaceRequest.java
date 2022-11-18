// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("JobLifecycle")
    public Integer jobLifecycle;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Role")
    public String role;

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
