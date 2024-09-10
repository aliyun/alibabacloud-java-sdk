// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductsOfActiveMetricRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the services for which one-click alert is enabled.</p>
     */
    @NameInMap("AllProductInitMetricRuleList")
    public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleList allProductInitMetricRuleList;

    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the services for which one-click alert is enabled. Services are separated with commas (,). Valid values:</p>
     * <ul>
     * <li>ecs: Elastic Compute Service (ECS)</li>
     * <li>rds: ApsaraDB RDS</li>
     * <li>slb: Server Load Balancer (SLB)</li>
     * <li>redis_standard: ApsaraDB for Redis of the standard architecture</li>
     * <li>redis_sharding: ApsaraDB for Redis of the cluster architecture</li>
     * <li>redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture</li>
     * <li>mongodb: ApsaraDB for MongoDB of the replica set architecture</li>
     * <li>mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</li>
     * <li>hbase: ApsaraDB for HBase</li>
     * <li>elasticsearch: Elasticsearch</li>
     * <li>opensearch: OpenSearch</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs,rds</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F82E6667-7811-4BA0-842F-5B2DC42BBAAD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>LessThanThreshold: less than the threshold</p>
         * </li>
         * <li><p>GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * </li>
         * <li><p>LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * </li>
         * <li><p>NotEqualToThreshold: does not equal to the threshold</p>
         * </li>
         * <li><p>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * </li>
         * <li><p>GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * </li>
         * <li><p>LessThanYesterday: less than the metric value at the same time yesterday</p>
         * </li>
         * <li><p>LessThanLastWeek: less than the metric value at the same time last week</p>
         * </li>
         * <li><p>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * </li>
         * <li><p>GreaterThanThreshold: greater than the threshold</p>
         * </li>
         * <li><p>LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EvaluationCount")
        public String evaluationCount;

        /**
         * <p>The alert level.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>INFO</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>WARN</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CRITICAL</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The metric name. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_rds_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The aggregation period of monitoring data. Unit: minutes. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The method used to calculate metric values that trigger alerts. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig self = new DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig();
            return TeaModel.build(map, self);
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeProductsOfActiveMetricRuleResponseBodyAllProductInitMetricRuleListAllProductInitMetricRuleAlertInitConfigListAlertInitConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
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

        /**
         * <p>The abbreviation of the service name.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
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
