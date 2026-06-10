// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetQueueRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>comp</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    public static GetQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueRequest self = new GetQueueRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
