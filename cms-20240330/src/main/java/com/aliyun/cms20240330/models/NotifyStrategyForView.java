// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyForView extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyForViewCustomTemplateEntries> customTemplateEntries;

    @NameInMap("description")
    public String description;

    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyForViewGroupingSetting groupingSetting;

    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyForViewRoutes> routes;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("workspace")
    public String workspace;

    public static NotifyStrategyForView build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyForView self = new NotifyStrategyForView();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotifyStrategyForView setCustomTemplateEntries(java.util.List<NotifyStrategyForViewCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyForViewCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public NotifyStrategyForView setGroupingSetting(NotifyStrategyForViewGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyForViewGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyForView setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyForView setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public NotifyStrategyForView setNotifyStrategyName(String notifyStrategyName) {
        this.notifyStrategyName = notifyStrategyName;
        return this;
    }
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    public NotifyStrategyForView setRoutes(java.util.List<NotifyStrategyForViewRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyForViewRoutes> getRoutes() {
        return this.routes;
    }

    public NotifyStrategyForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotifyStrategyForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotifyStrategyForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class NotifyStrategyForViewCustomTemplateEntries extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static NotifyStrategyForViewCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForViewCustomTemplateEntries self = new NotifyStrategyForViewCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForViewCustomTemplateEntries setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public NotifyStrategyForViewCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyForViewGroupingSetting extends TeaModel {
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        @NameInMap("periodMin")
        public Integer periodMin;

        @NameInMap("silenceSec")
        public Integer silenceSec;

        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyForViewGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForViewGroupingSetting self = new NotifyStrategyForViewGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForViewGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyForViewGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyForViewGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyForViewGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyForViewRoutesChannels extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("channelType")
        public String channelType;

        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("receivers")
        public java.util.List<String> receivers;

        public static NotifyStrategyForViewRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForViewRoutesChannels self = new NotifyStrategyForViewRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForViewRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyForViewRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyForViewRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyForViewRoutesEffectTimeRange extends TeaModel {
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyStrategyForViewRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForViewRoutesEffectTimeRange self = new NotifyStrategyForViewRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForViewRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyForViewRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyForViewRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyForViewRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyForViewRoutes extends TeaModel {
        @NameInMap("channels")
        public java.util.List<NotifyStrategyForViewRoutesChannels> channels;

        @NameInMap("effectTimeRange")
        public NotifyStrategyForViewRoutesEffectTimeRange effectTimeRange;

        @NameInMap("filterSetting")
        public FilterSetting filterSetting;

        @NameInMap("severities")
        public java.util.List<String> severities;

        public static NotifyStrategyForViewRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForViewRoutes self = new NotifyStrategyForViewRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForViewRoutes setChannels(java.util.List<NotifyStrategyForViewRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyForViewRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyForViewRoutes setEffectTimeRange(NotifyStrategyForViewRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyForViewRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyForViewRoutes setFilterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        public NotifyStrategyForViewRoutes setSeverities(java.util.List<String> severities) {
            this.severities = severities;
            return this;
        }
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

    }

}
