// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DiskFullStatusSet")
    public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSet> diskFullStatusSet;

    public static DescribeDisksFullStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusResponseBody self = new DescribeDisksFullStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeDisksFullStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksFullStatusResponseBody setDiskFullStatusSet(java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSet> diskFullStatusSet) {
        this.diskFullStatusSet = diskFullStatusSet;
        return this;
    }
    public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSet> getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet extends TeaModel {
        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventEndTime")
        public String eventEndTime;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("ImpactLevel")
        public String impactLevel;

        @NameInMap("EventType")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType eventType;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet setEventEndTime(String eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet setEventType(DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSetEventType getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseBodyDiskFullStatusSet extends TeaModel {
        @NameInMap("Status")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus status;

        @NameInMap("DiskEventSet")
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet> diskEventSet;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("HealthStatus")
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus healthStatus;

        public static DescribeDisksFullStatusResponseBodyDiskFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseBodyDiskFullStatusSet self = new DescribeDisksFullStatusResponseBodyDiskFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setStatus(DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus status) {
            this.status = status;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetStatus getStatus() {
            return this.status;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setDiskEventSet(java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet> diskEventSet) {
            this.diskEventSet = diskEventSet;
            return this;
        }
        public java.util.List<DescribeDisksFullStatusResponseBodyDiskFullStatusSetDiskEventSet> getDiskEventSet() {
            return this.diskEventSet;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksFullStatusResponseBodyDiskFullStatusSet setHealthStatus(DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeDisksFullStatusResponseBodyDiskFullStatusSetHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

    }

}
