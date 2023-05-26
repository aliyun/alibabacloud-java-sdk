// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the alert rule.</p>
     */
    @NameInMap("AlertRule")
    public CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The aggregation method of the alert condition. Valid values:</p>
         * <br>
         * <p>*   AVG: calculates the average value</p>
         * <p>*   SUM: calculates the total value</p>
         * <p>*   MAX: selects the maximum value</p>
         * <p>*   MIN: selects the minimum value</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The metric of the alert condition.</p>
         */
        @NameInMap("MetricKey")
        public String metricKey;

        /**
         * <p>Indicates the last N minutes.</p>
         */
        @NameInMap("N")
        public Float n;

        /**
         * <p>The comparison operator that was used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   CURRENT_GTE: greater than or equal to</p>
         * <p>*   CURRENT_LTE: less than or equal to</p>
         * <p>*   PREVIOUS_UP: the increase percentage compared with the last period</p>
         * <p>*   PREVIOUS_DOWN: the decrease percentage compared with the last period</p>
         * <p>*   HOH_UP: the increase percentage compared with the last hour</p>
         * <p>*   HOH_DOWN: the decrease percentage compared with the last hour</p>
         * <p>*   DOD_UP: the increase percentage compared with the last day</p>
         * <p>*   DOD_DOWN: the decrease percentage compared with the last day</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold of the alert condition.</p>
         */
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
        /**
         * <p>The trigger conditions of the Application Monitoring or Browser Monitoring alert rule.</p>
         */
        @NameInMap("AlertRuleItems")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems;

        /**
         * <p>The relationship between multiple alert conditions that were specified for the Application Monitoring or Browser Monitoring alert rule. Valid values:</p>
         * <br>
         * <p>*   OR: meets any of the specified conditions.</p>
         * <p>*   AND: meets all the specified conditions.</p>
         */
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
        /**
         * <p>The key of the annotation.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the annotation.</p>
         */
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
        /**
         * <p>The key of the filter condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The logical operator of the filter condition. Valid values:</p>
         * <br>
         * <p>*   \=: equal to</p>
         * <p>*   not: not equal to</p>
         */
        @NameInMap("Opt")
        public String opt;

        /**
         * <p>Indicates whether this filter condition was displayed on the frontend.</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>The log type of Browser Monitoring. This field was not included in other filter conditions.</p>
         */
        @NameInMap("T")
        public String t;

        /**
         * <p>The value of the filter condition.</p>
         */
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
        /**
         * <p>The key of the filter condition.</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The logical operator of the filter condition.</p>
         */
        @NameInMap("FilterOpt")
        public String filterOpt;

        /**
         * <p>The details of the filter condition.</p>
         */
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
        /**
         * <p>The custom filter condition of the Browser Monitoring alert rule.</p>
         */
        @NameInMap("CustomSLSFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters;

        /**
         * <p>The information of the aggregation dimension.</p>
         */
        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        /**
         * <p>The details of the custom filter condition.</p>
         */
        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

        /**
         * <p>The information about each filter condition of the Application Monitoring or Browser Monitoring alert rule.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value.</p>
         */
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

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleTags build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleTags self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleTags();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRule extends TeaModel {
        /**
         * <p>The alert check type of the Prometheus alert rule. Valid values:</p>
         * <br>
         * <p>*   STATIC: a static threshold value.</p>
         * <p>*   CUSTOM: a custom PromQL statement.</p>
         */
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        /**
         * <p>The alert contact group ID of the Prometheus alert rule. Valid values:</p>
         * <br>
         * <p>*   \-1: custom PromQL</p>
         * <p>*   1: Kubernetes load</p>
         * <p>*   15: Kubernetes node</p>
         */
        @NameInMap("AlertGroup")
        public Long alertGroup;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("AlertId")
        public Float alertId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The content of the Application Monitoring or Browser Monitoring alert rule.</p>
         */
        @NameInMap("AlertRuleContent")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent;

        /**
         * <p>The status of the alert rule. Valid values:</p>
         * <br>
         * <p>*   RUNNING</p>
         * <p>*   STOPPED</p>
         * <p>*   PAUSED</p>
         * <br>
         * <p>> The **PAUSED** status indicates that the alert rule was abnormal and was paused by the system. The alert rule might be paused because it was not unique or the associated cluster was deleted.</p>
         */
        @NameInMap("AlertStatus")
        public String alertStatus;

        /**
         * <p>The type of the alert rule.</p>
         * <br>
         * <p>*   APPLICATION_MONITORING_ALERT_RULE: an alert rule of Application Monitoring</p>
         * <p>*   BROWSER_MONITORING_ALERT_RULE: an alert rule of Browser Monitoring</p>
         * <p>*   PROMETHEUS_MONITORING_ALERT_RULE: an alert rule of Prometheus Service</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The annotations of the Prometheus alert rule.</p>
         */
        @NameInMap("Annotations")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations;

        /**
         * <p>Indicates whether the alert rule was applied to new applications that were created in Application Monitoring or Browser Monitoring. Valid values:</p>
         * <br>
         * <p>*   `true`: yes</p>
         * <p>*   `false`: no</p>
         */
        @NameInMap("AutoAddNewApplication")
        public Boolean autoAddNewApplication;

        /**
         * <p>The cluster ID of the Prometheus alert rule.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The timestamp generated when the alert rule was created. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The duration of the Prometheus alert rule. Unit: minutes.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The extended fields.</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The filter conditions of the Application Monitoring or Browser Monitoring alert rule.</p>
         */
        @NameInMap("Filters")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters;

        /**
         * <p>The tags of the Prometheus alert rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels;

        /**
         * <p>The severity level of the Prometheus alert rule.</p>
         * <br>
         * <p>*   P1: Alert notifications are sent for major issues that affect the availability of core business, have a huge impact, and may lead to serious consequences.</p>
         * <p>*   P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.</p>
         * <p>*   P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.</p>
         * <p>*   P4: Alert notifications are sent for low-priority issues that do not affect your business.</p>
         * <p>*   Default: Alert notifications are sent regardless of alert levels.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The alert message of the Prometheus alert rule.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The metric type of the Application Monitoring or Browser Monitoring alert rule.</p>
         */
        @NameInMap("MetricsType")
        public String metricsType;

        /**
         * <p>The name of the notification policy.</p>
         */
        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        /**
         * <p>The process ID (PID) that was associated with the Application Monitoring or Browser Monitoring alert rule.</p>
         */
        @NameInMap("Pids")
        public java.util.List<String> pids;

        /**
         * <p>The PromQL statement of the Prometheus alert rule.</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tags")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> tags;

        /**
         * <p>The timestamp generated when the alert rule was updated. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
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

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setTags(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> getTags() {
            return this.tags;
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
