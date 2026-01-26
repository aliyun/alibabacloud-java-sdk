// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3888704</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prometheus_Alert</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The annotations that are described in a JSON string. You must specify the name and value of each annotation.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Value&quot;: &quot;xxx&quot;,&quot;Name&quot;: &quot;description&quot;}]</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c0bad479465464e1d8c1e641b0afb****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the notification policy. This parameter is required if the NotifyType parameter is set to <code>DISPATCH_RULE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10282</p>
     */
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    /**
     * <p>The duration. The value ranges from 1 to 1440 minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The expression of the alert rule. The expression must follow the PromQL syntax.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100 * (sum(rate(container_cpu_usage_seconds_total[1m])) by (pod_name) / sum(label_replace(kube_pod_container_resource_limits_cpu_cores, \&quot;pod_name\&quot;, \&quot;$1\&quot;, \&quot;pod\&quot;, \&quot;(.*)\&quot;)) by (pod_name))&gt;75</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The tags that are described in a JSON string. You must specify the name and value of each tag.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Value&quot;: &quot;critical&quot;,&quot;Name&quot;: &quot;severity&quot;}]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The alert message. Tags can be referenced in the {{$labels.xxx}} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The CPU utilization of ${{$labels.pod_name}} exceeds 80%. Current value: {{$value}}%</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The method that is used to send alert notifications. Valid values:</p>
     * <ul>
     * <li><code>ALERT_MANAGER</code>: Alert notifications are sent by Operation Center. This is the default value.</li>
     * <li><code>DISPATCH_RULE</code>: Alert notifications are sent based on the specified notification policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALERT_MANAGER</p>
     */
    @NameInMap("NotifyType")
    public String notifyType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdatePrometheusAlertRuleRequestTags> tags;

    /**
     * <p>The type of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes component alert</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdatePrometheusAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusAlertRuleRequest self = new UpdatePrometheusAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public UpdatePrometheusAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public UpdatePrometheusAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public UpdatePrometheusAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusAlertRuleRequest setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public UpdatePrometheusAlertRuleRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public UpdatePrometheusAlertRuleRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdatePrometheusAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdatePrometheusAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePrometheusAlertRuleRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public UpdatePrometheusAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusAlertRuleRequest setTags(java.util.List<UpdatePrometheusAlertRuleRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdatePrometheusAlertRuleRequestTags> getTags() {
        return this.tags;
    }

    public UpdatePrometheusAlertRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdatePrometheusAlertRuleRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdatePrometheusAlertRuleRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusAlertRuleRequestTags self = new UpdatePrometheusAlertRuleRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusAlertRuleRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePrometheusAlertRuleRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
