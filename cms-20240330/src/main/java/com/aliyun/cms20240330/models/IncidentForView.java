// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentForView extends TeaModel {
    /**
     * <p>The details of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;description&quot;:&quot;ECS实例CPU过高&quot;,&quot;impact&quot;:&quot;支付服务延迟&quot;}&quot;</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The list of escalation policies.</p>
     */
    @NameInMap("escalations")
    public java.util.List<IncidentEscalationPolicyForView> escalations;

    /**
     * <p>The group identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;group-123456&quot;</p>
     */
    @NameInMap("groupUuid")
    public String groupUuid;

    /**
     * <p>The key-value pairs for grouping.</p>
     */
    @NameInMap("groupingKeys")
    public java.util.Map<String, String> groupingKeys;

    /**
     * <p>The unique identifier of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;incident-abc123&quot;</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>The name of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;contactId&quot;: &quot;contact-123&quot;, &quot;name&quot;: &quot;张三&quot; }</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <p>The UUID of the associated notification policy, which is used to trigger notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;notify-strategy-789&quot;</p>
     */
    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    /**
     * <p>The information about the operator.</p>
     */
    @NameInMap("operator")
    public ContactForIncidentView operator;

    /**
     * <p>The list of owners.</p>
     */
    @NameInMap("owners")
    public java.util.List<ContactForIncidentView> owners;

    /**
     * <p>The list of participants.</p>
     */
    @NameInMap("participants")
    public java.util.List<ContactForIncidentView> participants;

    /**
     * <p>The response plan.</p>
     */
    @NameInMap("plan")
    public IncidentResponsePlanForView plan;

    /**
     * <p>The list of associated resources.</p>
     */
    @NameInMap("relatedResources")
    public java.util.List<EventResourceForIncidentView> relatedResources;

    /**
     * <p>The root cause category.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Network&quot;</p>
     */
    @NameInMap("rootCauseCategory")
    public String rootCauseCategory;

    /**
     * <p>The severity level of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Critical&quot;</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The description of the solution.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;重启ECS实例后恢复正常&quot;</p>
     */
    @NameInMap("solution")
    public String solution;

    /**
     * <p>The current state of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Open&quot;</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The name of the subscription policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;P1-Alert-Notification&quot;</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    /**
     * <p>The UUID of the subscription policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;subscription-abc&quot;</p>
     */
    @NameInMap("subscriptionUuid")
    public String subscriptionUuid;

    /**
     * <p>The timestamp when the incident was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1743876000000</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>The title of the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;支付服务不可用&quot;</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The ID of the user who created the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;user-abc123&quot;</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ws-xyz789&quot;</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static IncidentForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentForView self = new IncidentForView();
        return TeaModel.build(map, self);
    }

    public IncidentForView setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public IncidentForView setEscalations(java.util.List<IncidentEscalationPolicyForView> escalations) {
        this.escalations = escalations;
        return this;
    }
    public java.util.List<IncidentEscalationPolicyForView> getEscalations() {
        return this.escalations;
    }

    public IncidentForView setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public IncidentForView setGroupingKeys(java.util.Map<String, String> groupingKeys) {
        this.groupingKeys = groupingKeys;
        return this;
    }
    public java.util.Map<String, String> getGroupingKeys() {
        return this.groupingKeys;
    }

    public IncidentForView setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentForView setNotifyStrategyName(String notifyStrategyName) {
        this.notifyStrategyName = notifyStrategyName;
        return this;
    }
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    public IncidentForView setNotifyStrategyUuid(String notifyStrategyUuid) {
        this.notifyStrategyUuid = notifyStrategyUuid;
        return this;
    }
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    public IncidentForView setOperator(ContactForIncidentView operator) {
        this.operator = operator;
        return this;
    }
    public ContactForIncidentView getOperator() {
        return this.operator;
    }

    public IncidentForView setOwners(java.util.List<ContactForIncidentView> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<ContactForIncidentView> getOwners() {
        return this.owners;
    }

    public IncidentForView setParticipants(java.util.List<ContactForIncidentView> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<ContactForIncidentView> getParticipants() {
        return this.participants;
    }

    public IncidentForView setPlan(IncidentResponsePlanForView plan) {
        this.plan = plan;
        return this;
    }
    public IncidentResponsePlanForView getPlan() {
        return this.plan;
    }

    public IncidentForView setRelatedResources(java.util.List<EventResourceForIncidentView> relatedResources) {
        this.relatedResources = relatedResources;
        return this;
    }
    public java.util.List<EventResourceForIncidentView> getRelatedResources() {
        return this.relatedResources;
    }

    public IncidentForView setRootCauseCategory(String rootCauseCategory) {
        this.rootCauseCategory = rootCauseCategory;
        return this;
    }
    public String getRootCauseCategory() {
        return this.rootCauseCategory;
    }

    public IncidentForView setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public IncidentForView setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public IncidentForView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public IncidentForView setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public IncidentForView setSubscriptionUuid(String subscriptionUuid) {
        this.subscriptionUuid = subscriptionUuid;
        return this;
    }
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
    }

    public IncidentForView setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentForView setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IncidentForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IncidentForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
