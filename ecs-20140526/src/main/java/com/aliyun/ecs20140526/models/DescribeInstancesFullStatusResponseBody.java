// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusResponseBody extends TeaModel {
    /**
     * <p>The queried instances.</p>
     * <br>
     * <p>>  If no instances exist, this parameter is empty.</p>
     */
    @NameInMap("InstanceFullStatusSet")
    public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet instanceFullStatusSet;

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
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesFullStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusResponseBody self = new DescribeInstancesFullStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesFullStatusResponseBody setInstanceFullStatusSet(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet instanceFullStatusSet) {
        this.instanceFullStatusSet = instanceFullStatusSet;
        return this;
    }
    public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    public DescribeInstancesFullStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesFullStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesFullStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesFullStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus extends TeaModel {
        /**
         * <p>The code of the health state.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The name of the health state.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus extends TeaModel {
        /**
         * <p>The code of the system event state.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The name of the system event state.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType extends TeaModel {
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

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk extends TeaModel {
        /**
         * <p>The time when the disk was created. The time follows the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <br>
         * <p>*   cloud: basic disk</p>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: standard SSD</p>
         * <p>*   cloud_essd: Enterprise SSD (ESSD)</p>
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
         * <p>*   system</p>
         * <p>*   data</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the disk was released. The time follows the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks setInactiveDisk(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk) {
            this.inactiveDisk = inactiveDisk;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> getInactiveDisk() {
            return this.inactiveDisk;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extends TeaModel {
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
         * <p>The inactive disks that have been released and must be cleared.</p>
         */
        @NameInMap("InactiveDisks")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setInactiveDisks(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks) {
            this.inactiveDisks = inactiveDisks;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType extends TeaModel {
        /**
         * <p>The state of the system event.</p>
         */
        @NameInMap("EventCycleStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus;

        /**
         * <p>The system event ID.</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time when the system event was published. The time is displayed in UTC.</p>
         */
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        /**
         * <p>The type of the system event.</p>
         */
        @NameInMap("EventType")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType eventType;

        /**
         * <p>The extended attributes of system events generated for instances that have local disks attached.</p>
         * <br>
         * <p>The return values vary based on the system event type.</p>
         * <br>
         * <p>If the system event type is not one of the following types, this parameter is empty:</p>
         * <br>
         * <p>*   SystemMaintenance.StopAndRepair</p>
         * <p>*   SystemMaintenance.CleanInactiveDisks</p>
         * <p>*   SecurityPunish.Locked</p>
         * <p>*   SecurityPunish.WebsiteBanned</p>
         * <p>*   SystemUpgrade.Migrate</p>
         * <p>*   SystemMaintenance.RebootAndIsolateErrorDisk</p>
         * <p>*   SystemMaintenance.RebootAndReInitErrorDisk</p>
         * <p>*   SystemMaintenance.ReInitErrorDisk</p>
         * <p>*   SystemMaintenance.IsolateErrorDisk</p>
         */
        @NameInMap("ExtendedAttribute")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extendedAttribute;

        /**
         * <p>The impact level of the system event.</p>
         * <br>
         * <p>>  If the user is not in a whitelist, this parameter is empty.</p>
         */
        @NameInMap("ImpactLevel")
        public String impactLevel;

        /**
         * <p>The scheduled time at which to execute the O\\&M task related to the system event. The time is displayed in UTC.</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The reason why the system event was scheduled.</p>
         * <br>
         * <p>>  If the exception cause is not detected, this parameter is empty.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventCycleStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventType(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType getEventType() {
            return this.eventType;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setExtendedAttribute(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet extends TeaModel {
        @NameInMap("ScheduledSystemEventType")
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> scheduledSystemEventType;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet setScheduledSystemEventType(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> scheduledSystemEventType) {
            this.scheduledSystemEventType = scheduledSystemEventType;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> getScheduledSystemEventType() {
            return this.scheduledSystemEventType;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus extends TeaModel {
        /**
         * <p>The code of the instance lifecycle state.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The name of the instance lifecycle state.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType extends TeaModel {
        /**
         * <p>The health state of the instance.</p>
         */
        @NameInMap("HealthStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The system events that are in the Scheduled or Inquiring state.</p>
         */
        @NameInMap("ScheduledSystemEventSet")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet scheduledSystemEventSet;

        /**
         * <p>The lifecycle state of the instance.</p>
         */
        @NameInMap("Status")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus status;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType setHealthStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType setScheduledSystemEventSet(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet scheduledSystemEventSet) {
            this.scheduledSystemEventSet = scheduledSystemEventSet;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet getScheduledSystemEventSet() {
            return this.scheduledSystemEventSet;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType setStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus status) {
            this.status = status;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet extends TeaModel {
        @NameInMap("InstanceFullStatusType")
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType> instanceFullStatusType;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet setInstanceFullStatusType(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType> instanceFullStatusType) {
            this.instanceFullStatusType = instanceFullStatusType;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType> getInstanceFullStatusType() {
            return this.instanceFullStatusType;
        }

    }

}
