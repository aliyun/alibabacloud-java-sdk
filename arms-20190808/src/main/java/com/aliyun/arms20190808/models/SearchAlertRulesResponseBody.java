// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PageBean")
    public SearchAlertRulesResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
     */
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
        /**
         * <p>The sub-title of the alert notification content.</p>
         * 
         * <strong>example:</strong>
         * <p>TestSubTitle</p>
         */
        @NameInMap("AlarmContentSubTitle")
        public String alarmContentSubTitle;

        /**
         * <p>The template of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert name: $Alert name\nFilter condition: $Filter\nAlert time: $Alert time\nAlert content: $Alert content\nNote: The alert persists until a reply email is received. The system will remind you again in 24 hours.</p>
         */
        @NameInMap("AlarmContentTemplate")
        public String alarmContentTemplate;

        /**
         * <p>The content of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert name: $Alert name\nFilter condition: $Filter\nAlert time: $Alert time\nAlert content: $Alert content\nNote: The alert persists until a reply email is received. The system will remind you again in 24 hours.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The sub-title of the alert notification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The aggregation logic of the metric data of the alert rule. Valid values:</p>
         * <ul>
         * <li><code>AVG</code>: calculates the average value for each minute</li>
         * <li><code>SUM</code>: calculates the total value for each minute</li>
         * <li><code>MAX</code>: calculates the maximum value for each minute</li>
         * <li><code>MIN</code>: calculates the minimum value for each minute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        @NameInMap("Aggregates")
        public String aggregates;

        /**
         * <p>The displayed description of the alert metric.</p>
         * 
         * <strong>example:</strong>
         * <p>response time_ms</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The metric based on which alerts are triggered. For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/175825.html#h2-url-4">Alert metrics</a>&quot; section in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.jvm.SystemDiskFree</p>
         */
        @NameInMap("Measure")
        public String measure;

        /**
         * <p>The time range when data is requested. Unit: minutes. For example, a value of 5 indicates that the alert rule applies to the data in the last 5 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NValue")
        public Integer NValue;

        /**
         * <p>The operation logic of the condition. Valid values:</p>
         * <ul>
         * <li>CURRENT_GTE: greater than or equal to</li>
         * <li>CURRENT_LTE: less than or equal to</li>
         * <li>PREVIOUS_UP: the increase percentage compared with the last period</li>
         * <li>PREVIOUS_DOWN: the decrease percentage compared with the last period</li>
         * <li>HOH_UP: the increase percentage compared with the last hour</li>
         * <li>HOH_DOWN: the decrease percentage compared with the last hour</li>
         * <li>DOD_UP: the increase percentage compared with the last day</li>
         * <li>DOD_DOWN: the decrease percentage compared with the last day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_GTE</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold of the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
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
        /**
         * <p>The logical operator between conditions. Valid values: <code>&amp;</code>: AND. <code>|</code>: OR.</p>
         * 
         * <strong>example:</strong>
         * <p>|</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The condition of the alert rule.</p>
         */
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
        /**
         * <p>The key of the dimension. Valid values:</p>
         * <ul>
         * <li><code>rpc</code>: the name of the API</li>
         * <li><code>rpcType</code>: the type of the API call, such as HTTP or DUBBO</li>
         * <li><code>endpoint</code>: the name of the database</li>
         * <li><code>rootIp</code>: the IP address of the host</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rootIp</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the dimension. Valid values:</p>
         * <ul>
         * <li><code>STATIC</code>: checks only the value of this dimension. In this case, you must set the <strong>dimensions.value</strong> parameter.</li>
         * <li><code>ALL</code>: checks the values of all dimensions. The metrics of all API calls are checked. If an API call triggers an alert, the name of the API is displayed in the alert notification. In this case, you do not need to set the <strong>dimensions.value</strong> parameter.</li>
         * <li><code>DISABLE</code>: aggregates the values of all dimensions. In this case, you do not need to set the <strong>dimensions.value</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;127.0.0.1&quot;</p>
         */
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
        /**
         * <p>The ID of the application group that is associated with the alert rule. This parameter is applicable to Enterprise Distributed Application Service (EDAS) applications.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("AppGroupId")
        public String appGroupId;

        /**
         * <p>The auto-increment ID of the ARMS application. You can ignore this ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The dimensions in the condition.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParamDimensions> dimensions;

        /**
         * <p>The PID of the application that is associated with the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>9870ca99-8105-4da7-a3a4-d72dd1b1****</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The type of the metric. Valid values:</p>
         * <ul>
         * <li><code>txn</code>: the number of API calls during application monitoring</li>
         * <li><code>txn_type</code>: the types of API calls during application monitoring</li>
         * <li><code>db</code>: database metrics</li>
         * <li><code>jvm</code>: Java virtual machine (JVM) metrics</li>
         * <li><code>host</code>: host metrics</li>
         * <li><code>exception</code>: API call errors</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DB</p>
         */
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
        /**
         * <p>The end of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>1480607940000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The end of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>1480607940000</p>
         */
        @NameInMap("NoticeEndTime")
        public Long noticeEndTime;

        /**
         * <p>The beginning of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>1480521600000</p>
         */
        @NameInMap("NoticeStartTime")
        public Long noticeStartTime;

        /**
         * <p>The beginning of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>1480521600000</p>
         */
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
        /**
         * <p>The format of the alert notification.</p>
         */
        @NameInMap("AlarmContext")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlarmContext alarmContext;

        /**
         * <p>The severity of the alerts. Only the value <code>WARN</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("AlertLevel")
        public String alertLevel;

        /**
         * <p>The conditions of the alert rule. Multiple conditions are separated by the AND or OR logical operators.</p>
         */
        @NameInMap("AlertRule")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesAlertRule alertRule;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlertRule</p>
         */
        @NameInMap("AlertTitle")
        public String alertTitle;

        /**
         * <p>The type of the alert rule. Valid values:</p>
         * <ul>
         * <li><code>1</code>: custom alert rules that are used to monitor drill-down data sets</li>
         * <li><code>3</code>: custom alert rules that are used to monitor tiled data sets</li>
         * <li><code>4</code>: alert rules that are used to monitor the browser, including the default frontend alert rules</li>
         * <li><code>5</code>: alert rules that are used to monitor applications, including the default application alert rules</li>
         * <li><code>6</code>: the default browser alert rules</li>
         * <li><code>7</code>: the default application alert rules</li>
         * <li><code>8</code>: Tracing Analysis alert rules</li>
         * <li><code>101</code>: Prometheus alert rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AlertType")
        public Integer alertType;

        /**
         * <p>The version of the alert rule. Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertVersion")
        public Integer alertVersion;

        /**
         * <p>Sending method of alarm notification.</p>
         */
        @NameInMap("AlertWays")
        public java.util.List<String> alertWays;

        /**
         * <p>The configuration items of the alert rule. The value is a JSON string.</p>
         * <p>The configuration item <strong>continuous</strong> indicates whether alert notifications are continuously sent. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Alert notifications are sent every minute.</li>
         * <li><code>false</code>: The alert silence feature is enabled.</li>
         * </ul>
         * <p>The configuration item <strong>dataRevision</strong> indicates the data revision policy that is used if no data is obtained or the data is null. Default value: 2. Valid values:</p>
         * <ul>
         * <li><code>0</code>: overwrites the data by using the value 0</li>
         * <li><code>1</code>: overwrites the data by using the value 1</li>
         * <li><code>2</code>: overwrites the data by using the value null. This value indicates that no alert is triggered if no data exists</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;continuous\&quot;:true,\&quot;dataRevision\&quot;:2}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The ID of the contact group. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>381*,572*</p>
         */
        @NameInMap("ContactGroupIdList")
        public String contactGroupIdList;

        /**
         * <p>The IDs of the alert contact groups. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[123, 234]</p>
         */
        @NameInMap("ContactGroupIds")
        public String contactGroupIds;

        /**
         * <p>The timestamp that shows when the alert rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1579508519683</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the alert is sent through the alert center. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HostByAlertManager")
        public Boolean hostByAlertManager;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The information about the application that is associated with the alert rule.</p>
         */
        @NameInMap("MetricParam")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesMetricParam metricParam;

        /**
         * <p>The time ranges when the alert rule takes effect and when alert notifications are sent.</p>
         */
        @NameInMap("Notice")
        public SearchAlertRulesResponseBodyPageBeanAlertRulesNotice notice;

        /**
         * <p>The ID of the region to which the alert rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the alert rule. <code>RUNNING</code>: The alert rule is enabled. <code>STOPPED</code>: The alert rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the Application Real-Time Monitoring Service (ARMS) task that is associated with the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The status of the task. This parameter is hidden from users.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The name of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>AlertTest</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The timestamp that shows when the alert rule was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1480521600000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user to which the alert rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>113197164949****</p>
         */
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

        public SearchAlertRulesResponseBodyPageBeanAlertRules setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        /**
         * <p>The details of the alert rules.</p>
         */
        @NameInMap("AlertRules")
        public java.util.List<SearchAlertRulesResponseBodyPageBeanAlertRules> alertRules;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
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
