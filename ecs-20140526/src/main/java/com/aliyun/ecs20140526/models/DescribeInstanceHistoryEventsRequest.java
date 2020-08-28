// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    @NameInMap("InstanceEventCycleStatus")
    public java.util.List<String> instanceEventCycleStatus;

    @NameInMap("EventCycleStatus")
    public String eventCycleStatus;

    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("NotBefore")
    @Validation(required = true)
    public DescribeInstanceHistoryEventsRequestNotBefore notBefore;

    @NameInMap("EventPublishTime")
    @Validation(required = true)
    public DescribeInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

    @NameInMap("ImpactLevel")
    public String impactLevel;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHistoryEventsRequest self = new DescribeInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceHistoryEventsRequestNotBefore extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstanceHistoryEventsRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestNotBefore self = new DescribeInstanceHistoryEventsRequestNotBefore();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceHistoryEventsRequestEventPublishTime extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstanceHistoryEventsRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHistoryEventsRequestEventPublishTime self = new DescribeInstanceHistoryEventsRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

    }

}
