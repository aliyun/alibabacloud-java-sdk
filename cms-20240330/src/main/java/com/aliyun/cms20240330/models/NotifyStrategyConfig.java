// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyConfig extends TeaModel {
    /**
     * <p>The list of custom notification templates.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyConfigCustomTemplateEntries> customTemplateEntries;

    /**
     * <p>The description of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>生产环境告警通知策略</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The noise reduction settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyConfigGroupingSetting groupingSetting;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routes")
    public java.util.List<NotifyStrategyConfigRoutes> routes;

    public static NotifyStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
        NotifyStrategyConfig self = new NotifyStrategyConfig();
        return TeaModel.build(map, self);
    }

    public NotifyStrategyConfig setCustomTemplateEntries(java.util.List<NotifyStrategyConfigCustomTemplateEntries> customTemplateEntries) {
        this.customTemplateEntries = customTemplateEntries;
        return this;
    }
    public java.util.List<NotifyStrategyConfigCustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    public NotifyStrategyConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotifyStrategyConfig setGroupingSetting(NotifyStrategyConfigGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotifyStrategyConfigGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotifyStrategyConfig setIgnoreRestoredNotification(Boolean ignoreRestoredNotification) {
        this.ignoreRestoredNotification = ignoreRestoredNotification;
        return this;
    }
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    public NotifyStrategyConfig setRoutes(java.util.List<NotifyStrategyConfigRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<NotifyStrategyConfigRoutes> getRoutes() {
        return this.routes;
    }

    public static class NotifyStrategyConfigCustomTemplateEntries extends TeaModel {
        /**
         * <p>The UUID of the notification template.</p>
         * 
         * <strong>example:</strong>
         * <p>template-uuid-xxx</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static NotifyStrategyConfigCustomTemplateEntries build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyConfigCustomTemplateEntries self = new NotifyStrategyConfigCustomTemplateEntries();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyConfigCustomTemplateEntries setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotifyStrategyConfigGroupingSetting extends TeaModel {
        /**
         * <p>The event fields by which events are grouped. Events in the same group are merged into a single notification. An empty array indicates no grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;alertname&quot;]</p>
         */
        @NameInMap("groupingKeys")
        public java.util.List<String> groupingKeys;

        /**
         * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("periodMin")
        public Integer periodMin;

        /**
         * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("silenceSec")
        public Integer silenceSec;

        /**
         * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("times")
        public Integer times;

        public static NotifyStrategyConfigGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyConfigGroupingSetting self = new NotifyStrategyConfigGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyConfigGroupingSetting setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public NotifyStrategyConfigGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotifyStrategyConfigGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotifyStrategyConfigGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotifyStrategyConfigRoutesChannels extends TeaModel {
        /**
         * <p>The channel type. Valid values: DING, WEIXIN, FEISHU, SLACK, TEAMS, WEBHOOK, CONTACT, GROUP, DUTY, and DING_COOL_APP. Lowercase values are not supported. For email, text message, or phone call notifications, use CONTACT with enabledSubChannels.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBHOOK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>Required only for CONTACT, GROUP, or DUTY. The sub-channel types in uppercase. Valid values: EMAIL, SMS, VOICE, DING, WEIXIN, FEISHU, and WEBHOOK.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The list of receiver identifiers. At least one receiver is required. Specify a webhook UUID for WEBHOOK, a robot UUID for chatbots, or a contact ID for CONTACT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;webhook-uuid-xxx&quot;]</p>
         */
        @NameInMap("receivers")
        public java.util.List<String> receivers;

        public static NotifyStrategyConfigRoutesChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyConfigRoutesChannels self = new NotifyStrategyConfigRoutesChannels();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyConfigRoutesChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyStrategyConfigRoutesChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyStrategyConfigRoutesChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyStrategyConfigRoutesEffectTimeRange extends TeaModel {
        /**
         * <p>The effective days. Valid values: 0 to 6 (0 = Sunday, 6 = Saturday). The value 7 is not supported.</p>
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

        public static NotifyStrategyConfigRoutesEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyConfigRoutesEffectTimeRange self = new NotifyStrategyConfigRoutesEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyConfigRoutesEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyStrategyConfigRoutesEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyStrategyConfigRoutesEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyStrategyConfigRoutesEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class NotifyStrategyConfigRoutes extends TeaModel {
        /**
         * <p>The list of notification channels.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("channels")
        public java.util.List<NotifyStrategyConfigRoutesChannels> channels;

        /**
         * <p>The digital employee name. Required when enableRca is set to true.</p>
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
        public NotifyStrategyConfigRoutesEffectTimeRange effectTimeRange;

        /**
         * <p>Specifies whether to enable Root Cause Analysis (RCA).</p>
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

        public static NotifyStrategyConfigRoutes build(java.util.Map<String, ?> map) throws Exception {
            NotifyStrategyConfigRoutes self = new NotifyStrategyConfigRoutes();
            return TeaModel.build(map, self);
        }

        public NotifyStrategyConfigRoutes setChannels(java.util.List<NotifyStrategyConfigRoutesChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<NotifyStrategyConfigRoutesChannels> getChannels() {
            return this.channels;
        }

        public NotifyStrategyConfigRoutes setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public NotifyStrategyConfigRoutes setEffectTimeRange(NotifyStrategyConfigRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyConfigRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyConfigRoutes setEnableRca(Boolean enableRca) {
            this.enableRca = enableRca;
            return this;
        }
        public Boolean getEnableRca() {
            return this.enableRca;
        }

        public NotifyStrategyConfigRoutes setFilterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

    }

}
