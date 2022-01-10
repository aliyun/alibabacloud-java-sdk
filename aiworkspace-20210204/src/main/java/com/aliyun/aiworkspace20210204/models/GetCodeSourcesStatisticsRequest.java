// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetCodeSourcesStatisticsRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCodeSourcesStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourcesStatisticsRequest self = new GetCodeSourcesStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeSourcesStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
