// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetRoleStatisticsRequest extends TeaModel {
    // 工作空间 id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetRoleStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleStatisticsRequest self = new GetRoleStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
