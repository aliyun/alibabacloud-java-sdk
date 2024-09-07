// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteQueuesRequest extends TeaModel {
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
    public java.util.List<String> queueNames;

    public static DeleteQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueuesRequest self = new DeleteQueuesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQueuesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteQueuesRequest setQueueNames(java.util.List<String> queueNames) {
        this.queueNames = queueNames;
        return this;
    }
    public java.util.List<String> getQueueNames() {
        return this.queueNames;
    }

}
