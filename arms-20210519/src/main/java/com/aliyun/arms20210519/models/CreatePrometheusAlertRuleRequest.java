// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Type")
    public String type;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Message")
    public String message;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Annotations")
    public String annotations;

    public static CreatePrometheusAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusAlertRuleRequest self = new CreatePrometheusAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrometheusAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreatePrometheusAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreatePrometheusAlertRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePrometheusAlertRuleRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public CreatePrometheusAlertRuleRequest setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public CreatePrometheusAlertRuleRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreatePrometheusAlertRuleRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreatePrometheusAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrometheusAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreatePrometheusAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

}
