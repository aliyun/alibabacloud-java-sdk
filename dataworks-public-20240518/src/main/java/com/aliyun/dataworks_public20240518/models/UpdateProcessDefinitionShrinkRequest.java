// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionShrinkRequest extends TeaModel {
    /**
     * <p>A list of approval nodes. This parameter does not apply to system policies.</p>
     */
    @NameInMap("ApprovalNodes")
    public String approvalNodesShrink;

    /**
     * <p>An idempotent parameter. It ensures that retried requests do not result in duplicate operations.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>lwt_ide_simple 项目 MaxCompute 表审批策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the process definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177554881536128</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute 表审批</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification service configurations.</p>
     */
    @NameInMap("NotificationServices")
    public String notificationServicesShrink;

    /**
     * <p>A list of rule conditions. This parameter does not apply to system policies.</p>
     */
    @NameInMap("RuleConditions")
    public String ruleConditionsShrink;

    public static UpdateProcessDefinitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionShrinkRequest self = new UpdateProcessDefinitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionShrinkRequest setApprovalNodesShrink(String approvalNodesShrink) {
        this.approvalNodesShrink = approvalNodesShrink;
        return this;
    }
    public String getApprovalNodesShrink() {
        return this.approvalNodesShrink;
    }

    public UpdateProcessDefinitionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProcessDefinitionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProcessDefinitionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProcessDefinitionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProcessDefinitionShrinkRequest setNotificationServicesShrink(String notificationServicesShrink) {
        this.notificationServicesShrink = notificationServicesShrink;
        return this;
    }
    public String getNotificationServicesShrink() {
        return this.notificationServicesShrink;
    }

    public UpdateProcessDefinitionShrinkRequest setRuleConditionsShrink(String ruleConditionsShrink) {
        this.ruleConditionsShrink = ruleConditionsShrink;
        return this;
    }
    public String getRuleConditionsShrink() {
        return this.ruleConditionsShrink;
    }

}
