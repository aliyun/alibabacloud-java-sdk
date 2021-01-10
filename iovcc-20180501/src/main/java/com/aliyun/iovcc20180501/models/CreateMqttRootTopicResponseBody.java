// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateMqttRootTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueueName")
    public String queueName;

    public static CreateMqttRootTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMqttRootTopicResponseBody self = new CreateMqttRootTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMqttRootTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMqttRootTopicResponseBody setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
