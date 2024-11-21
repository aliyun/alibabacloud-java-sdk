// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopScheduledPreloadExecutionRequest extends TeaModel {
    /**
     * <p>The ID of the prefetch plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StopScheduledPreloadExecution</p>
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
