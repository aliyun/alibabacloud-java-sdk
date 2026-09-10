// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyStrategyForSNSModify extends TeaModel {
    /**
     * <p>The notification channel templates.</p>
     */
    @NameInMap("customTemplateEntries")
    public java.util.List<NotifyStrategyForSNSModifyCustomTemplateEntries> customTemplateEntries;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable incident management.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableIncidentManagement")
    public Boolean enableIncidentManagement;

    /**
     * <p>The grouping settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupingSetting")
    public NotifyStrategyForSNSModifyGroupingSetting groupingSetting;

    /**
     * <p>Specifies whether to send a notification when the alert is recovered.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreRestoredNotification")
    public Boolean ignoreRestoredNotification;

    /**
     * <p>The notification channel routing settings.</p>
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
        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect. The actual purpose of the template is determined by the type field of the template object referenced by templateUuid.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("targetType")
        public String targetType;

        /**
         * <p>The UUID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>adef12efca3f-8728-1928-eeaac12ef9ad92</p>
         */
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
         * <p>300</p>
         */
        @NameInMap("silenceSec")
        public Integer silenceSec;

        /**
         * <p>The number of times the condition is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
         * <p>The channel type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The enabled notification types.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The channel receivers.</p>
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
         * <p>The effective days of the week (Monday through Sunday).</p>
         * 
         * <strong>example:</strong>
         * <p>[0,1,2,3,4,5,6]</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The end time in minutes.</p>
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
         * <p>59</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The time zone.</p>
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
        /**
         * <p>The JSON path of the field, such as labels._cms_rule_name.</p>
         * 
         * <strong>example:</strong>
         * <p>subject</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The comparison operator.</p>
         * 
         * <strong>example:</strong>
         * <p>EQ</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>Pod OOM</p>
         */
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
        /**
         * <p>The subscription conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<NotifyStrategyForSNSModifyRoutesFilterSettingConditions> conditions;

        /**
         * <p>If expression is not empty, it takes precedence and relation is ignored. If expression is empty or not specified, the system uses relation (AND or OR) to perform a simple AND/OR operation on all conditions. Condition numbers correspond to the indexes of the conditions array (starting from 1). Each condition evaluates whether a single event field matches by using field (the event field path, which supports dot-separated nesting such as resource.tags.pod), op (the operator, such as CONTAIN, EQ, or IN), and value (the match value).</p>
         * 
         * <strong>example:</strong>
         * <p>(1 AND 2 )OR 3</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The relationship between conditions. If an expression is configured, the expression takes higher precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
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
        /**
         * <p>The notification channels.</p>
         */
        @NameInMap("channels")
        public java.util.List<NotifyStrategyForSNSModifyRoutesChannels> channels;

        /**
         * <p>The digital employee name.</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <p>The effective time range.</p>
         */
        @NameInMap("effectTimeRange")
        public NotifyStrategyForSNSModifyRoutesEffectTimeRange effectTimeRange;

        /**
         * <p>Specifies whether to enable root cause analysis (RCA).</p>
         */
        @NameInMap("enableRca")
        public Boolean enableRca;

        /**
         * <p>The route-level filter. This is different from the top-level subscription.filterSetting.</p>
         */
        @NameInMap("filterSetting")
        public NotifyStrategyForSNSModifyRoutesFilterSetting filterSetting;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect. Route matching only checks filterSetting and effectTimeRange.</p>
         */
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
