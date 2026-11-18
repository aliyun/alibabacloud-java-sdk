// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleTemplateRequest extends TeaModel {
    /**
     * <p>The alert templates.</p>
     */
    @NameInMap("AlertTemplates")
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    /**
     * <p>The description of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Template1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the alert template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Template1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleTemplateRequest self = new CreateMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleTemplateRequest setAlertTemplates(java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<CreateMetricRuleTemplateRequestAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public CreateMetricRuleTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetricRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        /**
         * <p>The comparison operator for the critical-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to </li>
         * <li>GreaterThanThreshold: greater than </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to </li>
         * <li>LessThanThreshold: less than </li>
         * <li>NotEqualToThreshold: not equal to </li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday </li>
         * <li>LessThanYesterday: less than the value at the same time yesterday </li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week </li>
         * <li>LessThanLastWeek: less than the value at the same time last week </li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period </li>
         * <li>LessThanLastPeriod: less than the value in the last period</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        /**
         * <p>The statistical method for critical-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold that triggers a critical-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of consecutive times the monitoring metrics must reach the alert threshold to send a critical-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        /**
         * <p>The comparison operator for the info-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to </li>
         * <li>GreaterThanThreshold: greater than </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to </li>
         * <li>LessThanThreshold: less than </li>
         * <li>NotEqualToThreshold: not equal to </li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday </li>
         * <li>LessThanYesterday: less than the value at the same time yesterday </li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week </li>
         * <li>LessThanLastWeek: less than the value at the same time last week </li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period </li>
         * <li>LessThanLastPeriod: less than the value in the last period</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        /**
         * <p>The statistical method for info-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for info-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of consecutive times the monitoring metrics must reach the alert threshold to send an info-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
        /**
         * <p>The comparison operator for the warn-level threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to </li>
         * <li>GreaterThanThreshold: greater than </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to </li>
         * <li>LessThanThreshold: less than </li>
         * <li>NotEqualToThreshold: not equal to </li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday </li>
         * <li>LessThanYesterday: less than the value at the same time yesterday </li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week </li>
         * <li>LessThanLastWeek: less than the value at the same time last week </li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period </li>
         * <li>LessThanLastPeriod: less than the value in the last period</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        /**
         * <p>The statistical method for warning alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> of the specified cloud service. Examples: Maximum, Minimum, and Average. For more information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for warn-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of consecutive times the monitoring metrics must reach the alert threshold to send a warning alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, or Info. For the specified alert level, you must specify the Statistics, ComparisonOperator, Threshold, and Times parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Info")
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        @NameInMap("Warn")
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        public static CreateMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplatesEscalations self = new CreateMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setCritical(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsCritical getCritical() {
            return this.critical;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setInfo(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsInfo getInfo() {
            return this.info;
        }

        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations setWarn(CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class CreateMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        /**
         * <p>The Alibaba Cloud service name or product specification abbreviation. Valid values of N: 1 to 200. Valid values:</p>
         * <ul>
         * <li>ecs: ECS instances and non-Alibaba Cloud hosts</li>
         * <li>rds: ApsaraDB RDS database</li>
         * <li>ads: AnalyticDB database</li>
         * <li>slb: load balancing</li>
         * <li>vpc: Elastic IP</li>
         * <li>apigateway: API Gateway</li>
         * <li>cdn: Content Delivery Network</li>
         * <li>cs: Container Service for Swarm</li>
         * <li>dcdn: Dynamic Route for CDN</li>
         * <li>ddos: Anti-DDoS</li>
         * <li>eip: Elastic IP Address</li>
         * <li>elasticsearch: Elasticsearch</li>
         * <li>emr: E-MapReduce</li>
         * <li>ess: elastic scaling</li>
         * <li>hbase: ApsaraDB for HBase database</li>
         * <li>iot_edge: IoT Edge</li>
         * <li>k8s_pod: Kubernetes pod</li>
         * <li>kvstore_sharding: ApsaraDB for Redis Cluster Edition</li>
         * <li>kvstore_splitrw: ApsaraDB for Redis Read/Write Splitting Edition</li>
         * <li>kvstore_standard: ApsaraDB for Redis Standard Edition</li>
         * <li>memcache: ApsaraDB for Memcache database</li>
         * <li>mns: Message Service</li>
         * <li>mongodb: MongoDB replica set</li>
         * <li>mongodb_cluster: MongoDB cluster edition</li>
         * <li>mongodb_sharding: MongoDB sharded cluster</li>
         * <li>mq_topic: Message Service topic</li>
         * <li>ocs: legacy ApsaraDB for Memcache database</li>
         * <li>opensearch: OpenSearch</li>
         * <li>oss: Object Storage Service</li>
         * <li>polardb: PolarDB database</li>
         * <li>petadata: HybridDB for MySQL</li>
         * <li>scdn: secure acceleration</li>
         * <li>sharebandwidthpackages: Internet Shared Bandwidth</li>
         * <li>sls: Simple Log Service</li>
         * <li>vpn: VPN Gateway</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The name of the metric. Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Cloud service metrics</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the Alibaba Cloud service. Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Cloud service metrics</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The aggregation period of the monitoring data. Unit: seconds.</p>
         * <p>Default value: the minimum aggregation period of the metric. You do not need to specify this parameter in most cases.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My CPU monitoring</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The options for extended fields. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;disk&quot;:&quot;/&quot;}</p>
         */
        @NameInMap("Selector")
        public String selector;

        /**
         * <p>The webhook URL to which a POST request is sent when an alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ww.aliyun.com">http://ww.aliyun.com</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static CreateMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            CreateMetricRuleTemplateRequestAlertTemplates self = new CreateMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setEscalations(CreateMetricRuleTemplateRequestAlertTemplatesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public CreateMetricRuleTemplateRequestAlertTemplatesEscalations getEscalations() {
            return this.escalations;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public CreateMetricRuleTemplateRequestAlertTemplates setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
