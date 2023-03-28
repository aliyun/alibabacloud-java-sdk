// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponseBody extends TeaModel {
    @NameInMap("DiskFullStatusSet")
    public DescribeDisksFullStatusResponseBodyDiskFullStatusSet diskFullStatusSet;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Code")
        public Integer code;

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
        @NameInMap("EventEndTime")
        public String eventEndTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("EventType")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType eventType;

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
        @NameInMap("Code")
        public Integer code;

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
        @NameInMap("Code")
        public Integer code;

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
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskEventSet")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeDiskEventSet diskEventSet;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("HealthStatus")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskFullStatusTypeHealthStatus healthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

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
