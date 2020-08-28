// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsResponse extends TeaModel {
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

    @NameInMap("InstanceSystemEventSet")
    @Validation(required = true)
    public DescribeInstanceHistoryEventsResponseInstanceSystemEventSet instanceSystemEventSet;

    public static DescribeInstanceHistoryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsResponse self = new DescribeInstanceHistoryEventsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventType extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventType self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk extends TeaModel {
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

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("InactiveDisk")
        @Validation(required = true)
        public java.util.List<DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisksInactiveDisk> inactiveDisk;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("Device")
        @Validation(required = true)
        public String device;

        @NameInMap("InactiveDisks")
        @Validation(required = true)
        public DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttributeInactiveDisks inactiveDisks;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventType extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("EventPublishTime")
        @Validation(required = true)
        public String eventPublishTime;

        @NameInMap("NotBefore")
        @Validation(required = true)
        public String notBefore;

        @NameInMap("EventFinishTime")
        @Validation(required = true)
        public String eventFinishTime;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("ImpactLevel")
        @Validation(required = true)
        public String impactLevel;

        @NameInMap("EventType")
        @Validation(required = true)
        public DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventType eventType;

        @NameInMap("EventCycleStatus")
        @Validation(required = true)
        public DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeEventCycleStatus eventCycleStatus;

        @NameInMap("ExtendedAttribute")
        @Validation(required = true)
        public DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventTypeExtendedAttribute extendedAttribute;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventType self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventType();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsResponseInstanceSystemEventSet extends TeaModel {
        @NameInMap("InstanceSystemEventType")
        @Validation(required = true)
        public java.util.List<DescribeInstanceHistoryEventsResponseInstanceSystemEventSetInstanceSystemEventType> instanceSystemEventType;

        public static DescribeInstanceHistoryEventsResponseInstanceSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsResponseInstanceSystemEventSet self = new DescribeInstanceHistoryEventsResponseInstanceSystemEventSet();
            return TeaModel.build(map, self);
        }

    }

}
