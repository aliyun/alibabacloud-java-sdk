// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountResponse extends TeaModel {
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
    public Boolean success;

    @NameInMap("CustomEventCounts")
    @Validation(required = true)
    public DescribeCustomEventCountResponseCustomEventCounts customEventCounts;

    public static DescribeCustomEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventCountResponse self = new DescribeCustomEventCountResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCustomEventCountResponseCustomEventCountsCustomEventCount extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Num")
        @Validation(required = true)
        public Integer num;

        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        public static DescribeCustomEventCountResponseCustomEventCountsCustomEventCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventCountResponseCustomEventCountsCustomEventCount self = new DescribeCustomEventCountResponseCustomEventCountsCustomEventCount();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCustomEventCountResponseCustomEventCounts extends TeaModel {
        @NameInMap("CustomEventCount")
        @Validation(required = true)
        public java.util.List<DescribeCustomEventCountResponseCustomEventCountsCustomEventCount> customEventCount;

        public static DescribeCustomEventCountResponseCustomEventCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventCountResponseCustomEventCounts self = new DescribeCustomEventCountResponseCustomEventCounts();
            return TeaModel.build(map, self);
        }

    }

}
