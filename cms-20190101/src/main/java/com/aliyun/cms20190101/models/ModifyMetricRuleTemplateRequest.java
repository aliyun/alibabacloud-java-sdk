// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("AlertTemplates")
    public java.util.List<ModifyMetricRuleTemplateRequestAlertTemplates> alertTemplates;

    /**
     * <p>The description of the alert template.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("RestVersion")
    public Long restVersion;

    /**
     * <p>The callback URL. Valid values of N: 1 to 200.</p>
     * <br>
     * <p>The callback URL must be accessible over the Internet. CloudMonitor sends a POST request to push an alert notification to the callback URL that you specify. Only HTTP requests are supported.</p>
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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

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
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

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
         * <p>The statistical period of monitoring data. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>>  If the value is set to 300 seconds, the monitoring data is collected every 300 seconds. If the monitoring data is reported every 1 minute, the alert system calculates the average, maximum, and minimum values of the monitoring data of 5 minutes and checks whether the aggregated values exceed the threshold. To prevent unexpected alerts, we recommend that you set this parameter together with other parameters.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The operation that you want to perform. Set the value to ModifyMetricRuleTemplate.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The ID of the alert template.</p>
         * <br>
         * <p>For information about how to obtain the ID of an alert template, see [DescribeMetricRuleTemplateList](~~114982~~).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The dimension of the alert. It is an extended field. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>For example, an alert template is applied to an application group, this parameter is set to `{"disk":"/"}`, and the MetricName parameter is set to `DiskUtilization`. In this case, the generated alert rule is applied to the root disk partition (`"/"`) of all instances in the application group to which the alert template is applied.</p>
         * <br>
         * <p>>  For more information about the values of extended fields, see [DescribeMetricRuleTemplateAttribute](~~114979~~).</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The namespace of the cloud service. Valid values of N: 1 to 200.</p>
         * <br>
         * <p>For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The abbreviation of the service name. Valid values of N: 1 to 200. Valid values:</p>
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
        @NameInMap("Selector")
        public String selector;

        /**
         * <p>The error message.</p>
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
