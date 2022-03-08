// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteEventDefinitionRequest extends TeaModel {
    // 事件ID
    @NameInMap("EventId")
    public String eventId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteEventDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventDefinitionRequest self = new DeleteEventDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventDefinitionRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DeleteEventDefinitionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
