// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutAlertStrategyRequest extends TeaModel {
    @NameInMap("ChannelMapRule")
    public PutAlertStrategyRequestChannelMapRule channelMapRule;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("EscalationRule")
    public PutAlertStrategyRequestEscalationRule escalationRule;

    @NameInMap("FilterRule")
    public PutAlertStrategyRequestFilterRule filterRule;

    @NameInMap("GroupingRule")
    public PutAlertStrategyRequestGroupingRule groupingRule;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushingRule")
    public PutAlertStrategyRequestPushingRule pushingRule;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    public static PutAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertStrategyRequest self = new PutAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertStrategyRequest setChannelMapRule(PutAlertStrategyRequestChannelMapRule channelMapRule) {
        this.channelMapRule = channelMapRule;
        return this;
    }
    public PutAlertStrategyRequestChannelMapRule getChannelMapRule() {
        return this.channelMapRule;
    }

    public PutAlertStrategyRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public PutAlertStrategyRequest setEscalationRule(PutAlertStrategyRequestEscalationRule escalationRule) {
        this.escalationRule = escalationRule;
        return this;
    }
    public PutAlertStrategyRequestEscalationRule getEscalationRule() {
        return this.escalationRule;
    }

    public PutAlertStrategyRequest setFilterRule(PutAlertStrategyRequestFilterRule filterRule) {
        this.filterRule = filterRule;
        return this;
    }
    public PutAlertStrategyRequestFilterRule getFilterRule() {
        return this.filterRule;
    }

    public PutAlertStrategyRequest setGroupingRule(PutAlertStrategyRequestGroupingRule groupingRule) {
        this.groupingRule = groupingRule;
        return this;
    }
    public PutAlertStrategyRequestGroupingRule getGroupingRule() {
        return this.groupingRule;
    }

    public PutAlertStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PutAlertStrategyRequest setPushingRule(PutAlertStrategyRequestPushingRule pushingRule) {
        this.pushingRule = pushingRule;
        return this;
    }
    public PutAlertStrategyRequestPushingRule getPushingRule() {
        return this.pushingRule;
    }

    public PutAlertStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutAlertStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public PutAlertStrategyRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public static class PutAlertStrategyRequestChannelMapRuleCritical extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static PutAlertStrategyRequestChannelMapRuleCritical build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestChannelMapRuleCritical self = new PutAlertStrategyRequestChannelMapRuleCritical();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestChannelMapRuleCritical setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class PutAlertStrategyRequestChannelMapRuleInfo extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static PutAlertStrategyRequestChannelMapRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestChannelMapRuleInfo self = new PutAlertStrategyRequestChannelMapRuleInfo();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestChannelMapRuleInfo setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class PutAlertStrategyRequestChannelMapRuleWarning extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static PutAlertStrategyRequestChannelMapRuleWarning build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestChannelMapRuleWarning self = new PutAlertStrategyRequestChannelMapRuleWarning();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestChannelMapRuleWarning setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class PutAlertStrategyRequestChannelMapRule extends TeaModel {
        @NameInMap("Critical")
        public PutAlertStrategyRequestChannelMapRuleCritical critical;

        @NameInMap("Info")
        public PutAlertStrategyRequestChannelMapRuleInfo info;

        @NameInMap("Warning")
        public PutAlertStrategyRequestChannelMapRuleWarning warning;

        public static PutAlertStrategyRequestChannelMapRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestChannelMapRule self = new PutAlertStrategyRequestChannelMapRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestChannelMapRule setCritical(PutAlertStrategyRequestChannelMapRuleCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutAlertStrategyRequestChannelMapRuleCritical getCritical() {
            return this.critical;
        }

        public PutAlertStrategyRequestChannelMapRule setInfo(PutAlertStrategyRequestChannelMapRuleInfo info) {
            this.info = info;
            return this;
        }
        public PutAlertStrategyRequestChannelMapRuleInfo getInfo() {
            return this.info;
        }

        public PutAlertStrategyRequestChannelMapRule setWarning(PutAlertStrategyRequestChannelMapRuleWarning warning) {
            this.warning = warning;
            return this;
        }
        public PutAlertStrategyRequestChannelMapRuleWarning getWarning() {
            return this.warning;
        }

    }

    public static class PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule extends TeaModel {
        @NameInMap("Critical")
        public java.util.List<String> critical;

        @NameInMap("Info")
        public java.util.List<String> info;

        @NameInMap("Resolve")
        public java.util.List<String> resolve;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule self = new PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule setCritical(java.util.List<String> critical) {
            this.critical = critical;
            return this;
        }
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule setInfo(java.util.List<String> info) {
            this.info = info;
            return this;
        }
        public java.util.List<String> getInfo() {
            return this.info;
        }

        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule setResolve(java.util.List<String> resolve) {
            this.resolve = resolve;
            return this;
        }
        public java.util.List<String> getResolve() {
            return this.resolve;
        }

        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class PutAlertStrategyRequestEscalationRuleEscalations extends TeaModel {
        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        @NameInMap("EscalateTime")
        public Integer escalateTime;

        @NameInMap("LevelGroupMapRule")
        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule levelGroupMapRule;

        public static PutAlertStrategyRequestEscalationRuleEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestEscalationRuleEscalations self = new PutAlertStrategyRequestEscalationRuleEscalations();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestEscalationRuleEscalations setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public PutAlertStrategyRequestEscalationRuleEscalations setEscalateTime(Integer escalateTime) {
            this.escalateTime = escalateTime;
            return this;
        }
        public Integer getEscalateTime() {
            return this.escalateTime;
        }

        public PutAlertStrategyRequestEscalationRuleEscalations setLevelGroupMapRule(PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule levelGroupMapRule) {
            this.levelGroupMapRule = levelGroupMapRule;
            return this;
        }
        public PutAlertStrategyRequestEscalationRuleEscalationsLevelGroupMapRule getLevelGroupMapRule() {
            return this.levelGroupMapRule;
        }

    }

    public static class PutAlertStrategyRequestEscalationRule extends TeaModel {
        @NameInMap("AutoResolveTime")
        public Integer autoResolveTime;

        @NameInMap("Escalations")
        public java.util.List<PutAlertStrategyRequestEscalationRuleEscalations> escalations;

        @NameInMap("ReTriggerTime")
        public Integer reTriggerTime;

        public static PutAlertStrategyRequestEscalationRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestEscalationRule self = new PutAlertStrategyRequestEscalationRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestEscalationRule setAutoResolveTime(Integer autoResolveTime) {
            this.autoResolveTime = autoResolveTime;
            return this;
        }
        public Integer getAutoResolveTime() {
            return this.autoResolveTime;
        }

        public PutAlertStrategyRequestEscalationRule setEscalations(java.util.List<PutAlertStrategyRequestEscalationRuleEscalations> escalations) {
            this.escalations = escalations;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestEscalationRuleEscalations> getEscalations() {
            return this.escalations;
        }

        public PutAlertStrategyRequestEscalationRule setReTriggerTime(Integer reTriggerTime) {
            this.reTriggerTime = reTriggerTime;
            return this;
        }
        public Integer getReTriggerTime() {
            return this.reTriggerTime;
        }

    }

    public static class PutAlertStrategyRequestFilterRuleBlackList extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Product")
        public String product;

        public static PutAlertStrategyRequestFilterRuleBlackList build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestFilterRuleBlackList self = new PutAlertStrategyRequestFilterRuleBlackList();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestFilterRuleBlackList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public PutAlertStrategyRequestFilterRuleBlackList setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public PutAlertStrategyRequestFilterRuleBlackList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutAlertStrategyRequestFilterRuleBlackList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutAlertStrategyRequestFilterRuleBlackList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class PutAlertStrategyRequestFilterRuleFilterItems extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Product")
        public String product;

        public static PutAlertStrategyRequestFilterRuleFilterItems build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestFilterRuleFilterItems self = new PutAlertStrategyRequestFilterRuleFilterItems();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestFilterRuleFilterItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public PutAlertStrategyRequestFilterRuleFilterItems setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public PutAlertStrategyRequestFilterRuleFilterItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutAlertStrategyRequestFilterRuleFilterItems setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutAlertStrategyRequestFilterRuleFilterItems setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class PutAlertStrategyRequestFilterRuleWhiteList extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Product")
        public String product;

        public static PutAlertStrategyRequestFilterRuleWhiteList build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestFilterRuleWhiteList self = new PutAlertStrategyRequestFilterRuleWhiteList();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestFilterRuleWhiteList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public PutAlertStrategyRequestFilterRuleWhiteList setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public PutAlertStrategyRequestFilterRuleWhiteList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutAlertStrategyRequestFilterRuleWhiteList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutAlertStrategyRequestFilterRuleWhiteList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class PutAlertStrategyRequestFilterRule extends TeaModel {
        @NameInMap("BlackList")
        public java.util.List<PutAlertStrategyRequestFilterRuleBlackList> blackList;

        @NameInMap("FilterItems")
        public java.util.List<PutAlertStrategyRequestFilterRuleFilterItems> filterItems;

        @NameInMap("WhiteList")
        public java.util.List<PutAlertStrategyRequestFilterRuleWhiteList> whiteList;

        public static PutAlertStrategyRequestFilterRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestFilterRule self = new PutAlertStrategyRequestFilterRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestFilterRule setBlackList(java.util.List<PutAlertStrategyRequestFilterRuleBlackList> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestFilterRuleBlackList> getBlackList() {
            return this.blackList;
        }

        public PutAlertStrategyRequestFilterRule setFilterItems(java.util.List<PutAlertStrategyRequestFilterRuleFilterItems> filterItems) {
            this.filterItems = filterItems;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestFilterRuleFilterItems> getFilterItems() {
            return this.filterItems;
        }

        public PutAlertStrategyRequestFilterRule setWhiteList(java.util.List<PutAlertStrategyRequestFilterRuleWhiteList> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestFilterRuleWhiteList> getWhiteList() {
            return this.whiteList;
        }

    }

    public static class PutAlertStrategyRequestGroupingRuleGroupingRuleItems extends TeaModel {
        @NameInMap("AiGroupingServiceId")
        public String aiGroupingServiceId;

        @NameInMap("GroupingKeys")
        public java.util.List<String> groupingKeys;

        @NameInMap("GroupingType")
        public String groupingType;

        public static PutAlertStrategyRequestGroupingRuleGroupingRuleItems build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestGroupingRuleGroupingRuleItems self = new PutAlertStrategyRequestGroupingRuleGroupingRuleItems();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestGroupingRuleGroupingRuleItems setAiGroupingServiceId(String aiGroupingServiceId) {
            this.aiGroupingServiceId = aiGroupingServiceId;
            return this;
        }
        public String getAiGroupingServiceId() {
            return this.aiGroupingServiceId;
        }

        public PutAlertStrategyRequestGroupingRuleGroupingRuleItems setGroupingKeys(java.util.List<String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }
        public java.util.List<String> getGroupingKeys() {
            return this.groupingKeys;
        }

        public PutAlertStrategyRequestGroupingRuleGroupingRuleItems setGroupingType(String groupingType) {
            this.groupingType = groupingType;
            return this;
        }
        public String getGroupingType() {
            return this.groupingType;
        }

    }

    public static class PutAlertStrategyRequestGroupingRule extends TeaModel {
        @NameInMap("GroupingRuleItems")
        public java.util.List<PutAlertStrategyRequestGroupingRuleGroupingRuleItems> groupingRuleItems;

        @NameInMap("Period")
        public String period;

        @NameInMap("SilenceTime")
        public String silenceTime;

        @NameInMap("Times")
        public String times;

        public static PutAlertStrategyRequestGroupingRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestGroupingRule self = new PutAlertStrategyRequestGroupingRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestGroupingRule setGroupingRuleItems(java.util.List<PutAlertStrategyRequestGroupingRuleGroupingRuleItems> groupingRuleItems) {
            this.groupingRuleItems = groupingRuleItems;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestGroupingRuleGroupingRuleItems> getGroupingRuleItems() {
            return this.groupingRuleItems;
        }

        public PutAlertStrategyRequestGroupingRule setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public PutAlertStrategyRequestGroupingRule setSilenceTime(String silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public String getSilenceTime() {
            return this.silenceTime;
        }

        public PutAlertStrategyRequestGroupingRule setTimes(String times) {
            this.times = times;
            return this;
        }
        public String getTimes() {
            return this.times;
        }

    }

    public static class PutAlertStrategyRequestPushingRulePushingItemsArnTarget extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        public static PutAlertStrategyRequestPushingRulePushingItemsArnTarget build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestPushingRulePushingItemsArnTarget self = new PutAlertStrategyRequestPushingRulePushingItemsArnTarget();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestPushingRulePushingItemsArnTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

    public static class PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget extends TeaModel {
        @NameInMap("Headers")
        public String headers;

        @NameInMap("Method")
        public String method;

        @NameInMap("ResponseToken")
        public String responseToken;

        @NameInMap("Url")
        public String url;

        public static PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget self = new PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget setResponseToken(String responseToken) {
            this.responseToken = responseToken;
            return this;
        }
        public String getResponseToken() {
            return this.responseToken;
        }

        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class PutAlertStrategyRequestPushingRulePushingItems extends TeaModel {
        @NameInMap("ArnTarget")
        public PutAlertStrategyRequestPushingRulePushingItemsArnTarget arnTarget;

        @NameInMap("Range")
        public String range;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("WebhookTarget")
        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget webhookTarget;

        public static PutAlertStrategyRequestPushingRulePushingItems build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestPushingRulePushingItems self = new PutAlertStrategyRequestPushingRulePushingItems();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestPushingRulePushingItems setArnTarget(PutAlertStrategyRequestPushingRulePushingItemsArnTarget arnTarget) {
            this.arnTarget = arnTarget;
            return this;
        }
        public PutAlertStrategyRequestPushingRulePushingItemsArnTarget getArnTarget() {
            return this.arnTarget;
        }

        public PutAlertStrategyRequestPushingRulePushingItems setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public PutAlertStrategyRequestPushingRulePushingItems setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public PutAlertStrategyRequestPushingRulePushingItems setWebhookTarget(PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget webhookTarget) {
            this.webhookTarget = webhookTarget;
            return this;
        }
        public PutAlertStrategyRequestPushingRulePushingItemsWebhookTarget getWebhookTarget() {
            return this.webhookTarget;
        }

    }

    public static class PutAlertStrategyRequestPushingRule extends TeaModel {
        @NameInMap("PushingItems")
        public java.util.List<PutAlertStrategyRequestPushingRulePushingItems> pushingItems;

        public static PutAlertStrategyRequestPushingRule build(java.util.Map<String, ?> map) throws Exception {
            PutAlertStrategyRequestPushingRule self = new PutAlertStrategyRequestPushingRule();
            return TeaModel.build(map, self);
        }

        public PutAlertStrategyRequestPushingRule setPushingItems(java.util.List<PutAlertStrategyRequestPushingRulePushingItems> pushingItems) {
            this.pushingItems = pushingItems;
            return this;
        }
        public java.util.List<PutAlertStrategyRequestPushingRulePushingItems> getPushingItems() {
            return this.pushingItems;
        }

    }

}
