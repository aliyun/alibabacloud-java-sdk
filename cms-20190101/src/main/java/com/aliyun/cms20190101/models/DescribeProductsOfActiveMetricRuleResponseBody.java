// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AllProductInitMetricRuleList")
    public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList allProductInitMetricRuleList;

    @NameInMap("Datapoints")
    public String datapoints;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProductsOfActiveMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsOfActiveMetricRuleResponseBody self = new DescribeProductsOfActiveMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setAllProductInitMetricRuleList(DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList allProductInitMetricRuleList) {
        this.allProductInitMetricRuleList = allProductInitMetricRuleList;
        return this;
    }
    public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList getAllProductInitMetricRuleList() {
        return this.allProductInitMetricRuleList;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Period")
        public String period;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList extends TeaModel {
        @NameInMap("AlertInitConfig")
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig> alertInitConfig;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList setAlertInitConfig(java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig> alertInitConfig) {
            this.alertInitConfig = alertInitConfig;
            return this;
        }
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig> getAlertInitConfig() {
            return this.alertInitConfig;
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("AlertInitConfigList")
        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList alertInitConfigList;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule setAlertInitConfigList(DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList alertInitConfigList) {
            this.alertInitConfigList = alertInitConfigList;
            return this;
        }
        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList getAlertInitConfigList() {
            return this.alertInitConfigList;
        }

    }

    public static class DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList extends TeaModel {
        @NameInMap("AllProductInitMetricRule")
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule> allProductInitMetricRule;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList setAllProductInitMetricRule(java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule> allProductInitMetricRule) {
            this.allProductInitMetricRule = allProductInitMetricRule;
            return this;
        }
        public java.util.List<DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule> getAllProductInitMetricRule() {
            return this.allProductInitMetricRule;
        }

    }

}
