// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListQueuesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("QueueNames")
    public String queueNamesShrink;

    public static ListQueuesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesShrinkRequest self = new ListQueuesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListQueuesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListQueuesShrinkRequest setQueueNamesShrink(String queueNamesShrink) {
        this.queueNamesShrink = queueNamesShrink;
        return this;
    }
    public String getQueueNamesShrink() {
        return this.queueNamesShrink;
    }

}
