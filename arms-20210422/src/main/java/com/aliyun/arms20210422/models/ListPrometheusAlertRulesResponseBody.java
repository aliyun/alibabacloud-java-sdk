// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesResponseBody extends TeaModel {
    @NameInMap("PrometheusAlertRules")
    public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRules> prometheusAlertRules;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Annotations")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations> annotations;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Labels")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels> labels;

        @NameInMap("Message")
        public String message;

        @NameInMap("NotifyType")
        public String notifyType;

        @NameInMap("Status")
        public Integer status;

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
