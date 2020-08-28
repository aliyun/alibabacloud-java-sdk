// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertingMetricRuleResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeAlertingMetricRuleResourcesResponseResources resources;

    public static DescribeAlertingMetricRuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertingMetricRuleResourcesResponse self = new DescribeAlertingMetricRuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAlertingMetricRuleResourcesResponseResourcesResource extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Resource")
        @Validation(required = true)
        public String resource;

        @NameInMap("Enable")
        @Validation(required = true)
        public String enable;

        @NameInMap("LastAlertTime")
        @Validation(required = true)
        public String lastAlertTime;

        @NameInMap("LastModifyTime")
        @Validation(required = true)
        public String lastModifyTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("MetricValues")
        @Validation(required = true)
        public String metricValues;

        @NameInMap("RetryTimes")
        @Validation(required = true)
        public String retryTimes;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        public static DescribeAlertingMetricRuleResourcesResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseResourcesResource self = new DescribeAlertingMetricRuleResourcesResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertingMetricRuleResourcesResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeAlertingMetricRuleResourcesResponseResourcesResource> resource;

        public static DescribeAlertingMetricRuleResourcesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertingMetricRuleResourcesResponseResources self = new DescribeAlertingMetricRuleResourcesResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
