// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeManualTaskRequest extends TeaModel {
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeManualTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskRequest self = new DescribeManualTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
