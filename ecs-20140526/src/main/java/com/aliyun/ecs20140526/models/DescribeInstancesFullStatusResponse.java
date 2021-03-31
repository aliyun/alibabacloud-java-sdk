// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("InstanceFullStatusSet")
    @Validation(required = true)
    public DescribeInstancesFullStatusResponseInstanceFullStatusSet instanceFullStatusSet;

    public static DescribeInstancesFullStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusResponse self = new DescribeInstancesFullStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesFullStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesFullStatusResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesFullStatusResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesFullStatusResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesFullStatusResponse setInstanceFullStatusSet(DescribeInstancesFullStatusResponseInstanceFullStatusSet instanceFullStatusSet) {
        this.instanceFullStatusSet = instanceFullStatusSet;
        return this;
    }
    public DescribeInstancesFullStatusResponseInstanceFullStatusSet getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ReleaseTime")
        @Validation(required = true)
        public String releaseTime;

        @NameInMap("DeviceType")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("DeviceCategory")
        @Validation(required = true)
        public String deviceCategory;

        @NameInMap("DeviceSize")
        @Validation(required = true)
        public String deviceSize;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks setInactiveDisk(java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk) {
            this.inactiveDisk = inactiveDisk;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> getInactiveDisk() {
            return this.inactiveDisk;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("InactiveDisks")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute setInactiveDisks(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks) {
            this.inactiveDisks = inactiveDisks;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("EventPublishTime")
        @Validation(required = true)
        public String eventPublishTime;

        @NameInMap("NotBefore")
        @Validation(required = true)
        public String notBefore;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("ImpactLevel")
        @Validation(required = true)
        public String impactLevel;

        @NameInMap("EventCycleStatus")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus;

        @NameInMap("EventType")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType eventType;

        @NameInMap("ExtendedAttribute")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extendedAttribute;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventCycleStatus(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setEventType(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeEventType getEventType() {
            return this.eventType;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType setExtendedAttribute(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet extends TeaModel {
        @NameInMap("ScheduledSystemEventType")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> scheduledSystemEventType;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet setScheduledSystemEventType(java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> scheduledSystemEventType) {
            this.scheduledSystemEventType = scheduledSystemEventType;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> getScheduledSystemEventType() {
            return this.scheduledSystemEventType;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("ScheduledSystemEventSet")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet scheduledSystemEventSet;

        @NameInMap("Status")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus status;

        @NameInMap("HealthStatus")
        @Validation(required = true)
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType setScheduledSystemEventSet(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet scheduledSystemEventSet) {
            this.scheduledSystemEventSet = scheduledSystemEventSet;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet getScheduledSystemEventSet() {
            return this.scheduledSystemEventSet;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType setStatus(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus status) {
            this.status = status;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeStatus getStatus() {
            return this.status;
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType setHealthStatus(DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSet extends TeaModel {
        @NameInMap("InstanceFullStatusType")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType> instanceFullStatusType;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSet self = new DescribeInstancesFullStatusResponseInstanceFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseInstanceFullStatusSet setInstanceFullStatusType(java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType> instanceFullStatusType) {
            this.instanceFullStatusType = instanceFullStatusType;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType> getInstanceFullStatusType() {
            return this.instanceFullStatusType;
        }

    }

}
