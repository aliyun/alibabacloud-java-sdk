// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyForSNSModify extends TeaModel {
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyForSNSModifyCustomTemplateEntries> customTemplateEntries;

    @NameInMap("description")
    public String description;

    @NameInMap("enableIncidentManagement")
    public Boolean enableIncidentManagement;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyForSNSModifyGroupingSetting groupingSetting;

    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyForSNSModifyRoutes> routes;

    public static NotifyStrategyForSNSModify build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyForSNSModify self = new NotifyStrategyForSNSModify();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyForSNSModify setCustomTemplateEntries(java.util.List<NotifyStrategyForSNSModifyCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyForSNSModifyCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyForSNSModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyForSNSModify setEnableIncidentManagement(Boolean enableIncidentManagement) {
        this.enableIncidentManagement = enableIncidentManagement;
        return this;
    }
    public Boolean getEnableIncidentManagement() {
        return this.enableIncidentManagement;
    }

    public NotifyStrategyForSNSModify setGroupingSetting(NotifyStrategyForSNSModifyGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyForSNSModifyGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyForSNSModify setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyForSNSModify setRoutes(java.util.List<NotifyStrategyForSNSModifyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyForSNSModifyRoutes> getRoutes() {
        return this.routes;
    }

    public static class NotifyStrategyForSNSModifyCustomTemplateEntries extends TeaModel {
        @NameInMap("targetType")
        public String targetType;

        @NameInMap("templateUuid")
        public String templateUuid;

        public static NotifyStrategyForSNSModifyCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyCustomTemplateEntries self = new NotifyStrategyForSNSModifyCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyCustomTemplateEntries setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public NotifyStrategyForSNSModifyCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyForSNSModifyGroupingSetting extends TeaModel {
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        @NameInMap("periodMin")
        public Integer periodMin;

        @NameInMap("silenceSec")
        public Integer silenceSec;

        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyForSNSModifyGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyGroupingSetting self = new NotifyStrategyForSNSModifyGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyForSNSModifyGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyForSNSModifyGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyForSNSModifyGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyForSNSModifyRoutesChannels extends TeaModel {
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

        public static NotifyStrategyForSNSModifyRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyRoutesChannels self = new NotifyStrategyForSNSModifyRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyForSNSModifyRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyForSNSModifyRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyForSNSModifyRoutesEffectTimeRange extends TeaModel {
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyStrategyForSNSModifyRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyRoutesEffectTimeRange self = new NotifyStrategyForSNSModifyRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyForSNSModifyRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyForSNSModifyRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyForSNSModifyRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyForSNSModifyRoutesFilterSettingConditions extends TeaModel {
        @NameInMap("field")
        public String field;

        @NameInMap("op")
        public String op;

        @NameInMap("value")
        public String value;

        public static NotifyStrategyForSNSModifyRoutesFilterSettingConditions build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyRoutesFilterSettingConditions self = new NotifyStrategyForSNSModifyRoutesFilterSettingConditions();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyRoutesFilterSettingConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public NotifyStrategyForSNSModifyRoutesFilterSettingConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public NotifyStrategyForSNSModifyRoutesFilterSettingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NotifyStrategyForSNSModifyRoutesFilterSetting extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<NotifyStrategyForSNSModifyRoutesFilterSettingConditions> conditions;

        @NameInMap("expression")
        public String expression;

        @NameInMap("relation")
        public String relation;

        public static NotifyStrategyForSNSModifyRoutesFilterSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyRoutesFilterSetting self = new NotifyStrategyForSNSModifyRoutesFilterSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyRoutesFilterSetting setConditions(java.util.List<NotifyStrategyForSNSModifyRoutesFilterSettingConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<NotifyStrategyForSNSModifyRoutesFilterSettingConditions> getConditions() {
            return this.conditions;
        }

        public NotifyStrategyForSNSModifyRoutesFilterSetting setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public NotifyStrategyForSNSModifyRoutesFilterSetting setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class NotifyStrategyForSNSModifyRoutes extends TeaModel {
        @NameInMap("channels")
        public java.util.List<NotifyStrategyForSNSModifyRoutesChannels> channels;

        @NameInMap("effectTimeRange")
        public NotifyStrategyForSNSModifyRoutesEffectTimeRange effectTimeRange;

        @NameInMap("filterSetting")
        public NotifyStrategyForSNSModifyRoutesFilterSetting filterSetting;

        @NameInMap("severities")
        public java.util.List<String> severities;

        public static NotifyStrategyForSNSModifyRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyForSNSModifyRoutes self = new NotifyStrategyForSNSModifyRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyForSNSModifyRoutes setChannels(java.util.List<NotifyStrategyForSNSModifyRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyForSNSModifyRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyForSNSModifyRoutes setEffectTimeRange(NotifyStrategyForSNSModifyRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyForSNSModifyRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyForSNSModifyRoutes setFilterSetting(NotifyStrategyForSNSModifyRoutesFilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public NotifyStrategyForSNSModifyRoutesFilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        public NotifyStrategyForSNSModifyRoutes setSeverities(java.util.List<String> severities) {
            this.severities = severities;
            return this;
        }
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

    }

}
