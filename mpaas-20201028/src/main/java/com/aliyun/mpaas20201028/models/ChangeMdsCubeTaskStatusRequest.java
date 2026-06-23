// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMdsCubeTaskStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    @NameInMap("TemplateTaskId")
    public Long templateTaskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ChangeMdsCubeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMdsCubeTaskStatusRequest self = new ChangeMdsCubeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeMdsCubeTaskStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ChangeMdsCubeTaskStatusRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ChangeMdsCubeTaskStatusRequest setTemplateResourceId(Long templateResourceId) {
        this.templateResourceId = templateResourceId;
        return this;
    }
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    public ChangeMdsCubeTaskStatusRequest setTemplateTaskId(Long templateTaskId) {
        this.templateTaskId = templateTaskId;
        return this;
    }
    public Long getTemplateTaskId() {
        return this.templateTaskId;
    }

    public ChangeMdsCubeTaskStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChangeMdsCubeTaskStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
