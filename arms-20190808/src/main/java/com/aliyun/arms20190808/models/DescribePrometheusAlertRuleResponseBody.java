// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribePrometheusAlertRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PrometheusAlertRule")
    public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrometheusAlertRuleResponseBody self = new DescribePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrometheusAlertRuleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribePrometheusAlertRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePrometheusAlertRuleResponseBody setPrometheusAlertRule(DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule) {
        this.prometheusAlertRule = prometheusAlertRule;
        return this;
    }
    public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule getPrometheusAlertRule() {
        return this.prometheusAlertRule;
    }

    public DescribePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrometheusAlertRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
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

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels extends TeaModel {
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

    public static class DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule extends TeaModel {
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
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The ID of the notification policy. This parameter is returned if the **NotifyType** parameter is set to `DISPATCH_RULE`.</p>
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
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        /**
         * <p>The alert message. Tags can be referenced in the {{$labels.xxx}} format.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The method of that is used to send alert notifications. Valid values:</p>
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

        public static DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule self = new DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule();
            return TeaModel.build(map, self);
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setAnnotations(java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setDispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Long getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setLabels(java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePrometheusAlertRuleResponseBodyPrometheusAlertRule setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
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

    }

}
