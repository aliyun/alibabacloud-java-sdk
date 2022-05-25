// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRuleRequest extends TeaModel {
    @NameInMap("Escalations")
    public PutResourceMetricRuleRequestEscalations escalations;

    @NameInMap("CompositeExpression")
    public PutResourceMetricRuleRequestCompositeExpression compositeExpression;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("EffectiveInterval")
    public String effectiveInterval;

    @NameInMap("EmailSubject")
    public String emailSubject;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Labels")
    public java.util.List<PutResourceMetricRuleRequestLabels> labels;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NoDataPolicy")
    public String noDataPolicy;

    @NameInMap("NoEffectiveInterval")
    public String noEffectiveInterval;

    @NameInMap("Period")
    public String period;

    @NameInMap("Prometheus")
    public PutResourceMetricRuleRequestPrometheus prometheus;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("Webhook")
    public String webhook;

    public static PutResourceMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRuleRequest self = new PutResourceMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRuleRequest setEscalations(PutResourceMetricRuleRequestEscalations escalations) {
        this.escalations = escalations;
        return this;
    }
    public PutResourceMetricRuleRequestEscalations getEscalations() {
        return this.escalations;
    }

    public PutResourceMetricRuleRequest setCompositeExpression(PutResourceMetricRuleRequestCompositeExpression compositeExpression) {
        this.compositeExpression = compositeExpression;
        return this;
    }
    public PutResourceMetricRuleRequestCompositeExpression getCompositeExpression() {
        return this.compositeExpression;
    }

    public PutResourceMetricRuleRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public PutResourceMetricRuleRequest setEffectiveInterval(String effectiveInterval) {
        this.effectiveInterval = effectiveInterval;
        return this;
    }
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public PutResourceMetricRuleRequest setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    public String getEmailSubject() {
        return this.emailSubject;
    }

    public PutResourceMetricRuleRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public PutResourceMetricRuleRequest setLabels(java.util.List<PutResourceMetricRuleRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<PutResourceMetricRuleRequestLabels> getLabels() {
        return this.labels;
    }

    public PutResourceMetricRuleRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutResourceMetricRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutResourceMetricRuleRequest setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public PutResourceMetricRuleRequest setNoEffectiveInterval(String noEffectiveInterval) {
        this.noEffectiveInterval = noEffectiveInterval;
        return this;
    }
    public String getNoEffectiveInterval() {
        return this.noEffectiveInterval;
    }

    public PutResourceMetricRuleRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PutResourceMetricRuleRequest setPrometheus(PutResourceMetricRuleRequestPrometheus prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public PutResourceMetricRuleRequestPrometheus getPrometheus() {
        return this.prometheus;
    }

    public PutResourceMetricRuleRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public PutResourceMetricRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PutResourceMetricRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutResourceMetricRuleRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public PutResourceMetricRuleRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class PutResourceMetricRuleRequestEscalationsCritical extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsCritical self = new PutResourceMetricRuleRequestEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsInfo extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsInfo self = new PutResourceMetricRuleRequestEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalationsWarn extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalationsWarn self = new PutResourceMetricRuleRequestEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRuleRequestEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestEscalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsCritical critical;

        @NameInMap("Info")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsInfo info;

        @NameInMap("Warn")
        @Validation(required = true)
        public PutResourceMetricRuleRequestEscalationsWarn warn;

        public static PutResourceMetricRuleRequestEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestEscalations self = new PutResourceMetricRuleRequestEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestEscalations setCritical(PutResourceMetricRuleRequestEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRuleRequestEscalations setInfo(PutResourceMetricRuleRequestEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRuleRequestEscalations setWarn(PutResourceMetricRuleRequestEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRuleRequestEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRuleRequestCompositeExpressionExpressionList extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public Long period;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        public static PutResourceMetricRuleRequestCompositeExpressionExpressionList build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestCompositeExpressionExpressionList self = new PutResourceMetricRuleRequestCompositeExpressionExpressionList();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRuleRequestCompositeExpressionExpressionList setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class PutResourceMetricRuleRequestCompositeExpression extends TeaModel {
        @NameInMap("ExpressionList")
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList;

        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        @NameInMap("Level")
        public String level;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestCompositeExpression build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestCompositeExpression self = new PutResourceMetricRuleRequestCompositeExpression();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionList(java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public java.util.List<PutResourceMetricRuleRequestCompositeExpressionExpressionList> getExpressionList() {
            return this.expressionList;
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionListJoin(String expressionListJoin) {
            this.expressionListJoin = expressionListJoin;
            return this;
        }
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        public PutResourceMetricRuleRequestCompositeExpression setExpressionRaw(String expressionRaw) {
            this.expressionRaw = expressionRaw;
            return this;
        }
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        public PutResourceMetricRuleRequestCompositeExpression setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutResourceMetricRuleRequestCompositeExpression setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRuleRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRuleRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestLabels self = new PutResourceMetricRuleRequestLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRuleRequestPrometheusAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRuleRequestPrometheusAnnotations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestPrometheusAnnotations self = new PutResourceMetricRuleRequestPrometheusAnnotations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestPrometheusAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRuleRequestPrometheusAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRuleRequestPrometheus extends TeaModel {
        @NameInMap("Annotations")
        public java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> annotations;

        @NameInMap("Level")
        public String level;

        @NameInMap("PromQL")
        public String promQL;

        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRuleRequestPrometheus build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRuleRequestPrometheus self = new PutResourceMetricRuleRequestPrometheus();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRuleRequestPrometheus setAnnotations(java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<PutResourceMetricRuleRequestPrometheusAnnotations> getAnnotations() {
            return this.annotations;
        }

        public PutResourceMetricRuleRequestPrometheus setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutResourceMetricRuleRequestPrometheus setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public PutResourceMetricRuleRequestPrometheus setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

}
