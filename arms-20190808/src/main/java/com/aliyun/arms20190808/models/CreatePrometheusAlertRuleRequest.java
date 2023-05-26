// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusAlertRuleRequest extends TeaModel {
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
    public java.util.List<CreatePrometheusAlertRuleRequestTags> tags;

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
        @NameInMap("Key")
        public String key;

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
