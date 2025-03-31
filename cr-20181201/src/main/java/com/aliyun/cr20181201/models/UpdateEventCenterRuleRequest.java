// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleRequest extends TeaModel {
    /**
     * <p>The event notification channel.</p>
     * 
     * <strong>example:</strong>
     * <p>EVENT_BRIDGE</p>
     */
    @NameInMap("EventChannel")
    public String eventChannel;

    /**
     * <p>The event configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;notifyMethod&quot;:&quot;http&quot;,
     *         &quot;notifyConfig&quot;:{
     *             &quot;Url&quot;:&quot;<a href="http://www.aliyundoc.com">http://www.aliyundoc.com</a>&quot;,
     *             &quot;id&quot;:&quot;MaAV3HgTkO5Fh8l1V********&quot;,
     *         },
     *         &quot;notifyFilter&quot;:{}
     *     }</p>
     */
    @NameInMap("EventConfig")
    public String eventConfig;

    /**
     * <p>The event scope. Valid values:</p>
     * <ul>
     * <li><code>INSTANCE</code></li>
     * <li><code>NAMESPACE</code></li>
     * <li><code>REPO</code></li>
     * </ul>
     * <p>Default value: <code>INSTANCE</code></p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The type of the event. Valid values:</p>
     * <ul>
     * <li><code>cr:Artifact:DeliveryChainCompleted</code>: The delivery chain is processed.</li>
     * <li><code>cr:Artifact:SynchronizationCompleted</code>: The image is replicated.</li>
     * <li><code>cr:Artifact:BuildCompleted</code>: The image is built.</li>
     * <li><code>cr:Artifact:ScanCompleted</code>: The image is scanned.</li>
     * <li><code>cr:Artifact:SigningCompleted</code>: The image is signed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cr:Artifact:DeliveryChainCompleted</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespaces to which the event notification rule applies.</p>
     * 
     * <strong>example:</strong>
     * <p>ns</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The names of the repositories to which the event notification rule applies.</p>
     * 
     * <strong>example:</strong>
     * <p>reponame</p>
     */
    @NameInMap("RepoNames")
    public java.util.List<String> repoNames;

    /**
     * <p>The regular expression for image tags.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>The ID of the event notification rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crecr-n6pbhgjxt*****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the event notification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>chain-demo</p>
     */
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
