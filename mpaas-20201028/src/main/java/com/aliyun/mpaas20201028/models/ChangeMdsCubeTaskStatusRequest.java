// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMdsCubeTaskStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateTaskId")
    public Long templateTaskId;

    /**
     * <strong>example:</strong>
     * <p>ZXCXMAHQ-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
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
