// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIAlarmRulesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDIAlarmRulesResponseBodyPagingInfo pagingInfo;

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
        @NameInMap("Channels")
        public java.util.List<String> channels;

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
        @NameInMap("ReceiverType")
        public String receiverType;

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
        @NameInMap("InhibitionInterval")
        @Deprecated
        public Long inhibitionInterval;

        @NameInMap("MuteInterval")
        public Long muteInterval;

        @NameInMap("NotificationChannels")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettingsNotificationChannels> notificationChannels;

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
        @NameInMap("DdlReportTags")
        @Deprecated
        public java.util.List<String> ddlReportTags;

        @NameInMap("DdlTypes")
        public java.util.List<String> ddlTypes;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Severity")
        public String severity;

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
        @NameInMap("DIAlarmRuleId")
        @Deprecated
        public Long DIAlarmRuleId;

        @NameInMap("DIJobId")
        public Long DIJobId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationSettings")
        public ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRulesNotificationSettings notificationSettings;

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
        @NameInMap("DIJobAlarmRules")
        public java.util.List<ListDIAlarmRulesResponseBodyPagingInfoDIJobAlarmRules> DIJobAlarmRules;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

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
