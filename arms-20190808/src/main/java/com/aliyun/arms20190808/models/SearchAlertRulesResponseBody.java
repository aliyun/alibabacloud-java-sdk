// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("PageBean")
    public SearchAlertRulesResponseBodyPageBean pageBean;

    // The ID of the request.
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
        // The sub-title of the alert notification content.
        @NameInMap("AlarmContentSubTitle")
        public String alarmContentSubTitle;

        // The template of the alert notification.
        @NameInMap("AlarmContentTemplate")
        public String alarmContentTemplate;

        // The content of the alert notification.
        @NameInMap("Content")
        public String content;

        // The sub-title of the alert notification.
        @NameInMap("SubTitle")
        public String subTitle;

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

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules extends TeaModel {
        // The aggregation logic of the metric data of the alert rule. Valid values:
        // 
        // *   `AVG`: calculates the average value for each minute.
        // *   `SUM`: calculates the total value for each minute.
        // *   `MAX`: calculates the maximum value for each minute.
        // *   `MIN`: calculates the minimum value for each minute.
        @NameInMap("Aggregates")
        public String aggregates;

        // The displayed description of the alert metric.
        @NameInMap("Alias")
        public String alias;

        // The metric based on which alerts are triggered. For more information, see the "[Alert metrics](https://www.alibabacloud.com/help/zh/doc-detail/175825.htm?spm=a2c63.p38356.b99.373.61d25830rs3HHm#h2-url-4)" section in this topic.
        @NameInMap("Measure")
        public String measure;

        // The time range to query. Unit: minutes. For example, a value of 5 indicates that the alert rule applies to the data in the last 5 minutes.
        @NameInMap("NValue")
        public Integer NValue;

        // The operation logic of the condition. Valid values:
        // 
        // *   CURRENT_GTE: greater than or equal to.
        // *   CURRENT_LTE: less than or equal to.
        // *   PREVIOUS_UP: the minute-to-minute increase percentage.
        // *   PREVIOUS_DOWN: the minute-to-minute decrease percentage.
        // *   HOH_UP: the increase percentage compared with the previous hour.
        // *   HOH_DOWN: the decrease percentage compared with the previous hour.
        // *   DOD_UP: the increase percentage compared with the last day.
        // *   DOD_DOWN: the decrease percentage compared with the last day.
        @NameInMap("Operator")
        public String operator;

        // The threshold of the condition.
        @NameInMap("Value")
        public Float value;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules self = new SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setAggregates(String aggregates) {
            this.aggregates = aggregates;
            return this;
        }
        public String getAggregates() {
            return this.aggregates;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setMeasure(String measure) {
            this.measure = measure;
            return this;
        }
        public String getMeasure() {
            return this.measure;
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

        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRuleRules setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule extends TeaModel {
        // The logical operator between conditions. Valid values: `&`: AND. `|`: OR.
        @NameInMap("Operator")
        public String operator;

        // The condition of the alert rule.
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
        // The key of the dimension. Valid values:
        // 
        // - `rpc`: the name of the API.
        // - `rpcType`: the type of the API call, such as HTTP or DUBBO.
        // - `endpoint`: the name of the database.
        // - `rootIp`: the IP address of the host.
        @NameInMap("Key")
        public String key;

        // The type of the dimension. Valid values:
        // 
        // - `STATIC`: checks only the value of this dimension. In this case, you must set the **dimensions.value** parameter.
        // - `ALL`: checks the values of all dimensions. The metrics of all API calls are checked. If an API call triggers an alert, the name of the API is displayed in the alert notification. In this case, you do not need to set the **dimensions.value** parameter.
        // - `DISABLE`: aggregates the values of all dimensions. In this case, you do not need to set the **dimensions.value** parameter.
        @NameInMap("Type")
        public String type;

        // The value of the dimension.
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
        // The ID of the application group that is associated with the alert rule. This parameter is applicable to Enterprise Distributed Application Service (EDAS) applications.
        @NameInMap("AppGroupId")
        public String appGroupId;

        // The auto-increment ID of the ARMS application. You can ignore this ID.
        @NameInMap("AppId")
        public String appId;

        // The dimensions in the condition.
        @NameInMap("Dimensions")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> dimensions;

        // The PID of the application that is associated with the alert rule.
        @NameInMap("Pid")
        public String pid;

        // The type of the metric. Valid values: 
        // 
        // - `txn`: the number of API calls during application monitoring.
        // - `txn_type`: the types of API calls during application monitoring.
        // - `db`: database metrics.
        // - `jvm`: Java virtual machine (JVM) metrics.
        // - `host`: host metrics.
        // - `exception`: API call errors.
        @NameInMap("Type")
        public String type;

        public static SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam self = new SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam();
            return TeaModel.build(map, self);
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

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setDimensions(java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRulesNotice extends TeaModel {
        // The end of the time range when the alert rule takes effect within the 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
        @NameInMap("EndTime")
        public Long endTime;

        // The end of the time range when alert notifications are sent based on the alert rule within the 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
        @NameInMap("NoticeEndTime")
        public Long noticeEndTime;

        // The beginning of the time range when alert notifications are sent based on the alert rule within the 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
        @NameInMap("NoticeStartTime")
        public Long noticeStartTime;

        // The beginning of the time range when the alert rule takes effect within the 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
        @NameInMap("StartTime")
        public Long startTime;

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

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setNoticeStartTime(Long noticeStartTime) {
            this.noticeStartTime = noticeStartTime;
            return this;
        }
        public Long getNoticeStartTime() {
            return this.noticeStartTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBeanAlertRules extends TeaModel {
        // The format of the alert notification.
        @NameInMap("AlarmContext")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext alarmContext;

        // The severity of the alerts. Only the value `WARN` is supported.
        @NameInMap("AlertLevel")
        public String alertLevel;

        // The conditions of the alert rule. Multiple conditions are separated by the AND or OR logical operators.
        @NameInMap("AlertRule")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule alertRule;

        // The name of the alert rule.
        @NameInMap("AlertTitle")
        public String alertTitle;

        // The type of the alert rule. Valid values:
        // 
        // *   `1`: custom alert rules to monitor drill-down data sets.
        // *   `3`: custom alert rules to monitor tiled data sets.
        // *   `4`: alert rules to monitor the browser, including the default frontend alert rules.
        // *   `5`: alert rules to monitor applications, including the default application alert rules.
        // *   `6`: the default browser alert rules.
        // *   `7`: the default application alert rules.
        // *   `8`: Tracing Analysis alert rules.
        // *   `101`: Prometheus alert rules.
        @NameInMap("AlertType")
        public Integer alertType;

        // The version of the alert rule. Default value: `1`.
        @NameInMap("AlertVersion")
        public Integer alertVersion;

        // The notification method of the alerts. Valid values:
        // 
        // *   `SMS`: text message.
        // *   `MAIL`: email.
        // *   `DING_ROBOT`: DingTalk chatbot.
        @NameInMap("AlertWays")
        public java.util.List<String> alertWays;

        // The configuration items of the alert rule. The value is a JSON string.
        // 
        // The configuration item **continuous** specifies whether to continuously send alert notifications. Valid values:
        // 
        // *   `true`: Alert notifications are sent every minute.
        // *   `false`: The alert silence feature is enabled.
        // 
        // The configuration item **dataRevision** specifies the data revision policy to be used if no data is obtained or the data is null. Default value: 2. Valid values:
        // 
        // *   `0`: overwrites the data by using the value 0.
        // *   `1`: overwrites the data by using the value 1.
        // *   `2`: overwrites the data by using the value null. This value indicates that no alert is triggered if no data exists.
        @NameInMap("Config")
        public String config;

        // The ID of the contact group. Multiple IDs are separated by commas (,).
        @NameInMap("ContactGroupIdList")
        public String contactGroupIdList;

        // The IDs of the alert contact groups. The value is a JSON array.
        @NameInMap("ContactGroupIds")
        public String contactGroupIds;

        // The timestamp showing when the alert rule was created.
        @NameInMap("CreateTime")
        public Long createTime;

        // Indicates whether the alert is sent through the alert center. Valid values:
        // 
        // *   `true`
        // *   `false`
        @NameInMap("HostByAlertManager")
        public Boolean hostByAlertManager;

        // The ID of the alert rule.
        @NameInMap("Id")
        public Long id;

        // The information about the application that is associated with the alert rule.
        @NameInMap("MetricParam")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam metricParam;

        // The time ranges when the alert rule takes effect and when alert notifications are sent.
        @NameInMap("Notice")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice notice;

        // The ID of the region to which the alert rule belongs.
        @NameInMap("RegionId")
        public String regionId;

        // The status of the alert rule. `RUNNING`: The alert rule is enabled. `STOPPED`: The alert rule is disabled.
        @NameInMap("Status")
        public String status;

        // The ID of the Application Real-Time Monitoring Service (ARMS) task that is associated with the alert rule.
        @NameInMap("TaskId")
        public Long taskId;

        // The status of the task. This parameter is hidden from users.
        @NameInMap("TaskStatus")
        public String taskStatus;

        // The name of the alert.
        @NameInMap("Title")
        public String title;

        // The timestamp showing when the alert rule was updated.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the user to which the alert rule belongs.
        @NameInMap("UserId")
        public String userId;

        public static SearchAlertRulesResponseBodyPageBeanAlertRules build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesResponseBodyPageBeanAlertRules self = new SearchAlertRulesResponseBodyPageBeanAlertRules();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlarmContext(SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext alarmContext) {
            this.alarmContext = alarmContext;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext getAlarmContext() {
            return this.alarmContext;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertRule(SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule alertRule) {
            this.alertRule = alertRule;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule getAlertRule() {
            return this.alertRule;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertType(Integer alertType) {
            this.alertType = alertType;
            return this;
        }
        public Integer getAlertType() {
            return this.alertType;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertVersion(Integer alertVersion) {
            this.alertVersion = alertVersion;
            return this;
        }
        public Integer getAlertVersion() {
            return this.alertVersion;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setAlertWays(java.util.List<String> alertWays) {
            this.alertWays = alertWays;
            return this;
        }
        public java.util.List<String> getAlertWays() {
            return this.alertWays;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setContactGroupIdList(String contactGroupIdList) {
            this.contactGroupIdList = contactGroupIdList;
            return this;
        }
        public String getContactGroupIdList() {
            return this.contactGroupIdList;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setContactGroupIds(String contactGroupIds) {
            this.contactGroupIds = contactGroupIds;
            return this;
        }
        public String getContactGroupIds() {
            return this.contactGroupIds;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setHostByAlertManager(Boolean hostByAlertManager) {
            this.hostByAlertManager = hostByAlertManager;
            return this;
        }
        public Boolean getHostByAlertManager() {
            return this.hostByAlertManager;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setMetricParam(SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam metricParam) {
            this.metricParam = metricParam;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam getMetricParam() {
            return this.metricParam;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setNotice(SearchAlertRulesResponseBodyPageBeanAlertRulesNotice notice) {
            this.notice = notice;
            return this;
        }
        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice getNotice() {
            return this.notice;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
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

        public SearchAlertRulesResponseBodyPageBeanAlertRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertRulesResponseBodyPageBeanAlertRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchAlertRulesResponseBodyPageBean extends TeaModel {
        // The details of the alert rules.
        @NameInMap("AlertRules")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRules> alertRules;

        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of returned entries.
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
