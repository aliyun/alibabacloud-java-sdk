// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PrometheusAlertRule")
    public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusAlertRuleResponseBody self = new UpdatePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusAlertRuleResponseBody setPrometheusAlertRule(UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule) {
        this.prometheusAlertRule = prometheusAlertRule;
        return this;
    }
    public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
    }

    public UpdatePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
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

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels extends TeaModel {
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

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule extends TeaModel {
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
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        /**
         * <p>The cluster ID.</p>
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
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        /**
         * <p>The alert message. Tags can be referenced in the {{$labels.xxx}} format.</p>
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

        public static UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule self = new UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setAnnotations(java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setLabels(java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
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

    }

}
