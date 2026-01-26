// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PrometheusAlertRule")
    public UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRule prometheusAlertRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FEA6D00-317F-45E3-9004-7FB8B0B7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdatePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusAlertRuleResponseBody self = new UpdatePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusAlertRuleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdatePrometheusAlertRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public UpdatePrometheusAlertRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations extends TeaModel {
        /**
         * <p>The name of the annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>The CPU utilization of ${{$labels.pod_name}} exceeds 80%. Current value: {{$value}}%</p>
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
         * 
         * <strong>example:</strong>
         * <p>severity</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>critical</p>
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
         * 
         * <strong>example:</strong>
         * <p>3888704</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus_Alert</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The annotation of the alert rule.</p>
         */
        @NameInMap("Annotations")
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleAnnotations> annotations;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c0bad479465464e1d8c1e641b0afb****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The ID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>10282</p>
         */
        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        /**
         * <p>The duration. The value ranges from 1 to 1440 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The expression of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100 * (sum(rate(container_cpu_usage_seconds_total[1m])) by (pod_name) / sum(label_replace(kube_pod_container_resource_limits_cpu_cores, \&quot;pod_name\&quot;, \&quot;$1\&quot;, \&quot;pod\&quot;, \&quot;(.*)\&quot;)) by (pod_name))&gt;75</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The tags of the alert rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<UpdatePrometheusAlertRuleResponseBodyPrometheusAlertRuleLabels> labels;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The CPU utilization of ${{$labels.pod_name}} exceeds 80%. Current value: {{$value}}%</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The method of that is used to send alert notifications. Valid values:</p>
         * <ul>
         * <li><code>ALERT_MANAGER</code>: Alert notifications are sent by Operation Center.</li>
         * <li><code>DISPATCH_RULE</code>: Alert notifications are sent based on the specified notification policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALERT_MANAGER</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <ul>
         * <li><code>1</code>: The alert rule is enabled.</li>
         * <li><code>0</code>: The alert rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes component alert</p>
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
