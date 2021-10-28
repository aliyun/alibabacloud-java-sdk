// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 工作空间描述
    @NameInMap("Description")
    public String description;

    // 工作空间任务生命周期
    @NameInMap("JobLifecycle")
    public Integer jobLifecycle;

    // 工作空间标签
    @NameInMap("Labels")
    public String labels;

    // 工作空间内的ram角色
    @NameInMap("Role")
    public String role;

    // 工作空间的OSS工作路径
    @NameInMap("Storage")
    public String storage;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkspaceRequest setJobLifecycle(Integer jobLifecycle) {
        this.jobLifecycle = jobLifecycle;
        return this;
    }
    public Integer getJobLifecycle() {
        return this.jobLifecycle;
    }

    public CreateWorkspaceRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateWorkspaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateWorkspaceRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public CreateWorkspaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
