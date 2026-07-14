// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyDetail extends TeaModel {
    /**
     * <p>The list of custom notification templates.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyDetailCustomTemplateEntries> customTemplateEntries;

    /**
     * <p>The description of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境告警通知策略</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The grouping and merging settings.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyDetailGroupingSetting groupingSetting;

    /**
     * <p>Specifies whether to ignore notifications for recovery events. A value of true indicates that recovery notifications are not sent.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    /**
     * <p>The list of notification channel routing settings.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyDetailRoutes> routes;

    public static NotifyStrategyDetail build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyDetail self = new NotifyStrategyDetail();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyDetail setCustomTemplateEntries(java.util.List<NotifyStrategyDetailCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyDetailCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyDetail setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyDetail setGroupingSetting(NotifyStrategyDetailGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyDetailGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyDetail setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyDetail setRoutes(java.util.List<NotifyStrategyDetailRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyDetailRoutes> getRoutes() {
        return this.routes;
    }

    public static class NotifyStrategyDetailCustomTemplateEntries extends TeaModel {
        /**
         * <p>The UUID of the notification template.</p>
         * 
         * <strong>example:</strong>
         * <p>template-uuid-xxx</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static NotifyStrategyDetailCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyDetailCustomTemplateEntries self = new NotifyStrategyDetailCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyDetailCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyDetailGroupingSetting extends TeaModel {
        /**
         * <p>The event fields by which events are grouped for noise reduction. Events in the same group are merged into a single notification. An empty array indicates no grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;alertname&quot;]</p>
         */
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        /**
         * <p>The check period in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("periodMin")
        public Integer periodMin;

        /**
         * <p>The silence duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("silenceSec")
        public Integer silenceSec;

        /**
         * <p>The number of trigger times.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyDetailGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyDetailGroupingSetting self = new NotifyStrategyDetailGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyDetailGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyDetailGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyDetailGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyDetailGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyDetailRoutesChannels extends TeaModel {
        /**
         * <p>The channel type. Valid values: DING, WEIXIN, FEISHU, SLACK, TEAMS, WEBHOOK, CONTACT, GROUP, DUTY, and DING_COOL_APP.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBHOOK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The enabled sub-channels. Valid values: EMAIL, SMS, VOICE, DING, WEIXIN, FEISHU, and WEBHOOK.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The list of receiver identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;webhook-uuid-xxx&quot;]</p>
         */
        @NameInMap("receivers")
        public java.util.List<String> receivers;

        public static NotifyStrategyDetailRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyDetailRoutesChannels self = new NotifyStrategyDetailRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyDetailRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyDetailRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyDetailRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyDetailRoutesEffectTimeRange extends TeaModel {
        /**
         * <p>The effective days of the week. Valid values: 0 to 6 (0 = Sunday, 6 = Saturday). The value 7 is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,1,2,3,4,5,6]</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The end time of the day in minutes. Valid values: 0 to 1439.</p>
         * 
         * <strong>example:</strong>
         * <p>1439</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>The start time of the day in minutes. Valid values: 0 to 1438.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The IANA time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyStrategyDetailRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyDetailRoutesEffectTimeRange self = new NotifyStrategyDetailRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyDetailRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyDetailRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyDetailRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyDetailRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyDetailRoutes extends TeaModel {
        /**
         * <p>The list of notification channels.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("channels")
        public java.util.List<NotifyStrategyDetailRoutesChannels> channels;

        /**
         * <p>The digital employee name. This parameter is required when enableRca is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>数字员工名</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <p>The effective time range.</p>
         */
        @NameInMap("effectTimeRange")
        public NotifyStrategyDetailRoutesEffectTimeRange effectTimeRange;

        /**
         * <p>Specifies whether to enable root cause analysis (RCA).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableRca")
        public Boolean enableRca;

        /**
         * <p>The route-level event filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("filterSetting")
        public FilterSetting filterSetting;

        public static NotifyStrategyDetailRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyDetailRoutes self = new NotifyStrategyDetailRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyDetailRoutes setChannels(java.util.List<NotifyStrategyDetailRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyDetailRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyDetailRoutes setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public NotifyStrategyDetailRoutes setEffectTimeRange(NotifyStrategyDetailRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyDetailRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyDetailRoutes setEnableRca(Boolean enableRca) {
            this.enableRca = enableRca;
            return this;
        }
        public Boolean getEnableRca() {
            return this.enableRca;
        }

        public NotifyStrategyDetailRoutes setFilterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

    }

}
