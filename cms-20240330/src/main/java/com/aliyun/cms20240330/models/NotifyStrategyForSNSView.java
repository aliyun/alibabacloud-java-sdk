// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyForSNSView extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The notification channel templates.</p>
     */
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyForSNSViewCustomTemplateEntries> customTemplateEntries;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the notification policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>Indicates whether incident management is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableIncidentManagement")
    public Boolean enableIncidentManagement;

    /**
     * <p>The grouping settings.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyForSNSViewGroupingSetting groupingSetting;

    /**
     * <p>Indicates whether recovery notifications are sent.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    /**
     * <p>The UUID of the associated response plan, which equals notifyStrategyId.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("incidentResponsePlanId")
    public String incidentResponsePlanId;

    /**
     * <p>The lifecycle mode. Within SNS, this value is always BundleStrategy.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The notification policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample name</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <p>The notification channel routing settings.</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyForSNSViewRoutes> routes;

    /**
     * <p>The synchronization source. For SNS creation, this value is always OBS.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The workspace identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static NotifyStrategyForSNSView build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyForSNSView self = new NotifyStrategyForSNSView();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyForSNSView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotifyStrategyForSNSView setCustomTemplateEntries(java.util.List<NotifyStrategyForSNSViewCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyForSNSViewCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyForSNSView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyForSNSView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public NotifyStrategyForSNSView setEnableIncidentManagement(Boolean enableIncidentManagement) {
        this.enableIncidentManagement = enableIncidentManagement;
        return this;
    }
    public Boolean getEnableIncidentManagement() {
        return this.enableIncidentManagement;
    }

    public NotifyStrategyForSNSView setGroupingSetting(NotifyStrategyForSNSViewGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyForSNSViewGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyForSNSView setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyForSNSView setIncidentResponsePlanId(String incidentResponsePlanId) {
        this.incidentResponsePlanId = incidentResponsePlanId;
        return this;
    }
    public String getIncidentResponsePlanId() {
        return this.incidentResponsePlanId;
    }

    public NotifyStrategyForSNSView setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public NotifyStrategyForSNSView setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public NotifyStrategyForSNSView setNotifyStrategyName(String notifyStrategyName) {
        this.notifyStrategyName = notifyStrategyName;
        return this;
    }
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    public NotifyStrategyForSNSView setRoutes(java.util.List<NotifyStrategyForSNSViewRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyForSNSViewRoutes> getRoutes() {
        return this.routes;
    }

    public NotifyStrategyForSNSView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public NotifyStrategyForSNSView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotifyStrategyForSNSView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotifyStrategyForSNSView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class NotifyStrategyForSNSViewCustomTemplateEntries extends TeaModel {
        /**
         * <p>The notification type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The template UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-id-001</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static NotifyStrategyForSNSViewCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSViewCustomTemplateEntries self = new NotifyStrategyForSNSViewCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSViewCustomTemplateEntries setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public NotifyStrategyForSNSViewCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyForSNSViewGroupingSetting extends TeaModel {
        /**
         * <p>The grouping keys.</p>
         */
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        /**
         * <p>The check period in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("periodMin")
        public Integer periodMin;

        /**
         * <p>The silence duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("silenceSec")
        public Integer silenceSec;

        /**
         * <p>The number of times the condition is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyForSNSViewGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSViewGroupingSetting self = new NotifyStrategyForSNSViewGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSViewGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyForSNSViewGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyForSNSViewGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyForSNSViewGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyForSNSViewRoutesChannels extends TeaModel {
        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The enabled notification types.</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The channel receivers.</p>
         */
        @NameInMap("receivers")
        public java.util.List<String> receivers;

        public static NotifyStrategyForSNSViewRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSViewRoutesChannels self = new NotifyStrategyForSNSViewRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSViewRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyForSNSViewRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyForSNSViewRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyForSNSViewRoutesEffectTimeRange extends TeaModel {
        /**
         * <p>The effective days, from Monday to Sunday.</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The start time in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>The start time in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyStrategyForSNSViewRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSViewRoutesEffectTimeRange self = new NotifyStrategyForSNSViewRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSViewRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyForSNSViewRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyForSNSViewRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyForSNSViewRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyForSNSViewRoutes extends TeaModel {
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("channels")
        public java.util.List<NotifyStrategyForSNSViewRoutesChannels> channels;

        /**
         * <p>The digital employee name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <p>The effective time range.</p>
         */
        @NameInMap("effectTimeRange")
        public NotifyStrategyForSNSViewRoutesEffectTimeRange effectTimeRange;

        /**
         * <p>Indicates whether root cause analysis (RCA) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableRca")
        public Boolean enableRca;

        /**
         * <p>The route-level filter.</p>
         */
        @NameInMap("filterSetting")
        public FilterSetting filterSetting;

        /**
         * <p>The severity filter.</p>
         */
        @NameInMap("severities")
        public java.util.List<String> severities;

        public static NotifyStrategyForSNSViewRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSViewRoutes self = new NotifyStrategyForSNSViewRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSViewRoutes setChannels(java.util.List<NotifyStrategyForSNSViewRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyForSNSViewRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyForSNSViewRoutes setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public NotifyStrategyForSNSViewRoutes setEffectTimeRange(NotifyStrategyForSNSViewRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyForSNSViewRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyForSNSViewRoutes setEnableRca(Boolean enableRca) {
            this.enableRca = enableRca;
            return this;
        }
        public Boolean getEnableRca() {
            return this.enableRca;
        }

        public NotifyStrategyForSNSViewRoutes setFilterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        public NotifyStrategyForSNSViewRoutes setSeverities(java.util.List<String> severities) {
            this.severities = severities;
            return this;
        }
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

    }

}
