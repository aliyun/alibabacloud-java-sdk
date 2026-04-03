// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BatchEvaluateWorkspacePermissionsOutput extends TeaModel {
    /**
     * <p>各 workspace 的权限校验结果列表；顺序与请求 workspaceIds 一致</p>
     */
    @NameInMap("results")
    public java.util.List<WorkspacePermissionEvaluateResult> results;

    public static BatchEvaluateWorkspacePermissionsOutput build(java.util.Map<String, ?> map) throws Exception {
        BatchEvaluateWorkspacePermissionsOutput self = new BatchEvaluateWorkspacePermissionsOutput();
        return TeaModel.build(map, self);
    }

    public BatchEvaluateWorkspacePermissionsOutput setResults(java.util.List<WorkspacePermissionEvaluateResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<WorkspacePermissionEvaluateResult> getResults() {
        return this.results;
    }

}
