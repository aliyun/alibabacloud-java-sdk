// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutGroupMetricRuleRequestEscalations escalations;

    /**
     * <p>The operation that you want to perform. Set the value to **PutGroupMetricRule**.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>*   When you create an alert rule for the application group, enter the ID of the alert rule.</p>
     * <p>*   When you modify a specified alert rule in the application group, you must obtain the ID of the alert rule. For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The second-level or third-level dimension of the alert rule in the application group.</p>
     * <br>
     * <p>Set the value to a set of key-value pairs, for example, `port:80` or `/dev/xvda:d-m5e6yphgzn3aprwu****`.</p>
     * <br>
     * <p>If the first-level dimension of the alert rule is `instanceId:i-m5e1qg6uo38rztr4****`, its second-level dimension is the `/dev/xvda:d-m5e6yphgzn3aprwu****` disk in the instance.</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>For information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("ExtraDimensionJson")
    public String extraDimensionJson;

    /**
     * <p>The statistical methods for Warn-level alerts. Separate multiple statistical methods with commas (,). Valid values:</p>
     * <br>
     * <p>*   Average: the average value</p>
     * <p>*   Minimum: the minimum value</p>
     * <p>*   Maximum: the maximum value</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The callback URL.</p>
     * <br>
     * <p>The callback URL must be accessible over the Internet. CloudMonitor sends a POST request to push an alert notification to the callback URL that you specify. Only HTTP requests are supported.</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("Labels")
    public java.util.List<PutGroupMetricRuleRequestLabels> labels;

    /**
     * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
     * <br>
     * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
     * <p>*   GreaterThanThreshold: greater than the threshold</p>
     * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
     * <p>*   LessThanThreshold: less than the threshold</p>
     * <p>*   NotEqualToThreshold: not equal to the threshold</p>
     * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
     * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
     * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
     * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
     * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
     * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The threshold for Critical-level alerts.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
     */
    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The threshold for Info-level alerts.</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The threshold for Warn-level alerts.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The aggregation period of the metric data.</p>
     * <br>
     * <p>Set the `Period` parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static PutGroupMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupMetricRuleRequest self = new PutGroupMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutGroupMetricRuleRequest setEscalations(PutGroupMetricRuleRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutGroupMetricRuleRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutGroupMetricRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public PutGroupMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutGroupMetricRuleRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public PutGroupMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutGroupMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutGroupMetricRuleRequest setExtraDimensionJson(String extraDimensionJson) {
        this.extraDimensionJson = extraDimensionJson;
        return this;
    }
    public String getExtraDimensionJson() {
        return this.extraDimensionJson;
    }

    public PutGroupMetricRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutGroupMetricRuleRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutGroupMetricRuleRequest setLabels(java.util.List<PutGroupMetricRuleRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutGroupMetricRuleRequestLabels> getLabels() {
        return this.labels;
    }

    public PutGroupMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutGroupMetricRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutGroupMetricRuleRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutGroupMetricRuleRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutGroupMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutGroupMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutGroupMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutGroupMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutGroupMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutGroupMetricRuleRequestEscalationsCritical extends TeaModel {
        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The interval at which the alert rule is executed. Unit: seconds.</p>
         * <br>
         * <p>>  We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The name of the cloud service. Valid values:</p>
         * <br>
         * <p>*   PolarDB: PolarDB</p>
         * <p>*   NewBGPDDoS: Anti-DDoS Pro</p>
         * <p>*   IoTDevice: IoT Platform</p>
         * <p>*   DRDS: PolarDB-X</p>
         * <p>*   VS: Video Surveillance System</p>
         * <p>*   AMQP: Alibaba Cloud Message Queue for AMQP</p>
         * <p>*   ADS: AnalyticDB</p>
         * <p>*   APIGateway: API Gateway</p>
         * <p>*   InternetSharedBandwidth: EIP Bandwidth Plan</p>
         * <p>*   CDN: Alibaba Cloud Content Delivery Network (CDN)</p>
         * <p>*   CEN: Cloud Enterprise Network (CEN)</p>
         * <p>*   DCDN: Dynamic Route for CDN (DCDN)</p>
         * <p>*   DDoS: Anti-DDoS</p>
         * <p>*   ECS: Elastic Compute Service (ECS)</p>
         * <p>*   DirectMail: Direct Mail</p>
         * <p>*   Elasticsearch: Elasticsearch</p>
         * <p>*   EMR: E-MapReduce (EMR)</p>
         * <p>*   ESS: Auto Scaling</p>
         * <p>*   FunctionCompute: Function Compute</p>
         * <p>*   RealtimeCompute: Realtime Compute for Apache Flink</p>
         * <p>*   GlobalAcceleration: Global Accelerator (GA)</p>
         * <p>*   Hbase: ApsaraDB for HBase</p>
         * <p>*   TSDB: Time Series Database (TSDB)</p>
         * <p>*   IPv6trans: IPv6 Translation Service</p>
         * <p>*   Kafka: Message Queue for Apache Kafka</p>
         * <p>*   Kubernetes: Container Service for Kubernetes (ACK)</p>
         * <p>*   KVstore: ApsaraDB for Redis</p>
         * <p>*   MNS: Message Service (MNS)</p>
         * <p>*   MongoDB: ApsaraDB for MongoDB</p>
         * <p>*   MQ: Message Queue</p>
         * <p>*   NAT: NAT Gateway</p>
         * <p>*   OpenAd: Open Ad</p>
         * <p>*   OpenSearch: Open Search</p>
         * <p>*   OSS: Object Storage Service (OSS)</p>
         * <p>*   PCDN: P2P CDN</p>
         * <p>*   petadata: HybridDB for MySQL</p>
         * <p>*   RDS: ApsaraDB RDS</p>
         * <p>*   SCDN: Secure CDN</p>
         * <p>*   SLB: Server Load Balancer (SLB)</p>
         * <p>*   SLS: Log Service</p>
         * <p>*   VideoLive: ApsaraVideo Live</p>
         * <p>*   VOD: ApsaraVideo VOD</p>
         * <p>*   EIP: Elastic IP Address (EIP)</p>
         * <p>*   VPN: VPN Gateway</p>
         * <p>*   AIRec: Artificial Intelligence Recommendation (AIRec)</p>
         * <p>*   GPDB: AnalyticDB for PostgreSQL</p>
         * <p>*   DBS: Database Backup (DBS)</p>
         * <p>*   SAG: Smart Access Gateway (SAG)</p>
         * <p>*   Memcache: ApsaraDB for Memcache</p>
         * <p>*   IOT_EDGE: Link IoT Edge</p>
         * <p>*   OCS: ApsaraDB for Memcache (previous version)</p>
         * <p>*   VPC: Express Connect</p>
         * <p>*   EHPC: Elastic High Performance Computing (E-HPC)</p>
         * <p>*   MPS: ApsaraVideo Media Processing (MPS)</p>
         * <p>*   ENS: Edge Node Service (ENS)</p>
         * <p>*   MaxCompute_Prepay: MaxCompute</p>
         * <p>*   IoT_Kubernetes: Edge Application Hosting</p>
         * <p>*   CMS: CloudMonitor</p>
         * <p>*   batchcomputenew: Batch Compute</p>
         * <p>*   HBaseUE: ApsaraDB for HBase Performance-enhanced Edition</p>
         * <p>*   UIS: Ultimate Internet Service (UIS)</p>
         * <p>*   nls: Intelligent Speech Interaction</p>
         * <p>*   ots: Tablestore</p>
         * <p>*   NAS: Apsara File Storage NAS</p>
         * <p>*   ECI: Elastic Container Instance (ECI)</p>
         * <p>*   OpenAPI: OpenAPI Explorer</p>
         * <p>*   pvtzpost: Alibaba Cloud DNS PrivateZone</p>
         * <p>*   blinkonk8s: Flink on Kubernetes</p>
         * <p>*   FunctionFlow: Serverless Workflow (SWF)</p>
         * <p>*   SMC: Server Migration Center (SMC)</p>
         * <p>*   ddosbgp: Anti-DDoS Origin</p>
         * <p>*   baas: Blockchain as a Service</p>
         * <p>*   privatelink: PrivateLink</p>
         * <p>*   cds: ApsaraDB for Cassandra</p>
         * <p>*   DDH: Dedicated Host</p>
         * <p>*   RocketMQ: Message Queue for Apache RocketMQ</p>
         * <p>*   ECC: Express Cloud Connect (ECC)</p>
         * <p>*   hbaseserverless: ApsaraDB for HBase Serverless Edition</p>
         * <p>*   mns_tmp: Message Service</p>
         * <p>*   hdr: Hybrid Disaster Recovery (HDR)</p>
         * <p>*   hbr: Hybrid Backup Recovery (HBR)</p>
         * <p>*   ADB: AnalyticDB for MySQL V3.0</p>
         * <p>*   tag: Tag Service</p>
         * <p>*   GDB: Graph Database</p>
         * <p>*   WAF: Web Application Firewall (WAF)</p>
         * <p>*   hcs_sgw: Cloud Storage Gateway (CSG)</p>
         * <p>*   ipv6gateway: IPv6 Gateway</p>
         * <p>*   RDS_SAR: ApsaraDB Exclusive Host Group</p>
         * <p>*   learn: Machine Learning Platform for AI</p>
         * <p>*   ROS: Resource Orchestration Service (ROS)</p>
         * <p>*   OOS: Operation Orchestration Service (OOS)</p>
         * <p>*   bds: Data Synchronization for HBase</p>
         * <p>*   cfw: Cloud Firewall</p>
         * <p>*   ddosDip: Anti-DDoS Premium</p>
         * <p>*   datahub: DataHub</p>
         * <p>*   hologres: Hologres</p>
         * <p>*   ExpressConnect: Express Connect</p>
         * <p>*   dbfs: Database File System (DBFS)</p>
         * <p>*   clickhouse: ApsaraDB for ClickHouse</p>
         * <p>*   k8s: Container Service for Kubernetes (ACK)</p>
         * <p>*   DTS: Data Transmission Service (DTS)</p>
         * <p>*   AnycastEIP: Anycast Elastic IP Address</p>
         * <p>*   Lindorm: Lindorm</p>
         * <p>*   config: Cloud Config</p>
         * <p>*   spark: Databricks DataInsight (DDI)</p>
         * <p>*   serverless: Serverless App Engine (SAE)</p>
         * <p>*   alb: Application Load Balancer (ALB)</p>
         * <p>*   oceanbase: ApsaraDB for OceanBase</p>
         * <p>*   KMS: Key Management Service (KMS)</p>
         * <p>*   lvwang: Content Moderation</p>
         * <p>*   LinkVisual: LinkVisual</p>
         * <p>*   tair: ApsaraDB for Redis Enhanced Edition (Tair)</p>
         * <p>*   dlf: Data Lake Formation (DLF)</p>
         * <p>*   networkmonitor: Site Monitoring</p>
         * <p>*   pnc: Physical Network Change</p>
         * <p>*   AIS: Alibaba Cloud Infrastructure</p>
         * <p>*   cloudgame: Cloud Gaming Platform</p>
         * <p>*   RTC: Real-Time Communication</p>
         * <p>*   cloudbox: CloudBox</p>
         * <p>*   actiontrail: ActionTrail</p>
         * <p>*   cc: Cloud Connector</p>
         * <p>*   disk: Elastic Block Storage (EBS)</p>
         * <p>*   easygene: Genomics Computing Platform</p>
         * <p>*   cloudphone: Elastic Cloud Phone</p>
         * <p>*   BMS: Bare Metal Management Service</p>
         * <p>*   swas: Simple Application Server</p>
         * <p>*   AvailabilityMonitoring: Availability Monitoring of CloudMonitor</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The first-level dimension of the alert rule in the application group.</p>
         * <br>
         * <p>Set the value to a set of key-value pairs, for example, `userId:120886317861****` or `instanceId:i-m5e1qg6uo38rztr4****`.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsCritical self = new PutGroupMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsInfo extends TeaModel {
        /**
         * <p>The time period during which the alert rule is effective.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
         * <br>
         * <p>Unit: seconds. Default value: 86400.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert contact group.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The statistical methods for Critical-level alerts. Separate multiple statistical methods with commas (,). Valid values:</p>
         * <br>
         * <p>*   Average: the average value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Maximum: the maximum value</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsInfo self = new PutGroupMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalationsWarn extends TeaModel {
        /**
         * <p>The tag value of the alert rule.</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values:</p>
         * <br>
         * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
         * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
         * <p>*   OK: The status is considered normal.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The tag key of the alert rule.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutGroupMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalationsWarn self = new PutGroupMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutGroupMetricRuleRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutGroupMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutGroupMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Info")
        public PutGroupMetricRuleRequestEscalationsInfo info;

        @NameInMap("Warn")
        public PutGroupMetricRuleRequestEscalationsWarn warn;

        public static PutGroupMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestEscalations self = new PutGroupMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestEscalations setCritical(PutGroupMetricRuleRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutGroupMetricRuleRequestEscalations setInfo(PutGroupMetricRuleRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutGroupMetricRuleRequestEscalations setWarn(PutGroupMetricRuleRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutGroupMetricRuleRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutGroupMetricRuleRequestLabels extends TeaModel {
        /**
         * <p>The name of the alert rule.</p>
         * <br>
         * <p>*   When you create an alert rule for the application group, enter the name of the alert rule.</p>
         * <p>*   When you modify a specified alert rule in the application group, you must obtain the name of the alert rule. For information about how to obtain the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutGroupMetricRuleRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutGroupMetricRuleRequestLabels self = new PutGroupMetricRuleRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutGroupMetricRuleRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutGroupMetricRuleRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
