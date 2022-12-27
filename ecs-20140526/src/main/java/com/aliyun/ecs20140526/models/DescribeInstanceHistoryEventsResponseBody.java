// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsResponseBody extends TeaModel {
    // Details about the instance system events.
    @NameInMap("InstanceSystemEventSet")
    public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet instanceSystemEventSet;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of instances.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceHistoryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsResponseBody self = new DescribeInstanceHistoryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHistoryEventsResponseBody setInstanceSystemEventSet(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet instanceSystemEventSet) {
        this.instanceSystemEventSet = instanceSystemEventSet;
        return this;
    }
    public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet getInstanceSystemEventSet() {
        return this.instanceSystemEventSet;
    }

    public DescribeInstanceHistoryEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceHistoryEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceHistoryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceHistoryEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus extends TeaModel {
        // The state code of the system event.
        @NameInMap("Code")
        public Integer code;

        // The state name of the system event.
        @NameInMap("Name")
        public String name;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType extends TeaModel {
        // The code of the system event type.
        @NameInMap("Code")
        public Integer code;

        // The name of the system event type.
        @NameInMap("Name")
        public String name;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk extends TeaModel {
        // The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The category of the disk. Valid values:
        // 
        // *   cloud: basic disk
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: enhanced SSD (ESSD)
        // *   local_ssd_pro: I/O-intensive local disk
        // *   local_hdd_pro: throughput-intensive local disk
        // *   ephemeral: retired local disk
        // *   ephemeral_ssd: retired local SSD
        @NameInMap("DeviceCategory")
        public String deviceCategory;

        // The size of the disk. Unit: GiB.
        @NameInMap("DeviceSize")
        public String deviceSize;

        // The type of the disk. Valid values:
        // 
        // *   system: system disk
        // *   data: data disk
        @NameInMap("DeviceType")
        public String deviceType;

        // The time when the disk was released. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("ReleaseTime")
        public String releaseTime;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        public java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks setInactiveDisk(java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk) {
            this.inactiveDisk = inactiveDisk;
            return this;
        }
        public java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> getInactiveDisk() {
            return this.inactiveDisk;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions extends TeaModel {
        @NameInMap("MigrationOption")
        public java.util.List<String> migrationOption;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions setMigrationOption(java.util.List<String> migrationOption) {
            this.migrationOption = migrationOption;
            return this;
        }
        public java.util.List<String> getMigrationOption() {
            return this.migrationOption;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extends TeaModel {
        // The device name of the local disk.
        @NameInMap("Device")
        public String device;

        // The ID of the local disk.
        @NameInMap("DiskId")
        public String diskId;

        // The ID of the host.
        @NameInMap("HostId")
        public String hostId;

        // The type of the host. Valid values:
        // 
        // - ddh: dedicated host
        // - managehost: physical machine in a smart hosting pool
        @NameInMap("HostType")
        public String hostType;

        // Details about the inactive cloud disks or local disks that have been released and must be removed.
        @NameInMap("InactiveDisks")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks;

        // The migration solution of the instance. Valid value: MigrationPlan. Instances can be migrated only by using migration plans.
        @NameInMap("MigrationOptions")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions migrationOptions;

        // The online repair policy of the damaged disk. Valid value: IsolateOnly, which indicates that damaged disks are isolated but not repaired.
        @NameInMap("OnlineRepairPolicy")
        public String onlineRepairPolicy;

        // The rack number of the cloud box.
        @NameInMap("Rack")
        public String rack;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setInactiveDisks(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks) {
            this.inactiveDisks = inactiveDisks;
            return this;
        }
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setMigrationOptions(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions migrationOptions) {
            this.migrationOptions = migrationOptions;
            return this;
        }
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions getMigrationOptions() {
            return this.migrationOptions;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setOnlineRepairPolicy(String onlineRepairPolicy) {
            this.onlineRepairPolicy = onlineRepairPolicy;
            return this;
        }
        public String getOnlineRepairPolicy() {
            return this.onlineRepairPolicy;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setRack(String rack) {
            this.rack = rack;
            return this;
        }
        public String getRack() {
            return this.rack;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType extends TeaModel {
        // The lifecycle state of the system event.
        @NameInMap("EventCycleStatus")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus eventCycleStatus;

        // The time when the system event ended. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        // The ID of the system event.
        @NameInMap("EventId")
        public String eventId;

        // The time when the system event was published. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        // The type of the system event.
        @NameInMap("EventType")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType eventType;

        // The extended attribute of the system event.
        @NameInMap("ExtendedAttribute")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extendedAttribute;

        // The impact level of the system event.
        @NameInMap("ImpactLevel")
        public String impactLevel;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The scheduled start time of the system event. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("NotBefore")
        public String notBefore;

        // The reason why the system event was scheduled.
        @NameInMap("Reason")
        public String reason;

        // The type of the resource. Valid values:
        // 
        // *   instance: ECS instance
        // *   ddh: dedicated host
        // *   managehost: physical machine in a smart hosting pool
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setEventCycleStatus(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setEventType(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType getEventType() {
            return this.eventType;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setExtendedAttribute(DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet extends TeaModel {
        @NameInMap("InstanceSystemEventType")
        public java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType> instanceSystemEventType;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet setInstanceSystemEventType(java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType> instanceSystemEventType) {
            this.instanceSystemEventType = instanceSystemEventType;
            return this;
        }
        public java.util.List<DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType> getInstanceSystemEventType() {
            return this.instanceSystemEventType;
        }

    }

}
