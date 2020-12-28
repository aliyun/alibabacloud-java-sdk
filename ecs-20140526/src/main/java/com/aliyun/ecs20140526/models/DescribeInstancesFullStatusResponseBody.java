// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("InstanceFullStatusSet")
    public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet> instanceFullStatusSet;

    public static DescribeInstancesFullStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusResponseBody self = new DescribeInstancesFullStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesFullStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeInstancesFullStatusResponseBody setInstanceFullStatusSet(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet> instanceFullStatusSet) {
        this.instanceFullStatusSet = instanceFullStatusSet;
        return this;
    }
    public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet> getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeviceCategory")
        public String deviceCategory;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("DeviceSize")
        public String deviceSize;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("InactiveDisks")
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks> inactiveDisks;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute setInactiveDisks(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks> inactiveDisks) {
            this.inactiveDisks = inactiveDisks;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttributeInactiveDisks> getInactiveDisks() {
            return this.inactiveDisks;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet extends TeaModel {
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("ImpactLevel")
        public String impactLevel;

        @NameInMap("EventType")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType eventType;

        @NameInMap("ExtendedAttribute")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute extendedAttribute;

        @NameInMap("NotBefore")
        public String notBefore;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("EventCycleStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus eventCycleStatus;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setEventType(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventType getEventType() {
            return this.eventType;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setExtendedAttribute(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet setEventCycleStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSetEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet extends TeaModel {
        @NameInMap("Status")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus status;

        @NameInMap("ScheduledSystemEventSet")
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet> scheduledSystemEventSet;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("HealthStatus")
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus healthStatus;

        public static DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet self = new DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet setStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus status) {
            this.status = status;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetStatus getStatus() {
            return this.status;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet setScheduledSystemEventSet(java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet> scheduledSystemEventSet) {
            this.scheduledSystemEventSet = scheduledSystemEventSet;
            return this;
        }
        public java.util.List<DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetScheduledSystemEventSet> getScheduledSystemEventSet() {
            return this.scheduledSystemEventSet;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSet setHealthStatus(DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeInstancesFullStatusResponseBodyInstanceFullStatusSetHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

    }

}
