// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDIAlarmRulesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
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

    public ListDIAlarmRulesResponseBody setPagingInfo(ListDIAlarmRulesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDIAlarmRulesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDIAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels extends TeaModel {
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
         * <p>Critical</p>
         */
        @NameInMap("Severity")
        public String severity;

        public static ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels self = new ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers extends TeaModel {
        /**
         * <p>The recipient type. Valid values: AliyunUid, DingToken, FeishuToken, and WebHookUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>DingToken</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The recipient.</p>
         * <ul>
         * <li>If the value of the ReceiverType parameter is AliyunUid, the value of this parameter is the Alibaba Cloud account ID of a user.</li>
         * <li>If the value of the ReceiverType parameter is DingToken, the value of this parameter is the token of a DingTalk chatbot.</li>
         * </ul>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers self = new ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings extends TeaModel {
        /**
         * <p>This parameter is deprecated and replaced by the MuteInterval parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        @Deprecated
        public Long inhibitionInterval;

        /**
         * <p>The duration of the alert suppression interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MuteInterval")
        public Long muteInterval;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of alert notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers> notificationReceivers;

        public static ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings self = new ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings setInhibitionInterval(Long inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Long getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings setMuteInterval(Long muteInterval) {
            this.muteInterval = muteInterval;
            return this;
        }
        public Long getMuteInterval() {
            return this.muteInterval;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings setNotificationChannels(java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings setNotificationReceivers(java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions extends TeaModel {
        /**
         * <p>This parameter is deprecated and replaced by the DdlTypes parameter.</p>
         */
        @NameInMap("DdlReportTags")
        @Deprecated
        public java.util.List<String> ddlReportTags;

        /**
         * <p>The types of DDL operations for which the alert rule takes effect. This parameter is returned only if the MetricType parameter is set to DdlReport.</p>
         */
        @NameInMap("DdlTypes")
        public java.util.List<String> ddlTypes;

        /**
         * <p>The time interval for alert calculation. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Critical</p>
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

        public static ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions self = new ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions setDdlReportTags(java.util.List<String> ddlReportTags) {
            this.ddlReportTags = ddlReportTags;
            return this;
        }
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions setDdlTypes(java.util.List<String> ddlTypes) {
            this.ddlTypes = ddlTypes;
            return this;
        }
        public java.util.List<String> getDdlTypes() {
            return this.ddlTypes;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules extends TeaModel {
        /**
         * <p>This parameter is deprecated. Use the Id parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>72402</p>
         */
        @NameInMap("DIAlarmRuleId")
        @Deprecated
        public Long DIAlarmRuleId;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>32594</p>
         */
        @NameInMap("DIJobId")
        public Long DIJobId;

        /**
         * <p>The description of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule descrition</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values: True and False.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>72402</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The metric type in the alert rule. Valid values:</p>
         * <ul>
         * <li>Heartbeat</li>
         * <li>FailoverCount</li>
         * <li>Delay</li>
         * <li>DdlReport</li>
         * <li>ResourceUtilization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Heartbeat</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The alert notification method and recipient settings.</p>
         */
        @NameInMap("NotificationSettings")
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings notificationSettings;

        /**
         * <p>The conditions that are used to trigger the alert rule.</p>
         */
        @NameInMap("TriggerConditions")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions> triggerConditions;

        public static ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules self = new ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setDIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }
        public Long getDIAlarmRuleId() {
            return this.DIAlarmRuleId;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setNotificationSettings(ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings getNotificationSettings() {
            return this.notificationSettings;
        }

        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules setTriggerConditions(java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions> triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesTriggerConditions> getTriggerConditions() {
            return this.triggerConditions;
        }

    }

    public static class ListDIAlarmRulesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The alert rules.</p>
         */
        @NameInMap("DIJobAlarmRules")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules> DIJobAlarmRules;

        /**
         * <p>The page number. Pages start from page 1.</p>
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
         * <p>90</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDIAlarmRulesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDIAlarmRulesResponseBodyPagingInfo self = new ListDIAlarmRulesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDIAlarmRulesResponseBodyPagingInfo setDIJobAlarmRules(java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules> DIJobAlarmRules) {
            this.DIJobAlarmRules = DIJobAlarmRules;
            return this;
        }
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules> getDIJobAlarmRules() {
            return this.DIJobAlarmRules;
        }

        public ListDIAlarmRulesResponseBodyPagingInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDIAlarmRulesResponseBodyPagingInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDIAlarmRulesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
