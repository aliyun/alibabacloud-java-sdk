// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeLocalDiskRepairActivitiesResponseBody extends TeaModel {
    @NameInMap("LocalDiskRepairActivities")
    public LocalDiskRepairActivities localDiskRepairActivities;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLocalDiskRepairActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalDiskRepairActivitiesResponseBody self = new DescribeLocalDiskRepairActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLocalDiskRepairActivitiesResponseBody setLocalDiskRepairActivities(LocalDiskRepairActivities localDiskRepairActivities) {
        this.localDiskRepairActivities = localDiskRepairActivities;
        return this;
    }
    public LocalDiskRepairActivities getLocalDiskRepairActivities() {
        return this.localDiskRepairActivities;
    }

    public DescribeLocalDiskRepairActivitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLocalDiskRepairActivitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLocalDiskRepairActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLocalDiskRepairActivitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class EventType extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static EventType build(java.util.Map<String, ?> map) throws Exception {
            EventType self = new EventType();
            return TeaModel.build(map, self);
        }

        public EventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public EventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DiskEvent extends TeaModel {
        @NameInMap("EventEndTime")
        public String eventEndTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("EventType")
        public EventType eventType;

        public static DiskEvent build(java.util.Map<String, ?> map) throws Exception {
            DiskEvent self = new DiskEvent();
            return TeaModel.build(map, self);
        }

        public DiskEvent setEventEndTime(String eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        public DiskEvent setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DiskEvent setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DiskEvent setEventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public EventType getEventType() {
            return this.eventType;
        }

    }

    public static class EventCycleStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static EventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            EventCycleStatus self = new EventCycleStatus();
            return TeaModel.build(map, self);
        }

        public EventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public EventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class InstanceEventEventType extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static InstanceEventEventType build(java.util.Map<String, ?> map) throws Exception {
            InstanceEventEventType self = new InstanceEventEventType();
            return TeaModel.build(map, self);
        }

        public InstanceEventEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public InstanceEventEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ExtendedAttribute extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("OnlineRepairPolicy")
        public String onlineRepairPolicy;

        public static ExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            ExtendedAttribute self = new ExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public ExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ExtendedAttribute setOnlineRepairPolicy(String onlineRepairPolicy) {
            this.onlineRepairPolicy = onlineRepairPolicy;
            return this;
        }
        public String getOnlineRepairPolicy() {
            return this.onlineRepairPolicy;
        }

    }

    public static class InstanceEvent extends TeaModel {
        @NameInMap("EventCycleStatus")
        public EventCycleStatus eventCycleStatus;

        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        @NameInMap("EventType")
        public InstanceEventEventType eventType;

        @NameInMap("ExtendedAttribute")
        public ExtendedAttribute extendedAttribute;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Reason")
        public String reason;

        public static InstanceEvent build(java.util.Map<String, ?> map) throws Exception {
            InstanceEvent self = new InstanceEvent();
            return TeaModel.build(map, self);
        }

        public InstanceEvent setEventCycleStatus(EventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public EventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public InstanceEvent setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public InstanceEvent setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public InstanceEvent setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public InstanceEvent setEventType(InstanceEventEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public InstanceEventEventType getEventType() {
            return this.eventType;
        }

        public InstanceEvent setExtendedAttribute(ExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public InstanceEvent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstanceEvent setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class InstanceEvents extends TeaModel {
        @NameInMap("InstanceEvent")
        public java.util.List<InstanceEvent> instanceEvent;

        public static InstanceEvents build(java.util.Map<String, ?> map) throws Exception {
            InstanceEvents self = new InstanceEvents();
            return TeaModel.build(map, self);
        }

        public InstanceEvents setInstanceEvent(java.util.List<InstanceEvent> instanceEvent) {
            this.instanceEvent = instanceEvent;
            return this;
        }
        public java.util.List<InstanceEvent> getInstanceEvent() {
            return this.instanceEvent;
        }

    }

    public static class LocalDiskRepairActivity extends TeaModel {
        @NameInMap("DiskEvent")
        public DiskEvent diskEvent;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("InstanceEvents")
        public InstanceEvents instanceEvents;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Progress")
        public String progress;

        public static LocalDiskRepairActivity build(java.util.Map<String, ?> map) throws Exception {
            LocalDiskRepairActivity self = new LocalDiskRepairActivity();
            return TeaModel.build(map, self);
        }

        public LocalDiskRepairActivity setDiskEvent(DiskEvent diskEvent) {
            this.diskEvent = diskEvent;
            return this;
        }
        public DiskEvent getDiskEvent() {
            return this.diskEvent;
        }

        public LocalDiskRepairActivity setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public LocalDiskRepairActivity setInstanceEvents(InstanceEvents instanceEvents) {
            this.instanceEvents = instanceEvents;
            return this;
        }
        public InstanceEvents getInstanceEvents() {
            return this.instanceEvents;
        }

        public LocalDiskRepairActivity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public LocalDiskRepairActivity setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class LocalDiskRepairActivities extends TeaModel {
        @NameInMap("LocalDiskRepairActivity")
        public java.util.List<LocalDiskRepairActivity> localDiskRepairActivity;

        public static LocalDiskRepairActivities build(java.util.Map<String, ?> map) throws Exception {
            LocalDiskRepairActivities self = new LocalDiskRepairActivities();
            return TeaModel.build(map, self);
        }

        public LocalDiskRepairActivities setLocalDiskRepairActivity(java.util.List<LocalDiskRepairActivity> localDiskRepairActivity) {
            this.localDiskRepairActivity = localDiskRepairActivity;
            return this;
        }
        public java.util.List<LocalDiskRepairActivity> getLocalDiskRepairActivity() {
            return this.localDiskRepairActivity;
        }

    }

}
