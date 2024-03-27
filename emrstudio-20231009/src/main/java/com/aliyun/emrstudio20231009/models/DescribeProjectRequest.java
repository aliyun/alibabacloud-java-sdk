// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeProjectRequest extends TeaModel {
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectRequest self = new DescribeProjectRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
