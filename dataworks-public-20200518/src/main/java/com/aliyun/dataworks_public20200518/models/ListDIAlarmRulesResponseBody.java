// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("DIAlarmRulePaging")
    public ListDIAlarmRulesResponseBodyDIAlarmRulePaging DIAlarmRulePaging;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74C2FECD-5B3A-554A-BCF5-351A36DE9815</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDIAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDIAlarmRulesResponseBody self = new ListDIAlarmRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDIAlarmRulesResponseBody setDIAlarmRulePaging(ListDIAlarmRulesResponseBodyDIAlarmRulePaging DIAlarmRulePaging) {
        this.DIAlarmRulePaging = DIAlarmRulePaging;
        return this;
    }
    public ListDIAlarmRulesResponseBodyDIAlarmRulePaging getDIAlarmRulePaging() {
        return this.DIAlarmRulePaging;
    }

    public ListDIAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels extends TeaModel {
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>Warning</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels self = new ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers extends TeaModel {
        /**
         * <p>The recipient type. Valid values: AliyunUid and DingToken.</p>
         * <ul>
         * <li>If the alert notification method is Mail, Phone, or Sms, the value of this parameter is <strong>AliyunUid</strong>, which indicates the Alibaba Cloud account ID.</li>
         * <li>If the alert notification method is Ding, the value of this parameter is <strong>DingToken</strong>, which indicates the DingTalk chatbot token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingToken</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers self = new ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings extends TeaModel {
        /**
         * <p>The duration of the alert suppression interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        public Integer inhibitionInterval;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of alert notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers> notificationReceivers;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings self = new ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings setInhibitionInterval(Integer inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings setNotificationChannels(java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings setNotificationReceivers(java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettingsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions extends TeaModel {
        /**
         * <p>The time interval for alert calculation. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>Warning</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The alert threshold.</p>
         * <ul>
         * <li>If the alert rule is for task status, no threshold is used.</li>
         * <li>If the alert rule is for failovers, the threshold is the number of failovers.</li>
         * <li>If the alert rule is for latency, the threshold is the latency duration, in seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public Long threshold;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions self = new ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules extends TeaModel {
        /**
         * <p>The alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>41998</p>
         */
        @NameInMap("DIAlarmRuleId")
        public Long DIAlarmRuleId;

        /**
         * <p>The ID of the task with which the alert rule is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>11260</p>
         */
        @NameInMap("DIJobId")
        public Long DIJobId;

        /**
         * <p>The description of the alert rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the alert rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The metric type in the alert rule. Valid values:</p>
         * <ul>
         * <li>Heartbeat</li>
         * <li>FailoverCount</li>
         * <li>Delay</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Heartbeat</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The alert notification settings.</p>
         */
        @NameInMap("NotificationSettings")
        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings notificationSettings;

        /**
         * <p>The conditions that are used to trigger the alert rule.</p>
         */
        @NameInMap("TriggerConditions")
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions> triggerConditions;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules self = new ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setDIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }
        public Long getDIAlarmRuleId() {
            return this.DIAlarmRuleId;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setNotificationSettings(ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesNotificationSettings getNotificationSettings() {
            return this.notificationSettings;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules setTriggerConditions(java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions> triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRulesTriggerConditions> getTriggerConditions() {
            return this.triggerConditions;
        }

    }

    public static class ListDIAlarmRulesResponseBodyDIAlarmRulePaging extends TeaModel {
        /**
         * <p>The alert rules.</p>
         */
        @NameInMap("DIJobAlarmRules")
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules> DIJobAlarmRules;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDIAlarmRulesResponseBodyDIAlarmRulePaging build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyDIAlarmRulePaging self = new ListDIAlarmRulesResponseBodyDIAlarmRulePaging();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePaging setDIJobAlarmRules(java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules> DIJobAlarmRules) {
            this.DIJobAlarmRules = DIJobAlarmRules;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyDIAlarmRulePagingDIJobAlarmRules> getDIJobAlarmRules() {
            return this.DIJobAlarmRules;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePaging setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePaging setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDIAlarmRulesResponseBodyDIAlarmRulePaging setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
