// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateQueueShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The configurations of the queue to be created.</p>
     */
    @NameInMap("Queue")
    public String queueShrink;

    public static CreateQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueShrinkRequest self = new CreateQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateQueueShrinkRequest setQueueShrink(String queueShrink) {
        this.queueShrink = queueShrink;
        return this;
    }
    public String getQueueShrink() {
        return this.queueShrink;
    }

}
