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

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet extends TeaModel {
        @NameInMap("DiskEventType")
        @Validation(required = true)
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSetDiskEventType> diskEventType;

        public static DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet self = new DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusTypeDiskEventSet();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDisksFullStatusResponseDiskFullStatusSet extends TeaModel {
        @NameInMap("DiskFullStatusType")
        @Validation(required = true)
        public java.util.List<DescribeDisksFullStatusResponseDiskFullStatusSetDiskFullStatusType> diskFullStatusType;

        public static DescribeDisksFullStatusResponseDiskFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusResponseDiskFullStatusSet self = new DescribeDisksFullStatusResponseDiskFullStatusSet();
            return TeaModel.build(map, self);
        }

    }

}
