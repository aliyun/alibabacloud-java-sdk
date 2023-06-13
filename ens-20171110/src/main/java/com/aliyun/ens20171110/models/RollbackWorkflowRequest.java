// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackWorkflowRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public java.util.List<String> workflowIds;

    public static RollbackWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowRequest self = new RollbackWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowRequest setWorkflowIds(java.util.List<String> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<String> getWorkflowIds() {
        return this.workflowIds;
    }

}
