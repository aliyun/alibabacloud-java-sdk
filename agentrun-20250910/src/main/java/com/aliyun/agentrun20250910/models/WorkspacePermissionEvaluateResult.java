// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class WorkspacePermissionEvaluateResult extends TeaModel {
    /**
     * <p>各 action 的校验结果；顺序与请求 actions 一致</p>
     */
    @NameInMap("permissions")
    public java.util.List<WorkspacePermissionItem> permissions;

    /**
     * <p>当前租户下是否解析到该 workspace；为 false 时各 permissions 一般为 allowed: false，不会调用 RAM</p>
     */
    @NameInMap("workspaceFound")
    public Boolean workspaceFound;

    /**
     * <p>回显请求中的 workspace ID（trim 后）</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static WorkspacePermissionEvaluateResult build(java.util.Map<String, ?> map) throws Exception {
        WorkspacePermissionEvaluateResult self = new WorkspacePermissionEvaluateResult();
        return TeaModel.build(map, self);
    }

    public WorkspacePermissionEvaluateResult setPermissions(java.util.List<WorkspacePermissionItem> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<WorkspacePermissionItem> getPermissions() {
        return this.permissions;
    }

    public WorkspacePermissionEvaluateResult setWorkspaceFound(Boolean workspaceFound) {
        this.workspaceFound = workspaceFound;
        return this;
    }
    public Boolean getWorkspaceFound() {
        return this.workspaceFound;
    }

    public WorkspacePermissionEvaluateResult setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
