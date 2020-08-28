// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeUnhealthyHostAvailabilityResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UnhealthyList")
    @Validation(required = true)
    public DescribeUnhealthyHostAvailabilityResponseUnhealthyList unhealthyList;

    public static DescribeUnhealthyHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnhealthyHostAvailabilityResponse self = new DescribeUnhealthyHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstanceInstanceList extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstanceInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstanceInstanceList self = new DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstanceInstanceList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstance extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("InstanceList")
        @Validation(required = true)
        public DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstanceInstanceList instanceList;

        public static DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstance self = new DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeUnhealthyHostAvailabilityResponseUnhealthyList extends TeaModel {
        @NameInMap("NodeTaskInstance")
        @Validation(required = true)
        public java.util.List<DescribeUnhealthyHostAvailabilityResponseUnhealthyListNodeTaskInstance> nodeTaskInstance;

        public static DescribeUnhealthyHostAvailabilityResponseUnhealthyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnhealthyHostAvailabilityResponseUnhealthyList self = new DescribeUnhealthyHostAvailabilityResponseUnhealthyList();
            return TeaModel.build(map, self);
        }

    }

}
