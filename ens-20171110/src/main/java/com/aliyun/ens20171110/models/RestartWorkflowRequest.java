// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartWorkflowRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public java.util.List<String> workflowIds;

    public static RestartWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowRequest self = new RestartWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowRequest setWorkflowIds(java.util.List<String> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<String> getWorkflowIds() {
        return this.workflowIds;
    }

}
