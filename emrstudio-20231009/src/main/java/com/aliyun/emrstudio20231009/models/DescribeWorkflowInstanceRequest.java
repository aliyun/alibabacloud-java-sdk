// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceRequest extends TeaModel {
    @NameInMap("workspaceId")
    public Long workspaceId;

    public static DescribeWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowInstanceRequest self = new DescribeWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowInstanceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
