// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowRequest extends TeaModel {
    @NameInMap("workspaceId")
    public Long workspaceId;

    public static DescribeWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowRequest self = new DescribeWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
