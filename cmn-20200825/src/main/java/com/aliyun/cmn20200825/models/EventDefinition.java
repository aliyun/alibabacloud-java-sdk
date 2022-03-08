// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class EventDefinition extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 事件项ID
    @NameInMap("EventId")
    public String eventId;

    // 事件名称
    @NameInMap("EventName")
    public String eventName;

    // 事件大类
    @NameInMap("EventType")
    public String eventType;

    // 自动化模板ID
    @NameInMap("TemplateId")
    public String templateId;

    // 修改时间
    @NameInMap("UpdateTime")
    public String updateTime;

    public static EventDefinition build(java.util.Map<String, ?> map) throws Exception {
        EventDefinition self = new EventDefinition();
        return TeaModel.build(map, self);
    }

    public EventDefinition setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public EventDefinition setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventDefinition setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public EventDefinition setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public EventDefinition setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EventDefinition setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
