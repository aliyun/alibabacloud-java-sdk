// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddQueueRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("QueueName")
    public String queueName;

    public static AddQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        AddQueueRequest self = new AddQueueRequest();
        return TeaModel.build(map, self);
    }

    public AddQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
