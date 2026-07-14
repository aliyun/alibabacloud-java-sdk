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
         * <p>The notification channel type. The value must be one of the following uppercase enum values: DING (DingTalk chatbot), WEIXIN (WeCom chatbot), FEISHU (Lark chatbot), SLACK, TEAMS, WEBHOOK (custom webhook), CONTACT (contact, requires enabledSubChannels to specify sub-channels), GROUP (contact group), DUTY (on-call schedule), or DING_COOL_APP (DingTalk Cool App). Note: Lowercase values such as EMAIL or SMS are not supported. To send email, text message, or voice notifications, set channelType to CONTACT and specify EMAIL, SMS, or VOICE in enabledSubChannels.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBHOOK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>Required only when channelType is CONTACT, GROUP, or DUTY. Valid values: EMAIL (email), SMS (text message), VOICE (voice call), DING (DingTalk work notification), WEIXIN (WeCom message), FEISHU (Lark message), and WEBHOOK. For example, to notify a contact by email and text message, set channelType to CONTACT and enabledSubChannels to [&quot;EMAIL&quot;,&quot;SMS&quot;]. This field is not required for other channelType values such as WEBHOOK or DING.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The list of receiver identifiers. For the WEBHOOK type, specify the webhook UUID. For DING, WEIXIN, or FEISHU, specify the chatbot UUID. For CONTACT, specify the contact ID. For GROUP, specify the contact group ID. For DUTY, specify the on-call schedule UUID. At least one element is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;my-webhook-uuid&quot;]</p>
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
        /**
         * <p>The days of the week on which the setting takes effect. Array element values range from 0 to 6 (0 = Sunday, 1 = Monday, 2 = Tuesday, ... 6 = Saturday). Note: The value 7 is not supported. The maximum value is 6. Example for all days: [0,1,2,3,4,5,6]. Example for weekdays only: [1,2,3,4,5].</p>
         * 
         * <strong>example:</strong>
         * <p>[0,1,2,3,4,5,6]</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The end time of the day, expressed as the number of minutes from 00:00. Valid values: 0 to 1439 (23 × 60 + 59 = 1439, which represents 23:59).</p>
         * 
         * <strong>example:</strong>
         * <p>1439</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>The start time of the day, expressed as the number of minutes from 00:00. Valid values: 0 to 1439 (0 represents 00:00).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The IANA time zone identifier, such as Asia/Shanghai or America/Los_Angeles.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
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

        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <p>The effective period settings for notifications. Defines on which days and during which time range the system sends notifications.</p>
         */
        @NameInMap("effectTimeRange")
        public NotifyStrategyForSNSModifyRoutesEffectTimeRange effectTimeRange;

        @NameInMap("enableRca")
        public Boolean enableRca;

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

        public NotifyStrategyForSNSModifyRoutes setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public NotifyStrategyForSNSModifyRoutes setEffectTimeRange(NotifyStrategyForSNSModifyRoutesEffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }
        public NotifyStrategyForSNSModifyRoutesEffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        public NotifyStrategyForSNSModifyRoutes setEnableRca(Boolean enableRca) {
            this.enableRca = enableRca;
            return this;
        }
        public Boolean getEnableRca() {
            return this.enableRca;
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
