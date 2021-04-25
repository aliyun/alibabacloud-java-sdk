// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 工作空间描述
    @NameInMap("Description")
    public String description;

    // 工作空间OSS工作路径
    @NameInMap("OssRoot")
    public String ossRoot;

    // 工作空间内任务生命周期
    @NameInMap("JobLifecycle")
    public Integer jobLifecycle;

    // 工作空间内Ram角色
    @NameInMap("Role")
    public String role;

    // 工作空间标签
    @NameInMap("Labels")
    public String labels;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkspaceRequest setOssRoot(String ossRoot) {
        this.ossRoot = ossRoot;
        return this;
    }
    public String getOssRoot() {
        return this.ossRoot;
    }

    public UpdateWorkspaceRequest setJobLifecycle(Integer jobLifecycle) {
        this.jobLifecycle = jobLifecycle;
        return this;
    }
    public Integer getJobLifecycle() {
        return this.jobLifecycle;
    }

    public UpdateWorkspaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateWorkspaceRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
