// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UnbindQueueRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("queueName")
    public String queueName;

    public static UnbindQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindQueueRequest self = new UnbindQueueRequest();
        return TeaModel.build(map, self);
    }

    public UnbindQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
