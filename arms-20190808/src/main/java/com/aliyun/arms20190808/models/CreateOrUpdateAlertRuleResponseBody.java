// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    @NameInMap("AlertRule")
    public CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule;

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
        @NameInMap("Aggregate")
        public String aggregate;

        @NameInMap("MetricKey")
        public String metricKey;

        @NameInMap("N")
        public Float n;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("AlertRuleItems")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Opt")
        public String opt;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("T")
        public String t;

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
        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterOpt")
        public String filterOpt;

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
        @NameInMap("CustomSLSFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters;

        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        @NameInMap("AlertGroup")
        public Long alertGroup;

        @NameInMap("AlertId")
        public Float alertId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertRuleContent")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent;

        @NameInMap("AlertStatus")
        public String alertStatus;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("Annotations")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations;

        @NameInMap("AutoAddNewApplication")
        public Boolean autoAddNewApplication;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Filters")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters;

        @NameInMap("Labels")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MetricsType")
        public String metricsType;

        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        @NameInMap("Pids")
        public java.util.List<String> pids;

        @NameInMap("PromQL")
        public String promQL;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

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
