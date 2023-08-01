// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>The information about instance system events.</p>
     */
    @NameInMap("InstanceSystemEventSet")
    public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSet instanceSystemEventSet;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances returned.</p>
     */
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
        /**
         * <p>The state code of the system event.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The state name of the system event.</p>
         */
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
        /**
         * <p>The code of the system event type.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The name of the system event type.</p>
         */
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
        /**
         * <p>The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         * <p>*   local_ssd_pro: I/O-intensive local disk</p>
         * <p>*   local_hdd_pro: throughput-intensive local disk</p>
         * <p>*   ephemeral: retired local disk</p>
         * <p>*   ephemeral_ssd: retired local SSD</p>
         */
        @NameInMap("DeviceCategory")
        public String deviceCategory;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         */
        @NameInMap("DeviceSize")
        public String deviceSize;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <br>
         * <p>*   system: system disk</p>
         * <p>*   data: data disk</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the disk was released. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
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
        /**
         * <p>Indicates whether the event can be handled.</p>
         */
        @NameInMap("CanAccept")
        public String canAccept;

        /**
         * <p>The code of the security violation.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The device name of the local disk.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The ID of the local disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The type of the host. Valid values:</p>
         * <br>
         * <p>- ddh: dedicated host</p>
         * <p>- managehost: physical machine in a smart hosting pool</p>
         */
        @NameInMap("HostType")
        public String hostType;

        /**
         * <p>The information about the inactive disks that have been released and must be cleared.</p>
         */
        @NameInMap("InactiveDisks")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks;

        /**
         * <p>The migration solution of the instance. Valid value: MigrationPlan, which indicates that instances can be migrated only by using migration plans.</p>
         */
        @NameInMap("MigrationOptions")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeMigrationOptions migrationOptions;

        /**
         * <p>The online repair policy for the damaged disk. Valid value: IsolateOnly, which indicates that damaged disks are isolated but not repaired.</p>
         */
        @NameInMap("OnlineRepairPolicy")
        public String onlineRepairPolicy;

        /**
         * <p>The illegal domain name.</p>
         */
        @NameInMap("PunishDomain")
        public String punishDomain;

        /**
         * <p>The type of the penalty.</p>
         */
        @NameInMap("PunishType")
        public String punishType;

        /**
         * <p>The illegal URL.</p>
         */
        @NameInMap("PunishUrl")
        public String punishUrl;

        /**
         * <p>The rack number of the cloud box.</p>
         */
        @NameInMap("Rack")
        public String rack;

        @NameInMap("ResponseResult")
        public String responseResult;

        public static DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute self = new DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setCanAccept(String canAccept) {
            this.canAccept = canAccept;
            return this;
        }
        public String getCanAccept() {
            return this.canAccept;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setPunishDomain(String punishDomain) {
            this.punishDomain = punishDomain;
            return this;
        }
        public String getPunishDomain() {
            return this.punishDomain;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setPunishType(String punishType) {
            this.punishType = punishType;
            return this;
        }
        public String getPunishType() {
            return this.punishType;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setPunishUrl(String punishUrl) {
            this.punishUrl = punishUrl;
            return this;
        }
        public String getPunishUrl() {
            return this.punishUrl;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setRack(String rack) {
            this.rack = rack;
            return this;
        }
        public String getRack() {
            return this.rack;
        }

        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute setResponseResult(String responseResult) {
            this.responseResult = responseResult;
            return this;
        }
        public String getResponseResult() {
            return this.responseResult;
        }

    }

    public static class DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventType extends TeaModel {
        /**
         * <p>The lifecycle state of the system event.</p>
         */
        @NameInMap("EventCycleStatus")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus eventCycleStatus;

        /**
         * <p>The time when the system event ended. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        /**
         * <p>The ID of the system event.</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time when the system event was published. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        /**
         * <p>The type of the system event.</p>
         */
        @NameInMap("EventType")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeEventType eventType;

        /**
         * <p>The extended attribute of the system event.</p>
         */
        @NameInMap("ExtendedAttribute")
        public DescribeInstanceHistoryEventsResponseBodyInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extendedAttribute;

        /**
         * <p>The impact level of the system event.</p>
         */
        @NameInMap("ImpactLevel")
        public String impactLevel;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The scheduled start time of the system event. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The reason why the system event was scheduled.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <br>
         * <p>*   instance: ECS instance</p>
         * <p>*   ddh: dedicated host</p>
         * <p>*   managehost: physical machine in a smart hosting pool</p>
         */
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
