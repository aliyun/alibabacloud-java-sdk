// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the ListPrometheusAlertRules operation to query the ID of the alert rule.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The annotations that are described in a JSON string. You must specify the name and value of each annotation.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the notification policy. This parameter is required if the **NotifyType** parameter is set to `DISPATCH_RULE`.</p>
     */
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    /**
     * <p>The duration of the alert. Valid values: 1 to 1440. Unit: minutes.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The expression of the alert rule. The expression must follow the PromQL syntax.</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The tags that are described in a JSON string. You must specify the name and value of each tag.</p>
     */
    @NameInMap("Labels")
    public String labels;

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
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the alert rule.</p>
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

    public UpdatePrometheusAlertRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
