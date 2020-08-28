// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MetricRuleCount")
    @Validation(required = true)
    public DescribeMetricRuleCountResponseMetricRuleCount metricRuleCount;

    public static DescribeMetricRuleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountResponse self = new DescribeMetricRuleCountResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricRuleCountResponseMetricRuleCount extends TeaModel {
        @NameInMap("Alarm")
        @Validation(required = true)
        public Integer alarm;

        @NameInMap("Disable")
        @Validation(required = true)
        public Integer disable;

        @NameInMap("Nodata")
        @Validation(required = true)
        public Integer nodata;

        @NameInMap("Ok")
        @Validation(required = true)
        public Integer ok;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        public static DescribeMetricRuleCountResponseMetricRuleCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleCountResponseMetricRuleCount self = new DescribeMetricRuleCountResponseMetricRuleCount();
            return TeaModel.build(map, self);
        }

    }

}
