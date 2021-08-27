// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("InstanceFullStatusSet")
    public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet instanceFullStatusSet;

    public static DescribeInstancesFullStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusResponseBody self = new DescribeInstancesFullStatusResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeInstancesFullStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesFullStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesFullStatusResponseBody setInstanceFullStatusSet(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet instanceFullStatusSet) {
        this.instanceFullStatusSet = instanceFullStatusSet;
        return this;
    }
    public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public Integer code;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public Integer code;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeviceSize")
        public String deviceSize;

        @NameInMap("DeviceCategory")
        public String deviceCategory;

        @NameInMap("DeviceType")
        public String deviceType;

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

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
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
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskId")
        public String diskId;

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
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("NotBefore")
        public String notBefore;

        @NameInMap("ImpactLevel")
        public String impactLevel;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("EventCycleStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus;

        @NameInMap("EventType")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType eventType;

        @NameInMap("ExtendedAttribute")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extendedAttribute;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventCycleStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
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
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public Integer code;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public Integer code;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ScheduledSystemEventSet")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet scheduledSystemEventSet;

        @NameInMap("Status")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeStatus status;

        @NameInMap("HealthStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType();
            return TeaModel.build(map, self);
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

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusType setHealthStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetInstanceFullStatusTypeHealthStatus getHealthStatus() {
            return this.healthStatus;
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
