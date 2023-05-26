// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusAlertRuleRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Message")
    public String message;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.List<UpdatePrometheusAlertRuleRequestTags> tags;

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
        @NameInMap("Key")
        public String key;

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
