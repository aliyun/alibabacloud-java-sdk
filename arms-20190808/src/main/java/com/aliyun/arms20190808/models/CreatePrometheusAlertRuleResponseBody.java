// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleResponseBody extends TeaModel {
    @NameInMap("PrometheusAlertRule")
    public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusAlertRuleResponseBody self = new CreatePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusAlertRuleResponseBody setPrometheusAlertRule(CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule) {
        this.prometheusAlertRule = prometheusAlertRule;
        return this;
    }
    public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
    }

    public CreatePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations self = new CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels self = new CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule extends TeaModel {
        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Annotations")
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Labels")
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        @NameInMap("Message")
        public String message;

        @NameInMap("NotifyType")
        public String notifyType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        public static CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule self = new CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAnnotations(java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setLabels(java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
