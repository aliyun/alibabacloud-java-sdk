// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupMetricRules")
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesRequest self = new CreateGroupMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateGroupMetricRulesRequest setGroupMetricRules(java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules) {
        this.groupMetricRules = groupMetricRules;
        return this;
    }
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public CreateGroupMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical;

        @NameInMap("Info")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info;

        @NameInMap("Warn")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalations self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setCritical(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical getCritical() {
            return this.critical;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setInfo(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setWarn(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesLabels extends TeaModel {
        /**
         * <p>The tag key of the alert rule. The specified tag is contained in alert notifications.</p>
         * <br>
         * <p>Valid values of N: 1 to 200.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule. The specified tag is contained in alert notifications.</p>
         * <br>
         * <p>Valid values of N: 1 to 200.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGroupMetricRulesRequestGroupMetricRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesLabels self = new CreateGroupMetricRulesRequestGroupMetricRulesLabels();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations;

        /**
         * <p>The name of the cloud service. Valid values of N: 1 to 200. Valid value:</p>
         * <br>
         * <p>*   PolarDB: PolarDB</p>
         * <p>*   NewBGPDDoS: Anti-DDoS Pro</p>
         * <p>*   IoTDevice: IoT Platform</p>
         * <p>*   DRDS: Distributed Relational Database Service (DRDS)</p>
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
         * <p>*   AIRec: Artificial Intelligence Recommendation</p>
         * <p>*   GPDB: AnalyticDB for PostgreSQL</p>
         * <p>*   DBS: Database Backup (DBS)</p>
         * <p>*   SAG: Smart Access Gateway (SAG)</p>
         * <p>*   Memcache: ApsaraDB for Memcache</p>
         * <p>*   IOT_EDGE: Link IoT Edge</p>
         * <p>*   OCS: ApsaraDB for Memcache (previous version)</p>
         * <p>*   VPC: Express Connect</p>
         * <p>*   EHPC: Elastic High Performance Computing (E-HPC)</p>
         * <p>*   MPS: ApsaraVideo Media Processing</p>
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
         * <p>*   ECC: Express Cloud Connect</p>
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
         * <p>*   Lindorm: ApsaraDB for Lindorm</p>
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
        @NameInMap("Category")
        public String category;

        /**
         * <p>The alert contact groups. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The dimension of the alert rule. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>Set the value to a set of key-value pairs, for example, `userId:120886317861****` or `instanceId:i-m5e1qg6uo38rztr4****`.</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The time period during which the alert rule is effective. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The subject of the alert notification email. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("EmailSubject")
        public String emailSubject;

        /**
         * <p>The interval at which CloudMonitor checks whether the alert rule is triggered. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>Unit: seconds. The default value is the lowest frequency at which the metric is polled.</p>
         * <br>
         * <p>>  We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
         */
        @NameInMap("Interval")
        public String interval;

        @NameInMap("Labels")
        public java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> labels;

        /**
         * <p>The name of the metric. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>For information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values of N: 1 to 200. Valid value:</p>
         * <br>
         * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
         * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
         * <p>*   OK: The alert rule has no active alerts.</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        @NameInMap("Options")
        public String options;

        /**
         * <p>The aggregation period of the metric data. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>Set the `Period` parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The ID of the alert rule. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The callback URL. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static CreateGroupMetricRulesRequestGroupMetricRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRules self = new CreateGroupMetricRulesRequestGroupMetricRules();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEscalations(CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations getEscalations() {
            return this.escalations;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setLabels(java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> getLabels() {
            return this.labels;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
