// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleResponse extends TeaModel {
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

    @NameInMap("Datapoints")
    @Validation(required = true)
    public String datapoints;

    @NameInMap("AllProductInitMetricRuleList")
    @Validation(required = true)
    public DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleList allProductInitMetricRuleList;

    public static DescribeProductsOfActiveMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsOfActiveMetricRuleResponse self = new DescribeProductsOfActiveMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig extends TeaModel {
        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Statistics")
        @Validation(required = true)
        public String statistics;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        public String evaluationCount;

        @NameInMap("Threshold")
        @Validation(required = true)
        public String threshold;

        @NameInMap("Period")
        @Validation(required = true)
        public String period;

        public static DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig self = new DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList extends TeaModel {
        @NameInMap("AlertInitConfig")
        @Validation(required = true)
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig> alertInitConfig;

        public static DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList self = new DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRule extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("AlertInitConfigList")
        @Validation(required = true)
        public DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList alertInitConfigList;

        public static DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRule self = new DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleList extends TeaModel {
        @NameInMap("AllProductInitMetricRule")
        @Validation(required = true)
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleListAllProductInitMetricRule> allProductInitMetricRule;

        public static DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleList self = new DescribeProductsOfActiveMetricRuleResponseAllProductInitMetricRuleList();
            return TeaModel.build(map, self);
        }

    }

}
