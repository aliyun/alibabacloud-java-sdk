// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetsStatisticsRequest extends TeaModel {
    // WorkspaceId
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetsStatisticsRequest self = new GetDatasetsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetsStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
