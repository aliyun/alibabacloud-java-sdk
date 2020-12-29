// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    public SearchAlertRulesResponseBodyPageBean pageBean;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesResponseBody self = new SearchAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertRulesResponseBody setPageBean(SearchAlertRulesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchAlertRulesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext extends TeaModel {
        @NameInMap("AlarmContentSubTitle")
        public String alarmContentSubTitle;

        @NameInMap("AlarmContentTemplate")
        public String alarmContentTemplate;

        @NameInMap("SubTitle")
        public String subTitle;

        @NameInMap("Content")
        public String content;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext self = new SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setAlarmContentSubTitle(String alarmContentSubTitle) {
            this.alarmContentSubTitle = alarmContentSubTitle;
            return this;
        }
        public String getAlarmContentSubTitle() {
            return this.alarmContentSubTitle;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setAlarmContentTemplate(String alarmContentTemplate) {
            this.alarmContentTemplate = alarmContentTemplate;
            return this;
        }
        public String getAlarmContentTemplate() {
            return this.alarmContentTemplate;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesNotice extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("NoticeEndTime")
        public Long noticeEndTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("NoticeStartTime")
        public Long noticeStartTime;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesNotice build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesNotice self = new SearchAlertRulesResponseBodyPageBeanAlertRulesNotice();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setNoticeEndTime(Long noticeEndTime) {
            this.noticeEndTime = noticeEndTime;
            return this;
        }
        public Long getNoticeEndTime() {
            return this.noticeEndTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setNoticeStartTime(Long noticeStartTime) {
            this.noticeStartTime = noticeStartTime;
            return this;
        }
        public Long getNoticeStartTime() {
            return this.noticeStartTime;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules extends TeaModel {
        @NameInMap("Measure")
        public String measure;

        @NameInMap("Value")
        public Float value;

        @NameInMap("Aggregates")
        public String aggregates;

        @NameInMap("NValue")
        public Integer NValue;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Alias")
        public String alias;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules self = new SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setMeasure(String measure) {
            this.measure = measure;
            return this;
        }
        public String getMeasure() {
            return this.measure;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setAggregates(String aggregates) {
            this.aggregates = aggregates;
            return this;
        }
        public String getAggregates() {
            return this.aggregates;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setNValue(Integer NValue) {
            this.NValue = NValue;
            return this;
        }
        public Integer getNValue() {
            return this.NValue;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule extends TeaModel {
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Rules")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules> rules;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule self = new SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule setRules(java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules> getRules() {
            return this.rules;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions self = new SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("AppGroupId")
        public String appGroupId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Dimensions")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> dimensions;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam self = new SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setAppGroupId(String appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public String getAppGroupId() {
            return this.appGroupId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setDimensions(java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> getDimensions() {
            return this.dimensions;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRules extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AlarmContext")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext alarmContext;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ContactGroupIdList")
        public String contactGroupIdList;

        @NameInMap("Notice")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice notice;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AlertTitle")
        public String alertTitle;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("AlertVersion")
        public Integer alertVersion;

        @NameInMap("AlertRule")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule alertRule;

        @NameInMap("MetricParam")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam metricParam;

        @NameInMap("AlertType")
        public Integer alertType;

        @NameInMap("ContactGroupIds")
        public String contactGroupIds;

        @NameInMap("Config")
        public String config;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AlertLevel")
        public String alertLevel;

        @NameInMap("AlertWay")
        public java.util.List<String> alertWay;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("Title")
        public String title;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("AlertWays")
        public java.util.List<String> alertWays;

        public static SearchAlertRulesResponseBodyPageBeanAlertRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRules self = new SearchAlertRulesResponseBodyPageBeanAlertRules();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlarmContext(SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext alarmContext) {
            this.alarmContext = alarmContext;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext getAlarmContext() {
            return this.alarmContext;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setContactGroupIdList(String contactGroupIdList) {
            this.contactGroupIdList = contactGroupIdList;
            return this;
        }
        public String getContactGroupIdList() {
            return this.contactGroupIdList;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setNotice(SearchAlertRulesResponseBodyPageBeanAlertRulesNotice notice) {
            this.notice = notice;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice getNotice() {
            return this.notice;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertVersion(Integer alertVersion) {
            this.alertVersion = alertVersion;
            return this;
        }
        public Integer getAlertVersion() {
            return this.alertVersion;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertRule(SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule getAlertRule() {
            return this.alertRule;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setMetricParam(SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam metricParam) {
            this.metricParam = metricParam;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam getMetricParam() {
            return this.metricParam;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertType(Integer alertType) {
            this.alertType = alertType;
            return this;
        }
        public Integer getAlertType() {
            return this.alertType;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setContactGroupIds(String contactGroupIds) {
            this.contactGroupIds = contactGroupIds;
            return this;
        }
        public String getContactGroupIds() {
            return this.contactGroupIds;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertWay(java.util.List<String> alertWay) {
            this.alertWay = alertWay;
            return this;
        }
        public java.util.List<String> getAlertWay() {
            return this.alertWay;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertWays(java.util.List<String> alertWays) {
            this.alertWays = alertWays;
            return this;
        }
        public java.util.List<String> getAlertWays() {
            return this.alertWays;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBean extends TeaModel {
        @NameInMap("AlertRules")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRules> alertRules;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchAlertRulesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBean self = new SearchAlertRulesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBean setAlertRules(java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRules> alertRules) {
            this.alertRules = alertRules;
            return this;
        }
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRules> getAlertRules() {
            return this.alertRules;
        }

        public SearchAlertRulesResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAlertRulesResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAlertRulesResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
