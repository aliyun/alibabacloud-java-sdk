// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteQueuesShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The queues that you want to delete.</p>
     */
    @NameInMap("QueueNames")
    public String queueNamesShrink;

    public static DeleteQueuesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueuesShrinkRequest self = new DeleteQueuesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQueuesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteQueuesShrinkRequest setQueueNamesShrink(String queueNamesShrink) {
        this.queueNamesShrink = queueNamesShrink;
        return this;
    }
    public String getQueueNamesShrink() {
        return this.queueNamesShrink;
    }

}
