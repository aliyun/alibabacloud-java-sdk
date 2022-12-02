// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateEventDefinitionRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateEventDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventDefinitionRequest self = new UpdateEventDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventDefinitionRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public UpdateEventDefinitionRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public UpdateEventDefinitionRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public UpdateEventDefinitionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEventDefinitionRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
