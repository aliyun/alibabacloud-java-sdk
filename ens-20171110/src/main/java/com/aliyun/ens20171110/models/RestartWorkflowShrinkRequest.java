// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartWorkflowShrinkRequest extends TeaModel {
    @NameInMap("WorkflowIds")
    public String workflowIdsShrink;

    public static RestartWorkflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowShrinkRequest self = new RestartWorkflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowShrinkRequest setWorkflowIdsShrink(String workflowIdsShrink) {
        this.workflowIdsShrink = workflowIdsShrink;
        return this;
    }
    public String getWorkflowIdsShrink() {
        return this.workflowIdsShrink;
    }

}
