// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesRequest extends TeaModel {
    @NameInMap("Rules")
    public java.util.List<PutResourceMetricRulesRequestRules> rules;

    public static PutResourceMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesRequest self = new PutResourceMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRulesRequest setRules(java.util.List<PutResourceMetricRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<PutResourceMetricRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class PutResourceMetricRulesRequestRulesEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsCritical self = new PutResourceMetricRulesRequestRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsInfo self = new PutResourceMetricRulesRequestRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsWarn self = new PutResourceMetricRulesRequestRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutResourceMetricRulesRequestRulesEscalationsCritical critical;

        @NameInMap("Info")
        public PutResourceMetricRulesRequestRulesEscalationsInfo info;

        @NameInMap("Warn")
        public PutResourceMetricRulesRequestRulesEscalationsWarn warn;

        public static PutResourceMetricRulesRequestRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalations self = new PutResourceMetricRulesRequestRulesEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalations setCritical(PutResourceMetricRulesRequestRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRulesRequestRulesEscalations setInfo(PutResourceMetricRulesRequestRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRulesRequestRulesEscalations setWarn(PutResourceMetricRulesRequestRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRulesRequestRulesLabels extends TeaModel {
        /**
         * <p>The interval at which the alert rule is executed.</p>
         * <br>
         * <p>Unit: seconds.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>>  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The subject of the alert notification email.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRulesRequestRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesLabels self = new PutResourceMetricRulesRequestRulesLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRulesRequestRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRulesRequestRules extends TeaModel {
        @NameInMap("Escalations")
        public PutResourceMetricRulesRequestRulesEscalations escalations;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The operation that you want to perform. Set the value to **PutResourceMetricRules**.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The HTTP status code.</p>
         */
        @NameInMap("EmailSubject")
        public String emailSubject;

        /**
         * <p>The alert contact group. The alert notifications are sent to the alert contacts in the alert contact group.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>>  An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~).</p>
         */
        @NameInMap("Interval")
        public String interval;

        @NameInMap("Labels")
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> labels;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The name of the alert rule.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>You can specify a new name or the name of an existing alert rule. For information about how to query the name of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
         * <br>
         * <p>>  If you specify a new name, you create a threshold-triggered alert rule.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <br>
         * <p>*   true: The call was successful.</p>
         * <p>*   false: The call failed.</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The time period during which the alert rule is effective.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The name of the metric.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>For information about how to query the name of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The statistical methods for Warn-level alerts. Valid values:</p>
         * <br>
         * <p>*   Maximum: the maximum value</p>
         * <p>*   Minimum: the minimum value</p>
         * <p>*   Average: the average value</p>
         * <p>*   Availability: the availability rate</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>>  You must set a collection of the Rules.N.Escalations.Critical.Statistics, Rules.N.Escalations.Critical.ComparisonOperator, Rules.N.Escalations.Critical.Threshold, and Rules.N.Escalations.Critical.Times parameters, a collection of the Rules.N.Escalations.Warn.Statistics, Rules.N.Escalations.Warn.ComparisonOperator, Rules.N.Escalations.Warn.Threshold, and Rules.N.Escalations.Warn.Times parameters, or a collection of the Rules.N.Escalations.Info.Statistics, Rules.N.Escalations.Info.ComparisonOperator, Rules.N.Escalations.Info.Threshold, and Rules.N.Escalations.Info.Times parameters.</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values:</p>
         * <br>
         * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
         * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
         * <p>*   OK: The status is considered normal.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met.</p>
         * <br>
         * <p>Unit: seconds. Default value: 86400.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>>  If an alert is not cleared after the mute period ends, CloudMonitor resends an alert notification.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static PutResourceMetricRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRules self = new PutResourceMetricRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRules setEscalations(PutResourceMetricRulesRequestRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalations getEscalations() {
            return this.escalations;
        }

        public PutResourceMetricRulesRequestRules setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public PutResourceMetricRulesRequestRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public PutResourceMetricRulesRequestRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public PutResourceMetricRulesRequestRules setLabels(java.util.List<PutResourceMetricRulesRequestRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> getLabels() {
            return this.labels;
        }

        public PutResourceMetricRulesRequestRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutResourceMetricRulesRequestRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PutResourceMetricRulesRequestRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public PutResourceMetricRulesRequestRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public PutResourceMetricRulesRequestRules setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public PutResourceMetricRulesRequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public PutResourceMetricRulesRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public PutResourceMetricRulesRequestRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public PutResourceMetricRulesRequestRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
