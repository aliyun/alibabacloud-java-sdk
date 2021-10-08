// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateMessageRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageRequest self = new CreateMessageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
