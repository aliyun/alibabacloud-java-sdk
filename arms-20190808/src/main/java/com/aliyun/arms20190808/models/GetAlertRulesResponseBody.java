// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public GetAlertRulesResponseBodyPageBean pageBean;

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
        @NameInMap("AlertRuleItems")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContentAlertRuleItems> alertRuleItems;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterOpt")
        public String filterOpt;

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
        @NameInMap("CustomSLSFilters")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesFiltersCustomSLSFilters> customSLSFilters;

        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

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
        @NameInMap("Name")
        public String name;

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

    public static class GetAlertRulesResponseBodyPageBeanAlertRulesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAlertRulesResponseBodyPageBeanAlertRulesTags build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRulesResponseBodyPageBeanAlertRulesTags self = new GetAlertRulesResponseBodyPageBeanAlertRulesTags();
            return TeaModel.build(map, self);
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertRulesResponseBodyPageBeanAlertRulesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAlertRulesResponseBodyPageBeanAlertRules extends TeaModel {
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        @NameInMap("AlertGroup")
        public Long alertGroup;

        @NameInMap("AlertId")
        public Float alertId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertRuleContent")
        public GetAlertRulesResponseBodyPageBeanAlertRulesAlertRuleContent alertRuleContent;

        @NameInMap("AlertStatus")
        public String alertStatus;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("Annotations")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesAnnotations> annotations;

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
        public GetAlertRulesResponseBodyPageBeanAlertRulesFilters filters;

        @NameInMap("Labels")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesLabels> labels;

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

        @NameInMap("Tags")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesTags> tags;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

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

        public GetAlertRulesResponseBodyPageBeanAlertRules setTags(java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRulesTags> getTags() {
            return this.tags;
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
        @NameInMap("AlertRules")
        public java.util.List<GetAlertRulesResponseBodyPageBeanAlertRules> alertRules;

        @NameInMap("Page")
        public Long page;

        @NameInMap("Size")
        public Long size;

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
