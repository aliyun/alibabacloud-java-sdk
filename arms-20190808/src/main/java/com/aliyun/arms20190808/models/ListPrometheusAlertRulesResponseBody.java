// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("PrometheusAlertRules")
    public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRules> prometheusAlertRules;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertRulesResponseBody self = new ListPrometheusAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertRulesResponseBody setPrometheusAlertRules(java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRules> prometheusAlertRules) {
        this.prometheusAlertRules = prometheusAlertRules;
        return this;
    }
    public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRules> getPrometheusAlertRules() {
        return this.prometheusAlertRules;
    }

    public ListPrometheusAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations extends TeaModel {
        // The name of the annotation.
        @NameInMap("Name")
        public String name;

        // The value of the annotation.
        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations self = new ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels extends TeaModel {
        // The name of the tag.
        @NameInMap("Name")
        public String name;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels self = new ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRules extends TeaModel {
        // The ID of the alert rule.
        @NameInMap("AlertId")
        public Long alertId;

        // The name of the alert rule.
        @NameInMap("AlertName")
        public String alertName;

        // The annotations of the alert rule.
        @NameInMap("Annotations")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations> annotations;

        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The ID of the notification policy. This parameter is returned if the **NotifyType** parameter is set to `DISPATCH_RULE`.
        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        // The duration of the alert. Valid values: 1 to 1440. Unit: minutes.
        @NameInMap("Duration")
        public String duration;

        // The expression of the alert rule.
        @NameInMap("Expression")
        public String expression;

        // The tags of the alert rule.
        @NameInMap("Labels")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels> labels;

        // The message of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.
        @NameInMap("Message")
        public String message;

        // The method of that is used to send alert notifications. Valid values:
        // 
        // *   `ALERT_MANAGER`: Alert notifications are sent by Operation Center.
        // *   `DISPATCH_RULE`: Alert notifications are sent based on the specified notification policy.
        @NameInMap("NotifyType")
        public String notifyType;

        // Indicates whether the alert rule is enabled. Valid values:
        // 
        // *   `1`: The alert rule is enabled.
        // *   `0`: The alert rule is disabled.
        @NameInMap("Status")
        public Integer status;

        // The type of the alert rule.
        @NameInMap("Type")
        public String type;

        public static ListPrometheusAlertRulesResponseBodyPrometheusAlertRules build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertRulesResponseBodyPrometheusAlertRules self = new ListPrometheusAlertRulesResponseBodyPrometheusAlertRules();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setAnnotations(java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setLabels(java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels> getLabels() {
            return this.labels;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
