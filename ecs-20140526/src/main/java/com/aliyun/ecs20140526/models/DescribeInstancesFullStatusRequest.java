// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesFullStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    @NameInMap("Status")
    public String status;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("NotBefore")
    @Validation(required = true)
    public DescribeInstancesFullStatusRequestNotBefore notBefore;

    @NameInMap("EventPublishTime")
    @Validation(required = true)
    public DescribeInstancesFullStatusRequestEventPublishTime eventPublishTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstancesFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesFullStatusRequest self = new DescribeInstancesFullStatusRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstancesFullStatusRequestNotBefore extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstancesFullStatusRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusRequestNotBefore self = new DescribeInstancesFullStatusRequestNotBefore();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesFullStatusRequestEventPublishTime extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeInstancesFullStatusRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesFullStatusRequestEventPublishTime self = new DescribeInstancesFullStatusRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

    }

}
