// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrometheusAlertRule")
    public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    public static DescribePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrometheusAlertRuleResponseBody self = new DescribePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrometheusAlertRuleResponseBody setPrometheusAlertRule(DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule) {
        this.prometheusAlertRule = prometheusAlertRule;
        return this;
    }
    public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
    }

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels self = new DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels();
            return TeaModel.build(map, self);
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations self = new DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        @NameInMap("NotifyType")
        public String notifyType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Message")
        public String message;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Labels")
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        @NameInMap("Annotations")
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        public static DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule self = new DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule();
            return TeaModel.build(map, self);
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setLabels(java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAnnotations(java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

    }

}
