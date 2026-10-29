// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutGroupMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutGroupMetricRuleRequestEscalations escalations;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <p>For information about how to obtain the abbreviation of an Alibaba Cloud service name, see the <code>metricCategory</code> field in the <code>Labels</code> response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The alert contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroups")
    public String contactGroups;

    /**
     * <p>The first-level dimension of the alert rule in the application group.</p>
     * <p>Format: a collection of <code>key:value</code> pairs. Examples: <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request. The system does not bind a security group to the instance. The check items include whether required parameters are specified, the request format, and service limits. If the check fails, the system returns an error. If the check succeeds, the system returns the error code <code>DryRunOperation</code>.</li>
     * <li><strong>false</strong> (default value): sends a normal request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The effective period of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>05:31-23:59</p>
     */
    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    /**
     * <p>The subject of the alert email.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS instance</p>
     */
    @NameInMap("EmailSubject")
    public String emailSubject;

    /**
     * <p>The second-level or third-level dimension of the alert rule in the application group.</p>
     * <p>Format: a collection of <code>key:value</code> pairs. Examples: <code>port:80</code> and <code>/dev/xvda:d-m5e6yphgzn3aprwu****</code>.</p>
     * <p>If the first-level dimension of the alert rule is <code>{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}</code>, the second-level dimension is the cloud disk in the instance, such as <code>{&quot;/dev/xvda&quot;:&quot;d-m5e6yphgzn3aprwu****&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;/dev/xvda&quot;:&quot;d-m5e6yphgzn3aprwu****&quot;}</p>
     */
    @NameInMap("ExtraDimensionJson")
    public String extraDimensionJson;

    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17285****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The detection period of the alert rule. Unit: seconds.</p>
     * <blockquote>
     * <p>Make sure the detection period of the alert rule is the same as the data reporting period. If the detection period is shorter than the data reporting period, alerts may not be triggered due to insufficient data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The tags of the alert rule.</p>
     * <p>Alert notifications include tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<PutGroupMetricRuleRequestLabels> labels;

    /**
     * <p>The name of the metric.</p>
     * <p>For information about how to obtain the name of a metric, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the Alibaba Cloud service.</p>
     * <p>For information about how to obtain the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The action to take when no monitoring data is found. Valid values:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default value): Takes no action.</li>
     * <li>INSUFFICIENT_DATA: Sends an alert notification indicating that no data is found.</li>
     * <li>OK: Sends an alert notification indicating that the status is normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The time range during which the alert rule is inactive.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00-05:30</p>
     */
    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    /**
     * <p>The advanced settings.</p>
     * <p>Format: <code>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</code>. Example: <code>{&quot;NotSendOK&quot;:true}</code>, which specifies whether to send alert recovery notifications. The key is <code>NotSendOK</code>, and the value is <code>true</code> (do not send) or <code>false</code> (send by default).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotSendOK&quot;:true}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The reporting period of monitoring data.</p>
     * <p>The value of <code>Period</code> must be 60 or an integer multiple of 60. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the alert rule.</p>
     * <ul>
     * <li><p>To create an alert rule for the application group, enter an alert rule ID.</p>
     * </li>
     * <li><p>To modify a specified alert rule in the application group, you must obtain the alert rule ID. For information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the alert rule.</p>
     * <ul>
     * <li><p>To create an alert rule for the application group, enter an alert rule name.</p>
     * </li>
     * <li><p>To modify a specified alert rule in the application group, you must obtain the alert rule name. For information about how to obtain the name of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Rule_01</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The mute for epoch.</p>
     * <p>Unit: seconds. Default value: 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The webhook URL that is called when an alert is triggered.</p>
     * <p>Enter a publicly accessible URL. CloudMonitor pushes alert notifications to this URL by sending POST requests. Only HTTP is supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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

    public PutGroupMetricRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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

    public PutGroupMetricRuleRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
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
         * <p>The threshold comparison operator for Critical-level alerts. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period.</li>
         * <li>LessThanLastPeriod: less than the value in the last period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for Critical-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for Critical-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The threshold comparison operator for Info-level alerts. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period.</li>
         * <li>LessThanLastPeriod: less than the value in the last period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for Info-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for Info-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The threshold comparison operator for Warn-level alerts. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold.</li>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * <li>NotEqualToThreshold: not equal to the threshold.</li>
         * <li>GreaterThanYesterday: greater than the value at the same time yesterday.</li>
         * <li>LessThanYesterday: less than the value at the same time yesterday.</li>
         * <li>GreaterThanLastWeek: greater than the value at the same time last week.</li>
         * <li>LessThanLastWeek: less than the value at the same time last week.</li>
         * <li>GreaterThanLastPeriod: greater than the value in the last period.</li>
         * <li>LessThanLastPeriod: less than the value in the last period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The statistical method for Warn-level alerts. Separate multiple statistical methods with commas (,).</p>
         * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service. Examples: Maximum, Minimum, and Average. For information about how to obtain the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/163515.html">cloud service monitoring metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The number of retries for Warn-level alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The tag key of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
