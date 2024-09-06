// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleRequest extends TeaModel {
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
     * <p>The ID of the cluster.</p>
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
     * <p>10m</p>
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
     * <p>The content of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The CPU utilization of ${{$labels.pod_name}} has exceeded 80%. Current value: {{$value}}%</p>
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
     * <p>The ID of the region.</p>
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
    public java.util.List<CreatePrometheusAlertRuleRequestTags> tags;

    /**
     * <p>The type of the alert rule. Valid values:</p>
     * <ul>
     * <li>99: custom alert</li>
     * <li>101: Prometheus Service alert</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePrometheusAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusAlertRuleRequest self = new CreatePrometheusAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreatePrometheusAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreatePrometheusAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreatePrometheusAlertRuleRequest setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public CreatePrometheusAlertRuleRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreatePrometheusAlertRuleRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreatePrometheusAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreatePrometheusAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrometheusAlertRuleRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public CreatePrometheusAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrometheusAlertRuleRequest setTags(java.util.List<CreatePrometheusAlertRuleRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePrometheusAlertRuleRequestTags> getTags() {
        return this.tags;
    }

    public CreatePrometheusAlertRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreatePrometheusAlertRuleRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrometheusAlertRuleRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusAlertRuleRequestTags self = new CreatePrometheusAlertRuleRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusAlertRuleRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrometheusAlertRuleRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
