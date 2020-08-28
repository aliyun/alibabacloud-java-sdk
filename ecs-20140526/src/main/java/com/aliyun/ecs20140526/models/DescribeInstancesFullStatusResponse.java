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

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventTypeExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet extends TeaModel {
        @NameInMap("ScheduledSystemEventType")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSetScheduledSystemEventType> scheduledSystemEventType;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet self = new DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusTypeScheduledSystemEventSet();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeInstancesFullStatusResponseInstanceFullStatusSet extends TeaModel {
        @NameInMap("InstanceFullStatusType")
        @Validation(required = true)
        public java.util.List<DescribeInstancesFullStatusResponseInstanceFullStatusSetInstanceFullStatusType> instanceFullStatusType;

        public static DescribeInstancesFullStatusResponseInstanceFullStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusResponseInstanceFullStatusSet self = new DescribeInstancesFullStatusResponseInstanceFullStatusSet();
            return TeaModel.build(map, self);
        }

    }

}
