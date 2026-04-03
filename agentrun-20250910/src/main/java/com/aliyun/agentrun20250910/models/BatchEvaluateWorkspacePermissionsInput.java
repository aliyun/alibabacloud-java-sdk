// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BatchEvaluateWorkspacePermissionsInput extends TeaModel {
    /**
     * <p>RAM List 类 action 列表；支持带 agentrun: 前缀或不带（服务端归一化）；顺序与每条 permissions 一致；上限 20 条</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("actions")
    public java.util.List<String> actions;

    /**
     * <p>Workspace 资源 ID 列表（UUID 字符串）；顺序与响应 results 一致；上限 50 条</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceIds")
    public java.util.List<String> workspaceIds;

    public static BatchEvaluateWorkspacePermissionsInput build(java.util.Map<String, ?> map) throws Exception {
        BatchEvaluateWorkspacePermissionsInput self = new BatchEvaluateWorkspacePermissionsInput();
        return TeaModel.build(map, self);
    }

    public BatchEvaluateWorkspacePermissionsInput setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

    public BatchEvaluateWorkspacePermissionsInput setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
