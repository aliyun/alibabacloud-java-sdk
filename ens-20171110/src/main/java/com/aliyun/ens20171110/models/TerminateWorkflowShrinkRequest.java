// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TerminateWorkflowShrinkRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public String workflowIdsShrink;

    public static TerminateWorkflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowShrinkRequest self = new TerminateWorkflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
