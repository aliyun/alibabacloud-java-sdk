// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RocketMQ extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TopicName")
    public String topicName;

    public static RocketMQ build(java.util.Map<String, ?> map) throws Exception {
        RocketMQ self = new RocketMQ();
        return TeaModel.build(map, self);
    }

    public RocketMQ setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public RocketMQ setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RocketMQ setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
