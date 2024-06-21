// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleRequest extends TeaModel {
    /**
     * <p>The alert check type of the Prometheus alert rule. Valid values:</p>
     * <ul>
     * <li>STATIC: a static threshold value. If you set the parameter to STATIC, you must specify the <strong>MetricsKey</strong> parameter. For more information, see the <strong>Correspondence between AlertGroup and MetricsKey for Prometheus Service</strong> table.</li>
     * <li>CUSTOM: a custom PromQL statement. If you set the parameter to CUSTOM, you must specify the <strong>PromQL</strong>, <strong>Duration</strong>, and <strong>Message</strong> parameters to create a Prometheus alert rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("AlertCheckType")
    public String alertCheckType;

    /**
     * <p>The alert contact group ID of the Prometheus alert rule. Valid values:</p>
     * <ul>
     * <li>\-1: custom PromQL</li>
     * <li>1: Kubernetes load</li>
     * <li>15: Kubernetes node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AlertGroup")
    public Long alertGroup;

    /**
     * <p>The ID of the alert rule.</p>
     * <ul>
     * <li>If you do not specify this parameter, a new alert rule is created.</li>
     * <li>If you specify this parameter, the specified alert rule is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>546xxx</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert Rule Demo</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The configuration of the alert sending channel. This parameter is used to be compatible with the old version of the rule.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AlertPiplines")
    public String alertPiplines;

    /**
     * <p>The content of the Application Monitoring or Browser Monitoring alert rule. The following code provides an example of the <strong>AlertRuleContent</strong> parameter. For more information about the meaning of each field, see the supplementary description.</p>
     * <pre><code class="language-json">{ 
     *     &quot;Condition&quot;: &quot;OR&quot;,
     *      &quot;AlertRuleItems&quot;: [
     *              { &quot;Operator&quot;: &quot;CURRENT_LTE&quot;,
     *                  &quot;MetricKey&quot;: &quot;appstat.jvm.threadcount&quot;,
     *                  &quot;Value&quot;: 1000,
     *                  &quot;Aggregate&quot;: &quot;AVG&quot;,
     *                   &quot;N&quot;: 10,
     *                   &quot;Tolerability&quot;: 169
     *             } 
     *        ]  
     *   }
     * </code></pre>
     * <blockquote>
     * <p> The filter conditions specified by the <strong>AlertRuleItems.MetricKey</strong> field depends on the value of the <strong>MetricsType</strong> parameter. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Condition&quot;: &quot;OR&quot;, &quot;AlertRuleItems&quot;: [ { &quot;Operator&quot;: &quot;CURRENT_LTE&quot;,  &quot;MetricKey&quot;: &quot;appstat.jvm.threadcount&quot;,  &quot;Value&quot;: 1000,  &quot;Aggregate&quot;: &quot;AVG&quot;,   &quot;N&quot;: 1  }  ]  }</p>
     */
    @NameInMap("AlertRuleContent")
    public String alertRuleContent;

    /**
     * <p>The status of the alert rule. Valid values:</p>
     * <ul>
     * <li>RUNNING (default)</li>
     * <li>STOPPED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("AlertStatus")
    public String alertStatus;

    /**
     * <p>The following alert rule types are available:</p>
     * <ul>
     * <li>APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring</li>
     * <li>BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring</li>
     * <li>RUM_MONITORING_ALERT_RULE: alert rule for RUM Monitoring</li>
     * <li>PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Managed Service for Prometheus</li>
     * <li>XTRACE_MONITORING_ALERT_RULE: alert rule for Managed Service for OpenTelemetry</li>
     * <li>EBPF_MONITORING_ALERT_RULE: alert rule for Application Monitoring eBPF Edition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION_MONITORING_ALERT_RULE</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The annotations of the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Value&quot;: &quot;PolarDB slow queries&quot;, &quot;Name&quot;: &quot;_aliyun_display_name&quot; }</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>Specifies whether to apply the alert rule to new applications that are created in Application Monitoring or Browser Monitoring. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the health check feature.</li>
     * <li><code>false</code>: disables the automatic backup feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAddNewApplication")
    public Boolean autoAddNewApplication;

    @NameInMap("AutoAddTargetConfig")
    public String autoAddTargetConfig;

    /**
     * <p>The ID of the monitored cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Data Configuration. The dataRevision field specifies the data repair method when there is no data for the metric.</p>
     * <ul>
     * <li>Fill with zero: 0</li>
     * <li>Fill with one: 1</li>
     * <li>Fill with null: 2 (default, does not trigger an alarm)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;dataRevision&quot;: 2
     * }</p>
     */
    @NameInMap("DataConfig")
    public String dataConfig;

    /**
     * <p>The duration of the Prometheus alert rule. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The filter conditions of the Application Monitoring or Browser Monitoring alert rule. Format:</p>
     * <pre><code>&quot;DimFilters&quot;: [ 
     * { 
     *  &quot;FilterOpt&quot;: &quot;ALL&quot;,
     * &quot;FilterValues&quot;: [],         //The value of the filter condition.
     * &quot;FilterKey&quot;: &quot;rootIp&quot;     //The key of the filter condition.
     * }
     * ]
     * </code></pre>
     * <p>Valid values of <strong>FilterOpt</strong>:</p>
     * <ul>
     * <li>STATIC: matches the value of the specified dimension.</li>
     * <li>ALL: traverses all dimension values. Dynamic thresholds do not support traversal.</li>
     * <li>DISABLE: aggregates the values of all dimensions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DimFilters&quot;: [             {               &quot;FilterOpt&quot;: &quot;ALL&quot;,               &quot;FilterValues&quot;: [],               &quot;FilterKey&quot;: &quot;rootIp&quot;             }           ]         }</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The tags of the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[  { &quot;Value&quot;: &quot;cms_polardb&quot;,             &quot;Name&quot;: &quot;_aliyun_cloud_product&quot;           }         ]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The severity level of the Prometheus alert rule.</p>
     * <ul>
     * <li>P1: Alert notifications are sent for major issues that affect the availability of core business, have a huge impact, and may lead to serious consequences.</li>
     * <li>P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.</li>
     * <li>P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.</li>
     * <li>P4: Alert notifications are sent for low-priority issues that do not affect your business.</li>
     * <li>Default: Alert notifications are sent regardless of alert levels.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>P2</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>Application Tags. Used for application monitoring alert rules, to filter applications associated with alert rules.</p>
     */
    @NameInMap("MarkTags")
    public java.util.List<CreateOrUpdateAlertRuleRequestMarkTags> markTags;

    /**
     * <p>The alert message of the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Namespace: {{$labels.namespace}} / Pod: {{$labels.pod_name}} / Container: {{$labels.container}} Memory usage exceeds 80%. Current value: {{ printf \\\\\&quot;%.2f\\\\\&quot; $value }}%</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert metrics. If you set the <strong>AlertCheckType</strong> parameter to <strong>STATIC</strong> when you create a Prometheus alert rule, you must specify the <strong>MetricsKey</strong> parameter.</p>
     * <blockquote>
     * <p>Alert metrics vary depending on the value of the <strong>AlertGroup</strong> parameter. For more information about the correspondence between <strong>AlertGroup</strong> and <strong>MetricsKey</strong>, see the supplementary description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pop.status.error</p>
     */
    @NameInMap("MetricsKey")
    public String metricsKey;

    /**
     * <p>The metric type of the Application Monitoring or Browser Monitoring alert rule. For more information, see the following table.</p>
     * 
     * <strong>example:</strong>
     * <p>jvm</p>
     */
    @NameInMap("MetricsType")
    public String metricsType;

    /**
     * <p>The effective time and notification time. This parameter is used to be compatible with the old version of the rule.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Notice")
    public String notice;

    /**
     * <p>Notification Mode. Normal mode or Simplified mode.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL_MODE</p>
     */
    @NameInMap("NotifyMode")
    public String notifyMode;

    /**
     * <p>The notification policy.</p>
     * <ul>
     * <li>If you set this parameter to null, no notification policy is specified. After you create an alert rule, you can create a notification policy and specify match rules and match conditions. For example, you can specify the name of the alert rule as the match condition. When the alert rule is triggered, an alert event is generated and an alert notification is sent to the contacts or contact groups that are specified in the notification policy.</li>
     * <li>To specify a notification policy, set this parameter to the ID of the notification policy. Application Real-Time Monitoring Service (ARMS) automatically adds a match rule to the notification policy and specifies the ID of the alert rule as the match condition. The name of the alert rule is also displayed. This way, the alert events that are generated based on the alert rule can be matched by the specified notification policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>569xxx</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <p>The process ID (PID) that is associated with the Application Monitoring or Browser Monitoring alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;b590lhguqs@40d8deedfa9******&quot;]</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>It is determined when creating the underlying rules of Prometheus. The background will verify whether the product exists, which is used to distinguish cloud product filtering queries.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The PromQL statement of the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>node_memory_MemAvailable_bytes{} / node_memory_MemTotal_bytes{} * 100</p>
     */
    @NameInMap("PromQL")
    public String promQL;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateOrUpdateAlertRuleRequestTags> tags;

    public static CreateOrUpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleRequest self = new CreateOrUpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleRequest setAlertCheckType(String alertCheckType) {
        this.alertCheckType = alertCheckType;
        return this;
    }
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    public CreateOrUpdateAlertRuleRequest setAlertGroup(Long alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public Long getAlertGroup() {
        return this.alertGroup;
    }

    public CreateOrUpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public CreateOrUpdateAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreateOrUpdateAlertRuleRequest setAlertPiplines(String alertPiplines) {
        this.alertPiplines = alertPiplines;
        return this;
    }
    public String getAlertPiplines() {
        return this.alertPiplines;
    }

    public CreateOrUpdateAlertRuleRequest setAlertRuleContent(String alertRuleContent) {
        this.alertRuleContent = alertRuleContent;
        return this;
    }
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    public CreateOrUpdateAlertRuleRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public CreateOrUpdateAlertRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public CreateOrUpdateAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateOrUpdateAlertRuleRequest setAutoAddNewApplication(Boolean autoAddNewApplication) {
        this.autoAddNewApplication = autoAddNewApplication;
        return this;
    }
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    public CreateOrUpdateAlertRuleRequest setAutoAddTargetConfig(String autoAddTargetConfig) {
        this.autoAddTargetConfig = autoAddTargetConfig;
        return this;
    }
    public String getAutoAddTargetConfig() {
        return this.autoAddTargetConfig;
    }

    public CreateOrUpdateAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOrUpdateAlertRuleRequest setDataConfig(String dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }
    public String getDataConfig() {
        return this.dataConfig;
    }

    public CreateOrUpdateAlertRuleRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateOrUpdateAlertRuleRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public CreateOrUpdateAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateOrUpdateAlertRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateOrUpdateAlertRuleRequest setMarkTags(java.util.List<CreateOrUpdateAlertRuleRequestMarkTags> markTags) {
        this.markTags = markTags;
        return this;
    }
    public java.util.List<CreateOrUpdateAlertRuleRequestMarkTags> getMarkTags() {
        return this.markTags;
    }

    public CreateOrUpdateAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsKey(String metricsKey) {
        this.metricsKey = metricsKey;
        return this;
    }
    public String getMetricsKey() {
        return this.metricsKey;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsType(String metricsType) {
        this.metricsType = metricsType;
        return this;
    }
    public String getMetricsType() {
        return this.metricsType;
    }

    public CreateOrUpdateAlertRuleRequest setNotice(String notice) {
        this.notice = notice;
        return this;
    }
    public String getNotice() {
        return this.notice;
    }

    public CreateOrUpdateAlertRuleRequest setNotifyMode(String notifyMode) {
        this.notifyMode = notifyMode;
        return this;
    }
    public String getNotifyMode() {
        return this.notifyMode;
    }

    public CreateOrUpdateAlertRuleRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public CreateOrUpdateAlertRuleRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public CreateOrUpdateAlertRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateOrUpdateAlertRuleRequest setPromQL(String promQL) {
        this.promQL = promQL;
        return this;
    }
    public String getPromQL() {
        return this.promQL;
    }

    public CreateOrUpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOrUpdateAlertRuleRequest setTags(java.util.List<CreateOrUpdateAlertRuleRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateOrUpdateAlertRuleRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateOrUpdateAlertRuleRequestMarkTags extends TeaModel {
        /**
         * <p>The Tag Key.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The Tag Value.</p>
         * 
         * <strong>example:</strong>
         * <p>proudct</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleRequestMarkTags build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleRequestMarkTags self = new CreateOrUpdateAlertRuleRequestMarkTags();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleRequestMarkTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleRequestMarkTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleRequestTags self = new CreateOrUpdateAlertRuleRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
