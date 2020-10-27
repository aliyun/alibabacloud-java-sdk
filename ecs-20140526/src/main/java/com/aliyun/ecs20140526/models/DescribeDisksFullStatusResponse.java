// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusResponse extends TeaModel {
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

    @NameInMap("DiskFullStatusSet")
    @Validation(required = true)
    public DescribeDisksFullStatusResponseDiskFullStatusSet diskFullStatusSet;

    public static DescribeDisksFullStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusResponse self = new DescribeDisksFullStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDisksFullStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksFullStatusResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDisksFullStatusResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksFullStatusResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksFullStatusResponse setDiskFullStatusSet(DescribeDisksFullStatusResponseDiskFullStatusSet diskFullStatusSet) {
        this.diskFullStatusSet = diskFullStatusSet;
        return this;
    }
    public DescribeDisksFullStatusResponseDiskFullStatusSet getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("EventTime")
        @Validation(required = true)
        public String eventTime;

        @NameInMap("EventEndTime")
        @Validation(required = true)
        public String eventEndTime;

        @NameInMap("ImpactLevel")
        @Validation(required = true)
        public String impactLevel;

        @NameInMap("EventType")
        @Validation(required = true)
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType eventType;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventEndTime(String eventEndTime) {
            this.eventEndTime = eventEndTime;
            return this;
        }
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType setEventType(DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventTypeEventType getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet extends TeaModel {
        @NameInMap("DiskEventType")
        @Validation(required = true)
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> diskEventType;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet setDiskEventType(java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> diskEventType) {
            this.diskEventType = diskEventType;
            return this;
        }
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> getDiskEventType() {
            return this.diskEventType;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("DiskEventSet")
        @Validation(required = true)
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet diskEventSet;

        @NameInMap("Status")
        @Validation(required = true)
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus status;

        @NameInMap("HealthStatus")
        @Validation(required = true)
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus healthStatus;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setDiskEventSet(DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet diskEventSet) {
            this.diskEventSet = diskEventSet;
            return this;
        }
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet getDiskEventSet() {
            return this.diskEventSet;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setStatus(DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus status) {
            this.status = status;
            return this;
        }
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeStatus getStatus() {
            return this.status;
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType setHealthStatus(DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeHealthStatus getHealthStatus() {
            return this.healthStatus;
        }

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSet extends TeaModel {
        @NameInMap("DiskFullStatusType")
        @Validation(required = true)
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType> diskFullStatusType;

        public static DescribeDisksFullStatusResponseDiskFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSet self = new DescribeDisksFullStatusResponseDiskFullStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeDisksFullStatusResponseDiskFullStatusSet setDiskFullStatusType(java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType> diskFullStatusType) {
            this.diskFullStatusType = diskFullStatusType;
            return this;
        }
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType> getDiskFullStatusType() {
            return this.diskFullStatusType;
        }

    }

}
