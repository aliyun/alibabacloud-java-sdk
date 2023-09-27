// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleShrinkRequest extends TeaModel {
    /**
     * <p>The event notification channel.</p>
     */
    @NameInMap("EventChannel")
    public String eventChannel;

    /**
     * <p>The event configuration.</p>
     */
    @NameInMap("EventConfig")
    public String eventConfig;

    /**
     * <p>The event scope. Valid values:</p>
     * <br>
     * <p>*   `INSTANCE`</p>
     * <p>*   `NAMESPACE`</p>
     * <p>*   `REPO`</p>
     * <br>
     * <p>Default value: `INSTANCE`</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The type of the event. Valid values:</p>
     * <br>
     * <p>*   `cr:Artifact:DeliveryChainCompleted`: The delivery chain is processed.</p>
     * <p>*   `cr:Artifact:SynchronizationCompleted`: The image is replicated.</p>
     * <p>*   `cr:Artifact:BuildCompleted`: The image is built.</p>
     * <p>*   `cr:Artifact:ScanCompleted`: The image is scanned.</p>
     * <p>*   `cr:Artifact:SigningCompleted`: The image is signed.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespaces to which the event notification rule applies.</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <p>The names of the repositories to which the event notification rule applies.</p>
     */
    @NameInMap("RepoNames")
    public String repoNamesShrink;

    /**
     * <p>The regular expression for image tags.</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>The ID of the event notification rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the event notification rule.</p>
     */
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
