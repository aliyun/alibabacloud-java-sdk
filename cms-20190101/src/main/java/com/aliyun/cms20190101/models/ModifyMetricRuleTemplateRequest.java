// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateRequest extends TeaModel {
    /**
     * <p>The list of alert templates.</p>
     */
    @NameInMap("AlertTemplates")
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    /**
     * <p>The description of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_template1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the alert template.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The version of the alert template to be modified.</p>
     * <blockquote>
     * <p>This parameter is automatically updated based on the number of modifications.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestVersion")
    public Long restVersion;

    /**
     * <p>The ID of the alert template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleTemplateRequest self = new ModifyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMetricRuleTemplateRequest setAlertTemplates(java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public ModifyMetricRuleTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMetricRuleTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMetricRuleTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMetricRuleTemplateRequest setRestVersion(Long restVersion) {
        this.restVersion = restVersion;
        return this;
    }
    public Long getRestVersion() {
        return this.restVersion;
    }

    public ModifyMetricRuleTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical extends TeaModel {
        /**
         * <p>The comparison operator for the critical-level alert threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
         * <li>GreaterThanThreshold: greater than the threshold. </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
         * <li>LessThanThreshold: less than the threshold. </li>
         * <li>NotEqualToThreshold: not equal to the threshold. </li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the previous period. </li>
         * <li>LessThanLastPeriod: less than the metric value in the previous period.</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
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
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> parameter of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
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
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of times that the monitoring metrics must reach the alert threshold to send a critical-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo extends TeaModel {
        /**
         * <p>The comparison operator for the info-level alert threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
         * <li>GreaterThanThreshold: greater than the threshold. </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
         * <li>LessThanThreshold: less than the threshold. </li>
         * <li>NotEqualToThreshold: not equal to the threshold. </li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the previous period. </li>
         * <li>LessThanLastPeriod: less than the metric value in the previous period.</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
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
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> parameter of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
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
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of times that the monitoring metrics must reach the alert threshold to send an info-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn extends TeaModel {
        /**
         * <p>The comparison operator for the warning-level alert threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
         * <li>GreaterThanThreshold: greater than the threshold. </li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
         * <li>LessThanThreshold: less than the threshold. </li>
         * <li>NotEqualToThreshold: not equal to the threshold. </li>
         * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday. </li>
         * <li>LessThanYesterday: less than the metric value at the same time yesterday. </li>
         * <li>GreaterThanLastWeek: greater than the metric value at the same time last week. </li>
         * <li>LessThanLastWeek: less than the metric value at the same time last week. </li>
         * <li>GreaterThanLastPeriod: greater than the metric value in the previous period. </li>
         * <li>LessThanLastPeriod: less than the metric value in the previous period.</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
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
         * <p>The statistical method for warning-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column that corresponds to the <code>MetricName</code> parameter of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For more information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for warning-level alerts.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of times that the monitoring metrics must reach the alert threshold to send a warning-level alert notification.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>You must specify at least one of the following alert levels: Critical, Warn, and Info. The Statistics, ComparisonOperator, Threshold, and Times parameters must be specified at the same time for the specified alert level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplatesEscalations extends TeaModel {
        @NameInMap("Critical")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical;

        @NameInMap("Info")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info;

        @NameInMap("Warn")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn;

        public static ModifyMetricRuleTemplateRequestAlertTemplatesEscalations build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplatesEscalations self = new ModifyMetricRuleTemplateRequestAlertTemplatesEscalations();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setCritical(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsCritical getCritical() {
            return this.critical;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setInfo(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsInfo getInfo() {
            return this.info;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations setWarn(ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class ModifyMetricRuleTemplateRequestAlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations escalations;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name. Valid values of N: 1 to 200. Valid values:</p>
         * <ul>
         * <li>ecs: Alibaba Cloud and non-Alibaba Cloud hosts.</li>
         * <li>rds: ApsaraDB RDS database.</li>
         * <li>ads: AnalyticDB database.</li>
         * <li>slb: load balancing.</li>
         * <li>vpc: Elastic IP Address (EIP).</li>
         * <li>apigateway: API Gateway.</li>
         * <li>cdn: Content Delivery Network (CDN).</li>
         * <li>cs: Container Service for Swarm.</li>
         * <li>dcdn: Dynamic Route for CDN (DCDN).</li>
         * <li>ddos: Anti-DDoS.</li>
         * <li>eip: Elastic IP Address (EIP).</li>
         * <li>elasticsearch: Elasticsearch.</li>
         * <li>emr: E-MapReduce (EMR).</li>
         * <li>ess: elastic scaling.</li>
         * <li>hbase: ApsaraDB for HBase database.</li>
         * <li>iot_edge: IoT Edge.</li>
         * <li>kvstore_sharding: ApsaraDB for Redis Cluster Edition.</li>
         * <li>kvstore_splitrw: ApsaraDB for Redis Read/Write Splitting Edition.</li>
         * <li>kvstore_standard: ApsaraDB for Redis Standard Edition.</li>
         * <li>memcache: ApsaraDB for Memcache database.</li>
         * <li>mns: Message Service (MNS).</li>
         * <li>mongodb: MongoDB replica set instance.</li>
         * <li>mongodb_cluster: MongoDB cluster edition.</li>
         * <li>mongodb_sharding: MongoDB sharded cluster.</li>
         * <li>mq_topic: Message Service Topic.</li>
         * <li>ocs: legacy cloud database Memcache.</li>
         * <li>opensearch: OpenSearch.</li>
         * <li>oss: Object Storage Service (OSS).</li>
         * <li>polardb: PolarDB database.</li>
         * <li>petadata: HybridDB for MySQL.</li>
         * <li>scdn: secure acceleration.</li>
         * <li>sharebandwidthpackages: Internet Shared Bandwidth.</li>
         * <li>sls: Simple Log Service (SLS).</li>
         * <li>vpn: VPN Gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The name of the metric. Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>For more information about the valid values of the metric name, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the Alibaba Cloud service, which is used to distinguish different services. Valid values of N: 1 to 200.</p>
         * <p>Format: acs_<service name>.</p>
         * <blockquote>
         * <p>To obtain the namespace of each Alibaba Cloud service, call the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The statistical period of the monitoring data. Valid values of N: 1 to 200.</p>
         * <blockquote>
         * <p>If you set this parameter to 300, the system collects and aggregates monitoring data every 300 seconds. If monitoring data is reported every minute, the system aggregates the data of 5 minutes, such as the average, maximum, and minimum values. Do not specify this parameter separately because the statistical period may cause unexpected alerts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>rule1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The options for the extended dimension fields. Valid values of N: 1 to 200.</p>
         * <p>For example, if the alert template is applied to an application group, this parameter is set to <code>{&quot;disk&quot;:&quot;/&quot;}</code>, and the MetricName parameter is set to <code>DiskUtilization</code>, the root partition (<code>&quot;/&quot;</code>) of the disks for all instances in the application group is associated with the corresponding alert rule.</p>
         * <blockquote>
         * <p>For more information about the valid values of the extended dimension fields, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
         * </blockquote>
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
         * <p><a href="https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp">https://apiwebhook.hipac.cn/api/v1/alarm/aly/eregfeeferrtbnmkdszp</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static ModifyMetricRuleTemplateRequestAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            ModifyMetricRuleTemplateRequestAlertTemplates self = new ModifyMetricRuleTemplateRequestAlertTemplates();
            return TeaModel.build(map, self);
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setEscalations(ModifyMetricRuleTemplateRequestAlertTemplatesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public ModifyMetricRuleTemplateRequestAlertTemplatesEscalations getEscalations() {
            return this.escalations;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public ModifyMetricRuleTemplateRequestAlertTemplates setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
