// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListQueuesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("QueueNames")
    public java.util.List<String> queueNames;

    public static ListQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesRequest self = new ListQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListQueuesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListQueuesRequest setQueueNames(java.util.List<String> queueNames) {
        this.queueNames = queueNames;
        return this;
    }
    public java.util.List<String> getQueueNames() {
        return this.queueNames;
    }

}
