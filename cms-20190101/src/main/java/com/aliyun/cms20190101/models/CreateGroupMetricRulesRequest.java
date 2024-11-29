// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule. The specified tag is contained in alert notifications.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
         * <ul>
         * <li>PolarDB: PolarDB</li>
         * <li>NewBGPDDoS: Anti-DDoS Pro</li>
         * <li>IoTDevice: IoT Platform</li>
         * <li>DRDS: Distributed Relational Database Service (DRDS)</li>
         * <li>VS: Video Surveillance System</li>
         * <li>AMQP: Alibaba Cloud Message Queue for AMQP</li>
         * <li>ADS: AnalyticDB</li>
         * <li>APIGateway: API Gateway</li>
         * <li>InternetSharedBandwidth: EIP Bandwidth Plan</li>
         * <li>CDN: Alibaba Cloud Content Delivery Network (CDN)</li>
         * <li>CEN: Cloud Enterprise Network (CEN)</li>
         * <li>DCDN: Dynamic Route for CDN (DCDN)</li>
         * <li>DDoS: Anti-DDoS</li>
         * <li>ECS: Elastic Compute Service (ECS)</li>
         * <li>DirectMail: Direct Mail</li>
         * <li>Elasticsearch: Elasticsearch</li>
         * <li>EMR: E-MapReduce (EMR)</li>
         * <li>ESS: Auto Scaling</li>
         * <li>FunctionCompute: Function Compute</li>
         * <li>RealtimeCompute: Realtime Compute for Apache Flink</li>
         * <li>GlobalAcceleration: Global Accelerator (GA)</li>
         * <li>Hbase: ApsaraDB for HBase</li>
         * <li>TSDB: Time Series Database (TSDB)</li>
         * <li>IPv6trans: IPv6 Translation Service</li>
         * <li>Kafka: Message Queue for Apache Kafka</li>
         * <li>Kubernetes: Container Service for Kubernetes (ACK)</li>
         * <li>KVstore: ApsaraDB for Redis</li>
         * <li>MNS: Message Service (MNS)</li>
         * <li>MongoDB: ApsaraDB for MongoDB</li>
         * <li>MQ: Message Queue</li>
         * <li>NAT: NAT Gateway</li>
         * <li>OpenAd: Open Ad</li>
         * <li>OpenSearch: Open Search</li>
         * <li>OSS: Object Storage Service (OSS)</li>
         * <li>PCDN: P2P CDN</li>
         * <li>petadata: HybridDB for MySQL</li>
         * <li>RDS: ApsaraDB RDS</li>
         * <li>SCDN: Secure CDN</li>
         * <li>SLB: Server Load Balancer (SLB)</li>
         * <li>SLS: Log Service</li>
         * <li>VideoLive: ApsaraVideo Live</li>
         * <li>VOD: ApsaraVideo VOD</li>
         * <li>EIP: Elastic IP Address (EIP)</li>
         * <li>VPN: VPN Gateway</li>
         * <li>AIRec: Artificial Intelligence Recommendation</li>
         * <li>GPDB: AnalyticDB for PostgreSQL</li>
         * <li>DBS: Database Backup (DBS)</li>
         * <li>SAG: Smart Access Gateway (SAG)</li>
         * <li>Memcache: ApsaraDB for Memcache</li>
         * <li>IOT_EDGE: Link IoT Edge</li>
         * <li>OCS: ApsaraDB for Memcache (previous version)</li>
         * <li>VPC: Express Connect</li>
         * <li>EHPC: Elastic High Performance Computing (E-HPC)</li>
         * <li>MPS: ApsaraVideo Media Processing</li>
         * <li>ENS: Edge Node Service (ENS)</li>
         * <li>MaxCompute_Prepay: MaxCompute</li>
         * <li>IoT_Kubernetes: Edge Application Hosting</li>
         * <li>CMS: CloudMonitor</li>
         * <li>batchcomputenew: Batch Compute</li>
         * <li>HBaseUE: ApsaraDB for HBase Performance-enhanced Edition</li>
         * <li>UIS: Ultimate Internet Service (UIS)</li>
         * <li>nls: Intelligent Speech Interaction</li>
         * <li>ots: Tablestore</li>
         * <li>NAS: File Storage NAS</li>
         * <li>ECI: Elastic Container Instance (ECI)</li>
         * <li>OpenAPI: OpenAPI Explorer</li>
         * <li>pvtzpost: Alibaba Cloud DNS PrivateZone</li>
         * <li>blinkonk8s: Flink on Kubernetes</li>
         * <li>FunctionFlow: Serverless Workflow (SWF)</li>
         * <li>SMC: Server Migration Center (SMC)</li>
         * <li>ddosbgp: Anti-DDoS Origin</li>
         * <li>baas: Blockchain as a Service</li>
         * <li>privatelink: PrivateLink</li>
         * <li>cds: ApsaraDB for Cassandra</li>
         * <li>DDH: Dedicated Host</li>
         * <li>RocketMQ: Message Queue for Apache RocketMQ</li>
         * <li>ECC: Express Cloud Connect</li>
         * <li>hbaseserverless: ApsaraDB for HBase Serverless Edition</li>
         * <li>mns_tmp: Message Service</li>
         * <li>hdr: Hybrid Disaster Recovery (HDR)</li>
         * <li>hbr: Hybrid Backup Recovery (HBR)</li>
         * <li>ADB: AnalyticDB for MySQL V3.0</li>
         * <li>tag: Tag Service</li>
         * <li>GDB: Graph Database</li>
         * <li>WAF: Web Application Firewall (WAF)</li>
         * <li>hcs_sgw: Cloud Storage Gateway (CSG)</li>
         * <li>ipv6gateway: IPv6 Gateway</li>
         * <li>RDS_SAR: ApsaraDB Exclusive Host Group</li>
         * <li>learn: Machine Learning Platform for AI</li>
         * <li>ROS: Resource Orchestration Service (ROS)</li>
         * <li>OOS: Operation Orchestration Service (OOS)</li>
         * <li>bds: Data Synchronization for HBase</li>
         * <li>cfw: Cloud Firewall</li>
         * <li>ddosDip: Anti-DDoS Premium</li>
         * <li>datahub: DataHub</li>
         * <li>hologres: Hologres</li>
         * <li>ExpressConnect: Express Connect</li>
         * <li>dbfs: Database File System (DBFS)</li>
         * <li>clickhouse: ApsaraDB for ClickHouse</li>
         * <li>k8s: Container Service for Kubernetes (ACK)</li>
         * <li>DTS: Data Transmission Service (DTS)</li>
         * <li>AnycastEIP: Anycast Elastic IP Address</li>
         * <li>Lindorm: ApsaraDB for Lindorm</li>
         * <li>config: Cloud Config</li>
         * <li>spark: Databricks DataInsight (DDI)</li>
         * <li>serverless: Serverless App Engine (SAE)</li>
         * <li>alb: Application Load Balancer (ALB)</li>
         * <li>oceanbase: ApsaraDB for OceanBase</li>
         * <li>KMS: Key Management Service (KMS)</li>
         * <li>lvwang: Content Moderation</li>
         * <li>LinkVisual: LinkVisual</li>
         * <li>tair: ApsaraDB for Redis Enhanced Edition (Tair)</li>
         * <li>dlf: Data Lake Formation (DLF)</li>
         * <li>networkmonitor: Site Monitoring</li>
         * <li>pnc: Physical Network Change</li>
         * <li>AIS: Alibaba Cloud Infrastructure</li>
         * <li>cloudgame: Cloud Gaming Platform</li>
         * <li>RTC: Real-Time Communication</li>
         * <li>cloudbox: CloudBox</li>
         * <li>actiontrail: ActionTrail</li>
         * <li>cc: Cloud Connector</li>
         * <li>disk: Elastic Block Storage (EBS)</li>
         * <li>easygene: Genomics Computing Platform</li>
         * <li>cloudphone: Elastic Cloud Phone</li>
         * <li>BMS: Bare Metal Management Service</li>
         * <li>swas: Simple Application Server</li>
         * <li>AvailabilityMonitoring: Availability Monitoring of CloudMonitor</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The alert contact groups. Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The dimension of the alert rule. Valid values of N: 1 to 200.</p>
         * <p>Set the value to a set of key-value pairs, for example, <code>userId:120886317861****</code> or <code>instanceId:i-m5e1qg6uo38rztr4****</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The time period during which the alert rule is effective. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>05:31-23:59</p>
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
         * <p>Unit: seconds. The default value is the lowest frequency at which the metric is polled.</p>
         * <blockquote>
         * <p> We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public String interval;

        @NameInMap("Labels")
        public java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> labels;

        /**
         * <p>The name of the metric. Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the name of a metric, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service. Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values of N: 1 to 200. Valid value:</p>
         * <ul>
         * <li>KEEP_LAST_STATE (default value): No operation is performed.</li>
         * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient data&quot; is triggered.</li>
         * <li>OK: The alert rule has no active alerts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LAST_STATE</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-05:30</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;NotSendOK&quot;: true
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The aggregation period of the metric data. Valid values of N: 1 to 200.</p>
         * <p>Set the <code>Period</code> parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The ID of the alert rule. Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>456789</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Rule1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.</p>
         * <p>Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The callback URL. Valid values of N: 1 to 200.</p>
         * <p>The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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
