// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackWorkflowShrinkRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public String workflowIdsShrink;

    public static RollbackWorkflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowShrinkRequest self = new RollbackWorkflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
