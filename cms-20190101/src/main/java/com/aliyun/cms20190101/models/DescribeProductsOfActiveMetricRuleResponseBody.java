// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the services for which one-click alert is enabled.</p>
     */
    @NameInMap("AllProductInitMetricRuleList")
    public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList allProductInitMetricRuleList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeProductsOfActiveMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsOfActiveMetricRuleResponseBody self = new DescribeProductsOfActiveMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setAllProductInitMetricRuleList(DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList allProductInitMetricRuleList) {
        this.allProductInitMetricRuleList = allProductInitMetricRuleList;
        return this;
    }
    public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList getAllProductInitMetricRuleList() {
        return this.allProductInitMetricRuleList;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeProductsOfActiveMetricRuleResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
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

    public DescribeProductsOfActiveMetricRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig extends TeaModel {
        /**
         * <p>The consecutive number of times for which the metric value is measured before an alert is triggered.</p>
         */
        @NameInMap("EvaluationCount")
        public String evaluationCount;

        /**
         * <p>The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The aggregation period of the monitoring data. Unit: minutes. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The statistical aggregation method that is used to calculate metric values that trigger alerts. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold of the metric value.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
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
        /**
         * <p>The initial alert rules that are generated after one-click alert is enabled for a service.</p>
         */
        @NameInMap("AlertInitConfigList")
        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList alertInitConfigList;

        @NameInMap("Product")
        public String product;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule setAlertInitConfigList(DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList alertInitConfigList) {
            this.alertInitConfigList = alertInitConfigList;
            return this;
        }
        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigList getAlertInitConfigList() {
            return this.alertInitConfigList;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRule setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
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
