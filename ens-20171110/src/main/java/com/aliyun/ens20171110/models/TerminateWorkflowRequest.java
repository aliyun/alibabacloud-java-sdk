// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TerminateWorkflowRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public java.util.List<String> workflowIds;

    public static TerminateWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowRequest self = new TerminateWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowRequest setWorkflowIds(java.util.List<String> workflowIds) {
        this.workflowIds = workflowIds;
        return this;
    }
    public java.util.List<String> getWorkflowIds() {
        return this.workflowIds;
    }

}
