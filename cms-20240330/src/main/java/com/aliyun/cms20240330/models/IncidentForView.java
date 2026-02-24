// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentForView extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("escalations")
    public java.util.List<IncidentEscalationPolicyForView> escalations;

    /**
     * <strong>example:</strong>
     * <p>&quot;group-123456&quot;</p>
     */
    @NameInMap("groupUuid")
    public String groupUuid;

    @NameInMap("groupingKeys")
    public java.util.Map<String, String> groupingKeys;

    /**
     * <strong>example:</strong>
     * <p>&quot;incident-abc123&quot;</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <strong>example:</strong>
     * <p>&quot;notify-strategy-789&quot;</p>
     */
    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    @NameInMap("operator")
    public ContactForIncidentView operator;

    @NameInMap("owners")
    public java.util.List<ContactForIncidentView> owners;

    @NameInMap("participants")
    public java.util.List<ContactForIncidentView> participants;

    @NameInMap("plan")
    public IncidentResponsePlanForView plan;

    @NameInMap("relatedResources")
    public java.util.List<EventResourceForIncidentView> relatedResources;

    /**
     * <strong>example:</strong>
     * <p>&quot;Network&quot;</p>
     */
    @NameInMap("rootCauseCategory")
    public String rootCauseCategory;

    /**
     * <strong>example:</strong>
     * <p>&quot;Critical&quot;</p>
     */
    @NameInMap("severity")
    public String severity;

    @NameInMap("solution")
    public String solution;

    /**
     * <strong>example:</strong>
     * <p>&quot;Open&quot;</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>&quot;P1-Alert-Notification&quot;</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    /**
     * <strong>example:</strong>
     * <p>&quot;subscription-abc&quot;</p>
     */
    @NameInMap("subscriptionUuid")
    public String subscriptionUuid;

    /**
     * <strong>example:</strong>
     * <p>1743876000000</p>
     */
    @NameInMap("time")
    public Long time;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>&quot;user-abc123&quot;</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
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
