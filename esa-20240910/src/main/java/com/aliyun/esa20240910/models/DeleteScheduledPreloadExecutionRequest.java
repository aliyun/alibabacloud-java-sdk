// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteScheduledPreloadExecutionRequest extends TeaModel {
    /**
     * <p>The ID of the prefetch plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DeleteScheduledPreloadExecution</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteScheduledPreloadExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPreloadExecutionRequest self = new DeleteScheduledPreloadExecutionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPreloadExecutionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
