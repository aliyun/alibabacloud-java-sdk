// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleRequest extends TeaModel {
    @NameInMap("AlertCheckType")
    public String alertCheckType;

    @NameInMap("AlertGroup")
    public Long alertGroup;

    // 告警规则ID
    @NameInMap("AlertId")
    public Long alertId;

    // 告警规则名称
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("AlertRuleContent")
    public String alertRuleContent;

    @NameInMap("AlertStatus")
    public String alertStatus;

    // 告警规则类型
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("AutoAddNewApplication")
    public Boolean autoAddNewApplication;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("Filters")
    public String filters;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Level")
    public String level;

    @NameInMap("Message")
    public String message;

    @NameInMap("MetricsKey")
    public String metricsKey;

    @NameInMap("MetricsType")
    public String metricsType;

    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    @NameInMap("Pids")
    public String pids;

    @NameInMap("PromQL")
    public String promQL;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOrUpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleRequest self = new CreateOrUpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleRequest setAlertCheckType(String alertCheckType) {
        this.alertCheckType = alertCheckType;
        return this;
    }
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    public CreateOrUpdateAlertRuleRequest setAlertGroup(Long alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public Long getAlertGroup() {
        return this.alertGroup;
    }

    public CreateOrUpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public CreateOrUpdateAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreateOrUpdateAlertRuleRequest setAlertRuleContent(String alertRuleContent) {
        this.alertRuleContent = alertRuleContent;
        return this;
    }
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    public CreateOrUpdateAlertRuleRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public CreateOrUpdateAlertRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public CreateOrUpdateAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateOrUpdateAlertRuleRequest setAutoAddNewApplication(Boolean autoAddNewApplication) {
        this.autoAddNewApplication = autoAddNewApplication;
        return this;
    }
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    public CreateOrUpdateAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOrUpdateAlertRuleRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateOrUpdateAlertRuleRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public CreateOrUpdateAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateOrUpdateAlertRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateOrUpdateAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsKey(String metricsKey) {
        this.metricsKey = metricsKey;
        return this;
    }
    public String getMetricsKey() {
        return this.metricsKey;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsType(String metricsType) {
        this.metricsType = metricsType;
        return this;
    }
    public String getMetricsType() {
        return this.metricsType;
    }

    public CreateOrUpdateAlertRuleRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public CreateOrUpdateAlertRuleRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public CreateOrUpdateAlertRuleRequest setPromQL(String promQL) {
        this.promQL = promQL;
        return this;
    }
    public String getPromQL() {
        return this.promQL;
    }

    public CreateOrUpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
