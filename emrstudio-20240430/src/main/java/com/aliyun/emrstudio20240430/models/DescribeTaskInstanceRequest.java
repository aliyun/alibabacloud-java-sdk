// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeTaskInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInstanceRequest self = new DescribeTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
