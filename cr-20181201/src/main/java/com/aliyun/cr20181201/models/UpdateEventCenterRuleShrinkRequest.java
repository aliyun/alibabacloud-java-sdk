// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleShrinkRequest extends TeaModel {
    @NameInMap("EventChannel")
    public String eventChannel;

    @NameInMap("EventConfig")
    public String eventConfig;

    @NameInMap("EventScope")
    public String eventScope;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Namespaces")
    public String namespacesShrink;

    @NameInMap("RepoNames")
    public String repoNamesShrink;

    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateEventCenterRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventCenterRuleShrinkRequest self = new UpdateEventCenterRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventCenterRuleShrinkRequest setEventChannel(String eventChannel) {
        this.eventChannel = eventChannel;
        return this;
    }
    public String getEventChannel() {
        return this.eventChannel;
    }

    public UpdateEventCenterRuleShrinkRequest setEventConfig(String eventConfig) {
        this.eventConfig = eventConfig;
        return this;
    }
    public String getEventConfig() {
        return this.eventConfig;
    }

    public UpdateEventCenterRuleShrinkRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public UpdateEventCenterRuleShrinkRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public UpdateEventCenterRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEventCenterRuleShrinkRequest setNamespacesShrink(String namespacesShrink) {
        this.namespacesShrink = namespacesShrink;
        return this;
    }
    public String getNamespacesShrink() {
        return this.namespacesShrink;
    }

    public UpdateEventCenterRuleShrinkRequest setRepoNamesShrink(String repoNamesShrink) {
        this.repoNamesShrink = repoNamesShrink;
        return this;
    }
    public String getRepoNamesShrink() {
        return this.repoNamesShrink;
    }

    public UpdateEventCenterRuleShrinkRequest setRepoTagFilterPattern(String repoTagFilterPattern) {
        this.repoTagFilterPattern = repoTagFilterPattern;
        return this;
    }
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    public UpdateEventCenterRuleShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateEventCenterRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
