// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadExecutionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Executions")
    public String executionsShrink;

    /**
     * <strong>example:</strong>
     * <p>CreateScheduledPreloadExecutions</p>
     */
    @NameInMap("Id")
    public String id;

    public static CreateScheduledPreloadExecutionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadExecutionsShrinkRequest self = new CreateScheduledPreloadExecutionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadExecutionsShrinkRequest setExecutionsShrink(String executionsShrink) {
        this.executionsShrink = executionsShrink;
        return this;
    }
    public String getExecutionsShrink() {
        return this.executionsShrink;
    }

    public CreateScheduledPreloadExecutionsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
