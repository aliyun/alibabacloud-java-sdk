// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AlertEvent extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("AlertStatus")
    public String alertStatus;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("Content")
    public String content;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DeDupId")
    public String deDupId;

    @NameInMap("Details")
    public String details;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Metrics")
    public java.util.List<AlertEventMetrics> metrics;

    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceInfo")
    public java.util.Map<String, ?> resourceInfo;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Severity")
    public String severity;

    @NameInMap("Source")
    public String source;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("UserId")
    public String userId;

    public static AlertEvent build(java.util.Map<String, ?> map) throws Exception {
        AlertEvent self = new AlertEvent();
        return TeaModel.build(map, self);
    }

    public AlertEvent setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public AlertEvent setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public AlertEvent setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public AlertEvent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AlertEvent setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public AlertEvent setDeDupId(String deDupId) {
        this.deDupId = deDupId;
        return this;
    }
    public String getDeDupId() {
        return this.deDupId;
    }

    public AlertEvent setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public AlertEvent setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public AlertEvent setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public AlertEvent setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public AlertEvent setMetrics(java.util.List<AlertEventMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<AlertEventMetrics> getMetrics() {
        return this.metrics;
    }

    public AlertEvent setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AlertEvent setResourceInfo(java.util.Map<String, ?> resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }
    public java.util.Map<String, ?> getResourceInfo() {
        return this.resourceInfo;
    }

    public AlertEvent setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AlertEvent setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public AlertEvent setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AlertEvent setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public AlertEvent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public AlertEvent setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public AlertEvent setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class AlertEventMetrics extends TeaModel {
        @NameInMap("CurValue")
        public String curValue;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MetricNameEn")
        public String metricNameEn;

        @NameInMap("MetricNameZh")
        public String metricNameZh;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("UnitFactor")
        public Float unitFactor;

        public static AlertEventMetrics build(java.util.Map<String, ?> map) throws Exception {
            AlertEventMetrics self = new AlertEventMetrics();
            return TeaModel.build(map, self);
        }

        public AlertEventMetrics setCurValue(String curValue) {
            this.curValue = curValue;
            return this;
        }
        public String getCurValue() {
            return this.curValue;
        }

        public AlertEventMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public AlertEventMetrics setMetricNameEn(String metricNameEn) {
            this.metricNameEn = metricNameEn;
            return this;
        }
        public String getMetricNameEn() {
            return this.metricNameEn;
        }

        public AlertEventMetrics setMetricNameZh(String metricNameZh) {
            this.metricNameZh = metricNameZh;
            return this;
        }
        public String getMetricNameZh() {
            return this.metricNameZh;
        }

        public AlertEventMetrics setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public AlertEventMetrics setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public AlertEventMetrics setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public AlertEventMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AlertEventMetrics setUnitFactor(Float unitFactor) {
            this.unitFactor = unitFactor;
            return this;
        }
        public Float getUnitFactor() {
            return this.unitFactor;
        }

    }

}
