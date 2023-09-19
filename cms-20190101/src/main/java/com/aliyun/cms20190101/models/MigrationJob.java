// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class MigrationJob extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("Plan")
    public MigrationJobPlan plan;

    @NameInMap("RuleNames")
    public java.util.List<String> ruleNames;

    @NameInMap("Source")
    public java.util.List<MigrationJobSource> source;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Uuid")
    public String uuid;

    public static MigrationJob build(java.util.Map<String, ?> map) throws Exception {
        MigrationJob self = new MigrationJob();
        return TeaModel.build(map, self);
    }

    public MigrationJob setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MigrationJob setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public MigrationJob setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public MigrationJob setPlan(MigrationJobPlan plan) {
        this.plan = plan;
        return this;
    }
    public MigrationJobPlan getPlan() {
        return this.plan;
    }

    public MigrationJob setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

    public MigrationJob setSource(java.util.List<MigrationJobSource> source) {
        this.source = source;
        return this;
    }
    public java.util.List<MigrationJobSource> getSource() {
        return this.source;
    }

    public MigrationJob setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public MigrationJob setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class MigrationJobPlanContactsChannels extends TeaModel {
        @NameInMap("Level")
        public Long level;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static MigrationJobPlanContactsChannels build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanContactsChannels self = new MigrationJobPlanContactsChannels();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanContactsChannels setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public MigrationJobPlanContactsChannels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MigrationJobPlanContactsChannels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class MigrationJobPlanContacts extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<MigrationJobPlanContactsChannels> channels;

        @NameInMap("Name")
        public String name;

        public static MigrationJobPlanContacts build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanContacts self = new MigrationJobPlanContacts();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanContacts setChannels(java.util.List<MigrationJobPlanContactsChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<MigrationJobPlanContactsChannels> getChannels() {
            return this.channels;
        }

        public MigrationJobPlanContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class MigrationJobPlanEscalationsEscalationsLevelGroups extends TeaModel {
        @NameInMap("Critical")
        public java.util.List<String> critical;

        @NameInMap("Info")
        public java.util.List<String> info;

        @NameInMap("Resolved")
        public java.util.List<String> resolved;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static MigrationJobPlanEscalationsEscalationsLevelGroups build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanEscalationsEscalationsLevelGroups self = new MigrationJobPlanEscalationsEscalationsLevelGroups();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanEscalationsEscalationsLevelGroups setCritical(java.util.List<String> critical) {
            this.critical = critical;
            return this;
        }
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        public MigrationJobPlanEscalationsEscalationsLevelGroups setInfo(java.util.List<String> info) {
            this.info = info;
            return this;
        }
        public java.util.List<String> getInfo() {
            return this.info;
        }

        public MigrationJobPlanEscalationsEscalationsLevelGroups setResolved(java.util.List<String> resolved) {
            this.resolved = resolved;
            return this;
        }
        public java.util.List<String> getResolved() {
            return this.resolved;
        }

        public MigrationJobPlanEscalationsEscalationsLevelGroups setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class MigrationJobPlanEscalationsEscalations extends TeaModel {
        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("LevelGroups")
        public MigrationJobPlanEscalationsEscalationsLevelGroups levelGroups;

        public static MigrationJobPlanEscalationsEscalations build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanEscalationsEscalations self = new MigrationJobPlanEscalationsEscalations();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanEscalationsEscalations setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public MigrationJobPlanEscalationsEscalations setLevelGroups(MigrationJobPlanEscalationsEscalationsLevelGroups levelGroups) {
            this.levelGroups = levelGroups;
            return this;
        }
        public MigrationJobPlanEscalationsEscalationsLevelGroups getLevelGroups() {
            return this.levelGroups;
        }

    }

    public static class MigrationJobPlanEscalations extends TeaModel {
        @NameInMap("Escalations")
        public java.util.List<MigrationJobPlanEscalationsEscalations> escalations;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uuid")
        public String uuid;

        public static MigrationJobPlanEscalations build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanEscalations self = new MigrationJobPlanEscalations();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanEscalations setEscalations(java.util.List<MigrationJobPlanEscalationsEscalations> escalations) {
            this.escalations = escalations;
            return this;
        }
        public java.util.List<MigrationJobPlanEscalationsEscalations> getEscalations() {
            return this.escalations;
        }

        public MigrationJobPlanEscalations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationJobPlanEscalations setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class MigrationJobPlanGroups extends TeaModel {
        @NameInMap("Contacts")
        public java.util.List<String> contacts;

        @NameInMap("Name")
        public String name;

        public static MigrationJobPlanGroups build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanGroups self = new MigrationJobPlanGroups();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanGroups setContacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        public MigrationJobPlanGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class MigrationJobPlanStrategiesEscalationSetting extends TeaModel {
        @NameInMap("escalationUuid")
        public String escalationUuid;

        public static MigrationJobPlanStrategiesEscalationSetting build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanStrategiesEscalationSetting self = new MigrationJobPlanStrategiesEscalationSetting();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanStrategiesEscalationSetting setEscalationUuid(String escalationUuid) {
            this.escalationUuid = escalationUuid;
            return this;
        }
        public String getEscalationUuid() {
            return this.escalationUuid;
        }

    }

    public static class MigrationJobPlanStrategiesPushingSetting extends TeaModel {
        @NameInMap("TargetUuids")
        public java.util.List<String> targetUuids;

        public static MigrationJobPlanStrategiesPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanStrategiesPushingSetting self = new MigrationJobPlanStrategiesPushingSetting();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanStrategiesPushingSetting setTargetUuids(java.util.List<String> targetUuids) {
            this.targetUuids = targetUuids;
            return this;
        }
        public java.util.List<String> getTargetUuids() {
            return this.targetUuids;
        }

    }

    public static class MigrationJobPlanStrategies extends TeaModel {
        @NameInMap("EscalationSetting")
        public MigrationJobPlanStrategiesEscalationSetting escalationSetting;

        @NameInMap("Name")
        public String name;

        @NameInMap("PushingSetting")
        public MigrationJobPlanStrategiesPushingSetting pushingSetting;

        public static MigrationJobPlanStrategies build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanStrategies self = new MigrationJobPlanStrategies();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanStrategies setEscalationSetting(MigrationJobPlanStrategiesEscalationSetting escalationSetting) {
            this.escalationSetting = escalationSetting;
            return this;
        }
        public MigrationJobPlanStrategiesEscalationSetting getEscalationSetting() {
            return this.escalationSetting;
        }

        public MigrationJobPlanStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationJobPlanStrategies setPushingSetting(MigrationJobPlanStrategiesPushingSetting pushingSetting) {
            this.pushingSetting = pushingSetting;
            return this;
        }
        public MigrationJobPlanStrategiesPushingSetting getPushingSetting() {
            return this.pushingSetting;
        }

    }

    public static class MigrationJobPlanSubscriptionsConditions extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Op")
        public String op;

        @NameInMap("Value")
        public String value;

        public static MigrationJobPlanSubscriptionsConditions build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanSubscriptionsConditions self = new MigrationJobPlanSubscriptionsConditions();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanSubscriptionsConditions setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public MigrationJobPlanSubscriptionsConditions setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public MigrationJobPlanSubscriptionsConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class MigrationJobPlanSubscriptions extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<MigrationJobPlanSubscriptionsConditions> conditions;

        @NameInMap("Name")
        public String name;

        @NameInMap("StrategyUuid")
        public String strategyUuid;

        public static MigrationJobPlanSubscriptions build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanSubscriptions self = new MigrationJobPlanSubscriptions();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanSubscriptions setConditions(java.util.List<MigrationJobPlanSubscriptionsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<MigrationJobPlanSubscriptionsConditions> getConditions() {
            return this.conditions;
        }

        public MigrationJobPlanSubscriptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationJobPlanSubscriptions setStrategyUuid(String strategyUuid) {
            this.strategyUuid = strategyUuid;
            return this;
        }
        public String getStrategyUuid() {
            return this.strategyUuid;
        }

    }

    public static class MigrationJobPlanTargetsHttpRequestTarget extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Method")
        public String method;

        @NameInMap("Url")
        public String url;

        public static MigrationJobPlanTargetsHttpRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanTargetsHttpRequestTarget self = new MigrationJobPlanTargetsHttpRequestTarget();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanTargetsHttpRequestTarget setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public MigrationJobPlanTargetsHttpRequestTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public MigrationJobPlanTargetsHttpRequestTarget setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MigrationJobPlanTargets extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("HttpRequestTarget")
        public MigrationJobPlanTargetsHttpRequestTarget httpRequestTarget;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        public static MigrationJobPlanTargets build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlanTargets self = new MigrationJobPlanTargets();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlanTargets setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public MigrationJobPlanTargets setHttpRequestTarget(MigrationJobPlanTargetsHttpRequestTarget httpRequestTarget) {
            this.httpRequestTarget = httpRequestTarget;
            return this;
        }
        public MigrationJobPlanTargetsHttpRequestTarget getHttpRequestTarget() {
            return this.httpRequestTarget;
        }

        public MigrationJobPlanTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationJobPlanTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MigrationJobPlanTargets setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class MigrationJobPlan extends TeaModel {
        @NameInMap("Contacts")
        public java.util.List<MigrationJobPlanContacts> contacts;

        @NameInMap("Escalations")
        public java.util.List<MigrationJobPlanEscalations> escalations;

        @NameInMap("Groups")
        public java.util.List<MigrationJobPlanGroups> groups;

        @NameInMap("RuleNames")
        public java.util.List<String> ruleNames;

        @NameInMap("Strategies")
        public java.util.List<MigrationJobPlanStrategies> strategies;

        @NameInMap("Subscriptions")
        public java.util.List<MigrationJobPlanSubscriptions> subscriptions;

        @NameInMap("Targets")
        public java.util.List<MigrationJobPlanTargets> targets;

        public static MigrationJobPlan build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobPlan self = new MigrationJobPlan();
            return TeaModel.build(map, self);
        }

        public MigrationJobPlan setContacts(java.util.List<MigrationJobPlanContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<MigrationJobPlanContacts> getContacts() {
            return this.contacts;
        }

        public MigrationJobPlan setEscalations(java.util.List<MigrationJobPlanEscalations> escalations) {
            this.escalations = escalations;
            return this;
        }
        public java.util.List<MigrationJobPlanEscalations> getEscalations() {
            return this.escalations;
        }

        public MigrationJobPlan setGroups(java.util.List<MigrationJobPlanGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<MigrationJobPlanGroups> getGroups() {
            return this.groups;
        }

        public MigrationJobPlan setRuleNames(java.util.List<String> ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }
        public java.util.List<String> getRuleNames() {
            return this.ruleNames;
        }

        public MigrationJobPlan setStrategies(java.util.List<MigrationJobPlanStrategies> strategies) {
            this.strategies = strategies;
            return this;
        }
        public java.util.List<MigrationJobPlanStrategies> getStrategies() {
            return this.strategies;
        }

        public MigrationJobPlan setSubscriptions(java.util.List<MigrationJobPlanSubscriptions> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public java.util.List<MigrationJobPlanSubscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        public MigrationJobPlan setTargets(java.util.List<MigrationJobPlanTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<MigrationJobPlanTargets> getTargets() {
            return this.targets;
        }

    }

    public static class MigrationJobSourceRuleKeywordFilter extends TeaModel {
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        @NameInMap("Relation")
        public String relation;

        public static MigrationJobSourceRuleKeywordFilter build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceRuleKeywordFilter self = new MigrationJobSourceRuleKeywordFilter();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceRuleKeywordFilter setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public MigrationJobSourceRuleKeywordFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class MigrationJobSourceRulePrimaryFilters extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("Value")
        public String value;

        public static MigrationJobSourceRulePrimaryFilters build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceRulePrimaryFilters self = new MigrationJobSourceRulePrimaryFilters();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceRulePrimaryFilters setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public MigrationJobSourceRulePrimaryFilters setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public MigrationJobSourceRulePrimaryFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class MigrationJobSourceRule extends TeaModel {
        @NameInMap("KeywordFilter")
        public MigrationJobSourceRuleKeywordFilter keywordFilter;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrimaryFilters")
        public java.util.List<MigrationJobSourceRulePrimaryFilters> primaryFilters;

        public static MigrationJobSourceRule build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceRule self = new MigrationJobSourceRule();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceRule setKeywordFilter(MigrationJobSourceRuleKeywordFilter keywordFilter) {
            this.keywordFilter = keywordFilter;
            return this;
        }
        public MigrationJobSourceRuleKeywordFilter getKeywordFilter() {
            return this.keywordFilter;
        }

        public MigrationJobSourceRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationJobSourceRule setPrimaryFilters(java.util.List<MigrationJobSourceRulePrimaryFilters> primaryFilters) {
            this.primaryFilters = primaryFilters;
            return this;
        }
        public java.util.List<MigrationJobSourceRulePrimaryFilters> getPrimaryFilters() {
            return this.primaryFilters;
        }

    }

    public static class MigrationJobSourceTargetsContent extends TeaModel {
        @NameInMap("Group")
        public String group;

        @NameInMap("Level")
        public String level;

        @NameInMap("Method")
        public String method;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourcePath")
        public String resourcePath;

        @NameInMap("Url")
        public String url;

        public static MigrationJobSourceTargetsContent build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceTargetsContent self = new MigrationJobSourceTargetsContent();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceTargetsContent setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public MigrationJobSourceTargetsContent setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public MigrationJobSourceTargetsContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public MigrationJobSourceTargetsContent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public MigrationJobSourceTargetsContent setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }
        public String getResourcePath() {
            return this.resourcePath;
        }

        public MigrationJobSourceTargetsContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MigrationJobSourceTargets extends TeaModel {
        @NameInMap("Content")
        public MigrationJobSourceTargetsContent content;

        @NameInMap("Type")
        public String type;

        public static MigrationJobSourceTargets build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSourceTargets self = new MigrationJobSourceTargets();
            return TeaModel.build(map, self);
        }

        public MigrationJobSourceTargets setContent(MigrationJobSourceTargetsContent content) {
            this.content = content;
            return this;
        }
        public MigrationJobSourceTargetsContent getContent() {
            return this.content;
        }

        public MigrationJobSourceTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MigrationJobSource extends TeaModel {
        @NameInMap("Rule")
        public MigrationJobSourceRule rule;

        @NameInMap("Targets")
        public java.util.List<MigrationJobSourceTargets> targets;

        public static MigrationJobSource build(java.util.Map<String, ?> map) throws Exception {
            MigrationJobSource self = new MigrationJobSource();
            return TeaModel.build(map, self);
        }

        public MigrationJobSource setRule(MigrationJobSourceRule rule) {
            this.rule = rule;
            return this;
        }
        public MigrationJobSourceRule getRule() {
            return this.rule;
        }

        public MigrationJobSource setTargets(java.util.List<MigrationJobSourceTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<MigrationJobSourceTargets> getTargets() {
            return this.targets;
        }

    }

}
