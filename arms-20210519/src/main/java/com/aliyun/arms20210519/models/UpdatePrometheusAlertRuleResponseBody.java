// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrometheusAlertRule")
    public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    public static UpdatePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusAlertRuleResponseBody self = new UpdatePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePrometheusAlertRuleResponseBody setPrometheusAlertRule(UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule) {
        this.prometheusAlertRule = prometheusAlertRule;
        return this;
    }
    public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
    }

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels self = new UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations self = new UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule extends TeaModel {
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
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        @NameInMap("Annotations")
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        public static UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule self = new UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setLabels(java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAnnotations(java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

    }

}
