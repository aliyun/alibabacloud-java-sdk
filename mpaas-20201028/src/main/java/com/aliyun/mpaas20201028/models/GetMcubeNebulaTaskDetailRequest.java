// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaTaskDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMcubeNebulaTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaTaskDetailRequest self = new GetMcubeNebulaTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaTaskDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMcubeNebulaTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetMcubeNebulaTaskDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMcubeNebulaTaskDetailRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
