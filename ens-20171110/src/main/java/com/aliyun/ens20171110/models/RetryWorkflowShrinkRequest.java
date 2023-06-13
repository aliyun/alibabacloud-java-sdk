// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RetryWorkflowShrinkRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public String workflowIdsShrink;

    public static RetryWorkflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowShrinkRequest self = new RetryWorkflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
