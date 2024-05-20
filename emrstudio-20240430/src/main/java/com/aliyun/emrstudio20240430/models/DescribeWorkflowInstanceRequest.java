// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeWorkflowInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowInstanceRequest self = new DescribeWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
