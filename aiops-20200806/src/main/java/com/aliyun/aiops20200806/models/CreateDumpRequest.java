// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateDumpRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDumpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDumpRequest self = new CreateDumpRequest();
        return TeaModel.build(map, self);
    }

    public CreateDumpRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateDumpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
