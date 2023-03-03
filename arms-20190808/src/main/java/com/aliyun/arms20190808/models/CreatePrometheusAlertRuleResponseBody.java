// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PrometheusAlertRule")
    public CreatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The name of the annotation.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the annotation.</p>
         */
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
        /**
         * <p>The name of the tag.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The annotations of the alert rule.</p>
         */
        @NameInMap("Annotations")
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The ID of the notification policy.</p>
         */
        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        /**
         * <p>The duration of the alert. Valid values: 1 to 1440. Unit: minutes.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The expression of the alert rule.</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The tags of the alert rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        /**
         * <p>The content of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The method that is used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   `ALERT_MANAGER`: Alert notifications are sent by Operation Center.</p>
         * <p>*   `DISPATCH_RULE`: Alert notifications are sent based on the specified notification policy.</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   `1`: The alert rule is enabled.</p>
         * <p>*   `0`: The alert rule is disabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the alert rule.</p>
         */
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
