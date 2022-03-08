// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Event extends TeaModel {
    // 事件告警状态
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    // 发生次数
    @NameInMap("Count")
    public Long count;

    // 事件发生时间
    @NameInMap("CreateTime")
    public String createTime;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 事件名称
    @NameInMap("EventName")
    public String eventName;

    // 事件对象
    @NameInMap("EventObject")
    public String eventObject;

    // 事件对象ID
    @NameInMap("EventObjectId")
    public String eventObjectId;

    // 事件类型
    @NameInMap("EventType")
    public String eventType;

    // 事件内容
    @NameInMap("Message")
    public String message;

    // 设备
    @NameInMap("ResourceDevice")
    public EventResourceDevice resourceDevice;

    // 自动化模板ID
    @NameInMap("TemplateId")
    public String templateId;

    // 事件更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Event build(java.util.Map<String, ?> map) throws Exception {
        Event self = new Event();
        return TeaModel.build(map, self);
    }

    public Event setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public Event setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public Event setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Event setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public Event setEventObject(String eventObject) {
        this.eventObject = eventObject;
        return this;
    }
    public String getEventObject() {
        return this.eventObject;
    }

    public Event setEventObjectId(String eventObjectId) {
        this.eventObjectId = eventObjectId;
        return this;
    }
    public String getEventObjectId() {
        return this.eventObjectId;
    }

    public Event setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public Event setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Event setResourceDevice(EventResourceDevice resourceDevice) {
        this.resourceDevice = resourceDevice;
        return this;
    }
    public EventResourceDevice getResourceDevice() {
        return this.resourceDevice;
    }

    public Event setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Event setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class EventResourceDevice extends TeaModel {
        // 设备名
        @NameInMap("HostName")
        public String hostName;

        // 物理空间
        @NameInMap("PhysicalSpace")
        public String physicalSpace;

        public static EventResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            EventResourceDevice self = new EventResourceDevice();
            return TeaModel.build(map, self);
        }

        public EventResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public EventResourceDevice setPhysicalSpace(String physicalSpace) {
            this.physicalSpace = physicalSpace;
            return this;
        }
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

    }

}
