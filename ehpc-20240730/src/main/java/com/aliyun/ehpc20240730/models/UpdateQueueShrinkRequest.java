// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateQueueShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Queue")
    public String queueShrink;

    public static UpdateQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueShrinkRequest self = new UpdateQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueueShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateQueueShrinkRequest setQueueShrink(String queueShrink) {
        this.queueShrink = queueShrink;
        return this;
    }
    public String getQueueShrink() {
        return this.queueShrink;
    }

}
