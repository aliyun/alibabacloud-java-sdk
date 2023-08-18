// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BindQueueRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("queueName")
    public String queueName;

    public static BindQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        BindQueueRequest self = new BindQueueRequest();
        return TeaModel.build(map, self);
    }

    public BindQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
