// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
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
    @NameInMap("PrometheusAlertRules")
    public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRules> prometheusAlertRules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9FEA6D00-317F-45E3-9004-7FB8B0B7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPrometheusAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertRulesResponseBody self = new ListPrometheusAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListPrometheusAlertRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public ListPrometheusAlertRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations extends TeaModel {
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
        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>severity</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the tag associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>critical</p>
         */
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

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags self = new ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusAlertRulesResponseBodyPrometheusAlertRules extends TeaModel {
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
         * <p>The annotations of the alert rule.</p>
         */
        @NameInMap("Annotations")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesAnnotations> annotations;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c0bad479465464e1d8c1e641b0afb****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The ID of the notification policy. This parameter is returned if the NotifyType parameter is set to <code>DISPATCH_RULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10282</p>
         */
        @NameInMap("DispatchRuleId")
        public Long dispatchRuleId;

        /**
         * <p>The duration of the alert. Valid values: 1 to 1440. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
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
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesLabels> labels;

        /**
         * <p>The alert message. Tags can be referenced in the {{$labels.xxx}} format.</p>
         * 
         * <strong>example:</strong>
         * <p>The CPU utilization of ${{$labels.pod_name}} exceeds 80%. Current value: {{$value}}%</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The method that is used to send alert notifications. Valid values:</p>
         * <ul>
         * <li>ALERT_MANAGER: Alert notifications are sent by Operation Center.</li>
         * <li>DISPATCH_RULE: Alert notifications are</li>
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
         * <li>1: The alert rule is enabled.</li>
         * <li>0: The alert rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags> tags;

        /**
         * <p>The type of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
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

        public ListPrometheusAlertRulesResponseBodyPrometheusAlertRules setTags(java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrometheusAlertRulesResponseBodyPrometheusAlertRulesTags> getTags() {
            return this.tags;
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
