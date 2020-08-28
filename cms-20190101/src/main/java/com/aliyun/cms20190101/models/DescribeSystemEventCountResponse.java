// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountResponse extends TeaModel {
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

    @NameInMap("SystemEventCounts")
    @Validation(required = true)
    public DescribeSystemEventCountResponseSystemEventCounts systemEventCounts;

    public static DescribeSystemEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventCountResponse self = new DescribeSystemEventCountResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSystemEventCountResponseSystemEventCountsSystemEventCount extends TeaModel {
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

        public static DescribeSystemEventCountResponseSystemEventCountsSystemEventCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventCountResponseSystemEventCountsSystemEventCount self = new DescribeSystemEventCountResponseSystemEventCountsSystemEventCount();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSystemEventCountResponseSystemEventCounts extends TeaModel {
        @NameInMap("SystemEventCount")
        @Validation(required = true)
        public java.util.List<DescribeSystemEventCountResponseSystemEventCountsSystemEventCount> systemEventCount;

        public static DescribeSystemEventCountResponseSystemEventCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventCountResponseSystemEventCounts self = new DescribeSystemEventCountResponseSystemEventCounts();
            return TeaModel.build(map, self);
        }

    }

}
