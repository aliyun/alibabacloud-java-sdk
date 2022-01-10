// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetImagesStatisticsRequest extends TeaModel {
    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetImagesStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImagesStatisticsRequest self = new GetImagesStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetImagesStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
