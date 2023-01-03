// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    // The object of the alert rule.
    @NameInMap("AlertRule")
    public CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleResponseBody self = new CreateOrUpdateAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleResponseBody setAlertRule(CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public CreateOrUpdateAlertRuleResponseBodyAlertRule getAlertRule() {
        return this.alertRule;
    }

    public CreateOrUpdateAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems extends TeaModel {
        // The aggregation method of the alert condition.
        // 
        // *   AVG: calculates the average value
        // *   SUM: calculates the total value
        // *   MAX: selects the maximum value
        // *   MIN: selects the minimum value
        @NameInMap("Aggregate")
        public String aggregate;

        // The metric of the alert condition.
        @NameInMap("MetricKey")
        public String metricKey;

        // Indicates the last N minutes.
        @NameInMap("N")
        public Float n;

        // The comparison operator that is used to compare the metric value with the threshold.
        // 
        // *   CURRENT_GTE: greater than or equal to
        // *   CURRENT_LTE: less than or equal to
        // *   PREVIOUS_UP: the minute-to-minute increase percentage
        // *   PREVIOUS_DOWN: the minute-to-minute decrease percentage
        // *   HOH_UP: the increase percentage compared with the previous hour
        // *   HOH_DOWN: the decrease percentage compared with the previous hour
        // *   DOD_UP: the increase percentage compared with the last day
        // *   DOD_DOWN: the decrease percentage compared with the last day
        @NameInMap("Operator")
        public String operator;

        // The threshold of the alert condition.
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setMetricKey(String metricKey) {
            this.metricKey = metricKey;
            return this;
        }
        public String getMetricKey() {
            return this.metricKey;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setN(Float n) {
            this.n = n;
            return this;
        }
        public Float getN() {
            return this.n;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent extends TeaModel {
        // The trigger conditions of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("AlertRuleItems")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems;

        // The relationship between multiple alert conditions specified for the Application Monitoring or Browser Monitoring alert rule.
        // 
        // *   OR: meets any of the specified conditions.
        // *   AND: meets all the specified conditions.
        @NameInMap("Condition")
        public String condition;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent setAlertRuleItems(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems) {
            this.alertRuleItems = alertRuleItems;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> getAlertRuleItems() {
            return this.alertRuleItems;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations extends TeaModel {
        // The key of the annotation.
        @NameInMap("Name")
        public String name;

        // The value of the annotation.
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters extends TeaModel {
        // The key of the filter condition.
        @NameInMap("Key")
        public String key;

        // The logical operator of the filter condition. 
        // 
        // - =: equal to
        // - not: not equal to
        @NameInMap("Opt")
        public String opt;

        // Indicates whether this filter condition is displayed on the frontend.
        @NameInMap("Show")
        public Boolean show;

        // This field is used only to distinguish the type of Browser Monitoring logs. Other filter conditions do not include this field.
        @NameInMap("T")
        public String t;

        // The value of the filter condition.
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setOpt(String opt) {
            this.opt = opt;
            return this;
        }
        public String getOpt() {
            return this.opt;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters extends TeaModel {
        // The key of the filter condition.
        @NameInMap("FilterKey")
        public String filterKey;

        // The logical operator of the filter condition.
        @NameInMap("FilterOpt")
        public String filterOpt;

        // The value of the filter condition.
        @NameInMap("FilterValues")
        public java.util.List<String> filterValues;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterOpt(String filterOpt) {
            this.filterOpt = filterOpt;
            return this;
        }
        public String getFilterOpt() {
            return this.filterOpt;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterValues(java.util.List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters extends TeaModel {
        // The custom filter condition of the Browser Monitoring alert rule.
        @NameInMap("CustomSLSFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters;

        // The value of the aggregation dimension.
        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        // The value of the custom filter condition.
        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

        // The information about each filter condition of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("DimFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> dimFilters;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSFilters(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters) {
            this.customSLSFilters = customSLSFilters;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> getCustomSLSFilters() {
            return this.customSLSFilters;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSGroupByDimensions(java.util.List<String> customSLSGroupByDimensions) {
            this.customSLSGroupByDimensions = customSLSGroupByDimensions;
            return this;
        }
        public java.util.List<String> getCustomSLSGroupByDimensions() {
            return this.customSLSGroupByDimensions;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSWheres(java.util.List<String> customSLSWheres) {
            this.customSLSWheres = customSLSWheres;
            return this;
        }
        public java.util.List<String> getCustomSLSWheres() {
            return this.customSLSWheres;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setDimFilters(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> dimFilters) {
            this.dimFilters = dimFilters;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> getDimFilters() {
            return this.dimFilters;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels extends TeaModel {
        // The key of the tag.
        @NameInMap("Name")
        public String name;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRule extends TeaModel {
        // The alert check type of the Prometheus alert rule. 
        // 
        // - STATIC: a static threshold value.
        // - CUSTOM: a custom PromQL statement.
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        // The alert contact group ID of the Prometheus alert rule. 
        // 
        // - -1: custom PromQL
        // - 1: Kubernetes load
        // - 15: Kubernetes node
        @NameInMap("AlertGroup")
        public Long alertGroup;

        // The ID of the alert rule.
        @NameInMap("AlertId")
        public Float alertId;

        // The name of the alert rule.
        @NameInMap("AlertName")
        public String alertName;

        // The content of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("AlertRuleContent")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent;

        // The status of the alert rule.
        // 
        // *   RUNNING
        // *   STOPPED
        // *   PAUSED
        // 
        // >  The **PAUSED** status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.
        @NameInMap("AlertStatus")
        public String alertStatus;

        // The type of the alert rule. Valid values:
        // 
        // *   APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring
        // *   BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring
        // *   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service
        @NameInMap("AlertType")
        public String alertType;

        // The annotations of the Prometheus alert rule.
        @NameInMap("Annotations")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations;

        // Indicates whether the alert rule is applied to new applications that are created in Application Monitoring or Browser Monitoring.
        // 
        // *   `true`: yes
        // *   `false`: no
        @NameInMap("AutoAddNewApplication")
        public Boolean autoAddNewApplication;

        // The cluster ID of the Prometheus alert rule.
        @NameInMap("ClusterId")
        public String clusterId;

        // The time when the alert rule was created.
        @NameInMap("CreatedTime")
        public Long createdTime;

        // The duration of the Prometheus alert rule. Unit: minutes.
        @NameInMap("Duration")
        public String duration;

        // The extended field.
        @NameInMap("Extend")
        public String extend;

        // The filter conditions of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("Filters")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters;

        // The tags of the Prometheus alert rule.
        @NameInMap("Labels")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels;

        // The level of the Prometheus alert rule. 
        // 
        // - P1: Alert notifications are sent for major issues that affect the availability of core business, have huge impact, and may lead to serious consequences.
        // - P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.
        // - P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.
        // - P4: Alert notifications are sent for low-priority issues that do not affect your business.
        // - Default: Alert notifications are sent without distinguishing between alert levels.
        @NameInMap("Level")
        public String level;

        // The alert message of the Prometheus alert rule.
        @NameInMap("Message")
        public String message;

        // The metric type of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("MetricsType")
        public String metricsType;

        // The name of the notification policy.
        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        // The PID of the application.
        @NameInMap("Pids")
        public java.util.List<String> pids;

        // The PromQL statement of the Prometheus alert rule.
        @NameInMap("PromQL")
        public String promQL;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        // The time when the alert rule was updated.
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        // The ID of the Alibaba Cloud account.
        @NameInMap("UserId")
        public String userId;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRule self = new CreateOrUpdateAlertRuleResponseBodyAlertRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertCheckType(String alertCheckType) {
            this.alertCheckType = alertCheckType;
            return this;
        }
        public String getAlertCheckType() {
            return this.alertCheckType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertGroup(Long alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public Long getAlertGroup() {
            return this.alertGroup;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertId(Float alertId) {
            this.alertId = alertId;
            return this;
        }
        public Float getAlertId() {
            return this.alertId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertRuleContent(CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent) {
            this.alertRuleContent = alertRuleContent;
            return this;
        }
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent getAlertRuleContent() {
            return this.alertRuleContent;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAnnotations(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAutoAddNewApplication(Boolean autoAddNewApplication) {
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }
        public Boolean getAutoAddNewApplication() {
            return this.autoAddNewApplication;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setFilters(CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters) {
            this.filters = filters;
            return this;
        }
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters getFilters() {
            return this.filters;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setLabels(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setMetricsType(String metricsType) {
            this.metricsType = metricsType;
            return this;
        }
        public String getMetricsType() {
            return this.metricsType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setNotifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setPids(java.util.List<String> pids) {
            this.pids = pids;
            return this;
        }
        public java.util.List<String> getPids() {
            return this.pids;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
