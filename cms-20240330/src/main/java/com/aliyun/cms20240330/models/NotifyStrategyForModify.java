// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyForModify extends TeaModel {
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyForModifyCustomTemplateEntries> customTemplateEntries;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyForModifyGroupingSetting groupingSetting;

    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyForModifyRoutes> routes;

    public static NotifyStrategyForModify build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyForModify self = new NotifyStrategyForModify();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyForModify setCustomTemplateEntries(java.util.List<NotifyStrategyForModifyCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyForModifyCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyForModify setGroupingSetting(NotifyStrategyForModifyGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyForModifyGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyForModify setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyForModify setNotifyStrategyName(String notifyStrategyName) {
        this.notifyStrategyName = notifyStrategyName;
        return this;
    }
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    public NotifyStrategyForModify setRoutes(java.util.List<NotifyStrategyForModifyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyForModifyRoutes> getRoutes() {
        return this.routes;
    }

    public static class NotifyStrategyForModifyCustomTemplateEntries extends TeaModel {
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

        public static NotifyStrategyForModifyCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForModifyCustomTemplateEntries self = new NotifyStrategyForModifyCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForModifyCustomTemplateEntries setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public NotifyStrategyForModifyCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyForModifyGroupingSetting extends TeaModel {
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        @NameInMap("periodMin")
        public Integer periodMin;

        @NameInMap("silenceSec")
        public Integer silenceSec;

        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyForModifyGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForModifyGroupingSetting self = new NotifyStrategyForModifyGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForModifyGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyForModifyGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyForModifyGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyForModifyGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyForModifyRoutesChannels extends TeaModel {
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

        public static NotifyStrategyForModifyRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForModifyRoutesChannels self = new NotifyStrategyForModifyRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForModifyRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyForModifyRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyForModifyRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyForModifyRoutesEffectTimeRange extends TeaModel {
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyStrategyForModifyRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForModifyRoutesEffectTimeRange self = new NotifyStrategyForModifyRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForModifyRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyForModifyRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyForModifyRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyForModifyRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyForModifyRoutes extends TeaModel {
        @NameInMap("channels")
        public java.util.List<NotifyStrategyForModifyRoutesChannels> channels;

        @NameInMap("effectTimeRange")
        public NotifyStrategyForModifyRoutesEffectTimeRange effectTimeRange;

        @NameInMap("filterSetting")
        public FilterSetting filterSetting;

        @NameInMap("severities")
        public java.util.List<String> severities;

        public static NotifyStrategyForModifyRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForModifyRoutes self = new NotifyStrategyForModifyRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForModifyRoutes setChannels(java.util.List<NotifyStrategyForModifyRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyForModifyRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyForModifyRoutes setEffectTimeRange(NotifyStrategyForModifyRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyForModifyRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyForModifyRoutes setFilterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        public NotifyStrategyForModifyRoutes setSeverities(java.util.List<String> severities) {
            this.severities = severities;
            return this;
        }
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

    }

}
