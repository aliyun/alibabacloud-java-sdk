// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RetryWorkflowRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public java.util.List<String> workflowIds;

    public static RetryWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowRequest self = new RetryWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowRequest setWorkflowIds(java.util.List<String> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<String> getWorkflowIds() {
        return this.workflowIds;
    }

}
