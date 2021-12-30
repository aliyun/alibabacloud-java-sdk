// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleRequest extends TeaModel {
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
    public java.util.List<String> namespaces;

    @NameInMap("RepoNames")
    public java.util.List<String> repoNames;

    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    public static UpdateEventCenterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventCenterRuleRequest self = new UpdateEventCenterRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventCenterRuleRequest setEventChannel(String eventChannel) {
        this.eventChannel = eventChannel;
        return this;
    }
    public String getEventChannel() {
        return this.eventChannel;
    }

    public UpdateEventCenterRuleRequest setEventConfig(String eventConfig) {
        this.eventConfig = eventConfig;
        return this;
    }
    public String getEventConfig() {
        return this.eventConfig;
    }

    public UpdateEventCenterRuleRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public UpdateEventCenterRuleRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public UpdateEventCenterRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEventCenterRuleRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public UpdateEventCenterRuleRequest setRepoNames(java.util.List<String> repoNames) {
        this.repoNames = repoNames;
        return this;
    }
    public java.util.List<String> getRepoNames() {
        return this.repoNames;
    }

    public UpdateEventCenterRuleRequest setRepoTagFilterPattern(String repoTagFilterPattern) {
        this.repoTagFilterPattern = repoTagFilterPattern;
        return this;
    }
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    public UpdateEventCenterRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateEventCenterRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
