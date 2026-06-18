// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StartScheduledPreloadExecutionRequest extends TeaModel {
    /**
     * <p>Prefetch plan ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3b48621bccf3fe29e1a7</p>
     */
    @NameInMap("Id")
    public String id;

    public static StartScheduledPreloadExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartScheduledPreloadExecutionRequest self = new StartScheduledPreloadExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartScheduledPreloadExecutionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
