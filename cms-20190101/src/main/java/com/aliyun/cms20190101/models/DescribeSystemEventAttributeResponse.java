// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("SystemEvents")
    @Validation(required = true)
    public DescribeSystemEventAttributeResponseSystemEvents systemEvents;

    public static DescribeSystemEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeResponse self = new DescribeSystemEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSystemEventAttributeResponseSystemEventsSystemEvent extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Num")
        @Validation(required = true)
        public Long num;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        public static DescribeSystemEventAttributeResponseSystemEventsSystemEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseSystemEventsSystemEvent self = new DescribeSystemEventAttributeResponseSystemEventsSystemEvent();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSystemEventAttributeResponseSystemEvents extends TeaModel {
        @NameInMap("SystemEvent")
        @Validation(required = true)
        public java.util.List<DescribeSystemEventAttributeResponseSystemEventsSystemEvent> systemEvent;

        public static DescribeSystemEventAttributeResponseSystemEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseSystemEvents self = new DescribeSystemEventAttributeResponseSystemEvents();
            return TeaModel.build(map, self);
        }

    }

}
