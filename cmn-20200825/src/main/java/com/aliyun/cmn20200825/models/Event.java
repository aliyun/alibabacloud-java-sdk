// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Event extends TeaModel {
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    @NameInMap("Count")
    public Long count;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventObject")
    public String eventObject;

    @NameInMap("EventObjectId")
    public String eventObjectId;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResourceDevice")
    public EventResourceDevice resourceDevice;

    @NameInMap("TemplateId")
    public String templateId;

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
        @NameInMap("HostName")
        public String hostName;

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
