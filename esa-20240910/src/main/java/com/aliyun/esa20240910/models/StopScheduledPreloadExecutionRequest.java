// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopScheduledPreloadExecutionRequest extends TeaModel {
    /**
     * <p>The prefetch plan ID. You can obtain this value from the SuccessExecutions[].Id field returned by CreateScheduledPreloadExecutions. Before calling this operation, create a prefetch job by calling CreateScheduledPreloadJob, and then create an execution plan by calling CreateScheduledPreloadExecutions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66599bd7397885b43804901c</p>
     */
    @NameInMap("Id")
    public String id;

    public static StopScheduledPreloadExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopScheduledPreloadExecutionRequest self = new StopScheduledPreloadExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StopScheduledPreloadExecutionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
