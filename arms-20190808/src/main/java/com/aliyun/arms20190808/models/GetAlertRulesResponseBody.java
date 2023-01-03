// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesResponseBody extends TeaModel {
    // The pages that are returned.
    @NameInMap("PageBean")
    public GetAlertRulesResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRulesResponseBody self = new GetAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertRulesResponseBody setPageBean(GetAlertRulesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public GetAlertRulesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public GetAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems extends TeaModel {
        // The aggregation method of the alert condition. Valid values:
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
        // - CURRENT_GTE: greater than or equal to
        // - CURRENT_LTE: less than or equal to
        // - PREVIOUS_UP: the minute-to-minute increase percentage
        // - PREVIOUS_DOWN: the minute-to-minute decrease percentage
        // - HOH_UP: the increase percentage compared with the previous hour
        // - HOH_DOWN: the decrease percentage compared with the previous hour
        // - DOD_UP: the increase percentage compared with the last day
        // - DOD_DOWN: the decrease percentage compared with the last day
        @NameInMap("Operator")
        public String operator;

        // The threshold of the alert condition.
        @NameInMap("Value")
        public String value;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems self = new GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems setMetricKey(String metricKey) {
            this.metricKey = metricKey;
            return this;
        }
        public String getMetricKey() {
            return this.metricKey;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems setN(Float n) {
            this.n = n;
            return this;
        }
        public Float getN() {
            return this.n;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent extends TeaModel {
        // The trigger conditions of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("AlertRuleItems")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems> alertRuleItems;

        // The relationship between multiple alert conditions specified for the Application Monitoring or Browser Monitoring alert rule. Valid values:
        // 
        // *   OR: meets any of the specified conditions.
        // *   AND: meets all the specified conditions.
        @NameInMap("Condition")
        public String condition;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent self = new GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent setAlertRuleItems(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems> alertRuleItems) {
            this.alertRuleItems = alertRuleItems;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems> getAlertRuleItems() {
            return this.alertRuleItems;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations extends TeaModel {
        // The key of the annotation.
        @NameInMap("Name")
        public String name;

        // The value of the annotation.
        @NameInMap("Value")
        public String value;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations self = new GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters extends TeaModel {
        // The key of the filter condition.
        @NameInMap("Key")
        public String key;

        // The logical operator of the filter condition. Valid values:
        // 
        // *   \=: equal to
        // *   not: not equal to
        @NameInMap("Opt")
        public String opt;

        // Indicates whether this filter condition was displayed on the frontend.
        @NameInMap("Show")
        public Boolean show;

        // This field is used only to distinguish the type of Browser Monitoring logs. Other filter conditions do not include this field.
        @NameInMap("T")
        public String t;

        // The value of the filter condition.
        @NameInMap("Value")
        public String value;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters self = new GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters setOpt(String opt) {
            this.opt = opt;
            return this;
        }
        public String getOpt() {
            return this.opt;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters extends TeaModel {
        // The key of the filter condition.
        @NameInMap("FilterKey")
        public String filterKey;

        // The logical operator of the filter condition.
        @NameInMap("FilterOpt")
        public String filterOpt;

        // The details of the filter condition.
        @NameInMap("FilterValues")
        public java.util.List<String> filterValues;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters self = new GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters setFilterOpt(String filterOpt) {
            this.filterOpt = filterOpt;
            return this;
        }
        public String getFilterOpt() {
            return this.filterOpt;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters setFilterValues(java.util.List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesFilters extends TeaModel {
        // The custom filter condition of the Browser Monitoring alert rule.
        @NameInMap("CustomSLSFilters")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters> customSLSFilters;

        // The information of the aggregation dimension.
        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        // The details of the custom filter condition.
        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

        // The information about each filter condition of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("DimFilters")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters> dimFilters;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesFilters build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesFilters self = new GetAlertRulesResponseBodyPageBeanAlertRulesFilters();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters setCustomSLSFilters(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters> customSLSFilters) {
            this.customSLSFilters = customSLSFilters;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters> getCustomSLSFilters() {
            return this.customSLSFilters;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters setCustomSLSGroupByDimensions(java.util.List<String> customSLSGroupByDimensions) {
            this.customSLSGroupByDimensions = customSLSGroupByDimensions;
            return this;
        }
        public java.util.List<String> getCustomSLSGroupByDimensions() {
            return this.customSLSGroupByDimensions;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters setCustomSLSWheres(java.util.List<String> customSLSWheres) {
            this.customSLSWheres = customSLSWheres;
            return this;
        }
        public java.util.List<String> getCustomSLSWheres() {
            return this.customSLSWheres;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters setDimFilters(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters> dimFilters) {
            this.dimFilters = dimFilters;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersDimFilters> getDimFilters() {
            return this.dimFilters;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesLabels extends TeaModel {
        // The key of the tag.
        @NameInMap("Name")
        public String name;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesLabels self = new GetAlertRulesResponseBodyPageBeanAlertRulesLabels();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRules extends TeaModel {
        // The alert check type of the Prometheus alert rule. 
        // 
        // - STATIC: a static threshold value.
        // - CUSTOM: a custom PromQL statement.
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        // The alert contact group ID of the Prometheus alert rule. Valid values:
        // 
        // *   \-1: custom PromQL
        // *   1: Kubernetes load
        // *   15: Kubernetes node
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
        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent alertRuleContent;

        // The status of the alert rule. 
        // 
        // - RUNNING
        // - STOPPED
        // - PAUSED
        // 
        // >  The **PAUSED** status indicates that the alert rule is abnormal and is actively paused by the system. The alert rule may be paused because that it is not unique or the associated cluster has been deleted.
        @NameInMap("AlertStatus")
        public String alertStatus;

        // The type of the alert rule. Valid values:
        // 
        // *   APPLICATION_MONITORING_ALERT_RULE: an alert rule of Application Monitoring
        // *   BROWSER_MONITORING_ALERT_RULE: an alert rule of Browser Monitoring
        // *   PROMETHEUS_MONITORING_ALERT_RULE: an alert rule of Prometheus Service
        @NameInMap("AlertType")
        public String alertType;

        // The annotations of the Prometheus alert rule.
        @NameInMap("Annotations")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations> annotations;

        // Indicates whether the alert rule was applied to new applications that were created in Application Monitoring or Browser Monitoring. Valid values:
        // 
        // *   `true`: yes
        // *   `false`: no
        @NameInMap("AutoAddNewApplication")
        public Boolean autoAddNewApplication;

        // The cluster ID of the Prometheus alert rule.
        @NameInMap("ClusterId")
        public String clusterId;

        // The time when the alert rule was created. The value is a timestamp. Unit: milliseconds.
        @NameInMap("CreatedTime")
        public Long createdTime;

        // The duration of the Prometheus alert rule.
        @NameInMap("Duration")
        public String duration;

        // The extended field. 
        // 
        // >  For existing Application Monitoring alert rules, the field contains information such as contacts, alert template, and notification content.
        @NameInMap("Extend")
        public String extend;

        // The filter conditions of the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("Filters")
        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters filters;

        // The tags of the Prometheus alert rule.
        @NameInMap("Labels")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesLabels> labels;

        // The severity level of the Prometheus alert rule.
        // 
        // *   P1: Alert notifications are sent for major issues that affect the availability of core business, have huge impact, and may lead to serious consequences.
        // *   P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.
        // *   P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.
        // *   P4: Alert notifications are sent for low-priority issues that do not affect your business.
        // *   Default: Alert notifications are sent without distinguishing between alert levels.
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

        // The process ID (PID) that was associated with the Application Monitoring or Browser Monitoring alert rule.
        @NameInMap("Pids")
        public java.util.List<String> pids;

        // The PromQL statement of the Prometheus alert rule.
        @NameInMap("PromQL")
        public String promQL;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        // The time when the alert rule was updated. The value is a timestamp. Unit: milliseconds.
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        // The ID of the Alibaba Cloud account.
        @NameInMap("UserId")
        public String userId;

        public static GetAlertRulesResponseBodyPageBeanAlertRules build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRules self = new GetAlertRulesResponseBodyPageBeanAlertRules();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertCheckType(String alertCheckType) {
            this.alertCheckType = alertCheckType;
            return this;
        }
        public String getAlertCheckType() {
            return this.alertCheckType;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertGroup(Long alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public Long getAlertGroup() {
            return this.alertGroup;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertId(Float alertId) {
            this.alertId = alertId;
            return this;
        }
        public Float getAlertId() {
            return this.alertId;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertRuleContent(GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent alertRuleContent) {
            this.alertRuleContent = alertRuleContent;
            return this;
        }
        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent getAlertRuleContent() {
            return this.alertRuleContent;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAnnotations(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setAutoAddNewApplication(Boolean autoAddNewApplication) {
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }
        public Boolean getAutoAddNewApplication() {
            return this.autoAddNewApplication;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setFilters(GetAlertRulesResponseBodyPageBeanAlertRulesFilters filters) {
            this.filters = filters;
            return this;
        }
        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters getFilters() {
            return this.filters;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setLabels(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesLabels> getLabels() {
            return this.labels;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setMetricsType(String metricsType) {
            this.metricsType = metricsType;
            return this;
        }
        public String getMetricsType() {
            return this.metricsType;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setNotifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setPids(java.util.List<String> pids) {
            this.pids = pids;
            return this;
        }
        public java.util.List<String> getPids() {
            return this.pids;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAlertRulesResponseBodyPageBean extends TeaModel {
        // The type of the alert rule. 
        // 
        // - APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring
        // - BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring
        // - PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service
        @NameInMap("AlertRules")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRules> alertRules;

        // The page number of the returned page.
        @NameInMap("Page")
        public Long page;

        // The number of alert rules returned per page.
        @NameInMap("Size")
        public Long size;

        // The total number of queried alert rules.
        @NameInMap("Total")
        public Long total;

        public static GetAlertRulesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBean self = new GetAlertRulesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBean setAlertRules(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRules> alertRules) {
            this.alertRules = alertRules;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRules> getAlertRules() {
            return this.alertRules;
        }

        public GetAlertRulesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetAlertRulesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetAlertRulesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
