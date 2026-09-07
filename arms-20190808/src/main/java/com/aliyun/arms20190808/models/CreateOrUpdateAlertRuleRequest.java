// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleRequest extends TeaModel {
    /**
     * <p>The check type for a Prometheus monitoring alert rule.</p>
     * <ul>
     * <li><p><code>STATIC</code>: A static threshold. The <strong>MetricsKey</strong> parameter is required. For more information, see the description of the <strong>MetricsKey</strong> parameter below.</p>
     * </li>
     * <li><p><code>CUSTOM</code>: A custom PromQL query. The <strong>PromQL</strong>, <strong>Duration</strong>, and <strong>Message</strong> parameters are required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("AlertCheckType")
    public String alertCheckType;

    /**
     * <p>The alert group ID for the Prometheus alert rule. Valid values:</p>
     * <ul>
     * <li><p><code>-1</code>: Custom PromQL</p>
     * </li>
     * <li><p><code>1</code>: Kubernetes workloads</p>
     * </li>
     * <li><p><code>15</code>: Kubernetes nodes</p>
     * </li>
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
     * <li><p>Omit this parameter to create a new alert rule.</p>
     * </li>
     * <li><p>Specify an ID to modify an existing alert rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>546xxx</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The alert rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert Rule Demo</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The alert pipeline configuration. Used for compatibility with legacy alert rules.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AlertPiplines")
    public String alertPiplines;

    /**
     * <p>The content of the alert rule for application monitoring or browser monitoring. The following is a template for the <strong>AlertRuleContent</strong> parameter. For a description of the fields in the template, see the supplementary information below this table.</p>
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
     * <p>The available fields for <strong>AlertRuleItems.MetricKey</strong> depend on the <strong>MetricsType</strong> value. For information about the metric types supported by application monitoring and browser monitoring and their corresponding alert rule fields, see the supplementary information below this table.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ 
     *     &quot;Condition&quot;: &quot;OR&quot;,
     *      &quot;AlertRuleItems&quot;: [
     *              { &quot;Operator&quot;: &quot;CURRENT_LTE&quot;,
     *                  &quot;MetricKey&quot;: &quot;appstat.jvm.threadcount&quot;,
     *                  &quot;Value&quot;: 1000,
     *                  &quot;Aggregate&quot;: &quot;AVG&quot;,
     *                   &quot;N&quot;: 10,
     *                   &quot;Tolerability&quot;: 169
     *             } 
     *        ]<br>  }</p>
     */
    @NameInMap("AlertRuleContent")
    public String alertRuleContent;

    /**
     * <p>The status of the alert rule. Valid values:</p>
     * <ul>
     * <li><p><code>RUNNING</code>: The alert rule is running. (Default)</p>
     * </li>
     * <li><p><code>STOPPED</code>: The alert rule is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("AlertStatus")
    public String alertStatus;

    /**
     * <p>The type of the alert rule. Valid values:</p>
     * <ul>
     * <li><p><code>APPLICATION_MONITORING_ALERT_RULE</code>: For application monitoring.</p>
     * </li>
     * <li><p><code>BROWSER_MONITORING_ALERT_RULE</code>: For browser monitoring.</p>
     * </li>
     * <li><p><code>PROMETHEUS_MONITORING_ALERT_RULE</code>: For Prometheus monitoring.</p>
     * </li>
     * <li><p><code>XTRACE_MONITORING_ALERT_RULE</code>: For Tracing Analysis (OpenTelemetry edition).</p>
     * </li>
     * <li><p><code>EBPF_MONITORING_ALERT_RULE</code>: For eBPF monitoring.</p>
     * </li>
     * <li><p><code>RUM_MONITORING_ALERT_RULE</code>: For real user monitoring (RUM).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPLICATION_MONITORING_ALERT_RULE</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>Annotations to add to the Prometheus alert rule. Specify as a JSON string representing an array of objects, each with Name and Value keys.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;Value&quot;: &quot;PolarDB 慢查询数量&quot;,             &quot;Name&quot;: &quot;_aliyun_display_name&quot;           }</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>Determines whether to automatically apply this alert rule to new applications. This applies only to application monitoring and browser monitoring rules.</p>
     * <ul>
     * <li><p><code>true</code>: enables the feature.</p>
     * </li>
     * <li><p><code>false</code>: disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoAddNewApplication")
    public Boolean autoAddNewApplication;

    /**
     * <p>The configuration for automatically adding applications to an application monitoring alert rule. Specify this parameter as a JSON string with the following fields:</p>
     * <ul>
     * <li><p><code>autoAddMatchType</code>: The matching method. Can be <code>REGULAR</code> (matches the regular expression) or <code>NOT_REGULAR</code> (does not match the regular expression).</p>
     * <p>Match type: Regular expression match (REGULAR) / Not a regular expression match (NOT_REGULAR)</p>
     * </li>
     * <li><p><code>autoAddMatchExp</code>: The regular expression.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;autoAddMatchType\&quot;:\&quot;REGULAR\&quot;,\&quot;autoAddMatchExp\&quot;:\&quot;.<em>cbw.</em>\&quot;}</p>
     */
    @NameInMap("AutoAddTargetConfig")
    public String autoAddTargetConfig;

    /**
     * <p>The check interval for the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckCycle")
    public Long checkCycle;

    /**
     * <p>The cluster ID for the Prometheus monitoring alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data configuration. The dataRevision field specifies how to handle missing metric data.</p>
     * <ul>
     * <li><p><code>0</code>: Fills the data with 0.</p>
     * </li>
     * <li><p><code>1</code>: Fills the data with 1.</p>
     * </li>
     * <li><p><code>2</code>: Fills the data with null. This is the default and does not trigger an alert.</p>
     * </li>
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
     * <p>The period, in minutes, that a condition must be true before a Prometheus alert is triggered. Valid values: 0 to 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The filters for an application monitoring or browser monitoring alert rule.
     * Specify this parameter as a JSON string in the following format:</p>
     * <pre><code>&quot;DimFilters&quot;: [ 
     * { 
     *  &quot;FilterOpt&quot;: &quot;ALL&quot;,
     *  &quot;FilterValues&quot;: [],         // The filter value.
     *  &quot;FilterKey&quot;: &quot;rootIp&quot;     // The filter key.
     * }
     * ]
     * </code></pre>
     * <p>Valid values for <strong>FilterOpt</strong>:</p>
     * <ul>
     * <li><p><code>STATIC</code>: Matches a fixed dimension value.</p>
     * </li>
     * <li><p><code>ALL</code>: Iterates over all dimension values. Note: This option is not supported for range detection.</p>
     * </li>
     * <li><p><code>DISABLE</code>: Aggregates all dimension values by summing them.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DimFilters&quot;: [             {               &quot;FilterOpt&quot;: &quot;ALL&quot;,               &quot;FilterValues&quot;: [],               &quot;FilterKey&quot;: &quot;rootIp&quot;             }           ]         }</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>Labels to add to the Prometheus alert rule. Specify as a JSON string representing an array of objects, each with Name and Value keys.</p>
     * 
     * <strong>example:</strong>
     * <p>[  { &quot;Value&quot;: &quot;cms_polardb&quot;,             &quot;Name&quot;: &quot;_aliyun_cloud_product&quot;           }         ]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The severity level for the Prometheus alert rule.</p>
     * <ul>
     * <li><p><code>P1</code>: Critical. For major issues that affect core business availability with a wide impact and severe consequences.</p>
     * </li>
     * <li><p><code>P2</code>: Warning. For issues that cause partial service failures or affect system availability with a limited scope.</p>
     * </li>
     * <li><p><code>P3</code>: Info. For potential issues or alerts from non-critical services.</p>
     * </li>
     * <li><p><code>P4</code>: Low priority. Used for informational alerts that require attention but do not affect services.</p>
     * </li>
     * <li><p><code>Default</code>: The default level, used when no specific severity is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>P2</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>Application tags used to filter applications in application monitoring alert rules.</p>
     */
    @NameInMap("MarkTags")
    public java.util.List<CreateOrUpdateAlertRuleRequestMarkTags> markTags;

    /**
     * <p>The alert message for the Prometheus alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>命名空间: {{$labels.namespace}} / Pod: {{$labels.pod_name}} / 容器: {{$labels.container}} 内存使用率超过80%, 当前值{{ printf \\\&quot;%.2f\\\&quot; $value }}%</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert metric. This parameter is required for Prometheus alert rules when <strong>AlertCheckType</strong> is <strong>STATIC</strong>.</p>
     * <blockquote>
     * <p>The available alert metrics vary based on the value of <strong>AlertGroup</strong>. For information about the mapping between <strong>AlertGroup</strong> and <strong>MetricsKey</strong>, see the supplementary information below this table.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pop.status.error</p>
     */
    @NameInMap("MetricsKey")
    public String metricsKey;

    /**
     * <p>The alert metric type for application monitoring or browser monitoring alert rules. For more information, see the table below.</p>
     * 
     * <strong>example:</strong>
     * <p>jvm</p>
     */
    @NameInMap("MetricsType")
    public String metricsType;

    /**
     * <p>The effective time and notification time. Used for compatibility with legacy alert rules.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Notice")
    public String notice;

    /**
     * <p>The notification mode. Valid values:</p>
     * <ul>
     * <li><p><code>DIRECTED_MODE</code>: Directed mode.</p>
     * </li>
     * <li><p><code>NORMAL_MODE</code>: Normal mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL_MODE</p>
     */
    @NameInMap("NotifyMode")
    public String notifyMode;

    /**
     * <p>The notification policy.</p>
     * <ul>
     * <li><p><code>null</code>: Does not associate the alert rule with a notification policy. You can associate them later by creating a notification policy with a matching rule, for example, based on the alert rule\&quot;s name. When the alert rule is triggered, alert events are sent to the contacts or contact groups specified in the matching notification policy.</p>
     * </li>
     * <li><p>A notification policy ID: Associates the alert rule with a specific notification policy. ARMS automatically adds a matching rule to the policy that uses the alert rule\&quot;s ID. This ensures that alert events from this rule are always processed by the specified policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>569xxx</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <p>The PIDs of applications for an application monitoring or browser monitoring alert rule. Specify as a JSON array of strings.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;b590lhguqs@40d8deedfa9******&quot;]</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>Required for Prometheus alert rules. Used to filter by cloud service. The specified product name must be valid.</p>
     * 
     * <strong>example:</strong>
     * <p>clickhouse</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The PromQL expression to evaluate.</p>
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
     * <p>The tags to add to the alert rule. These are standard Alibaba Cloud resource tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateOrUpdateAlertRuleRequestTags> tags;

    /**
     * <p>The language of the response.</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

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

    public CreateOrUpdateAlertRuleRequest setCheckCycle(Long checkCycle) {
        this.checkCycle = checkCycle;
        return this;
    }
    public Long getCheckCycle() {
        return this.checkCycle;
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

    public CreateOrUpdateAlertRuleRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public static class CreateOrUpdateAlertRuleRequestMarkTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
