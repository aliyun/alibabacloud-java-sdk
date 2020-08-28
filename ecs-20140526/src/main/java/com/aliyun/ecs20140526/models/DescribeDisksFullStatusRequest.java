// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksFullStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    @NameInMap("EventId")
    public java.util.List<String> eventId;

    @NameInMap("Status")
    public String status;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("EventTime")
    @Validation(required = true)
    public DescribeDisksFullStatusRequestEventTime eventTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDisksFullStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksFullStatusRequest self = new DescribeDisksFullStatusRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDisksFullStatusRequestEventTime extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        public static DescribeDisksFullStatusRequestEventTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksFullStatusRequestEventTime self = new DescribeDisksFullStatusRequestEventTime();
            return TeaModel.build(map, self);
        }

    }

}
