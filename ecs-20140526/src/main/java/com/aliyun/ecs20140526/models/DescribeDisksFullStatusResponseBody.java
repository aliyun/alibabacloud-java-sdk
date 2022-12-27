// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponseBody extends TeaModel {
    // The collection of full status information of the EBS devices.
    @NameInMap("DiskFullStatusSet")
    public DescribeDisksFullStatusResponseBodyDiskFullStatusSet diskFullStatusSet;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of EBS devices for which full status information is returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDisksFullStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusResponseBody self = new DescribeDisksFullStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusResponseBody setDiskFullStatusSet(DescribeDisksFullStatusResponseBodyDiskFullStatusSet diskFullStatusSet) {
        this.diskFullStatusSet = diskFullStatusSet;
        return this;
    }
    public DescribeDisksFullStatusResponseBodyDiskFullStatusSet getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    public DescribeDisksFullStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksFullStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksFullStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksFullStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType extends TeaModel {
        // The code of the event type.
        @NameInMap("Code")
        public Integer code;

        // The name of the event type. Valid values:
        // 
        // *   Degraded: The performance of the EBS device was degraded.
        // *   SeverelyDegraded: The performance of the EBS device was severely degraded.
        // *   Stalled: The performance of the EBS device was severely affected.
        // *   ErrorDetected: The local disk was damaged.
        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType extends TeaModel {
        // The time when the event ended.
        @NameInMap("EventEndTime")
        public String eventEndTime;

        // The ID of the event.
        @NameInMap("EventId")
        public String eventId;

        // The time when the event started.
        @NameInMap("EventTime")
        public String eventTime;

        // The event type.
        @NameInMap("EventType")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType eventType;

        // The impact level of the event.
        @NameInMap("ImpactLevel")
        public String impactLevel;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventEndTime(String eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventType(DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType getEventType() {
            return this.eventType;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet extends TeaModel {
        @NameInMap("DiskEventType")
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> diskEventType;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet setDiskEventType(java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> diskEventType) {
            this.diskEventType = diskEventType;
            return this;
        }
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> getDiskEventType() {
            return this.diskEventType;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus extends TeaModel {
        // The code of the health status of the EBS device.
        @NameInMap("Code")
        public Integer code;

        // The name of the health status of the EBS device.
        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus extends TeaModel {
        // The code of the lifecycle status of the EBS device.
        @NameInMap("Code")
        public Integer code;

        // The name of the lifecycle status of the EBS device.
        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType extends TeaModel {
        // The name of the EBS device that is attached to an instance. Example: /dev/xvdb.
        // 
        // This parameter has a value only when the value of `Status` is `In_use`.
        // 
        // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
        @NameInMap("Device")
        public String device;

        // The events about the EBS device.
        @NameInMap("DiskEventSet")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet diskEventSet;

        // The ID of the EBS device.
        @NameInMap("DiskId")
        public String diskId;

        // The health status of the EBS device.
        @NameInMap("HealthStatus")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus healthStatus;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The lifecycle status of the EBS device.
        @NameInMap("Status")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus status;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setDiskEventSet(DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet diskEventSet) {
            this.diskEventSet = diskEventSet;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet getDiskEventSet() {
            return this.diskEventSet;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setHealthStatus(DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType setStatus(DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus status) {
            this.status = status;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeStatus getStatus() {
            return this.status;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSet extends TeaModel {
        @NameInMap("DiskFullStatusType")
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType> diskFullStatusType;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSet self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setDiskFullStatusType(java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType> diskFullStatusType) {
            this.diskFullStatusType = diskFullStatusType;
            return this;
        }
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusType> getDiskFullStatusType() {
            return this.diskFullStatusType;
        }

    }

}
