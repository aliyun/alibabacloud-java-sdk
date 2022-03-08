// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateEventDefinitionRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 事件名称
    @NameInMap("EventName")
    public String eventName;

    // 事件大类
    @NameInMap("EventType")
    public String eventType;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 自动化模板ID
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateEventDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventDefinitionRequest self = new CreateEventDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventDefinitionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEventDefinitionRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CreateEventDefinitionRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public CreateEventDefinitionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEventDefinitionRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
